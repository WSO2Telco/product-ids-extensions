/*
 * An XML document type.
 * Localname: skipResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SkipResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one skipResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class SkipResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SkipResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SkipResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SKIPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "skipResponse");
    
    
    /**
     * Gets the "skipResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SkipResponseDocument.SkipResponse getSkipResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SkipResponseDocument.SkipResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SkipResponseDocument.SkipResponse)get_store().find_element_user(SKIPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "skipResponse" element
     */
    public void setSkipResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SkipResponseDocument.SkipResponse skipResponse)
    {
        generatedSetterHelperImpl(skipResponse, SKIPRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "skipResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SkipResponseDocument.SkipResponse addNewSkipResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SkipResponseDocument.SkipResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SkipResponseDocument.SkipResponse)get_store().add_element_user(SKIPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML skipResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class SkipResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SkipResponseDocument.SkipResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SkipResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
