/*
 * An XML document type.
 * Localname: illegalArgument
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one illegalArgument(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class IllegalArgumentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentDocument
{
    private static final long serialVersionUID = 1L;
    
    public IllegalArgumentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ILLEGALARGUMENT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "illegalArgument");
    
    
    /**
     * Gets the "illegalArgument" element
     */
    public java.lang.String getIllegalArgument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ILLEGALARGUMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "illegalArgument" element
     */
    public org.apache.xmlbeans.XmlString xgetIllegalArgument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ILLEGALARGUMENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "illegalArgument" element
     */
    public void setIllegalArgument(java.lang.String illegalArgument)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ILLEGALARGUMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ILLEGALARGUMENT$0);
            }
            target.setStringValue(illegalArgument);
        }
    }
    
    /**
     * Sets (as xml) the "illegalArgument" element
     */
    public void xsetIllegalArgument(org.apache.xmlbeans.XmlString illegalArgument)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ILLEGALARGUMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ILLEGALARGUMENT$0);
            }
            target.set(illegalArgument);
        }
    }
}
