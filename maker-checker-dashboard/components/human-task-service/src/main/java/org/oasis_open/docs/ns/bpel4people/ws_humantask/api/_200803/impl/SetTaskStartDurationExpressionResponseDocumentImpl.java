/*
 * An XML document type.
 * Localname: setTaskStartDurationExpressionResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDurationExpressionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one setTaskStartDurationExpressionResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class SetTaskStartDurationExpressionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDurationExpressionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SetTaskStartDurationExpressionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETTASKSTARTDURATIONEXPRESSIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "setTaskStartDurationExpressionResponse");
    
    
    /**
     * Gets the "setTaskStartDurationExpressionResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDurationExpressionResponseDocument.SetTaskStartDurationExpressionResponse getSetTaskStartDurationExpressionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDurationExpressionResponseDocument.SetTaskStartDurationExpressionResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDurationExpressionResponseDocument.SetTaskStartDurationExpressionResponse)get_store().find_element_user(SETTASKSTARTDURATIONEXPRESSIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "setTaskStartDurationExpressionResponse" element
     */
    public void setSetTaskStartDurationExpressionResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDurationExpressionResponseDocument.SetTaskStartDurationExpressionResponse setTaskStartDurationExpressionResponse)
    {
        generatedSetterHelperImpl(setTaskStartDurationExpressionResponse, SETTASKSTARTDURATIONEXPRESSIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "setTaskStartDurationExpressionResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDurationExpressionResponseDocument.SetTaskStartDurationExpressionResponse addNewSetTaskStartDurationExpressionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDurationExpressionResponseDocument.SetTaskStartDurationExpressionResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDurationExpressionResponseDocument.SetTaskStartDurationExpressionResponse)get_store().add_element_user(SETTASKSTARTDURATIONEXPRESSIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML setTaskStartDurationExpressionResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class SetTaskStartDurationExpressionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDurationExpressionResponseDocument.SetTaskStartDurationExpressionResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SetTaskStartDurationExpressionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
