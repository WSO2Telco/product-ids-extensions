/*
 * XML Type:  tSimpleQueryInput
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * An XML tSimpleQueryInput(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public class TSimpleQueryInputImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput
{
    private static final long serialVersionUID = 1L;
    
    public TSimpleQueryInputImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "status");
    private static final javax.xml.namespace.QName CREATEDDATE$2 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "createdDate");
    private static final javax.xml.namespace.QName UNDATEDDATE$4 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "undatedDate");
    private static final javax.xml.namespace.QName TASKNAME$6 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "taskName");
    private static final javax.xml.namespace.QName PAGESIZE$8 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "pageSize");
    private static final javax.xml.namespace.QName PAGENUMBER$10 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "pageNumber");
    private static final javax.xml.namespace.QName SIMPLEQUERYCATEGORY$12 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "simpleQueryCategory");
    private static final javax.xml.namespace.QName QUERYORDER$14 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "queryOrder");
    private static final javax.xml.namespace.QName QUERYORDERBY$16 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "queryOrderBy");
    
    
    /**
     * Gets array of all "status" elements
     */
    public java.lang.String[] getStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STATUS$0, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, i);
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
            get_store().find_all_element_users(STATUS$0, targetList);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().find_element_user(STATUS$0, i);
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
            return get_store().count_elements(STATUS$0);
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
            arraySetterHelper(statusArray, STATUS$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, i);
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
            arraySetterHelper(statusArray, STATUS$0);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().find_element_user(STATUS$0, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STATUS$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$0);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().insert_element_user(STATUS$0, i);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().add_element_user(STATUS$0);
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
            get_store().remove_element(STATUS$0, i);
        }
    }
    
    /**
     * Gets the "createdDate" element
     */
    public java.util.Calendar getCreatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "createdDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCreatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDDATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "createdDate" element
     */
    public boolean isSetCreatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDDATE$2) != 0;
        }
    }
    
    /**
     * Sets the "createdDate" element
     */
    public void setCreatedDate(java.util.Calendar createdDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDDATE$2);
            }
            target.setCalendarValue(createdDate);
        }
    }
    
    /**
     * Sets (as xml) the "createdDate" element
     */
    public void xsetCreatedDate(org.apache.xmlbeans.XmlDateTime createdDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATEDDATE$2);
            }
            target.set(createdDate);
        }
    }
    
    /**
     * Unsets the "createdDate" element
     */
    public void unsetCreatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDDATE$2, 0);
        }
    }
    
    /**
     * Gets the "undatedDate" element
     */
    public java.util.Calendar getUndatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNDATEDDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "undatedDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetUndatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(UNDATEDDATE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "undatedDate" element
     */
    public boolean isSetUndatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNDATEDDATE$4) != 0;
        }
    }
    
    /**
     * Sets the "undatedDate" element
     */
    public void setUndatedDate(java.util.Calendar undatedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNDATEDDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNDATEDDATE$4);
            }
            target.setCalendarValue(undatedDate);
        }
    }
    
    /**
     * Sets (as xml) the "undatedDate" element
     */
    public void xsetUndatedDate(org.apache.xmlbeans.XmlDateTime undatedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(UNDATEDDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(UNDATEDDATE$4);
            }
            target.set(undatedDate);
        }
    }
    
    /**
     * Unsets the "undatedDate" element
     */
    public void unsetUndatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNDATEDDATE$4, 0);
        }
    }
    
    /**
     * Gets the "taskName" element
     */
    public java.lang.String getTaskName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "taskName" element
     */
    public org.apache.xmlbeans.XmlString xgetTaskName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKNAME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "taskName" element
     */
    public boolean isSetTaskName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TASKNAME$6) != 0;
        }
    }
    
    /**
     * Sets the "taskName" element
     */
    public void setTaskName(java.lang.String taskName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKNAME$6);
            }
            target.setStringValue(taskName);
        }
    }
    
    /**
     * Sets (as xml) the "taskName" element
     */
    public void xsetTaskName(org.apache.xmlbeans.XmlString taskName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TASKNAME$6);
            }
            target.set(taskName);
        }
    }
    
    /**
     * Unsets the "taskName" element
     */
    public void unsetTaskName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TASKNAME$6, 0);
        }
    }
    
    /**
     * Gets the "pageSize" element
     */
    public int getPageSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGESIZE$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "pageSize" element
     */
    public org.apache.xmlbeans.XmlInt xgetPageSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGESIZE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "pageSize" element
     */
    public boolean isSetPageSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGESIZE$8) != 0;
        }
    }
    
    /**
     * Sets the "pageSize" element
     */
    public void setPageSize(int pageSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGESIZE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGESIZE$8);
            }
            target.setIntValue(pageSize);
        }
    }
    
    /**
     * Sets (as xml) the "pageSize" element
     */
    public void xsetPageSize(org.apache.xmlbeans.XmlInt pageSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGESIZE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PAGESIZE$8);
            }
            target.set(pageSize);
        }
    }
    
    /**
     * Unsets the "pageSize" element
     */
    public void unsetPageSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGESIZE$8, 0);
        }
    }
    
    /**
     * Gets the "pageNumber" element
     */
    public int getPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGENUMBER$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "pageNumber" element
     */
    public org.apache.xmlbeans.XmlInt xgetPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGENUMBER$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "pageNumber" element
     */
    public boolean isSetPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGENUMBER$10) != 0;
        }
    }
    
    /**
     * Sets the "pageNumber" element
     */
    public void setPageNumber(int pageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGENUMBER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGENUMBER$10);
            }
            target.setIntValue(pageNumber);
        }
    }
    
    /**
     * Sets (as xml) the "pageNumber" element
     */
    public void xsetPageNumber(org.apache.xmlbeans.XmlInt pageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGENUMBER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PAGENUMBER$10);
            }
            target.set(pageNumber);
        }
    }
    
    /**
     * Unsets the "pageNumber" element
     */
    public void unsetPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGENUMBER$10, 0);
        }
    }
    
    /**
     * Gets the "simpleQueryCategory" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryCategory.Enum getSimpleQueryCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIMPLEQUERYCATEGORY$12, 0);
            if (target == null)
            {
                return null;
            }
            return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryCategory.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "simpleQueryCategory" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryCategory xgetSimpleQueryCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryCategory target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryCategory)get_store().find_element_user(SIMPLEQUERYCATEGORY$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "simpleQueryCategory" element
     */
    public boolean isSetSimpleQueryCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIMPLEQUERYCATEGORY$12) != 0;
        }
    }
    
    /**
     * Sets the "simpleQueryCategory" element
     */
    public void setSimpleQueryCategory(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryCategory.Enum simpleQueryCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIMPLEQUERYCATEGORY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIMPLEQUERYCATEGORY$12);
            }
            target.setEnumValue(simpleQueryCategory);
        }
    }
    
    /**
     * Sets (as xml) the "simpleQueryCategory" element
     */
    public void xsetSimpleQueryCategory(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryCategory simpleQueryCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryCategory target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryCategory)get_store().find_element_user(SIMPLEQUERYCATEGORY$12, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryCategory)get_store().add_element_user(SIMPLEQUERYCATEGORY$12);
            }
            target.set(simpleQueryCategory);
        }
    }
    
    /**
     * Unsets the "simpleQueryCategory" element
     */
    public void unsetSimpleQueryCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIMPLEQUERYCATEGORY$12, 0);
        }
    }
    
    /**
     * Gets the "queryOrder" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrder.Enum getQueryOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYORDER$14, 0);
            if (target == null)
            {
                return null;
            }
            return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrder.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "queryOrder" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrder xgetQueryOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrder target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrder)get_store().find_element_user(QUERYORDER$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "queryOrder" element
     */
    public boolean isSetQueryOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYORDER$14) != 0;
        }
    }
    
    /**
     * Sets the "queryOrder" element
     */
    public void setQueryOrder(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrder.Enum queryOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYORDER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYORDER$14);
            }
            target.setEnumValue(queryOrder);
        }
    }
    
    /**
     * Sets (as xml) the "queryOrder" element
     */
    public void xsetQueryOrder(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrder queryOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrder target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrder)get_store().find_element_user(QUERYORDER$14, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrder)get_store().add_element_user(QUERYORDER$14);
            }
            target.set(queryOrder);
        }
    }
    
    /**
     * Unsets the "queryOrder" element
     */
    public void unsetQueryOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYORDER$14, 0);
        }
    }
    
    /**
     * Gets the "queryOrderBy" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrderBy.Enum getQueryOrderBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYORDERBY$16, 0);
            if (target == null)
            {
                return null;
            }
            return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrderBy.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "queryOrderBy" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrderBy xgetQueryOrderBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrderBy target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrderBy)get_store().find_element_user(QUERYORDERBY$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "queryOrderBy" element
     */
    public boolean isSetQueryOrderBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYORDERBY$16) != 0;
        }
    }
    
    /**
     * Sets the "queryOrderBy" element
     */
    public void setQueryOrderBy(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrderBy.Enum queryOrderBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYORDERBY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYORDERBY$16);
            }
            target.setEnumValue(queryOrderBy);
        }
    }
    
    /**
     * Sets (as xml) the "queryOrderBy" element
     */
    public void xsetQueryOrderBy(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrderBy queryOrderBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrderBy target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrderBy)get_store().find_element_user(QUERYORDERBY$16, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrderBy)get_store().add_element_user(QUERYORDERBY$16);
            }
            target.set(queryOrderBy);
        }
    }
    
    /**
     * Unsets the "queryOrderBy" element
     */
    public void unsetQueryOrderBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYORDERBY$16, 0);
        }
    }
}
