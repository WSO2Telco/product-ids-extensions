/*
 * XML Type:  tTaskInstanceData
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * An XML tTaskInstanceData(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public class TTaskInstanceDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData
{
    private static final long serialVersionUID = 1L;
    
    public TTaskInstanceDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TASKDETAILS$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "taskDetails");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "description");
    private static final javax.xml.namespace.QName INPUT$4 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "input");
    private static final javax.xml.namespace.QName OUTPUT$6 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "output");
    private static final javax.xml.namespace.QName FAULT$8 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "fault");
    private static final javax.xml.namespace.QName RENDERINGS$10 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "renderings");
    private static final javax.xml.namespace.QName COMMENTS$12 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "comments");
    private static final javax.xml.namespace.QName ATTACHMENTINFOS$14 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "attachmentInfos");
    
    
    /**
     * Gets the "taskDetails" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails getTaskDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails)get_store().find_element_user(TASKDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "taskDetails" element
     */
    public void setTaskDetails(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails taskDetails)
    {
        generatedSetterHelperImpl(taskDetails, TASKDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "taskDetails" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails addNewTaskDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails)get_store().add_element_user(TASKDETAILS$0);
            return target;
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "input" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData getInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData)get_store().find_element_user(INPUT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "input" element
     */
    public void setInput(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData input)
    {
        generatedSetterHelperImpl(input, INPUT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "input" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData addNewInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData)get_store().add_element_user(INPUT$4);
            return target;
        }
    }
    
    /**
     * Gets the "output" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData getOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData)get_store().find_element_user(OUTPUT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "output" element
     */
    public boolean isNilOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData)get_store().find_element_user(OUTPUT$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "output" element
     */
    public void setOutput(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData output)
    {
        generatedSetterHelperImpl(output, OUTPUT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "output" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData addNewOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData)get_store().add_element_user(OUTPUT$6);
            return target;
        }
    }
    
    /**
     * Nils the "output" element
     */
    public void setNilOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData)get_store().find_element_user(OUTPUT$6, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData)get_store().add_element_user(OUTPUT$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "fault" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFaultData getFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFaultData target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFaultData)get_store().find_element_user(FAULT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "fault" element
     */
    public boolean isNilFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFaultData target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFaultData)get_store().find_element_user(FAULT$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "fault" element
     */
    public boolean isSetFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAULT$8) != 0;
        }
    }
    
    /**
     * Sets the "fault" element
     */
    public void setFault(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFaultData fault)
    {
        generatedSetterHelperImpl(fault, FAULT$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fault" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFaultData addNewFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFaultData target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFaultData)get_store().add_element_user(FAULT$8);
            return target;
        }
    }
    
    /**
     * Nils the "fault" element
     */
    public void setNilFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFaultData target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFaultData)get_store().find_element_user(FAULT$8, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFaultData)get_store().add_element_user(FAULT$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "fault" element
     */
    public void unsetFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAULT$8, 0);
        }
    }
    
    /**
     * Gets the "renderings" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingsDocument.Renderings getRenderings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingsDocument.Renderings target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingsDocument.Renderings)get_store().find_element_user(RENDERINGS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "renderings" element
     */
    public boolean isSetRenderings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RENDERINGS$10) != 0;
        }
    }
    
    /**
     * Sets the "renderings" element
     */
    public void setRenderings(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingsDocument.Renderings renderings)
    {
        generatedSetterHelperImpl(renderings, RENDERINGS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "renderings" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingsDocument.Renderings addNewRenderings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingsDocument.Renderings target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingsDocument.Renderings)get_store().add_element_user(RENDERINGS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "renderings" element
     */
    public void unsetRenderings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RENDERINGS$10, 0);
        }
    }
    
    /**
     * Gets the "comments" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComments getComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComments target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComments)get_store().find_element_user(COMMENTS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "comments" element
     */
    public boolean isSetComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENTS$12) != 0;
        }
    }
    
    /**
     * Sets the "comments" element
     */
    public void setComments(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComments comments)
    {
        generatedSetterHelperImpl(comments, COMMENTS$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComments)get_store().add_element_user(COMMENTS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "comments" element
     */
    public void unsetComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENTS$12, 0);
        }
    }
    
    /**
     * Gets the "attachmentInfos" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfos getAttachmentInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfos target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfos)get_store().find_element_user(ATTACHMENTINFOS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "attachmentInfos" element
     */
    public boolean isSetAttachmentInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENTINFOS$14) != 0;
        }
    }
    
    /**
     * Sets the "attachmentInfos" element
     */
    public void setAttachmentInfos(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfos attachmentInfos)
    {
        generatedSetterHelperImpl(attachmentInfos, ATTACHMENTINFOS$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfos)get_store().add_element_user(ATTACHMENTINFOS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "attachmentInfos" element
     */
    public void unsetAttachmentInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENTINFOS$14, 0);
        }
    }
}
