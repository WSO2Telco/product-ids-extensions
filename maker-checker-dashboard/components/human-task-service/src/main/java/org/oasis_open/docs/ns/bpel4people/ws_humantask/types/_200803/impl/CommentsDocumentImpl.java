/*
 * An XML document type.
 * Localname: comments
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.CommentsDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * A document containing one comments(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public class CommentsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.CommentsDocument
{
    private static final long serialVersionUID = 1L;
    
    public CommentsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMENTS$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "comments");
    
    
    /**
     * Gets the "comments" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComments getComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComments target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComments)get_store().find_element_user(COMMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "comments" element
     */
    public void setComments(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComments comments)
    {
        generatedSetterHelperImpl(comments, COMMENTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "comments" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComments addNewComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComments target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComments)get_store().add_element_user(COMMENTS$0);
            return target;
        }
    }
}
