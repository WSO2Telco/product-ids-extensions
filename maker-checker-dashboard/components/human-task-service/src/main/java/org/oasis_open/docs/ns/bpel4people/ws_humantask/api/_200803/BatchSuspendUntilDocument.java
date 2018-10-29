/*
 * An XML document type.
 * Localname: batchSuspendUntil
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;


/**
 * A document containing one batchSuspendUntil(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public interface BatchSuspendUntilDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BatchSuspendUntilDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B376691F9828D2A29ED491729187FB4").resolveHandle("batchsuspenduntil41d0doctype");
    
    /**
     * Gets the "batchSuspendUntil" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument.BatchSuspendUntil getBatchSuspendUntil();
    
    /**
     * Sets the "batchSuspendUntil" element
     */
    void setBatchSuspendUntil(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument.BatchSuspendUntil batchSuspendUntil);
    
    /**
     * Appends and returns a new empty "batchSuspendUntil" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument.BatchSuspendUntil addNewBatchSuspendUntil();
    
    /**
     * An XML batchSuspendUntil(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public interface BatchSuspendUntil extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BatchSuspendUntil.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B376691F9828D2A29ED491729187FB4").resolveHandle("batchsuspenduntilef18elemtype");
        
        /**
         * Gets array of all "identifier" elements
         */
        java.lang.String[] getIdentifierArray();
        
        /**
         * Gets ith "identifier" element
         */
        java.lang.String getIdentifierArray(int i);
        
        /**
         * Gets (as xml) array of all "identifier" elements
         */
        org.apache.xmlbeans.XmlAnyURI[] xgetIdentifierArray();
        
        /**
         * Gets (as xml) ith "identifier" element
         */
        org.apache.xmlbeans.XmlAnyURI xgetIdentifierArray(int i);
        
        /**
         * Returns number of "identifier" element
         */
        int sizeOfIdentifierArray();
        
        /**
         * Sets array of all "identifier" element
         */
        void setIdentifierArray(java.lang.String[] identifierArray);
        
        /**
         * Sets ith "identifier" element
         */
        void setIdentifierArray(int i, java.lang.String identifier);
        
        /**
         * Sets (as xml) array of all "identifier" element
         */
        void xsetIdentifierArray(org.apache.xmlbeans.XmlAnyURI[] identifierArray);
        
        /**
         * Sets (as xml) ith "identifier" element
         */
        void xsetIdentifierArray(int i, org.apache.xmlbeans.XmlAnyURI identifier);
        
        /**
         * Inserts the value as the ith "identifier" element
         */
        void insertIdentifier(int i, java.lang.String identifier);
        
        /**
         * Appends the value as the last "identifier" element
         */
        void addIdentifier(java.lang.String identifier);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "identifier" element
         */
        org.apache.xmlbeans.XmlAnyURI insertNewIdentifier(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "identifier" element
         */
        org.apache.xmlbeans.XmlAnyURI addNewIdentifier();
        
        /**
         * Removes the ith "identifier" element
         */
        void removeIdentifier(int i);
        
        /**
         * Gets the "time" element
         */
        org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTime getTime();
        
        /**
         * Sets the "time" element
         */
        void setTime(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTime time);
        
        /**
         * Appends and returns a new empty "time" element
         */
        org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTime addNewTime();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument.BatchSuspendUntil newInstance() {
              return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument.BatchSuspendUntil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument.BatchSuspendUntil newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument.BatchSuspendUntil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument newInstance() {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
