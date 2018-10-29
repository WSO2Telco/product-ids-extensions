/*
 * An XML document type.
 * Localname: forwardResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one forwardResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class ForwardResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ForwardResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORWARDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "forwardResponse");
    
    
    /**
     * Gets the "forwardResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardResponseDocument.ForwardResponse getForwardResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardResponseDocument.ForwardResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardResponseDocument.ForwardResponse)get_store().find_element_user(FORWARDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "forwardResponse" element
     */
    public void setForwardResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardResponseDocument.ForwardResponse forwardResponse)
    {
        generatedSetterHelperImpl(forwardResponse, FORWARDRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "forwardResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardResponseDocument.ForwardResponse addNewForwardResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardResponseDocument.ForwardResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardResponseDocument.ForwardResponse)get_store().add_element_user(FORWARDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML forwardResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class ForwardResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardResponseDocument.ForwardResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ForwardResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
