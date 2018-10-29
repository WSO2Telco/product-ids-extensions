/*
 * An XML document type.
 * Localname: query
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one query(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class QueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public QueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERY$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "query");
    
    
    /**
     * Gets the "query" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryDocument.Query getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryDocument.Query target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryDocument.Query)get_store().find_element_user(QUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "query" element
     */
    public void setQuery(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryDocument.Query query)
    {
        generatedSetterHelperImpl(query, QUERY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "query" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryDocument.Query addNewQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryDocument.Query target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryDocument.Query)get_store().add_element_user(QUERY$0);
            return target;
        }
    }
    /**
     * An XML query(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class QueryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryDocument.Query
    {
        private static final long serialVersionUID = 1L;
        
        public QueryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SELECTCLAUSE$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "selectClause");
        private static final javax.xml.namespace.QName WHERECLAUSE$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "whereClause");
        private static final javax.xml.namespace.QName ORDERBYCLAUSE$4 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "orderByClause");
        private static final javax.xml.namespace.QName MAXTASKS$6 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "maxTasks");
        private static final javax.xml.namespace.QName TASKINDEXOFFSET$8 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "taskIndexOffset");
        
        
        /**
         * Gets the "selectClause" element
         */
        public java.lang.String getSelectClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELECTCLAUSE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "selectClause" element
         */
        public org.apache.xmlbeans.XmlString xgetSelectClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELECTCLAUSE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "selectClause" element
         */
        public void setSelectClause(java.lang.String selectClause)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELECTCLAUSE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELECTCLAUSE$0);
                }
                target.setStringValue(selectClause);
            }
        }
        
        /**
         * Sets (as xml) the "selectClause" element
         */
        public void xsetSelectClause(org.apache.xmlbeans.XmlString selectClause)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELECTCLAUSE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELECTCLAUSE$0);
                }
                target.set(selectClause);
            }
        }
        
        /**
         * Gets the "whereClause" element
         */
        public java.lang.String getWhereClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHERECLAUSE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "whereClause" element
         */
        public org.apache.xmlbeans.XmlString xgetWhereClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WHERECLAUSE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "whereClause" element
         */
        public boolean isSetWhereClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WHERECLAUSE$2) != 0;
            }
        }
        
        /**
         * Sets the "whereClause" element
         */
        public void setWhereClause(java.lang.String whereClause)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHERECLAUSE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WHERECLAUSE$2);
                }
                target.setStringValue(whereClause);
            }
        }
        
        /**
         * Sets (as xml) the "whereClause" element
         */
        public void xsetWhereClause(org.apache.xmlbeans.XmlString whereClause)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WHERECLAUSE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WHERECLAUSE$2);
                }
                target.set(whereClause);
            }
        }
        
        /**
         * Unsets the "whereClause" element
         */
        public void unsetWhereClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WHERECLAUSE$2, 0);
            }
        }
        
        /**
         * Gets the "orderByClause" element
         */
        public java.lang.String getOrderByClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERBYCLAUSE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "orderByClause" element
         */
        public org.apache.xmlbeans.XmlString xgetOrderByClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERBYCLAUSE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "orderByClause" element
         */
        public boolean isSetOrderByClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORDERBYCLAUSE$4) != 0;
            }
        }
        
        /**
         * Sets the "orderByClause" element
         */
        public void setOrderByClause(java.lang.String orderByClause)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERBYCLAUSE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERBYCLAUSE$4);
                }
                target.setStringValue(orderByClause);
            }
        }
        
        /**
         * Sets (as xml) the "orderByClause" element
         */
        public void xsetOrderByClause(org.apache.xmlbeans.XmlString orderByClause)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERBYCLAUSE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERBYCLAUSE$4);
                }
                target.set(orderByClause);
            }
        }
        
        /**
         * Unsets the "orderByClause" element
         */
        public void unsetOrderByClause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORDERBYCLAUSE$4, 0);
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
         * Gets the "taskIndexOffset" element
         */
        public int getTaskIndexOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKINDEXOFFSET$8, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "taskIndexOffset" element
         */
        public org.apache.xmlbeans.XmlInt xgetTaskIndexOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TASKINDEXOFFSET$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "taskIndexOffset" element
         */
        public boolean isSetTaskIndexOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TASKINDEXOFFSET$8) != 0;
            }
        }
        
        /**
         * Sets the "taskIndexOffset" element
         */
        public void setTaskIndexOffset(int taskIndexOffset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKINDEXOFFSET$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKINDEXOFFSET$8);
                }
                target.setIntValue(taskIndexOffset);
            }
        }
        
        /**
         * Sets (as xml) the "taskIndexOffset" element
         */
        public void xsetTaskIndexOffset(org.apache.xmlbeans.XmlInt taskIndexOffset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TASKINDEXOFFSET$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TASKINDEXOFFSET$8);
                }
                target.set(taskIndexOffset);
            }
        }
        
        /**
         * Unsets the "taskIndexOffset" element
         */
        public void unsetTaskIndexOffset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TASKINDEXOFFSET$8, 0);
            }
        }
    }
}
