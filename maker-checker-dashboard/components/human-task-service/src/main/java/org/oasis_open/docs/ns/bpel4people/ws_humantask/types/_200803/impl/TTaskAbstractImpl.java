/*
 * XML Type:  tTaskAbstract
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * An XML tTaskAbstract(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public class TTaskAbstractImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract
{
    private static final long serialVersionUID = 1L;
    
    public TTaskAbstractImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName UPDATEDTIME$24 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "updatedTime");
    private static final javax.xml.namespace.QName ACTIVATIONTIME$26 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "activationTime");
    private static final javax.xml.namespace.QName EXPIRATIONTIME$28 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "expirationTime");
    private static final javax.xml.namespace.QName ISSKIPABLE$30 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "isSkipable");
    private static final javax.xml.namespace.QName HASPOTENTIALOWNERS$32 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "hasPotentialOwners");
    private static final javax.xml.namespace.QName STARTBYTIMEEXISTS$34 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "startByTimeExists");
    private static final javax.xml.namespace.QName COMPLETEBYTIMEEXISTS$36 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "completeByTimeExists");
    private static final javax.xml.namespace.QName PRESENTATIONNAME$38 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "presentationName");
    private static final javax.xml.namespace.QName PRESENTATIONSUBJECT$40 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "presentationSubject");
    private static final javax.xml.namespace.QName PRESENTATIONDESCRIPTION$42 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "presentationDescription");
    private static final javax.xml.namespace.QName RENDERINGMETHODEXISTS$44 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "renderingMethodExists");
    private static final javax.xml.namespace.QName HASOUTPUT$46 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "hasOutput");
    private static final javax.xml.namespace.QName HASFAULT$48 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "hasFault");
    private static final javax.xml.namespace.QName HASATTACHMENTS$50 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "hasAttachments");
    private static final javax.xml.namespace.QName HASCOMMENTS$52 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "hasComments");
    private static final javax.xml.namespace.QName ESCALATED$54 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "escalated");
    private static final javax.xml.namespace.QName OUTCOME$56 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "outcome");
    private static final javax.xml.namespace.QName PARENTTASKID$58 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "parentTaskId");
    private static final javax.xml.namespace.QName HASSUBTASKS$60 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "hasSubTasks");
    private static final javax.xml.namespace.QName NUMBEROFCOMMENTS$62 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "numberOfComments");
    private static final javax.xml.namespace.QName NUMBEROFATTACHMENTS$64 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "numberOfAttachments");
    private static final javax.xml.namespace.QName PREVIOUSSTATUS$66 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "previousStatus");
    private static final javax.xml.namespace.QName RESPONSESERVICENAME$68 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "responseServiceName");
    private static final javax.xml.namespace.QName RESPONSEOPERATIONNAME$70 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "responseOperationName");
    private static final javax.xml.namespace.QName ISCLAIMABLE$72 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "isClaimable");
    private static final javax.xml.namespace.QName ISSTARTABLE$74 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "isStartable");
    private static final javax.xml.namespace.QName ISSTOPABLE$76 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "isStopable");
    private static final javax.xml.namespace.QName ISRELEASABLE$78 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "isReleasable");
    private static final javax.xml.namespace.QName ISSUSPENDABLE$80 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "isSuspendable");
    private static final javax.xml.namespace.QName ISRESUMABLE$82 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "isResumable");
    private static final javax.xml.namespace.QName ISCOMPLETABLE$84 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "isCompletable");
    private static final javax.xml.namespace.QName ISREMOVABLE$86 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "isRemovable");
    private static final javax.xml.namespace.QName ISFORWARDABLE$88 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "isForwardable");
    private static final javax.xml.namespace.QName ISDELEGATABLE$90 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "isDelegatable");
    private static final javax.xml.namespace.QName PACKAGENAME$92 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "packageName");
    private static final javax.xml.namespace.QName TENANTID$94 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "tenantId");
    
    
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
     * Gets the "updatedTime" element
     */
    public java.util.Calendar getUpdatedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATEDTIME$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "updatedTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetUpdatedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(UPDATEDTIME$24, 0);
            return target;
        }
    }
    
    /**
     * Sets the "updatedTime" element
     */
    public void setUpdatedTime(java.util.Calendar updatedTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATEDTIME$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATEDTIME$24);
            }
            target.setCalendarValue(updatedTime);
        }
    }
    
    /**
     * Sets (as xml) the "updatedTime" element
     */
    public void xsetUpdatedTime(org.apache.xmlbeans.XmlDateTime updatedTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(UPDATEDTIME$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(UPDATEDTIME$24);
            }
            target.set(updatedTime);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVATIONTIME$26, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ACTIVATIONTIME$26, 0);
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
            return get_store().count_elements(ACTIVATIONTIME$26) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVATIONTIME$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVATIONTIME$26);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ACTIVATIONTIME$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ACTIVATIONTIME$26);
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
            get_store().remove_element(ACTIVATIONTIME$26, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONTIME$28, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXPIRATIONTIME$28, 0);
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
            return get_store().count_elements(EXPIRATIONTIME$28) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONTIME$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPIRATIONTIME$28);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXPIRATIONTIME$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EXPIRATIONTIME$28);
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
            get_store().remove_element(EXPIRATIONTIME$28, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSKIPABLE$30, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSKIPABLE$30, 0);
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
            return get_store().count_elements(ISSKIPABLE$30) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSKIPABLE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSKIPABLE$30);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSKIPABLE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISSKIPABLE$30);
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
            get_store().remove_element(ISSKIPABLE$30, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASPOTENTIALOWNERS$32, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASPOTENTIALOWNERS$32, 0);
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
            return get_store().count_elements(HASPOTENTIALOWNERS$32) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASPOTENTIALOWNERS$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASPOTENTIALOWNERS$32);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASPOTENTIALOWNERS$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASPOTENTIALOWNERS$32);
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
            get_store().remove_element(HASPOTENTIALOWNERS$32, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTBYTIMEEXISTS$34, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(STARTBYTIMEEXISTS$34, 0);
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
            return get_store().count_elements(STARTBYTIMEEXISTS$34) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTBYTIMEEXISTS$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTBYTIMEEXISTS$34);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(STARTBYTIMEEXISTS$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(STARTBYTIMEEXISTS$34);
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
            get_store().remove_element(STARTBYTIMEEXISTS$34, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPLETEBYTIMEEXISTS$36, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(COMPLETEBYTIMEEXISTS$36, 0);
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
            return get_store().count_elements(COMPLETEBYTIMEEXISTS$36) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPLETEBYTIMEEXISTS$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPLETEBYTIMEEXISTS$36);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(COMPLETEBYTIMEEXISTS$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(COMPLETEBYTIMEEXISTS$36);
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
            get_store().remove_element(COMPLETEBYTIMEEXISTS$36, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTATIONNAME$38, 0);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName)get_store().find_element_user(PRESENTATIONNAME$38, 0);
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
            return get_store().count_elements(PRESENTATIONNAME$38) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTATIONNAME$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRESENTATIONNAME$38);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName)get_store().find_element_user(PRESENTATIONNAME$38, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName)get_store().add_element_user(PRESENTATIONNAME$38);
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
            get_store().remove_element(PRESENTATIONNAME$38, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTATIONSUBJECT$40, 0);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject)get_store().find_element_user(PRESENTATIONSUBJECT$40, 0);
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
            return get_store().count_elements(PRESENTATIONSUBJECT$40) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTATIONSUBJECT$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRESENTATIONSUBJECT$40);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject)get_store().find_element_user(PRESENTATIONSUBJECT$40, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject)get_store().add_element_user(PRESENTATIONSUBJECT$40);
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
            get_store().remove_element(PRESENTATIONSUBJECT$40, 0);
        }
    }
    
    /**
     * Gets the "presentationDescription" element
     */
    public java.lang.String getPresentationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTATIONDESCRIPTION$42, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "presentationDescription" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationDescription xgetPresentationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationDescription target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationDescription)get_store().find_element_user(PRESENTATIONDESCRIPTION$42, 0);
            return target;
        }
    }
    
    /**
     * True if has "presentationDescription" element
     */
    public boolean isSetPresentationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRESENTATIONDESCRIPTION$42) != 0;
        }
    }
    
    /**
     * Sets the "presentationDescription" element
     */
    public void setPresentationDescription(java.lang.String presentationDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTATIONDESCRIPTION$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRESENTATIONDESCRIPTION$42);
            }
            target.setStringValue(presentationDescription);
        }
    }
    
    /**
     * Sets (as xml) the "presentationDescription" element
     */
    public void xsetPresentationDescription(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationDescription presentationDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationDescription target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationDescription)get_store().find_element_user(PRESENTATIONDESCRIPTION$42, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationDescription)get_store().add_element_user(PRESENTATIONDESCRIPTION$42);
            }
            target.set(presentationDescription);
        }
    }
    
    /**
     * Unsets the "presentationDescription" element
     */
    public void unsetPresentationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRESENTATIONDESCRIPTION$42, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGMETHODEXISTS$44, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RENDERINGMETHODEXISTS$44, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGMETHODEXISTS$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RENDERINGMETHODEXISTS$44);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RENDERINGMETHODEXISTS$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RENDERINGMETHODEXISTS$44);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASOUTPUT$46, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASOUTPUT$46, 0);
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
            return get_store().count_elements(HASOUTPUT$46) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASOUTPUT$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASOUTPUT$46);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASOUTPUT$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASOUTPUT$46);
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
            get_store().remove_element(HASOUTPUT$46, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASFAULT$48, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASFAULT$48, 0);
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
            return get_store().count_elements(HASFAULT$48) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASFAULT$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASFAULT$48);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASFAULT$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASFAULT$48);
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
            get_store().remove_element(HASFAULT$48, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASATTACHMENTS$50, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASATTACHMENTS$50, 0);
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
            return get_store().count_elements(HASATTACHMENTS$50) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASATTACHMENTS$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASATTACHMENTS$50);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASATTACHMENTS$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASATTACHMENTS$50);
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
            get_store().remove_element(HASATTACHMENTS$50, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASCOMMENTS$52, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASCOMMENTS$52, 0);
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
            return get_store().count_elements(HASCOMMENTS$52) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASCOMMENTS$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASCOMMENTS$52);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASCOMMENTS$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASCOMMENTS$52);
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
            get_store().remove_element(HASCOMMENTS$52, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESCALATED$54, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ESCALATED$54, 0);
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
            return get_store().count_elements(ESCALATED$54) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESCALATED$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESCALATED$54);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ESCALATED$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ESCALATED$54);
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
            get_store().remove_element(ESCALATED$54, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTCOME$56, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTCOME$56, 0);
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
            return get_store().count_elements(OUTCOME$56) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTCOME$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTCOME$56);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTCOME$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OUTCOME$56);
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
            get_store().remove_element(OUTCOME$56, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTTASKID$58, 0);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PARENTTASKID$58, 0);
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
            return get_store().count_elements(PARENTTASKID$58) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTTASKID$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTTASKID$58);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PARENTTASKID$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PARENTTASKID$58);
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
            get_store().remove_element(PARENTTASKID$58, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASSUBTASKS$60, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASSUBTASKS$60, 0);
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
            return get_store().count_elements(HASSUBTASKS$60) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASSUBTASKS$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASSUBTASKS$60);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASSUBTASKS$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASSUBTASKS$60);
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
            get_store().remove_element(HASSUBTASKS$60, 0);
        }
    }
    
    /**
     * Gets the "numberOfComments" element
     */
    public int getNumberOfComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFCOMMENTS$62, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "numberOfComments" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberOfComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFCOMMENTS$62, 0);
            return target;
        }
    }
    
    /**
     * True if has "numberOfComments" element
     */
    public boolean isSetNumberOfComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFCOMMENTS$62) != 0;
        }
    }
    
    /**
     * Sets the "numberOfComments" element
     */
    public void setNumberOfComments(int numberOfComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFCOMMENTS$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFCOMMENTS$62);
            }
            target.setIntValue(numberOfComments);
        }
    }
    
    /**
     * Sets (as xml) the "numberOfComments" element
     */
    public void xsetNumberOfComments(org.apache.xmlbeans.XmlInt numberOfComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFCOMMENTS$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBEROFCOMMENTS$62);
            }
            target.set(numberOfComments);
        }
    }
    
    /**
     * Unsets the "numberOfComments" element
     */
    public void unsetNumberOfComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFCOMMENTS$62, 0);
        }
    }
    
    /**
     * Gets the "numberOfAttachments" element
     */
    public int getNumberOfAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFATTACHMENTS$64, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "numberOfAttachments" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberOfAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFATTACHMENTS$64, 0);
            return target;
        }
    }
    
    /**
     * True if has "numberOfAttachments" element
     */
    public boolean isSetNumberOfAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFATTACHMENTS$64) != 0;
        }
    }
    
    /**
     * Sets the "numberOfAttachments" element
     */
    public void setNumberOfAttachments(int numberOfAttachments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFATTACHMENTS$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFATTACHMENTS$64);
            }
            target.setIntValue(numberOfAttachments);
        }
    }
    
    /**
     * Sets (as xml) the "numberOfAttachments" element
     */
    public void xsetNumberOfAttachments(org.apache.xmlbeans.XmlInt numberOfAttachments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFATTACHMENTS$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBEROFATTACHMENTS$64);
            }
            target.set(numberOfAttachments);
        }
    }
    
    /**
     * Unsets the "numberOfAttachments" element
     */
    public void unsetNumberOfAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFATTACHMENTS$64, 0);
        }
    }
    
    /**
     * Gets the "previousStatus" element
     */
    public java.lang.String getPreviousStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREVIOUSSTATUS$66, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "previousStatus" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus xgetPreviousStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().find_element_user(PREVIOUSSTATUS$66, 0);
            return target;
        }
    }
    
    /**
     * True if has "previousStatus" element
     */
    public boolean isSetPreviousStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREVIOUSSTATUS$66) != 0;
        }
    }
    
    /**
     * Sets the "previousStatus" element
     */
    public void setPreviousStatus(java.lang.String previousStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREVIOUSSTATUS$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREVIOUSSTATUS$66);
            }
            target.setStringValue(previousStatus);
        }
    }
    
    /**
     * Sets (as xml) the "previousStatus" element
     */
    public void xsetPreviousStatus(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus previousStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().find_element_user(PREVIOUSSTATUS$66, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus)get_store().add_element_user(PREVIOUSSTATUS$66);
            }
            target.set(previousStatus);
        }
    }
    
    /**
     * Unsets the "previousStatus" element
     */
    public void unsetPreviousStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREVIOUSSTATUS$66, 0);
        }
    }
    
    /**
     * Gets the "responseServiceName" element
     */
    public java.lang.String getResponseServiceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSESERVICENAME$68, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "responseServiceName" element
     */
    public org.apache.xmlbeans.XmlString xgetResponseServiceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSESERVICENAME$68, 0);
            return target;
        }
    }
    
    /**
     * True if has "responseServiceName" element
     */
    public boolean isSetResponseServiceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSESERVICENAME$68) != 0;
        }
    }
    
    /**
     * Sets the "responseServiceName" element
     */
    public void setResponseServiceName(java.lang.String responseServiceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSESERVICENAME$68, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSESERVICENAME$68);
            }
            target.setStringValue(responseServiceName);
        }
    }
    
    /**
     * Sets (as xml) the "responseServiceName" element
     */
    public void xsetResponseServiceName(org.apache.xmlbeans.XmlString responseServiceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSESERVICENAME$68, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPONSESERVICENAME$68);
            }
            target.set(responseServiceName);
        }
    }
    
    /**
     * Unsets the "responseServiceName" element
     */
    public void unsetResponseServiceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSESERVICENAME$68, 0);
        }
    }
    
    /**
     * Gets the "responseOperationName" element
     */
    public java.lang.String getResponseOperationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSEOPERATIONNAME$70, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "responseOperationName" element
     */
    public org.apache.xmlbeans.XmlString xgetResponseOperationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSEOPERATIONNAME$70, 0);
            return target;
        }
    }
    
    /**
     * True if has "responseOperationName" element
     */
    public boolean isSetResponseOperationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSEOPERATIONNAME$70) != 0;
        }
    }
    
    /**
     * Sets the "responseOperationName" element
     */
    public void setResponseOperationName(java.lang.String responseOperationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSEOPERATIONNAME$70, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSEOPERATIONNAME$70);
            }
            target.setStringValue(responseOperationName);
        }
    }
    
    /**
     * Sets (as xml) the "responseOperationName" element
     */
    public void xsetResponseOperationName(org.apache.xmlbeans.XmlString responseOperationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSEOPERATIONNAME$70, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPONSEOPERATIONNAME$70);
            }
            target.set(responseOperationName);
        }
    }
    
    /**
     * Unsets the "responseOperationName" element
     */
    public void unsetResponseOperationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSEOPERATIONNAME$70, 0);
        }
    }
    
    /**
     * Gets the "isClaimable" element
     */
    public boolean getIsClaimable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCLAIMABLE$72, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isClaimable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsClaimable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCLAIMABLE$72, 0);
            return target;
        }
    }
    
    /**
     * True if has "isClaimable" element
     */
    public boolean isSetIsClaimable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCLAIMABLE$72) != 0;
        }
    }
    
    /**
     * Sets the "isClaimable" element
     */
    public void setIsClaimable(boolean isClaimable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCLAIMABLE$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCLAIMABLE$72);
            }
            target.setBooleanValue(isClaimable);
        }
    }
    
    /**
     * Sets (as xml) the "isClaimable" element
     */
    public void xsetIsClaimable(org.apache.xmlbeans.XmlBoolean isClaimable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCLAIMABLE$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCLAIMABLE$72);
            }
            target.set(isClaimable);
        }
    }
    
    /**
     * Unsets the "isClaimable" element
     */
    public void unsetIsClaimable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCLAIMABLE$72, 0);
        }
    }
    
    /**
     * Gets the "isStartable" element
     */
    public boolean getIsStartable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSTARTABLE$74, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isStartable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsStartable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSTARTABLE$74, 0);
            return target;
        }
    }
    
    /**
     * True if has "isStartable" element
     */
    public boolean isSetIsStartable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSTARTABLE$74) != 0;
        }
    }
    
    /**
     * Sets the "isStartable" element
     */
    public void setIsStartable(boolean isStartable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSTARTABLE$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSTARTABLE$74);
            }
            target.setBooleanValue(isStartable);
        }
    }
    
    /**
     * Sets (as xml) the "isStartable" element
     */
    public void xsetIsStartable(org.apache.xmlbeans.XmlBoolean isStartable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSTARTABLE$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISSTARTABLE$74);
            }
            target.set(isStartable);
        }
    }
    
    /**
     * Unsets the "isStartable" element
     */
    public void unsetIsStartable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSTARTABLE$74, 0);
        }
    }
    
    /**
     * Gets the "isStopable" element
     */
    public boolean getIsStopable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSTOPABLE$76, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isStopable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsStopable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSTOPABLE$76, 0);
            return target;
        }
    }
    
    /**
     * True if has "isStopable" element
     */
    public boolean isSetIsStopable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSTOPABLE$76) != 0;
        }
    }
    
    /**
     * Sets the "isStopable" element
     */
    public void setIsStopable(boolean isStopable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSTOPABLE$76, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSTOPABLE$76);
            }
            target.setBooleanValue(isStopable);
        }
    }
    
    /**
     * Sets (as xml) the "isStopable" element
     */
    public void xsetIsStopable(org.apache.xmlbeans.XmlBoolean isStopable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSTOPABLE$76, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISSTOPABLE$76);
            }
            target.set(isStopable);
        }
    }
    
    /**
     * Unsets the "isStopable" element
     */
    public void unsetIsStopable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSTOPABLE$76, 0);
        }
    }
    
    /**
     * Gets the "isReleasable" element
     */
    public boolean getIsReleasable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISRELEASABLE$78, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isReleasable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsReleasable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISRELEASABLE$78, 0);
            return target;
        }
    }
    
    /**
     * True if has "isReleasable" element
     */
    public boolean isSetIsReleasable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISRELEASABLE$78) != 0;
        }
    }
    
    /**
     * Sets the "isReleasable" element
     */
    public void setIsReleasable(boolean isReleasable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISRELEASABLE$78, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISRELEASABLE$78);
            }
            target.setBooleanValue(isReleasable);
        }
    }
    
    /**
     * Sets (as xml) the "isReleasable" element
     */
    public void xsetIsReleasable(org.apache.xmlbeans.XmlBoolean isReleasable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISRELEASABLE$78, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISRELEASABLE$78);
            }
            target.set(isReleasable);
        }
    }
    
    /**
     * Unsets the "isReleasable" element
     */
    public void unsetIsReleasable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISRELEASABLE$78, 0);
        }
    }
    
    /**
     * Gets the "isSuspendable" element
     */
    public boolean getIsSuspendable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUSPENDABLE$80, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isSuspendable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsSuspendable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSUSPENDABLE$80, 0);
            return target;
        }
    }
    
    /**
     * True if has "isSuspendable" element
     */
    public boolean isSetIsSuspendable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSUSPENDABLE$80) != 0;
        }
    }
    
    /**
     * Sets the "isSuspendable" element
     */
    public void setIsSuspendable(boolean isSuspendable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUSPENDABLE$80, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSUSPENDABLE$80);
            }
            target.setBooleanValue(isSuspendable);
        }
    }
    
    /**
     * Sets (as xml) the "isSuspendable" element
     */
    public void xsetIsSuspendable(org.apache.xmlbeans.XmlBoolean isSuspendable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSUSPENDABLE$80, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISSUSPENDABLE$80);
            }
            target.set(isSuspendable);
        }
    }
    
    /**
     * Unsets the "isSuspendable" element
     */
    public void unsetIsSuspendable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSUSPENDABLE$80, 0);
        }
    }
    
    /**
     * Gets the "isResumable" element
     */
    public boolean getIsResumable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISRESUMABLE$82, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isResumable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsResumable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISRESUMABLE$82, 0);
            return target;
        }
    }
    
    /**
     * True if has "isResumable" element
     */
    public boolean isSetIsResumable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISRESUMABLE$82) != 0;
        }
    }
    
    /**
     * Sets the "isResumable" element
     */
    public void setIsResumable(boolean isResumable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISRESUMABLE$82, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISRESUMABLE$82);
            }
            target.setBooleanValue(isResumable);
        }
    }
    
    /**
     * Sets (as xml) the "isResumable" element
     */
    public void xsetIsResumable(org.apache.xmlbeans.XmlBoolean isResumable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISRESUMABLE$82, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISRESUMABLE$82);
            }
            target.set(isResumable);
        }
    }
    
    /**
     * Unsets the "isResumable" element
     */
    public void unsetIsResumable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISRESUMABLE$82, 0);
        }
    }
    
    /**
     * Gets the "isCompletable" element
     */
    public boolean getIsCompletable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCOMPLETABLE$84, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isCompletable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsCompletable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCOMPLETABLE$84, 0);
            return target;
        }
    }
    
    /**
     * True if has "isCompletable" element
     */
    public boolean isSetIsCompletable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCOMPLETABLE$84) != 0;
        }
    }
    
    /**
     * Sets the "isCompletable" element
     */
    public void setIsCompletable(boolean isCompletable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCOMPLETABLE$84, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCOMPLETABLE$84);
            }
            target.setBooleanValue(isCompletable);
        }
    }
    
    /**
     * Sets (as xml) the "isCompletable" element
     */
    public void xsetIsCompletable(org.apache.xmlbeans.XmlBoolean isCompletable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCOMPLETABLE$84, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCOMPLETABLE$84);
            }
            target.set(isCompletable);
        }
    }
    
    /**
     * Unsets the "isCompletable" element
     */
    public void unsetIsCompletable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCOMPLETABLE$84, 0);
        }
    }
    
    /**
     * Gets the "isRemovable" element
     */
    public boolean getIsRemovable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISREMOVABLE$86, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isRemovable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsRemovable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISREMOVABLE$86, 0);
            return target;
        }
    }
    
    /**
     * True if has "isRemovable" element
     */
    public boolean isSetIsRemovable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISREMOVABLE$86) != 0;
        }
    }
    
    /**
     * Sets the "isRemovable" element
     */
    public void setIsRemovable(boolean isRemovable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISREMOVABLE$86, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISREMOVABLE$86);
            }
            target.setBooleanValue(isRemovable);
        }
    }
    
    /**
     * Sets (as xml) the "isRemovable" element
     */
    public void xsetIsRemovable(org.apache.xmlbeans.XmlBoolean isRemovable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISREMOVABLE$86, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISREMOVABLE$86);
            }
            target.set(isRemovable);
        }
    }
    
    /**
     * Unsets the "isRemovable" element
     */
    public void unsetIsRemovable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISREMOVABLE$86, 0);
        }
    }
    
    /**
     * Gets the "isForwardable" element
     */
    public boolean getIsForwardable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISFORWARDABLE$88, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isForwardable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsForwardable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISFORWARDABLE$88, 0);
            return target;
        }
    }
    
    /**
     * True if has "isForwardable" element
     */
    public boolean isSetIsForwardable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISFORWARDABLE$88) != 0;
        }
    }
    
    /**
     * Sets the "isForwardable" element
     */
    public void setIsForwardable(boolean isForwardable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISFORWARDABLE$88, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISFORWARDABLE$88);
            }
            target.setBooleanValue(isForwardable);
        }
    }
    
    /**
     * Sets (as xml) the "isForwardable" element
     */
    public void xsetIsForwardable(org.apache.xmlbeans.XmlBoolean isForwardable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISFORWARDABLE$88, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISFORWARDABLE$88);
            }
            target.set(isForwardable);
        }
    }
    
    /**
     * Unsets the "isForwardable" element
     */
    public void unsetIsForwardable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISFORWARDABLE$88, 0);
        }
    }
    
    /**
     * Gets the "isDelegatable" element
     */
    public boolean getIsDelegatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDELEGATABLE$90, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isDelegatable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsDelegatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDELEGATABLE$90, 0);
            return target;
        }
    }
    
    /**
     * True if has "isDelegatable" element
     */
    public boolean isSetIsDelegatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDELEGATABLE$90) != 0;
        }
    }
    
    /**
     * Sets the "isDelegatable" element
     */
    public void setIsDelegatable(boolean isDelegatable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDELEGATABLE$90, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISDELEGATABLE$90);
            }
            target.setBooleanValue(isDelegatable);
        }
    }
    
    /**
     * Sets (as xml) the "isDelegatable" element
     */
    public void xsetIsDelegatable(org.apache.xmlbeans.XmlBoolean isDelegatable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDELEGATABLE$90, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISDELEGATABLE$90);
            }
            target.set(isDelegatable);
        }
    }
    
    /**
     * Unsets the "isDelegatable" element
     */
    public void unsetIsDelegatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDELEGATABLE$90, 0);
        }
    }
    
    /**
     * Gets the "packageName" element
     */
    public java.lang.String getPackageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGENAME$92, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "packageName" element
     */
    public org.apache.xmlbeans.XmlString xgetPackageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PACKAGENAME$92, 0);
            return target;
        }
    }
    
    /**
     * Sets the "packageName" element
     */
    public void setPackageName(java.lang.String packageName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGENAME$92, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PACKAGENAME$92);
            }
            target.setStringValue(packageName);
        }
    }
    
    /**
     * Sets (as xml) the "packageName" element
     */
    public void xsetPackageName(org.apache.xmlbeans.XmlString packageName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PACKAGENAME$92, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PACKAGENAME$92);
            }
            target.set(packageName);
        }
    }
    
    /**
     * Gets the "tenantId" element
     */
    public int getTenantId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TENANTID$94, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "tenantId" element
     */
    public org.apache.xmlbeans.XmlInt xgetTenantId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TENANTID$94, 0);
            return target;
        }
    }
    
    /**
     * True if has "tenantId" element
     */
    public boolean isSetTenantId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TENANTID$94) != 0;
        }
    }
    
    /**
     * Sets the "tenantId" element
     */
    public void setTenantId(int tenantId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TENANTID$94, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TENANTID$94);
            }
            target.setIntValue(tenantId);
        }
    }
    
    /**
     * Sets (as xml) the "tenantId" element
     */
    public void xsetTenantId(org.apache.xmlbeans.XmlInt tenantId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TENANTID$94, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TENANTID$94);
            }
            target.set(tenantId);
        }
    }
    
    /**
     * Unsets the "tenantId" element
     */
    public void unsetTenantId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TENANTID$94, 0);
        }
    }
}
