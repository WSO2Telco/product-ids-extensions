/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbon.identity.password.history.handler;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.identity.password.history.AccountValidatorThread;
import org.wso2.carbon.identity.password.history.internal.NotificationTaskDataHolder;
import org.wso2.carbon.identity.password.history.util.NotificationConstants;
import org.wso2.carbon.identity.password.history.util.PropertyFileReader;
import org.wso2.carbon.identity.base.IdentityRuntimeException;
import org.wso2.carbon.identity.core.handler.InitConfig;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.wso2.carbon.identity.application.common.model.Property;

public class AccountSuspensionNotificationHandler {

    private static final Log log = LogFactory.getLog(AccountSuspensionNotificationHandler.class);
    private static final String UPDATE_CONFIGURATION = "UPDATE_CONFIGURATION";

    /*
    @Override
    public void handleEvent(Event event) throws IdentityEventException {

        boolean isEnabled = isSuspensionNotificationEnabled(event);

        if (!isEnabled) {
            return;
        }


        if (IdentityEventConstants.Event.POST_AUTHENTICATION.equals(event.getEventName())) {
            Map<String, Object> eventProperties = event.getEventProperties();

            String userName = (String) eventProperties.get(IdentityEventConstants.EventProperty.USER_NAME);
            UserStoreManager userStoreManager = (UserStoreManager) eventProperties
                    .get(IdentityEventConstants.EventProperty.USER_STORE_MANAGER);
            if (!(Boolean) eventProperties.get(IdentityEventConstants.EventProperty.OPERATION_STATUS)) {
                return;
            }
            try {
                HashMap<String, String> userClaims = new HashMap<>();
                userClaims.put(NotificationConstants.LAST_LOGIN_TIME, Long.toString(System.currentTimeMillis()));
                userStoreManager.setUserClaimValues(userName, userClaims, null);
            } catch (UserStoreException e) {
                log.error("Error occurred while updating last login claim for user: ", e);
            }
        }
    }*/
/*
    @Override
    public String getName() {
        return "suspension.notification";
    }

    @Override
    public String getFriendlyName() {
        return "Lock Idle Accounts";
    }

    @Override
    public String getCategory() {
        return "Account Management Policies";
    }

    @Override
    public String getSubCategory() {
        return "DEFAULT";
    }

    @Override
    public int getOrder() {
        return 0;
    }

    */

    public Map<String, String> getPropertyNameMapping() {
        Map<String, String> nameMapping = new HashMap<>();
        nameMapping.put(NotificationConstants.SUSPENSION_NOTIFICATION_ENABLED, "Enable");
        nameMapping.put(NotificationConstants.SUSPENSION_NOTIFICATION_ACCOUNT_DISABLE_DELAY, "Lock Account After (days)");
        nameMapping.put(NotificationConstants.SUSPENSION_NOTIFICATION_DELAYS, "Alert Users before account locking in " +
                "days (comma-separated list)");
        return nameMapping;
    }

    public Map<String, String> getPropertyDescriptionMapping() {
        return new HashMap<>();
    }

    public void init(InitConfig configuration) throws IdentityRuntimeException {

    /*
		super.init(configuration);

        if (StringUtils.isBlank(configs.getModuleProperties().
                getProperty(NotificationConstants.SUSPENSION_NOTIFICATION_TRIGGER_TIME))) {
            NotificationTaskDataHolder.getInstance().setNotificationTriggerTime(configs.getModuleProperties().
                    getProperty(NotificationConstants.SUSPENSION_NOTIFICATION_TRIGGER_TIME));
        }

        NotificationTaskDataHolder.getInstance().setNotificationTriggerTime(configs.getModuleProperties().
                getProperty(NotificationConstants.SUSPENSION_NOTIFICATION_TRIGGER_TIME));
        startScheduler();
        NotificationTaskDataHolder.getInstance().getBundleContext()
                .registerService(IdentityConnectorConfig.class.getName(), this, null);*/
    }

    public String[] getPropertyNames() {

        List<String> properties = new ArrayList<>();
        properties.add(NotificationConstants.SUSPENSION_NOTIFICATION_ENABLED);
        properties.add(NotificationConstants.SUSPENSION_NOTIFICATION_ACCOUNT_DISABLE_DELAY);
        properties.add(NotificationConstants.SUSPENSION_NOTIFICATION_DELAYS);
        return properties.toArray(new String[properties.size()]);
    }

    public Properties getDefaultPropertyValues(String tenantDomain) throws Exception {

        Map<String, String> defaultProperties = new HashMap<>();
/*
        defaultProperties.put(NotificationConstants.SUSPENSION_NOTIFICATION_ENABLED,
                configs.getModuleProperties().getProperty(NotificationConstants.SUSPENSION_NOTIFICATION_ENABLED));

        defaultProperties.put(NotificationConstants.SUSPENSION_NOTIFICATION_ACCOUNT_DISABLE_DELAY,
                configs.getModuleProperties()
                        .getProperty(NotificationConstants.SUSPENSION_NOTIFICATION_ACCOUNT_DISABLE_DELAY));

        defaultProperties.put(NotificationConstants.SUSPENSION_NOTIFICATION_DELAYS,
                configs.getModuleProperties().getProperty(NotificationConstants.SUSPENSION_NOTIFICATION_DELAYS));
*/
        Properties properties = new Properties();
        properties.putAll(defaultProperties);
        return properties;
    }

