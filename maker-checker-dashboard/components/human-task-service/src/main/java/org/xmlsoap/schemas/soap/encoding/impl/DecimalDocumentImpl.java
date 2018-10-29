/*
 * An XML document type.
 * Localname: decimal
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.DecimalDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one decimal(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class DecimalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.DecimalDocument
{
    private static final long serialVersionUID = 1L;
    
    public DecimalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DECIMAL$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal");
    
    
    /**
     * Gets the "decimal" element
     */
    public org.xmlsoap.schemas.soap.encoding.Decimal getDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Decimal target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().find_element_user(DECIMAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "decimal" element
     */
    public void setDecimal(org.xmlsoap.schemas.soap.encoding.Decimal decimal)
    {
        generatedSetterHelperImpl(decimal, DECIMAL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "decimal" element
     */
    public org.xmlsoap.schemas.soap.encoding.Decimal addNewDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Decimal target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().add_element_user(DECIMAL$0);
            return target;
        }
    }
}
