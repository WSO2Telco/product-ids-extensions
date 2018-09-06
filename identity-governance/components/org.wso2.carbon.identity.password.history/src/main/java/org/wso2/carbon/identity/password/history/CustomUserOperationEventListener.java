package org.wso2.carbon.identity.password.history;

import org.wso2.carbon.user.core.common.AbstractUserOperationEventListener;
import org.wso2.carbon.user.core.UserStoreManager;
import org.wso2.carbon.user.core.UserStoreException;

import java.util.*;

import org.wso2.carbon.identity.password.history.handler.AccountSuspensionNotificationHandler;
import org.wso2.carbon.identity.password.history.util.NotificationConstants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CustomUserOperationEventListener extends AbstractUserOperationEventListener {

    private static final Log log = LogFactory.getLog(CustomUserOperationEventListener.class);
    
	@Override
    public boolean doPostAuthenticate(String userName, boolean authenticated,
                                      UserStoreManager userStoreManager) throws UserStoreException {
		log.info("+++CustomUserOperationEventListener doPostAuthenticate STARTED");
        try {
            HashMap<String, String> userClaims = new HashMap<>();
            userClaims.put(NotificationConstants.LAST_LOGIN_TIME, Long.toString(System.currentTimeMillis()));
            userStoreManager.setUserClaimValues(userName, userClaims, null);
        } catch (UserStoreException e) {
            log.error("Error occurred while updating last login claim for user: ", e);
        }
        log.info("+++CustomUserOperationEventListener doPostAuthenticate DONE");
        return true;
    }
	
	@Override
	public int getExecutionOrderId() {
        log.info("+++CustomUserOperationEventListener getExecutionOrderId");
		return 1358;
	}
}
