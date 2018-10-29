/*
 * An XML document type.
 * Localname: getRendering
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getRendering(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetRenderingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetRenderingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRENDERING$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getRendering");
    
    
    /**
     * Gets the "getRendering" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingDocument.GetRendering getGetRendering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingDocument.GetRendering target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingDocument.GetRendering)get_store().find_element_user(GETRENDERING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getRendering" element
     */
    public void setGetRendering(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingDocument.GetRendering getRendering)
    {
        generatedSetterHelperImpl(getRendering, GETRENDERING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getRendering" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingDocument.GetRendering addNewGetRendering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingDocument.GetRendering target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingDocument.GetRendering)get_store().add_element_user(GETRENDERING$0);
            return target;
        }
    }
    /**
     * An XML getRendering(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetRenderingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingDocument.GetRendering
    {
        private static final long serialVersionUID = 1L;
        
        public GetRenderingImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "identifier");
        private static final javax.xml.namespace.QName RENDERINGTYPE$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "renderingType");
        
        
        /**
         * Gets the "identifier" element
         */
        public java.lang.String getIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "identifier" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(IDENTIFIER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "identifier" element
         */
        public void setIdentifier(java.lang.String identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFIER$0);
                }
                target.setStringValue(identifier);
            }
        }
        
        /**
         * Sets (as xml) the "identifier" element
         */
        public void xsetIdentifier(org.apache.xmlbeans.XmlAnyURI identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(IDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(IDENTIFIER$0);
                }
                target.set(identifier);
            }
        }
        
        /**
         * Gets the "renderingType" element
         */
        public javax.xml.namespace.QName getRenderingType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getQNameValue();
            }
        }
        
        /**
         * Gets (as xml) the "renderingType" element
         */
        public org.apache.xmlbeans.XmlQName xgetRenderingType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(RENDERINGTYPE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "renderingType" element
         */
        public void setRenderingType(javax.xml.namespace.QName renderingType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RENDERINGTYPE$2);
                }
                target.setQNameValue(renderingType);
            }
        }
        
        /**
         * Sets (as xml) the "renderingType" element
         */
        public void xsetRenderingType(org.apache.xmlbeans.XmlQName renderingType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(RENDERINGTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(RENDERINGTYPE$2);
                }
                target.set(renderingType);
            }
        }
    }
}
