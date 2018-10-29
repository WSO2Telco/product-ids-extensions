/*
 * An XML document type.
 * Localname: illegalOperation
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one illegalOperation(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class IllegalOperationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public IllegalOperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ILLEGALOPERATION$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "illegalOperation");
    
    
    /**
     * Gets the "illegalOperation" element
     */
    public java.lang.String getIllegalOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ILLEGALOPERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "illegalOperation" element
     */
    public org.apache.xmlbeans.XmlString xgetIllegalOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ILLEGALOPERATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "illegalOperation" element
     */
    public void setIllegalOperation(java.lang.String illegalOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ILLEGALOPERATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ILLEGALOPERATION$0);
            }
            target.setStringValue(illegalOperation);
        }
    }
    
    /**
     * Sets (as xml) the "illegalOperation" element
     */
    public void xsetIllegalOperation(org.apache.xmlbeans.XmlString illegalOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ILLEGALOPERATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ILLEGALOPERATION$0);
            }
            target.set(illegalOperation);
        }
    }
}
