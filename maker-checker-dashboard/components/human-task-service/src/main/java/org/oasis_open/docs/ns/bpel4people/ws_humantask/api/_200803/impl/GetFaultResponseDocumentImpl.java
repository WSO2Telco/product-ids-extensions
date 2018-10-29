/*
 * An XML document type.
 * Localname: getFaultResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getFaultResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetFaultResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetFaultResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETFAULTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getFaultResponse");
    
    
    /**
     * Gets the "getFaultResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultResponseDocument.GetFaultResponse getGetFaultResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultResponseDocument.GetFaultResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultResponseDocument.GetFaultResponse)get_store().find_element_user(GETFAULTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getFaultResponse" element
     */
    public void setGetFaultResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultResponseDocument.GetFaultResponse getFaultResponse)
    {
        generatedSetterHelperImpl(getFaultResponse, GETFAULTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getFaultResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultResponseDocument.GetFaultResponse addNewGetFaultResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultResponseDocument.GetFaultResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultResponseDocument.GetFaultResponse)get_store().add_element_user(GETFAULTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getFaultResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetFaultResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultResponseDocument.GetFaultResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetFaultResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FAULT$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "fault");
        
        
        /**
         * Gets the "fault" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault getFault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault)get_store().find_element_user(FAULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "fault" element
         */
        public void setFault(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault fault)
        {
            generatedSetterHelperImpl(fault, FAULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fault" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault addNewFault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault)get_store().add_element_user(FAULT$0);
                return target;
            }
        }
    }
}