    public Map<String, String> getDefaultPropertyValues(String[] propertyNames, String tenantDomain)
            throws Exception {
        return null;
    }

    public void startScheduler() {

        log.info("+++AccountSuspensionNotificationHandler startScheduler START");
        
        Property[] identityProperties = new Property[6];
        boolean isEnabled = false;
        long suspensionDelay = 0;
        Date notificationTriggerTime = null;
        String notificationTriggerTimeProperty = "";
        try {
        	identityProperties = PropertyFileReader.getFileReader().getAccountSuspensionProperties();
        } catch (Exception e) {
            log.error("Error while retrieving Account Locking Handler properties.", e);
        }

		//if(!Boolean.parseBoolean(configs.getModuleProperties().getProperty(NotificationConstants.
        //      SUSPENSION_NOTIFICATION_ENABLED))) {
        //		return;
        //}
        for (Property identityProperty : identityProperties) {
            if (NotificationConstants.SUSPENSION_NOTIFICATION_ENABLED.equals(identityProperty.getName())) {
                isEnabled = Boolean.parseBoolean(identityProperty.getValue());
                break;
            }
        }
        if (!isEnabled) {
        	return;
        }
        //configs.getModuleProperties().getProperty(NotificationConstants.
        //SUSPENSION_NOTIFICATION_TRIGGER_TIME);
        for (Property identityProperty : identityProperties) {
            if (NotificationConstants.SUSPENSION_NOTIFICATION_TRIGGER_TIME.equals(identityProperty.getName())) {
            	notificationTriggerTimeProperty = identityProperty.getValue();
                NotificationTaskDataHolder.getInstance().setNotificationTriggerTime(notificationTriggerTimeProperty);
                break;
            }
        }
        DateFormat dateFormat = new SimpleDateFormat(NotificationConstants.TRIGGER_TIME_FORMAT);

        if (notificationTriggerTimeProperty != null) {
            try {
                notificationTriggerTime = dateFormat.parse(notificationTriggerTimeProperty);
            } catch (ParseException e) {
                log.error("Invalid Date format for Notification trigger time", e);
            }
        }

        long schedulerDelayInSeconds = TimeUnit.HOURS.toSeconds(NotificationConstants.SCHEDULER_DELAY);

        Calendar currentTime = Calendar.getInstance();
        Calendar triggerTime = Calendar.getInstance();
        // If notificationTriggerTimeProperty is not found or not in right format default to 20:00:00.
        // In Calender.HOUR_OF_DAY (i.e. in 24-hour clock) it is 20.
        if (notificationTriggerTime != null) {
            triggerTime.setTime(notificationTriggerTime);
        } else {
            triggerTime.set(Calendar.HOUR_OF_DAY, 20);
            triggerTime.set(Calendar.MINUTE, 0);
            triggerTime.set(Calendar.SECOND, 0);
        }


        // Convert times into seconds
        long currentSecond =
                (currentTime.get(Calendar.HOUR_OF_DAY) * 3600) + currentTime.get(Calendar.MINUTE) * 60 + currentTime
                        .get(Calendar.SECOND);
        long triggerSecond =
                (triggerTime.get(Calendar.HOUR_OF_DAY) * 3600) + triggerTime.get(Calendar.MINUTE) * 60 + triggerTime
                        .get(Calendar.SECOND);
        long delay = triggerSecond - currentSecond;
        // If the notification time has passed, schedule the next day
        if (delay < 0) {
            delay += schedulerDelayInSeconds;
        }

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(NotificationTaskDataHolder.getInstance().
                getNotificationSendingThreadPoolSize());
        scheduler.scheduleAtFixedRate(new AccountValidatorThread(), delay, schedulerDelayInSeconds, TimeUnit.SECONDS);

        log.info("+++AccountSuspensionNotificationHandler startScheduler DONE");
    }

    /* Not used method
    private boolean isSuspensionNotificationEnabled(Event event) throws IdentityEventException {
		boolean isEnabled = false;

        //Map<String, Object> eventProperties = event.getEventProperties();
        //String tenantDomain = (String) eventProperties.get(IdentityEventConstants.EventProperty.TENANT_DOMAIN);

        Property[] identityProperties = new Property[6];
        try {
        	// identityProperties = NotificationTaskDataHolder.getInstance()
        	//         .getIdentityGovernanceService().getConfiguration(getPropertyNames(), tenantDomain);
        	identityProperties = PropertyFileReader.getFileReader().getAccountSuspensionProperties();
        } catch (Exception e) {
            throw new Exception("Error while retrieving Account Locking Handler properties.", e);
        }

        for (Property identityProperty : identityProperties) {
            if (NotificationConstants.SUSPENSION_NOTIFICATION_ENABLED.equals(identityProperty.getName())) {
                isEnabled = Boolean.parseBoolean(identityProperty.getValue());
                break;
            }
        }

        return isEnabled;
    }
    */

}
