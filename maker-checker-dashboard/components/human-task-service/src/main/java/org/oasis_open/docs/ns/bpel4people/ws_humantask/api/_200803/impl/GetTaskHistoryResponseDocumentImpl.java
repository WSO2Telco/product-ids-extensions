/*
 * An XML document type.
 * Localname: getTaskHistoryResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getTaskHistoryResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetTaskHistoryResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTaskHistoryResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTASKHISTORYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getTaskHistoryResponse");
    
    
    /**
     * Gets the "getTaskHistoryResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument.GetTaskHistoryResponse getGetTaskHistoryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument.GetTaskHistoryResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument.GetTaskHistoryResponse)get_store().find_element_user(GETTASKHISTORYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTaskHistoryResponse" element
     */
    public void setGetTaskHistoryResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument.GetTaskHistoryResponse getTaskHistoryResponse)
    {
        generatedSetterHelperImpl(getTaskHistoryResponse, GETTASKHISTORYRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTaskHistoryResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument.GetTaskHistoryResponse addNewGetTaskHistoryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument.GetTaskHistoryResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument.GetTaskHistoryResponse)get_store().add_element_user(GETTASKHISTORYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getTaskHistoryResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetTaskHistoryResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument.GetTaskHistoryResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetTaskHistoryResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKEVENT$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "taskEvent");
        
        
        /**
         * Gets array of all "taskEvent" elements
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum[] getTaskEventArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TASKEVENT$0, targetList);
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
                return result;
            }
        }
        
        /**
         * Gets ith "taskEvent" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum getTaskEventArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKEVENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "taskEvent" elements
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType[] xgetTaskEventArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TASKEVENT$0, targetList);
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "taskEvent" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType xgetTaskEventArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType)get_store().find_element_user(TASKEVENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "taskEvent" element
         */
        public int sizeOfTaskEventArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TASKEVENT$0);
            }
        }
        
        /**
         * Sets array of all "taskEvent" element
         */
        public void setTaskEventArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum[] taskEventArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(taskEventArray, TASKEVENT$0);
            }
        }
        
        /**
         * Sets ith "taskEvent" element
         */
        public void setTaskEventArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum taskEvent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKEVENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setEnumValue(taskEvent);
            }
        }
        
        /**
         * Sets (as xml) array of all "taskEvent" element
         */
        public void xsetTaskEventArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType[]taskEventArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(taskEventArray, TASKEVENT$0);
            }
        }
        
        /**
         * Sets (as xml) ith "taskEvent" element
         */
        public void xsetTaskEventArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType taskEvent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType)get_store().find_element_user(TASKEVENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(taskEvent);
            }
        }
        
        /**
         * Inserts the value as the ith "taskEvent" element
         */
        public void insertTaskEvent(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum taskEvent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TASKEVENT$0, i);
                target.setEnumValue(taskEvent);
            }
        }
        
        /**
         * Appends the value as the last "taskEvent" element
         */
        public void addTaskEvent(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum taskEvent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKEVENT$0);
                target.setEnumValue(taskEvent);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "taskEvent" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType insertNewTaskEvent(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType)get_store().insert_element_user(TASKEVENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "taskEvent" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType addNewTaskEvent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType)get_store().add_element_user(TASKEVENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "taskEvent" element
         */
        public void removeTaskEvent(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TASKEVENT$0, i);
            }
        }
    }
}
