/*
 * XML Type:  tTaskHistoryFilter
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803;


/**
 * An XML tTaskHistoryFilter(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public interface TTaskHistoryFilter extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TTaskHistoryFilter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B376691F9828D2A29ED491729187FB4").resolveHandle("ttaskhistoryfiltera7catype");
    
    /**
     * Gets the "eventId" element
     */
    java.math.BigInteger getEventId();
    
    /**
     * Gets (as xml) the "eventId" element
     */
    org.apache.xmlbeans.XmlInteger xgetEventId();
    
    /**
     * True if has "eventId" element
     */
    boolean isSetEventId();
    
    /**
     * Sets the "eventId" element
     */
    void setEventId(java.math.BigInteger eventId);
    
    /**
     * Sets (as xml) the "eventId" element
     */
    void xsetEventId(org.apache.xmlbeans.XmlInteger eventId);
    
    /**
     * Unsets the "eventId" element
     */
    void unsetEventId();
    
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
     * Gets array of all "eventType" elements
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum[] getEventTypeArray();
    
    /**
     * Gets ith "eventType" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum getEventTypeArray(int i);
    
    /**
     * Gets (as xml) array of all "eventType" elements
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType[] xgetEventTypeArray();
    
    /**
     * Gets (as xml) ith "eventType" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType xgetEventTypeArray(int i);
    
    /**
     * Returns number of "eventType" element
     */
    int sizeOfEventTypeArray();
    
    /**
     * Sets array of all "eventType" element
     */
    void setEventTypeArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum[] eventTypeArray);
    
    /**
     * Sets ith "eventType" element
     */
    void setEventTypeArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum eventType);
    
    /**
     * Sets (as xml) array of all "eventType" element
     */
    void xsetEventTypeArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType[] eventTypeArray);
    
    /**
     * Sets (as xml) ith "eventType" element
     */
    void xsetEventTypeArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType eventType);
    
    /**
     * Inserts the value as the ith "eventType" element
     */
    void insertEventType(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum eventType);
    
    /**
     * Appends the value as the last "eventType" element
     */
    void addEventType(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum eventType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventType" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType insertNewEventType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventType" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType addNewEventType();
    
    /**
     * Removes the ith "eventType" element
     */
    void removeEventType(int i);
    
    /**
     * Gets the "principal" element
     */
    java.lang.String getPrincipal();
    
    /**
     * Gets (as xml) the "principal" element
     */
    org.apache.xmlbeans.XmlString xgetPrincipal();
    
    /**
     * True if has "principal" element
     */
    boolean isSetPrincipal();
    
    /**
     * Sets the "principal" element
     */
    void setPrincipal(java.lang.String principal);
    
    /**
     * Sets (as xml) the "principal" element
     */
    void xsetPrincipal(org.apache.xmlbeans.XmlString principal);
    
    /**
     * Unsets the "principal" element
     */
    void unsetPrincipal();
    
    /**
     * Gets the "afterEventTime" element
     */
    java.util.Calendar getAfterEventTime();
    
    /**
     * Gets (as xml) the "afterEventTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetAfterEventTime();
    
    /**
     * True if has "afterEventTime" element
     */
    boolean isSetAfterEventTime();
    
    /**
     * Sets the "afterEventTime" element
     */
    void setAfterEventTime(java.util.Calendar afterEventTime);
    
    /**
     * Sets (as xml) the "afterEventTime" element
     */
    void xsetAfterEventTime(org.apache.xmlbeans.XmlDateTime afterEventTime);
    
    /**
     * Unsets the "afterEventTime" element
     */
    void unsetAfterEventTime();
    
    /**
     * Gets the "beforeEventTime" element
     */
    java.util.Calendar getBeforeEventTime();
    
    /**
     * Gets (as xml) the "beforeEventTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetBeforeEventTime();
    
    /**
     * True if has "beforeEventTime" element
     */
    boolean isSetBeforeEventTime();
    
    /**
     * Sets the "beforeEventTime" element
     */
    void setBeforeEventTime(java.util.Calendar beforeEventTime);
    
    /**
     * Sets (as xml) the "beforeEventTime" element
     */
    void xsetBeforeEventTime(org.apache.xmlbeans.XmlDateTime beforeEventTime);
    
    /**
     * Unsets the "beforeEventTime" element
     */
    void unsetBeforeEventTime();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter newInstance() {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskHistoryFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
