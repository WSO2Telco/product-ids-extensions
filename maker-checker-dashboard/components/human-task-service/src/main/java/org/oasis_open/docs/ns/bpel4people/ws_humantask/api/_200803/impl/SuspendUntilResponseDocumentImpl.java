/*
 * An XML document type.
 * Localname: suspendUntilResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one suspendUntilResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class SuspendUntilResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SuspendUntilResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUSPENDUNTILRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "suspendUntilResponse");
    
    
    /**
     * Gets the "suspendUntilResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilResponseDocument.SuspendUntilResponse getSuspendUntilResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilResponseDocument.SuspendUntilResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilResponseDocument.SuspendUntilResponse)get_store().find_element_user(SUSPENDUNTILRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "suspendUntilResponse" element
     */
    public void setSuspendUntilResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilResponseDocument.SuspendUntilResponse suspendUntilResponse)
    {
        generatedSetterHelperImpl(suspendUntilResponse, SUSPENDUNTILRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "suspendUntilResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilResponseDocument.SuspendUntilResponse addNewSuspendUntilResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilResponseDocument.SuspendUntilResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilResponseDocument.SuspendUntilResponse)get_store().add_element_user(SUSPENDUNTILRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML suspendUntilResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class SuspendUntilResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilResponseDocument.SuspendUntilResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SuspendUntilResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
