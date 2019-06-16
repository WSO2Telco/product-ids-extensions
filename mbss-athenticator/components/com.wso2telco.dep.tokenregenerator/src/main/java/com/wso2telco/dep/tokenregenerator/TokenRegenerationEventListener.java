/*******************************************************************************
 * Copyright (c) 2015-2018, WSO2.Telco Inc. (http://www.wso2telco.com)
 *
 * All Rights Reserved. WSO2.Telco Inc. licences this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.wso2telco.dep.tokenregenerator;

import org.apache.log4j.Logger;
import org.wso2.carbon.apimgt.impl.APIConstants;
import org.wso2.carbon.context.PrivilegedCarbonContext;
import org.wso2.carbon.identity.oauth.IdentityOAuthAdminException;
import org.wso2.carbon.identity.oauth.OAuthAdminService;
import org.wso2.carbon.identity.oauth.dto.OAuthConsumerAppDTO;
import org.wso2.carbon.identity.oauth2.OAuth2Service;
import org.wso2.carbon.identity.oauth2.bean.OAuthClientAuthnContext;
import org.wso2.carbon.identity.oauth2.dto.OAuth2AccessTokenReqDTO;
import org.wso2.carbon.identity.oauth2.dto.OAuth2AccessTokenRespDTO;
import org.wso2.carbon.identity.oauth2.model.RequestParameter;
import org.wso2.carbon.user.core.UserStoreException;
import org.wso2.carbon.user.core.UserStoreManager;
import org.wso2.carbon.user.core.common.AbstractUserOperationEventListener;

public class TokenRegenerationEventListener extends AbstractUserOperationEventListener {

    private Logger log = Logger.getLogger(TokenRegenerationEventListener.class);
    private static final String VALIDITY_PERIOD_KEY = "validity_period";
    private static final String VALIDITY_PERIOD_VALUE = "-2";
    private static final String TENANT_DOMAIN = "carbon.super";
    private static final String GRANT_TYPE = "client_credentials";

    @Override
    public int getExecutionOrderId() {
        //This listener should execute before the IdentityMgtEventListener
        //Hence the number should be < 1357 (Execution order ID of IdentityMgtEventListener)
        return 1356;
    }

    /**
     * Refresh token on password reset
     * @param userName username
     * @param credential password
     * @param userStoreManager userStoreManager
     * @return true
     * @throws UserStoreException
     */
    @Override
    public boolean doPostUpdateCredential(String userName, Object credential, UserStoreManager userStoreManager) throws UserStoreException {

        if (log.isDebugEnabled()) {
            log.debug("Executing TokenRegenerationEventListener");
            log.debug("Username : "+ userName);
        }

        OAuthAdminService oAuthAdminService = new OAuthAdminService();
        String[] applicationScope;
        String scope =  DataHolder.getInstance().getApiManagerConfigurationService().getAPIManagerConfiguration().getFirstProperty(APIConstants.
                APPLICATION_TOKEN_SCOPE);

        applicationScope = new String[] {scope};

        String threadLocalUsername = PrivilegedCarbonContext.getThreadLocalCarbonContext().getUsername();
        String threadTenantDomain = PrivilegedCarbonContext.getThreadLocalCarbonContext().getTenantDomain();
        int tenantId = PrivilegedCarbonContext.getThreadLocalCarbonContext().getTenantId();

        try {
            OAuth2AccessTokenReqDTO tokenReqDTO = new OAuth2AccessTokenReqDTO();
            RequestParameter[] requestParameters = new RequestParameter[1];
            RequestParameter requestParameter = new RequestParameter(VALIDITY_PERIOD_KEY,VALIDITY_PERIOD_VALUE);

            PrivilegedCarbonContext.startTenantFlow();
            PrivilegedCarbonContext.getThreadLocalCarbonContext().setUsername(userName);
            PrivilegedCarbonContext.getThreadLocalCarbonContext().setTenantDomain(TENANT_DOMAIN);
            PrivilegedCarbonContext.getThreadLocalCarbonContext().setTenantId(-1234);

            if (log.isDebugEnabled()) {
                log.debug("Fetching application details for "+userName);
            }
            OAuthConsumerAppDTO[] oauthapps = oAuthAdminService.getAllOAuthApplicationData();

            if (oauthapps != null) {
                tokenReqDTO.setGrantType(GRANT_TYPE);

                if(oauthapps.length > 0) {
                    tokenReqDTO.setClientId(oauthapps[0].getOauthConsumerKey());
                    tokenReqDTO.setClientSecret(oauthapps[0].getOauthConsumerSecret());
                    tokenReqDTO.setCallbackURI(oauthapps[0].getCallbackUrl());
                    tokenReqDTO.setScope(applicationScope);
                    tokenReqDTO.setTenantDomain(TENANT_DOMAIN);
                    tokenReqDTO.setPkceCodeVerifier(null);

                if (log.isDebugEnabled()) {
                    log.debug("Application Details Fetched Successfully \n" +
                              "Application name:  "+oauthapps[0].getApplicationName() + "\n" +
                              "Consumer_key: "+oauthapps[0].getOauthConsumerKey() + "\n" +
                              "Consumer_secret: "+oauthapps[0].getOauthConsumerSecret()
                    );
                }

                requestParameters[0] = requestParameter;
                tokenReqDTO.setRequestParameters(requestParameters);
                tokenReqDTO.setRequestParameters(requestParameters);
                OAuth2Service service = (OAuth2Service) PrivilegedCarbonContext.getThreadLocalCarbonContext()
                        .getOSGiService(OAuth2Service.class);
                if(log.isDebugEnabled()) {
                    log.debug("Starting to issue AccessToken for User "+userName);
                }

                    OAuthClientAuthnContext oAuthClientAuthnContext = new OAuthClientAuthnContext();
                    oAuthClientAuthnContext.setClientId(oauthapps[0].getOauthConsumerKey());
                    oAuthClientAuthnContext.setAuthenticated(true);
                    tokenReqDTO.setoAuthClientAuthnContext(oAuthClientAuthnContext);

                    OAuth2AccessTokenRespDTO oAuth2AccessTokenRespDTO = service.issueAccessToken(tokenReqDTO);

                if (log.isDebugEnabled()) {
                    log.debug("Generated Access Token :" +oAuth2AccessTokenRespDTO.getAccessToken());
                  }
                } else {
                    if (log.isDebugEnabled()) {
                        log.debug("No Application Found for User: "+userName);
                    }
                }
             }
        } catch (IdentityOAuthAdminException e) {
            log.error("Error while Fetching application details ", e);
        } finally {
            PrivilegedCarbonContext.endTenantFlow();
            PrivilegedCarbonContext.getThreadLocalCarbonContext().setUsername(threadLocalUsername);
            PrivilegedCarbonContext.getThreadLocalCarbonContext().setTenantDomain(threadTenantDomain);
            PrivilegedCarbonContext.getThreadLocalCarbonContext().setTenantId(tenantId);
        }

        return true;
    }

    @Override
    public boolean doPostUpdateCredentialByAdmin(String userName, Object credential, UserStoreManager userStoreManager) throws UserStoreException {

        if (log.isDebugEnabled()) {
            log.debug("Executing doPostUpdateCredentialByAdmin Service");
        }
        return this.doPostUpdateCredential(userName, credential, userStoreManager);
    }
}
