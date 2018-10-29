/*
 * An XML document type.
 * Localname: claimResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ClaimResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one claimResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class ClaimResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ClaimResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClaimResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLAIMRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "claimResponse");
    
    
    /**
     * Gets the "claimResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ClaimResponseDocument.ClaimResponse getClaimResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ClaimResponseDocument.ClaimResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ClaimResponseDocument.ClaimResponse)get_store().find_element_user(CLAIMRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "claimResponse" element
     */
    public void setClaimResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ClaimResponseDocument.ClaimResponse claimResponse)
    {
        generatedSetterHelperImpl(claimResponse, CLAIMRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "claimResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ClaimResponseDocument.ClaimResponse addNewClaimResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ClaimResponseDocument.ClaimResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ClaimResponseDocument.ClaimResponse)get_store().add_element_user(CLAIMRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML claimResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class ClaimResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ClaimResponseDocument.ClaimResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ClaimResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
