/*
 * XML Type:  tSimpleQueryInput
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803;


/**
 * An XML tSimpleQueryInput(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public interface TSimpleQueryInput extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TSimpleQueryInput.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B376691F9828D2A29ED491729187FB4").resolveHandle("tsimplequeryinput5b0dtype");
    
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
     * Gets the "createdDate" element
     */
    java.util.Calendar getCreatedDate();
    
    /**
     * Gets (as xml) the "createdDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCreatedDate();
    
    /**
     * True if has "createdDate" element
     */
    boolean isSetCreatedDate();
    
    /**
     * Sets the "createdDate" element
     */
    void setCreatedDate(java.util.Calendar createdDate);
    
    /**
     * Sets (as xml) the "createdDate" element
     */
    void xsetCreatedDate(org.apache.xmlbeans.XmlDateTime createdDate);
    
    /**
     * Unsets the "createdDate" element
     */
    void unsetCreatedDate();
    
    /**
     * Gets the "undatedDate" element
     */
    java.util.Calendar getUndatedDate();
    
    /**
     * Gets (as xml) the "undatedDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetUndatedDate();
    
    /**
     * True if has "undatedDate" element
     */
    boolean isSetUndatedDate();
    
    /**
     * Sets the "undatedDate" element
     */
    void setUndatedDate(java.util.Calendar undatedDate);
    
    /**
     * Sets (as xml) the "undatedDate" element
     */
    void xsetUndatedDate(org.apache.xmlbeans.XmlDateTime undatedDate);
    
    /**
     * Unsets the "undatedDate" element
     */
    void unsetUndatedDate();
    
    /**
     * Gets the "taskName" element
     */
    java.lang.String getTaskName();
    
    /**
     * Gets (as xml) the "taskName" element
     */
    org.apache.xmlbeans.XmlString xgetTaskName();
    
    /**
     * True if has "taskName" element
     */
    boolean isSetTaskName();
    
    /**
     * Sets the "taskName" element
     */
    void setTaskName(java.lang.String taskName);
    
    /**
     * Sets (as xml) the "taskName" element
     */
    void xsetTaskName(org.apache.xmlbeans.XmlString taskName);
    
    /**
     * Unsets the "taskName" element
     */
    void unsetTaskName();
    
    /**
     * Gets the "pageSize" element
     */
    int getPageSize();
    
    /**
     * Gets (as xml) the "pageSize" element
     */
    org.apache.xmlbeans.XmlInt xgetPageSize();
    
    /**
     * True if has "pageSize" element
     */
    boolean isSetPageSize();
    
    /**
     * Sets the "pageSize" element
     */
    void setPageSize(int pageSize);
    
    /**
     * Sets (as xml) the "pageSize" element
     */
    void xsetPageSize(org.apache.xmlbeans.XmlInt pageSize);
    
    /**
     * Unsets the "pageSize" element
     */
    void unsetPageSize();
    
    /**
     * Gets the "pageNumber" element
     */
    int getPageNumber();
    
    /**
     * Gets (as xml) the "pageNumber" element
     */
    org.apache.xmlbeans.XmlInt xgetPageNumber();
    
    /**
     * True if has "pageNumber" element
     */
    boolean isSetPageNumber();
    
    /**
     * Sets the "pageNumber" element
     */
    void setPageNumber(int pageNumber);
    
    /**
     * Sets (as xml) the "pageNumber" element
     */
    void xsetPageNumber(org.apache.xmlbeans.XmlInt pageNumber);
    
    /**
     * Unsets the "pageNumber" element
     */
    void unsetPageNumber();
    
    /**
     * Gets the "simpleQueryCategory" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryCategory.Enum getSimpleQueryCategory();
    
    /**
     * Gets (as xml) the "simpleQueryCategory" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryCategory xgetSimpleQueryCategory();
    
    /**
     * True if has "simpleQueryCategory" element
     */
    boolean isSetSimpleQueryCategory();
    
    /**
     * Sets the "simpleQueryCategory" element
     */
    void setSimpleQueryCategory(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryCategory.Enum simpleQueryCategory);
    
    /**
     * Sets (as xml) the "simpleQueryCategory" element
     */
    void xsetSimpleQueryCategory(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryCategory simpleQueryCategory);
    
    /**
     * Unsets the "simpleQueryCategory" element
     */
    void unsetSimpleQueryCategory();
    
    /**
     * Gets the "queryOrder" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrder.Enum getQueryOrder();
    
    /**
     * Gets (as xml) the "queryOrder" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrder xgetQueryOrder();
    
    /**
     * True if has "queryOrder" element
     */
    boolean isSetQueryOrder();
    
    /**
     * Sets the "queryOrder" element
     */
    void setQueryOrder(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrder.Enum queryOrder);
    
    /**
     * Sets (as xml) the "queryOrder" element
     */
    void xsetQueryOrder(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrder queryOrder);
    
    /**
     * Unsets the "queryOrder" element
     */
    void unsetQueryOrder();
    
    /**
     * Gets the "queryOrderBy" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrderBy.Enum getQueryOrderBy();
    
    /**
     * Gets (as xml) the "queryOrderBy" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrderBy xgetQueryOrderBy();
    
    /**
     * True if has "queryOrderBy" element
     */
    boolean isSetQueryOrderBy();
    
    /**
     * Sets the "queryOrderBy" element
     */
    void setQueryOrderBy(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrderBy.Enum queryOrderBy);
    
    /**
     * Sets (as xml) the "queryOrderBy" element
     */
    void xsetQueryOrderBy(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryOrderBy queryOrderBy);
    
    /**
     * Unsets the "queryOrderBy" element
     */
    void unsetQueryOrderBy();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput newInstance() {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
