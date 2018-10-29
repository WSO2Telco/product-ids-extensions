/*
 * An XML document type.
 * Localname: delegateResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DelegateResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one delegateResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class DelegateResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DelegateResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DelegateResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELEGATERESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "delegateResponse");
    
    
    /**
     * Gets the "delegateResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DelegateResponseDocument.DelegateResponse getDelegateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DelegateResponseDocument.DelegateResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DelegateResponseDocument.DelegateResponse)get_store().find_element_user(DELEGATERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "delegateResponse" element
     */
    public void setDelegateResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DelegateResponseDocument.DelegateResponse delegateResponse)
    {
        generatedSetterHelperImpl(delegateResponse, DELEGATERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "delegateResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DelegateResponseDocument.DelegateResponse addNewDelegateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DelegateResponseDocument.DelegateResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DelegateResponseDocument.DelegateResponse)get_store().add_element_user(DELEGATERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML delegateResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class DelegateResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DelegateResponseDocument.DelegateResponse
    {
        private static final long serialVersionUID = 1L;
        
        public DelegateResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
