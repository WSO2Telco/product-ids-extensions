/*
 * An XML document type.
 * Localname: attachmentInfo
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.AttachmentInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * A document containing one attachmentInfo(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public class AttachmentInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.AttachmentInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTINFO$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "attachmentInfo");
    
    
    /**
     * Gets the "attachmentInfo" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfo getAttachmentInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfo target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfo)get_store().find_element_user(ATTACHMENTINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "attachmentInfo" element
     */
    public void setAttachmentInfo(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfo attachmentInfo)
    {
        generatedSetterHelperImpl(attachmentInfo, ATTACHMENTINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "attachmentInfo" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfo addNewAttachmentInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfo target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfo)get_store().add_element_user(ATTACHMENTINFO$0);
            return target;
        }
    }
}
