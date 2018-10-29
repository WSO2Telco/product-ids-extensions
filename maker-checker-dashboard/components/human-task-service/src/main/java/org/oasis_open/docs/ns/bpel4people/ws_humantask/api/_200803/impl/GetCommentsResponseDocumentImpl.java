/*
 * An XML document type.
 * Localname: getCommentsResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetCommentsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getCommentsResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetCommentsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetCommentsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCommentsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCOMMENTSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getCommentsResponse");
    
    
    /**
     * Gets the "getCommentsResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetCommentsResponseDocument.GetCommentsResponse getGetCommentsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetCommentsResponseDocument.GetCommentsResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetCommentsResponseDocument.GetCommentsResponse)get_store().find_element_user(GETCOMMENTSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getCommentsResponse" element
     */
    public void setGetCommentsResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetCommentsResponseDocument.GetCommentsResponse getCommentsResponse)
    {
        generatedSetterHelperImpl(getCommentsResponse, GETCOMMENTSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getCommentsResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetCommentsResponseDocument.GetCommentsResponse addNewGetCommentsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetCommentsResponseDocument.GetCommentsResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetCommentsResponseDocument.GetCommentsResponse)get_store().add_element_user(GETCOMMENTSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getCommentsResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetCommentsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetCommentsResponseDocument.GetCommentsResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetCommentsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COMMENT$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "comment");
        
        
        /**
         * Gets array of all "comment" elements
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment[] getCommentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMMENT$0, targetList);
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "comment" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment getCommentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment)get_store().find_element_user(COMMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "comment" element
         */
        public int sizeOfCommentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMMENT$0);
            }
        }
        
        /**
         * Sets array of all "comment" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setCommentArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment[] commentArray)
        {
            check_orphaned();
            arraySetterHelper(commentArray, COMMENT$0);
        }
        
        /**
         * Sets ith "comment" element
         */
        public void setCommentArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment comment)
        {
            generatedSetterHelperImpl(comment, COMMENT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "comment" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment insertNewComment(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment)get_store().insert_element_user(COMMENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "comment" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment addNewComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment)get_store().add_element_user(COMMENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "comment" element
         */
        public void removeComment(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMMENT$0, i);
            }
        }
    }
}
