/*
 * An XML document type.
 * Localname: addAttachmentResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddAttachmentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one addAttachmentResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class AddAttachmentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddAttachmentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddAttachmentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDATTACHMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "addAttachmentResponse");
    
    
    /**
     * Gets the "addAttachmentResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddAttachmentResponseDocument.AddAttachmentResponse getAddAttachmentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddAttachmentResponseDocument.AddAttachmentResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddAttachmentResponseDocument.AddAttachmentResponse)get_store().find_element_user(ADDATTACHMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "addAttachmentResponse" element
     */
    public void setAddAttachmentResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddAttachmentResponseDocument.AddAttachmentResponse addAttachmentResponse)
    {
        generatedSetterHelperImpl(addAttachmentResponse, ADDATTACHMENTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "addAttachmentResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddAttachmentResponseDocument.AddAttachmentResponse addNewAddAttachmentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddAttachmentResponseDocument.AddAttachmentResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddAttachmentResponseDocument.AddAttachmentResponse)get_store().add_element_user(ADDATTACHMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML addAttachmentResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class AddAttachmentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddAttachmentResponseDocument.AddAttachmentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public AddAttachmentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ISASSOCIATED$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "isAssociated");
        
        
        /**
         * Gets the "isAssociated" element
         */
        public boolean getIsAssociated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISASSOCIATED$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "isAssociated" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISASSOCIATED$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "isAssociated" element
         */
        public void setIsAssociated(boolean isAssociated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISASSOCIATED$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISASSOCIATED$0);
                }
                target.setBooleanValue(isAssociated);
            }
        }
        
        /**
         * Sets (as xml) the "isAssociated" element
         */
        public void xsetIsAssociated(org.apache.xmlbeans.XmlBoolean isAssociated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISASSOCIATED$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISASSOCIATED$0);
                }
                target.set(isAssociated);
            }
        }
    }
}
