/*
 * An XML document type.
 * Localname: loadTaskResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one loadTaskResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class LoadTaskResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public LoadTaskResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOADTASKRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "loadTaskResponse");
    
    
    /**
     * Gets the "loadTaskResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskResponseDocument.LoadTaskResponse getLoadTaskResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskResponseDocument.LoadTaskResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskResponseDocument.LoadTaskResponse)get_store().find_element_user(LOADTASKRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "loadTaskResponse" element
     */
    public void setLoadTaskResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskResponseDocument.LoadTaskResponse loadTaskResponse)
    {
        generatedSetterHelperImpl(loadTaskResponse, LOADTASKRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "loadTaskResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskResponseDocument.LoadTaskResponse addNewLoadTaskResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskResponseDocument.LoadTaskResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskResponseDocument.LoadTaskResponse)get_store().add_element_user(LOADTASKRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML loadTaskResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class LoadTaskResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskResponseDocument.LoadTaskResponse
    {
        private static final long serialVersionUID = 1L;
        
        public LoadTaskResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKABSTRACT$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "taskAbstract");
        
        
        /**
         * Gets the "taskAbstract" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract getTaskAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract)get_store().find_element_user(TASKABSTRACT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "taskAbstract" element
         */
        public boolean isSetTaskAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TASKABSTRACT$0) != 0;
            }
        }
        
        /**
         * Sets the "taskAbstract" element
         */
        public void setTaskAbstract(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract taskAbstract)
        {
            generatedSetterHelperImpl(taskAbstract, TASKABSTRACT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "taskAbstract" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract addNewTaskAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract)get_store().add_element_user(TASKABSTRACT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "taskAbstract" element
         */
        public void unsetTaskAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TASKABSTRACT$0, 0);
            }
        }
    }
}
