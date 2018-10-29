/*
 * XML Type:  tMessagePartsData
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * An XML tMessagePartsData(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public class TMessagePartsDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData
{
    private static final long serialVersionUID = 1L;
    
    public TMessagePartsDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PART$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "part");
    
    
    /**
     * Gets array of all "part" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart[] getPartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PART$0, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "part" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart getPartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart)get_store().find_element_user(PART$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "part" element
     */
    public int sizeOfPartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PART$0);
        }
    }
    
    /**
     * Sets array of all "part" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPartArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart[] partArray)
    {
        check_orphaned();
        arraySetterHelper(partArray, PART$0);
    }
    
    /**
     * Sets ith "part" element
     */
    public void setPartArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart part)
    {
        generatedSetterHelperImpl(part, PART$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "part" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart insertNewPart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart)get_store().insert_element_user(PART$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "part" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart addNewPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPart)get_store().add_element_user(PART$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "part" element
     */
    public void removePart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PART$0, i);
        }
    }
}
