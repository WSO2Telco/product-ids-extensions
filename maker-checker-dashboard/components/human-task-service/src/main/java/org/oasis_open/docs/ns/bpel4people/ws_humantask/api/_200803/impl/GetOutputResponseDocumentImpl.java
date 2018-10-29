/*
 * An XML document type.
 * Localname: getOutputResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getOutputResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetOutputResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetOutputResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETOUTPUTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getOutputResponse");
    
    
    /**
     * Gets the "getOutputResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputResponseDocument.GetOutputResponse getGetOutputResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputResponseDocument.GetOutputResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputResponseDocument.GetOutputResponse)get_store().find_element_user(GETOUTPUTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getOutputResponse" element
     */
    public void setGetOutputResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputResponseDocument.GetOutputResponse getOutputResponse)
    {
        generatedSetterHelperImpl(getOutputResponse, GETOUTPUTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getOutputResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputResponseDocument.GetOutputResponse addNewGetOutputResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputResponseDocument.GetOutputResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputResponseDocument.GetOutputResponse)get_store().add_element_user(GETOUTPUTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getOutputResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetOutputResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputResponseDocument.GetOutputResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetOutputResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
