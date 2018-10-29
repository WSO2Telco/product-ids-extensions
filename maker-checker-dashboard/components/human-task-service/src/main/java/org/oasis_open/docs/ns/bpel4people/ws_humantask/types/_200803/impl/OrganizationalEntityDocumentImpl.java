/*
 * An XML document type.
 * Localname: organizationalEntity
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.OrganizationalEntityDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * A document containing one organizationalEntity(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public class OrganizationalEntityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.OrganizationalEntityDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationalEntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONALENTITY$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "organizationalEntity");
    
    
    /**
     * Gets the "organizationalEntity" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity getOrganizationalEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().find_element_user(ORGANIZATIONALENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "organizationalEntity" element
     */
    public void setOrganizationalEntity(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity organizationalEntity)
    {
        generatedSetterHelperImpl(organizationalEntity, ORGANIZATIONALENTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "organizationalEntity" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity addNewOrganizationalEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().add_element_user(ORGANIZATIONALENTITY$0);
            return target;
        }
    }
}
