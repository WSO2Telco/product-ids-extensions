/*
 * An XML document type.
 * Localname: user
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.UserDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * A document containing one user(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public class UserDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.UserDocument
{
    private static final long serialVersionUID = 1L;
    
    public UserDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USER$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "user");
    
    
    /**
     * Gets the "user" element
     */
    public java.lang.String getUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "user" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser xgetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(USER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "user" element
     */
    public void setUser(java.lang.String user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USER$0);
            }
            target.setStringValue(user);
        }
    }
    
    /**
     * Sets (as xml) the "user" element
     */
    public void xsetUser(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().find_element_user(USER$0, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser)get_store().add_element_user(USER$0);
            }
            target.set(user);
        }
    }
}
