/*
 * An XML document type.
 * Localname: getSubtasks
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getSubtasks(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetSubtasksDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSubtasksDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSUBTASKS$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getSubtasks");
    
    
    /**
     * Gets the "getSubtasks" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksDocument.GetSubtasks getGetSubtasks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksDocument.GetSubtasks target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksDocument.GetSubtasks)get_store().find_element_user(GETSUBTASKS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getSubtasks" element
     */
    public void setGetSubtasks(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksDocument.GetSubtasks getSubtasks)
    {
        generatedSetterHelperImpl(getSubtasks, GETSUBTASKS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getSubtasks" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksDocument.GetSubtasks addNewGetSubtasks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksDocument.GetSubtasks target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksDocument.GetSubtasks)get_store().add_element_user(GETSUBTASKS$0);
            return target;
        }
    }
    /**
     * An XML getSubtasks(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetSubtasksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksDocument.GetSubtasks
    {
        private static final long serialVersionUID = 1L;
        
        public GetSubtasksImpl(org.apache.xmlbeans.SchemaType sType)
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
