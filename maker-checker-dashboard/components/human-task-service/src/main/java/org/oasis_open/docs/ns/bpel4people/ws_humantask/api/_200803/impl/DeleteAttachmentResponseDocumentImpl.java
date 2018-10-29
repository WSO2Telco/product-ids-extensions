/*
 * An XML document type.
 * Localname: deleteAttachmentResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteAttachmentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one deleteAttachmentResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class DeleteAttachmentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteAttachmentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeleteAttachmentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEATTACHMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "deleteAttachmentResponse");
    
    
    /**
     * Gets the "deleteAttachmentResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteAttachmentResponseDocument.DeleteAttachmentResponse getDeleteAttachmentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteAttachmentResponseDocument.DeleteAttachmentResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteAttachmentResponseDocument.DeleteAttachmentResponse)get_store().find_element_user(DELETEATTACHMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "deleteAttachmentResponse" element
     */
    public void setDeleteAttachmentResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteAttachmentResponseDocument.DeleteAttachmentResponse deleteAttachmentResponse)
    {
        generatedSetterHelperImpl(deleteAttachmentResponse, DELETEATTACHMENTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "deleteAttachmentResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteAttachmentResponseDocument.DeleteAttachmentResponse addNewDeleteAttachmentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteAttachmentResponseDocument.DeleteAttachmentResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteAttachmentResponseDocument.DeleteAttachmentResponse)get_store().add_element_user(DELETEATTACHMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML deleteAttachmentResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class DeleteAttachmentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteAttachmentResponseDocument.DeleteAttachmentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public DeleteAttachmentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
