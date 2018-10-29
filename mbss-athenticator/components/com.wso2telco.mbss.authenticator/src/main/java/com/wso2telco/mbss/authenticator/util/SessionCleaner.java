package com.wso2telco.mbss.authenticator.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SessionCleaner {

    private static final long INITIAL_DELAY = 6;  //Hours
    private static final long REPEAT_INTERVAL = 24;  //Hours
    private static final Log log = LogFactory.getLog(MBSSAuthenticatorDbUtil.class);
    private final long sessionTimeout;

    private ScheduledExecutorService executorService;

    public SessionCleaner() {
        executorService = Executors.newSingleThreadScheduledExecutor();
        sessionTimeout = ConfigLoader.getInstance().getMbssAuthenticatorConfig().getFeatureConfig()
                .getSessionTimeout();
    }

    public void start() {
        if (executorService != null) {
            executorService.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    log.info("Session Cleaner: Service is started");
                    MBSSAuthenticatorDbUtil.removeOutdatedSessionData(sessionTimeout);
                    log.info("Session Cleaner: Service is completed ");
                }
            }, INITIAL_DELAY, REPEAT_INTERVAL, TimeUnit.HOURS);
        }
    }

    public void stop() {
        executorService.shutdown();
    }
}
