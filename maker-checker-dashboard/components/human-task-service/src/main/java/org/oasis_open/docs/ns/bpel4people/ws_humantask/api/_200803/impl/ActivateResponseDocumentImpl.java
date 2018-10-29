/*
 * An XML document type.
 * Localname: activateResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ActivateResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one activateResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class ActivateResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ActivateResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ActivateResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVATERESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "activateResponse");
    
    
    /**
     * Gets the "activateResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ActivateResponseDocument.ActivateResponse getActivateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ActivateResponseDocument.ActivateResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ActivateResponseDocument.ActivateResponse)get_store().find_element_user(ACTIVATERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "activateResponse" element
     */
    public void setActivateResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ActivateResponseDocument.ActivateResponse activateResponse)
    {
        generatedSetterHelperImpl(activateResponse, ACTIVATERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "activateResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ActivateResponseDocument.ActivateResponse addNewActivateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ActivateResponseDocument.ActivateResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ActivateResponseDocument.ActivateResponse)get_store().add_element_user(ACTIVATERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML activateResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class ActivateResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ActivateResponseDocument.ActivateResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ActivateResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
