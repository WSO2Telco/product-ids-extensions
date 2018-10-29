/*
 * An XML document type.
 * Localname: date
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.DateDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one date(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class DateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.DateDocument
{
    private static final long serialVersionUID = 1L;
    
    public DateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATE$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "date");
    
    
    /**
     * Gets the "date" element
     */
    public org.xmlsoap.schemas.soap.encoding.Date getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Date target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Date)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(org.xmlsoap.schemas.soap.encoding.Date date)
    {
        generatedSetterHelperImpl(date, DATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "date" element
     */
    public org.xmlsoap.schemas.soap.encoding.Date addNewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Date target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Date)get_store().add_element_user(DATE$0);
            return target;
        }
    }
}
