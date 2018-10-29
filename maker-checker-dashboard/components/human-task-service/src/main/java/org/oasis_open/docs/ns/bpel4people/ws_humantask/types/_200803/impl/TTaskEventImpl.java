/*
 * XML Type:  tTaskEvent
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * An XML tTaskEvent(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public class TTaskEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent
{
    private static final long serialVersionUID = 1L;
    
    public TTaskEventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTID$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "eventId");
    private static final javax.xml.namespace.QName EVENTTYPE$2 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "eventType");
    private static final javax.xml.namespace.QName EVENTINITIATOR$4 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "eventInitiator");
    private static final javax.xml.namespace.QName OLDSTATE$6 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "oldState");
    private static final javax.xml.namespace.QName NEWSTATE$8 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "newState");
    private static final javax.xml.namespace.QName EVENTDETAIL$10 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "eventDetail");
    private static final javax.xml.namespace.QName EVENTTIME$12 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "eventTime");
    
    
    /**
     * Gets the "eventId" element
     */
    public java.lang.String getEventId()
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
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "eventId" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(EVENTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "eventId" element
     */
    public void setEventId(java.lang.String eventId)
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
            target.setStringValue(eventId);
        }
    }
    
    /**
     * Sets (as xml) the "eventId" element
     */
    public void xsetEventId(org.apache.xmlbeans.XmlAnyURI eventId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(EVENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(EVENTID$0);
            }
            target.set(eventId);
        }
    }
    
    /**
     * Gets the "eventType" element
     */
    public java.lang.String getEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "eventType" element
     */
    public org.apache.xmlbeans.XmlString xgetEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "eventType" element
     */
    public void setEventType(java.lang.String eventType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTTYPE$2);
            }
            target.setStringValue(eventType);
        }
    }
    
    /**
     * Sets (as xml) the "eventType" element
     */
    public void xsetEventType(org.apache.xmlbeans.XmlString eventType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTTYPE$2);
            }
            target.set(eventType);
        }
    }
    
    /**
     * Gets the "eventInitiator" element
     */
    public java.lang.String getEventInitiator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTINITIATOR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "eventInitiator" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser xgetEventInitiator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(EVENTINITIATOR$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "eventInitiator" element
     */
    public void setEventInitiator(java.lang.String eventInitiator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTINITIATOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTINITIATOR$4);
            }
            target.setStringValue(eventInitiator);
        }
    }
    
    /**
     * Sets (as xml) the "eventInitiator" element
     */
    public void xsetEventInitiator(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser eventInitiator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(EVENTINITIATOR$4, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().add_element_user(EVENTINITIATOR$4);
            }
            target.set(eventInitiator);
        }
    }
    
    /**
     * Gets the "oldState" element
     */
    public java.lang.String getOldState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OLDSTATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "oldState" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus xgetOldState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().find_element_user(OLDSTATE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "oldState" element
     */
    public boolean isSetOldState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OLDSTATE$6) != 0;
        }
    }
    
    /**
     * Sets the "oldState" element
     */
    public void setOldState(java.lang.String oldState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OLDSTATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OLDSTATE$6);
            }
            target.setStringValue(oldState);
        }
    }
    
    /**
     * Sets (as xml) the "oldState" element
     */
    public void xsetOldState(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus oldState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().find_element_user(OLDSTATE$6, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().add_element_user(OLDSTATE$6);
            }
            target.set(oldState);
        }
    }
    
    /**
     * Unsets the "oldState" element
     */
    public void unsetOldState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OLDSTATE$6, 0);
        }
    }
    
    /**
     * Gets the "newState" element
     */
    public java.lang.String getNewState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWSTATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "newState" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus xgetNewState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().find_element_user(NEWSTATE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "newState" element
     */
    public boolean isSetNewState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEWSTATE$8) != 0;
        }
    }
    
    /**
     * Sets the "newState" element
     */
    public void setNewState(java.lang.String newState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWSTATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEWSTATE$8);
            }
            target.setStringValue(newState);
        }
    }
    
    /**
     * Sets (as xml) the "newState" element
     */
    public void xsetNewState(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus newState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().find_element_user(NEWSTATE$8, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().add_element_user(NEWSTATE$8);
            }
            target.set(newState);
        }
    }
    
    /**
     * Unsets the "newState" element
     */
    public void unsetNewState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEWSTATE$8, 0);
        }
    }
    
    /**
     * Gets the "eventDetail" element
     */
    public java.lang.String getEventDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTDETAIL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "eventDetail" element
     */
    public org.apache.xmlbeans.XmlString xgetEventDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTDETAIL$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "eventDetail" element
     */
    public boolean isSetEventDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTDETAIL$10) != 0;
        }
    }
    
    /**
     * Sets the "eventDetail" element
     */
    public void setEventDetail(java.lang.String eventDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTDETAIL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTDETAIL$10);
            }
            target.setStringValue(eventDetail);
        }
    }
    
    /**
     * Sets (as xml) the "eventDetail" element
     */
    public void xsetEventDetail(org.apache.xmlbeans.XmlString eventDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTDETAIL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTDETAIL$10);
            }
            target.set(eventDetail);
        }
    }
    
    /**
     * Unsets the "eventDetail" element
     */
    public void unsetEventDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTDETAIL$10, 0);
        }
    }
    
    /**
     * Gets the "eventTime" element
     */
    public java.util.Calendar getEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTIME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "eventTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EVENTTIME$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "eventTime" element
     */
    public void setEventTime(java.util.Calendar eventTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTIME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTTIME$12);
            }
            target.setCalendarValue(eventTime);
        }
    }
    
    /**
     * Sets (as xml) the "eventTime" element
     */
    public void xsetEventTime(org.apache.xmlbeans.XmlDateTime eventTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EVENTTIME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EVENTTIME$12);
            }
            target.set(eventTime);
        }
    }
}
