/*
 * An XML document type.
 * Localname: nominateResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.NominateResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one nominateResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class NominateResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.NominateResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public NominateResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOMINATERESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "nominateResponse");
    
    
    /**
     * Gets the "nominateResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.NominateResponseDocument.NominateResponse getNominateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.NominateResponseDocument.NominateResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.NominateResponseDocument.NominateResponse)get_store().find_element_user(NOMINATERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "nominateResponse" element
     */
    public void setNominateResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.NominateResponseDocument.NominateResponse nominateResponse)
    {
        generatedSetterHelperImpl(nominateResponse, NOMINATERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "nominateResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.NominateResponseDocument.NominateResponse addNewNominateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.NominateResponseDocument.NominateResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.NominateResponseDocument.NominateResponse)get_store().add_element_user(NOMINATERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML nominateResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class NominateResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.NominateResponseDocument.NominateResponse
    {
        private static final long serialVersionUID = 1L;
        
        public NominateResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
