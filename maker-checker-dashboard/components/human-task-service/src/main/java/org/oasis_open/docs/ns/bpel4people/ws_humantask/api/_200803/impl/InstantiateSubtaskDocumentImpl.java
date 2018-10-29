/*
 * An XML document type.
 * Localname: instantiateSubtask
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one instantiateSubtask(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class InstantiateSubtaskDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public InstantiateSubtaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTANTIATESUBTASK$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "instantiateSubtask");
    
    
    /**
     * Gets the "instantiateSubtask" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskDocument.InstantiateSubtask getInstantiateSubtask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskDocument.InstantiateSubtask target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskDocument.InstantiateSubtask)get_store().find_element_user(INSTANTIATESUBTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "instantiateSubtask" element
     */
    public void setInstantiateSubtask(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskDocument.InstantiateSubtask instantiateSubtask)
    {
        generatedSetterHelperImpl(instantiateSubtask, INSTANTIATESUBTASK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "instantiateSubtask" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskDocument.InstantiateSubtask addNewInstantiateSubtask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskDocument.InstantiateSubtask target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskDocument.InstantiateSubtask)get_store().add_element_user(INSTANTIATESUBTASK$0);
            return target;
        }
    }
    /**
     * An XML instantiateSubtask(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class InstantiateSubtaskImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskDocument.InstantiateSubtask
    {
        private static final long serialVersionUID = 1L;
        
        public InstantiateSubtaskImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKIDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "taskIdentifier");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "name");
        
        
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
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
                }
                target.set(name);
            }
        }
    }
}
