/*
 * An XML document type.
 * Localname: hasSubtasksResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HasSubtasksResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one hasSubtasksResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class HasSubtasksResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HasSubtasksResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public HasSubtasksResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HASSUBTASKSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "hasSubtasksResponse");
    
    
    /**
     * Gets the "hasSubtasksResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HasSubtasksResponseDocument.HasSubtasksResponse getHasSubtasksResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HasSubtasksResponseDocument.HasSubtasksResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HasSubtasksResponseDocument.HasSubtasksResponse)get_store().find_element_user(HASSUBTASKSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "hasSubtasksResponse" element
     */
    public void setHasSubtasksResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HasSubtasksResponseDocument.HasSubtasksResponse hasSubtasksResponse)
    {
        generatedSetterHelperImpl(hasSubtasksResponse, HASSUBTASKSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "hasSubtasksResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HasSubtasksResponseDocument.HasSubtasksResponse addNewHasSubtasksResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HasSubtasksResponseDocument.HasSubtasksResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HasSubtasksResponseDocument.HasSubtasksResponse)get_store().add_element_user(HASSUBTASKSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML hasSubtasksResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class HasSubtasksResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HasSubtasksResponseDocument.HasSubtasksResponse
    {
        private static final long serialVersionUID = 1L;
        
        public HasSubtasksResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESULT$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "result");
        
        
        /**
         * Gets the "result" element
         */
        public boolean getResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULT$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "result" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "result" element
         */
        public void setResult(boolean result)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESULT$0);
                }
                target.setBooleanValue(result);
            }
        }
        
        /**
         * Sets (as xml) the "result" element
         */
        public void xsetResult(org.apache.xmlbeans.XmlBoolean result)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RESULT$0);
                }
                target.set(result);
            }
        }
    }
}
