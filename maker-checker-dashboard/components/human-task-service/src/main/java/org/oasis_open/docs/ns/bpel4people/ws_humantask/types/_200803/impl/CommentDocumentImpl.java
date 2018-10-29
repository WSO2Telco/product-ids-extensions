/*
 * An XML document type.
 * Localname: comment
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.CommentDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * A document containing one comment(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public class CommentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.CommentDocument
{
    private static final long serialVersionUID = 1L;
    
    public CommentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMENT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "comment");
    
    
    /**
     * Gets the "comment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment getComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment)get_store().find_element_user(COMMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "comment" element
     */
    public void setComment(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment comment)
    {
        generatedSetterHelperImpl(comment, COMMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "comment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment addNewComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment)get_store().add_element_user(COMMENT$0);
            return target;
        }
    }
}
