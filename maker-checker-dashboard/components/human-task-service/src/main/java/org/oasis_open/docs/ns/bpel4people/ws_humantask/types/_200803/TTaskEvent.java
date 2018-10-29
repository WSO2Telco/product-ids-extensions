/*
 * XML Type:  tTaskEvent
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803;


/**
 * An XML tTaskEvent(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public interface TTaskEvent extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TTaskEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B376691F9828D2A29ED491729187FB4").resolveHandle("ttaskeventf638type");
    
    /**
     * Gets the "eventId" element
     */
    java.lang.String getEventId();
    
    /**
     * Gets (as xml) the "eventId" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetEventId();
    
    /**
     * Sets the "eventId" element
     */
    void setEventId(java.lang.String eventId);
    
    /**
     * Sets (as xml) the "eventId" element
     */
    void xsetEventId(org.apache.xmlbeans.XmlAnyURI eventId);
    
    /**
     * Gets the "eventType" element
     */
    java.lang.String getEventType();
    
    /**
     * Gets (as xml) the "eventType" element
     */
    org.apache.xmlbeans.XmlString xgetEventType();
    
    /**
     * Sets the "eventType" element
     */
    void setEventType(java.lang.String eventType);
    
    /**
     * Sets (as xml) the "eventType" element
     */
    void xsetEventType(org.apache.xmlbeans.XmlString eventType);
    
    /**
     * Gets the "eventInitiator" element
     */
    java.lang.String getEventInitiator();
    
    /**
     * Gets (as xml) the "eventInitiator" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser xgetEventInitiator();
    
    /**
     * Sets the "eventInitiator" element
     */
    void setEventInitiator(java.lang.String eventInitiator);
    
    /**
     * Sets (as xml) the "eventInitiator" element
     */
    void xsetEventInitiator(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser eventInitiator);
    
    /**
     * Gets the "oldState" element
     */
    java.lang.String getOldState();
    
    /**
     * Gets (as xml) the "oldState" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus xgetOldState();
    
    /**
     * True if has "oldState" element
     */
    boolean isSetOldState();
    
    /**
     * Sets the "oldState" element
     */
    void setOldState(java.lang.String oldState);
    
    /**
     * Sets (as xml) the "oldState" element
     */
    void xsetOldState(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus oldState);
    
    /**
     * Unsets the "oldState" element
     */
    void unsetOldState();
    
    /**
     * Gets the "newState" element
     */
    java.lang.String getNewState();
    
    /**
     * Gets (as xml) the "newState" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus xgetNewState();
    
    /**
     * True if has "newState" element
     */
    boolean isSetNewState();
    
    /**
     * Sets the "newState" element
     */
    void setNewState(java.lang.String newState);
    
    /**
     * Sets (as xml) the "newState" element
     */
    void xsetNewState(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus newState);
    
    /**
     * Unsets the "newState" element
     */
    void unsetNewState();
    
    /**
     * Gets the "eventDetail" element
     */
    java.lang.String getEventDetail();
    
    /**
     * Gets (as xml) the "eventDetail" element
     */
    org.apache.xmlbeans.XmlString xgetEventDetail();
    
    /**
     * True if has "eventDetail" element
     */
    boolean isSetEventDetail();
    
    /**
     * Sets the "eventDetail" element
     */
    void setEventDetail(java.lang.String eventDetail);
    
    /**
     * Sets (as xml) the "eventDetail" element
     */
    void xsetEventDetail(org.apache.xmlbeans.XmlString eventDetail);
    
    /**
     * Unsets the "eventDetail" element
     */
    void unsetEventDetail();
    
    /**
     * Gets the "eventTime" element
     */
    java.util.Calendar getEventTime();
    
    /**
     * Gets (as xml) the "eventTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEventTime();
    
    /**
     * Sets the "eventTime" element
     */
    void setEventTime(java.util.Calendar eventTime);
    
    /**
     * Sets (as xml) the "eventTime" element
     */
    void xsetEventTime(org.apache.xmlbeans.XmlDateTime eventTime);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent newInstance() {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
