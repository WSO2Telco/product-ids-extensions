/*
 * An XML document type.
 * Localname: failResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one failResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class FailResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public FailResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAILRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "failResponse");
    
    
    /**
     * Gets the "failResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailResponseDocument.FailResponse getFailResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailResponseDocument.FailResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailResponseDocument.FailResponse)get_store().find_element_user(FAILRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "failResponse" element
     */
    public void setFailResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailResponseDocument.FailResponse failResponse)
    {
        generatedSetterHelperImpl(failResponse, FAILRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "failResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailResponseDocument.FailResponse addNewFailResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailResponseDocument.FailResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailResponseDocument.FailResponse)get_store().add_element_user(FAILRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML failResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class FailResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailResponseDocument.FailResponse
    {
        private static final long serialVersionUID = 1L;
        
        public FailResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
