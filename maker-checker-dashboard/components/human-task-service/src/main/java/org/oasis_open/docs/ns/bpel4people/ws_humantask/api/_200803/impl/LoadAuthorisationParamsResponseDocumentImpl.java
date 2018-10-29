/*
 * An XML document type.
 * Localname: loadAuthorisationParamsResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one loadAuthorisationParamsResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class LoadAuthorisationParamsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public LoadAuthorisationParamsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOADAUTHORISATIONPARAMSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "loadAuthorisationParamsResponse");
    
    
    /**
     * Gets the "loadAuthorisationParamsResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsResponseDocument.LoadAuthorisationParamsResponse getLoadAuthorisationParamsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsResponseDocument.LoadAuthorisationParamsResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsResponseDocument.LoadAuthorisationParamsResponse)get_store().find_element_user(LOADAUTHORISATIONPARAMSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "loadAuthorisationParamsResponse" element
     */
    public void setLoadAuthorisationParamsResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsResponseDocument.LoadAuthorisationParamsResponse loadAuthorisationParamsResponse)
    {
        generatedSetterHelperImpl(loadAuthorisationParamsResponse, LOADAUTHORISATIONPARAMSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "loadAuthorisationParamsResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsResponseDocument.LoadAuthorisationParamsResponse addNewLoadAuthorisationParamsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsResponseDocument.LoadAuthorisationParamsResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsResponseDocument.LoadAuthorisationParamsResponse)get_store().add_element_user(LOADAUTHORISATIONPARAMSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML loadAuthorisationParamsResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class LoadAuthorisationParamsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsResponseDocument.LoadAuthorisationParamsResponse
    {
        private static final long serialVersionUID = 1L;
        
        public LoadAuthorisationParamsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKAUTHORISATIONPARAMSRESULT$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "taskAuthorisationParamsResult");
        
        
        /**
         * Gets the "taskAuthorisationParamsResult" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAuthorisationParams getTaskAuthorisationParamsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAuthorisationParams target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAuthorisationParams)get_store().find_element_user(TASKAUTHORISATIONPARAMSRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "taskAuthorisationParamsResult" element
         */
        public void setTaskAuthorisationParamsResult(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAuthorisationParams taskAuthorisationParamsResult)
        {
            generatedSetterHelperImpl(taskAuthorisationParamsResult, TASKAUTHORISATIONPARAMSRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "taskAuthorisationParamsResult" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAuthorisationParams addNewTaskAuthorisationParamsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAuthorisationParams target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAuthorisationParams)get_store().add_element_user(TASKAUTHORISATIONPARAMSRESULT$0);
                return target;
            }
        }
    }
}
