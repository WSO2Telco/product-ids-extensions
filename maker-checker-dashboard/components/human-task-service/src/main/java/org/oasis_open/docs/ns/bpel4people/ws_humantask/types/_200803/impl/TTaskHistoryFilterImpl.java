/*
 * XML Type:  tTaskHistoryFilter
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * An XML tTaskHistoryFilter(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public class TTaskHistoryFilterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter
{
    private static final long serialVersionUID = 1L;
    
    public TTaskHistoryFilterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTID$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "eventId");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "status");
    private static final javax.xml.namespace.QName EVENTTYPE$4 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "eventType");
    private static final javax.xml.namespace.QName PRINCIPAL$6 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "principal");
    private static final javax.xml.namespace.QName AFTEREVENTTIME$8 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "afterEventTime");
    private static final javax.xml.namespace.QName BEFOREEVENTTIME$10 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "beforeEventTime");
    
    
    /**
     * Gets the "eventId" element
     */
    public java.math.BigInteger getEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "eventId" element
     */
    public org.apache.xmlbeans.XmlInteger xgetEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(EVENTID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "eventId" element
     */
    public boolean isSetEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTID$0) != 0;
        }
    }
    
    /**
     * Sets the "eventId" element
     */
    public void setEventId(java.math.BigInteger eventId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTID$0);
            }
            target.setBigIntegerValue(eventId);
        }
    }
    
    /**
     * Sets (as xml) the "eventId" element
     */
    public void xsetEventId(org.apache.xmlbeans.XmlInteger eventId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(EVENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(EVENTID$0);
            }
            target.set(eventId);
        }
    }
    
    /**
     * Unsets the "eventId" element
     */
    public void unsetEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTID$0, 0);
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
            get_store().find_all_element_users(STATUS$2, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, i);
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
            get_store().find_all_element_users(STATUS$2, targetList);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().find_element_user(STATUS$2, i);
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
            return get_store().count_elements(STATUS$2);
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
            arraySetterHelper(statusArray, STATUS$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, i);
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
            arraySetterHelper(statusArray, STATUS$2);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().find_element_user(STATUS$2, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STATUS$2, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$2);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().insert_element_user(STATUS$2, i);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().add_element_user(STATUS$2);
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
            get_store().remove_element(STATUS$2, i);
        }
    }
    
    /**
     * Gets array of all "eventType" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum[] getEventTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENTTYPE$4, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "eventType" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum getEventTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTYPE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "eventType" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType[] xgetEventTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENTTYPE$4, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "eventType" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType xgetEventTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType)get_store().find_element_user(EVENTTYPE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "eventType" element
     */
    public int sizeOfEventTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTTYPE$4);
        }
    }
    
    /**
     * Sets array of all "eventType" element
     */
    public void setEventTypeArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum[] eventTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eventTypeArray, EVENTTYPE$4);
        }
    }
    
    /**
     * Sets ith "eventType" element
     */
    public void setEventTypeArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum eventType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTYPE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(eventType);
        }
    }
    
    /**
     * Sets (as xml) array of all "eventType" element
     */
    public void xsetEventTypeArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType[]eventTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eventTypeArray, EVENTTYPE$4);
        }
    }
    
    /**
     * Sets (as xml) ith "eventType" element
     */
    public void xsetEventTypeArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType eventType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType)get_store().find_element_user(EVENTTYPE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(eventType);
        }
    }
    
    /**
     * Inserts the value as the ith "eventType" element
     */
    public void insertEventType(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum eventType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EVENTTYPE$4, i);
            target.setEnumValue(eventType);
        }
    }
    
    /**
     * Appends the value as the last "eventType" element
     */
    public void addEventType(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum eventType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTTYPE$4);
            target.setEnumValue(eventType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventType" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType insertNewEventType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType)get_store().insert_element_user(EVENTTYPE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventType" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType addNewEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType)get_store().add_element_user(EVENTTYPE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "eventType" element
     */
    public void removeEventType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTTYPE$4, i);
        }
    }
    
    /**
     * Gets the "principal" element
     */
    public java.lang.String getPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRINCIPAL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "principal" element
     */
    public org.apache.xmlbeans.XmlString xgetPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRINCIPAL$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "principal" element
     */
    public boolean isSetPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRINCIPAL$6) != 0;
        }
    }
    
    /**
     * Sets the "principal" element
     */
    public void setPrincipal(java.lang.String principal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRINCIPAL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRINCIPAL$6);
            }
            target.setStringValue(principal);
        }
    }
    
    /**
     * Sets (as xml) the "principal" element
     */
    public void xsetPrincipal(org.apache.xmlbeans.XmlString principal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRINCIPAL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRINCIPAL$6);
            }
            target.set(principal);
        }
    }
    
    /**
     * Unsets the "principal" element
     */
    public void unsetPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRINCIPAL$6, 0);
        }
    }
    
    /**
     * Gets the "afterEventTime" element
     */
    public java.util.Calendar getAfterEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AFTEREVENTTIME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "afterEventTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetAfterEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(AFTEREVENTTIME$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "afterEventTime" element
     */
    public boolean isSetAfterEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AFTEREVENTTIME$8) != 0;
        }
    }
    
    /**
     * Sets the "afterEventTime" element
     */
    public void setAfterEventTime(java.util.Calendar afterEventTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AFTEREVENTTIME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AFTEREVENTTIME$8);
            }
            target.setCalendarValue(afterEventTime);
        }
    }
    
    /**
     * Sets (as xml) the "afterEventTime" element
     */
    public void xsetAfterEventTime(org.apache.xmlbeans.XmlDateTime afterEventTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(AFTEREVENTTIME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(AFTEREVENTTIME$8);
            }
            target.set(afterEventTime);
        }
    }
    
    /**
     * Unsets the "afterEventTime" element
     */
    public void unsetAfterEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AFTEREVENTTIME$8, 0);
        }
    }
    
    /**
     * Gets the "beforeEventTime" element
     */
    public java.util.Calendar getBeforeEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEFOREEVENTTIME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "beforeEventTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetBeforeEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEFOREEVENTTIME$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "beforeEventTime" element
     */
    public boolean isSetBeforeEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEFOREEVENTTIME$10) != 0;
        }
    }
    
    /**
     * Sets the "beforeEventTime" element
     */
    public void setBeforeEventTime(java.util.Calendar beforeEventTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEFOREEVENTTIME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEFOREEVENTTIME$10);
            }
            target.setCalendarValue(beforeEventTime);
        }
    }
    
    /**
     * Sets (as xml) the "beforeEventTime" element
     */
    public void xsetBeforeEventTime(org.apache.xmlbeans.XmlDateTime beforeEventTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEFOREEVENTTIME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(BEFOREEVENTTIME$10);
            }
            target.set(beforeEventTime);
        }
    }
    
    /**
     * Unsets the "beforeEventTime" element
     */
    public void unsetBeforeEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEFOREEVENTTIME$10, 0);
        }
    }
}
