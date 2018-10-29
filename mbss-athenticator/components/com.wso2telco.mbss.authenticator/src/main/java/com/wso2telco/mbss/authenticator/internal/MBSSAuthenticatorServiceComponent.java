package com.wso2telco.mbss.authenticator.internal;

import com.wso2telco.mbss.authenticator.MBSSBasicAuthenticator;
import com.wso2telco.mbss.authenticator.util.SessionCleaner;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.identity.application.authentication.framework.ApplicationAuthenticator;
import org.wso2.carbon.user.core.service.RealmService;


/**
 * @scr.component name="com.wso2telco.mbss.authenticator.basic.component" immediate="true"
 * @scr.reference name="realm.service"
 * interface="org.wso2.carbon.user.core.service.RealmService"cardinality="1..1"
 * policy="dynamic" bind="setRealmService" unbind="unsetRealmService"
 */
public class MBSSAuthenticatorServiceComponent {

    private static Log log = LogFactory.getLog(MBSSAuthenticatorServiceComponent.class);

    private static RealmService realmService;
    private static SessionCleaner sessionCleaner = new SessionCleaner();

    public static RealmService getRealmService() {
        return realmService;
    }

    protected void activate(ComponentContext ctxt) {
        try {
            MBSSBasicAuthenticator basicCustomAuth = new MBSSBasicAuthenticator();
            ctxt.getBundleContext().registerService(ApplicationAuthenticator.class.getName(), basicCustomAuth, null);
            if (log.isDebugEnabled()) {
                log.info("MBSSAuthenticator bundle is activated");
            }
        } catch (Throwable e) {
            log.error("MBSSAuthenticator bundle activation Failed", e);
        }

        //start session cleaning service
        sessionCleaner.start();
    }

    protected void deactivate(ComponentContext ctxt) {
        if (log.isDebugEnabled()) {
            log.debug("MBSSAuthenticator removing old session data.");
        }
        //MBSSAuthenticatorDbUtil.removeOutdatedSessionData();
        if (log.isDebugEnabled()) {
            log.info("MBSSAuthenticator bundle is deactivated");
        }

        sessionCleaner.stop();
    }

    protected void unsetRealmService(RealmService realmService) {
        log.debug("UnSetting the Realm Service");
        MBSSAuthenticatorServiceComponent.realmService = null;
    }

    protected void setRealmService(RealmService realmService) {
        log.debug("Setting the Realm Service");
        MBSSAuthenticatorServiceComponent.realmService = realmService;
    }
}
