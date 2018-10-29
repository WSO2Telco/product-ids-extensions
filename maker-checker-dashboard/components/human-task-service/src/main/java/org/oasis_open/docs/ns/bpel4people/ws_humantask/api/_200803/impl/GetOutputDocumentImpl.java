/*
 * An XML document type.
 * Localname: getOutput
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getOutput(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetOutputDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetOutputDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETOUTPUT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getOutput");
    
    
    /**
     * Gets the "getOutput" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputDocument.GetOutput getGetOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputDocument.GetOutput target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputDocument.GetOutput)get_store().find_element_user(GETOUTPUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getOutput" element
     */
    public void setGetOutput(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputDocument.GetOutput getOutput)
    {
        generatedSetterHelperImpl(getOutput, GETOUTPUT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getOutput" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputDocument.GetOutput addNewGetOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputDocument.GetOutput target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputDocument.GetOutput)get_store().add_element_user(GETOUTPUT$0);
            return target;
        }
    }
    /**
     * An XML getOutput(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetOutputImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputDocument.GetOutput
    {
        private static final long serialVersionUID = 1L;
        
        public GetOutputImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "identifier");
        private static final javax.xml.namespace.QName PART$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "part");
        
        
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
         * Gets the "part" element
         */
        public java.lang.String getPart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PART$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "part" element
         */
        public org.apache.xmlbeans.XmlNCName xgetPart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNCName target = null;
                target = (org.apache.xmlbeans.XmlNCName)get_store().find_element_user(PART$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "part" element
         */
        public boolean isSetPart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PART$2) != 0;
            }
        }
        
        /**
         * Sets the "part" element
         */
        public void setPart(java.lang.String part)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PART$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PART$2);
                }
                target.setStringValue(part);
            }
        }
        
        /**
         * Sets (as xml) the "part" element
         */
        public void xsetPart(org.apache.xmlbeans.XmlNCName part)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNCName target = null;
                target = (org.apache.xmlbeans.XmlNCName)get_store().find_element_user(PART$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNCName)get_store().add_element_user(PART$2);
                }
                target.set(part);
            }
        }
        
        /**
         * Unsets the "part" element
         */
        public void unsetPart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PART$2, 0);
            }
        }
    }
}
