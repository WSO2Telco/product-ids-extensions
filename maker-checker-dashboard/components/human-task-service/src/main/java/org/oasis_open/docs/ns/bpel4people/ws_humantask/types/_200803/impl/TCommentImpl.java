/*
 * XML Type:  tComment
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * An XML tComment(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public class TCommentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment
{
    private static final long serialVersionUID = 1L;
    
    public TCommentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "id");
    private static final javax.xml.namespace.QName ADDEDTIME$2 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "addedTime");
    private static final javax.xml.namespace.QName ADDEDBY$4 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "addedBy");
    private static final javax.xml.namespace.QName LASTMODIFIEDTIME$6 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "lastModifiedTime");
    private static final javax.xml.namespace.QName LASTMODIFIEDBY$8 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "lastModifiedBy");
    private static final javax.xml.namespace.QName TEXT$10 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "text");
    
    
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
     * Gets the "addedTime" element
     */
    public java.util.Calendar getAddedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDEDTIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "addedTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetAddedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ADDEDTIME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "addedTime" element
     */
    public void setAddedTime(java.util.Calendar addedTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDEDTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDEDTIME$2);
            }
            target.setCalendarValue(addedTime);
        }
    }
    
    /**
     * Sets (as xml) the "addedTime" element
     */
    public void xsetAddedTime(org.apache.xmlbeans.XmlDateTime addedTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ADDEDTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ADDEDTIME$2);
            }
            target.set(addedTime);
        }
    }
    
    /**
     * Gets the "addedBy" element
     */
    public java.lang.String getAddedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDEDBY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "addedBy" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser xgetAddedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(ADDEDBY$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "addedBy" element
     */
    public void setAddedBy(java.lang.String addedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDEDBY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDEDBY$4);
            }
            target.setStringValue(addedBy);
        }
    }
    
    /**
     * Sets (as xml) the "addedBy" element
     */
    public void xsetAddedBy(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser addedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(ADDEDBY$4, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().add_element_user(ADDEDBY$4);
            }
            target.set(addedBy);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTMODIFIEDTIME$6, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTMODIFIEDTIME$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTMODIFIEDTIME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTMODIFIEDTIME$6);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTMODIFIEDTIME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LASTMODIFIEDTIME$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTMODIFIEDBY$8, 0);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(LASTMODIFIEDBY$8, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTMODIFIEDBY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTMODIFIEDBY$8);
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
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(LASTMODIFIEDBY$8, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().add_element_user(LASTMODIFIEDBY$8);
            }
            target.set(lastModifiedBy);
        }
    }
    
    /**
     * Gets the "text" element
     */
    public java.lang.String getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "text" element
     */
    public org.apache.xmlbeans.XmlString xgetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(java.lang.String text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXT$10);
            }
            target.setStringValue(text);
        }
    }
    
    /**
     * Sets (as xml) the "text" element
     */
    public void xsetText(org.apache.xmlbeans.XmlString text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEXT$10);
            }
            target.set(text);
        }
    }
}
