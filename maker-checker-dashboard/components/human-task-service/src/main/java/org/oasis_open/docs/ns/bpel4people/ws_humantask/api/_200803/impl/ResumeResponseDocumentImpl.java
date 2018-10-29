/*
 * An XML document type.
 * Localname: resumeResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ResumeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one resumeResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class ResumeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ResumeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResumeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESUMERESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "resumeResponse");
    
    
    /**
     * Gets the "resumeResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ResumeResponseDocument.ResumeResponse getResumeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ResumeResponseDocument.ResumeResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ResumeResponseDocument.ResumeResponse)get_store().find_element_user(RESUMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resumeResponse" element
     */
    public void setResumeResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ResumeResponseDocument.ResumeResponse resumeResponse)
    {
        generatedSetterHelperImpl(resumeResponse, RESUMERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resumeResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ResumeResponseDocument.ResumeResponse addNewResumeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ResumeResponseDocument.ResumeResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ResumeResponseDocument.ResumeResponse)get_store().add_element_user(RESUMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML resumeResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class ResumeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ResumeResponseDocument.ResumeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ResumeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
