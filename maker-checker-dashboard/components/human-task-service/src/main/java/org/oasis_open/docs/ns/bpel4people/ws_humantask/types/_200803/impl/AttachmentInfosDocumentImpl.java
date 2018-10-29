/*
 * An XML document type.
 * Localname: attachmentInfos
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.AttachmentInfosDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * A document containing one attachmentInfos(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public class AttachmentInfosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.AttachmentInfosDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentInfosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTINFOS$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "attachmentInfos");
    
    
    /**
     * Gets the "attachmentInfos" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfos getAttachmentInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfos target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfos)get_store().find_element_user(ATTACHMENTINFOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "attachmentInfos" element
     */
    public void setAttachmentInfos(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfos attachmentInfos)
    {
        generatedSetterHelperImpl(attachmentInfos, ATTACHMENTINFOS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "attachmentInfos" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfos addNewAttachmentInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfos target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfos)get_store().add_element_user(ATTACHMENTINFOS$0);
            return target;
        }
    }
}
