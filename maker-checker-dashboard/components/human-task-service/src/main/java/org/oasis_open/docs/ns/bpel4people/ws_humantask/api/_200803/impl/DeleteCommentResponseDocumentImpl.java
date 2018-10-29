/*
 * An XML document type.
 * Localname: deleteCommentResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteCommentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one deleteCommentResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class DeleteCommentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteCommentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeleteCommentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETECOMMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "deleteCommentResponse");
    
    
    /**
     * Gets the "deleteCommentResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteCommentResponseDocument.DeleteCommentResponse getDeleteCommentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteCommentResponseDocument.DeleteCommentResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteCommentResponseDocument.DeleteCommentResponse)get_store().find_element_user(DELETECOMMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "deleteCommentResponse" element
     */
    public void setDeleteCommentResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteCommentResponseDocument.DeleteCommentResponse deleteCommentResponse)
    {
        generatedSetterHelperImpl(deleteCommentResponse, DELETECOMMENTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "deleteCommentResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteCommentResponseDocument.DeleteCommentResponse addNewDeleteCommentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteCommentResponseDocument.DeleteCommentResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteCommentResponseDocument.DeleteCommentResponse)get_store().add_element_user(DELETECOMMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML deleteCommentResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class DeleteCommentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteCommentResponseDocument.DeleteCommentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public DeleteCommentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
