/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.data.publisher.session.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.identity.application.authentication.framework.context.AuthenticationContext;
import org.wso2.carbon.identity.base.IdentityRuntimeException;
import org.wso2.carbon.identity.data.publisher.session.AbstractAuthenticationDataPublisher;
import org.wso2.carbon.identity.data.publisher.session.AuthPublisherConstants;
import org.wso2.carbon.identity.data.publisher.session.AuthnDataPublisherUtils;
import org.wso2.carbon.identity.data.publisher.session.model.AuthenticationData;
import org.wso2.carbon.identity.data.publisher.session.model.SessionData;
import org.wso2.carbon.identity.data.publisher.session.util.DataPublisherDbUtil;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.Map;

public class DbSessionDataPublisherImpl extends AbstractAuthenticationDataPublisher {

    public static final Log LOG = LogFactory.getLog(DbSessionDataPublisherImpl.class);

    @Override
    public void publishAuthenticationStepSuccess(HttpServletRequest request, AuthenticationContext context,
                                                 Map<String, Object> params) {
        // This method is overridden to do nothing since this is a session data publisher.
    }

    @Override
    public void publishAuthenticationStepFailure(HttpServletRequest request, AuthenticationContext context,
                                                 Map<String, Object> params) {
        // This method is overridden to do nothing since this is a session data publisher.
    }

    @Override
    public void publishAuthenticationSuccess(HttpServletRequest request, AuthenticationContext context, Map<String,
            Object> params) {
        // This method is overridden to do nothing since this is a session data publisher.
    }

    @Override
    public void publishAuthenticationFailure(HttpServletRequest request, AuthenticationContext context, Map<String,
            Object> params) {
        // This method is overridden to do nothing since this is a session data publisher.
    }

    @Override
    public void doPublishAuthenticationStepSuccess(AuthenticationData authenticationData) {
        // This method is not implemented since there is no usage of it in session publishing
    }

    @Override
    public void doPublishAuthenticationStepFailure(AuthenticationData authenticationData) {
        // This method is not implemented since there is no usage of it in session publishing
    }

    @Override
    public void doPublishAuthenticationSuccess(AuthenticationData authenticationData) {
        // This method is not implemented since there is no usage of it in session publishing
    }

    @Override
    public void doPublishAuthenticationFailure(AuthenticationData authenticationData) {
        // This method is not implemented since there is no usage of it in session publishing
    }

    @Override
    public void doPublishSessionCreation(SessionData sessionData) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Publishing session creation to DAS");
        }
        publishSessionData(sessionData, AuthPublisherConstants.SESSION_CREATION_STATUS);
    }

    @Override
    public void doPublishSessionTermination(SessionData sessionData) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Publishing session termination to DAS");
        }
        publishSessionData(sessionData, AuthPublisherConstants.SESSION_TERMINATION_STATUS);

    }

    @Override
    public void doPublishSessionUpdate(SessionData sessionData) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Publishing session update to DAS");
        }
        publishSessionData(sessionData, AuthPublisherConstants.SESSION_UPDATE_STATUS);
    }

    @Override
    public String getName() {
        return AuthPublisherConstants.DAS_SESSION_PUBLISHER_NAME;
    }

    protected void publishSessionData(SessionData sessionData, int actionId) {

        if (sessionData != null) {
            switch (actionId) {
                case AuthPublisherConstants.SESSION_CREATION_STATUS:
                case AuthPublisherConstants.SESSION_UPDATE_STATUS:
                    updateSessionData(sessionData);
                    break;

                case AuthPublisherConstants.SESSION_TERMINATION_STATUS:
                    terminateSession(sessionData);
                    break;
            }

        }
    }

    protected void updateSessionData(SessionData sessionData) {
        SessionData<Object, Object> tmpSessionData = new SessionData<>();
        try {
            String sessionId = AuthnDataPublisherUtils.replaceIfNotAvailable(AuthPublisherConstants.CONFIG_PREFIX +
                    AuthPublisherConstants.SESSION_ID, sessionData.getSessionId());
            long createdTimestamp = sessionData.getCreatedTimestamp();
            long updatedTimestamp = sessionData.getUpdatedTimestamp();
            long terminationTimestamp = sessionData.getTerminationTimestamp();
            String username = AuthnDataPublisherUtils.replaceIfNotAvailable(AuthPublisherConstants.CONFIG_PREFIX +
                    AuthPublisherConstants.USERNAME, sessionData.getUser());
            String serviceProvider = sessionData.getServiceProvider();

            tmpSessionData.setSessionId(sessionId);
            tmpSessionData.setCreatedTimestamp(createdTimestamp);
            tmpSessionData.setUpdatedTimestamp(updatedTimestamp);
            tmpSessionData.setTerminationTimestamp(terminationTimestamp);
            tmpSessionData.setUser(username);
            tmpSessionData.setServiceProvider(serviceProvider);

            DataPublisherDbUtil.publishSessionData(tmpSessionData);

        } catch (IdentityRuntimeException e) {
            if (LOG.isDebugEnabled()) {
                LOG.error("Error while publishing session information", e);
            }
        } catch (SQLException e) {
            LOG.error("Error publishing session data. " + e.getMessage(), e);
        }
    }

    protected void terminateSession(SessionData sessionData) {
        try {
            DataPublisherDbUtil.terminateSession(sessionData.getSessionId());
        } catch (SQLException e) {
            LOG.error("Error removing session data", e);
        }
    }
}
