package com.wso2telco.mbss.password.history.manager.store;

import com.wso2telco.mbss.password.history.manager.exeption.IdentityPasswordHistoryException;
import org.wso2.carbon.identity.application.common.model.User;

/**
 * This interface provides to plug module for preferred persistence store.
 */
public interface PasswordHistoryDataStore {


    /**
     * Stores data
     *
     * @param credential,user
     */
    void store(User user, Object credential) throws IdentityPasswordHistoryException;

    /**
     * Removes
     *
     * @param user
     */
    void remove(User user) throws IdentityPasswordHistoryException;

    /**
     * validate
     *
     * @param user,credential
     *
     */
    boolean validate(User user, Object credential) throws IdentityPasswordHistoryException;
}
