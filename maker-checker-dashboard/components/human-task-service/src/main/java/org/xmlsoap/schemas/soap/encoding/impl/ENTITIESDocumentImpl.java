/*
 * An XML document type.
 * Localname: ENTITIES
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.ENTITIESDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one ENTITIES(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class ENTITIESDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.ENTITIESDocument
{
    private static final long serialVersionUID = 1L;
    
    public ENTITIESDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITIES$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "ENTITIES");
    
    
    /**
     * Gets the "ENTITIES" element
     */
    public org.xmlsoap.schemas.soap.encoding.ENTITIES getENTITIES()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.ENTITIES target = null;
            target = (org.xmlsoap.schemas.soap.encoding.ENTITIES)get_store().find_element_user(ENTITIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ENTITIES" element
     */
    public void setENTITIES(org.xmlsoap.schemas.soap.encoding.ENTITIES entities)
    {
        generatedSetterHelperImpl(entities, ENTITIES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ENTITIES" element
     */
    public org.xmlsoap.schemas.soap.encoding.ENTITIES addNewENTITIES()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.ENTITIES target = null;
            target = (org.xmlsoap.schemas.soap.encoding.ENTITIES)get_store().add_element_user(ENTITIES$0);
            return target;
        }
    }
}
