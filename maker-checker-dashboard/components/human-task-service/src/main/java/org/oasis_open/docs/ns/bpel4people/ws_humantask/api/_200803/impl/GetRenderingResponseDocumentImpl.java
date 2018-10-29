/*
 * An XML document type.
 * Localname: getRenderingResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getRenderingResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetRenderingResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetRenderingResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRENDERINGRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getRenderingResponse");
    
    
    /**
     * Gets the "getRenderingResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingResponseDocument.GetRenderingResponse getGetRenderingResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingResponseDocument.GetRenderingResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingResponseDocument.GetRenderingResponse)get_store().find_element_user(GETRENDERINGRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getRenderingResponse" element
     */
    public void setGetRenderingResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingResponseDocument.GetRenderingResponse getRenderingResponse)
    {
        generatedSetterHelperImpl(getRenderingResponse, GETRENDERINGRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getRenderingResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingResponseDocument.GetRenderingResponse addNewGetRenderingResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingResponseDocument.GetRenderingResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingResponseDocument.GetRenderingResponse)get_store().add_element_user(GETRENDERINGRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getRenderingResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetRenderingResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingResponseDocument.GetRenderingResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetRenderingResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RENDERING$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "rendering");
        
        
        /**
         * Gets the "rendering" element
         */
        public org.apache.xmlbeans.XmlObject getRendering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(RENDERING$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "rendering" element
         */
        public void setRendering(org.apache.xmlbeans.XmlObject rendering)
        {
            generatedSetterHelperImpl(rendering, RENDERING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "rendering" element
         */
        public org.apache.xmlbeans.XmlObject addNewRendering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(RENDERING$0);
                return target;
            }
        }
    }
}
