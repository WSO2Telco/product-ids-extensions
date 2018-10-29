/*
 * An XML document type.
 * Localname: taskSimpleQueryResultSet
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskSimpleQueryResultSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * A document containing one taskSimpleQueryResultSet(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public class TaskSimpleQueryResultSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskSimpleQueryResultSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaskSimpleQueryResultSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TASKSIMPLEQUERYRESULTSET$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "taskSimpleQueryResultSet");
    
    
    /**
     * Gets the "taskSimpleQueryResultSet" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultSet getTaskSimpleQueryResultSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultSet target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultSet)get_store().find_element_user(TASKSIMPLEQUERYRESULTSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "taskSimpleQueryResultSet" element
     */
    public void setTaskSimpleQueryResultSet(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultSet taskSimpleQueryResultSet)
    {
        generatedSetterHelperImpl(taskSimpleQueryResultSet, TASKSIMPLEQUERYRESULTSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "taskSimpleQueryResultSet" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultSet addNewTaskSimpleQueryResultSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultSet target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultSet)get_store().add_element_user(TASKSIMPLEQUERYRESULTSET$0);
            return target;
        }
    }
}
