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
package com.wso2telco.dep.tokenregenerator.internal;

import com.wso2telco.dep.tokenregenerator.DataHolder;
import com.wso2telco.dep.tokenregenerator.TokenRegenerationEventListener;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.user.core.listener.UserOperationEventListener;
import org.wso2.carbon.user.core.service.RealmService;
import org.wso2.carbon.apimgt.impl.APIManagerConfigurationService;


import java.util.Properties;

/**
 * @scr.component name="com.wso2telco.dep.tokenregenerator" immediate=true
 * @scr.reference name="realm.service"
 * interface="org.wso2.carbon.user.core.service.RealmService"cardinality="1..1"
 * policy="dynamic" bind="setRealmService" unbind="unsetRealmService"
 * @scr.reference name="api.manager.config.service"
 * interface="org.wso2.carbon.apimgt.impl.APIManagerConfigurationService"cardinality="1..1"
 * policy="dynamic" bind="setAPIManagerConfigurationService" unbind="unsetAPIManagerConfigurationService"
 */

public class TokenRegenOperationEventListenerDSComponent {

    private static Log log = LogFactory.getLog(TokenRegenOperationEventListenerDSComponent.class);

    protected void activate(ComponentContext context) {

        //register the custom listener as an OSGI service.
        context.getBundleContext().registerService(
                UserOperationEventListener.class.getName(), new TokenRegenerationEventListener(), new Properties());


        log.info("TokenRegenOperationEventListenerDSComponent bundle activated successfully..");
    }

    protected void deactivate(ComponentContext context) {
        if (log.isDebugEnabled()) {
            log.debug("TokenRegenOperationEventListenerDSComponent is deactivated ");
        }
    }

    protected void setRealmService(RealmService realmService) {
        if (log.isDebugEnabled()) {
            log.debug("Setting the Realm Service");
        }
        DataHolder.getInstance().setRealmService(realmService);
    }

    protected void unsetRealmService(RealmService realmService) {
        if (log.isDebugEnabled()) {
            log.debug("UnSetting the Realm Service");
        }
        DataHolder.getInstance().setRealmService(null);
    }

    protected void setAPIManagerConfigurationService(APIManagerConfigurationService amcService) {
        log.debug("API manager configuration service bound to the API host objects");
        DataHolder.getInstance().setApiManagerConfigurationService(amcService);
    }

    protected void unsetAPIManagerConfigurationService(APIManagerConfigurationService amcService) {
        log.debug("API manager configuration service unbound from the API host objects");
        DataHolder.getInstance().setApiManagerConfigurationService(null);
    }

}
