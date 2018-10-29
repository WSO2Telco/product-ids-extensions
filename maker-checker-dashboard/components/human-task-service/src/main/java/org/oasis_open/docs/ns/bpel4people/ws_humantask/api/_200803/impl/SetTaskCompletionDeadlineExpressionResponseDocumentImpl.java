/*
 * An XML document type.
 * Localname: setTaskCompletionDeadlineExpressionResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDeadlineExpressionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one setTaskCompletionDeadlineExpressionResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class SetTaskCompletionDeadlineExpressionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDeadlineExpressionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SetTaskCompletionDeadlineExpressionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETTASKCOMPLETIONDEADLINEEXPRESSIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "setTaskCompletionDeadlineExpressionResponse");
    
    
    /**
     * Gets the "setTaskCompletionDeadlineExpressionResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDeadlineExpressionResponseDocument.SetTaskCompletionDeadlineExpressionResponse getSetTaskCompletionDeadlineExpressionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDeadlineExpressionResponseDocument.SetTaskCompletionDeadlineExpressionResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDeadlineExpressionResponseDocument.SetTaskCompletionDeadlineExpressionResponse)get_store().find_element_user(SETTASKCOMPLETIONDEADLINEEXPRESSIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "setTaskCompletionDeadlineExpressionResponse" element
     */
    public void setSetTaskCompletionDeadlineExpressionResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDeadlineExpressionResponseDocument.SetTaskCompletionDeadlineExpressionResponse setTaskCompletionDeadlineExpressionResponse)
    {
        generatedSetterHelperImpl(setTaskCompletionDeadlineExpressionResponse, SETTASKCOMPLETIONDEADLINEEXPRESSIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "setTaskCompletionDeadlineExpressionResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDeadlineExpressionResponseDocument.SetTaskCompletionDeadlineExpressionResponse addNewSetTaskCompletionDeadlineExpressionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDeadlineExpressionResponseDocument.SetTaskCompletionDeadlineExpressionResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDeadlineExpressionResponseDocument.SetTaskCompletionDeadlineExpressionResponse)get_store().add_element_user(SETTASKCOMPLETIONDEADLINEEXPRESSIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML setTaskCompletionDeadlineExpressionResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class SetTaskCompletionDeadlineExpressionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDeadlineExpressionResponseDocument.SetTaskCompletionDeadlineExpressionResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SetTaskCompletionDeadlineExpressionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
