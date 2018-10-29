/*
 * An XML document type.
 * Localname: getTaskHistoryResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;


/**
 * A document containing one getTaskHistoryResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public interface GetTaskHistoryResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetTaskHistoryResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B376691F9828D2A29ED491729187FB4").resolveHandle("gettaskhistoryresponsee980doctype");
    
    /**
     * Gets the "getTaskHistoryResponse" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument.GetTaskHistoryResponse getGetTaskHistoryResponse();
    
    /**
     * Sets the "getTaskHistoryResponse" element
     */
    void setGetTaskHistoryResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument.GetTaskHistoryResponse getTaskHistoryResponse);
    
    /**
     * Appends and returns a new empty "getTaskHistoryResponse" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument.GetTaskHistoryResponse addNewGetTaskHistoryResponse();
    
    /**
     * An XML getTaskHistoryResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public interface GetTaskHistoryResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetTaskHistoryResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B376691F9828D2A29ED491729187FB4").resolveHandle("gettaskhistoryresponse27aaelemtype");
        
        /**
         * Gets array of all "taskEvent" elements
         */
        org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum[] getTaskEventArray();
        
        /**
         * Gets ith "taskEvent" element
         */
        org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum getTaskEventArray(int i);
        
        /**
         * Gets (as xml) array of all "taskEvent" elements
         */
        org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType[] xgetTaskEventArray();
        
        /**
         * Gets (as xml) ith "taskEvent" element
         */
        org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType xgetTaskEventArray(int i);
        
        /**
         * Returns number of "taskEvent" element
         */
        int sizeOfTaskEventArray();
        
        /**
         * Sets array of all "taskEvent" element
         */
        void setTaskEventArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum[] taskEventArray);
        
        /**
         * Sets ith "taskEvent" element
         */
        void setTaskEventArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum taskEvent);
        
        /**
         * Sets (as xml) array of all "taskEvent" element
         */
        void xsetTaskEventArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType[] taskEventArray);
        
        /**
         * Sets (as xml) ith "taskEvent" element
         */
        void xsetTaskEventArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType taskEvent);
        
        /**
         * Inserts the value as the ith "taskEvent" element
         */
        void insertTaskEvent(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum taskEvent);
        
        /**
         * Appends the value as the last "taskEvent" element
         */
        void addTaskEvent(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum taskEvent);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "taskEvent" element
         */
        org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType insertNewTaskEvent(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "taskEvent" element
         */
        org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType addNewTaskEvent();
        
        /**
         * Removes the ith "taskEvent" element
         */
        void removeTaskEvent(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument.GetTaskHistoryResponse newInstance() {
              return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument.GetTaskHistoryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument.GetTaskHistoryResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument.GetTaskHistoryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument newInstance() {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
