/*
 * An XML document type.
 * Localname: part
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.PartDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * A document containing one part(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public class PartDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.PartDocument
{
    private static final long serialVersionUID = 1L;
    
    public PartDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PART$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "part");
    
    
    /**
     * Gets the "part" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart getPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart)get_store().find_element_user(PART$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "part" element
     */
    public void setPart(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart part)
    {
        generatedSetterHelperImpl(part, PART$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "part" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart addNewPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart)get_store().add_element_user(PART$0);
            return target;
        }
    }
}
