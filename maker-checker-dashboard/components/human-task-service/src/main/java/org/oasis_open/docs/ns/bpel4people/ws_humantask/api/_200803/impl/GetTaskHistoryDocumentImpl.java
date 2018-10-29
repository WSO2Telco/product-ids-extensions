/*
 * An XML document type.
 * Localname: getTaskHistory
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getTaskHistory(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetTaskHistoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTaskHistoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTASKHISTORY$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getTaskHistory");
    
    
    /**
     * Gets the "getTaskHistory" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryDocument.GetTaskHistory getGetTaskHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryDocument.GetTaskHistory target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryDocument.GetTaskHistory)get_store().find_element_user(GETTASKHISTORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTaskHistory" element
     */
    public void setGetTaskHistory(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryDocument.GetTaskHistory getTaskHistory)
    {
        generatedSetterHelperImpl(getTaskHistory, GETTASKHISTORY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTaskHistory" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryDocument.GetTaskHistory addNewGetTaskHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryDocument.GetTaskHistory target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryDocument.GetTaskHistory)get_store().add_element_user(GETTASKHISTORY$0);
            return target;
        }
    }
    /**
     * An XML getTaskHistory(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetTaskHistoryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryDocument.GetTaskHistory
    {
        private static final long serialVersionUID = 1L;
        
        public GetTaskHistoryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "identifier");
        private static final javax.xml.namespace.QName FILTER$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "filter");
        private static final javax.xml.namespace.QName STARTINDEX$4 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "startIndex");
        private static final javax.xml.namespace.QName MAXTASKS$6 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "maxTasks");
        private static final javax.xml.namespace.QName INCLUDEDATA$8 = 
            new javax.xml.namespace.QName("", "includeData");
        
        
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
         * Gets the "filter" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter getFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter)get_store().find_element_user(FILTER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "filter" element
         */
        public boolean isSetFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FILTER$2) != 0;
            }
        }
        
        /**
         * Sets the "filter" element
         */
        public void setFilter(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter filter)
        {
            generatedSetterHelperImpl(filter, FILTER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "filter" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter addNewFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter)get_store().add_element_user(FILTER$2);
                return target;
            }
        }
        
        /**
         * Unsets the "filter" element
         */
        public void unsetFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FILTER$2, 0);
            }
        }
        
        /**
         * Gets the "startIndex" element
         */
        public int getStartIndex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTINDEX$4, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "startIndex" element
         */
        public org.apache.xmlbeans.XmlInt xgetStartIndex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STARTINDEX$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "startIndex" element
         */
        public boolean isSetStartIndex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STARTINDEX$4) != 0;
            }
        }
        
        /**
         * Sets the "startIndex" element
         */
        public void setStartIndex(int startIndex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTINDEX$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTINDEX$4);
                }
                target.setIntValue(startIndex);
            }
        }
        
        /**
         * Sets (as xml) the "startIndex" element
         */
        public void xsetStartIndex(org.apache.xmlbeans.XmlInt startIndex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STARTINDEX$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(STARTINDEX$4);
                }
                target.set(startIndex);
            }
        }
        
        /**
         * Unsets the "startIndex" element
         */
        public void unsetStartIndex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STARTINDEX$4, 0);
            }
        }
        
        /**
         * Gets the "maxTasks" element
         */
        public int getMaxTasks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXTASKS$6, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "maxTasks" element
         */
        public org.apache.xmlbeans.XmlInt xgetMaxTasks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXTASKS$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "maxTasks" element
         */
        public boolean isSetMaxTasks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAXTASKS$6) != 0;
            }
        }
        
        /**
         * Sets the "maxTasks" element
         */
        public void setMaxTasks(int maxTasks)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXTASKS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXTASKS$6);
                }
                target.setIntValue(maxTasks);
            }
        }
        
        /**
         * Sets (as xml) the "maxTasks" element
         */
        public void xsetMaxTasks(org.apache.xmlbeans.XmlInt maxTasks)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXTASKS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXTASKS$6);
                }
                target.set(maxTasks);
            }
        }
        
        /**
         * Unsets the "maxTasks" element
         */
        public void unsetMaxTasks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAXTASKS$6, 0);
            }
        }
        
        /**
         * Gets the "includeData" attribute
         */
        public boolean getIncludeData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDEDATA$8);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "includeData" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetIncludeData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INCLUDEDATA$8);
                return target;
            }
        }
        
        /**
         * True if has "includeData" attribute
         */
        public boolean isSetIncludeData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INCLUDEDATA$8) != null;
            }
        }
        
        /**
         * Sets the "includeData" attribute
         */
        public void setIncludeData(boolean includeData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDEDATA$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCLUDEDATA$8);
                }
                target.setBooleanValue(includeData);
            }
        }
        
        /**
         * Sets (as xml) the "includeData" attribute
         */
        public void xsetIncludeData(org.apache.xmlbeans.XmlBoolean includeData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INCLUDEDATA$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INCLUDEDATA$8);
                }
                target.set(includeData);
            }
        }
        
        /**
         * Unsets the "includeData" attribute
         */
        public void unsetIncludeData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INCLUDEDATA$8);
            }
        }
    }
}
