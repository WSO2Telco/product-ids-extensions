/*
 * An XML document type.
 * Localname: recipientNotAllowed
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.RecipientNotAllowedDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one recipientNotAllowed(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class RecipientNotAllowedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.RecipientNotAllowedDocument
{
    private static final long serialVersionUID = 1L;
    
    public RecipientNotAllowedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECIPIENTNOTALLOWED$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "recipientNotAllowed");
    
    
    /**
     * Gets the "recipientNotAllowed" element
     */
    public java.lang.String getRecipientNotAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECIPIENTNOTALLOWED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "recipientNotAllowed" element
     */
    public org.apache.xmlbeans.XmlString xgetRecipientNotAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECIPIENTNOTALLOWED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "recipientNotAllowed" element
     */
    public void setRecipientNotAllowed(java.lang.String recipientNotAllowed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECIPIENTNOTALLOWED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECIPIENTNOTALLOWED$0);
            }
            target.setStringValue(recipientNotAllowed);
        }
    }
    
    /**
     * Sets (as xml) the "recipientNotAllowed" element
     */
    public void xsetRecipientNotAllowed(org.apache.xmlbeans.XmlString recipientNotAllowed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECIPIENTNOTALLOWED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RECIPIENTNOTALLOWED$0);
            }
            target.set(recipientNotAllowed);
        }
    }
}
