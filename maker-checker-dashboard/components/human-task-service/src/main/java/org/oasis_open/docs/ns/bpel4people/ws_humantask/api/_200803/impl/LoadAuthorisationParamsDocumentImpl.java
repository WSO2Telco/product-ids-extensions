/*
 * An XML document type.
 * Localname: loadAuthorisationParams
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one loadAuthorisationParams(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class LoadAuthorisationParamsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsDocument
{
    private static final long serialVersionUID = 1L;
    
    public LoadAuthorisationParamsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOADAUTHORISATIONPARAMS$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "loadAuthorisationParams");
    
    
    /**
     * Gets the "loadAuthorisationParams" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsDocument.LoadAuthorisationParams getLoadAuthorisationParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsDocument.LoadAuthorisationParams target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsDocument.LoadAuthorisationParams)get_store().find_element_user(LOADAUTHORISATIONPARAMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "loadAuthorisationParams" element
     */
    public void setLoadAuthorisationParams(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsDocument.LoadAuthorisationParams loadAuthorisationParams)
    {
        generatedSetterHelperImpl(loadAuthorisationParams, LOADAUTHORISATIONPARAMS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "loadAuthorisationParams" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsDocument.LoadAuthorisationParams addNewLoadAuthorisationParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsDocument.LoadAuthorisationParams target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsDocument.LoadAuthorisationParams)get_store().add_element_user(LOADAUTHORISATIONPARAMS$0);
            return target;
        }
    }
    /**
     * An XML loadAuthorisationParams(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class LoadAuthorisationParamsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsDocument.LoadAuthorisationParams
    {
        private static final long serialVersionUID = 1L;
        
        public LoadAuthorisationParamsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "identifier");
        
        
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
    }
}
