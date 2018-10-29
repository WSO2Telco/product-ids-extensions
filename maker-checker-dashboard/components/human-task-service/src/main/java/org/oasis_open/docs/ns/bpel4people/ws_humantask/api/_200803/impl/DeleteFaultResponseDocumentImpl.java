/*
 * An XML document type.
 * Localname: deleteFaultResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteFaultResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one deleteFaultResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class DeleteFaultResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteFaultResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeleteFaultResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEFAULTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "deleteFaultResponse");
    
    
    /**
     * Gets the "deleteFaultResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteFaultResponseDocument.DeleteFaultResponse getDeleteFaultResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteFaultResponseDocument.DeleteFaultResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteFaultResponseDocument.DeleteFaultResponse)get_store().find_element_user(DELETEFAULTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "deleteFaultResponse" element
     */
    public void setDeleteFaultResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteFaultResponseDocument.DeleteFaultResponse deleteFaultResponse)
    {
        generatedSetterHelperImpl(deleteFaultResponse, DELETEFAULTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "deleteFaultResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteFaultResponseDocument.DeleteFaultResponse addNewDeleteFaultResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteFaultResponseDocument.DeleteFaultResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteFaultResponseDocument.DeleteFaultResponse)get_store().add_element_user(DELETEFAULTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML deleteFaultResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class DeleteFaultResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteFaultResponseDocument.DeleteFaultResponse
    {
        private static final long serialVersionUID = 1L;
        
        public DeleteFaultResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
