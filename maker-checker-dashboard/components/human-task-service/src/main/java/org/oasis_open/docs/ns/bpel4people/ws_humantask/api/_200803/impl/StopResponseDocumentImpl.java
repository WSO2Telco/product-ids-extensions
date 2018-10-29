/*
 * An XML document type.
 * Localname: stopResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StopResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one stopResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class StopResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StopResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public StopResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STOPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "stopResponse");
    
    
    /**
     * Gets the "stopResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StopResponseDocument.StopResponse getStopResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StopResponseDocument.StopResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StopResponseDocument.StopResponse)get_store().find_element_user(STOPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "stopResponse" element
     */
    public void setStopResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StopResponseDocument.StopResponse stopResponse)
    {
        generatedSetterHelperImpl(stopResponse, STOPRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "stopResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StopResponseDocument.StopResponse addNewStopResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StopResponseDocument.StopResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StopResponseDocument.StopResponse)get_store().add_element_user(STOPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML stopResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class StopResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StopResponseDocument.StopResponse
    {
        private static final long serialVersionUID = 1L;
        
        public StopResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
