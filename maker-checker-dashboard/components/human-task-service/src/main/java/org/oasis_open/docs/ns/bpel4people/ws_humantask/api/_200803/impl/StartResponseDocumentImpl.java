/*
 * An XML document type.
 * Localname: startResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StartResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one startResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class StartResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StartResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public StartResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "startResponse");
    
    
    /**
     * Gets the "startResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StartResponseDocument.StartResponse getStartResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StartResponseDocument.StartResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StartResponseDocument.StartResponse)get_store().find_element_user(STARTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "startResponse" element
     */
    public void setStartResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StartResponseDocument.StartResponse startResponse)
    {
        generatedSetterHelperImpl(startResponse, STARTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "startResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StartResponseDocument.StartResponse addNewStartResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StartResponseDocument.StartResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StartResponseDocument.StartResponse)get_store().add_element_user(STARTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML startResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class StartResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StartResponseDocument.StartResponse
    {
        private static final long serialVersionUID = 1L;
        
        public StartResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
