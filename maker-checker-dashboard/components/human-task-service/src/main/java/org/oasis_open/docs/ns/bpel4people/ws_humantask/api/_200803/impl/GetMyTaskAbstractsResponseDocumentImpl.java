/*
 * An XML document type.
 * Localname: getMyTaskAbstractsResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getMyTaskAbstractsResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetMyTaskAbstractsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetMyTaskAbstractsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMYTASKABSTRACTSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getMyTaskAbstractsResponse");
    
    
    /**
     * Gets the "getMyTaskAbstractsResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsResponseDocument.GetMyTaskAbstractsResponse getGetMyTaskAbstractsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsResponseDocument.GetMyTaskAbstractsResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsResponseDocument.GetMyTaskAbstractsResponse)get_store().find_element_user(GETMYTASKABSTRACTSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getMyTaskAbstractsResponse" element
     */
    public void setGetMyTaskAbstractsResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsResponseDocument.GetMyTaskAbstractsResponse getMyTaskAbstractsResponse)
    {
        generatedSetterHelperImpl(getMyTaskAbstractsResponse, GETMYTASKABSTRACTSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getMyTaskAbstractsResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsResponseDocument.GetMyTaskAbstractsResponse addNewGetMyTaskAbstractsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsResponseDocument.GetMyTaskAbstractsResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsResponseDocument.GetMyTaskAbstractsResponse)get_store().add_element_user(GETMYTASKABSTRACTSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getMyTaskAbstractsResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetMyTaskAbstractsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsResponseDocument.GetMyTaskAbstractsResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetMyTaskAbstractsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKABSTRACT$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "taskAbstract");
        
        
        /**
         * Gets array of all "taskAbstract" elements
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract[] getTaskAbstractArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TASKABSTRACT$0, targetList);
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "taskAbstract" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract getTaskAbstractArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract)get_store().find_element_user(TASKABSTRACT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "taskAbstract" element
         */
        public int sizeOfTaskAbstractArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TASKABSTRACT$0);
            }
        }
        
        /**
         * Sets array of all "taskAbstract" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTaskAbstractArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract[] taskAbstractArray)
        {
            check_orphaned();
            arraySetterHelper(taskAbstractArray, TASKABSTRACT$0);
        }
        
        /**
         * Sets ith "taskAbstract" element
         */
        public void setTaskAbstractArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract taskAbstract)
        {
            generatedSetterHelperImpl(taskAbstract, TASKABSTRACT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "taskAbstract" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract insertNewTaskAbstract(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract)get_store().insert_element_user(TASKABSTRACT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "taskAbstract" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract addNewTaskAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract)get_store().add_element_user(TASKABSTRACT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "taskAbstract" element
         */
        public void removeTaskAbstract(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TASKABSTRACT$0, i);
            }
        }
    }
}
