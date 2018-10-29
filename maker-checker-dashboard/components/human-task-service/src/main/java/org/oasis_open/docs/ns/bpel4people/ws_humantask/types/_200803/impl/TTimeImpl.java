/*
 * XML Type:  tTime
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTime
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * An XML tTime(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public class TTimeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTime
{
    private static final long serialVersionUID = 1L;
    
    public TTimeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEPERIOD$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "timePeriod");
    private static final javax.xml.namespace.QName POINTOFTIME$2 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "pointOfTime");
    
    
    /**
     * Gets the "timePeriod" element
     */
    public org.apache.xmlbeans.GDuration getTimePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEPERIOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "timePeriod" element
     */
    public org.apache.xmlbeans.XmlDuration xgetTimePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(TIMEPERIOD$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "timePeriod" element
     */
    public boolean isSetTimePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEPERIOD$0) != 0;
        }
    }
    
    /**
     * Sets the "timePeriod" element
     */
    public void setTimePeriod(org.apache.xmlbeans.GDuration timePeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEPERIOD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEPERIOD$0);
            }
            target.setGDurationValue(timePeriod);
        }
    }
    
    /**
     * Sets (as xml) the "timePeriod" element
     */
    public void xsetTimePeriod(org.apache.xmlbeans.XmlDuration timePeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(TIMEPERIOD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDuration)get_store().add_element_user(TIMEPERIOD$0);
            }
            target.set(timePeriod);
        }
    }
    
    /**
     * Unsets the "timePeriod" element
     */
    public void unsetTimePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEPERIOD$0, 0);
        }
    }
    
    /**
     * Gets the "pointOfTime" element
     */
    public java.util.Calendar getPointOfTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POINTOFTIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "pointOfTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetPointOfTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(POINTOFTIME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "pointOfTime" element
     */
    public boolean isSetPointOfTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POINTOFTIME$2) != 0;
        }
    }
    
    /**
     * Sets the "pointOfTime" element
     */
    public void setPointOfTime(java.util.Calendar pointOfTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POINTOFTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POINTOFTIME$2);
            }
            target.setCalendarValue(pointOfTime);
        }
    }
    
    /**
     * Sets (as xml) the "pointOfTime" element
     */
    public void xsetPointOfTime(org.apache.xmlbeans.XmlDateTime pointOfTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(POINTOFTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(POINTOFTIME$2);
            }
            target.set(pointOfTime);
        }
    }
    
    /**
     * Unsets the "pointOfTime" element
     */
    public void unsetPointOfTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POINTOFTIME$2, 0);
        }
    }
}
