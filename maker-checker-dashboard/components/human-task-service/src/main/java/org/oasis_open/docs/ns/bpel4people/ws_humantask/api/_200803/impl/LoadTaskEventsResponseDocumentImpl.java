/*
 * An XML document type.
 * Localname: loadTaskEventsResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskEventsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one loadTaskEventsResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class LoadTaskEventsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskEventsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public LoadTaskEventsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOADTASKEVENTSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "loadTaskEventsResponse");
    
    
    /**
     * Gets the "loadTaskEventsResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskEventsResponseDocument.LoadTaskEventsResponse getLoadTaskEventsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskEventsResponseDocument.LoadTaskEventsResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskEventsResponseDocument.LoadTaskEventsResponse)get_store().find_element_user(LOADTASKEVENTSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "loadTaskEventsResponse" element
     */
    public void setLoadTaskEventsResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskEventsResponseDocument.LoadTaskEventsResponse loadTaskEventsResponse)
    {
        generatedSetterHelperImpl(loadTaskEventsResponse, LOADTASKEVENTSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "loadTaskEventsResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskEventsResponseDocument.LoadTaskEventsResponse addNewLoadTaskEventsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskEventsResponseDocument.LoadTaskEventsResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskEventsResponseDocument.LoadTaskEventsResponse)get_store().add_element_user(LOADTASKEVENTSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML loadTaskEventsResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class LoadTaskEventsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskEventsResponseDocument.LoadTaskEventsResponse
    {
        private static final long serialVersionUID = 1L;
        
        public LoadTaskEventsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKEVENTS$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "taskEvents");
        
        
        /**
         * Gets the "taskEvents" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvents getTaskEvents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvents target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvents)get_store().find_element_user(TASKEVENTS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "taskEvents" element
         */
        public void setTaskEvents(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvents taskEvents)
        {
            generatedSetterHelperImpl(taskEvents, TASKEVENTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "taskEvents" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvents addNewTaskEvents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvents target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvents)get_store().add_element_user(TASKEVENTS$0);
                return target;
            }
        }
    }
}
