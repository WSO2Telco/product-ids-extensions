/*
 * XML Type:  tTaskQueryResultRow
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultRow
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * An XML tTaskQueryResultRow(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public class TTaskQueryResultRowImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultRow
{
    private static final long serialVersionUID = 1L;
    
    public TTaskQueryResultRowImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName STARTBYTIME$38 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "startByTime");
    private static final javax.xml.namespace.QName COMPLETEBYTIME$40 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "completeByTime");
    private static final javax.xml.namespace.QName PRESENTATIONNAME$42 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "presentationName");
    private static final javax.xml.namespace.QName PRESENTATIONSUBJECT$44 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "presentationSubject");
    private static final javax.xml.namespace.QName RENDERINGMETHODNAME$46 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "renderingMethodName");
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
    private static final javax.xml.namespace.QName PARENTTASKID$58 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "parentTaskId");
    private static final javax.xml.namespace.QName HASSUBTASKS$60 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "hasSubtasks");
    private static final javax.xml.namespace.QName SEARCHBY$62 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "searchBy");
    private static final javax.xml.namespace.QName OUTCOME$64 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "outcome");
    private static final javax.xml.namespace.QName TASKOPERATIONS$66 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "taskOperations");
    
    
    /**
     * Gets array of all "id" elements
     */
    public java.lang.String[] getIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ID$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "id" element
     */
    public java.lang.String getIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "id" elements
     */
    public org.apache.xmlbeans.XmlAnyURI[] xgetIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ID$0, targetList);
            org.apache.xmlbeans.XmlAnyURI[] result = new org.apache.xmlbeans.XmlAnyURI[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "id" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "id" element
     */
    public int sizeOfIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$0);
        }
    }
    
    /**
     * Sets array of all "id" element
     */
    public void setIdArray(java.lang.String[] idArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(idArray, ID$0);
        }
    }
    
    /**
     * Sets ith "id" element
     */
    public void setIdArray(int i, java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) array of all "id" element
     */
    public void xsetIdArray(org.apache.xmlbeans.XmlAnyURI[]idArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(idArray, ID$0);
        }
    }
    
    /**
     * Sets (as xml) ith "id" element
     */
    public void xsetIdArray(int i, org.apache.xmlbeans.XmlAnyURI id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(id);
        }
    }
    
    /**
     * Inserts the value as the ith "id" element
     */
    public void insertId(int i, java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ID$0, i);
            target.setStringValue(id);
        }
    }
    
    /**
     * Appends the value as the last "id" element
     */
    public void addId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            target.setStringValue(id);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "id" element
     */
    public org.apache.xmlbeans.XmlAnyURI insertNewId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().insert_element_user(ID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "id" element
     */
    public org.apache.xmlbeans.XmlAnyURI addNewId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "id" element
     */
    public void removeId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$0, i);
        }
    }
    
    /**
     * Gets array of all "taskType" elements
     */
    public java.lang.String[] getTaskTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TASKTYPE$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "taskType" element
     */
    public java.lang.String getTaskTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKTYPE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "taskType" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetTaskTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TASKTYPE$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "taskType" element
     */
    public org.apache.xmlbeans.XmlString xgetTaskTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKTYPE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "taskType" element
     */
    public int sizeOfTaskTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TASKTYPE$2);
        }
    }
    
    /**
     * Sets array of all "taskType" element
     */
    public void setTaskTypeArray(java.lang.String[] taskTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(taskTypeArray, TASKTYPE$2);
        }
    }
    
    /**
     * Sets ith "taskType" element
     */
    public void setTaskTypeArray(int i, java.lang.String taskType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKTYPE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(taskType);
        }
    }
    
    /**
     * Sets (as xml) array of all "taskType" element
     */
    public void xsetTaskTypeArray(org.apache.xmlbeans.XmlString[]taskTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(taskTypeArray, TASKTYPE$2);
        }
    }
    
    /**
     * Sets (as xml) ith "taskType" element
     */
    public void xsetTaskTypeArray(int i, org.apache.xmlbeans.XmlString taskType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKTYPE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(taskType);
        }
    }
    
    /**
     * Inserts the value as the ith "taskType" element
     */
    public void insertTaskType(int i, java.lang.String taskType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TASKTYPE$2, i);
            target.setStringValue(taskType);
        }
    }
    
    /**
     * Appends the value as the last "taskType" element
     */
    public void addTaskType(java.lang.String taskType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKTYPE$2);
            target.setStringValue(taskType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "taskType" element
     */
    public org.apache.xmlbeans.XmlString insertNewTaskType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(TASKTYPE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "taskType" element
     */
    public org.apache.xmlbeans.XmlString addNewTaskType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TASKTYPE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "taskType" element
     */
    public void removeTaskType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TASKTYPE$2, i);
        }
    }
    
    /**
     * Gets array of all "name" elements
     */
    public javax.xml.namespace.QName[] getNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAME$4, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "name" element
     */
    public javax.xml.namespace.QName getNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "name" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAME$4, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "name" element
     */
    public org.apache.xmlbeans.XmlQName xgetNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(NAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "name" element
     */
    public int sizeOfNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$4);
        }
    }
    
    /**
     * Sets array of all "name" element
     */
    public void setNameArray(javax.xml.namespace.QName[] nameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nameArray, NAME$4);
        }
    }
    
    /**
     * Sets ith "name" element
     */
    public void setNameArray(int i, javax.xml.namespace.QName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(name);
        }
    }
    
    /**
     * Sets (as xml) array of all "name" element
     */
    public void xsetNameArray(org.apache.xmlbeans.XmlQName[]nameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nameArray, NAME$4);
        }
    }
    
    /**
     * Sets (as xml) ith "name" element
     */
    public void xsetNameArray(int i, org.apache.xmlbeans.XmlQName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(NAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(name);
        }
    }
    
    /**
     * Inserts the value as the ith "name" element
     */
    public void insertName(int i, javax.xml.namespace.QName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NAME$4, i);
            target.setQNameValue(name);
        }
    }
    
    /**
     * Appends the value as the last "name" element
     */
    public void addName(javax.xml.namespace.QName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$4);
            target.setQNameValue(name);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    public org.apache.xmlbeans.XmlQName insertNewName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(NAME$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    public org.apache.xmlbeans.XmlQName addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(NAME$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "name" element
     */
    public void removeName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$4, i);
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
     * Gets array of all "priority" elements
     */
    public int[] getPriorityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRIORITY$8, targetList);
            int[] result = new int[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getIntValue();
            return result;
        }
    }
    
    /**
     * Gets ith "priority" element
     */
    public int getPriorityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "priority" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority[] xgetPriorityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRIORITY$8, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "priority" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority xgetPriorityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority)get_store().find_element_user(PRIORITY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "priority" element
     */
    public int sizeOfPriorityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIORITY$8);
        }
    }
    
    /**
     * Sets array of all "priority" element
     */
    public void setPriorityArray(int[] priorityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(priorityArray, PRIORITY$8);
        }
    }
    
    /**
     * Sets ith "priority" element
     */
    public void setPriorityArray(int i, int priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setIntValue(priority);
        }
    }
    
    /**
     * Sets (as xml) array of all "priority" element
     */
    public void xsetPriorityArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority[]priorityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(priorityArray, PRIORITY$8);
        }
    }
    
    /**
     * Sets (as xml) ith "priority" element
     */
    public void xsetPriorityArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority)get_store().find_element_user(PRIORITY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(priority);
        }
    }
    
    /**
     * Inserts the value as the ith "priority" element
     */
    public void insertPriority(int i, int priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PRIORITY$8, i);
            target.setIntValue(priority);
        }
    }
    
    /**
     * Appends the value as the last "priority" element
     */
    public void addPriority(int priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIORITY$8);
            target.setIntValue(priority);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "priority" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority insertNewPriority(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority)get_store().insert_element_user(PRIORITY$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "priority" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority addNewPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority)get_store().add_element_user(PRIORITY$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "priority" element
     */
    public void removePriority(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIORITY$8, i);
        }
    }
    
    /**
     * Gets array of all "taskInitiator" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity[] getTaskInitiatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TASKINITIATOR$10, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "taskInitiator" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity getTaskInitiatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().find_element_user(TASKINITIATOR$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "taskInitiator" element
     */
    public int sizeOfTaskInitiatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TASKINITIATOR$10);
        }
    }
    
    /**
     * Sets array of all "taskInitiator" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTaskInitiatorArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity[] taskInitiatorArray)
    {
        check_orphaned();
        arraySetterHelper(taskInitiatorArray, TASKINITIATOR$10);
    }
    
    /**
     * Sets ith "taskInitiator" element
     */
    public void setTaskInitiatorArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity taskInitiator)
    {
        generatedSetterHelperImpl(taskInitiator, TASKINITIATOR$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "taskInitiator" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity insertNewTaskInitiator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().insert_element_user(TASKINITIATOR$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "taskInitiator" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity addNewTaskInitiator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().add_element_user(TASKINITIATOR$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "taskInitiator" element
     */
    public void removeTaskInitiator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TASKINITIATOR$10, i);
        }
    }
    
    /**
     * Gets array of all "taskStakeholders" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity[] getTaskStakeholdersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TASKSTAKEHOLDERS$12, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "taskStakeholders" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity getTaskStakeholdersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().find_element_user(TASKSTAKEHOLDERS$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "taskStakeholders" element
     */
    public int sizeOfTaskStakeholdersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TASKSTAKEHOLDERS$12);
        }
    }
    
    /**
     * Sets array of all "taskStakeholders" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTaskStakeholdersArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity[] taskStakeholdersArray)
    {
        check_orphaned();
        arraySetterHelper(taskStakeholdersArray, TASKSTAKEHOLDERS$12);
    }
    
    /**
     * Sets ith "taskStakeholders" element
     */
    public void setTaskStakeholdersArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity taskStakeholders)
    {
        generatedSetterHelperImpl(taskStakeholders, TASKSTAKEHOLDERS$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "taskStakeholders" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity insertNewTaskStakeholders(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().insert_element_user(TASKSTAKEHOLDERS$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "taskStakeholders" element
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
     * Removes the ith "taskStakeholders" element
     */
    public void removeTaskStakeholders(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TASKSTAKEHOLDERS$12, i);
        }
    }
    
    /**
     * Gets array of all "potentialOwners" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity[] getPotentialOwnersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POTENTIALOWNERS$14, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "potentialOwners" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity getPotentialOwnersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().find_element_user(POTENTIALOWNERS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "potentialOwners" element
     */
    public int sizeOfPotentialOwnersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POTENTIALOWNERS$14);
        }
    }
    
    /**
     * Sets array of all "potentialOwners" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPotentialOwnersArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity[] potentialOwnersArray)
    {
        check_orphaned();
        arraySetterHelper(potentialOwnersArray, POTENTIALOWNERS$14);
    }
    
    /**
     * Sets ith "potentialOwners" element
     */
    public void setPotentialOwnersArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity potentialOwners)
    {
        generatedSetterHelperImpl(potentialOwners, POTENTIALOWNERS$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "potentialOwners" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity insertNewPotentialOwners(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().insert_element_user(POTENTIALOWNERS$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "potentialOwners" element
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
     * Removes the ith "potentialOwners" element
     */
    public void removePotentialOwners(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POTENTIALOWNERS$14, i);
        }
    }
    
    /**
     * Gets array of all "businessAdministrators" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity[] getBusinessAdministratorsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BUSINESSADMINISTRATORS$16, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "businessAdministrators" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity getBusinessAdministratorsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().find_element_user(BUSINESSADMINISTRATORS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "businessAdministrators" element
     */
    public int sizeOfBusinessAdministratorsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSADMINISTRATORS$16);
        }
    }
    
    /**
     * Sets array of all "businessAdministrators" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBusinessAdministratorsArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity[] businessAdministratorsArray)
    {
        check_orphaned();
        arraySetterHelper(businessAdministratorsArray, BUSINESSADMINISTRATORS$16);
    }
    
    /**
     * Sets ith "businessAdministrators" element
     */
    public void setBusinessAdministratorsArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity businessAdministrators)
    {
        generatedSetterHelperImpl(businessAdministrators, BUSINESSADMINISTRATORS$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "businessAdministrators" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity insertNewBusinessAdministrators(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().insert_element_user(BUSINESSADMINISTRATORS$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "businessAdministrators" element
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
     * Removes the ith "businessAdministrators" element
     */
    public void removeBusinessAdministrators(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSADMINISTRATORS$16, i);
        }
    }
    
    /**
     * Gets array of all "actualOwner" elements
     */
    public java.lang.String[] getActualOwnerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTUALOWNER$18, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "actualOwner" element
     */
    public java.lang.String getActualOwnerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTUALOWNER$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "actualOwner" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser[] xgetActualOwnerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTUALOWNER$18, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "actualOwner" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser xgetActualOwnerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(ACTUALOWNER$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "actualOwner" element
     */
    public int sizeOfActualOwnerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTUALOWNER$18);
        }
    }
    
    /**
     * Sets array of all "actualOwner" element
     */
    public void setActualOwnerArray(java.lang.String[] actualOwnerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(actualOwnerArray, ACTUALOWNER$18);
        }
    }
    
    /**
     * Sets ith "actualOwner" element
     */
    public void setActualOwnerArray(int i, java.lang.String actualOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTUALOWNER$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(actualOwner);
        }
    }
    
    /**
     * Sets (as xml) array of all "actualOwner" element
     */
    public void xsetActualOwnerArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser[]actualOwnerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(actualOwnerArray, ACTUALOWNER$18);
        }
    }
    
    /**
     * Sets (as xml) ith "actualOwner" element
     */
    public void xsetActualOwnerArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser actualOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(ACTUALOWNER$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(actualOwner);
        }
    }
    
    /**
     * Inserts the value as the ith "actualOwner" element
     */
    public void insertActualOwner(int i, java.lang.String actualOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ACTUALOWNER$18, i);
            target.setStringValue(actualOwner);
        }
    }
    
    /**
     * Appends the value as the last "actualOwner" element
     */
    public void addActualOwner(java.lang.String actualOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTUALOWNER$18);
            target.setStringValue(actualOwner);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "actualOwner" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser insertNewActualOwner(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().insert_element_user(ACTUALOWNER$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "actualOwner" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser addNewActualOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().add_element_user(ACTUALOWNER$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "actualOwner" element
     */
    public void removeActualOwner(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTUALOWNER$18, i);
        }
    }
    
    /**
     * Gets array of all "notificationRecipients" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity[] getNotificationRecipientsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NOTIFICATIONRECIPIENTS$20, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "notificationRecipients" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity getNotificationRecipientsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().find_element_user(NOTIFICATIONRECIPIENTS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "notificationRecipients" element
     */
    public int sizeOfNotificationRecipientsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTIFICATIONRECIPIENTS$20);
        }
    }
    
    /**
     * Sets array of all "notificationRecipients" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setNotificationRecipientsArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity[] notificationRecipientsArray)
    {
        check_orphaned();
        arraySetterHelper(notificationRecipientsArray, NOTIFICATIONRECIPIENTS$20);
    }
    
    /**
     * Sets ith "notificationRecipients" element
     */
    public void setNotificationRecipientsArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity notificationRecipients)
    {
        generatedSetterHelperImpl(notificationRecipients, NOTIFICATIONRECIPIENTS$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "notificationRecipients" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity insertNewNotificationRecipients(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().insert_element_user(NOTIFICATIONRECIPIENTS$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "notificationRecipients" element
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
     * Removes the ith "notificationRecipients" element
     */
    public void removeNotificationRecipients(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTIFICATIONRECIPIENTS$20, i);
        }
    }
    
    /**
     * Gets array of all "createdTime" elements
     */
    public java.util.Calendar[] getCreatedTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CREATEDTIME$22, targetList);
            java.util.Calendar[] result = new java.util.Calendar[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getCalendarValue();
            return result;
        }
    }
    
    /**
     * Gets ith "createdTime" element
     */
    public java.util.Calendar getCreatedTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDTIME$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "createdTime" elements
     */
    public org.apache.xmlbeans.XmlDateTime[] xgetCreatedTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CREATEDTIME$22, targetList);
            org.apache.xmlbeans.XmlDateTime[] result = new org.apache.xmlbeans.XmlDateTime[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "createdTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCreatedTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDTIME$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "createdTime" element
     */
    public int sizeOfCreatedTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDTIME$22);
        }
    }
    
    /**
     * Sets array of all "createdTime" element
     */
    public void setCreatedTimeArray(java.util.Calendar[] createdTimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(createdTimeArray, CREATEDTIME$22);
        }
    }
    
    /**
     * Sets ith "createdTime" element
     */
    public void setCreatedTimeArray(int i, java.util.Calendar createdTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDTIME$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setCalendarValue(createdTime);
        }
    }
    
    /**
     * Sets (as xml) array of all "createdTime" element
     */
    public void xsetCreatedTimeArray(org.apache.xmlbeans.XmlDateTime[]createdTimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(createdTimeArray, CREATEDTIME$22);
        }
    }
    
    /**
     * Sets (as xml) ith "createdTime" element
     */
    public void xsetCreatedTimeArray(int i, org.apache.xmlbeans.XmlDateTime createdTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDTIME$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(createdTime);
        }
    }
    
    /**
     * Inserts the value as the ith "createdTime" element
     */
    public void insertCreatedTime(int i, java.util.Calendar createdTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CREATEDTIME$22, i);
            target.setCalendarValue(createdTime);
        }
    }
    
    /**
     * Appends the value as the last "createdTime" element
     */
    public void addCreatedTime(java.util.Calendar createdTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDTIME$22);
            target.setCalendarValue(createdTime);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "createdTime" element
     */
    public org.apache.xmlbeans.XmlDateTime insertNewCreatedTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().insert_element_user(CREATEDTIME$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "createdTime" element
     */
    public org.apache.xmlbeans.XmlDateTime addNewCreatedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATEDTIME$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "createdTime" element
     */
    public void removeCreatedTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDTIME$22, i);
        }
    }
    
    /**
     * Gets array of all "createdBy" elements
     */
    public java.lang.String[] getCreatedByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CREATEDBY$24, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "createdBy" element
     */
    public java.lang.String getCreatedByArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDBY$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "createdBy" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser[] xgetCreatedByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CREATEDBY$24, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "createdBy" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser xgetCreatedByArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(CREATEDBY$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "createdBy" element
     */
    public int sizeOfCreatedByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDBY$24);
        }
    }
    
    /**
     * Sets array of all "createdBy" element
     */
    public void setCreatedByArray(java.lang.String[] createdByArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(createdByArray, CREATEDBY$24);
        }
    }
    
    /**
     * Sets ith "createdBy" element
     */
    public void setCreatedByArray(int i, java.lang.String createdBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDBY$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(createdBy);
        }
    }
    
    /**
     * Sets (as xml) array of all "createdBy" element
     */
    public void xsetCreatedByArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser[]createdByArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(createdByArray, CREATEDBY$24);
        }
    }
    
    /**
     * Sets (as xml) ith "createdBy" element
     */
    public void xsetCreatedByArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser createdBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(CREATEDBY$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(createdBy);
        }
    }
    
    /**
     * Inserts the value as the ith "createdBy" element
     */
    public void insertCreatedBy(int i, java.lang.String createdBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CREATEDBY$24, i);
            target.setStringValue(createdBy);
        }
    }
    
    /**
     * Appends the value as the last "createdBy" element
     */
    public void addCreatedBy(java.lang.String createdBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDBY$24);
            target.setStringValue(createdBy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "createdBy" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser insertNewCreatedBy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().insert_element_user(CREATEDBY$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "createdBy" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser addNewCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().add_element_user(CREATEDBY$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "createdBy" element
     */
    public void removeCreatedBy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDBY$24, i);
        }
    }
    
    /**
     * Gets array of all "lastModifiedTime" elements
     */
    public java.util.Calendar[] getLastModifiedTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LASTMODIFIEDTIME$26, targetList);
            java.util.Calendar[] result = new java.util.Calendar[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getCalendarValue();
            return result;
        }
    }
    
    /**
     * Gets ith "lastModifiedTime" element
     */
    public java.util.Calendar getLastModifiedTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTMODIFIEDTIME$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "lastModifiedTime" elements
     */
    public org.apache.xmlbeans.XmlDateTime[] xgetLastModifiedTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LASTMODIFIEDTIME$26, targetList);
            org.apache.xmlbeans.XmlDateTime[] result = new org.apache.xmlbeans.XmlDateTime[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "lastModifiedTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetLastModifiedTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTMODIFIEDTIME$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lastModifiedTime" element
     */
    public int sizeOfLastModifiedTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTMODIFIEDTIME$26);
        }
    }
    
    /**
     * Sets array of all "lastModifiedTime" element
     */
    public void setLastModifiedTimeArray(java.util.Calendar[] lastModifiedTimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lastModifiedTimeArray, LASTMODIFIEDTIME$26);
        }
    }
    
    /**
     * Sets ith "lastModifiedTime" element
     */
    public void setLastModifiedTimeArray(int i, java.util.Calendar lastModifiedTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTMODIFIEDTIME$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setCalendarValue(lastModifiedTime);
        }
    }
    
    /**
     * Sets (as xml) array of all "lastModifiedTime" element
     */
    public void xsetLastModifiedTimeArray(org.apache.xmlbeans.XmlDateTime[]lastModifiedTimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lastModifiedTimeArray, LASTMODIFIEDTIME$26);
        }
    }
    
    /**
     * Sets (as xml) ith "lastModifiedTime" element
     */
    public void xsetLastModifiedTimeArray(int i, org.apache.xmlbeans.XmlDateTime lastModifiedTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTMODIFIEDTIME$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lastModifiedTime);
        }
    }
    
    /**
     * Inserts the value as the ith "lastModifiedTime" element
     */
    public void insertLastModifiedTime(int i, java.util.Calendar lastModifiedTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LASTMODIFIEDTIME$26, i);
            target.setCalendarValue(lastModifiedTime);
        }
    }
    
    /**
     * Appends the value as the last "lastModifiedTime" element
     */
    public void addLastModifiedTime(java.util.Calendar lastModifiedTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTMODIFIEDTIME$26);
            target.setCalendarValue(lastModifiedTime);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lastModifiedTime" element
     */
    public org.apache.xmlbeans.XmlDateTime insertNewLastModifiedTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().insert_element_user(LASTMODIFIEDTIME$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lastModifiedTime" element
     */
    public org.apache.xmlbeans.XmlDateTime addNewLastModifiedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LASTMODIFIEDTIME$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "lastModifiedTime" element
     */
    public void removeLastModifiedTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTMODIFIEDTIME$26, i);
        }
    }
    
    /**
     * Gets array of all "lastModifiedBy" elements
     */
    public java.lang.String[] getLastModifiedByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LASTMODIFIEDBY$28, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "lastModifiedBy" element
     */
    public java.lang.String getLastModifiedByArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTMODIFIEDBY$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "lastModifiedBy" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser[] xgetLastModifiedByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LASTMODIFIEDBY$28, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "lastModifiedBy" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser xgetLastModifiedByArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(LASTMODIFIEDBY$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lastModifiedBy" element
     */
    public int sizeOfLastModifiedByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTMODIFIEDBY$28);
        }
    }
    
    /**
     * Sets array of all "lastModifiedBy" element
     */
    public void setLastModifiedByArray(java.lang.String[] lastModifiedByArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lastModifiedByArray, LASTMODIFIEDBY$28);
        }
    }
    
    /**
     * Sets ith "lastModifiedBy" element
     */
    public void setLastModifiedByArray(int i, java.lang.String lastModifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTMODIFIEDBY$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(lastModifiedBy);
        }
    }
    
    /**
     * Sets (as xml) array of all "lastModifiedBy" element
     */
    public void xsetLastModifiedByArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser[]lastModifiedByArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lastModifiedByArray, LASTMODIFIEDBY$28);
        }
    }
    
    /**
     * Sets (as xml) ith "lastModifiedBy" element
     */
    public void xsetLastModifiedByArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser lastModifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(LASTMODIFIEDBY$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lastModifiedBy);
        }
    }
    
    /**
     * Inserts the value as the ith "lastModifiedBy" element
     */
    public void insertLastModifiedBy(int i, java.lang.String lastModifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LASTMODIFIEDBY$28, i);
            target.setStringValue(lastModifiedBy);
        }
    }
    
    /**
     * Appends the value as the last "lastModifiedBy" element
     */
    public void addLastModifiedBy(java.lang.String lastModifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTMODIFIEDBY$28);
            target.setStringValue(lastModifiedBy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lastModifiedBy" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser insertNewLastModifiedBy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().insert_element_user(LASTMODIFIEDBY$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lastModifiedBy" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser addNewLastModifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().add_element_user(LASTMODIFIEDBY$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "lastModifiedBy" element
     */
    public void removeLastModifiedBy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTMODIFIEDBY$28, i);
        }
    }
    
    /**
     * Gets array of all "activationTime" elements
     */
    public java.util.Calendar[] getActivationTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVATIONTIME$30, targetList);
            java.util.Calendar[] result = new java.util.Calendar[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getCalendarValue();
            return result;
        }
    }
    
    /**
     * Gets ith "activationTime" element
     */
    public java.util.Calendar getActivationTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVATIONTIME$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "activationTime" elements
     */
    public org.apache.xmlbeans.XmlDateTime[] xgetActivationTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVATIONTIME$30, targetList);
            org.apache.xmlbeans.XmlDateTime[] result = new org.apache.xmlbeans.XmlDateTime[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "activationTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetActivationTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ACTIVATIONTIME$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "activationTime" element
     */
    public int sizeOfActivationTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVATIONTIME$30);
        }
    }
    
    /**
     * Sets array of all "activationTime" element
     */
    public void setActivationTimeArray(java.util.Calendar[] activationTimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(activationTimeArray, ACTIVATIONTIME$30);
        }
    }
    
    /**
     * Sets ith "activationTime" element
     */
    public void setActivationTimeArray(int i, java.util.Calendar activationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVATIONTIME$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setCalendarValue(activationTime);
        }
    }
    
    /**
     * Sets (as xml) array of all "activationTime" element
     */
    public void xsetActivationTimeArray(org.apache.xmlbeans.XmlDateTime[]activationTimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(activationTimeArray, ACTIVATIONTIME$30);
        }
    }
    
    /**
     * Sets (as xml) ith "activationTime" element
     */
    public void xsetActivationTimeArray(int i, org.apache.xmlbeans.XmlDateTime activationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ACTIVATIONTIME$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(activationTime);
        }
    }
    
    /**
     * Inserts the value as the ith "activationTime" element
     */
    public void insertActivationTime(int i, java.util.Calendar activationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ACTIVATIONTIME$30, i);
            target.setCalendarValue(activationTime);
        }
    }
    
    /**
     * Appends the value as the last "activationTime" element
     */
    public void addActivationTime(java.util.Calendar activationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVATIONTIME$30);
            target.setCalendarValue(activationTime);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "activationTime" element
     */
    public org.apache.xmlbeans.XmlDateTime insertNewActivationTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().insert_element_user(ACTIVATIONTIME$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "activationTime" element
     */
    public org.apache.xmlbeans.XmlDateTime addNewActivationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ACTIVATIONTIME$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "activationTime" element
     */
    public void removeActivationTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVATIONTIME$30, i);
        }
    }
    
    /**
     * Gets array of all "expirationTime" elements
     */
    public java.util.Calendar[] getExpirationTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXPIRATIONTIME$32, targetList);
            java.util.Calendar[] result = new java.util.Calendar[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getCalendarValue();
            return result;
        }
    }
    
    /**
     * Gets ith "expirationTime" element
     */
    public java.util.Calendar getExpirationTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONTIME$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "expirationTime" elements
     */
    public org.apache.xmlbeans.XmlDateTime[] xgetExpirationTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXPIRATIONTIME$32, targetList);
            org.apache.xmlbeans.XmlDateTime[] result = new org.apache.xmlbeans.XmlDateTime[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "expirationTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetExpirationTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXPIRATIONTIME$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "expirationTime" element
     */
    public int sizeOfExpirationTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPIRATIONTIME$32);
        }
    }
    
    /**
     * Sets array of all "expirationTime" element
     */
    public void setExpirationTimeArray(java.util.Calendar[] expirationTimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(expirationTimeArray, EXPIRATIONTIME$32);
        }
    }
    
    /**
     * Sets ith "expirationTime" element
     */
    public void setExpirationTimeArray(int i, java.util.Calendar expirationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONTIME$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setCalendarValue(expirationTime);
        }
    }
    
    /**
     * Sets (as xml) array of all "expirationTime" element
     */
    public void xsetExpirationTimeArray(org.apache.xmlbeans.XmlDateTime[]expirationTimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(expirationTimeArray, EXPIRATIONTIME$32);
        }
    }
    
    /**
     * Sets (as xml) ith "expirationTime" element
     */
    public void xsetExpirationTimeArray(int i, org.apache.xmlbeans.XmlDateTime expirationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXPIRATIONTIME$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(expirationTime);
        }
    }
    
    /**
     * Inserts the value as the ith "expirationTime" element
     */
    public void insertExpirationTime(int i, java.util.Calendar expirationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EXPIRATIONTIME$32, i);
            target.setCalendarValue(expirationTime);
        }
    }
    
    /**
     * Appends the value as the last "expirationTime" element
     */
    public void addExpirationTime(java.util.Calendar expirationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPIRATIONTIME$32);
            target.setCalendarValue(expirationTime);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "expirationTime" element
     */
    public org.apache.xmlbeans.XmlDateTime insertNewExpirationTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().insert_element_user(EXPIRATIONTIME$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "expirationTime" element
     */
    public org.apache.xmlbeans.XmlDateTime addNewExpirationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EXPIRATIONTIME$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "expirationTime" element
     */
    public void removeExpirationTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPIRATIONTIME$32, i);
        }
    }
    
    /**
     * Gets array of all "isSkipable" elements
     */
    public boolean[] getIsSkipableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ISSKIPABLE$34, targetList);
            boolean[] result = new boolean[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBooleanValue();
            return result;
        }
    }
    
    /**
     * Gets ith "isSkipable" element
     */
    public boolean getIsSkipableArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSKIPABLE$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "isSkipable" elements
     */
    public org.apache.xmlbeans.XmlBoolean[] xgetIsSkipableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ISSKIPABLE$34, targetList);
            org.apache.xmlbeans.XmlBoolean[] result = new org.apache.xmlbeans.XmlBoolean[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "isSkipable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsSkipableArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSKIPABLE$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "isSkipable" element
     */
    public int sizeOfIsSkipableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSKIPABLE$34);
        }
    }
    
    /**
     * Sets array of all "isSkipable" element
     */
    public void setIsSkipableArray(boolean[] isSkipableArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(isSkipableArray, ISSKIPABLE$34);
        }
    }
    
    /**
     * Sets ith "isSkipable" element
     */
    public void setIsSkipableArray(int i, boolean isSkipable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSKIPABLE$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBooleanValue(isSkipable);
        }
    }
    
    /**
     * Sets (as xml) array of all "isSkipable" element
     */
    public void xsetIsSkipableArray(org.apache.xmlbeans.XmlBoolean[]isSkipableArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(isSkipableArray, ISSKIPABLE$34);
        }
    }
    
    /**
     * Sets (as xml) ith "isSkipable" element
     */
    public void xsetIsSkipableArray(int i, org.apache.xmlbeans.XmlBoolean isSkipable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSKIPABLE$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(isSkipable);
        }
    }
    
    /**
     * Inserts the value as the ith "isSkipable" element
     */
    public void insertIsSkipable(int i, boolean isSkipable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ISSKIPABLE$34, i);
            target.setBooleanValue(isSkipable);
        }
    }
    
    /**
     * Appends the value as the last "isSkipable" element
     */
    public void addIsSkipable(boolean isSkipable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSKIPABLE$34);
            target.setBooleanValue(isSkipable);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "isSkipable" element
     */
    public org.apache.xmlbeans.XmlBoolean insertNewIsSkipable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().insert_element_user(ISSKIPABLE$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "isSkipable" element
     */
    public org.apache.xmlbeans.XmlBoolean addNewIsSkipable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISSKIPABLE$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "isSkipable" element
     */
    public void removeIsSkipable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSKIPABLE$34, i);
        }
    }
    
    /**
     * Gets array of all "hasPotentialOwners" elements
     */
    public boolean[] getHasPotentialOwnersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HASPOTENTIALOWNERS$36, targetList);
            boolean[] result = new boolean[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBooleanValue();
            return result;
        }
    }
    
    /**
     * Gets ith "hasPotentialOwners" element
     */
    public boolean getHasPotentialOwnersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASPOTENTIALOWNERS$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "hasPotentialOwners" elements
     */
    public org.apache.xmlbeans.XmlBoolean[] xgetHasPotentialOwnersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HASPOTENTIALOWNERS$36, targetList);
            org.apache.xmlbeans.XmlBoolean[] result = new org.apache.xmlbeans.XmlBoolean[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "hasPotentialOwners" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasPotentialOwnersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASPOTENTIALOWNERS$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hasPotentialOwners" element
     */
    public int sizeOfHasPotentialOwnersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASPOTENTIALOWNERS$36);
        }
    }
    
    /**
     * Sets array of all "hasPotentialOwners" element
     */
    public void setHasPotentialOwnersArray(boolean[] hasPotentialOwnersArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hasPotentialOwnersArray, HASPOTENTIALOWNERS$36);
        }
    }
    
    /**
     * Sets ith "hasPotentialOwners" element
     */
    public void setHasPotentialOwnersArray(int i, boolean hasPotentialOwners)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASPOTENTIALOWNERS$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBooleanValue(hasPotentialOwners);
        }
    }
    
    /**
     * Sets (as xml) array of all "hasPotentialOwners" element
     */
    public void xsetHasPotentialOwnersArray(org.apache.xmlbeans.XmlBoolean[]hasPotentialOwnersArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hasPotentialOwnersArray, HASPOTENTIALOWNERS$36);
        }
    }
    
    /**
     * Sets (as xml) ith "hasPotentialOwners" element
     */
    public void xsetHasPotentialOwnersArray(int i, org.apache.xmlbeans.XmlBoolean hasPotentialOwners)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASPOTENTIALOWNERS$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hasPotentialOwners);
        }
    }
    
    /**
     * Inserts the value as the ith "hasPotentialOwners" element
     */
    public void insertHasPotentialOwners(int i, boolean hasPotentialOwners)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(HASPOTENTIALOWNERS$36, i);
            target.setBooleanValue(hasPotentialOwners);
        }
    }
    
    /**
     * Appends the value as the last "hasPotentialOwners" element
     */
    public void addHasPotentialOwners(boolean hasPotentialOwners)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASPOTENTIALOWNERS$36);
            target.setBooleanValue(hasPotentialOwners);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hasPotentialOwners" element
     */
    public org.apache.xmlbeans.XmlBoolean insertNewHasPotentialOwners(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().insert_element_user(HASPOTENTIALOWNERS$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hasPotentialOwners" element
     */
    public org.apache.xmlbeans.XmlBoolean addNewHasPotentialOwners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASPOTENTIALOWNERS$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "hasPotentialOwners" element
     */
    public void removeHasPotentialOwners(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASPOTENTIALOWNERS$36, i);
        }
    }
    
    /**
     * Gets array of all "startByTime" elements
     */
    public java.util.Calendar[] getStartByTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STARTBYTIME$38, targetList);
            java.util.Calendar[] result = new java.util.Calendar[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getCalendarValue();
            return result;
        }
    }
    
    /**
     * Gets ith "startByTime" element
     */
    public java.util.Calendar getStartByTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTBYTIME$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "startByTime" elements
     */
    public org.apache.xmlbeans.XmlDateTime[] xgetStartByTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STARTBYTIME$38, targetList);
            org.apache.xmlbeans.XmlDateTime[] result = new org.apache.xmlbeans.XmlDateTime[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "startByTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetStartByTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTBYTIME$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "startByTime" element
     */
    public int sizeOfStartByTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTBYTIME$38);
        }
    }
    
    /**
     * Sets array of all "startByTime" element
     */
    public void setStartByTimeArray(java.util.Calendar[] startByTimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(startByTimeArray, STARTBYTIME$38);
        }
    }
    
    /**
     * Sets ith "startByTime" element
     */
    public void setStartByTimeArray(int i, java.util.Calendar startByTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTBYTIME$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setCalendarValue(startByTime);
        }
    }
    
    /**
     * Sets (as xml) array of all "startByTime" element
     */
    public void xsetStartByTimeArray(org.apache.xmlbeans.XmlDateTime[]startByTimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(startByTimeArray, STARTBYTIME$38);
        }
    }
    
    /**
     * Sets (as xml) ith "startByTime" element
     */
    public void xsetStartByTimeArray(int i, org.apache.xmlbeans.XmlDateTime startByTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTBYTIME$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(startByTime);
        }
    }
    
    /**
     * Inserts the value as the ith "startByTime" element
     */
    public void insertStartByTime(int i, java.util.Calendar startByTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STARTBYTIME$38, i);
            target.setCalendarValue(startByTime);
        }
    }
    
    /**
     * Appends the value as the last "startByTime" element
     */
    public void addStartByTime(java.util.Calendar startByTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTBYTIME$38);
            target.setCalendarValue(startByTime);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "startByTime" element
     */
    public org.apache.xmlbeans.XmlDateTime insertNewStartByTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().insert_element_user(STARTBYTIME$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "startByTime" element
     */
    public org.apache.xmlbeans.XmlDateTime addNewStartByTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(STARTBYTIME$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "startByTime" element
     */
    public void removeStartByTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTBYTIME$38, i);
        }
    }
    
    /**
     * Gets array of all "completeByTime" elements
     */
    public java.util.Calendar[] getCompleteByTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPLETEBYTIME$40, targetList);
            java.util.Calendar[] result = new java.util.Calendar[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getCalendarValue();
            return result;
        }
    }
    
    /**
     * Gets ith "completeByTime" element
     */
    public java.util.Calendar getCompleteByTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPLETEBYTIME$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "completeByTime" elements
     */
    public org.apache.xmlbeans.XmlDateTime[] xgetCompleteByTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPLETEBYTIME$40, targetList);
            org.apache.xmlbeans.XmlDateTime[] result = new org.apache.xmlbeans.XmlDateTime[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "completeByTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCompleteByTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(COMPLETEBYTIME$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "completeByTime" element
     */
    public int sizeOfCompleteByTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLETEBYTIME$40);
        }
    }
    
    /**
     * Sets array of all "completeByTime" element
     */
    public void setCompleteByTimeArray(java.util.Calendar[] completeByTimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(completeByTimeArray, COMPLETEBYTIME$40);
        }
    }
    
    /**
     * Sets ith "completeByTime" element
     */
    public void setCompleteByTimeArray(int i, java.util.Calendar completeByTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPLETEBYTIME$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setCalendarValue(completeByTime);
        }
    }
    
    /**
     * Sets (as xml) array of all "completeByTime" element
     */
    public void xsetCompleteByTimeArray(org.apache.xmlbeans.XmlDateTime[]completeByTimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(completeByTimeArray, COMPLETEBYTIME$40);
        }
    }
    
    /**
     * Sets (as xml) ith "completeByTime" element
     */
    public void xsetCompleteByTimeArray(int i, org.apache.xmlbeans.XmlDateTime completeByTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(COMPLETEBYTIME$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(completeByTime);
        }
    }
    
    /**
     * Inserts the value as the ith "completeByTime" element
     */
    public void insertCompleteByTime(int i, java.util.Calendar completeByTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(COMPLETEBYTIME$40, i);
            target.setCalendarValue(completeByTime);
        }
    }
    
    /**
     * Appends the value as the last "completeByTime" element
     */
    public void addCompleteByTime(java.util.Calendar completeByTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPLETEBYTIME$40);
            target.setCalendarValue(completeByTime);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "completeByTime" element
     */
    public org.apache.xmlbeans.XmlDateTime insertNewCompleteByTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().insert_element_user(COMPLETEBYTIME$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "completeByTime" element
     */
    public org.apache.xmlbeans.XmlDateTime addNewCompleteByTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(COMPLETEBYTIME$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "completeByTime" element
     */
    public void removeCompleteByTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLETEBYTIME$40, i);
        }
    }
    
    /**
     * Gets array of all "presentationName" elements
     */
    public java.lang.String[] getPresentationNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRESENTATIONNAME$42, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "presentationName" element
     */
    public java.lang.String getPresentationNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTATIONNAME$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "presentationName" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName[] xgetPresentationNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRESENTATIONNAME$42, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "presentationName" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName xgetPresentationNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName)get_store().find_element_user(PRESENTATIONNAME$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "presentationName" element
     */
    public int sizeOfPresentationNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRESENTATIONNAME$42);
        }
    }
    
    /**
     * Sets array of all "presentationName" element
     */
    public void setPresentationNameArray(java.lang.String[] presentationNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(presentationNameArray, PRESENTATIONNAME$42);
        }
    }
    
    /**
     * Sets ith "presentationName" element
     */
    public void setPresentationNameArray(int i, java.lang.String presentationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTATIONNAME$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(presentationName);
        }
    }
    
    /**
     * Sets (as xml) array of all "presentationName" element
     */
    public void xsetPresentationNameArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName[]presentationNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(presentationNameArray, PRESENTATIONNAME$42);
        }
    }
    
    /**
     * Sets (as xml) ith "presentationName" element
     */
    public void xsetPresentationNameArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName presentationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName)get_store().find_element_user(PRESENTATIONNAME$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(presentationName);
        }
    }
    
    /**
     * Inserts the value as the ith "presentationName" element
     */
    public void insertPresentationName(int i, java.lang.String presentationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PRESENTATIONNAME$42, i);
            target.setStringValue(presentationName);
        }
    }
    
    /**
     * Appends the value as the last "presentationName" element
     */
    public void addPresentationName(java.lang.String presentationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRESENTATIONNAME$42);
            target.setStringValue(presentationName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "presentationName" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName insertNewPresentationName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName)get_store().insert_element_user(PRESENTATIONNAME$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "presentationName" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName addNewPresentationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName)get_store().add_element_user(PRESENTATIONNAME$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "presentationName" element
     */
    public void removePresentationName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRESENTATIONNAME$42, i);
        }
    }
    
    /**
     * Gets array of all "presentationSubject" elements
     */
    public java.lang.String[] getPresentationSubjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRESENTATIONSUBJECT$44, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "presentationSubject" element
     */
    public java.lang.String getPresentationSubjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTATIONSUBJECT$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "presentationSubject" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject[] xgetPresentationSubjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRESENTATIONSUBJECT$44, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "presentationSubject" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject xgetPresentationSubjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject)get_store().find_element_user(PRESENTATIONSUBJECT$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "presentationSubject" element
     */
    public int sizeOfPresentationSubjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRESENTATIONSUBJECT$44);
        }
    }
    
    /**
     * Sets array of all "presentationSubject" element
     */
    public void setPresentationSubjectArray(java.lang.String[] presentationSubjectArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(presentationSubjectArray, PRESENTATIONSUBJECT$44);
        }
    }
    
    /**
     * Sets ith "presentationSubject" element
     */
    public void setPresentationSubjectArray(int i, java.lang.String presentationSubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTATIONSUBJECT$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(presentationSubject);
        }
    }
    
    /**
     * Sets (as xml) array of all "presentationSubject" element
     */
    public void xsetPresentationSubjectArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject[]presentationSubjectArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(presentationSubjectArray, PRESENTATIONSUBJECT$44);
        }
    }
    
    /**
     * Sets (as xml) ith "presentationSubject" element
     */
    public void xsetPresentationSubjectArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject presentationSubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject)get_store().find_element_user(PRESENTATIONSUBJECT$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(presentationSubject);
        }
    }
    
    /**
     * Inserts the value as the ith "presentationSubject" element
     */
    public void insertPresentationSubject(int i, java.lang.String presentationSubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PRESENTATIONSUBJECT$44, i);
            target.setStringValue(presentationSubject);
        }
    }
    
    /**
     * Appends the value as the last "presentationSubject" element
     */
    public void addPresentationSubject(java.lang.String presentationSubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRESENTATIONSUBJECT$44);
            target.setStringValue(presentationSubject);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "presentationSubject" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject insertNewPresentationSubject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject)get_store().insert_element_user(PRESENTATIONSUBJECT$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "presentationSubject" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject addNewPresentationSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject)get_store().add_element_user(PRESENTATIONSUBJECT$44);
            return target;
        }
    }
    
    /**
     * Removes the ith "presentationSubject" element
     */
    public void removePresentationSubject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRESENTATIONSUBJECT$44, i);
        }
    }
    
    /**
     * Gets array of all "renderingMethodName" elements
     */
    public javax.xml.namespace.QName[] getRenderingMethodNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RENDERINGMETHODNAME$46, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "renderingMethodName" element
     */
    public javax.xml.namespace.QName getRenderingMethodNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGMETHODNAME$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "renderingMethodName" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetRenderingMethodNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RENDERINGMETHODNAME$46, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "renderingMethodName" element
     */
    public org.apache.xmlbeans.XmlQName xgetRenderingMethodNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(RENDERINGMETHODNAME$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "renderingMethodName" element
     */
    public int sizeOfRenderingMethodNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RENDERINGMETHODNAME$46);
        }
    }
    
    /**
     * Sets array of all "renderingMethodName" element
     */
    public void setRenderingMethodNameArray(javax.xml.namespace.QName[] renderingMethodNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(renderingMethodNameArray, RENDERINGMETHODNAME$46);
        }
    }
    
    /**
     * Sets ith "renderingMethodName" element
     */
    public void setRenderingMethodNameArray(int i, javax.xml.namespace.QName renderingMethodName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGMETHODNAME$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(renderingMethodName);
        }
    }
    
    /**
     * Sets (as xml) array of all "renderingMethodName" element
     */
    public void xsetRenderingMethodNameArray(org.apache.xmlbeans.XmlQName[]renderingMethodNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(renderingMethodNameArray, RENDERINGMETHODNAME$46);
        }
    }
    
    /**
     * Sets (as xml) ith "renderingMethodName" element
     */
    public void xsetRenderingMethodNameArray(int i, org.apache.xmlbeans.XmlQName renderingMethodName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(RENDERINGMETHODNAME$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(renderingMethodName);
        }
    }
    
    /**
     * Inserts the value as the ith "renderingMethodName" element
     */
    public void insertRenderingMethodName(int i, javax.xml.namespace.QName renderingMethodName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(RENDERINGMETHODNAME$46, i);
            target.setQNameValue(renderingMethodName);
        }
    }
    
    /**
     * Appends the value as the last "renderingMethodName" element
     */
    public void addRenderingMethodName(javax.xml.namespace.QName renderingMethodName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RENDERINGMETHODNAME$46);
            target.setQNameValue(renderingMethodName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "renderingMethodName" element
     */
    public org.apache.xmlbeans.XmlQName insertNewRenderingMethodName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(RENDERINGMETHODNAME$46, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "renderingMethodName" element
     */
    public org.apache.xmlbeans.XmlQName addNewRenderingMethodName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(RENDERINGMETHODNAME$46);
            return target;
        }
    }
    
    /**
     * Removes the ith "renderingMethodName" element
     */
    public void removeRenderingMethodName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RENDERINGMETHODNAME$46, i);
        }
    }
    
    /**
     * Gets array of all "hasOutput" elements
     */
    public boolean[] getHasOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HASOUTPUT$48, targetList);
            boolean[] result = new boolean[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBooleanValue();
            return result;
        }
    }
    
    /**
     * Gets ith "hasOutput" element
     */
    public boolean getHasOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASOUTPUT$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "hasOutput" elements
     */
    public org.apache.xmlbeans.XmlBoolean[] xgetHasOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HASOUTPUT$48, targetList);
            org.apache.xmlbeans.XmlBoolean[] result = new org.apache.xmlbeans.XmlBoolean[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "hasOutput" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASOUTPUT$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hasOutput" element
     */
    public int sizeOfHasOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASOUTPUT$48);
        }
    }
    
    /**
     * Sets array of all "hasOutput" element
     */
    public void setHasOutputArray(boolean[] hasOutputArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hasOutputArray, HASOUTPUT$48);
        }
    }
    
    /**
     * Sets ith "hasOutput" element
     */
    public void setHasOutputArray(int i, boolean hasOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASOUTPUT$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBooleanValue(hasOutput);
        }
    }
    
    /**
     * Sets (as xml) array of all "hasOutput" element
     */
    public void xsetHasOutputArray(org.apache.xmlbeans.XmlBoolean[]hasOutputArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hasOutputArray, HASOUTPUT$48);
        }
    }
    
    /**
     * Sets (as xml) ith "hasOutput" element
     */
    public void xsetHasOutputArray(int i, org.apache.xmlbeans.XmlBoolean hasOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASOUTPUT$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hasOutput);
        }
    }
    
    /**
     * Inserts the value as the ith "hasOutput" element
     */
    public void insertHasOutput(int i, boolean hasOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(HASOUTPUT$48, i);
            target.setBooleanValue(hasOutput);
        }
    }
    
    /**
     * Appends the value as the last "hasOutput" element
     */
    public void addHasOutput(boolean hasOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASOUTPUT$48);
            target.setBooleanValue(hasOutput);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hasOutput" element
     */
    public org.apache.xmlbeans.XmlBoolean insertNewHasOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().insert_element_user(HASOUTPUT$48, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hasOutput" element
     */
    public org.apache.xmlbeans.XmlBoolean addNewHasOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASOUTPUT$48);
            return target;
        }
    }
    
    /**
     * Removes the ith "hasOutput" element
     */
    public void removeHasOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASOUTPUT$48, i);
        }
    }
    
    /**
     * Gets array of all "hasFault" elements
     */
    public boolean[] getHasFaultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HASFAULT$50, targetList);
            boolean[] result = new boolean[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBooleanValue();
            return result;
        }
    }
    
    /**
     * Gets ith "hasFault" element
     */
    public boolean getHasFaultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASFAULT$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "hasFault" elements
     */
    public org.apache.xmlbeans.XmlBoolean[] xgetHasFaultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HASFAULT$50, targetList);
            org.apache.xmlbeans.XmlBoolean[] result = new org.apache.xmlbeans.XmlBoolean[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "hasFault" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasFaultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASFAULT$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hasFault" element
     */
    public int sizeOfHasFaultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASFAULT$50);
        }
    }
    
    /**
     * Sets array of all "hasFault" element
     */
    public void setHasFaultArray(boolean[] hasFaultArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hasFaultArray, HASFAULT$50);
        }
    }
    
    /**
     * Sets ith "hasFault" element
     */
    public void setHasFaultArray(int i, boolean hasFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASFAULT$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBooleanValue(hasFault);
        }
    }
    
    /**
     * Sets (as xml) array of all "hasFault" element
     */
    public void xsetHasFaultArray(org.apache.xmlbeans.XmlBoolean[]hasFaultArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hasFaultArray, HASFAULT$50);
        }
    }
    
    /**
     * Sets (as xml) ith "hasFault" element
     */
    public void xsetHasFaultArray(int i, org.apache.xmlbeans.XmlBoolean hasFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASFAULT$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hasFault);
        }
    }
    
    /**
     * Inserts the value as the ith "hasFault" element
     */
    public void insertHasFault(int i, boolean hasFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(HASFAULT$50, i);
            target.setBooleanValue(hasFault);
        }
    }
    
    /**
     * Appends the value as the last "hasFault" element
     */
    public void addHasFault(boolean hasFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASFAULT$50);
            target.setBooleanValue(hasFault);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hasFault" element
     */
    public org.apache.xmlbeans.XmlBoolean insertNewHasFault(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().insert_element_user(HASFAULT$50, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hasFault" element
     */
    public org.apache.xmlbeans.XmlBoolean addNewHasFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASFAULT$50);
            return target;
        }
    }
    
    /**
     * Removes the ith "hasFault" element
     */
    public void removeHasFault(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASFAULT$50, i);
        }
    }
    
    /**
     * Gets array of all "hasAttachments" elements
     */
    public boolean[] getHasAttachmentsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HASATTACHMENTS$52, targetList);
            boolean[] result = new boolean[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBooleanValue();
            return result;
        }
    }
    
    /**
     * Gets ith "hasAttachments" element
     */
    public boolean getHasAttachmentsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASATTACHMENTS$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "hasAttachments" elements
     */
    public org.apache.xmlbeans.XmlBoolean[] xgetHasAttachmentsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HASATTACHMENTS$52, targetList);
            org.apache.xmlbeans.XmlBoolean[] result = new org.apache.xmlbeans.XmlBoolean[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "hasAttachments" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasAttachmentsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASATTACHMENTS$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hasAttachments" element
     */
    public int sizeOfHasAttachmentsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASATTACHMENTS$52);
        }
    }
    
    /**
     * Sets array of all "hasAttachments" element
     */
    public void setHasAttachmentsArray(boolean[] hasAttachmentsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hasAttachmentsArray, HASATTACHMENTS$52);
        }
    }
    
    /**
     * Sets ith "hasAttachments" element
     */
    public void setHasAttachmentsArray(int i, boolean hasAttachments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASATTACHMENTS$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBooleanValue(hasAttachments);
        }
    }
    
    /**
     * Sets (as xml) array of all "hasAttachments" element
     */
    public void xsetHasAttachmentsArray(org.apache.xmlbeans.XmlBoolean[]hasAttachmentsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hasAttachmentsArray, HASATTACHMENTS$52);
        }
    }
    
    /**
     * Sets (as xml) ith "hasAttachments" element
     */
    public void xsetHasAttachmentsArray(int i, org.apache.xmlbeans.XmlBoolean hasAttachments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASATTACHMENTS$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hasAttachments);
        }
    }
    
    /**
     * Inserts the value as the ith "hasAttachments" element
     */
    public void insertHasAttachments(int i, boolean hasAttachments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(HASATTACHMENTS$52, i);
            target.setBooleanValue(hasAttachments);
        }
    }
    
    /**
     * Appends the value as the last "hasAttachments" element
     */
    public void addHasAttachments(boolean hasAttachments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASATTACHMENTS$52);
            target.setBooleanValue(hasAttachments);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hasAttachments" element
     */
    public org.apache.xmlbeans.XmlBoolean insertNewHasAttachments(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().insert_element_user(HASATTACHMENTS$52, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hasAttachments" element
     */
    public org.apache.xmlbeans.XmlBoolean addNewHasAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASATTACHMENTS$52);
            return target;
        }
    }
    
    /**
     * Removes the ith "hasAttachments" element
     */
    public void removeHasAttachments(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASATTACHMENTS$52, i);
        }
    }
    
    /**
     * Gets array of all "hasComments" elements
     */
    public boolean[] getHasCommentsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HASCOMMENTS$54, targetList);
            boolean[] result = new boolean[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBooleanValue();
            return result;
        }
    }
    
    /**
     * Gets ith "hasComments" element
     */
    public boolean getHasCommentsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASCOMMENTS$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "hasComments" elements
     */
    public org.apache.xmlbeans.XmlBoolean[] xgetHasCommentsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HASCOMMENTS$54, targetList);
            org.apache.xmlbeans.XmlBoolean[] result = new org.apache.xmlbeans.XmlBoolean[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "hasComments" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasCommentsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASCOMMENTS$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hasComments" element
     */
    public int sizeOfHasCommentsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASCOMMENTS$54);
        }
    }
    
    /**
     * Sets array of all "hasComments" element
     */
    public void setHasCommentsArray(boolean[] hasCommentsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hasCommentsArray, HASCOMMENTS$54);
        }
    }
    
    /**
     * Sets ith "hasComments" element
     */
    public void setHasCommentsArray(int i, boolean hasComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASCOMMENTS$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBooleanValue(hasComments);
        }
    }
    
    /**
     * Sets (as xml) array of all "hasComments" element
     */
    public void xsetHasCommentsArray(org.apache.xmlbeans.XmlBoolean[]hasCommentsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hasCommentsArray, HASCOMMENTS$54);
        }
    }
    
    /**
     * Sets (as xml) ith "hasComments" element
     */
    public void xsetHasCommentsArray(int i, org.apache.xmlbeans.XmlBoolean hasComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASCOMMENTS$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hasComments);
        }
    }
    
    /**
     * Inserts the value as the ith "hasComments" element
     */
    public void insertHasComments(int i, boolean hasComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(HASCOMMENTS$54, i);
            target.setBooleanValue(hasComments);
        }
    }
    
    /**
     * Appends the value as the last "hasComments" element
     */
    public void addHasComments(boolean hasComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASCOMMENTS$54);
            target.setBooleanValue(hasComments);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hasComments" element
     */
    public org.apache.xmlbeans.XmlBoolean insertNewHasComments(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().insert_element_user(HASCOMMENTS$54, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hasComments" element
     */
    public org.apache.xmlbeans.XmlBoolean addNewHasComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASCOMMENTS$54);
            return target;
        }
    }
    
    /**
     * Removes the ith "hasComments" element
     */
    public void removeHasComments(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASCOMMENTS$54, i);
        }
    }
    
    /**
     * Gets array of all "escalated" elements
     */
    public boolean[] getEscalatedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ESCALATED$56, targetList);
            boolean[] result = new boolean[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBooleanValue();
            return result;
        }
    }
    
    /**
     * Gets ith "escalated" element
     */
    public boolean getEscalatedArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESCALATED$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "escalated" elements
     */
    public org.apache.xmlbeans.XmlBoolean[] xgetEscalatedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ESCALATED$56, targetList);
            org.apache.xmlbeans.XmlBoolean[] result = new org.apache.xmlbeans.XmlBoolean[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "escalated" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetEscalatedArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ESCALATED$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "escalated" element
     */
    public int sizeOfEscalatedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESCALATED$56);
        }
    }
    
    /**
     * Sets array of all "escalated" element
     */
    public void setEscalatedArray(boolean[] escalatedArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(escalatedArray, ESCALATED$56);
        }
    }
    
    /**
     * Sets ith "escalated" element
     */
    public void setEscalatedArray(int i, boolean escalated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESCALATED$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBooleanValue(escalated);
        }
    }
    
    /**
     * Sets (as xml) array of all "escalated" element
     */
    public void xsetEscalatedArray(org.apache.xmlbeans.XmlBoolean[]escalatedArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(escalatedArray, ESCALATED$56);
        }
    }
    
    /**
     * Sets (as xml) ith "escalated" element
     */
    public void xsetEscalatedArray(int i, org.apache.xmlbeans.XmlBoolean escalated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ESCALATED$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(escalated);
        }
    }
    
    /**
     * Inserts the value as the ith "escalated" element
     */
    public void insertEscalated(int i, boolean escalated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ESCALATED$56, i);
            target.setBooleanValue(escalated);
        }
    }
    
    /**
     * Appends the value as the last "escalated" element
     */
    public void addEscalated(boolean escalated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESCALATED$56);
            target.setBooleanValue(escalated);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "escalated" element
     */
    public org.apache.xmlbeans.XmlBoolean insertNewEscalated(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().insert_element_user(ESCALATED$56, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "escalated" element
     */
    public org.apache.xmlbeans.XmlBoolean addNewEscalated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ESCALATED$56);
            return target;
        }
    }
    
    /**
     * Removes the ith "escalated" element
     */
    public void removeEscalated(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESCALATED$56, i);
        }
    }
    
    /**
     * Gets array of all "parentTaskId" elements
     */
    public java.lang.String[] getParentTaskIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARENTTASKID$58, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "parentTaskId" element
     */
    public java.lang.String getParentTaskIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTTASKID$58, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "parentTaskId" elements
     */
    public org.apache.xmlbeans.XmlAnyURI[] xgetParentTaskIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARENTTASKID$58, targetList);
            org.apache.xmlbeans.XmlAnyURI[] result = new org.apache.xmlbeans.XmlAnyURI[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "parentTaskId" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetParentTaskIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PARENTTASKID$58, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "parentTaskId" element
     */
    public int sizeOfParentTaskIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTTASKID$58);
        }
    }
    
    /**
     * Sets array of all "parentTaskId" element
     */
    public void setParentTaskIdArray(java.lang.String[] parentTaskIdArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parentTaskIdArray, PARENTTASKID$58);
        }
    }
    
    /**
     * Sets ith "parentTaskId" element
     */
    public void setParentTaskIdArray(int i, java.lang.String parentTaskId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTTASKID$58, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(parentTaskId);
        }
    }
    
    /**
     * Sets (as xml) array of all "parentTaskId" element
     */
    public void xsetParentTaskIdArray(org.apache.xmlbeans.XmlAnyURI[]parentTaskIdArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parentTaskIdArray, PARENTTASKID$58);
        }
    }
    
    /**
     * Sets (as xml) ith "parentTaskId" element
     */
    public void xsetParentTaskIdArray(int i, org.apache.xmlbeans.XmlAnyURI parentTaskId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PARENTTASKID$58, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parentTaskId);
        }
    }
    
    /**
     * Inserts the value as the ith "parentTaskId" element
     */
    public void insertParentTaskId(int i, java.lang.String parentTaskId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PARENTTASKID$58, i);
            target.setStringValue(parentTaskId);
        }
    }
    
    /**
     * Appends the value as the last "parentTaskId" element
     */
    public void addParentTaskId(java.lang.String parentTaskId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTTASKID$58);
            target.setStringValue(parentTaskId);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parentTaskId" element
     */
    public org.apache.xmlbeans.XmlAnyURI insertNewParentTaskId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().insert_element_user(PARENTTASKID$58, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parentTaskId" element
     */
    public org.apache.xmlbeans.XmlAnyURI addNewParentTaskId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PARENTTASKID$58);
            return target;
        }
    }
    
    /**
     * Removes the ith "parentTaskId" element
     */
    public void removeParentTaskId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTTASKID$58, i);
        }
    }
    
    /**
     * Gets array of all "hasSubtasks" elements
     */
    public boolean[] getHasSubtasksArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HASSUBTASKS$60, targetList);
            boolean[] result = new boolean[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBooleanValue();
            return result;
        }
    }
    
    /**
     * Gets ith "hasSubtasks" element
     */
    public boolean getHasSubtasksArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASSUBTASKS$60, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "hasSubtasks" elements
     */
    public org.apache.xmlbeans.XmlBoolean[] xgetHasSubtasksArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HASSUBTASKS$60, targetList);
            org.apache.xmlbeans.XmlBoolean[] result = new org.apache.xmlbeans.XmlBoolean[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "hasSubtasks" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasSubtasksArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASSUBTASKS$60, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hasSubtasks" element
     */
    public int sizeOfHasSubtasksArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASSUBTASKS$60);
        }
    }
    
    /**
     * Sets array of all "hasSubtasks" element
     */
    public void setHasSubtasksArray(boolean[] hasSubtasksArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hasSubtasksArray, HASSUBTASKS$60);
        }
    }
    
    /**
     * Sets ith "hasSubtasks" element
     */
    public void setHasSubtasksArray(int i, boolean hasSubtasks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASSUBTASKS$60, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBooleanValue(hasSubtasks);
        }
    }
    
    /**
     * Sets (as xml) array of all "hasSubtasks" element
     */
    public void xsetHasSubtasksArray(org.apache.xmlbeans.XmlBoolean[]hasSubtasksArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hasSubtasksArray, HASSUBTASKS$60);
        }
    }
    
    /**
     * Sets (as xml) ith "hasSubtasks" element
     */
    public void xsetHasSubtasksArray(int i, org.apache.xmlbeans.XmlBoolean hasSubtasks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASSUBTASKS$60, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hasSubtasks);
        }
    }
    
    /**
     * Inserts the value as the ith "hasSubtasks" element
     */
    public void insertHasSubtasks(int i, boolean hasSubtasks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(HASSUBTASKS$60, i);
            target.setBooleanValue(hasSubtasks);
        }
    }
    
    /**
     * Appends the value as the last "hasSubtasks" element
     */
    public void addHasSubtasks(boolean hasSubtasks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASSUBTASKS$60);
            target.setBooleanValue(hasSubtasks);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hasSubtasks" element
     */
    public org.apache.xmlbeans.XmlBoolean insertNewHasSubtasks(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().insert_element_user(HASSUBTASKS$60, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hasSubtasks" element
     */
    public org.apache.xmlbeans.XmlBoolean addNewHasSubtasks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASSUBTASKS$60);
            return target;
        }
    }
    
    /**
     * Removes the ith "hasSubtasks" element
     */
    public void removeHasSubtasks(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASSUBTASKS$60, i);
        }
    }
    
    /**
     * Gets array of all "searchBy" elements
     */
    public java.lang.String[] getSearchByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SEARCHBY$62, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "searchBy" element
     */
    public java.lang.String getSearchByArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHBY$62, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "searchBy" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetSearchByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SEARCHBY$62, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "searchBy" element
     */
    public org.apache.xmlbeans.XmlString xgetSearchByArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHBY$62, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "searchBy" element
     */
    public int sizeOfSearchByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEARCHBY$62);
        }
    }
    
    /**
     * Sets array of all "searchBy" element
     */
    public void setSearchByArray(java.lang.String[] searchByArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(searchByArray, SEARCHBY$62);
        }
    }
    
    /**
     * Sets ith "searchBy" element
     */
    public void setSearchByArray(int i, java.lang.String searchBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHBY$62, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(searchBy);
        }
    }
    
    /**
     * Sets (as xml) array of all "searchBy" element
     */
    public void xsetSearchByArray(org.apache.xmlbeans.XmlString[]searchByArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(searchByArray, SEARCHBY$62);
        }
    }
    
    /**
     * Sets (as xml) ith "searchBy" element
     */
    public void xsetSearchByArray(int i, org.apache.xmlbeans.XmlString searchBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHBY$62, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(searchBy);
        }
    }
    
    /**
     * Inserts the value as the ith "searchBy" element
     */
    public void insertSearchBy(int i, java.lang.String searchBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SEARCHBY$62, i);
            target.setStringValue(searchBy);
        }
    }
    
    /**
     * Appends the value as the last "searchBy" element
     */
    public void addSearchBy(java.lang.String searchBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHBY$62);
            target.setStringValue(searchBy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "searchBy" element
     */
    public org.apache.xmlbeans.XmlString insertNewSearchBy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SEARCHBY$62, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "searchBy" element
     */
    public org.apache.xmlbeans.XmlString addNewSearchBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEARCHBY$62);
            return target;
        }
    }
    
    /**
     * Removes the ith "searchBy" element
     */
    public void removeSearchBy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEARCHBY$62, i);
        }
    }
    
    /**
     * Gets array of all "outcome" elements
     */
    public java.lang.String[] getOutcomeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OUTCOME$64, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "outcome" element
     */
    public java.lang.String getOutcomeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTCOME$64, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "outcome" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetOutcomeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OUTCOME$64, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "outcome" element
     */
    public org.apache.xmlbeans.XmlString xgetOutcomeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTCOME$64, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "outcome" element
     */
    public int sizeOfOutcomeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTCOME$64);
        }
    }
    
    /**
     * Sets array of all "outcome" element
     */
    public void setOutcomeArray(java.lang.String[] outcomeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(outcomeArray, OUTCOME$64);
        }
    }
    
    /**
     * Sets ith "outcome" element
     */
    public void setOutcomeArray(int i, java.lang.String outcome)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTCOME$64, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(outcome);
        }
    }
    
    /**
     * Sets (as xml) array of all "outcome" element
     */
    public void xsetOutcomeArray(org.apache.xmlbeans.XmlString[]outcomeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(outcomeArray, OUTCOME$64);
        }
    }
    
    /**
     * Sets (as xml) ith "outcome" element
     */
    public void xsetOutcomeArray(int i, org.apache.xmlbeans.XmlString outcome)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTCOME$64, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(outcome);
        }
    }
    
    /**
     * Inserts the value as the ith "outcome" element
     */
    public void insertOutcome(int i, java.lang.String outcome)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(OUTCOME$64, i);
            target.setStringValue(outcome);
        }
    }
    
    /**
     * Appends the value as the last "outcome" element
     */
    public void addOutcome(java.lang.String outcome)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTCOME$64);
            target.setStringValue(outcome);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "outcome" element
     */
    public org.apache.xmlbeans.XmlString insertNewOutcome(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(OUTCOME$64, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "outcome" element
     */
    public org.apache.xmlbeans.XmlString addNewOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OUTCOME$64);
            return target;
        }
    }
    
    /**
     * Removes the ith "outcome" element
     */
    public void removeOutcome(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTCOME$64, i);
        }
    }
    
    /**
     * Gets array of all "taskOperations" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations[] getTaskOperationsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TASKOPERATIONS$66, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "taskOperations" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations getTaskOperationsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations)get_store().find_element_user(TASKOPERATIONS$66, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "taskOperations" element
     */
    public int sizeOfTaskOperationsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TASKOPERATIONS$66);
        }
    }
    
    /**
     * Sets array of all "taskOperations" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTaskOperationsArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations[] taskOperationsArray)
    {
        check_orphaned();
        arraySetterHelper(taskOperationsArray, TASKOPERATIONS$66);
    }
    
    /**
     * Sets ith "taskOperations" element
     */
    public void setTaskOperationsArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations taskOperations)
    {
        generatedSetterHelperImpl(taskOperations, TASKOPERATIONS$66, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "taskOperations" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations insertNewTaskOperations(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations)get_store().insert_element_user(TASKOPERATIONS$66, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "taskOperations" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations addNewTaskOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations)get_store().add_element_user(TASKOPERATIONS$66);
            return target;
        }
    }
    
    /**
     * Removes the ith "taskOperations" element
     */
    public void removeTaskOperations(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TASKOPERATIONS$66, i);
        }
    }
}
