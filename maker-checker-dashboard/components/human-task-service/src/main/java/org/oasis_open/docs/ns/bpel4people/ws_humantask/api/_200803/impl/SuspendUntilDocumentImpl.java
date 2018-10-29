/*
 * An XML document type.
 * Localname: suspendUntil
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one suspendUntil(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class SuspendUntilDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilDocument
{
    private static final long serialVersionUID = 1L;
    
    public SuspendUntilDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUSPENDUNTIL$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "suspendUntil");
    
    
    /**
     * Gets the "suspendUntil" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilDocument.SuspendUntil getSuspendUntil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilDocument.SuspendUntil target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilDocument.SuspendUntil)get_store().find_element_user(SUSPENDUNTIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "suspendUntil" element
     */
    public void setSuspendUntil(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilDocument.SuspendUntil suspendUntil)
    {
        generatedSetterHelperImpl(suspendUntil, SUSPENDUNTIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "suspendUntil" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilDocument.SuspendUntil addNewSuspendUntil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilDocument.SuspendUntil target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilDocument.SuspendUntil)get_store().add_element_user(SUSPENDUNTIL$0);
            return target;
        }
    }
    /**
     * An XML suspendUntil(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class SuspendUntilImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilDocument.SuspendUntil
    {
        private static final long serialVersionUID = 1L;
        
        public SuspendUntilImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "identifier");
        private static final javax.xml.namespace.QName TIME$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "time");
        
        
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
         * Gets the "time" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTime getTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTime target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTime)get_store().find_element_user(TIME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "time" element
         */
        public void setTime(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTime time)
        {
            generatedSetterHelperImpl(time, TIME$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "time" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTime addNewTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTime target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTime)get_store().add_element_user(TIME$2);
                return target;
            }
        }
    }
}
