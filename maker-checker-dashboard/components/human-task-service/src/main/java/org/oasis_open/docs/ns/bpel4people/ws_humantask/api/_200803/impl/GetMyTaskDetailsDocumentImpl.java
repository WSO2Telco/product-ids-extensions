/*
 * An XML document type.
 * Localname: getMyTaskDetails
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getMyTaskDetails(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetMyTaskDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetMyTaskDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMYTASKDETAILS$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getMyTaskDetails");
    
    
    /**
     * Gets the "getMyTaskDetails" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsDocument.GetMyTaskDetails getGetMyTaskDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsDocument.GetMyTaskDetails target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsDocument.GetMyTaskDetails)get_store().find_element_user(GETMYTASKDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getMyTaskDetails" element
     */
    public void setGetMyTaskDetails(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsDocument.GetMyTaskDetails getMyTaskDetails)
    {
        generatedSetterHelperImpl(getMyTaskDetails, GETMYTASKDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getMyTaskDetails" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsDocument.GetMyTaskDetails addNewGetMyTaskDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsDocument.GetMyTaskDetails target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsDocument.GetMyTaskDetails)get_store().add_element_user(GETMYTASKDETAILS$0);
            return target;
        }
    }
    /**
     * An XML getMyTaskDetails(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetMyTaskDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsDocument.GetMyTaskDetails
    {
        private static final long serialVersionUID = 1L;
        
        public GetMyTaskDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKTYPE$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "taskType");
        private static final javax.xml.namespace.QName GENERICHUMANROLE$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "genericHumanRole");
        private static final javax.xml.namespace.QName WORKQUEUE$4 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "workQueue");
        private static final javax.xml.namespace.QName STATUS$6 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "status");
        private static final javax.xml.namespace.QName WHERECLAUSE$8 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "whereClause");
        private static final javax.xml.namespace.QName ORDERBYCLAUSE$10 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "orderByClause");
        private static final javax.xml.namespace.QName CREATEDONCLAUSE$12 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "createdOnClause");
        private static final javax.xml.namespace.QName MAXTASKS$14 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "maxTasks");
        private static final javax.xml.namespace.QName TASKINDEXOFFSET$16 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "taskIndexOffset");
        
        
        /**
         * Gets the "taskType" element
         */
        public java.lang.String getTaskType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKTYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "taskType" element
         */
        public org.apache.xmlbeans.XmlString xgetTaskType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKTYPE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "taskType" element
         */
        public void setTaskType(java.lang.String taskType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKTYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKTYPE$0);
                }
                target.setStringValue(taskType);
            }
        }
        
        /**
         * Sets (as xml) the "taskType" element
         */
        public void xsetTaskType(org.apache.xmlbeans.XmlString taskType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKTYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TASKTYPE$0);
                }
                target.set(taskType);
            }
        }
        
        /**
         * Gets the "genericHumanRole" element
         */
        public java.lang.String getGenericHumanRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERICHUMANROLE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "genericHumanRole" element
         */
        public org.apache.xmlbeans.XmlString xgetGenericHumanRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENERICHUMANROLE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "genericHumanRole" element
         */
        public boolean isSetGenericHumanRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENERICHUMANROLE$2) != 0;
            }
        }
        
        /**
         * Sets the "genericHumanRole" element
         */
        public void setGenericHumanRole(java.lang.String genericHumanRole)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERICHUMANROLE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERICHUMANROLE$2);
                }
                target.setStringValue(genericHumanRole);
            }
        }
        
        /**
         * Sets (as xml) the "genericHumanRole" element
         */
        public void xsetGenericHumanRole(org.apache.xmlbeans.XmlString genericHumanRole)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENERICHUMANROLE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GENERICHUMANROLE$2);
                }
                target.set(genericHumanRole);
            }
        }
        
        /**
         * Unsets the "genericHumanRole" element
         */
        public void unsetGenericHumanRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENERICHUMANROLE$2, 0);
            }
        }
        
        /**
         * Gets the "workQueue" element
         */
        public java.lang.String getWorkQueue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKQUEUE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "workQueue" element
         */
        public org.apache.xmlbeans.XmlString xgetWorkQueue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKQUEUE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "workQueue" element
         */
        public boolean isSetWorkQueue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WORKQUEUE$4) != 0;
            }
        }
        
        /**
         * Sets the "workQueue" element
         */
        public void setWorkQueue(java.lang.String workQueue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKQUEUE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKQUEUE$4);
                }
                target.setStringValue(workQueue);
            }
        }
        
        /**
         * Sets (as xml) the "workQueue" element
         */
        public void xsetWorkQueue(org.apache.xmlbeans.XmlString workQueue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKQUEUE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WORKQUEUE$4);
                }
                target.set(workQueue);
            }
        }
        
        /**
         * Unsets the "workQueue" element
         */
        public void unsetWorkQueue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WORKQUEUE$4, 0);
            }
        }
        
        /**
         * Gets array of all "status" elements
         */
        public java.lang.String[] getStatusArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STATUS$6, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "status" element
         */
        public java.lang.String getStatusArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "status" elements
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus[] xgetStatusArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STATUS$6, targetList);
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "status" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus xgetStatusArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().find_element_user(STATUS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "status" element
         */
        public int sizeOfStatusArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUS$6);
            }
        }
        
        /**
         * Sets array of all "status" element
         */
        public void setStatusArray(java.lang.String[] statusArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(statusArray, STATUS$6);
            }
        }
        
        /**
         * Sets ith "status" element
         */
        public void setStatusArray(int i, java.lang.String status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(status);
            }
        }
        
        /**
         * Sets (as xml) array of all "status" element
         */
        public void xsetStatusArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus[]statusArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(statusArray, STATUS$6);
            }
        }
        
        /**
         * Sets (as xml) ith "status" element
         */
        public void xsetStatusArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().find_element_user(STATUS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(status);
            }
        }
        
        /**
         * Inserts the value as the ith "status" element
         */
        public void insertStatus(int i, java.lang.String status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STATUS$6, i);
                target.setStringValue(status);
            }
        }
        
        /**
         * Appends the value as the last "status" element
         */
        public void addStatus(java.lang.String status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$6);
                target.setStringValue(status);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "status" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus insertNewStatus(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().insert_element_user(STATUS$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "status" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus addNewStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().add_element_user(STATUS$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "status" element
         */
        public void removeStatus(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUS$6, i);
            }
        }
        
        /**
         * Gets the "whereClause" element
         */
        public java.lang.String getWhereClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHERECLAUSE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "whereClause" element
         */
        public org.apache.xmlbeans.XmlString xgetWhereClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WHERECLAUSE$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "whereClause" element
         */
        public boolean isSetWhereClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WHERECLAUSE$8) != 0;
            }
        }
        
        /**
         * Sets the "whereClause" element
         */
        public void setWhereClause(java.lang.String whereClause)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHERECLAUSE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WHERECLAUSE$8);
                }
                target.setStringValue(whereClause);
            }
        }
        
        /**
         * Sets (as xml) the "whereClause" element
         */
        public void xsetWhereClause(org.apache.xmlbeans.XmlString whereClause)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WHERECLAUSE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WHERECLAUSE$8);
                }
                target.set(whereClause);
            }
        }
        
        /**
         * Unsets the "whereClause" element
         */
        public void unsetWhereClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WHERECLAUSE$8, 0);
            }
        }
        
        /**
         * Gets the "orderByClause" element
         */
        public java.lang.String getOrderByClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERBYCLAUSE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "orderByClause" element
         */
        public org.apache.xmlbeans.XmlString xgetOrderByClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERBYCLAUSE$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "orderByClause" element
         */
        public boolean isSetOrderByClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORDERBYCLAUSE$10) != 0;
            }
        }
        
        /**
         * Sets the "orderByClause" element
         */
        public void setOrderByClause(java.lang.String orderByClause)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERBYCLAUSE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERBYCLAUSE$10);
                }
                target.setStringValue(orderByClause);
            }
        }
        
        /**
         * Sets (as xml) the "orderByClause" element
         */
        public void xsetOrderByClause(org.apache.xmlbeans.XmlString orderByClause)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERBYCLAUSE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERBYCLAUSE$10);
                }
                target.set(orderByClause);
            }
        }
        
        /**
         * Unsets the "orderByClause" element
         */
        public void unsetOrderByClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORDERBYCLAUSE$10, 0);
            }
        }
        
        /**
         * Gets the "createdOnClause" element
         */
        public java.lang.String getCreatedOnClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDONCLAUSE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "createdOnClause" element
         */
        public org.apache.xmlbeans.XmlString xgetCreatedOnClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATEDONCLAUSE$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "createdOnClause" element
         */
        public boolean isSetCreatedOnClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREATEDONCLAUSE$12) != 0;
            }
        }
        
        /**
         * Sets the "createdOnClause" element
         */
        public void setCreatedOnClause(java.lang.String createdOnClause)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDONCLAUSE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDONCLAUSE$12);
                }
                target.setStringValue(createdOnClause);
            }
        }
        
        /**
         * Sets (as xml) the "createdOnClause" element
         */
        public void xsetCreatedOnClause(org.apache.xmlbeans.XmlString createdOnClause)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATEDONCLAUSE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CREATEDONCLAUSE$12);
                }
                target.set(createdOnClause);
            }
        }
        
        /**
         * Unsets the "createdOnClause" element
         */
        public void unsetCreatedOnClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREATEDONCLAUSE$12, 0);
            }
        }
        
        /**
         * Gets the "maxTasks" element
         */
        public int getMaxTasks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXTASKS$14, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "maxTasks" element
         */
        public org.apache.xmlbeans.XmlInt xgetMaxTasks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXTASKS$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "maxTasks" element
         */
        public boolean isSetMaxTasks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAXTASKS$14) != 0;
            }
        }
        
        /**
         * Sets the "maxTasks" element
         */
        public void setMaxTasks(int maxTasks)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXTASKS$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXTASKS$14);
                }
                target.setIntValue(maxTasks);
            }
        }
        
        /**
         * Sets (as xml) the "maxTasks" element
         */
        public void xsetMaxTasks(org.apache.xmlbeans.XmlInt maxTasks)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXTASKS$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXTASKS$14);
                }
                target.set(maxTasks);
            }
        }
        
        /**
         * Unsets the "maxTasks" element
         */
        public void unsetMaxTasks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAXTASKS$14, 0);
            }
        }
        
        /**
         * Gets the "taskIndexOffset" element
         */
        public int getTaskIndexOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKINDEXOFFSET$16, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "taskIndexOffset" element
         */
        public org.apache.xmlbeans.XmlInt xgetTaskIndexOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TASKINDEXOFFSET$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "taskIndexOffset" element
         */
        public boolean isSetTaskIndexOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TASKINDEXOFFSET$16) != 0;
            }
        }
        
        /**
         * Sets the "taskIndexOffset" element
         */
        public void setTaskIndexOffset(int taskIndexOffset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKINDEXOFFSET$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKINDEXOFFSET$16);
                }
                target.setIntValue(taskIndexOffset);
            }
        }
        
        /**
         * Sets (as xml) the "taskIndexOffset" element
         */
        public void xsetTaskIndexOffset(org.apache.xmlbeans.XmlInt taskIndexOffset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TASKINDEXOFFSET$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TASKINDEXOFFSET$16);
                }
                target.set(taskIndexOffset);
            }
        }
        
        /**
         * Unsets the "taskIndexOffset" element
         */
        public void unsetTaskIndexOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TASKINDEXOFFSET$16, 0);
            }
        }
    }
}
