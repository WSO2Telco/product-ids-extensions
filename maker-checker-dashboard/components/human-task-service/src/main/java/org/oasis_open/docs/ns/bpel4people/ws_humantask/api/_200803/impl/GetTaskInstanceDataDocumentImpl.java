/*
 * An XML document type.
 * Localname: getTaskInstanceData
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getTaskInstanceData(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetTaskInstanceDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTaskInstanceDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTASKINSTANCEDATA$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getTaskInstanceData");
    
    
    /**
     * Gets the "getTaskInstanceData" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataDocument.GetTaskInstanceData getGetTaskInstanceData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataDocument.GetTaskInstanceData target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataDocument.GetTaskInstanceData)get_store().find_element_user(GETTASKINSTANCEDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTaskInstanceData" element
     */
    public void setGetTaskInstanceData(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataDocument.GetTaskInstanceData getTaskInstanceData)
    {
        generatedSetterHelperImpl(getTaskInstanceData, GETTASKINSTANCEDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTaskInstanceData" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataDocument.GetTaskInstanceData addNewGetTaskInstanceData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataDocument.GetTaskInstanceData target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataDocument.GetTaskInstanceData)get_store().add_element_user(GETTASKINSTANCEDATA$0);
            return target;
        }
    }
    /**
     * An XML getTaskInstanceData(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetTaskInstanceDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataDocument.GetTaskInstanceData
    {
        private static final long serialVersionUID = 1L;
        
        public GetTaskInstanceDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "identifier");
        private static final javax.xml.namespace.QName PROPERTIES$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "properties");
        private static final javax.xml.namespace.QName RENDERINGPREFERENCES$4 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "renderingPreferences");
        
        
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
         * Gets the "properties" element
         */
        public java.lang.String getProperties()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTIES$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "properties" element
         */
        public org.apache.xmlbeans.XmlString xgetProperties()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTIES$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "properties" element
         */
        public void setProperties(java.lang.String properties)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTIES$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTIES$2);
                }
                target.setStringValue(properties);
            }
        }
        
        /**
         * Sets (as xml) the "properties" element
         */
        public void xsetProperties(org.apache.xmlbeans.XmlString properties)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTIES$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTIES$2);
                }
                target.set(properties);
            }
        }
        
        /**
         * Gets array of all "renderingPreferences" elements
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRenderingTypes[] getRenderingPreferencesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RENDERINGPREFERENCES$4, targetList);
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRenderingTypes[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRenderingTypes[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "renderingPreferences" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRenderingTypes getRenderingPreferencesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRenderingTypes target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRenderingTypes)get_store().find_element_user(RENDERINGPREFERENCES$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "renderingPreferences" element
         */
        public int sizeOfRenderingPreferencesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RENDERINGPREFERENCES$4);
            }
        }
        
        /**
         * Sets array of all "renderingPreferences" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRenderingPreferencesArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRenderingTypes[] renderingPreferencesArray)
        {
            check_orphaned();
            arraySetterHelper(renderingPreferencesArray, RENDERINGPREFERENCES$4);
        }
        
        /**
         * Sets ith "renderingPreferences" element
         */
        public void setRenderingPreferencesArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRenderingTypes renderingPreferences)
        {
            generatedSetterHelperImpl(renderingPreferences, RENDERINGPREFERENCES$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "renderingPreferences" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRenderingTypes insertNewRenderingPreferences(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRenderingTypes target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRenderingTypes)get_store().insert_element_user(RENDERINGPREFERENCES$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "renderingPreferences" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRenderingTypes addNewRenderingPreferences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRenderingTypes target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRenderingTypes)get_store().add_element_user(RENDERINGPREFERENCES$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "renderingPreferences" element
         */
        public void removeRenderingPreferences(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RENDERINGPREFERENCES$4, i);
            }
        }
    }
}
