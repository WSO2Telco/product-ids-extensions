/*
 * XML Type:  tTaskSimpleQueryResultRow
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * An XML tTaskSimpleQueryResultRow(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public class TTaskSimpleQueryResultRowImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow
{
    private static final long serialVersionUID = 1L;
    
    public TTaskSimpleQueryResultRowImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "id");
    private static final javax.xml.namespace.QName TASKTYPE$2 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "taskType");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "name");
    private static final javax.xml.namespace.QName PRESENTATIONSUBJECT$6 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "presentationSubject");
    private static final javax.xml.namespace.QName PRESENTATIONNAME$8 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "presentationName");
    private static final javax.xml.namespace.QName STATUS$10 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "status");
    private static final javax.xml.namespace.QName PRIORITY$12 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "priority");
    private static final javax.xml.namespace.QName CREATEDTIME$14 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "createdTime");
    
    
    /**
     * Gets the "id" element
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlAnyURI id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "taskType" element
     */
    public java.lang.String getTaskType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKTYPE$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKTYPE$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKTYPE$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TASKTYPE$2);
            }
            target.set(taskType);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public javax.xml.namespace.QName getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlQName xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(NAME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(javax.xml.namespace.QName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$4);
            }
            target.setQNameValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlQName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(NAME$4);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "presentationSubject" element
     */
    public java.lang.String getPresentationSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTATIONSUBJECT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "presentationSubject" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject xgetPresentationSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject)get_store().find_element_user(PRESENTATIONSUBJECT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "presentationSubject" element
     */
    public boolean isSetPresentationSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRESENTATIONSUBJECT$6) != 0;
        }
    }
    
    /**
     * Sets the "presentationSubject" element
     */
    public void setPresentationSubject(java.lang.String presentationSubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTATIONSUBJECT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRESENTATIONSUBJECT$6);
            }
            target.setStringValue(presentationSubject);
        }
    }
    
    /**
     * Sets (as xml) the "presentationSubject" element
     */
    public void xsetPresentationSubject(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject presentationSubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject)get_store().find_element_user(PRESENTATIONSUBJECT$6, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject)get_store().add_element_user(PRESENTATIONSUBJECT$6);
            }
            target.set(presentationSubject);
        }
    }
    
    /**
     * Unsets the "presentationSubject" element
     */
    public void unsetPresentationSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRESENTATIONSUBJECT$6, 0);
        }
    }
    
    /**
     * Gets the "presentationName" element
     */
    public java.lang.String getPresentationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTATIONNAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "presentationName" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName xgetPresentationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName)get_store().find_element_user(PRESENTATIONNAME$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "presentationName" element
     */
    public boolean isSetPresentationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRESENTATIONNAME$8) != 0;
        }
    }
    
    /**
     * Sets the "presentationName" element
     */
    public void setPresentationName(java.lang.String presentationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTATIONNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRESENTATIONNAME$8);
            }
            target.setStringValue(presentationName);
        }
    }
    
    /**
     * Sets (as xml) the "presentationName" element
     */
    public void xsetPresentationName(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName presentationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName)get_store().find_element_user(PRESENTATIONNAME$8, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName)get_store().add_element_user(PRESENTATIONNAME$8);
            }
            target.set(presentationName);
        }
    }
    
    /**
     * Unsets the "presentationName" element
     */
    public void unsetPresentationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRESENTATIONNAME$8, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().find_element_user(STATUS$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$10);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().find_element_user(STATUS$10, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().add_element_user(STATUS$10);
            }
            target.set(status);
        }
    }
    
    /**
     * Gets the "priority" element
     */
    public int getPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "priority" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority xgetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority)get_store().find_element_user(PRIORITY$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "priority" element
     */
    public void setPriority(int priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIORITY$12);
            }
            target.setIntValue(priority);
        }
    }
    
    /**
     * Sets (as xml) the "priority" element
     */
    public void xsetPriority(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority)get_store().find_element_user(PRIORITY$12, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority)get_store().add_element_user(PRIORITY$12);
            }
            target.set(priority);
        }
    }
    
    /**
     * Gets the "createdTime" element
     */
    public java.util.Calendar getCreatedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDTIME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "createdTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCreatedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDTIME$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "createdTime" element
     */
    public boolean isSetCreatedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDTIME$14) != 0;
        }
    }
    
    /**
     * Sets the "createdTime" element
     */
    public void setCreatedTime(java.util.Calendar createdTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDTIME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDTIME$14);
            }
            target.setCalendarValue(createdTime);
        }
    }
    
    /**
     * Sets (as xml) the "createdTime" element
     */
    public void xsetCreatedTime(org.apache.xmlbeans.XmlDateTime createdTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDTIME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATEDTIME$14);
            }
            target.set(createdTime);
        }
    }
    
    /**
     * Unsets the "createdTime" element
     */
    public void unsetCreatedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDTIME$14, 0);
        }
    }
}
