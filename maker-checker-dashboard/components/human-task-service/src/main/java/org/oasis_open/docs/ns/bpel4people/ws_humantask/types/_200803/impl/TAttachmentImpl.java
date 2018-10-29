/*
 * XML Type:  tAttachment
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * An XML tAttachment(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public class TAttachmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment
{
    private static final long serialVersionUID = 1L;
    
    public TAttachmentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTINFO$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "attachmentInfo");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "value");
    
    
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
    
    /**
     * Gets the "value" element
     */
    public org.apache.xmlbeans.XmlObject getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(org.apache.xmlbeans.XmlObject value)
    {
        generatedSetterHelperImpl(value, VALUE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "value" element
     */
    public org.apache.xmlbeans.XmlObject addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(VALUE$2);
            return target;
        }
    }
}
