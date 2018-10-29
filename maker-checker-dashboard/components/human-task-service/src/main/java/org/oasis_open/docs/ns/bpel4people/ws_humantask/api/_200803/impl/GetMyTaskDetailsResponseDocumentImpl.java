/*
 * An XML document type.
 * Localname: getMyTaskDetailsResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getMyTaskDetailsResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetMyTaskDetailsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetMyTaskDetailsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMYTASKDETAILSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getMyTaskDetailsResponse");
    
    
    /**
     * Gets the "getMyTaskDetailsResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsResponseDocument.GetMyTaskDetailsResponse getGetMyTaskDetailsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsResponseDocument.GetMyTaskDetailsResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsResponseDocument.GetMyTaskDetailsResponse)get_store().find_element_user(GETMYTASKDETAILSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getMyTaskDetailsResponse" element
     */
    public void setGetMyTaskDetailsResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsResponseDocument.GetMyTaskDetailsResponse getMyTaskDetailsResponse)
    {
        generatedSetterHelperImpl(getMyTaskDetailsResponse, GETMYTASKDETAILSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getMyTaskDetailsResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsResponseDocument.GetMyTaskDetailsResponse addNewGetMyTaskDetailsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsResponseDocument.GetMyTaskDetailsResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsResponseDocument.GetMyTaskDetailsResponse)get_store().add_element_user(GETMYTASKDETAILSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getMyTaskDetailsResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetMyTaskDetailsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsResponseDocument.GetMyTaskDetailsResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetMyTaskDetailsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKDETAILS$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "taskDetails");
        
        
        /**
         * Gets array of all "taskDetails" elements
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails[] getTaskDetailsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TASKDETAILS$0, targetList);
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "taskDetails" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails getTaskDetailsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails)get_store().find_element_user(TASKDETAILS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "taskDetails" element
         */
        public int sizeOfTaskDetailsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TASKDETAILS$0);
            }
        }
        
        /**
         * Sets array of all "taskDetails" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTaskDetailsArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails[] taskDetailsArray)
        {
            check_orphaned();
            arraySetterHelper(taskDetailsArray, TASKDETAILS$0);
        }
        
        /**
         * Sets ith "taskDetails" element
         */
        public void setTaskDetailsArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails taskDetails)
        {
            generatedSetterHelperImpl(taskDetails, TASKDETAILS$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "taskDetails" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails insertNewTaskDetails(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails)get_store().insert_element_user(TASKDETAILS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "taskDetails" element
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
        
        /**
         * Removes the ith "taskDetails" element
         */
        public void removeTaskDetails(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TASKDETAILS$0, i);
            }
        }
    }
}
