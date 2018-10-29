/**
 * IllegalAccessFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;

public class IllegalAccessFault extends java.lang.Exception {
    private static final long serialVersionUID = 1539852315226L;
    private org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessDocument faultMessage;

    public IllegalAccessFault() {
        super("IllegalAccessFault");
    }

    public IllegalAccessFault(java.lang.String s) {
        super(s);
    }

    public IllegalAccessFault(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public IllegalAccessFault(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessDocument msg) {
        faultMessage = msg;
    }

    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessDocument getFaultMessage() {
        return faultMessage;
    }
}
