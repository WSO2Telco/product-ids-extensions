/*
 * XML Type:  tBatchResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * An XML tBatchResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
 *
 * This is a complex type.
 */
public class TBatchResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse
{
    private static final long serialVersionUID = 1L;
    
    public TBatchResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "identifier");
    private static final javax.xml.namespace.QName ILLEGALSTATE$2 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "illegalState");
    private static final javax.xml.namespace.QName ILLEGALARGUMENT$4 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "illegalArgument");
    private static final javax.xml.namespace.QName ILLEGALACCESS$6 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "illegalAccess");
    private static final javax.xml.namespace.QName ILLEGALOPERATION$8 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "illegalOperation");
    private static final javax.xml.namespace.QName RECIPIENTNOTALLOWED$10 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "recipientNotAllowed");
    
    
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
     * Gets the "illegalState" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateDocument.IllegalState getIllegalState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateDocument.IllegalState target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateDocument.IllegalState)get_store().find_element_user(ILLEGALSTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "illegalState" element
     */
    public boolean isSetIllegalState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ILLEGALSTATE$2) != 0;
        }
    }
    
    /**
     * Sets the "illegalState" element
     */
    public void setIllegalState(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateDocument.IllegalState illegalState)
    {
        generatedSetterHelperImpl(illegalState, ILLEGALSTATE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "illegalState" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateDocument.IllegalState addNewIllegalState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateDocument.IllegalState target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateDocument.IllegalState)get_store().add_element_user(ILLEGALSTATE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "illegalState" element
     */
    public void unsetIllegalState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ILLEGALSTATE$2, 0);
        }
    }
    
    /**
     * Gets the "illegalArgument" element
     */
    public java.lang.String getIllegalArgument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ILLEGALARGUMENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "illegalArgument" element
     */
    public org.apache.xmlbeans.XmlString xgetIllegalArgument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ILLEGALARGUMENT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "illegalArgument" element
     */
    public boolean isSetIllegalArgument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ILLEGALARGUMENT$4) != 0;
        }
    }
    
    /**
     * Sets the "illegalArgument" element
     */
    public void setIllegalArgument(java.lang.String illegalArgument)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ILLEGALARGUMENT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ILLEGALARGUMENT$4);
            }
            target.setStringValue(illegalArgument);
        }
    }
    
    /**
     * Sets (as xml) the "illegalArgument" element
     */
    public void xsetIllegalArgument(org.apache.xmlbeans.XmlString illegalArgument)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ILLEGALARGUMENT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ILLEGALARGUMENT$4);
            }
            target.set(illegalArgument);
        }
    }
    
    /**
     * Unsets the "illegalArgument" element
     */
    public void unsetIllegalArgument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ILLEGALARGUMENT$4, 0);
        }
    }
    
    /**
     * Gets the "illegalAccess" element
     */
    public java.lang.String getIllegalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ILLEGALACCESS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "illegalAccess" element
     */
    public org.apache.xmlbeans.XmlString xgetIllegalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ILLEGALACCESS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "illegalAccess" element
     */
    public boolean isSetIllegalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ILLEGALACCESS$6) != 0;
        }
    }
    
    /**
     * Sets the "illegalAccess" element
     */
    public void setIllegalAccess(java.lang.String illegalAccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ILLEGALACCESS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ILLEGALACCESS$6);
            }
            target.setStringValue(illegalAccess);
        }
    }
    
    /**
     * Sets (as xml) the "illegalAccess" element
     */
    public void xsetIllegalAccess(org.apache.xmlbeans.XmlString illegalAccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ILLEGALACCESS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ILLEGALACCESS$6);
            }
            target.set(illegalAccess);
        }
    }
    
    /**
     * Unsets the "illegalAccess" element
     */
    public void unsetIllegalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ILLEGALACCESS$6, 0);
        }
    }
    
    /**
     * Gets the "illegalOperation" element
     */
    public java.lang.String getIllegalOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ILLEGALOPERATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "illegalOperation" element
     */
    public org.apache.xmlbeans.XmlString xgetIllegalOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ILLEGALOPERATION$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "illegalOperation" element
     */
    public boolean isSetIllegalOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ILLEGALOPERATION$8) != 0;
        }
    }
    
    /**
     * Sets the "illegalOperation" element
     */
    public void setIllegalOperation(java.lang.String illegalOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ILLEGALOPERATION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ILLEGALOPERATION$8);
            }
            target.setStringValue(illegalOperation);
        }
    }
    
    /**
     * Sets (as xml) the "illegalOperation" element
     */
    public void xsetIllegalOperation(org.apache.xmlbeans.XmlString illegalOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ILLEGALOPERATION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ILLEGALOPERATION$8);
            }
            target.set(illegalOperation);
        }
    }
    
    /**
     * Unsets the "illegalOperation" element
     */
    public void unsetIllegalOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ILLEGALOPERATION$8, 0);
        }
    }
    
    /**
     * Gets the "recipientNotAllowed" element
     */
    public java.lang.String getRecipientNotAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECIPIENTNOTALLOWED$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "recipientNotAllowed" element
     */
    public org.apache.xmlbeans.XmlString xgetRecipientNotAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECIPIENTNOTALLOWED$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "recipientNotAllowed" element
     */
    public boolean isSetRecipientNotAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECIPIENTNOTALLOWED$10) != 0;
        }
    }
    
    /**
     * Sets the "recipientNotAllowed" element
     */
    public void setRecipientNotAllowed(java.lang.String recipientNotAllowed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECIPIENTNOTALLOWED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECIPIENTNOTALLOWED$10);
            }
            target.setStringValue(recipientNotAllowed);
        }
    }
    
    /**
     * Sets (as xml) the "recipientNotAllowed" element
     */
    public void xsetRecipientNotAllowed(org.apache.xmlbeans.XmlString recipientNotAllowed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECIPIENTNOTALLOWED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RECIPIENTNOTALLOWED$10);
            }
            target.set(recipientNotAllowed);
        }
    }
    
    /**
     * Unsets the "recipientNotAllowed" element
     */
    public void unsetRecipientNotAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECIPIENTNOTALLOWED$10, 0);
        }
    }
}
