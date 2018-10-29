/*
 * An XML document type.
 * Localname: getSubtaskIdentifiersResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getSubtaskIdentifiersResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetSubtaskIdentifiersResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSubtaskIdentifiersResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSUBTASKIDENTIFIERSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getSubtaskIdentifiersResponse");
    
    
    /**
     * Gets the "getSubtaskIdentifiersResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument.GetSubtaskIdentifiersResponse getGetSubtaskIdentifiersResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument.GetSubtaskIdentifiersResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument.GetSubtaskIdentifiersResponse)get_store().find_element_user(GETSUBTASKIDENTIFIERSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getSubtaskIdentifiersResponse" element
     */
    public void setGetSubtaskIdentifiersResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument.GetSubtaskIdentifiersResponse getSubtaskIdentifiersResponse)
    {
        generatedSetterHelperImpl(getSubtaskIdentifiersResponse, GETSUBTASKIDENTIFIERSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getSubtaskIdentifiersResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument.GetSubtaskIdentifiersResponse addNewGetSubtaskIdentifiersResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument.GetSubtaskIdentifiersResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument.GetSubtaskIdentifiersResponse)get_store().add_element_user(GETSUBTASKIDENTIFIERSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getSubtaskIdentifiersResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetSubtaskIdentifiersResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument.GetSubtaskIdentifiersResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetSubtaskIdentifiersResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBTASKIDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "subtaskIdentifier");
        
        
        /**
         * Gets array of all "subtaskIdentifier" elements
         */
        public java.lang.String[] getSubtaskIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUBTASKIDENTIFIER$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "subtaskIdentifier" element
         */
        public java.lang.String getSubtaskIdentifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBTASKIDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "subtaskIdentifier" elements
         */
        public org.apache.xmlbeans.XmlAnyURI[] xgetSubtaskIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUBTASKIDENTIFIER$0, targetList);
                org.apache.xmlbeans.XmlAnyURI[] result = new org.apache.xmlbeans.XmlAnyURI[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "subtaskIdentifier" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetSubtaskIdentifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SUBTASKIDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "subtaskIdentifier" element
         */
        public int sizeOfSubtaskIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBTASKIDENTIFIER$0);
            }
        }
        
        /**
         * Sets array of all "subtaskIdentifier" element
         */
        public void setSubtaskIdentifierArray(java.lang.String[] subtaskIdentifierArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(subtaskIdentifierArray, SUBTASKIDENTIFIER$0);
            }
        }
        
        /**
         * Sets ith "subtaskIdentifier" element
         */
        public void setSubtaskIdentifierArray(int i, java.lang.String subtaskIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBTASKIDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(subtaskIdentifier);
            }
        }
        
        /**
         * Sets (as xml) array of all "subtaskIdentifier" element
         */
        public void xsetSubtaskIdentifierArray(org.apache.xmlbeans.XmlAnyURI[]subtaskIdentifierArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(subtaskIdentifierArray, SUBTASKIDENTIFIER$0);
            }
        }
        
        /**
         * Sets (as xml) ith "subtaskIdentifier" element
         */
        public void xsetSubtaskIdentifierArray(int i, org.apache.xmlbeans.XmlAnyURI subtaskIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SUBTASKIDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(subtaskIdentifier);
            }
        }
        
        /**
         * Inserts the value as the ith "subtaskIdentifier" element
         */
        public void insertSubtaskIdentifier(int i, java.lang.String subtaskIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SUBTASKIDENTIFIER$0, i);
                target.setStringValue(subtaskIdentifier);
            }
        }
        
        /**
         * Appends the value as the last "subtaskIdentifier" element
         */
        public void addSubtaskIdentifier(java.lang.String subtaskIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBTASKIDENTIFIER$0);
                target.setStringValue(subtaskIdentifier);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "subtaskIdentifier" element
         */
        public org.apache.xmlbeans.XmlAnyURI insertNewSubtaskIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().insert_element_user(SUBTASKIDENTIFIER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "subtaskIdentifier" element
         */
        public org.apache.xmlbeans.XmlAnyURI addNewSubtaskIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(SUBTASKIDENTIFIER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "subtaskIdentifier" element
         */
        public void removeSubtaskIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBTASKIDENTIFIER$0, i);
            }
        }
    }
}
