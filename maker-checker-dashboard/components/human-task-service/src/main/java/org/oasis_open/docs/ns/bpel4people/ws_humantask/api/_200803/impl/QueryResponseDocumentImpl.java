/*
 * An XML document type.
 * Localname: queryResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one queryResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class QueryResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public QueryResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "queryResponse");
    
    
    /**
     * Gets the "queryResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryResponseDocument.QueryResponse getQueryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryResponseDocument.QueryResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryResponseDocument.QueryResponse)get_store().find_element_user(QUERYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "queryResponse" element
     */
    public void setQueryResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryResponseDocument.QueryResponse queryResponse)
    {
        generatedSetterHelperImpl(queryResponse, QUERYRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "queryResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryResponseDocument.QueryResponse addNewQueryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryResponseDocument.QueryResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryResponseDocument.QueryResponse)get_store().add_element_user(QUERYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML queryResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class QueryResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryResponseDocument.QueryResponse
    {
        private static final long serialVersionUID = 1L;
        
        public QueryResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKQUERYRESULTSET$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "taskQueryResultSet");
        
        
        /**
         * Gets the "taskQueryResultSet" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultSet getTaskQueryResultSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultSet target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultSet)get_store().find_element_user(TASKQUERYRESULTSET$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "taskQueryResultSet" element
         */
        public void setTaskQueryResultSet(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultSet taskQueryResultSet)
        {
            generatedSetterHelperImpl(taskQueryResultSet, TASKQUERYRESULTSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "taskQueryResultSet" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultSet addNewTaskQueryResultSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultSet target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultSet)get_store().add_element_user(TASKQUERYRESULTSET$0);
                return target;
            }
        }
    }
}
