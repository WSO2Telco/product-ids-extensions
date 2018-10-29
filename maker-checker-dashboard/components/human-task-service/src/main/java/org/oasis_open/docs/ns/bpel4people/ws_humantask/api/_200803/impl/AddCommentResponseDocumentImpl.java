/*
 * An XML document type.
 * Localname: addCommentResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddCommentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one addCommentResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class AddCommentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddCommentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddCommentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDCOMMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "addCommentResponse");
    
    
    /**
     * Gets the "addCommentResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddCommentResponseDocument.AddCommentResponse getAddCommentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddCommentResponseDocument.AddCommentResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddCommentResponseDocument.AddCommentResponse)get_store().find_element_user(ADDCOMMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "addCommentResponse" element
     */
    public void setAddCommentResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddCommentResponseDocument.AddCommentResponse addCommentResponse)
    {
        generatedSetterHelperImpl(addCommentResponse, ADDCOMMENTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "addCommentResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddCommentResponseDocument.AddCommentResponse addNewAddCommentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddCommentResponseDocument.AddCommentResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddCommentResponseDocument.AddCommentResponse)get_store().add_element_user(ADDCOMMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML addCommentResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class AddCommentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddCommentResponseDocument.AddCommentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public AddCommentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COMMENTID$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "commentID");
        
        
        /**
         * Gets the "commentID" element
         */
        public java.lang.String getCommentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "commentID" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetCommentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(COMMENTID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "commentID" element
         */
        public void setCommentID(java.lang.String commentID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENTID$0);
                }
                target.setStringValue(commentID);
            }
        }
        
        /**
         * Sets (as xml) the "commentID" element
         */
        public void xsetCommentID(org.apache.xmlbeans.XmlAnyURI commentID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(COMMENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(COMMENTID$0);
                }
                target.set(commentID);
            }
        }
    }
}
