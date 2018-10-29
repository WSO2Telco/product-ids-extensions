/*
 * XML Type:  tTaskDetails
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * An XML tTaskDetails(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public class TTaskDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails
{
    private static final long serialVersionUID = 1L;
    
    public TTaskDetailsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "id");
    private static final javax.xml.namespace.QName TASKTYPE$2 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "taskType");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "name");
    private static final javax.xml.namespace.QName STATUS$6 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "status");
    private static final javax.xml.namespace.QName PRIORITY$8 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "priority");
    private static final javax.xml.namespace.QName TASKINITIATOR$10 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "taskInitiator");
    private static final javax.xml.namespace.QName TASKSTAKEHOLDERS$12 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "taskStakeholders");
    private static final javax.xml.namespace.QName POTENTIALOWNERS$14 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "potentialOwners");
    private static final javax.xml.namespace.QName BUSINESSADMINISTRATORS$16 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "businessAdministrators");
    private static final javax.xml.namespace.QName ACTUALOWNER$18 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "actualOwner");
    private static final javax.xml.namespace.QName NOTIFICATIONRECIPIENTS$20 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "notificationRecipients");
    private static final javax.xml.namespace.QName CREATEDTIME$22 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "createdTime");
    private static final javax.xml.namespace.QName CREATEDBY$24 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "createdBy");
    private static final javax.xml.namespace.QName LASTMODIFIEDTIME$26 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "lastModifiedTime");
    private static final javax.xml.namespace.QName LASTMODIFIEDBY$28 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "lastModifiedBy");
    private static final javax.xml.namespace.QName ACTIVATIONTIME$30 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "activationTime");
    private static final javax.xml.namespace.QName EXPIRATIONTIME$32 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "expirationTime");
    private static final javax.xml.namespace.QName ISSKIPABLE$34 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "isSkipable");
    private static final javax.xml.namespace.QName HASPOTENTIALOWNERS$36 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "hasPotentialOwners");
    private static final javax.xml.namespace.QName STARTBYTIMEEXISTS$38 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "startByTimeExists");
    private static final javax.xml.namespace.QName COMPLETEBYTIMEEXISTS$40 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "completeByTimeExists");
    private static final javax.xml.namespace.QName PRESENTATIONNAME$42 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "presentationName");
    private static final javax.xml.namespace.QName PRESENTATIONSUBJECT$44 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "presentationSubject");
    private static final javax.xml.namespace.QName RENDERINGMETHODEXISTS$46 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "renderingMethodExists");
    private static final javax.xml.namespace.QName HASOUTPUT$48 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "hasOutput");
    private static final javax.xml.namespace.QName HASFAULT$50 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "hasFault");
    private static final javax.xml.namespace.QName HASATTACHMENTS$52 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "hasAttachments");
    private static final javax.xml.namespace.QName HASCOMMENTS$54 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "hasComments");
    private static final javax.xml.namespace.QName ESCALATED$56 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "escalated");
    private static final javax.xml.namespace.QName SEARCHBY$58 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "searchBy");
    private static final javax.xml.namespace.QName OUTCOME$60 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "outcome");
    private static final javax.xml.namespace.QName PARENTTASKID$62 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "parentTaskId");
    private static final javax.xml.namespace.QName HASSUBTASKS$64 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "hasSubTasks");
    
    
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
     * Gets the "status" element
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$6, 0);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().find_element_user(STATUS$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$6);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().find_element_user(STATUS$6, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().add_element_user(STATUS$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$8, 0);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority)get_store().find_element_user(PRIORITY$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "priority" element
     */
    public boolean isSetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIORITY$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIORITY$8);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority)get_store().find_element_user(PRIORITY$8, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority)get_store().add_element_user(PRIORITY$8);
            }
            target.set(priority);
        }
    }
    
    /**
     * Unsets the "priority" element
     */
    public void unsetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIORITY$8, 0);
        }
    }
    
    /**
     * Gets the "taskInitiator" element
     */
    public java.lang.String getTaskInitiator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKINITIATOR$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "taskInitiator" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser xgetTaskInitiator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(TASKINITIATOR$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "taskInitiator" element
     */
    public boolean isSetTaskInitiator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TASKINITIATOR$10) != 0;
        }
    }
    
    /**
     * Sets the "taskInitiator" element
     */
    public void setTaskInitiator(java.lang.String taskInitiator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKINITIATOR$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKINITIATOR$10);
            }
            target.setStringValue(taskInitiator);
        }
    }
    
    /**
     * Sets (as xml) the "taskInitiator" element
     */
    public void xsetTaskInitiator(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser taskInitiator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(TASKINITIATOR$10, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().add_element_user(TASKINITIATOR$10);
            }
            target.set(taskInitiator);
        }
    }
    
    /**
     * Unsets the "taskInitiator" element
     */
    public void unsetTaskInitiator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TASKINITIATOR$10, 0);
        }
    }
    
    /**
     * Gets the "taskStakeholders" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity getTaskStakeholders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().find_element_user(TASKSTAKEHOLDERS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "taskStakeholders" element
     */
    public boolean isSetTaskStakeholders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TASKSTAKEHOLDERS$12) != 0;
        }
    }
    
    /**
     * Sets the "taskStakeholders" element
     */
    public void setTaskStakeholders(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity taskStakeholders)
    {
        generatedSetterHelperImpl(taskStakeholders, TASKSTAKEHOLDERS$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "taskStakeholders" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity addNewTaskStakeholders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().add_element_user(TASKSTAKEHOLDERS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "taskStakeholders" element
     */
    public void unsetTaskStakeholders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TASKSTAKEHOLDERS$12, 0);
        }
    }
    
    /**
     * Gets the "potentialOwners" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity getPotentialOwners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().find_element_user(POTENTIALOWNERS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "potentialOwners" element
     */
    public boolean isSetPotentialOwners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POTENTIALOWNERS$14) != 0;
        }
    }
    
    /**
     * Sets the "potentialOwners" element
     */
    public void setPotentialOwners(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity potentialOwners)
    {
        generatedSetterHelperImpl(potentialOwners, POTENTIALOWNERS$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "potentialOwners" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity addNewPotentialOwners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().add_element_user(POTENTIALOWNERS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "potentialOwners" element
     */
    public void unsetPotentialOwners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POTENTIALOWNERS$14, 0);
        }
    }
    
    /**
     * Gets the "businessAdministrators" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity getBusinessAdministrators()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().find_element_user(BUSINESSADMINISTRATORS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "businessAdministrators" element
     */
    public boolean isSetBusinessAdministrators()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSADMINISTRATORS$16) != 0;
        }
    }
    
    /**
     * Sets the "businessAdministrators" element
     */
    public void setBusinessAdministrators(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity businessAdministrators)
    {
        generatedSetterHelperImpl(businessAdministrators, BUSINESSADMINISTRATORS$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "businessAdministrators" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity addNewBusinessAdministrators()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().add_element_user(BUSINESSADMINISTRATORS$16);
            return target;
        }
    }
    
    /**
     * Unsets the "businessAdministrators" element
     */
    public void unsetBusinessAdministrators()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSADMINISTRATORS$16, 0);
        }
    }
    
    /**
     * Gets the "actualOwner" element
     */
    public java.lang.String getActualOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTUALOWNER$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "actualOwner" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser xgetActualOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(ACTUALOWNER$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "actualOwner" element
     */
    public boolean isSetActualOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTUALOWNER$18) != 0;
        }
    }
    
    /**
     * Sets the "actualOwner" element
     */
    public void setActualOwner(java.lang.String actualOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTUALOWNER$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTUALOWNER$18);
            }
            target.setStringValue(actualOwner);
        }
    }
    
    /**
     * Sets (as xml) the "actualOwner" element
     */
    public void xsetActualOwner(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser actualOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(ACTUALOWNER$18, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().add_element_user(ACTUALOWNER$18);
            }
            target.set(actualOwner);
        }
    }
    
    /**
     * Unsets the "actualOwner" element
     */
    public void unsetActualOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTUALOWNER$18, 0);
        }
    }
    
    /**
     * Gets the "notificationRecipients" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity getNotificationRecipients()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().find_element_user(NOTIFICATIONRECIPIENTS$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "notificationRecipients" element
     */
    public boolean isSetNotificationRecipients()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTIFICATIONRECIPIENTS$20) != 0;
        }
    }
    
    /**
     * Sets the "notificationRecipients" element
     */
    public void setNotificationRecipients(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity notificationRecipients)
    {
        generatedSetterHelperImpl(notificationRecipients, NOTIFICATIONRECIPIENTS$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "notificationRecipients" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity addNewNotificationRecipients()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().add_element_user(NOTIFICATIONRECIPIENTS$20);
            return target;
        }
    }
    
    /**
     * Unsets the "notificationRecipients" element
     */
    public void unsetNotificationRecipients()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTIFICATIONRECIPIENTS$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDTIME$22, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDTIME$22, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDTIME$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDTIME$22);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDTIME$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATEDTIME$22);
            }
            target.set(createdTime);
        }
    }
    
    /**
     * Gets the "createdBy" element
     */
    public java.lang.String getCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDBY$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "createdBy" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser xgetCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(CREATEDBY$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "createdBy" element
     */
    public boolean isSetCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDBY$24) != 0;
        }
    }
    
    /**
     * Sets the "createdBy" element
     */
    public void setCreatedBy(java.lang.String createdBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDBY$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDBY$24);
            }
            target.setStringValue(createdBy);
        }
    }
    
    /**
     * Sets (as xml) the "createdBy" element
     */
    public void xsetCreatedBy(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser createdBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(CREATEDBY$24, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().add_element_user(CREATEDBY$24);
            }
            target.set(createdBy);
        }
    }
    
    /**
     * Unsets the "createdBy" element
     */
    public void unsetCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDBY$24, 0);
        }
    }
    
    /**
     * Gets the "lastModifiedTime" element
     */
    public java.util.Calendar getLastModifiedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTMODIFIEDTIME$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "lastModifiedTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetLastModifiedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTMODIFIEDTIME$26, 0);
            return target;
        }
    }
    
    /**
     * Sets the "lastModifiedTime" element
     */
    public void setLastModifiedTime(java.util.Calendar lastModifiedTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTMODIFIEDTIME$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTMODIFIEDTIME$26);
            }
            target.setCalendarValue(lastModifiedTime);
        }
    }
    
    /**
     * Sets (as xml) the "lastModifiedTime" element
     */
    public void xsetLastModifiedTime(org.apache.xmlbeans.XmlDateTime lastModifiedTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTMODIFIEDTIME$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LASTMODIFIEDTIME$26);
            }
            target.set(lastModifiedTime);
        }
    }
    
    /**
     * Gets the "lastModifiedBy" element
     */
    public java.lang.String getLastModifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTMODIFIEDBY$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lastModifiedBy" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser xgetLastModifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(LASTMODIFIEDBY$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "lastModifiedBy" element
     */
    public boolean isSetLastModifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTMODIFIEDBY$28) != 0;
        }
    }
    
    /**
     * Sets the "lastModifiedBy" element
     */
    public void setLastModifiedBy(java.lang.String lastModifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTMODIFIEDBY$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTMODIFIEDBY$28);
            }
            target.setStringValue(lastModifiedBy);
        }
    }
    
    /**
     * Sets (as xml) the "lastModifiedBy" element
     */
    public void xsetLastModifiedBy(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser lastModifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(LASTMODIFIEDBY$28, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().add_element_user(LASTMODIFIEDBY$28);
            }
            target.set(lastModifiedBy);
        }
    }
    
    /**
     * Unsets the "lastModifiedBy" element
     */
    public void unsetLastModifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTMODIFIEDBY$28, 0);
        }
    }
    
    /**
     * Gets the "activationTime" element
     */
    public java.util.Calendar getActivationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVATIONTIME$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "activationTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetActivationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ACTIVATIONTIME$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "activationTime" element
     */
    public boolean isSetActivationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVATIONTIME$30) != 0;
        }
    }
    
    /**
     * Sets the "activationTime" element
     */
    public void setActivationTime(java.util.Calendar activationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVATIONTIME$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVATIONTIME$30);
            }
            target.setCalendarValue(activationTime);
        }
    }
    
    /**
     * Sets (as xml) the "activationTime" element
     */
    public void xsetActivationTime(org.apache.xmlbeans.XmlDateTime activationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ACTIVATIONTIME$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ACTIVATIONTIME$30);
            }
            target.set(activationTime);
        }
    }
    
    /**
     * Unsets the "activationTime" element
     */
    public void unsetActivationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVATIONTIME$30, 0);
        }
    }
    
    /**
     * Gets the "expirationTime" element
     */
    public java.util.Calendar getExpirationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONTIME$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "expirationTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetExpirationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXPIRATIONTIME$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "expirationTime" element
     */
    public boolean isSetExpirationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPIRATIONTIME$32) != 0;
        }
    }
    
    /**
     * Sets the "expirationTime" element
     */
    public void setExpirationTime(java.util.Calendar expirationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONTIME$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPIRATIONTIME$32);
            }
            target.setCalendarValue(expirationTime);
        }
    }
    
    /**
     * Sets (as xml) the "expirationTime" element
     */
    public void xsetExpirationTime(org.apache.xmlbeans.XmlDateTime expirationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXPIRATIONTIME$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EXPIRATIONTIME$32);
            }
            target.set(expirationTime);
        }
    }
    
    /**
     * Unsets the "expirationTime" element
     */
    public void unsetExpirationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPIRATIONTIME$32, 0);
        }
    }
    
    /**
     * Gets the "isSkipable" element
     */
    public boolean getIsSkipable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSKIPABLE$34, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isSkipable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsSkipable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSKIPABLE$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "isSkipable" element
     */
    public boolean isSetIsSkipable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSKIPABLE$34) != 0;
        }
    }
    
    /**
     * Sets the "isSkipable" element
     */
    public void setIsSkipable(boolean isSkipable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSKIPABLE$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSKIPABLE$34);
            }
            target.setBooleanValue(isSkipable);
        }
    }
    
    /**
     * Sets (as xml) the "isSkipable" element
     */
    public void xsetIsSkipable(org.apache.xmlbeans.XmlBoolean isSkipable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSKIPABLE$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISSKIPABLE$34);
            }
            target.set(isSkipable);
        }
    }
    
    /**
     * Unsets the "isSkipable" element
     */
    public void unsetIsSkipable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSKIPABLE$34, 0);
        }
    }
    
    /**
     * Gets the "hasPotentialOwners" element
     */
    public boolean getHasPotentialOwners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASPOTENTIALOWNERS$36, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hasPotentialOwners" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasPotentialOwners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASPOTENTIALOWNERS$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "hasPotentialOwners" element
     */
    public boolean isSetHasPotentialOwners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASPOTENTIALOWNERS$36) != 0;
        }
    }
    
    /**
     * Sets the "hasPotentialOwners" element
     */
    public void setHasPotentialOwners(boolean hasPotentialOwners)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASPOTENTIALOWNERS$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASPOTENTIALOWNERS$36);
            }
            target.setBooleanValue(hasPotentialOwners);
        }
    }
    
    /**
     * Sets (as xml) the "hasPotentialOwners" element
     */
    public void xsetHasPotentialOwners(org.apache.xmlbeans.XmlBoolean hasPotentialOwners)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASPOTENTIALOWNERS$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASPOTENTIALOWNERS$36);
            }
            target.set(hasPotentialOwners);
        }
    }
    
    /**
     * Unsets the "hasPotentialOwners" element
     */
    public void unsetHasPotentialOwners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASPOTENTIALOWNERS$36, 0);
        }
    }
    
    /**
     * Gets the "startByTimeExists" element
     */
    public boolean getStartByTimeExists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTBYTIMEEXISTS$38, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "startByTimeExists" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetStartByTimeExists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(STARTBYTIMEEXISTS$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "startByTimeExists" element
     */
    public boolean isSetStartByTimeExists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTBYTIMEEXISTS$38) != 0;
        }
    }
    
    /**
     * Sets the "startByTimeExists" element
     */
    public void setStartByTimeExists(boolean startByTimeExists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTBYTIMEEXISTS$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTBYTIMEEXISTS$38);
            }
            target.setBooleanValue(startByTimeExists);
        }
    }
    
    /**
     * Sets (as xml) the "startByTimeExists" element
     */
    public void xsetStartByTimeExists(org.apache.xmlbeans.XmlBoolean startByTimeExists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(STARTBYTIMEEXISTS$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(STARTBYTIMEEXISTS$38);
            }
            target.set(startByTimeExists);
        }
    }
    
    /**
     * Unsets the "startByTimeExists" element
     */
    public void unsetStartByTimeExists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTBYTIMEEXISTS$38, 0);
        }
    }
    
    /**
     * Gets the "completeByTimeExists" element
     */
    public boolean getCompleteByTimeExists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPLETEBYTIMEEXISTS$40, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "completeByTimeExists" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCompleteByTimeExists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(COMPLETEBYTIMEEXISTS$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "completeByTimeExists" element
     */
    public boolean isSetCompleteByTimeExists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLETEBYTIMEEXISTS$40) != 0;
        }
    }
    
    /**
     * Sets the "completeByTimeExists" element
     */
    public void setCompleteByTimeExists(boolean completeByTimeExists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPLETEBYTIMEEXISTS$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPLETEBYTIMEEXISTS$40);
            }
            target.setBooleanValue(completeByTimeExists);
        }
    }
    
    /**
     * Sets (as xml) the "completeByTimeExists" element
     */
    public void xsetCompleteByTimeExists(org.apache.xmlbeans.XmlBoolean completeByTimeExists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(COMPLETEBYTIMEEXISTS$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(COMPLETEBYTIMEEXISTS$40);
            }
            target.set(completeByTimeExists);
        }
    }
    
    /**
     * Unsets the "completeByTimeExists" element
     */
    public void unsetCompleteByTimeExists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLETEBYTIMEEXISTS$40, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTATIONNAME$42, 0);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName)get_store().find_element_user(PRESENTATIONNAME$42, 0);
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
            return get_store().count_elements(PRESENTATIONNAME$42) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTATIONNAME$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRESENTATIONNAME$42);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName)get_store().find_element_user(PRESENTATIONNAME$42, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName)get_store().add_element_user(PRESENTATIONNAME$42);
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
            get_store().remove_element(PRESENTATIONNAME$42, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTATIONSUBJECT$44, 0);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject)get_store().find_element_user(PRESENTATIONSUBJECT$44, 0);
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
            return get_store().count_elements(PRESENTATIONSUBJECT$44) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTATIONSUBJECT$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRESENTATIONSUBJECT$44);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject)get_store().find_element_user(PRESENTATIONSUBJECT$44, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject)get_store().add_element_user(PRESENTATIONSUBJECT$44);
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
            get_store().remove_element(PRESENTATIONSUBJECT$44, 0);
        }
    }
    
    /**
     * Gets the "renderingMethodExists" element
     */
    public boolean getRenderingMethodExists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGMETHODEXISTS$46, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "renderingMethodExists" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetRenderingMethodExists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RENDERINGMETHODEXISTS$46, 0);
            return target;
        }
    }
    
    /**
     * Sets the "renderingMethodExists" element
     */
    public void setRenderingMethodExists(boolean renderingMethodExists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGMETHODEXISTS$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RENDERINGMETHODEXISTS$46);
            }
            target.setBooleanValue(renderingMethodExists);
        }
    }
    
    /**
     * Sets (as xml) the "renderingMethodExists" element
     */
    public void xsetRenderingMethodExists(org.apache.xmlbeans.XmlBoolean renderingMethodExists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RENDERINGMETHODEXISTS$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RENDERINGMETHODEXISTS$46);
            }
            target.set(renderingMethodExists);
        }
    }
    
    /**
     * Gets the "hasOutput" element
     */
    public boolean getHasOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASOUTPUT$48, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hasOutput" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASOUTPUT$48, 0);
            return target;
        }
    }
    
    /**
     * True if has "hasOutput" element
     */
    public boolean isSetHasOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASOUTPUT$48) != 0;
        }
    }
    
    /**
     * Sets the "hasOutput" element
     */
    public void setHasOutput(boolean hasOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASOUTPUT$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASOUTPUT$48);
            }
            target.setBooleanValue(hasOutput);
        }
    }
    
    /**
     * Sets (as xml) the "hasOutput" element
     */
    public void xsetHasOutput(org.apache.xmlbeans.XmlBoolean hasOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASOUTPUT$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASOUTPUT$48);
            }
            target.set(hasOutput);
        }
    }
    
    /**
     * Unsets the "hasOutput" element
     */
    public void unsetHasOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASOUTPUT$48, 0);
        }
    }
    
    /**
     * Gets the "hasFault" element
     */
    public boolean getHasFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASFAULT$50, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hasFault" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASFAULT$50, 0);
            return target;
        }
    }
    
    /**
     * True if has "hasFault" element
     */
    public boolean isSetHasFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASFAULT$50) != 0;
        }
    }
    
    /**
     * Sets the "hasFault" element
     */
    public void setHasFault(boolean hasFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASFAULT$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASFAULT$50);
            }
            target.setBooleanValue(hasFault);
        }
    }
    
    /**
     * Sets (as xml) the "hasFault" element
     */
    public void xsetHasFault(org.apache.xmlbeans.XmlBoolean hasFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASFAULT$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASFAULT$50);
            }
            target.set(hasFault);
        }
    }
    
    /**
     * Unsets the "hasFault" element
     */
    public void unsetHasFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASFAULT$50, 0);
        }
    }
    
    /**
     * Gets the "hasAttachments" element
     */
    public boolean getHasAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASATTACHMENTS$52, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hasAttachments" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASATTACHMENTS$52, 0);
            return target;
        }
    }
    
    /**
     * True if has "hasAttachments" element
     */
    public boolean isSetHasAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASATTACHMENTS$52) != 0;
        }
    }
    
    /**
     * Sets the "hasAttachments" element
     */
    public void setHasAttachments(boolean hasAttachments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASATTACHMENTS$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASATTACHMENTS$52);
            }
            target.setBooleanValue(hasAttachments);
        }
    }
    
    /**
     * Sets (as xml) the "hasAttachments" element
     */
    public void xsetHasAttachments(org.apache.xmlbeans.XmlBoolean hasAttachments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASATTACHMENTS$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASATTACHMENTS$52);
            }
            target.set(hasAttachments);
        }
    }
    
    /**
     * Unsets the "hasAttachments" element
     */
    public void unsetHasAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASATTACHMENTS$52, 0);
        }
    }
    
    /**
     * Gets the "hasComments" element
     */
    public boolean getHasComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASCOMMENTS$54, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hasComments" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASCOMMENTS$54, 0);
            return target;
        }
    }
    
    /**
     * True if has "hasComments" element
     */
    public boolean isSetHasComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASCOMMENTS$54) != 0;
        }
    }
    
    /**
     * Sets the "hasComments" element
     */
    public void setHasComments(boolean hasComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASCOMMENTS$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASCOMMENTS$54);
            }
            target.setBooleanValue(hasComments);
        }
    }
    
    /**
     * Sets (as xml) the "hasComments" element
     */
    public void xsetHasComments(org.apache.xmlbeans.XmlBoolean hasComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASCOMMENTS$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASCOMMENTS$54);
            }
            target.set(hasComments);
        }
    }
    
    /**
     * Unsets the "hasComments" element
     */
    public void unsetHasComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASCOMMENTS$54, 0);
        }
    }
    
    /**
     * Gets the "escalated" element
     */
    public boolean getEscalated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESCALATED$56, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "escalated" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetEscalated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ESCALATED$56, 0);
            return target;
        }
    }
    
    /**
     * True if has "escalated" element
     */
    public boolean isSetEscalated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESCALATED$56) != 0;
        }
    }
    
    /**
     * Sets the "escalated" element
     */
    public void setEscalated(boolean escalated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESCALATED$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESCALATED$56);
            }
            target.setBooleanValue(escalated);
        }
    }
    
    /**
     * Sets (as xml) the "escalated" element
     */
    public void xsetEscalated(org.apache.xmlbeans.XmlBoolean escalated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ESCALATED$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ESCALATED$56);
            }
            target.set(escalated);
        }
    }
    
    /**
     * Unsets the "escalated" element
     */
    public void unsetEscalated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESCALATED$56, 0);
        }
    }
    
    /**
     * Gets the "searchBy" element
     */
    public java.lang.String getSearchBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHBY$58, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "searchBy" element
     */
    public org.apache.xmlbeans.XmlString xgetSearchBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHBY$58, 0);
            return target;
        }
    }
    
    /**
     * True if has "searchBy" element
     */
    public boolean isSetSearchBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEARCHBY$58) != 0;
        }
    }
    
    /**
     * Sets the "searchBy" element
     */
    public void setSearchBy(java.lang.String searchBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHBY$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHBY$58);
            }
            target.setStringValue(searchBy);
        }
    }
    
    /**
     * Sets (as xml) the "searchBy" element
     */
    public void xsetSearchBy(org.apache.xmlbeans.XmlString searchBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHBY$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEARCHBY$58);
            }
            target.set(searchBy);
        }
    }
    
    /**
     * Unsets the "searchBy" element
     */
    public void unsetSearchBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEARCHBY$58, 0);
        }
    }
    
    /**
     * Gets the "outcome" element
     */
    public java.lang.String getOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTCOME$60, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "outcome" element
     */
    public org.apache.xmlbeans.XmlString xgetOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTCOME$60, 0);
            return target;
        }
    }
    
    /**
     * True if has "outcome" element
     */
    public boolean isSetOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTCOME$60) != 0;
        }
    }
    
    /**
     * Sets the "outcome" element
     */
    public void setOutcome(java.lang.String outcome)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTCOME$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTCOME$60);
            }
            target.setStringValue(outcome);
        }
    }
    
    /**
     * Sets (as xml) the "outcome" element
     */
    public void xsetOutcome(org.apache.xmlbeans.XmlString outcome)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTCOME$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OUTCOME$60);
            }
            target.set(outcome);
        }
    }
    
    /**
     * Unsets the "outcome" element
     */
    public void unsetOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTCOME$60, 0);
        }
    }
    
    /**
     * Gets the "parentTaskId" element
     */
    public java.lang.String getParentTaskId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTTASKID$62, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "parentTaskId" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetParentTaskId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PARENTTASKID$62, 0);
            return target;
        }
    }
    
    /**
     * True if has "parentTaskId" element
     */
    public boolean isSetParentTaskId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTTASKID$62) != 0;
        }
    }
    
    /**
     * Sets the "parentTaskId" element
     */
    public void setParentTaskId(java.lang.String parentTaskId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTTASKID$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTTASKID$62);
            }
            target.setStringValue(parentTaskId);
        }
    }
    
    /**
     * Sets (as xml) the "parentTaskId" element
     */
    public void xsetParentTaskId(org.apache.xmlbeans.XmlAnyURI parentTaskId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PARENTTASKID$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PARENTTASKID$62);
            }
            target.set(parentTaskId);
        }
    }
    
    /**
     * Unsets the "parentTaskId" element
     */
    public void unsetParentTaskId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTTASKID$62, 0);
        }
    }
    
    /**
     * Gets the "hasSubTasks" element
     */
    public boolean getHasSubTasks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASSUBTASKS$64, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hasSubTasks" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasSubTasks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASSUBTASKS$64, 0);
            return target;
        }
    }
    
    /**
     * True if has "hasSubTasks" element
     */
    public boolean isSetHasSubTasks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASSUBTASKS$64) != 0;
        }
    }
    
    /**
     * Sets the "hasSubTasks" element
     */
    public void setHasSubTasks(boolean hasSubTasks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASSUBTASKS$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASSUBTASKS$64);
            }
            target.setBooleanValue(hasSubTasks);
        }
    }
    
    /**
     * Sets (as xml) the "hasSubTasks" element
     */
    public void xsetHasSubTasks(org.apache.xmlbeans.XmlBoolean hasSubTasks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASSUBTASKS$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASSUBTASKS$64);
            }
            target.set(hasSubTasks);
        }
    }
    
    /**
     * Unsets the "hasSubTasks" element
     */
    public void unsetHasSubTasks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASSUBTASKS$64, 0);
        }
    }
}
