/*
 * An XML document type.
 * Localname: batchSetGenericHumanRole
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSetGenericHumanRoleDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one batchSetGenericHumanRole(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class BatchSetGenericHumanRoleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSetGenericHumanRoleDocument
{
    private static final long serialVersionUID = 1L;
    
    public BatchSetGenericHumanRoleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BATCHSETGENERICHUMANROLE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "batchSetGenericHumanRole");
    
    
    /**
     * Gets the "batchSetGenericHumanRole" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSetGenericHumanRoleDocument.BatchSetGenericHumanRole getBatchSetGenericHumanRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSetGenericHumanRoleDocument.BatchSetGenericHumanRole target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSetGenericHumanRoleDocument.BatchSetGenericHumanRole)get_store().find_element_user(BATCHSETGENERICHUMANROLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "batchSetGenericHumanRole" element
     */
    public void setBatchSetGenericHumanRole(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSetGenericHumanRoleDocument.BatchSetGenericHumanRole batchSetGenericHumanRole)
    {
        generatedSetterHelperImpl(batchSetGenericHumanRole, BATCHSETGENERICHUMANROLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "batchSetGenericHumanRole" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSetGenericHumanRoleDocument.BatchSetGenericHumanRole addNewBatchSetGenericHumanRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSetGenericHumanRoleDocument.BatchSetGenericHumanRole target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSetGenericHumanRoleDocument.BatchSetGenericHumanRole)get_store().add_element_user(BATCHSETGENERICHUMANROLE$0);
            return target;
        }
    }
    /**
     * An XML batchSetGenericHumanRole(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class BatchSetGenericHumanRoleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSetGenericHumanRoleDocument.BatchSetGenericHumanRole
    {
        private static final long serialVersionUID = 1L;
        
        public BatchSetGenericHumanRoleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "identifier");
        private static final javax.xml.namespace.QName GENERICHUMANROLE$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "genericHumanRole");
        private static final javax.xml.namespace.QName ORGANIZATIONALENTITY$4 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "organizationalEntity");
        
        
        /**
         * Gets array of all "identifier" elements
         */
        public java.lang.String[] getIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IDENTIFIER$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "identifier" element
         */
        public java.lang.String getIdentifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "identifier" elements
         */
        public org.apache.xmlbeans.XmlAnyURI[] xgetIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IDENTIFIER$0, targetList);
                org.apache.xmlbeans.XmlAnyURI[] result = new org.apache.xmlbeans.XmlAnyURI[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "identifier" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetIdentifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(IDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "identifier" element
         */
        public int sizeOfIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDENTIFIER$0);
            }
        }
        
        /**
         * Sets array of all "identifier" element
         */
        public void setIdentifierArray(java.lang.String[] identifierArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(identifierArray, IDENTIFIER$0);
            }
        }
        
        /**
         * Sets ith "identifier" element
         */
        public void setIdentifierArray(int i, java.lang.String identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(identifier);
            }
        }
        
        /**
         * Sets (as xml) array of all "identifier" element
         */
        public void xsetIdentifierArray(org.apache.xmlbeans.XmlAnyURI[]identifierArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(identifierArray, IDENTIFIER$0);
            }
        }
        
        /**
         * Sets (as xml) ith "identifier" element
         */
        public void xsetIdentifierArray(int i, org.apache.xmlbeans.XmlAnyURI identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(IDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(identifier);
            }
        }
        
        /**
         * Inserts the value as the ith "identifier" element
         */
        public void insertIdentifier(int i, java.lang.String identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(IDENTIFIER$0, i);
                target.setStringValue(identifier);
            }
        }
        
        /**
         * Appends the value as the last "identifier" element
         */
        public void addIdentifier(java.lang.String identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFIER$0);
                target.setStringValue(identifier);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "identifier" element
         */
        public org.apache.xmlbeans.XmlAnyURI insertNewIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().insert_element_user(IDENTIFIER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "identifier" element
         */
        public org.apache.xmlbeans.XmlAnyURI addNewIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(IDENTIFIER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "identifier" element
         */
        public void removeIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDENTIFIER$0, i);
            }
        }
        
        /**
         * Gets the "genericHumanRole" element
         */
        public java.lang.String getGenericHumanRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERICHUMANROLE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "genericHumanRole" element
         */
        public org.apache.xmlbeans.XmlString xgetGenericHumanRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENERICHUMANROLE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "genericHumanRole" element
         */
        public void setGenericHumanRole(java.lang.String genericHumanRole)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERICHUMANROLE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERICHUMANROLE$2);
                }
                target.setStringValue(genericHumanRole);
            }
        }
        
        /**
         * Sets (as xml) the "genericHumanRole" element
         */
        public void xsetGenericHumanRole(org.apache.xmlbeans.XmlString genericHumanRole)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENERICHUMANROLE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GENERICHUMANROLE$2);
                }
                target.set(genericHumanRole);
            }
        }
        
        /**
         * Gets the "organizationalEntity" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity getOrganizationalEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().find_element_user(ORGANIZATIONALENTITY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "organizationalEntity" element
         */
        public void setOrganizationalEntity(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity organizationalEntity)
        {
            generatedSetterHelperImpl(organizationalEntity, ORGANIZATIONALENTITY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "organizationalEntity" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity addNewOrganizationalEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity)get_store().add_element_user(ORGANIZATIONALENTITY$4);
                return target;
            }
        }
    }
}
