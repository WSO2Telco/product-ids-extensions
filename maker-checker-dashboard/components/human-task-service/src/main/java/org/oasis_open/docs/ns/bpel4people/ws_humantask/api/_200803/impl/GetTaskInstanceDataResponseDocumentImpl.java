/*
 * An XML document type.
 * Localname: getTaskInstanceDataResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getTaskInstanceDataResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetTaskInstanceDataResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTaskInstanceDataResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTASKINSTANCEDATARESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getTaskInstanceDataResponse");
    
    
    /**
     * Gets the "getTaskInstanceDataResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataResponseDocument.GetTaskInstanceDataResponse getGetTaskInstanceDataResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataResponseDocument.GetTaskInstanceDataResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataResponseDocument.GetTaskInstanceDataResponse)get_store().find_element_user(GETTASKINSTANCEDATARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTaskInstanceDataResponse" element
     */
    public void setGetTaskInstanceDataResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataResponseDocument.GetTaskInstanceDataResponse getTaskInstanceDataResponse)
    {
        generatedSetterHelperImpl(getTaskInstanceDataResponse, GETTASKINSTANCEDATARESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTaskInstanceDataResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataResponseDocument.GetTaskInstanceDataResponse addNewGetTaskInstanceDataResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataResponseDocument.GetTaskInstanceDataResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataResponseDocument.GetTaskInstanceDataResponse)get_store().add_element_user(GETTASKINSTANCEDATARESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getTaskInstanceDataResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetTaskInstanceDataResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataResponseDocument.GetTaskInstanceDataResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetTaskInstanceDataResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKINSTANCEDATA$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "taskInstanceData");
        
        
        /**
         * Gets the "taskInstanceData" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData getTaskInstanceData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData)get_store().find_element_user(TASKINSTANCEDATA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "taskInstanceData" element
         */
        public void setTaskInstanceData(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData taskInstanceData)
        {
            generatedSetterHelperImpl(taskInstanceData, TASKINSTANCEDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "taskInstanceData" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData addNewTaskInstanceData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData)get_store().add_element_user(TASKINSTANCEDATA$0);
                return target;
            }
        }
    }
}
