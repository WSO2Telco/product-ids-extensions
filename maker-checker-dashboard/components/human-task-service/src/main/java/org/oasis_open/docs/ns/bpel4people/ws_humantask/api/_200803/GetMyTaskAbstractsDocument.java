/*
 * An XML document type.
 * Localname: getMyTaskAbstracts
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;


/**
 * A document containing one getMyTaskAbstracts(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public interface GetMyTaskAbstractsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetMyTaskAbstractsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B376691F9828D2A29ED491729187FB4").resolveHandle("getmytaskabstracts0c90doctype");
    
    /**
     * Gets the "getMyTaskAbstracts" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument.GetMyTaskAbstracts getGetMyTaskAbstracts();
    
    /**
     * Sets the "getMyTaskAbstracts" element
     */
    void setGetMyTaskAbstracts(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument.GetMyTaskAbstracts getMyTaskAbstracts);
    
    /**
     * Appends and returns a new empty "getMyTaskAbstracts" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument.GetMyTaskAbstracts addNewGetMyTaskAbstracts();
    
    /**
     * An XML getMyTaskAbstracts(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public interface GetMyTaskAbstracts extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetMyTaskAbstracts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B376691F9828D2A29ED491729187FB4").resolveHandle("getmytaskabstracts9f2aelemtype");
        
        /**
         * Gets the "taskType" element
         */
        java.lang.String getTaskType();
        
        /**
         * Gets (as xml) the "taskType" element
         */
        org.apache.xmlbeans.XmlString xgetTaskType();
        
        /**
         * Sets the "taskType" element
         */
        void setTaskType(java.lang.String taskType);
        
        /**
         * Sets (as xml) the "taskType" element
         */
        void xsetTaskType(org.apache.xmlbeans.XmlString taskType);
        
        /**
         * Gets the "genericHumanRole" element
         */
        java.lang.String getGenericHumanRole();
        
        /**
         * Gets (as xml) the "genericHumanRole" element
         */
        org.apache.xmlbeans.XmlString xgetGenericHumanRole();
        
        /**
         * True if has "genericHumanRole" element
         */
        boolean isSetGenericHumanRole();
        
        /**
         * Sets the "genericHumanRole" element
         */
        void setGenericHumanRole(java.lang.String genericHumanRole);
        
        /**
         * Sets (as xml) the "genericHumanRole" element
         */
        void xsetGenericHumanRole(org.apache.xmlbeans.XmlString genericHumanRole);
        
        /**
         * Unsets the "genericHumanRole" element
         */
        void unsetGenericHumanRole();
        
        /**
         * Gets the "workQueue" element
         */
        java.lang.String getWorkQueue();
        
        /**
         * Gets (as xml) the "workQueue" element
         */
        org.apache.xmlbeans.XmlString xgetWorkQueue();
        
        /**
         * True if has "workQueue" element
         */
        boolean isSetWorkQueue();
        
        /**
         * Sets the "workQueue" element
         */
        void setWorkQueue(java.lang.String workQueue);
        
        /**
         * Sets (as xml) the "workQueue" element
         */
        void xsetWorkQueue(org.apache.xmlbeans.XmlString workQueue);
        
        /**
         * Unsets the "workQueue" element
         */
        void unsetWorkQueue();
        
        /**
         * Gets array of all "status" elements
         */
        java.lang.String[] getStatusArray();
        
        /**
         * Gets ith "status" element
         */
        java.lang.String getStatusArray(int i);
        
        /**
         * Gets (as xml) array of all "status" elements
         */
        org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus[] xgetStatusArray();
        
        /**
         * Gets (as xml) ith "status" element
         */
        org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus xgetStatusArray(int i);
        
        /**
         * Returns number of "status" element
         */
        int sizeOfStatusArray();
        
        /**
         * Sets array of all "status" element
         */
        void setStatusArray(java.lang.String[] statusArray);
        
        /**
         * Sets ith "status" element
         */
        void setStatusArray(int i, java.lang.String status);
        
        /**
         * Sets (as xml) array of all "status" element
         */
        void xsetStatusArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus[] statusArray);
        
        /**
         * Sets (as xml) ith "status" element
         */
        void xsetStatusArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus status);
        
        /**
         * Inserts the value as the ith "status" element
         */
        void insertStatus(int i, java.lang.String status);
        
        /**
         * Appends the value as the last "status" element
         */
        void addStatus(java.lang.String status);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "status" element
         */
        org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus insertNewStatus(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "status" element
         */
        org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus addNewStatus();
        
        /**
         * Removes the ith "status" element
         */
        void removeStatus(int i);
        
        /**
         * Gets the "whereClause" element
         */
        java.lang.String getWhereClause();
        
        /**
         * Gets (as xml) the "whereClause" element
         */
        org.apache.xmlbeans.XmlString xgetWhereClause();
        
        /**
         * True if has "whereClause" element
         */
        boolean isSetWhereClause();
        
        /**
         * Sets the "whereClause" element
         */
        void setWhereClause(java.lang.String whereClause);
        
        /**
         * Sets (as xml) the "whereClause" element
         */
        void xsetWhereClause(org.apache.xmlbeans.XmlString whereClause);
        
        /**
         * Unsets the "whereClause" element
         */
        void unsetWhereClause();
        
        /**
         * Gets the "orderByClause" element
         */
        java.lang.String getOrderByClause();
        
        /**
         * Gets (as xml) the "orderByClause" element
         */
        org.apache.xmlbeans.XmlString xgetOrderByClause();
        
        /**
         * True if has "orderByClause" element
         */
        boolean isSetOrderByClause();
        
        /**
         * Sets the "orderByClause" element
         */
        void setOrderByClause(java.lang.String orderByClause);
        
        /**
         * Sets (as xml) the "orderByClause" element
         */
        void xsetOrderByClause(org.apache.xmlbeans.XmlString orderByClause);
        
        /**
         * Unsets the "orderByClause" element
         */
        void unsetOrderByClause();
        
        /**
         * Gets the "createdOnClause" element
         */
        java.lang.String getCreatedOnClause();
        
        /**
         * Gets (as xml) the "createdOnClause" element
         */
        org.apache.xmlbeans.XmlString xgetCreatedOnClause();
        
        /**
         * True if has "createdOnClause" element
         */
        boolean isSetCreatedOnClause();
        
        /**
         * Sets the "createdOnClause" element
         */
        void setCreatedOnClause(java.lang.String createdOnClause);
        
        /**
         * Sets (as xml) the "createdOnClause" element
         */
        void xsetCreatedOnClause(org.apache.xmlbeans.XmlString createdOnClause);
        
        /**
         * Unsets the "createdOnClause" element
         */
        void unsetCreatedOnClause();
        
        /**
         * Gets the "maxTasks" element
         */
        int getMaxTasks();
        
        /**
         * Gets (as xml) the "maxTasks" element
         */
        org.apache.xmlbeans.XmlInt xgetMaxTasks();
        
        /**
         * True if has "maxTasks" element
         */
        boolean isSetMaxTasks();
        
        /**
         * Sets the "maxTasks" element
         */
        void setMaxTasks(int maxTasks);
        
        /**
         * Sets (as xml) the "maxTasks" element
         */
        void xsetMaxTasks(org.apache.xmlbeans.XmlInt maxTasks);
        
        /**
         * Unsets the "maxTasks" element
         */
        void unsetMaxTasks();
        
        /**
         * Gets the "taskIndexOffset" element
         */
        int getTaskIndexOffset();
        
        /**
         * Gets (as xml) the "taskIndexOffset" element
         */
        org.apache.xmlbeans.XmlInt xgetTaskIndexOffset();
        
        /**
         * True if has "taskIndexOffset" element
         */
        boolean isSetTaskIndexOffset();
        
        /**
         * Sets the "taskIndexOffset" element
         */
        void setTaskIndexOffset(int taskIndexOffset);
        
        /**
         * Sets (as xml) the "taskIndexOffset" element
         */
        void xsetTaskIndexOffset(org.apache.xmlbeans.XmlInt taskIndexOffset);
        
        /**
         * Unsets the "taskIndexOffset" element
         */
        void unsetTaskIndexOffset();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument.GetMyTaskAbstracts newInstance() {
              return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument.GetMyTaskAbstracts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument.GetMyTaskAbstracts newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument.GetMyTaskAbstracts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument newInstance() {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
