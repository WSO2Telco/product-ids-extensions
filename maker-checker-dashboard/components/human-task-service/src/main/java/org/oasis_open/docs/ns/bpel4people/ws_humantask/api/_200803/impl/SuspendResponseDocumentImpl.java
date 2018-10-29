/*
 * An XML document type.
 * Localname: suspendResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one suspendResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class SuspendResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SuspendResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUSPENDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "suspendResponse");
    
    
    /**
     * Gets the "suspendResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendResponseDocument.SuspendResponse getSuspendResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendResponseDocument.SuspendResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendResponseDocument.SuspendResponse)get_store().find_element_user(SUSPENDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "suspendResponse" element
     */
    public void setSuspendResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendResponseDocument.SuspendResponse suspendResponse)
    {
        generatedSetterHelperImpl(suspendResponse, SUSPENDRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "suspendResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendResponseDocument.SuspendResponse addNewSuspendResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendResponseDocument.SuspendResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendResponseDocument.SuspendResponse)get_store().add_element_user(SUSPENDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML suspendResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class SuspendResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendResponseDocument.SuspendResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SuspendResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
