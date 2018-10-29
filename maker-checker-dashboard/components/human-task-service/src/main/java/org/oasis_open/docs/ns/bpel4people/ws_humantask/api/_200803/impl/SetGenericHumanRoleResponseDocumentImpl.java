/*
 * An XML document type.
 * Localname: setGenericHumanRoleResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one setGenericHumanRoleResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class SetGenericHumanRoleResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SetGenericHumanRoleResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETGENERICHUMANROLERESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "setGenericHumanRoleResponse");
    
    
    /**
     * Gets the "setGenericHumanRoleResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleResponseDocument.SetGenericHumanRoleResponse getSetGenericHumanRoleResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleResponseDocument.SetGenericHumanRoleResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleResponseDocument.SetGenericHumanRoleResponse)get_store().find_element_user(SETGENERICHUMANROLERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "setGenericHumanRoleResponse" element
     */
    public void setSetGenericHumanRoleResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleResponseDocument.SetGenericHumanRoleResponse setGenericHumanRoleResponse)
    {
        generatedSetterHelperImpl(setGenericHumanRoleResponse, SETGENERICHUMANROLERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "setGenericHumanRoleResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleResponseDocument.SetGenericHumanRoleResponse addNewSetGenericHumanRoleResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleResponseDocument.SetGenericHumanRoleResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleResponseDocument.SetGenericHumanRoleResponse)get_store().add_element_user(SETGENERICHUMANROLERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML setGenericHumanRoleResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class SetGenericHumanRoleResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleResponseDocument.SetGenericHumanRoleResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SetGenericHumanRoleResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
