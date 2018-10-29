/*
 * An XML document type.
 * Localname: deleteOutputResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteOutputResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one deleteOutputResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class DeleteOutputResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteOutputResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeleteOutputResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEOUTPUTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "deleteOutputResponse");
    
    
    /**
     * Gets the "deleteOutputResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteOutputResponseDocument.DeleteOutputResponse getDeleteOutputResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteOutputResponseDocument.DeleteOutputResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteOutputResponseDocument.DeleteOutputResponse)get_store().find_element_user(DELETEOUTPUTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "deleteOutputResponse" element
     */
    public void setDeleteOutputResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteOutputResponseDocument.DeleteOutputResponse deleteOutputResponse)
    {
        generatedSetterHelperImpl(deleteOutputResponse, DELETEOUTPUTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "deleteOutputResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteOutputResponseDocument.DeleteOutputResponse addNewDeleteOutputResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteOutputResponseDocument.DeleteOutputResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteOutputResponseDocument.DeleteOutputResponse)get_store().add_element_user(DELETEOUTPUTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML deleteOutputResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class DeleteOutputResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteOutputResponseDocument.DeleteOutputResponse
    {
        private static final long serialVersionUID = 1L;
        
        public DeleteOutputResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
