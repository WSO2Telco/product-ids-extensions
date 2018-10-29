/*
 * An XML document type.
 * Localname: illegalAccess
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one illegalAccess(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class IllegalAccessDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessDocument
{
    private static final long serialVersionUID = 1L;
    
    public IllegalAccessDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ILLEGALACCESS$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "illegalAccess");
    
    
    /**
     * Gets the "illegalAccess" element
     */
    public java.lang.String getIllegalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ILLEGALACCESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "illegalAccess" element
     */
    public org.apache.xmlbeans.XmlString xgetIllegalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ILLEGALACCESS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "illegalAccess" element
     */
    public void setIllegalAccess(java.lang.String illegalAccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ILLEGALACCESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ILLEGALACCESS$0);
            }
            target.setStringValue(illegalAccess);
        }
    }
    
    /**
     * Sets (as xml) the "illegalAccess" element
     */
    public void xsetIllegalAccess(org.apache.xmlbeans.XmlString illegalAccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ILLEGALACCESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ILLEGALACCESS$0);
            }
            target.set(illegalAccess);
        }
    }
}
