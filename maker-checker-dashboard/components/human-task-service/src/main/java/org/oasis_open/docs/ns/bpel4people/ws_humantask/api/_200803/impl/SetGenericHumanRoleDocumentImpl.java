/*
 * An XML document type.
 * Localname: setGenericHumanRole
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one setGenericHumanRole(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class SetGenericHumanRoleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleDocument
{
    private static final long serialVersionUID = 1L;
    
    public SetGenericHumanRoleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETGENERICHUMANROLE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "setGenericHumanRole");
    
    
    /**
     * Gets the "setGenericHumanRole" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleDocument.SetGenericHumanRole getSetGenericHumanRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleDocument.SetGenericHumanRole target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleDocument.SetGenericHumanRole)get_store().find_element_user(SETGENERICHUMANROLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "setGenericHumanRole" element
     */
    public void setSetGenericHumanRole(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleDocument.SetGenericHumanRole setGenericHumanRole)
    {
        generatedSetterHelperImpl(setGenericHumanRole, SETGENERICHUMANROLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "setGenericHumanRole" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleDocument.SetGenericHumanRole addNewSetGenericHumanRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleDocument.SetGenericHumanRole target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleDocument.SetGenericHumanRole)get_store().add_element_user(SETGENERICHUMANROLE$0);
            return target;
        }
    }
    /**
     * An XML setGenericHumanRole(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class SetGenericHumanRoleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleDocument.SetGenericHumanRole
    {
        private static final long serialVersionUID = 1L;
        
        public SetGenericHumanRoleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "identifier");
        private static final javax.xml.namespace.QName GENERICHUMANROLE$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "genericHumanRole");
        private static final javax.xml.namespace.QName ORGANIZATIONALENTITY$4 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "organizationalEntity");
        
        
        /**
         * Gets the "identifier" element
         */
        public java.lang.String getIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "identifier" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(IDENTIFIER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "identifier" element
         */
        public void setIdentifier(java.lang.String identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFIER$0);
                }
                target.setStringValue(identifier);
            }
        }
        
        /**
         * Sets (as xml) the "identifier" element
         */
        public void xsetIdentifier(org.apache.xmlbeans.XmlAnyURI identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(IDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(IDENTIFIER$0);
                }
                target.set(identifier);
            }
        }
        
        /**
         * Gets the "genericHumanRole" element
         */
        public java.lang.String getGenericHumanRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERICHUMANROLE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "genericHumanRole" element
         */
        public org.apache.xmlbeans.XmlString xgetGenericHumanRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENERICHUMANROLE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "genericHumanRole" element
         */
        public void setGenericHumanRole(java.lang.String genericHumanRole)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERICHUMANROLE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERICHUMANROLE$2);
                }
                target.setStringValue(genericHumanRole);
            }
        }
        
        /**
         * Sets (as xml) the "genericHumanRole" element
         */
        public void xsetGenericHumanRole(org.apache.xmlbeans.XmlString genericHumanRole)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENERICHUMANROLE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GENERICHUMANROLE$2);
                }
                target.set(genericHumanRole);
            }
        }
        
        /**
         * Gets the "organizationalEntity" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity getOrganizationalEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().find_element_user(ORGANIZATIONALENTITY$4, 0);
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
            generatedSetterHelperImpl(organizationalEntity, ORGANIZATIONALENTITY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().add_element_user(ORGANIZATIONALENTITY$4);
                return target;
            }
        }
    }
}
