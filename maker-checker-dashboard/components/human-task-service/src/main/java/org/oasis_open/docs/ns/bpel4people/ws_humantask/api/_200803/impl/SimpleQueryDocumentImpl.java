/*
 * An XML document type.
 * Localname: simpleQuery
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one simpleQuery(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class SimpleQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public SimpleQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIMPLEQUERY$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "simpleQuery");
    
    
    /**
     * Gets the "simpleQuery" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryDocument.SimpleQuery getSimpleQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryDocument.SimpleQuery target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryDocument.SimpleQuery)get_store().find_element_user(SIMPLEQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "simpleQuery" element
     */
    public void setSimpleQuery(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryDocument.SimpleQuery simpleQuery)
    {
        generatedSetterHelperImpl(simpleQuery, SIMPLEQUERY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "simpleQuery" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryDocument.SimpleQuery addNewSimpleQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryDocument.SimpleQuery target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryDocument.SimpleQuery)get_store().add_element_user(SIMPLEQUERY$0);
            return target;
        }
    }
    /**
     * An XML simpleQuery(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class SimpleQueryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryDocument.SimpleQuery
    {
        private static final long serialVersionUID = 1L;
        
        public SimpleQueryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SIMPLEQUERYINPUT$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "simpleQueryInput");
        
        
        /**
         * Gets the "simpleQueryInput" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput getSimpleQueryInput()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput)get_store().find_element_user(SIMPLEQUERYINPUT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "simpleQueryInput" element
         */
        public void setSimpleQueryInput(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput simpleQueryInput)
        {
            generatedSetterHelperImpl(simpleQueryInput, SIMPLEQUERYINPUT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "simpleQueryInput" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput addNewSimpleQueryInput()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput)get_store().add_element_user(SIMPLEQUERYINPUT$0);
                return target;
            }
        }
    }
}
