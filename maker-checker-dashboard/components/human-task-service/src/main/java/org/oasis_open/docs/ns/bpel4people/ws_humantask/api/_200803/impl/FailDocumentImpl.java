/*
 * An XML document type.
 * Localname: fail
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one fail(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class FailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailDocument
{
    private static final long serialVersionUID = 1L;
    
    public FailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAIL$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "fail");
    
    
    /**
     * Gets the "fail" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailDocument.Fail getFail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailDocument.Fail target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailDocument.Fail)get_store().find_element_user(FAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fail" element
     */
    public void setFail(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailDocument.Fail fail)
    {
        generatedSetterHelperImpl(fail, FAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fail" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailDocument.Fail addNewFail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailDocument.Fail target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailDocument.Fail)get_store().add_element_user(FAIL$0);
            return target;
        }
    }
    /**
     * An XML fail(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class FailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailDocument.Fail
    {
        private static final long serialVersionUID = 1L;
        
        public FailImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "identifier");
        private static final javax.xml.namespace.QName FAULT$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "fault");
        
        
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
         * Gets the "fault" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault getFault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault)get_store().find_element_user(FAULT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "fault" element
         */
        public boolean isSetFault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FAULT$2) != 0;
            }
        }
        
        /**
         * Sets the "fault" element
         */
        public void setFault(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault fault)
        {
            generatedSetterHelperImpl(fault, FAULT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fault" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault addNewFault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault)get_store().add_element_user(FAULT$2);
                return target;
            }
        }
        
        /**
         * Unsets the "fault" element
         */
        public void unsetFault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FAULT$2, 0);
            }
        }
    }
}
