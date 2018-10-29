/*
 * An XML document type.
 * Localname: removeResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.RemoveResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one removeResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class RemoveResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.RemoveResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public RemoveResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REMOVERESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "removeResponse");
    
    
    /**
     * Gets the "removeResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.RemoveResponseDocument.RemoveResponse getRemoveResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.RemoveResponseDocument.RemoveResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.RemoveResponseDocument.RemoveResponse)get_store().find_element_user(REMOVERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "removeResponse" element
     */
    public void setRemoveResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.RemoveResponseDocument.RemoveResponse removeResponse)
    {
        generatedSetterHelperImpl(removeResponse, REMOVERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "removeResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.RemoveResponseDocument.RemoveResponse addNewRemoveResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.RemoveResponseDocument.RemoveResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.RemoveResponseDocument.RemoveResponse)get_store().add_element_user(REMOVERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML removeResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class RemoveResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.RemoveResponseDocument.RemoveResponse
    {
        private static final long serialVersionUID = 1L;
        
        public RemoveResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
