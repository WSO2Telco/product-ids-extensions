/*
 * An XML document type.
 * Localname: taskEvents
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventsDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * A document containing one taskEvents(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public class TaskEventsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventsDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaskEventsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TASKEVENTS$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "taskEvents");
    
    
    /**
     * Gets the "taskEvents" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvents getTaskEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvents target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvents)get_store().find_element_user(TASKEVENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "taskEvents" element
     */
    public void setTaskEvents(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvents taskEvents)
    {
        generatedSetterHelperImpl(taskEvents, TASKEVENTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "taskEvents" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvents addNewTaskEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvents target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvents)get_store().add_element_user(TASKEVENTS$0);
            return target;
        }
    }
}
