/*
 * An XML document type.
 * Localname: batchStopResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchStopResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one batchStopResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class BatchStopResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchStopResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public BatchStopResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BATCHSTOPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "batchStopResponse");
    
    
    /**
     * Gets the "batchStopResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchStopResponseDocument.BatchStopResponse getBatchStopResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchStopResponseDocument.BatchStopResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchStopResponseDocument.BatchStopResponse)get_store().find_element_user(BATCHSTOPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "batchStopResponse" element
     */
    public void setBatchStopResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchStopResponseDocument.BatchStopResponse batchStopResponse)
    {
        generatedSetterHelperImpl(batchStopResponse, BATCHSTOPRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "batchStopResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchStopResponseDocument.BatchStopResponse addNewBatchStopResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchStopResponseDocument.BatchStopResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchStopResponseDocument.BatchStopResponse)get_store().add_element_user(BATCHSTOPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML batchStopResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class BatchStopResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchStopResponseDocument.BatchStopResponse
    {
        private static final long serialVersionUID = 1L;
        
        public BatchStopResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BATCHRESPONSE$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "batchResponse");
        
        
        /**
         * Gets array of all "batchResponse" elements
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse[] getBatchResponseArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BATCHRESPONSE$0, targetList);
                org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "batchResponse" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse getBatchResponseArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse)get_store().find_element_user(BATCHRESPONSE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "batchResponse" element
         */
        public int sizeOfBatchResponseArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BATCHRESPONSE$0);
            }
        }
        
        /**
         * Sets array of all "batchResponse" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setBatchResponseArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse[] batchResponseArray)
        {
            check_orphaned();
            arraySetterHelper(batchResponseArray, BATCHRESPONSE$0);
        }
        
        /**
         * Sets ith "batchResponse" element
         */
        public void setBatchResponseArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse batchResponse)
        {
            generatedSetterHelperImpl(batchResponse, BATCHRESPONSE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "batchResponse" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse insertNewBatchResponse(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse)get_store().insert_element_user(BATCHRESPONSE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "batchResponse" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse addNewBatchResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse)get_store().add_element_user(BATCHRESPONSE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "batchResponse" element
         */
        public void removeBatchResponse(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BATCHRESPONSE$0, i);
            }
        }
    }
}
