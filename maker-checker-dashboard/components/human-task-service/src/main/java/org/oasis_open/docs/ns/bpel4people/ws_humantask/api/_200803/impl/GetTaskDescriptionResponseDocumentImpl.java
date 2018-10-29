/*
 * An XML document type.
 * Localname: getTaskDescriptionResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskDescriptionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getTaskDescriptionResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetTaskDescriptionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskDescriptionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTaskDescriptionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTASKDESCRIPTIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getTaskDescriptionResponse");
    
    
    /**
     * Gets the "getTaskDescriptionResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskDescriptionResponseDocument.GetTaskDescriptionResponse getGetTaskDescriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskDescriptionResponseDocument.GetTaskDescriptionResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskDescriptionResponseDocument.GetTaskDescriptionResponse)get_store().find_element_user(GETTASKDESCRIPTIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTaskDescriptionResponse" element
     */
    public void setGetTaskDescriptionResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskDescriptionResponseDocument.GetTaskDescriptionResponse getTaskDescriptionResponse)
    {
        generatedSetterHelperImpl(getTaskDescriptionResponse, GETTASKDESCRIPTIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTaskDescriptionResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskDescriptionResponseDocument.GetTaskDescriptionResponse addNewGetTaskDescriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskDescriptionResponseDocument.GetTaskDescriptionResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskDescriptionResponseDocument.GetTaskDescriptionResponse)get_store().add_element_user(GETTASKDESCRIPTIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getTaskDescriptionResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetTaskDescriptionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskDescriptionResponseDocument.GetTaskDescriptionResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetTaskDescriptionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTION$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "description");
        
        
        /**
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$0);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$0);
                }
                target.set(description);
            }
        }
    }
}
