/*
 * An XML document type.
 * Localname: simpleQueryInput
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.SimpleQueryInputDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * A document containing one simpleQueryInput(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public class SimpleQueryInputDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.SimpleQueryInputDocument
{
    private static final long serialVersionUID = 1L;
    
    public SimpleQueryInputDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIMPLEQUERYINPUT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "simpleQueryInput");
    
    
    /**
     * Gets the "simpleQueryInput" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput getSimpleQueryInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput)get_store().find_element_user(SIMPLEQUERYINPUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "simpleQueryInput" element
     */
    public void setSimpleQueryInput(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput simpleQueryInput)
    {
        generatedSetterHelperImpl(simpleQueryInput, SIMPLEQUERYINPUT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "simpleQueryInput" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput addNewSimpleQueryInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput)get_store().add_element_user(SIMPLEQUERYINPUT$0);
            return target;
        }
    }
}
