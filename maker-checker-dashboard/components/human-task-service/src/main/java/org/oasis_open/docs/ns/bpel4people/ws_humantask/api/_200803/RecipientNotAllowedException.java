/**
 * RecipientNotAllowedException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;

public class RecipientNotAllowedException extends java.lang.Exception {
    private static final long serialVersionUID = 1539852315220L;
    private org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.RecipientNotAllowedDocument faultMessage;

    public RecipientNotAllowedException() {
        super("RecipientNotAllowedException");
    }

    public RecipientNotAllowedException(java.lang.String s) {
        super(s);
    }

    public RecipientNotAllowedException(java.lang.String s,
        java.lang.Throwable ex) {
        super(s, ex);
    }

    public RecipientNotAllowedException(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.RecipientNotAllowedDocument msg) {
        faultMessage = msg;
    }

    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.RecipientNotAllowedDocument getFaultMessage() {
        return faultMessage;
    }
}
