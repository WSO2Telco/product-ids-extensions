package com.wso2telco.mbss.password.history.manager.internal;

import com.wso2telco.mbss.password.history.manager.PasswordHistoryIdentityMgtConfig;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.framework.BundleContext;
import org.wso2.carbon.identity.mgt.RecoveryProcessor;
import org.wso2.carbon.registry.core.service.RegistryService;
import org.wso2.carbon.user.core.service.RealmService;

/**
 * This class is used as the singleton data holder inside Password History Identity Management module.
 */
public class PasswordHistoryIdentityDataHolder {
    private static PasswordHistoryIdentityDataHolder instance = new PasswordHistoryIdentityDataHolder();
    private static Log log = LogFactory.getLog(PasswordHistoryIdentityDataHolder.class);

    private RegistryService registryService;
    private RealmService realmService;
    private BundleContext bundleContext;
    private static RecoveryProcessor recoveryProcessor;


    private PasswordHistoryIdentityDataHolder() {
    }

    public static PasswordHistoryIdentityDataHolder getInstance() {

        return instance;
    }


    public RegistryService getRegistryService() {
        return registryService;
    }

    public void setRegistryService(RegistryService registryService) {
        this.registryService = registryService;
    }

    public RealmService getRealmService() {
        return realmService;
    }

    public void setRealmService(RealmService realmService) {
        this.realmService = realmService;
    }

    public BundleContext getBundleContext() {
        return bundleContext;
    }

    public void setBundleContext(BundleContext bundleContext) {
        this.bundleContext = bundleContext;
    }

    public void init() {
        recoveryProcessor = new RecoveryProcessor();
        PasswordHistoryIdentityMgtConfig.getInstance(realmService.getBootstrapRealmConfiguration());
    }

    public static RecoveryProcessor getRecoveryProcessor() {
        return recoveryProcessor;
    }

}
