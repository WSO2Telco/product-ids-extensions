/*
 * An XML document type.
 * Localname: setOutputResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one setOutputResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class SetOutputResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SetOutputResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETOUTPUTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "setOutputResponse");
    
    
    /**
     * Gets the "setOutputResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputResponseDocument.SetOutputResponse getSetOutputResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputResponseDocument.SetOutputResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputResponseDocument.SetOutputResponse)get_store().find_element_user(SETOUTPUTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "setOutputResponse" element
     */
    public void setSetOutputResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputResponseDocument.SetOutputResponse setOutputResponse)
    {
        generatedSetterHelperImpl(setOutputResponse, SETOUTPUTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "setOutputResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputResponseDocument.SetOutputResponse addNewSetOutputResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputResponseDocument.SetOutputResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputResponseDocument.SetOutputResponse)get_store().add_element_user(SETOUTPUTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML setOutputResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class SetOutputResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputResponseDocument.SetOutputResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SetOutputResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
