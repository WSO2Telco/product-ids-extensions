package com.wso2telco.mbss.password.history.manager.listner;


import com.wso2telco.mbss.password.history.manager.PasswordHistoryIdentityMgtConfig;
import com.wso2telco.mbss.password.history.manager.exeption.IdentityPasswordHistoryException;
import com.wso2telco.mbss.password.history.manager.store.PasswordHistoryDataStore;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.identity.application.common.model.User;
import org.wso2.carbon.identity.core.AbstractIdentityUserOperationEventListener;
import org.wso2.carbon.identity.core.util.IdentityCoreConstants;
import org.wso2.carbon.identity.core.util.IdentityTenantUtil;
import org.wso2.carbon.identity.core.util.IdentityUtil;
import org.wso2.carbon.identity.mgt.constants.IdentityMgtConstants;
import org.wso2.carbon.user.core.UserCoreConstants;
import org.wso2.carbon.user.core.UserStoreException;
import org.wso2.carbon.user.core.UserStoreManager;

import java.util.HashMap;
import java.util.Map;

/**
 * This is an implementation of UserOperationEventListener. This defines
 * additional operations
 * specific to Password History implementation
 */
public class PasswordHistoryIdentityMgtEventLister extends AbstractIdentityUserOperationEventListener {

    private static Log log = LogFactory.getLog(PasswordHistoryIdentityMgtEventLister.class);

    @Override
    public int getExecutionOrderId() {
        int orderId = getOrderId();
        if (orderId != IdentityCoreConstants.EVENT_LISTENER_ORDER_ID) {
            return orderId;
        }
        return 45;
    }


    public boolean doPostAddUser(String userName, Object credential, String[] roleList, Map<String, String> claims, String profile, UserStoreManager userStoreManager) throws UserStoreException {

        storePasswordHistory(userName, credential, userStoreManager);
        //Set Last updated Password property
        Map<String, String> userClaims = new HashMap<>();
        userClaims.put(IdentityMgtConstants.LAST_PASSWORD_UPDATE_TIME, Long.toString(System.currentTimeMillis()));
        userStoreManager.setUserClaimValues(userName, userClaims, null);
        return true;
    }

    public boolean doPreUpdateCredential(String userName, Object newCredential, Object oldCredential, UserStoreManager userStoreManager) throws UserStoreException {
        validatePasswordHistory(userName, newCredential, userStoreManager);
        return true;
    }

    public boolean doPostUpdateCredential(String userName, Object credential, UserStoreManager userStoreManager) throws UserStoreException {
        storePasswordHistory(userName, credential, userStoreManager);
        return true;
    }


    public boolean doPreUpdateCredentialByAdmin(String userName, Object newCredential, UserStoreManager userStoreManager) throws UserStoreException {
        validatePasswordHistory(userName, newCredential, userStoreManager);
        return true;
    }


    public boolean doPostUpdateCredentialByAdmin(String userName, Object credential, UserStoreManager userStoreManager) throws UserStoreException {
        storePasswordHistory(userName, credential, userStoreManager);
        return true;
    }

    public boolean doPostDeleteUser(String userName, UserStoreManager userStoreManager) throws UserStoreException {

        if (PasswordHistoryIdentityMgtConfig.getInstance().isPasswordHistoryEnable()) {
            PasswordHistoryDataStore passwordHistoryDataStore = PasswordHistoryIdentityMgtConfig.getInstance().getPasswordHistoryDataStore();

            try {
                String tenantDomain = IdentityTenantUtil.getTenantDomain(userStoreManager.getTenantId());
                String domainName = userStoreManager.getRealmConfiguration().getUserStoreProperty(UserCoreConstants
                        .RealmConfig.PROPERTY_DOMAIN_NAME);
                if (StringUtils.isBlank(domainName)) {
                    domainName = IdentityUtil.getPrimaryDomainName();
                }
                User user = new User();
                user.setUserName(userName);
                user.setUserStoreDomain(domainName);
                user.setTenantDomain(tenantDomain);
                passwordHistoryDataStore.remove(user);
            } catch (IdentityPasswordHistoryException e) {
                throw new UserStoreException("Error while deleting password history recordes of user :" + userName);
            }

        }


        return true;
    }


    private void validatePasswordHistory(String userName, Object newCredential, UserStoreManager userStoreManager) throws UserStoreException {
        //Not validate if passwordHistory validation is false
        if (!PasswordHistoryIdentityMgtConfig.getInstance().isPasswordHistoryEnable()) {
            return;
        }

        PasswordHistoryDataStore passwordHistoryDataStore = PasswordHistoryIdentityMgtConfig.getInstance().getPasswordHistoryDataStore();

        try {
            String tenantDomain = IdentityTenantUtil.getTenantDomain(userStoreManager.getTenantId());
            String domainName = userStoreManager.getRealmConfiguration().getUserStoreProperty(UserCoreConstants
                    .RealmConfig.PROPERTY_DOMAIN_NAME);
            if (StringUtils.isBlank(domainName)) {
                domainName = IdentityUtil.getPrimaryDomainName();
            }
            User user = new User();
            user.setUserName(userName);
            user.setUserStoreDomain(domainName);
            user.setTenantDomain(tenantDomain);

            boolean validate = passwordHistoryDataStore.validate(user, newCredential);
            if (!validate) {
                throw new UserStoreException("This password has been used in recent history. Please choose a different password");
            }
        } catch (IdentityPasswordHistoryException e) {
            throw new UserStoreException("Error while validating password History", e);
        }
    }

    private void storePasswordHistory(String userName, Object credential, UserStoreManager userStoreManager) throws UserStoreException {
        //Not store if passwordHistory validation is false
        if (!PasswordHistoryIdentityMgtConfig.getInstance().isPasswordHistoryEnable()) {
            return;
        }

        PasswordHistoryDataStore passwordHistoryDataStore = PasswordHistoryIdentityMgtConfig.getInstance().getPasswordHistoryDataStore();

        try {
            String tenantDomain = IdentityTenantUtil.getTenantDomain(userStoreManager.getTenantId());
            String domainName = userStoreManager.getRealmConfiguration().getUserStoreProperty(UserCoreConstants
                    .RealmConfig.PROPERTY_DOMAIN_NAME);
            if (StringUtils.isBlank(domainName)) {
                domainName = IdentityUtil.getPrimaryDomainName();
            }
            User user = new User();
            user.setUserName(userName);
            user.setUserStoreDomain(domainName);
            user.setTenantDomain(tenantDomain);

            passwordHistoryDataStore.store(user, credential);
        } catch (IdentityPasswordHistoryException e) {
            throw new UserStoreException("Error while storing password History", e);
        }
    }


}
