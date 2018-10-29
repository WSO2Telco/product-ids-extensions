/*
 * An XML document type.
 * Localname: getParentTaskResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getParentTaskResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetParentTaskResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetParentTaskResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPARENTTASKRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getParentTaskResponse");
    
    
    /**
     * Gets the "getParentTaskResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskResponseDocument.GetParentTaskResponse getGetParentTaskResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskResponseDocument.GetParentTaskResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskResponseDocument.GetParentTaskResponse)get_store().find_element_user(GETPARENTTASKRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getParentTaskResponse" element
     */
    public void setGetParentTaskResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskResponseDocument.GetParentTaskResponse getParentTaskResponse)
    {
        generatedSetterHelperImpl(getParentTaskResponse, GETPARENTTASKRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getParentTaskResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskResponseDocument.GetParentTaskResponse addNewGetParentTaskResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskResponseDocument.GetParentTaskResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskResponseDocument.GetParentTaskResponse)get_store().add_element_user(GETPARENTTASKRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getParentTaskResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetParentTaskResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskResponseDocument.GetParentTaskResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetParentTaskResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARENTTASK$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "parentTask");
        
        
        /**
         * Gets the "parentTask" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails getParentTask()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails)get_store().find_element_user(PARENTTASK$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "parentTask" element
         */
        public boolean isSetParentTask()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARENTTASK$0) != 0;
            }
        }
        
        /**
         * Sets the "parentTask" element
         */
        public void setParentTask(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails parentTask)
        {
            generatedSetterHelperImpl(parentTask, PARENTTASK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "parentTask" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails addNewParentTask()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails)get_store().add_element_user(PARENTTASK$0);
                return target;
            }
        }
        
        /**
         * Unsets the "parentTask" element
         */
        public void unsetParentTask()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARENTTASK$0, 0);
            }
        }
    }
}
