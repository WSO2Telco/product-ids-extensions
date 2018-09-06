/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.identity.password.history;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.context.PrivilegedCarbonContext;
import org.wso2.carbon.identity.password.history.exception.AccountSuspensionNotificationException;
import org.wso2.carbon.identity.password.history.internal.NotificationTaskDataHolder;
import org.wso2.carbon.identity.password.history.util.EmailUtil;
import org.wso2.carbon.identity.password.history.util.NotificationConstants;
import org.wso2.carbon.identity.password.history.util.NotificationReceiver;
import org.wso2.carbon.identity.password.history.util.PropertyFileReader;
import org.wso2.carbon.identity.application.common.model.Property;
//import org.wso2.carbon.identity.base.IdentityException;
import org.wso2.carbon.identity.core.util.IdentityTenantUtil;
import org.wso2.carbon.identity.core.util.IdentityUtil;
import org.wso2.carbon.user.api.UserStoreException;
import org.wso2.carbon.user.core.UserCoreConstants;
import org.wso2.carbon.user.core.UserRealm;
import org.wso2.carbon.user.core.UserStoreManager;
import org.wso2.carbon.user.core.service.RealmService;
import org.wso2.carbon.user.core.tenant.Tenant;
import org.wso2.carbon.utils.multitenancy.MultitenantConstants;

