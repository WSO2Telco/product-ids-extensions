/*
 * An XML document type.
 * Localname: getTaskOperationsResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskOperationsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getTaskOperationsResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetTaskOperationsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskOperationsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTaskOperationsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTASKOPERATIONSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getTaskOperationsResponse");
    
    
    /**
     * Gets the "getTaskOperationsResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskOperationsResponseDocument.GetTaskOperationsResponse getGetTaskOperationsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskOperationsResponseDocument.GetTaskOperationsResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskOperationsResponseDocument.GetTaskOperationsResponse)get_store().find_element_user(GETTASKOPERATIONSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTaskOperationsResponse" element
     */
    public void setGetTaskOperationsResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskOperationsResponseDocument.GetTaskOperationsResponse getTaskOperationsResponse)
    {
        generatedSetterHelperImpl(getTaskOperationsResponse, GETTASKOPERATIONSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTaskOperationsResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskOperationsResponseDocument.GetTaskOperationsResponse addNewGetTaskOperationsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskOperationsResponseDocument.GetTaskOperationsResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskOperationsResponseDocument.GetTaskOperationsResponse)get_store().add_element_user(GETTASKOPERATIONSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getTaskOperationsResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetTaskOperationsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskOperationsResponseDocument.GetTaskOperationsResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetTaskOperationsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKOPERATIONS$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "taskOperations");
        
        
        /**
         * Gets the "taskOperations" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations getTaskOperations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations)get_store().find_element_user(TASKOPERATIONS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "taskOperations" element
         */
        public void setTaskOperations(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations taskOperations)
        {
            generatedSetterHelperImpl(taskOperations, TASKOPERATIONS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "taskOperations" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations addNewTaskOperations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations)get_store().add_element_user(TASKOPERATIONS$0);
                return target;
            }
        }
    }
}
