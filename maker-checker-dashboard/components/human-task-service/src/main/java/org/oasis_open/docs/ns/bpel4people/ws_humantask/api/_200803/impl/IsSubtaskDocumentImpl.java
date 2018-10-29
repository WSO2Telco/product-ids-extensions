/*
 * An XML document type.
 * Localname: isSubtask
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IsSubtaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one isSubtask(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class IsSubtaskDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IsSubtaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public IsSubtaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISSUBTASK$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "isSubtask");
    
    
    /**
     * Gets the "isSubtask" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IsSubtaskDocument.IsSubtask getIsSubtask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IsSubtaskDocument.IsSubtask target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IsSubtaskDocument.IsSubtask)get_store().find_element_user(ISSUBTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "isSubtask" element
     */
    public void setIsSubtask(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IsSubtaskDocument.IsSubtask isSubtask)
    {
        generatedSetterHelperImpl(isSubtask, ISSUBTASK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "isSubtask" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IsSubtaskDocument.IsSubtask addNewIsSubtask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IsSubtaskDocument.IsSubtask target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IsSubtaskDocument.IsSubtask)get_store().add_element_user(ISSUBTASK$0);
            return target;
        }
    }
    /**
     * An XML isSubtask(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class IsSubtaskImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IsSubtaskDocument.IsSubtask
    {
        private static final long serialVersionUID = 1L;
        
        public IsSubtaskImpl(org.apache.xmlbeans.SchemaType sType)
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
