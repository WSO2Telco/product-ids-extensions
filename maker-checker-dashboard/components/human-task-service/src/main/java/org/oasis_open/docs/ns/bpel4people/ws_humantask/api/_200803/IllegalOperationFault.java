/**
 * IllegalOperationFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;

public class IllegalOperationFault extends java.lang.Exception {
    private static final long serialVersionUID = 1539852315207L;
    private org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationDocument faultMessage;

    public IllegalOperationFault() {
        super("IllegalOperationFault");
    }

    public IllegalOperationFault(java.lang.String s) {
        super(s);
    }

    public IllegalOperationFault(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public IllegalOperationFault(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationDocument msg) {
        faultMessage = msg;
    }

    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationDocument getFaultMessage() {
        return faultMessage;
    }
}
