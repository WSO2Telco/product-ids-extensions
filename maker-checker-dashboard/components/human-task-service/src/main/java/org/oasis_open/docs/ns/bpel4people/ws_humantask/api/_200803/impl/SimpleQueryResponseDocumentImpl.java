/*
 * An XML document type.
 * Localname: simpleQueryResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one simpleQueryResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class SimpleQueryResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SimpleQueryResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIMPLEQUERYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "simpleQueryResponse");
    
    
    /**
     * Gets the "simpleQueryResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryResponseDocument.SimpleQueryResponse getSimpleQueryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryResponseDocument.SimpleQueryResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryResponseDocument.SimpleQueryResponse)get_store().find_element_user(SIMPLEQUERYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "simpleQueryResponse" element
     */
    public void setSimpleQueryResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryResponseDocument.SimpleQueryResponse simpleQueryResponse)
    {
        generatedSetterHelperImpl(simpleQueryResponse, SIMPLEQUERYRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "simpleQueryResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryResponseDocument.SimpleQueryResponse addNewSimpleQueryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryResponseDocument.SimpleQueryResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryResponseDocument.SimpleQueryResponse)get_store().add_element_user(SIMPLEQUERYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML simpleQueryResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class SimpleQueryResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryResponseDocument.SimpleQueryResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SimpleQueryResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKSIMPLEQUERYRESULTSET$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "taskSimpleQueryResultSet");
        
        
        /**
         * Gets the "taskSimpleQueryResultSet" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultSet getTaskSimpleQueryResultSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultSet target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultSet)get_store().find_element_user(TASKSIMPLEQUERYRESULTSET$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "taskSimpleQueryResultSet" element
         */
        public void setTaskSimpleQueryResultSet(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultSet taskSimpleQueryResultSet)
        {
            generatedSetterHelperImpl(taskSimpleQueryResultSet, TASKSIMPLEQUERYRESULTSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "taskSimpleQueryResultSet" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultSet addNewTaskSimpleQueryResultSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultSet target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultSet)get_store().add_element_user(TASKSIMPLEQUERYRESULTSET$0);
                return target;
            }
        }
    }
}
