/*
 * An XML document type.
 * Localname: getSubtasksResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getSubtasksResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetSubtasksResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSubtasksResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSUBTASKSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getSubtasksResponse");
    
    
    /**
     * Gets the "getSubtasksResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksResponseDocument.GetSubtasksResponse getGetSubtasksResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksResponseDocument.GetSubtasksResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksResponseDocument.GetSubtasksResponse)get_store().find_element_user(GETSUBTASKSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getSubtasksResponse" element
     */
    public void setGetSubtasksResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksResponseDocument.GetSubtasksResponse getSubtasksResponse)
    {
        generatedSetterHelperImpl(getSubtasksResponse, GETSUBTASKSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getSubtasksResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksResponseDocument.GetSubtasksResponse addNewGetSubtasksResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksResponseDocument.GetSubtasksResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksResponseDocument.GetSubtasksResponse)get_store().add_element_user(GETSUBTASKSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getSubtasksResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetSubtasksResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksResponseDocument.GetSubtasksResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetSubtasksResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBTASK$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "subtask");
        
        
        /**
         * Gets array of all "subtask" elements
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails[] getSubtaskArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUBTASK$0, targetList);
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "subtask" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails getSubtaskArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails)get_store().find_element_user(SUBTASK$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "subtask" element
         */
        public int sizeOfSubtaskArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBTASK$0);
            }
        }
        
        /**
         * Sets array of all "subtask" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSubtaskArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails[] subtaskArray)
        {
            check_orphaned();
            arraySetterHelper(subtaskArray, SUBTASK$0);
        }
        
        /**
         * Sets ith "subtask" element
         */
        public void setSubtaskArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails subtask)
        {
            generatedSetterHelperImpl(subtask, SUBTASK$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "subtask" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails insertNewSubtask(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails)get_store().insert_element_user(SUBTASK$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "subtask" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails addNewSubtask()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails)get_store().add_element_user(SUBTASK$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "subtask" element
         */
        public void removeSubtask(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBTASK$0, i);
            }
        }
    }
}
