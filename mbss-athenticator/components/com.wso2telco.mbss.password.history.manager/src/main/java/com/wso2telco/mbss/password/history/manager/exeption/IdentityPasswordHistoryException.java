package com.wso2telco.mbss.password.history.manager.exeption;

import org.wso2.carbon.identity.base.IdentityException;

/**
 * Used for creating checked exceptions that can be handled.
 */
public class IdentityPasswordHistoryException extends IdentityException {

    private static final long serialVersionUID = 1700318648018222420L;

    public IdentityPasswordHistoryException(String errorDescription) {
        super(errorDescription);
    }

    public IdentityPasswordHistoryException(String errorDescription, Throwable cause) {
        super(errorDescription, cause);
    }
}
