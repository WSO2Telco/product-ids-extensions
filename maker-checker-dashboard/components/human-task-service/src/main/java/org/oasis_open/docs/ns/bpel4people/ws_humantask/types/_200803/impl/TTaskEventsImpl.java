/*
 * XML Type:  tTaskEvents
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvents
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * An XML tTaskEvents(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public class TTaskEventsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvents
{
    private static final long serialVersionUID = 1L;
    
    public TTaskEventsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "event");
    
    
    /**
     * Gets array of all "event" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent[] getEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENT$0, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "event" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent getEventArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent)get_store().find_element_user(EVENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "event" element
     */
    public int sizeOfEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENT$0);
        }
    }
    
    /**
     * Sets array of all "event" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEventArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent[] eventArray)
    {
        check_orphaned();
        arraySetterHelper(eventArray, EVENT$0);
    }
    
    /**
     * Sets ith "event" element
     */
    public void setEventArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent event)
    {
        generatedSetterHelperImpl(event, EVENT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "event" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent insertNewEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent)get_store().insert_element_user(EVENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "event" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent addNewEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent)get_store().add_element_user(EVENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "event" element
     */
    public void removeEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENT$0, i);
        }
    }
}
