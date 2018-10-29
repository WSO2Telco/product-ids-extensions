/*
 * An XML document type.
 * Localname: releaseResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ReleaseResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one releaseResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class ReleaseResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ReleaseResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReleaseResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELEASERESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "releaseResponse");
    
    
    /**
     * Gets the "releaseResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ReleaseResponseDocument.ReleaseResponse getReleaseResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ReleaseResponseDocument.ReleaseResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ReleaseResponseDocument.ReleaseResponse)get_store().find_element_user(RELEASERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "releaseResponse" element
     */
    public void setReleaseResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ReleaseResponseDocument.ReleaseResponse releaseResponse)
    {
        generatedSetterHelperImpl(releaseResponse, RELEASERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "releaseResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ReleaseResponseDocument.ReleaseResponse addNewReleaseResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ReleaseResponseDocument.ReleaseResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ReleaseResponseDocument.ReleaseResponse)get_store().add_element_user(RELEASERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML releaseResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class ReleaseResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ReleaseResponseDocument.ReleaseResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ReleaseResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
