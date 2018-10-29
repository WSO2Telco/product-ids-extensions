/*
 * An XML document type.
 * Localname: taskEvent
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * A document containing one taskEvent(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public class TaskEventDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaskEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TASKEVENT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "taskEvent");
    
    
    /**
     * Gets the "taskEvent" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument.TaskEvent getTaskEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument.TaskEvent target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument.TaskEvent)get_store().find_element_user(TASKEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "taskEvent" element
     */
    public void setTaskEvent(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument.TaskEvent taskEvent)
    {
        generatedSetterHelperImpl(taskEvent, TASKEVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "taskEvent" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument.TaskEvent addNewTaskEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument.TaskEvent target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument.TaskEvent)get_store().add_element_user(TASKEVENT$0);
            return target;
        }
    }
    /**
     * An XML taskEvent(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
     *
     * This is a complex type.
     */
    public static class TaskEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument.TaskEvent
    {
        private static final long serialVersionUID = 1L;
        
        public TaskEventImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "id");
        private static final javax.xml.namespace.QName EVENTTIME$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "eventTime");
        private static final javax.xml.namespace.QName IDENTIFIER$4 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "identifier");
        private static final javax.xml.namespace.QName PRINCIPAL$6 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "principal");
        private static final javax.xml.namespace.QName EVENTTYPE$8 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "eventType");
        private static final javax.xml.namespace.QName STARTOWNER$10 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "startOwner");
        private static final javax.xml.namespace.QName ENDOWNER$12 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "endOwner");
        private static final javax.xml.namespace.QName STATUS$14 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "status");
        private static final javax.xml.namespace.QName HASDATA$16 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "hasData");
        private static final javax.xml.namespace.QName EVENTDATA$18 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "eventData");
        private static final javax.xml.namespace.QName FAULTNAME$20 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "faultName");
        
        
        /**
         * Gets the "id" element
         */
        public java.math.BigInteger getId()
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
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" element
         */
        public org.apache.xmlbeans.XmlInteger xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(java.math.BigInteger id)
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
                target.setBigIntegerValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" element
         */
        public void xsetId(org.apache.xmlbeans.XmlInteger id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ID$0);
                }
                target.set(id);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTIME$2, 0);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EVENTTIME$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTTIME$2);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EVENTTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EVENTTIME$2);
                }
                target.set(eventTime);
            }
        }
        
        /**
         * Gets the "identifier" element
         */
        public java.lang.String getIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIER$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "identifier" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(IDENTIFIER$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "identifier" element
         */
        public void setIdentifier(java.lang.String identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFIER$4);
                }
                target.setStringValue(identifier);
            }
        }
        
        /**
         * Sets (as xml) the "identifier" element
         */
        public void xsetIdentifier(org.apache.xmlbeans.XmlAnyURI identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(IDENTIFIER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(IDENTIFIER$4);
                }
                target.set(identifier);
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
         * Tests for nil "principal" element
         */
        public boolean isNilPrincipal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRINCIPAL$6, 0);
                if (target == null) return false;
                return target.isNil();
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
         * Nils the "principal" element
         */
        public void setNilPrincipal()
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
                target.setNil();
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
         * Gets the "eventType" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum getEventType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTYPE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "eventType" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType xgetEventType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType)get_store().find_element_user(EVENTTYPE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "eventType" element
         */
        public void setEventType(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum eventType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTYPE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTTYPE$8);
                }
                target.setEnumValue(eventType);
            }
        }
        
        /**
         * Sets (as xml) the "eventType" element
         */
        public void xsetEventType(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType eventType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType)get_store().find_element_user(EVENTTYPE$8, 0);
                if (target == null)
                {
                    target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType)get_store().add_element_user(EVENTTYPE$8);
                }
                target.set(eventType);
            }
        }
        
        /**
         * Gets the "startOwner" element
         */
        public java.lang.String getStartOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTOWNER$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "startOwner" element
         */
        public org.apache.xmlbeans.XmlString xgetStartOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTOWNER$10, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "startOwner" element
         */
        public boolean isNilStartOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTOWNER$10, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "startOwner" element
         */
        public boolean isSetStartOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STARTOWNER$10) != 0;
            }
        }
        
        /**
         * Sets the "startOwner" element
         */
        public void setStartOwner(java.lang.String startOwner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTOWNER$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTOWNER$10);
                }
                target.setStringValue(startOwner);
            }
        }
        
        /**
         * Sets (as xml) the "startOwner" element
         */
        public void xsetStartOwner(org.apache.xmlbeans.XmlString startOwner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTOWNER$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STARTOWNER$10);
                }
                target.set(startOwner);
            }
        }
        
        /**
         * Nils the "startOwner" element
         */
        public void setNilStartOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTOWNER$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STARTOWNER$10);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "startOwner" element
         */
        public void unsetStartOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STARTOWNER$10, 0);
            }
        }
        
        /**
         * Gets the "endOwner" element
         */
        public java.lang.String getEndOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDOWNER$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "endOwner" element
         */
        public org.apache.xmlbeans.XmlString xgetEndOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDOWNER$12, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "endOwner" element
         */
        public boolean isNilEndOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDOWNER$12, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "endOwner" element
         */
        public boolean isSetEndOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENDOWNER$12) != 0;
            }
        }
        
        /**
         * Sets the "endOwner" element
         */
        public void setEndOwner(java.lang.String endOwner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDOWNER$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDOWNER$12);
                }
                target.setStringValue(endOwner);
            }
        }
        
        /**
         * Sets (as xml) the "endOwner" element
         */
        public void xsetEndOwner(org.apache.xmlbeans.XmlString endOwner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDOWNER$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENDOWNER$12);
                }
                target.set(endOwner);
            }
        }
        
        /**
         * Nils the "endOwner" element
         */
        public void setNilEndOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDOWNER$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENDOWNER$12);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "endOwner" element
         */
        public void unsetEndOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENDOWNER$12, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$14, 0);
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
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().find_element_user(STATUS$14, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$14);
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
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().find_element_user(STATUS$14, 0);
                if (target == null)
                {
                    target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().add_element_user(STATUS$14);
                }
                target.set(status);
            }
        }
        
        /**
         * Gets the "hasData" element
         */
        public boolean getHasData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASDATA$16, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "hasData" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetHasData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASDATA$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "hasData" element
         */
        public boolean isSetHasData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HASDATA$16) != 0;
            }
        }
        
        /**
         * Sets the "hasData" element
         */
        public void setHasData(boolean hasData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASDATA$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASDATA$16);
                }
                target.setBooleanValue(hasData);
            }
        }
        
        /**
         * Sets (as xml) the "hasData" element
         */
        public void xsetHasData(org.apache.xmlbeans.XmlBoolean hasData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASDATA$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASDATA$16);
                }
                target.set(hasData);
            }
        }
        
        /**
         * Unsets the "hasData" element
         */
        public void unsetHasData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HASDATA$16, 0);
            }
        }
        
        /**
         * Gets the "eventData" element
         */
        public org.apache.xmlbeans.XmlObject getEventData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(EVENTDATA$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "eventData" element
         */
        public boolean isNilEventData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(EVENTDATA$18, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "eventData" element
         */
        public boolean isSetEventData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EVENTDATA$18) != 0;
            }
        }
        
        /**
         * Sets the "eventData" element
         */
        public void setEventData(org.apache.xmlbeans.XmlObject eventData)
        {
            generatedSetterHelperImpl(eventData, EVENTDATA$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "eventData" element
         */
        public org.apache.xmlbeans.XmlObject addNewEventData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(EVENTDATA$18);
                return target;
            }
        }
        
        /**
         * Nils the "eventData" element
         */
        public void setNilEventData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(EVENTDATA$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(EVENTDATA$18);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "eventData" element
         */
        public void unsetEventData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EVENTDATA$18, 0);
            }
        }
        
        /**
         * Gets the "faultName" element
         */
        public java.lang.String getFaultName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTNAME$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "faultName" element
         */
        public org.apache.xmlbeans.XmlString xgetFaultName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAULTNAME$20, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "faultName" element
         */
        public boolean isNilFaultName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAULTNAME$20, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "faultName" element
         */
        public boolean isSetFaultName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FAULTNAME$20) != 0;
            }
        }
        
        /**
         * Sets the "faultName" element
         */
        public void setFaultName(java.lang.String faultName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTNAME$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAULTNAME$20);
                }
                target.setStringValue(faultName);
            }
        }
        
        /**
         * Sets (as xml) the "faultName" element
         */
        public void xsetFaultName(org.apache.xmlbeans.XmlString faultName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAULTNAME$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAULTNAME$20);
                }
                target.set(faultName);
            }
        }
        
        /**
         * Nils the "faultName" element
         */
        public void setNilFaultName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAULTNAME$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAULTNAME$20);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "faultName" element
         */
        public void unsetFaultName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FAULTNAME$20, 0);
            }
        }
    }
}
