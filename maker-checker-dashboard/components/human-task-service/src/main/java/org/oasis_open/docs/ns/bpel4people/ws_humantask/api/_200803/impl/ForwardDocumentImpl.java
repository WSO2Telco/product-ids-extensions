/*
 * An XML document type.
 * Localname: forward
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one forward(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class ForwardDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardDocument
{
    private static final long serialVersionUID = 1L;
    
    public ForwardDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORWARD$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "forward");
    
    
    /**
     * Gets the "forward" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardDocument.Forward getForward()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardDocument.Forward target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardDocument.Forward)get_store().find_element_user(FORWARD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "forward" element
     */
    public void setForward(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardDocument.Forward forward)
    {
        generatedSetterHelperImpl(forward, FORWARD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "forward" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardDocument.Forward addNewForward()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardDocument.Forward target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardDocument.Forward)get_store().add_element_user(FORWARD$0);
            return target;
        }
    }
    /**
     * An XML forward(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class ForwardImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardDocument.Forward
    {
        private static final long serialVersionUID = 1L;
        
        public ForwardImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "identifier");
        private static final javax.xml.namespace.QName ORGANIZATIONALENTITY$2 = 
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
         * Gets the "organizationalEntity" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity getOrganizationalEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().find_element_user(ORGANIZATIONALENTITY$2, 0);
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
            generatedSetterHelperImpl(organizationalEntity, ORGANIZATIONALENTITY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().add_element_user(ORGANIZATIONALENTITY$2);
                return target;
            }
        }
    }
}
