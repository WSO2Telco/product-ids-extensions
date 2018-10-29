/*
 * An XML document type.
 * Localname: completeResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one completeResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class CompleteResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompleteResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLETERESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "completeResponse");
    
    
    /**
     * Gets the "completeResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteResponseDocument.CompleteResponse getCompleteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteResponseDocument.CompleteResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteResponseDocument.CompleteResponse)get_store().find_element_user(COMPLETERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "completeResponse" element
     */
    public void setCompleteResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteResponseDocument.CompleteResponse completeResponse)
    {
        generatedSetterHelperImpl(completeResponse, COMPLETERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "completeResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteResponseDocument.CompleteResponse addNewCompleteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteResponseDocument.CompleteResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteResponseDocument.CompleteResponse)get_store().add_element_user(COMPLETERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML completeResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class CompleteResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteResponseDocument.CompleteResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CompleteResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
