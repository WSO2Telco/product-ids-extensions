/*
 * An XML document type.
 * Localname: taskDetails
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * A document containing one taskDetails(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public class TaskDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaskDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TASKDETAILS$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "taskDetails");
    
    
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
}
