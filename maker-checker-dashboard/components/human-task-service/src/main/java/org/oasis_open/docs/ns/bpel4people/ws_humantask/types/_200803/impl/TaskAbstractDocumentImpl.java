/*
 * An XML document type.
 * Localname: taskAbstract
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * A document containing one taskAbstract(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public class TaskAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaskAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TASKABSTRACT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "taskAbstract");
    
    
    /**
     * Gets the "taskAbstract" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract getTaskAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract)get_store().find_element_user(TASKABSTRACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "taskAbstract" element
     */
    public void setTaskAbstract(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract taskAbstract)
    {
        generatedSetterHelperImpl(taskAbstract, TASKABSTRACT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "taskAbstract" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract addNewTaskAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract)get_store().add_element_user(TASKABSTRACT$0);
            return target;
        }
    }
}
