/*
 * An XML document type.
 * Localname: getFault
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getFault(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getFault");
    
    
    /**
     * Gets the "getFault" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultDocument.GetFault getGetFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultDocument.GetFault target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultDocument.GetFault)get_store().find_element_user(GETFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getFault" element
     */
    public void setGetFault(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultDocument.GetFault getFault)
    {
        generatedSetterHelperImpl(getFault, GETFAULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getFault" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultDocument.GetFault addNewGetFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultDocument.GetFault target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultDocument.GetFault)get_store().add_element_user(GETFAULT$0);
            return target;
        }
    }
    /**
     * An XML getFault(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetFaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultDocument.GetFault
    {
        private static final long serialVersionUID = 1L;
        
        public GetFaultImpl(org.apache.xmlbeans.SchemaType sType)
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
