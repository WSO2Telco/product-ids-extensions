/*
 * An XML document type.
 * Localname: getOutcomeResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutcomeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getOutcomeResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetOutcomeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutcomeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetOutcomeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETOUTCOMERESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getOutcomeResponse");
    
    
    /**
     * Gets the "getOutcomeResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutcomeResponseDocument.GetOutcomeResponse getGetOutcomeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutcomeResponseDocument.GetOutcomeResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutcomeResponseDocument.GetOutcomeResponse)get_store().find_element_user(GETOUTCOMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getOutcomeResponse" element
     */
    public void setGetOutcomeResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutcomeResponseDocument.GetOutcomeResponse getOutcomeResponse)
    {
        generatedSetterHelperImpl(getOutcomeResponse, GETOUTCOMERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getOutcomeResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutcomeResponseDocument.GetOutcomeResponse addNewGetOutcomeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutcomeResponseDocument.GetOutcomeResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutcomeResponseDocument.GetOutcomeResponse)get_store().add_element_user(GETOUTCOMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getOutcomeResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetOutcomeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutcomeResponseDocument.GetOutcomeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetOutcomeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUTCOME$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "outcome");
        
        
        /**
         * Gets the "outcome" element
         */
        public java.lang.String getOutcome()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTCOME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "outcome" element
         */
        public org.apache.xmlbeans.XmlString xgetOutcome()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTCOME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "outcome" element
         */
        public void setOutcome(java.lang.String outcome)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTCOME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTCOME$0);
                }
                target.setStringValue(outcome);
            }
        }
        
        /**
         * Sets (as xml) the "outcome" element
         */
        public void xsetOutcome(org.apache.xmlbeans.XmlString outcome)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTCOME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OUTCOME$0);
                }
                target.set(outcome);
            }
        }
    }
}
