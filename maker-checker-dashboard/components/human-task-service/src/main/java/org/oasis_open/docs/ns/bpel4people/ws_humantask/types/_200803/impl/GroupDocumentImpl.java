/*
 * An XML document type.
 * Localname: group
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.GroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * A document containing one group(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public class GroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.GroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUP$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "group");
    
    
    /**
     * Gets the "group" element
     */
    public java.lang.String getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "group" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup xgetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup)get_store().find_element_user(GROUP$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "group" element
     */
    public void setGroup(java.lang.String group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUP$0);
            }
            target.setStringValue(group);
        }
    }
    
    /**
     * Sets (as xml) the "group" element
     */
    public void xsetGroup(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup)get_store().find_element_user(GROUP$0, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TGroup)get_store().add_element_user(GROUP$0);
            }
            target.set(group);
        }
    }
}
