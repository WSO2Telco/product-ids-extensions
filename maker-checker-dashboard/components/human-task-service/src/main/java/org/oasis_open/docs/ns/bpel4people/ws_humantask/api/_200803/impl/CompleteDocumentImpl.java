/*
 * An XML document type.
 * Localname: complete
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one complete(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class CompleteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompleteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLETE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "complete");
    
    
    /**
     * Gets the "complete" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteDocument.Complete getComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteDocument.Complete target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteDocument.Complete)get_store().find_element_user(COMPLETE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "complete" element
     */
    public void setComplete(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteDocument.Complete complete)
    {
        generatedSetterHelperImpl(complete, COMPLETE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "complete" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteDocument.Complete addNewComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteDocument.Complete target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteDocument.Complete)get_store().add_element_user(COMPLETE$0);
            return target;
        }
    }
    /**
     * An XML complete(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class CompleteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteDocument.Complete
    {
        private static final long serialVersionUID = 1L;
        
        public CompleteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "identifier");
        private static final javax.xml.namespace.QName TASKDATA$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "taskData");
        
        
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
         * Gets the "taskData" element
         */
        public java.lang.String getTaskData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKDATA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "taskData" element
         */
        public org.apache.xmlbeans.XmlString xgetTaskData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKDATA$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "taskData" element
         */
        public boolean isSetTaskData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TASKDATA$2) != 0;
            }
        }
        
        /**
         * Sets the "taskData" element
         */
        public void setTaskData(java.lang.String taskData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKDATA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKDATA$2);
                }
                target.setStringValue(taskData);
            }
        }
        
        /**
         * Sets (as xml) the "taskData" element
         */
        public void xsetTaskData(org.apache.xmlbeans.XmlString taskData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKDATA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TASKDATA$2);
                }
                target.set(taskData);
            }
        }
        
        /**
         * Unsets the "taskData" element
         */
        public void unsetTaskData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TASKDATA$2, 0);
            }
        }
    }
}
