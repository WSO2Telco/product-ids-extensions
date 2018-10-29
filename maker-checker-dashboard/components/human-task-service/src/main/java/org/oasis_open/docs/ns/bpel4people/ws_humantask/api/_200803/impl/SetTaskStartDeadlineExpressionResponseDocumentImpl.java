/*
 * An XML document type.
 * Localname: setTaskStartDeadlineExpressionResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDeadlineExpressionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one setTaskStartDeadlineExpressionResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class SetTaskStartDeadlineExpressionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDeadlineExpressionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SetTaskStartDeadlineExpressionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETTASKSTARTDEADLINEEXPRESSIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "setTaskStartDeadlineExpressionResponse");
    
    
    /**
     * Gets the "setTaskStartDeadlineExpressionResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDeadlineExpressionResponseDocument.SetTaskStartDeadlineExpressionResponse getSetTaskStartDeadlineExpressionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDeadlineExpressionResponseDocument.SetTaskStartDeadlineExpressionResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDeadlineExpressionResponseDocument.SetTaskStartDeadlineExpressionResponse)get_store().find_element_user(SETTASKSTARTDEADLINEEXPRESSIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "setTaskStartDeadlineExpressionResponse" element
     */
    public void setSetTaskStartDeadlineExpressionResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDeadlineExpressionResponseDocument.SetTaskStartDeadlineExpressionResponse setTaskStartDeadlineExpressionResponse)
    {
        generatedSetterHelperImpl(setTaskStartDeadlineExpressionResponse, SETTASKSTARTDEADLINEEXPRESSIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "setTaskStartDeadlineExpressionResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDeadlineExpressionResponseDocument.SetTaskStartDeadlineExpressionResponse addNewSetTaskStartDeadlineExpressionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDeadlineExpressionResponseDocument.SetTaskStartDeadlineExpressionResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDeadlineExpressionResponseDocument.SetTaskStartDeadlineExpressionResponse)get_store().add_element_user(SETTASKSTARTDEADLINEEXPRESSIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML setTaskStartDeadlineExpressionResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class SetTaskStartDeadlineExpressionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDeadlineExpressionResponseDocument.SetTaskStartDeadlineExpressionResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SetTaskStartDeadlineExpressionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
