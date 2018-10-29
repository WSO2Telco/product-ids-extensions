/*
 * An XML document type.
 * Localname: attachment
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.AttachmentDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * A document containing one attachment(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public class AttachmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.AttachmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "attachment");
    
    
    /**
     * Gets the "attachment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment getAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment)get_store().find_element_user(ATTACHMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "attachment" element
     */
    public void setAttachment(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment attachment)
    {
        generatedSetterHelperImpl(attachment, ATTACHMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "attachment" element
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
}