import java.util.Properties;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountValidatorThread implements Runnable {

    private static final Log log = LogFactory.getLog(AccountValidatorThread.class);

    public AccountValidatorThread() {

    }

    @Override
    public void run() {

        if (log.isDebugEnabled()) {
            log.debug("Idle account suspension task started.");
        }
        log.info("+++AccountValidatorThread run STARTED");

        RealmService realmService = NotificationTaskDataHolder.getInstance().getRealmService();

        Tenant tenants[] = new Tenant[0];

        try {
            tenants = (Tenant[]) realmService.getTenantManager().getAllTenants();
        } catch (UserStoreException e) {
            log.error("Error occurred while retrieving tenants", e);
        }

        handleTask(MultitenantConstants.SUPER_TENANT_DOMAIN_NAME);

        for (Tenant tenant : tenants) {
            handleTask(tenant.getDomain());
        }
        log.info("+++AccountValidatorThread run DONE");
    }

    private void handleTask(String tenantDomain) {

        if (log.isDebugEnabled()) {
            log.debug("Handling idle account suspension task for tenant: " + tenantDomain);
        }
        log.info("+++AccountValidatorThread handleTask STARTED");

        Property[] identityProperties;
        try {
            // Start Tenant flow
            PrivilegedCarbonContext.startTenantFlow();
            PrivilegedCarbonContext privilegedCarbonContext = PrivilegedCarbonContext.getThreadLocalCarbonContext();
            privilegedCarbonContext.setTenantId(IdentityTenantUtil.getTenantId(tenantDomain));
            privilegedCarbonContext.setTenantDomain(tenantDomain);

            identityProperties = new Property[6];
            //NotificationTaskDataHolder.getInstance().getIdentityGovernanceService().getConfiguration(getPropertyNames(), tenantDomain);
            identityProperties = PropertyFileReader.getFileReader().getAccountSuspensionProperties();
            
            boolean isEnabled = false;
            long suspensionDelay = 0;
            long[] notificationDelays = null;
            for (Property identityProperty : identityProperties) {

                if (identityProperty == null) {
                    continue;
                }

                if (NotificationConstants.SUSPENSION_NOTIFICATION_ENABLED.equals(identityProperty.getName())) {
                    isEnabled = Boolean.parseBoolean(identityProperty.getValue());

                    if (!isEnabled) {
                        return;
                    }
                }

                if (NotificationConstants.SUSPENSION_NOTIFICATION_ACCOUNT_DISABLE_DELAY.
                        equals(identityProperty.getName())) {
                    try {
                        suspensionDelay = Long.parseLong(identityProperty.getValue());
                    } catch (NumberFormatException e) {
                        log.error("Error occurred while reading account suspension delay for tenant: " + tenantDomain,
                                e);
                    }
                }

                if (NotificationConstants.SUSPENSION_NOTIFICATION_DELAYS.equals(identityProperty.getName())) {

                    if (identityProperty.getValue() != null) {
                        String[] parts = identityProperty.getValue().split(",");
                        notificationDelays = new long[parts.length];
                        for (int i = 0; i < parts.length; i++) {
                            try {
                                notificationDelays[i] = Long.parseLong(parts[i]);
                            } catch (NumberFormatException e) {
                                log.error("Error occurred while reading account suspension notification delays for "
                                        + "tenant: " + tenantDomain, e);
                            }
                        }
                    }
                }
            }

            if (log.isDebugEnabled()) {
                if (isEnabled) {
                    log.debug("Account suspension task is enabled for : " + tenantDomain);
                } else {
                    log.debug("Account suspension task is not enabled for : " + tenantDomain);
                }
            }

            if (!isEnabled) {
                return;
            }

            //notifyUsers(tenantDomain, suspensionDelay, notificationDelays);

            lockAccounts(tenantDomain, suspensionDelay);

        } catch (Exception e) {
            log.error("Error occurred while loading governance configuration for tenants", e);
//        } catch (IdentityException e) {
//            log.error("Unable to disable user accounts", e);
        } finally {
            PrivilegedCarbonContext.endTenantFlow();
        }
        log.info("+++AccountValidatorThread handleTask DONE");
    }

    /**
     * Notify users about account inactivity via Email.
     */
    private void notifyUsers(String tenantDomain, long suspensionDelay, long[] notificationDelays) {
        EmailUtil util = new EmailUtil();
        for (long delay : notificationDelays) {
            List<NotificationReceiver> receivers = null;
            try {
                receivers = NotificationReceiversRetrievalManager.getReceivers(delay, tenantDomain, suspensionDelay);
            } catch (AccountSuspensionNotificationException e) {
                log.error("Error occurred while retrieving notification receivers", e);
            }
            if (CollectionUtils.isNotEmpty(receivers)) {
                for (NotificationReceiver receiver : receivers) {
                    if (log.isDebugEnabled()) {
                        log.debug("Sending notification to: " + IdentityUtil.addDomainToName(receiver.getUsername(),
                                receiver.getUserStoreDomain()) + "@" + tenantDomain);
                    }
                    util.sendEmail(receiver);
                }
            }
        }
    }

    /**
     * Disable user accounts which exceeds max inactivity timeout.
     *
     * @throws Exception
     */
    private void lockAccounts(String tenantDomain, long suspensionDelay) throws Exception {
        List<NotificationReceiver> receivers = null;
        try {
            receivers = NotificationReceiversRetrievalManager.getReceivers(suspensionDelay, tenantDomain,
                    suspensionDelay);

        } catch (AccountSuspensionNotificationException e) {
            throw new Exception("Error occurred while retrieving users for account disable", e);
        }
        if (receivers.size() > 0) {
            for (NotificationReceiver receiver : receivers) {
                if (log.isDebugEnabled()) {
                    log.debug("Locking idle account: " + IdentityUtil.addDomainToName(receiver.getUsername(),
                            receiver.getUserStoreDomain()) + "@" + tenantDomain);
                }
                RealmService realmService = NotificationTaskDataHolder.getInstance().getRealmService();
                int tenantId = IdentityTenantUtil.getTenantId(tenantDomain);

                UserRealm userRealm;
                try {
                    userRealm = (UserRealm) realmService.getTenantUserRealm(tenantId);
                } catch (UserStoreException e) {
                    throw new Exception("Failed retrieve the user realm for tenant: " + tenantDomain, e);
                }

                UserStoreManager userStoreManager;
                try {
                    userStoreManager = userRealm.getUserStoreManager();
                } catch (org.wso2.carbon.user.core.UserStoreException e) {
                    throw new Exception("Failed retrieve the user store manager for tenant: " + tenantDomain,
                            e);
                }
                //Should not lock admin logins
                String[] adminUsersArray = userStoreManager.getUserListOfRole("admin");
                String userName = receiver.getUsername();
                Boolean isAdminUser = false;
                for (String adminUser: adminUsersArray) {
                	if (userName.equalsIgnoreCase(adminUser)) {
                		isAdminUser = true;
                		break;
                	}
                }
                if (!isAdminUser) {
                    Map<String, String> updatedClaims = new HashMap<>();
                    updatedClaims.put(NotificationConstants.ACCOUNT_SUSPENDED_CLAIM, Boolean.TRUE.toString());
                    updatedClaims.put(NotificationConstants.FAILED_LOGIN_ATTEMPTS, "0");
                    try {
                        userStoreManager.setUserClaimValues(IdentityUtil.addDomainToName(receiver.getUsername(),
                                receiver.getUserStoreDomain()), updatedClaims, UserCoreConstants.DEFAULT_PROFILE);
                    } catch (org.wso2.carbon.user.core.UserStoreException e) {
                        throw new Exception("Failed to update claim values for user: " + IdentityUtil
                                .addDomainToName(receiver.getUsername(), receiver.getUserStoreDomain()) + " in tenant: " +
                                tenantDomain);
                    }
                }
            }
        }
    }

    private String[] getPropertyNames() {

        List<String> properties = new ArrayList<>();
        properties.add(NotificationConstants.SUSPENSION_NOTIFICATION_ENABLED);
        properties.add(NotificationConstants.SUSPENSION_NOTIFICATION_ACCOUNT_DISABLE_DELAY);
        properties.add(NotificationConstants.SUSPENSION_NOTIFICATION_DELAYS);
        return properties.toArray(new String[properties.size()]);
    }
}
