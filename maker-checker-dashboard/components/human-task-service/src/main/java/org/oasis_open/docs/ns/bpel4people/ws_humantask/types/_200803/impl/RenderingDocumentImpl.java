/*
 * An XML document type.
 * Localname: rendering
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * A document containing one rendering(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public class RenderingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingDocument
{
    private static final long serialVersionUID = 1L;
    
    public RenderingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENDERING$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "rendering");
    
    
    /**
     * Gets the "rendering" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering getRendering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering)get_store().find_element_user(RENDERING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rendering" element
     */
    public void setRendering(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering rendering)
    {
        generatedSetterHelperImpl(rendering, RENDERING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rendering" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering addNewRendering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering)get_store().add_element_user(RENDERING$0);
            return target;
        }
    }
}
