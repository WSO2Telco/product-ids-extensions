/*
 * An XML document type.
 * Localname: getSubtaskIdentifiersResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;


/**
 * A document containing one getSubtaskIdentifiersResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public interface GetSubtaskIdentifiersResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetSubtaskIdentifiersResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B376691F9828D2A29ED491729187FB4").resolveHandle("getsubtaskidentifiersresponse1db0doctype");
    
    /**
     * Gets the "getSubtaskIdentifiersResponse" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument.GetSubtaskIdentifiersResponse getGetSubtaskIdentifiersResponse();
    
    /**
     * Sets the "getSubtaskIdentifiersResponse" element
     */
    void setGetSubtaskIdentifiersResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument.GetSubtaskIdentifiersResponse getSubtaskIdentifiersResponse);
    
    /**
     * Appends and returns a new empty "getSubtaskIdentifiersResponse" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument.GetSubtaskIdentifiersResponse addNewGetSubtaskIdentifiersResponse();
    
    /**
     * An XML getSubtaskIdentifiersResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public interface GetSubtaskIdentifiersResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetSubtaskIdentifiersResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B376691F9828D2A29ED491729187FB4").resolveHandle("getsubtaskidentifiersresponse4158elemtype");
        
        /**
         * Gets array of all "subtaskIdentifier" elements
         */
        java.lang.String[] getSubtaskIdentifierArray();
        
        /**
         * Gets ith "subtaskIdentifier" element
         */
        java.lang.String getSubtaskIdentifierArray(int i);
        
        /**
         * Gets (as xml) array of all "subtaskIdentifier" elements
         */
        org.apache.xmlbeans.XmlAnyURI[] xgetSubtaskIdentifierArray();
        
        /**
         * Gets (as xml) ith "subtaskIdentifier" element
         */
        org.apache.xmlbeans.XmlAnyURI xgetSubtaskIdentifierArray(int i);
        
        /**
         * Returns number of "subtaskIdentifier" element
         */
        int sizeOfSubtaskIdentifierArray();
        
        /**
         * Sets array of all "subtaskIdentifier" element
         */
        void setSubtaskIdentifierArray(java.lang.String[] subtaskIdentifierArray);
        
        /**
         * Sets ith "subtaskIdentifier" element
         */
        void setSubtaskIdentifierArray(int i, java.lang.String subtaskIdentifier);
        
        /**
         * Sets (as xml) array of all "subtaskIdentifier" element
         */
        void xsetSubtaskIdentifierArray(org.apache.xmlbeans.XmlAnyURI[] subtaskIdentifierArray);
        
        /**
         * Sets (as xml) ith "subtaskIdentifier" element
         */
        void xsetSubtaskIdentifierArray(int i, org.apache.xmlbeans.XmlAnyURI subtaskIdentifier);
        
        /**
         * Inserts the value as the ith "subtaskIdentifier" element
         */
        void insertSubtaskIdentifier(int i, java.lang.String subtaskIdentifier);
        
        /**
         * Appends the value as the last "subtaskIdentifier" element
         */
        void addSubtaskIdentifier(java.lang.String subtaskIdentifier);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "subtaskIdentifier" element
         */
        org.apache.xmlbeans.XmlAnyURI insertNewSubtaskIdentifier(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "subtaskIdentifier" element
         */
        org.apache.xmlbeans.XmlAnyURI addNewSubtaskIdentifier();
        
        /**
         * Removes the ith "subtaskIdentifier" element
         */
        void removeSubtaskIdentifier(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument.GetSubtaskIdentifiersResponse newInstance() {
              return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument.GetSubtaskIdentifiersResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument.GetSubtaskIdentifiersResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument.GetSubtaskIdentifiersResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument newInstance() {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
