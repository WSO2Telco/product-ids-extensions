/*
 * An XML document type.
 * Localname: getInputResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetInputResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getInputResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetInputResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetInputResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetInputResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETINPUTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getInputResponse");
    
    
    /**
     * Gets the "getInputResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetInputResponseDocument.GetInputResponse getGetInputResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetInputResponseDocument.GetInputResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetInputResponseDocument.GetInputResponse)get_store().find_element_user(GETINPUTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getInputResponse" element
     */
    public void setGetInputResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetInputResponseDocument.GetInputResponse getInputResponse)
    {
        generatedSetterHelperImpl(getInputResponse, GETINPUTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getInputResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetInputResponseDocument.GetInputResponse addNewGetInputResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetInputResponseDocument.GetInputResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetInputResponseDocument.GetInputResponse)get_store().add_element_user(GETINPUTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getInputResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetInputResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetInputResponseDocument.GetInputResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetInputResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKDATA$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "taskData");
        
        
        /**
         * Gets the "taskData" element
         */
        public org.apache.xmlbeans.XmlObject getTaskData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(TASKDATA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "taskData" element
         */
        public void setTaskData(org.apache.xmlbeans.XmlObject taskData)
        {
            generatedSetterHelperImpl(taskData, TASKDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "taskData" element
         */
        public org.apache.xmlbeans.XmlObject addNewTaskData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(TASKDATA$0);
                return target;
            }
        }
    }
}
