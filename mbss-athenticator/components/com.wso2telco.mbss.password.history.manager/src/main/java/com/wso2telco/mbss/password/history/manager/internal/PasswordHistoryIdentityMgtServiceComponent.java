package com.wso2telco.mbss.password.history.manager.internal;

import com.wso2telco.mbss.password.history.manager.listner.PasswordHistoryIdentityMgtEventLister;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.registry.core.service.RegistryService;
import org.wso2.carbon.user.core.listener.UserOperationEventListener;
import org.wso2.carbon.user.core.service.RealmService;

/**
 *
 * @scr.component name="PasswordHistoryIdentityMgtServiceComponent"
 * immediate="true"
 * @scr.reference name="registry.service"
 * interface="org.wso2.carbon.registry.core.service.RegistryService"
 * cardinality="1..1" policy="dynamic" bind="setRegistryService"
 * unbind="unsetRegistryService"
 * @scr.reference name="user.realmservice.default"
 * interface="org.wso2.carbon.user.core.service.RealmService" cardinality="1..1"
 * policy="dynamic" bind="setRealmService" unbind="unsetRealmService"
 */

public class PasswordHistoryIdentityMgtServiceComponent {

    private static Log log = LogFactory.getLog(PasswordHistoryIdentityMgtServiceComponent.class);

    protected void activate(ComponentContext context) {
        PasswordHistoryIdentityDataHolder.getInstance().setBundleContext(context.getBundleContext());
        PasswordHistoryIdentityDataHolder.getInstance().init();
        PasswordHistoryIdentityMgtEventLister passwordHistoryIdentityMgtEventLister = new PasswordHistoryIdentityMgtEventLister();
        context.getBundleContext().registerService(UserOperationEventListener.class.getName(),
                passwordHistoryIdentityMgtEventLister, null);
    }


    protected void deactivate(ComponentContext context) {
        PasswordHistoryIdentityDataHolder.getInstance().setBundleContext(null);
        log.debug("Identity Management bundle is de-activated");
    }

    protected void setRegistryService(RegistryService registryService) {
        log.debug("Setting the Registry Service");
        PasswordHistoryIdentityDataHolder.getInstance().setRegistryService(registryService);
    }

    protected void unsetRegistryService(RegistryService registryService) {
        log.debug("UnSetting the Registry Service");
        PasswordHistoryIdentityDataHolder.getInstance().setRegistryService(null);
    }

    protected void setRealmService(RealmService realmService) {
        log.debug("Setting the Realm Service");
        PasswordHistoryIdentityDataHolder.getInstance().setRealmService(realmService);
    }

    protected void unsetRealmService(RealmService realmService) {
        log.debug("UnSetting the Realm Service");
        PasswordHistoryIdentityDataHolder.getInstance().setRealmService(null);
    }

    public static RealmService getRealmService() {
        return PasswordHistoryIdentityDataHolder.getInstance().getRealmService();
    }

    public static RegistryService getRegistryService() {
        return PasswordHistoryIdentityDataHolder.getInstance().getRegistryService();
    }
}
