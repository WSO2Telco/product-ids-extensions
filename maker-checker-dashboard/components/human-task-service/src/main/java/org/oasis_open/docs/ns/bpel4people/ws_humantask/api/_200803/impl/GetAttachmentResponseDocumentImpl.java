/*
 * An XML document type.
 * Localname: getAttachmentResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getAttachmentResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetAttachmentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAttachmentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETATTACHMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getAttachmentResponse");
    
    
    /**
     * Gets the "getAttachmentResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentResponseDocument.GetAttachmentResponse getGetAttachmentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentResponseDocument.GetAttachmentResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentResponseDocument.GetAttachmentResponse)get_store().find_element_user(GETATTACHMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getAttachmentResponse" element
     */
    public void setGetAttachmentResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentResponseDocument.GetAttachmentResponse getAttachmentResponse)
    {
        generatedSetterHelperImpl(getAttachmentResponse, GETATTACHMENTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getAttachmentResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentResponseDocument.GetAttachmentResponse addNewGetAttachmentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentResponseDocument.GetAttachmentResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentResponseDocument.GetAttachmentResponse)get_store().add_element_user(GETATTACHMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getAttachmentResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetAttachmentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentResponseDocument.GetAttachmentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetAttachmentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ATTACHMENT$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "attachment");
        
        
        /**
         * Gets array of all "attachment" elements
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment[] getAttachmentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ATTACHMENT$0, targetList);
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "attachment" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment getAttachmentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment)get_store().find_element_user(ATTACHMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "attachment" element
         */
        public int sizeOfAttachmentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ATTACHMENT$0);
            }
        }
        
        /**
         * Sets array of all "attachment" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAttachmentArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment[] attachmentArray)
        {
            check_orphaned();
            arraySetterHelper(attachmentArray, ATTACHMENT$0);
        }
        
        /**
         * Sets ith "attachment" element
         */
        public void setAttachmentArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment attachment)
        {
            generatedSetterHelperImpl(attachment, ATTACHMENT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "attachment" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment insertNewAttachment(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment)get_store().insert_element_user(ATTACHMENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "attachment" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment addNewAttachment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment)get_store().add_element_user(ATTACHMENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "attachment" element
         */
        public void removeAttachment(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ATTACHMENT$0, i);
            }
        }
    }
}
