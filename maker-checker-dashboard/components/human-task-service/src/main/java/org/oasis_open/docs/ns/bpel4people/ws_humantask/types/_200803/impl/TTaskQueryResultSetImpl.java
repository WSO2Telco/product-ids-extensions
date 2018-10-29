/*
 * XML Type:  tTaskQueryResultSet
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultSet
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * An XML tTaskQueryResultSet(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public class TTaskQueryResultSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultSet
{
    private static final long serialVersionUID = 1L;
    
    public TTaskQueryResultSetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROW$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "row");
    
    
    /**
     * Gets array of all "row" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultRow[] getRowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROW$0, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultRow[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultRow[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "row" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultRow getRowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultRow target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultRow)get_store().find_element_user(ROW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "row" element
     */
    public int sizeOfRowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROW$0);
        }
    }
    
    /**
     * Sets array of all "row" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRowArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultRow[] rowArray)
    {
        check_orphaned();
        arraySetterHelper(rowArray, ROW$0);
    }
    
    /**
     * Sets ith "row" element
     */
    public void setRowArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultRow row)
    {
        generatedSetterHelperImpl(row, ROW$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "row" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultRow insertNewRow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultRow target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultRow)get_store().insert_element_user(ROW$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "row" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultRow addNewRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultRow target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultRow)get_store().add_element_user(ROW$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "row" element
     */
    public void removeRow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROW$0, i);
        }
    }
}
