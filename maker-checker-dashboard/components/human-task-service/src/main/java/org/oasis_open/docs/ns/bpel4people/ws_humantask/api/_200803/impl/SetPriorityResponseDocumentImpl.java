/*
 * An XML document type.
 * Localname: setPriorityResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetPriorityResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one setPriorityResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class SetPriorityResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetPriorityResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SetPriorityResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETPRIORITYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "setPriorityResponse");
    
    
    /**
     * Gets the "setPriorityResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetPriorityResponseDocument.SetPriorityResponse getSetPriorityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetPriorityResponseDocument.SetPriorityResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetPriorityResponseDocument.SetPriorityResponse)get_store().find_element_user(SETPRIORITYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "setPriorityResponse" element
     */
    public void setSetPriorityResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetPriorityResponseDocument.SetPriorityResponse setPriorityResponse)
    {
        generatedSetterHelperImpl(setPriorityResponse, SETPRIORITYRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "setPriorityResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetPriorityResponseDocument.SetPriorityResponse addNewSetPriorityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetPriorityResponseDocument.SetPriorityResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetPriorityResponseDocument.SetPriorityResponse)get_store().add_element_user(SETPRIORITYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML setPriorityResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class SetPriorityResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetPriorityResponseDocument.SetPriorityResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SetPriorityResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
