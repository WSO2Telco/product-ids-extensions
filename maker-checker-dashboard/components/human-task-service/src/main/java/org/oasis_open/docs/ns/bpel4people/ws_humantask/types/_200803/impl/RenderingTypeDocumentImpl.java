/*
 * An XML document type.
 * Localname: renderingType
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * A document containing one renderingType(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public class RenderingTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public RenderingTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENDERINGTYPE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "renderingType");
    
    
    /**
     * Gets the "renderingType" element
     */
    public javax.xml.namespace.QName getRenderingType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "renderingType" element
     */
    public org.apache.xmlbeans.XmlQName xgetRenderingType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(RENDERINGTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "renderingType" element
     */
    public void setRenderingType(javax.xml.namespace.QName renderingType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RENDERINGTYPE$0);
            }
            target.setQNameValue(renderingType);
        }
    }
    
    /**
     * Sets (as xml) the "renderingType" element
     */
    public void xsetRenderingType(org.apache.xmlbeans.XmlQName renderingType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(RENDERINGTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(RENDERINGTYPE$0);
            }
            target.set(renderingType);
        }
    }
}
