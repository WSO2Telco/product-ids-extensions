/*
 * An XML document type.
 * Localname: taskQueryResultSet
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskQueryResultSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * A document containing one taskQueryResultSet(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public class TaskQueryResultSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskQueryResultSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaskQueryResultSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TASKQUERYRESULTSET$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "taskQueryResultSet");
    
    
    /**
     * Gets the "taskQueryResultSet" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultSet getTaskQueryResultSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultSet target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultSet)get_store().find_element_user(TASKQUERYRESULTSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "taskQueryResultSet" element
     */
    public void setTaskQueryResultSet(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultSet taskQueryResultSet)
    {
        generatedSetterHelperImpl(taskQueryResultSet, TASKQUERYRESULTSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "taskQueryResultSet" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultSet addNewTaskQueryResultSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultSet target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultSet)get_store().add_element_user(TASKQUERYRESULTSET$0);
            return target;
        }
    }
}
