/*
 * An XML document type.
 * Localname: instantiateSubtaskResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one instantiateSubtaskResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class InstantiateSubtaskResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public InstantiateSubtaskResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTANTIATESUBTASKRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "instantiateSubtaskResponse");
    
    
    /**
     * Gets the "instantiateSubtaskResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskResponseDocument.InstantiateSubtaskResponse getInstantiateSubtaskResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskResponseDocument.InstantiateSubtaskResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskResponseDocument.InstantiateSubtaskResponse)get_store().find_element_user(INSTANTIATESUBTASKRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "instantiateSubtaskResponse" element
     */
    public void setInstantiateSubtaskResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskResponseDocument.InstantiateSubtaskResponse instantiateSubtaskResponse)
    {
        generatedSetterHelperImpl(instantiateSubtaskResponse, INSTANTIATESUBTASKRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "instantiateSubtaskResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskResponseDocument.InstantiateSubtaskResponse addNewInstantiateSubtaskResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskResponseDocument.InstantiateSubtaskResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskResponseDocument.InstantiateSubtaskResponse)get_store().add_element_user(INSTANTIATESUBTASKRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML instantiateSubtaskResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class InstantiateSubtaskResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskResponseDocument.InstantiateSubtaskResponse
    {
        private static final long serialVersionUID = 1L;
        
        public InstantiateSubtaskResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBTASKIDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "subtaskIdentifier");
        
        
        /**
         * Gets the "subtaskIdentifier" element
         */
        public java.lang.String getSubtaskIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBTASKIDENTIFIER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "subtaskIdentifier" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetSubtaskIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SUBTASKIDENTIFIER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "subtaskIdentifier" element
         */
        public void setSubtaskIdentifier(java.lang.String subtaskIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBTASKIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBTASKIDENTIFIER$0);
                }
                target.setStringValue(subtaskIdentifier);
            }
        }
        
        /**
         * Sets (as xml) the "subtaskIdentifier" element
         */
        public void xsetSubtaskIdentifier(org.apache.xmlbeans.XmlAnyURI subtaskIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SUBTASKIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(SUBTASKIDENTIFIER$0);
                }
                target.set(subtaskIdentifier);
            }
        }
    }
}
