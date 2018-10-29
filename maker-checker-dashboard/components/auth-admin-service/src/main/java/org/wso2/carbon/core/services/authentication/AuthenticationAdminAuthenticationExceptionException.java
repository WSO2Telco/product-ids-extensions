/**
 * AuthenticationAdminAuthenticationExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package org.wso2.carbon.core.services.authentication;

public class AuthenticationAdminAuthenticationExceptionException extends java.lang.Exception {
    private static final long serialVersionUID = 1539760435669L;
    private org.wso2.carbon.core.services.authentication.AuthenticationAdminAuthenticationException faultMessage;

    public AuthenticationAdminAuthenticationExceptionException() {
        super("AuthenticationAdminAuthenticationExceptionException");
    }

    public AuthenticationAdminAuthenticationExceptionException(
        java.lang.String s) {
        super(s);
    }

    public AuthenticationAdminAuthenticationExceptionException(
        java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public AuthenticationAdminAuthenticationExceptionException(
        java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        org.wso2.carbon.core.services.authentication.AuthenticationAdminAuthenticationException msg) {
        faultMessage = msg;
    }

    public org.wso2.carbon.core.services.authentication.AuthenticationAdminAuthenticationException getFaultMessage() {
        return faultMessage;
    }
}
