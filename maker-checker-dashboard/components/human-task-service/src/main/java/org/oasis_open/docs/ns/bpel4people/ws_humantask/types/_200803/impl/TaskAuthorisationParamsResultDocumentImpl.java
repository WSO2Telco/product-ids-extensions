/*
 * An XML document type.
 * Localname: taskAuthorisationParamsResult
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskAuthorisationParamsResultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * A document containing one taskAuthorisationParamsResult(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public class TaskAuthorisationParamsResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskAuthorisationParamsResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaskAuthorisationParamsResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TASKAUTHORISATIONPARAMSRESULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "taskAuthorisationParamsResult");
    
    
    /**
     * Gets the "taskAuthorisationParamsResult" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAuthorisationParams getTaskAuthorisationParamsResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAuthorisationParams target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAuthorisationParams)get_store().find_element_user(TASKAUTHORISATIONPARAMSRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "taskAuthorisationParamsResult" element
     */
    public void setTaskAuthorisationParamsResult(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAuthorisationParams taskAuthorisationParamsResult)
    {
        generatedSetterHelperImpl(taskAuthorisationParamsResult, TASKAUTHORISATIONPARAMSRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "taskAuthorisationParamsResult" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAuthorisationParams addNewTaskAuthorisationParamsResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAuthorisationParams target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAuthorisationParams)get_store().add_element_user(TASKAUTHORISATIONPARAMSRESULT$0);
            return target;
        }
    }
}
