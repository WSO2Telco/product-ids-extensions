/**
 * AuthenticationAdmin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package org.wso2.carbon.core.services.authentication;


/*
 *  AuthenticationAdmin java interface
 */
public interface AuthenticationAdmin {
    /**
     * Auto generated method signature
     *
     * @param loginWithRememberMeOption0
     * @throws org.wso2.carbon.core.services.authentication.AuthenticationAdminAuthenticationExceptionException :
     */
    public org.wso2.carbon.core.services.authentication.LoginWithRememberMeOptionResponse loginWithRememberMeOption(
        org.wso2.carbon.core.services.authentication.LoginWithRememberMeOption loginWithRememberMeOption0)
        throws java.rmi.RemoteException,
            org.wso2.carbon.core.services.authentication.AuthenticationAdminAuthenticationExceptionException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param loginWithRememberMeOption0
     */
    public void startloginWithRememberMeOption(
        org.wso2.carbon.core.services.authentication.LoginWithRememberMeOption loginWithRememberMeOption0,
        final org.wso2.carbon.core.services.authentication.AuthenticationAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getPriority2
     */
    public org.wso2.carbon.core.services.authentication.GetPriorityResponse getPriority(
        org.wso2.carbon.core.services.authentication.GetPriority getPriority2)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getPriority2
     */
    public void startgetPriority(
        org.wso2.carbon.core.services.authentication.GetPriority getPriority2,
        final org.wso2.carbon.core.services.authentication.AuthenticationAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param isDisabled4
     */
    public org.wso2.carbon.core.services.authentication.IsDisabledResponse isDisabled(
        org.wso2.carbon.core.services.authentication.IsDisabled isDisabled4)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param isDisabled4
     */
    public void startisDisabled(
        org.wso2.carbon.core.services.authentication.IsDisabled isDisabled4,
        final org.wso2.carbon.core.services.authentication.AuthenticationAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param loginWithRememberMeCookie6
     */
    public org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookieResponse loginWithRememberMeCookie(
        org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookie loginWithRememberMeCookie6)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param loginWithRememberMeCookie6
     */
    public void startloginWithRememberMeCookie(
        org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookie loginWithRememberMeCookie6,
        final org.wso2.carbon.core.services.authentication.AuthenticationAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param login8
     * @throws org.wso2.carbon.core.services.authentication.AuthenticationAdminAuthenticationExceptionException :
     */
    public org.wso2.carbon.core.services.authentication.LoginResponse login(
        org.wso2.carbon.core.services.authentication.Login login8)
        throws java.rmi.RemoteException,
            org.wso2.carbon.core.services.authentication.AuthenticationAdminAuthenticationExceptionException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param login8
     */
    public void startlogin(
        org.wso2.carbon.core.services.authentication.Login login8,
        final org.wso2.carbon.core.services.authentication.AuthenticationAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param authenticateWithRememberMe10
     */
    public org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMeResponse authenticateWithRememberMe(
        org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMe authenticateWithRememberMe10)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param authenticateWithRememberMe10
     */
    public void startauthenticateWithRememberMe(
        org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMe authenticateWithRememberMe10,
        final org.wso2.carbon.core.services.authentication.AuthenticationAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @throws org.wso2.carbon.core.services.authentication.AuthenticationAdminAuthenticationExceptionException :
     */
    public void logout(
        org.wso2.carbon.core.services.authentication.Logout logout12)
        throws java.rmi.RemoteException,
            org.wso2.carbon.core.services.authentication.AuthenticationAdminAuthenticationExceptionException;

    /**
     * Auto generated method signature
     *
     * @param getAuthenticatorName13
     */
    public org.wso2.carbon.core.services.authentication.GetAuthenticatorNameResponse getAuthenticatorName(
        org.wso2.carbon.core.services.authentication.GetAuthenticatorName getAuthenticatorName13)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAuthenticatorName13
     */
    public void startgetAuthenticatorName(
        org.wso2.carbon.core.services.authentication.GetAuthenticatorName getAuthenticatorName13,
        final org.wso2.carbon.core.services.authentication.AuthenticationAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    //
}
