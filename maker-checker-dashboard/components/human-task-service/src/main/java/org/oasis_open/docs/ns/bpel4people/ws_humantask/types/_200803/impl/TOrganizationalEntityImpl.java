/*
 * XML Type:  tOrganizationalEntity
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * An XML tOrganizationalEntity(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public class TOrganizationalEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity
{
    private static final long serialVersionUID = 1L;
    
    public TOrganizationalEntityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USER$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "user");
    private static final javax.xml.namespace.QName GROUP$2 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "group");
    
    
    /**
     * Gets array of all "user" elements
     */
    public java.lang.String[] getUserArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USER$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "user" element
     */
    public java.lang.String getUserArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "user" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser[] xgetUserArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USER$0, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "user" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser xgetUserArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(USER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "user" element
     */
    public int sizeOfUserArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USER$0);
        }
    }
    
    /**
     * Sets array of all "user" element
     */
    public void setUserArray(java.lang.String[] userArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(userArray, USER$0);
        }
    }
    
    /**
     * Sets ith "user" element
     */
    public void setUserArray(int i, java.lang.String user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(user);
        }
    }
    
    /**
     * Sets (as xml) array of all "user" element
     */
    public void xsetUserArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser[]userArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(userArray, USER$0);
        }
    }
    
    /**
     * Sets (as xml) ith "user" element
     */
    public void xsetUserArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(USER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(user);
        }
    }
    
    /**
     * Inserts the value as the ith "user" element
     */
    public void insertUser(int i, java.lang.String user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(USER$0, i);
            target.setStringValue(user);
        }
    }
    
    /**
     * Appends the value as the last "user" element
     */
    public void addUser(java.lang.String user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USER$0);
            target.setStringValue(user);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "user" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser insertNewUser(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().insert_element_user(USER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "user" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser addNewUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().add_element_user(USER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "user" element
     */
    public void removeUser(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USER$0, i);
        }
    }
    
    /**
     * Gets array of all "group" elements
     */
    public java.lang.String[] getGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUP$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "group" element
     */
    public java.lang.String getGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "group" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup[] xgetGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUP$2, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "group" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup xgetGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup)get_store().find_element_user(GROUP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "group" element
     */
    public int sizeOfGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUP$2);
        }
    }
    
    /**
     * Sets array of all "group" element
     */
    public void setGroupArray(java.lang.String[] groupArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(groupArray, GROUP$2);
        }
    }
    
    /**
     * Sets ith "group" element
     */
    public void setGroupArray(int i, java.lang.String group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(group);
        }
    }
    
    /**
     * Sets (as xml) array of all "group" element
     */
    public void xsetGroupArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup[]groupArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(groupArray, GROUP$2);
        }
    }
    
    /**
     * Sets (as xml) ith "group" element
     */
    public void xsetGroupArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup)get_store().find_element_user(GROUP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(group);
        }
    }
    
    /**
     * Inserts the value as the ith "group" element
     */
    public void insertGroup(int i, java.lang.String group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(GROUP$2, i);
            target.setStringValue(group);
        }
    }
    
    /**
     * Appends the value as the last "group" element
     */
    public void addGroup(java.lang.String group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUP$2);
            target.setStringValue(group);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "group" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup insertNewGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup)get_store().insert_element_user(GROUP$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "group" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup)get_store().add_element_user(GROUP$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "group" element
     */
    public void removeGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUP$2, i);
        }
    }
}
