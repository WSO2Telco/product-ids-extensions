/*
 * XML Type:  tFaultData
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFaultData
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * An XML tFaultData(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public class TFaultDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFaultData
{
    private static final long serialVersionUID = 1L;
    
    public TFaultDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAULTNAME$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "faultName");
    private static final javax.xml.namespace.QName FAULTDATA$2 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "faultData");
    
    
    /**
     * Gets the "faultName" element
     */
    public java.lang.String getFaultName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "faultName" element
     */
    public org.apache.xmlbeans.XmlNCName xgetFaultName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_element_user(FAULTNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "faultName" element
     */
    public void setFaultName(java.lang.String faultName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAULTNAME$0);
            }
            target.setStringValue(faultName);
        }
    }
    
    /**
     * Sets (as xml) the "faultName" element
     */
    public void xsetFaultName(org.apache.xmlbeans.XmlNCName faultName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_element_user(FAULTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_element_user(FAULTNAME$0);
            }
            target.set(faultName);
        }
    }
    
    /**
     * Gets the "faultData" element
     */
    public org.apache.xmlbeans.XmlObject getFaultData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(FAULTDATA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "faultData" element
     */
    public void setFaultData(org.apache.xmlbeans.XmlObject faultData)
    {
        generatedSetterHelperImpl(faultData, FAULTDATA$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "faultData" element
     */
    public org.apache.xmlbeans.XmlObject addNewFaultData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(FAULTDATA$2);
            return target;
        }
    }
}
