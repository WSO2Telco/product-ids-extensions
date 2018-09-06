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
package org.wso2.carbon.identity.password.history.internal;

import org.apache.log4j.Logger;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.identity.password.history.NotificationReceiversRetrievalFactory;
import org.wso2.carbon.identity.password.history.handler.AccountSuspensionNotificationHandler;
import org.wso2.carbon.identity.password.history.jdbc.JDBCNotificationReceiversRetrievalFactory;
import org.wso2.carbon.identity.password.history.ldap.LDAPNotificationReceiversRetrievalFactory;
import org.wso2.carbon.identity.password.history.CustomUserOperationEventListener;
import org.wso2.carbon.user.core.UserStoreException;
import org.wso2.carbon.user.core.service.RealmService;
import org.wso2.carbon.user.core.listener.UserOperationEventListener;

/**
 * Notification scheduler. Check for users who requires a notification for relogin
 * and send a notification as configured.
 * @scr.component name="NotificationTaskServiceComponent"
 * immediate="true"
 * @scr.reference name="NotificationTaskServiceComponent"
 * interface="org.wso2.carbon.identity.password.history.NotificationReceiversRetrievalFactory"
 * cardinality="0..n" policy="dynamic" bind="setNotificationReceiversRetrievalFactory"
 * unbind="unsetNotificationReceiversRetrievalFactory"
 * @scr.reference name="user.realmservice.default"
 * interface="org.wso2.carbon.user.core.service.RealmService"
 * cardinality="1..1" policy="dynamic" bind="setRealmService" unbind="unsetRealmService"
 */
public class NotificationTaskServiceComponent {
    /*

    * */
    private static final Logger log = Logger.getLogger(NotificationTaskServiceComponent.class);

    protected void activate(ComponentContext context) throws UserStoreException {
        log.info("+++NotificationTaskServiceComponent activate STARTED");
        
        BundleContext bundleContext = context.getBundleContext();
        NotificationTaskDataHolder.getInstance().setBundleContext(bundleContext);

        //To start the thread when initializing
        AccountSuspensionNotificationHandler handler = new AccountSuspensionNotificationHandler();
        handler.startScheduler();
        log.info("+++AccountSuspensionNotificationHandler startScheduler");
        
        //Register this here and add logic to update last login time here
        CustomUserOperationEventListener customUserOperationEventListener = new CustomUserOperationEventListener();
        bundleContext.registerService(UserOperationEventListener.class.getName(), customUserOperationEventListener, null);
        log.info("+++registerService UserOperationEventListener");
        
        LDAPNotificationReceiversRetrievalFactory ladLdapNotificationReceiversRetrievalFactory = new
                LDAPNotificationReceiversRetrievalFactory();
        bundleContext.registerService(NotificationReceiversRetrievalFactory.class.getName(),
                ladLdapNotificationReceiversRetrievalFactory, null);

        JDBCNotificationReceiversRetrievalFactory jdbcNotificationReceiversRetrievalFactory =
                new JDBCNotificationReceiversRetrievalFactory();
        bundleContext.registerService(NotificationReceiversRetrievalFactory.class.getName(),
                jdbcNotificationReceiversRetrievalFactory, null);
        
        log.info("+++NotificationTaskServiceComponent activate DONE");
    }

    protected void deactivate(ComponentContext context) {
        if (log.isDebugEnabled()) {
            log.debug("Notification bundle de-activated");
        }
    }


    protected void setNotificationReceiversRetrievalFactory(
            NotificationReceiversRetrievalFactory notificationReceiversRetrievalFactory) {

        NotificationTaskDataHolder.getInstance().getNotificationReceiversRetrievalFactories()
                .put(notificationReceiversRetrievalFactory.getType(), notificationReceiversRetrievalFactory);
        if (log.isDebugEnabled()) {
            log.debug("Added notification retriever : " + notificationReceiversRetrievalFactory.getType());
        }

    }

    protected void unsetNotificationReceiversRetrievalFactory(
            NotificationReceiversRetrievalFactory notificationReceiversRetrievalFactory) {

        NotificationTaskDataHolder.getInstance().getNotificationReceiversRetrievalFactories()
                .remove(notificationReceiversRetrievalFactory.getType());

        if (log.isDebugEnabled()) {
            log.debug("Removed notification retriever : " + notificationReceiversRetrievalFactory.getType());
        }
    }

    protected void setRealmService(RealmService realmService) {

        NotificationTaskDataHolder.getInstance().setRealmService(realmService);
        if (log.isDebugEnabled()) {
            log.debug("RealmService is set in the User Store Count bundle");
        }
    }

    protected void unsetRealmService(RealmService realmService) {

        NotificationTaskDataHolder.getInstance().setRealmService(null);
        if (log.isDebugEnabled()) {
            log.debug("RealmService is unset in the Application Authentication Framework bundle");
        }
    }
}
