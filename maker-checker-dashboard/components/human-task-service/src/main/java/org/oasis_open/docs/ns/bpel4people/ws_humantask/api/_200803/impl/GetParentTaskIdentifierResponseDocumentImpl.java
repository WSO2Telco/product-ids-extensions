/*
 * An XML document type.
 * Localname: getParentTaskIdentifierResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getParentTaskIdentifierResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetParentTaskIdentifierResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetParentTaskIdentifierResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPARENTTASKIDENTIFIERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getParentTaskIdentifierResponse");
    
    
    /**
     * Gets the "getParentTaskIdentifierResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierResponseDocument.GetParentTaskIdentifierResponse getGetParentTaskIdentifierResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierResponseDocument.GetParentTaskIdentifierResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierResponseDocument.GetParentTaskIdentifierResponse)get_store().find_element_user(GETPARENTTASKIDENTIFIERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getParentTaskIdentifierResponse" element
     */
    public void setGetParentTaskIdentifierResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierResponseDocument.GetParentTaskIdentifierResponse getParentTaskIdentifierResponse)
    {
        generatedSetterHelperImpl(getParentTaskIdentifierResponse, GETPARENTTASKIDENTIFIERRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getParentTaskIdentifierResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierResponseDocument.GetParentTaskIdentifierResponse addNewGetParentTaskIdentifierResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierResponseDocument.GetParentTaskIdentifierResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierResponseDocument.GetParentTaskIdentifierResponse)get_store().add_element_user(GETPARENTTASKIDENTIFIERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getParentTaskIdentifierResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetParentTaskIdentifierResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierResponseDocument.GetParentTaskIdentifierResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetParentTaskIdentifierResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARENTTASKIDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "parentTaskIdentifier");
        
        
        /**
         * Gets the "parentTaskIdentifier" element
         */
        public java.lang.String getParentTaskIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTTASKIDENTIFIER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "parentTaskIdentifier" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetParentTaskIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PARENTTASKIDENTIFIER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "parentTaskIdentifier" element
         */
        public boolean isSetParentTaskIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARENTTASKIDENTIFIER$0) != 0;
            }
        }
        
        /**
         * Sets the "parentTaskIdentifier" element
         */
        public void setParentTaskIdentifier(java.lang.String parentTaskIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTTASKIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTTASKIDENTIFIER$0);
                }
                target.setStringValue(parentTaskIdentifier);
            }
        }
        
        /**
         * Sets (as xml) the "parentTaskIdentifier" element
         */
        public void xsetParentTaskIdentifier(org.apache.xmlbeans.XmlAnyURI parentTaskIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PARENTTASKIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PARENTTASKIDENTIFIER$0);
                }
                target.set(parentTaskIdentifier);
            }
        }
        
        /**
         * Unsets the "parentTaskIdentifier" element
         */
        public void unsetParentTaskIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARENTTASKIDENTIFIER$0, 0);
            }
        }
    }
}
