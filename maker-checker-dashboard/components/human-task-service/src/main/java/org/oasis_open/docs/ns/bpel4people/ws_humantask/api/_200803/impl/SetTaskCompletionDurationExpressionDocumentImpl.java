/*
 * An XML document type.
 * Localname: setTaskCompletionDurationExpression
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one setTaskCompletionDurationExpression(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class SetTaskCompletionDurationExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public SetTaskCompletionDurationExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETTASKCOMPLETIONDURATIONEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "setTaskCompletionDurationExpression");
    
    
    /**
     * Gets the "setTaskCompletionDurationExpression" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionDocument.SetTaskCompletionDurationExpression getSetTaskCompletionDurationExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionDocument.SetTaskCompletionDurationExpression target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionDocument.SetTaskCompletionDurationExpression)get_store().find_element_user(SETTASKCOMPLETIONDURATIONEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "setTaskCompletionDurationExpression" element
     */
    public void setSetTaskCompletionDurationExpression(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionDocument.SetTaskCompletionDurationExpression setTaskCompletionDurationExpression)
    {
        generatedSetterHelperImpl(setTaskCompletionDurationExpression, SETTASKCOMPLETIONDURATIONEXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "setTaskCompletionDurationExpression" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionDocument.SetTaskCompletionDurationExpression addNewSetTaskCompletionDurationExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionDocument.SetTaskCompletionDurationExpression target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionDocument.SetTaskCompletionDurationExpression)get_store().add_element_user(SETTASKCOMPLETIONDURATIONEXPRESSION$0);
            return target;
        }
    }
    /**
     * An XML setTaskCompletionDurationExpression(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class SetTaskCompletionDurationExpressionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionDocument.SetTaskCompletionDurationExpression
    {
        private static final long serialVersionUID = 1L;
        
        public SetTaskCompletionDurationExpressionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "identifier");
        private static final javax.xml.namespace.QName DEADLINENAME$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "deadlineName");
        private static final javax.xml.namespace.QName DURATIONEXPRESSION$4 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "durationExpression");
        
        
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
         * Gets the "deadlineName" element
         */
        public java.lang.String getDeadlineName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEADLINENAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "deadlineName" element
         */
        public org.apache.xmlbeans.XmlNCName xgetDeadlineName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNCName target = null;
                target = (org.apache.xmlbeans.XmlNCName)get_store().find_element_user(DEADLINENAME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "deadlineName" element
         */
        public void setDeadlineName(java.lang.String deadlineName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEADLINENAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEADLINENAME$2);
                }
                target.setStringValue(deadlineName);
            }
        }
        
        /**
         * Sets (as xml) the "deadlineName" element
         */
        public void xsetDeadlineName(org.apache.xmlbeans.XmlNCName deadlineName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNCName target = null;
                target = (org.apache.xmlbeans.XmlNCName)get_store().find_element_user(DEADLINENAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNCName)get_store().add_element_user(DEADLINENAME$2);
                }
                target.set(deadlineName);
            }
        }
        
        /**
         * Gets the "durationExpression" element
         */
        public java.lang.String getDurationExpression()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATIONEXPRESSION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "durationExpression" element
         */
        public org.apache.xmlbeans.XmlString xgetDurationExpression()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DURATIONEXPRESSION$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "durationExpression" element
         */
        public void setDurationExpression(java.lang.String durationExpression)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATIONEXPRESSION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DURATIONEXPRESSION$4);
                }
                target.setStringValue(durationExpression);
            }
        }
        
        /**
         * Sets (as xml) the "durationExpression" element
         */
        public void xsetDurationExpression(org.apache.xmlbeans.XmlString durationExpression)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DURATIONEXPRESSION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DURATIONEXPRESSION$4);
                }
                target.set(durationExpression);
            }
        }
    }
}
