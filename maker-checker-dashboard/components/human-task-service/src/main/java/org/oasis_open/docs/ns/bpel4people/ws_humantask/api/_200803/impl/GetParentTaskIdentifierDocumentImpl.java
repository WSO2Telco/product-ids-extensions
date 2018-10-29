/*
 * An XML document type.
 * Localname: getParentTaskIdentifier
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getParentTaskIdentifier(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetParentTaskIdentifierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetParentTaskIdentifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPARENTTASKIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getParentTaskIdentifier");
    
    
    /**
     * Gets the "getParentTaskIdentifier" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierDocument.GetParentTaskIdentifier getGetParentTaskIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierDocument.GetParentTaskIdentifier target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierDocument.GetParentTaskIdentifier)get_store().find_element_user(GETPARENTTASKIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getParentTaskIdentifier" element
     */
    public void setGetParentTaskIdentifier(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierDocument.GetParentTaskIdentifier getParentTaskIdentifier)
    {
        generatedSetterHelperImpl(getParentTaskIdentifier, GETPARENTTASKIDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getParentTaskIdentifier" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierDocument.GetParentTaskIdentifier addNewGetParentTaskIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierDocument.GetParentTaskIdentifier target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierDocument.GetParentTaskIdentifier)get_store().add_element_user(GETPARENTTASKIDENTIFIER$0);
            return target;
        }
    }
    /**
     * An XML getParentTaskIdentifier(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetParentTaskIdentifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierDocument.GetParentTaskIdentifier
    {
        private static final long serialVersionUID = 1L;
        
        public GetParentTaskIdentifierImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKIDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "taskIdentifier");
        
        
        /**
         * Gets the "taskIdentifier" element
         */
        public java.lang.String getTaskIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKIDENTIFIER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "taskIdentifier" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetTaskIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(TASKIDENTIFIER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "taskIdentifier" element
         */
        public void setTaskIdentifier(java.lang.String taskIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKIDENTIFIER$0);
                }
                target.setStringValue(taskIdentifier);
            }
        }
        
        /**
         * Sets (as xml) the "taskIdentifier" element
         */
        public void xsetTaskIdentifier(org.apache.xmlbeans.XmlAnyURI taskIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(TASKIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(TASKIDENTIFIER$0);
                }
                target.set(taskIdentifier);
            }
        }
    }
}
