package org.wso2.carbon.identity.account.suspension.notification.task;

import org.wso2.carbon.user.core.common.AbstractUserOperationEventListener;
import org.wso2.carbon.user.core.UserStoreManager;
import org.wso2.carbon.user.core.UserStoreException;

import java.util.*;

import org.wso2.carbon.identity.account.suspension.notification.task.handler.AccountSuspensionNotificationHandler;
import org.wso2.carbon.identity.account.suspension.notification.task.util.NotificationConstants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CustomUserOperationEventListener extends AbstractUserOperationEventListener {

    private static final Log log = LogFactory.getLog(CustomUserOperationEventListener.class);
    
	@Override
    public boolean doPostAuthenticate(String userName, boolean authenticated,
                                      UserStoreManager userStoreManager) throws UserStoreException {
        try {
        	if (authenticated) {
                HashMap<String, String> userClaims = new HashMap<>();
                userClaims.put(NotificationConstants.LAST_LOGIN_TIME, Long.toString(System.currentTimeMillis()));
                userStoreManager.setUserClaimValues(userName, userClaims, null);
        	} else {
        		//Authentication not successful
        	}
        } catch (UserStoreException e) {
            log.error("Error occurred while updating last login claim for user: ", e);
        }
        log.info("+++CustomUserOperationEventListener doPostAuthenticate");
        return true;
    }
	
	@Override
	public int getExecutionOrderId() {
        log.info("+++CustomUserOperationEventListener getExecutionOrderId");
		return 1356;
	}
	
    @Override
    public boolean doPostAddUser(String userName, Object credential, String[] roleList,
                                 Map<String, String> claims, String profile,
                                 UserStoreManager userStoreManager)
            throws UserStoreException {
        HashMap<String, String> userClaims = new HashMap<>();
        userClaims.put(NotificationConstants.LAST_LOGIN_TIME, Long.toString(System.currentTimeMillis()));
        userClaims.put(NotificationConstants.ACCOUNT_SUSPENDED_CLAIM, Boolean.FALSE.toString());
        userStoreManager.setUserClaimValues(userName, userClaims, null);
        log.info("+++CustomUserOperationEventListener doPostAddUser");
        return true;
    }
}
