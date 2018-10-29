/*
 * An XML document type.
 * Localname: updateCommentResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.UpdateCommentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one updateCommentResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class UpdateCommentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.UpdateCommentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateCommentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECOMMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "updateCommentResponse");
    
    
    /**
     * Gets the "updateCommentResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.UpdateCommentResponseDocument.UpdateCommentResponse getUpdateCommentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.UpdateCommentResponseDocument.UpdateCommentResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.UpdateCommentResponseDocument.UpdateCommentResponse)get_store().find_element_user(UPDATECOMMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "updateCommentResponse" element
     */
    public void setUpdateCommentResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.UpdateCommentResponseDocument.UpdateCommentResponse updateCommentResponse)
    {
        generatedSetterHelperImpl(updateCommentResponse, UPDATECOMMENTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "updateCommentResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.UpdateCommentResponseDocument.UpdateCommentResponse addNewUpdateCommentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.UpdateCommentResponseDocument.UpdateCommentResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.UpdateCommentResponseDocument.UpdateCommentResponse)get_store().add_element_user(UPDATECOMMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML updateCommentResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class UpdateCommentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.UpdateCommentResponseDocument.UpdateCommentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateCommentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
