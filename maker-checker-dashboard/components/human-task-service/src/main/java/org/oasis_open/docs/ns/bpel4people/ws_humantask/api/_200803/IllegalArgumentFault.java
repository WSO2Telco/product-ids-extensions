/**
 * IllegalArgumentFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;

public class IllegalArgumentFault extends java.lang.Exception {
    private static final long serialVersionUID = 1539852315201L;
    private org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentDocument faultMessage;

    public IllegalArgumentFault() {
        super("IllegalArgumentFault");
    }

    public IllegalArgumentFault(java.lang.String s) {
        super(s);
    }

    public IllegalArgumentFault(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public IllegalArgumentFault(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentDocument msg) {
        faultMessage = msg;
    }

    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentDocument getFaultMessage() {
        return faultMessage;
    }
}
