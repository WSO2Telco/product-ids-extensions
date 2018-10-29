/*
 * An XML document type.
 * Localname: setTaskCompletionDurationExpressionResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one setTaskCompletionDurationExpressionResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class SetTaskCompletionDurationExpressionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SetTaskCompletionDurationExpressionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETTASKCOMPLETIONDURATIONEXPRESSIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "setTaskCompletionDurationExpressionResponse");
    
    
    /**
     * Gets the "setTaskCompletionDurationExpressionResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionResponseDocument.SetTaskCompletionDurationExpressionResponse getSetTaskCompletionDurationExpressionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionResponseDocument.SetTaskCompletionDurationExpressionResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionResponseDocument.SetTaskCompletionDurationExpressionResponse)get_store().find_element_user(SETTASKCOMPLETIONDURATIONEXPRESSIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "setTaskCompletionDurationExpressionResponse" element
     */
    public void setSetTaskCompletionDurationExpressionResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionResponseDocument.SetTaskCompletionDurationExpressionResponse setTaskCompletionDurationExpressionResponse)
    {
        generatedSetterHelperImpl(setTaskCompletionDurationExpressionResponse, SETTASKCOMPLETIONDURATIONEXPRESSIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "setTaskCompletionDurationExpressionResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionResponseDocument.SetTaskCompletionDurationExpressionResponse addNewSetTaskCompletionDurationExpressionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionResponseDocument.SetTaskCompletionDurationExpressionResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionResponseDocument.SetTaskCompletionDurationExpressionResponse)get_store().add_element_user(SETTASKCOMPLETIONDURATIONEXPRESSIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML setTaskCompletionDurationExpressionResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class SetTaskCompletionDurationExpressionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionResponseDocument.SetTaskCompletionDurationExpressionResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SetTaskCompletionDurationExpressionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
