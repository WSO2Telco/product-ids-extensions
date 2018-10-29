/*
 * An XML document type.
 * Localname: setOutput
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;


/**
 * A document containing one setOutput(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public interface SetOutputDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SetOutputDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B376691F9828D2A29ED491729187FB4").resolveHandle("setoutputca37doctype");
    
    /**
     * Gets the "setOutput" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument.SetOutput getSetOutput();
    
    /**
     * Sets the "setOutput" element
     */
    void setSetOutput(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument.SetOutput setOutput);
    
    /**
     * Appends and returns a new empty "setOutput" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument.SetOutput addNewSetOutput();
    
    /**
     * An XML setOutput(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public interface SetOutput extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SetOutput.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B376691F9828D2A29ED491729187FB4").resolveHandle("setoutputf666elemtype");
        
        /**
         * Gets the "identifier" element
         */
        java.lang.String getIdentifier();
        
        /**
         * Gets (as xml) the "identifier" element
         */
        org.apache.xmlbeans.XmlAnyURI xgetIdentifier();
        
        /**
         * Sets the "identifier" element
         */
        void setIdentifier(java.lang.String identifier);
        
        /**
         * Sets (as xml) the "identifier" element
         */
        void xsetIdentifier(org.apache.xmlbeans.XmlAnyURI identifier);
        
        /**
         * Gets the "part" element
         */
        java.lang.String getPart();
        
        /**
         * Gets (as xml) the "part" element
         */
        org.apache.xmlbeans.XmlNCName xgetPart();
        
        /**
         * True if has "part" element
         */
        boolean isSetPart();
        
        /**
         * Sets the "part" element
         */
        void setPart(java.lang.String part);
        
        /**
         * Sets (as xml) the "part" element
         */
        void xsetPart(org.apache.xmlbeans.XmlNCName part);
        
        /**
         * Unsets the "part" element
         */
        void unsetPart();
        
        /**
         * Gets the "taskData" element
         */
        org.apache.xmlbeans.XmlObject getTaskData();
        
        /**
         * Sets the "taskData" element
         */
        void setTaskData(org.apache.xmlbeans.XmlObject taskData);
        
        /**
         * Appends and returns a new empty "taskData" element
         */
        org.apache.xmlbeans.XmlObject addNewTaskData();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument.SetOutput newInstance() {
              return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument.SetOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument.SetOutput newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument.SetOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument newInstance() {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
