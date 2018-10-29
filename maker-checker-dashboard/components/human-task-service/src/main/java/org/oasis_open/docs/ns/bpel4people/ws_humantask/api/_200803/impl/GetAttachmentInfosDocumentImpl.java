/*
 * An XML document type.
 * Localname: getAttachmentInfos
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentInfosDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getAttachmentInfos(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetAttachmentInfosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentInfosDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAttachmentInfosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETATTACHMENTINFOS$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getAttachmentInfos");
    
    
    /**
     * Gets the "getAttachmentInfos" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentInfosDocument.GetAttachmentInfos getGetAttachmentInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentInfosDocument.GetAttachmentInfos target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentInfosDocument.GetAttachmentInfos)get_store().find_element_user(GETATTACHMENTINFOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getAttachmentInfos" element
     */
    public void setGetAttachmentInfos(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentInfosDocument.GetAttachmentInfos getAttachmentInfos)
    {
        generatedSetterHelperImpl(getAttachmentInfos, GETATTACHMENTINFOS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getAttachmentInfos" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentInfosDocument.GetAttachmentInfos addNewGetAttachmentInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentInfosDocument.GetAttachmentInfos target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentInfosDocument.GetAttachmentInfos)get_store().add_element_user(GETATTACHMENTINFOS$0);
            return target;
        }
    }
    /**
     * An XML getAttachmentInfos(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetAttachmentInfosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentInfosDocument.GetAttachmentInfos
    {
        private static final long serialVersionUID = 1L;
        
        public GetAttachmentInfosImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "identifier");
        
        
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
    }
}
