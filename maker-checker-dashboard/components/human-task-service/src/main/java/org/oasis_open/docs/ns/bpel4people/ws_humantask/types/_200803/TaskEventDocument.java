/*
 * An XML document type.
 * Localname: taskEvent
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803;


/**
 * A document containing one taskEvent(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public interface TaskEventDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TaskEventDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B376691F9828D2A29ED491729187FB4").resolveHandle("taskeventffcadoctype");
    
    /**
     * Gets the "taskEvent" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument.TaskEvent getTaskEvent();
    
    /**
     * Sets the "taskEvent" element
     */
    void setTaskEvent(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument.TaskEvent taskEvent);
    
    /**
     * Appends and returns a new empty "taskEvent" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument.TaskEvent addNewTaskEvent();
    
    /**
     * An XML taskEvent(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
     *
     * This is a complex type.
     */
    public interface TaskEvent extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TaskEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B376691F9828D2A29ED491729187FB4").resolveHandle("taskevent704belemtype");
        
        /**
         * Gets the "id" element
         */
        java.math.BigInteger getId();
        
        /**
         * Gets (as xml) the "id" element
         */
        org.apache.xmlbeans.XmlInteger xgetId();
        
        /**
         * Sets the "id" element
         */
        void setId(java.math.BigInteger id);
        
        /**
         * Sets (as xml) the "id" element
         */
        void xsetId(org.apache.xmlbeans.XmlInteger id);
        
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
         * Gets the "principal" element
         */
        java.lang.String getPrincipal();
        
        /**
         * Gets (as xml) the "principal" element
         */
        org.apache.xmlbeans.XmlString xgetPrincipal();
        
        /**
         * Tests for nil "principal" element
         */
        boolean isNilPrincipal();
        
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
         * Nils the "principal" element
         */
        void setNilPrincipal();
        
        /**
         * Unsets the "principal" element
         */
        void unsetPrincipal();
        
        /**
         * Gets the "eventType" element
         */
        org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum getEventType();
        
        /**
         * Gets (as xml) the "eventType" element
         */
        org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType xgetEventType();
        
        /**
         * Sets the "eventType" element
         */
        void setEventType(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.Enum eventType);
        
        /**
         * Sets (as xml) the "eventType" element
         */
        void xsetEventType(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType eventType);
        
        /**
         * Gets the "startOwner" element
         */
        java.lang.String getStartOwner();
        
        /**
         * Gets (as xml) the "startOwner" element
         */
        org.apache.xmlbeans.XmlString xgetStartOwner();
        
        /**
         * Tests for nil "startOwner" element
         */
        boolean isNilStartOwner();
        
        /**
         * True if has "startOwner" element
         */
        boolean isSetStartOwner();
        
        /**
         * Sets the "startOwner" element
         */
        void setStartOwner(java.lang.String startOwner);
        
        /**
         * Sets (as xml) the "startOwner" element
         */
        void xsetStartOwner(org.apache.xmlbeans.XmlString startOwner);
        
        /**
         * Nils the "startOwner" element
         */
        void setNilStartOwner();
        
        /**
         * Unsets the "startOwner" element
         */
        void unsetStartOwner();
        
        /**
         * Gets the "endOwner" element
         */
        java.lang.String getEndOwner();
        
        /**
         * Gets (as xml) the "endOwner" element
         */
        org.apache.xmlbeans.XmlString xgetEndOwner();
        
        /**
         * Tests for nil "endOwner" element
         */
        boolean isNilEndOwner();
        
        /**
         * True if has "endOwner" element
         */
        boolean isSetEndOwner();
        
        /**
         * Sets the "endOwner" element
         */
        void setEndOwner(java.lang.String endOwner);
        
        /**
         * Sets (as xml) the "endOwner" element
         */
        void xsetEndOwner(org.apache.xmlbeans.XmlString endOwner);
        
        /**
         * Nils the "endOwner" element
         */
        void setNilEndOwner();
        
        /**
         * Unsets the "endOwner" element
         */
        void unsetEndOwner();
        
        /**
         * Gets the "status" element
         */
        java.lang.String getStatus();
        
        /**
         * Gets (as xml) the "status" element
         */
        org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus xgetStatus();
        
        /**
         * Sets the "status" element
         */
        void setStatus(java.lang.String status);
        
        /**
         * Sets (as xml) the "status" element
         */
        void xsetStatus(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus status);
        
        /**
         * Gets the "hasData" element
         */
        boolean getHasData();
        
        /**
         * Gets (as xml) the "hasData" element
         */
        org.apache.xmlbeans.XmlBoolean xgetHasData();
        
        /**
         * True if has "hasData" element
         */
        boolean isSetHasData();
        
        /**
         * Sets the "hasData" element
         */
        void setHasData(boolean hasData);
        
        /**
         * Sets (as xml) the "hasData" element
         */
        void xsetHasData(org.apache.xmlbeans.XmlBoolean hasData);
        
        /**
         * Unsets the "hasData" element
         */
        void unsetHasData();
        
        /**
         * Gets the "eventData" element
         */
        org.apache.xmlbeans.XmlObject getEventData();
        
        /**
         * Tests for nil "eventData" element
         */
        boolean isNilEventData();
        
        /**
         * True if has "eventData" element
         */
        boolean isSetEventData();
        
        /**
         * Sets the "eventData" element
         */
        void setEventData(org.apache.xmlbeans.XmlObject eventData);
        
        /**
         * Appends and returns a new empty "eventData" element
         */
        org.apache.xmlbeans.XmlObject addNewEventData();
        
        /**
         * Nils the "eventData" element
         */
        void setNilEventData();
        
        /**
         * Unsets the "eventData" element
         */
        void unsetEventData();
        
        /**
         * Gets the "faultName" element
         */
        java.lang.String getFaultName();
        
        /**
         * Gets (as xml) the "faultName" element
         */
        org.apache.xmlbeans.XmlString xgetFaultName();
        
        /**
         * Tests for nil "faultName" element
         */
        boolean isNilFaultName();
        
        /**
         * True if has "faultName" element
         */
        boolean isSetFaultName();
        
        /**
         * Sets the "faultName" element
         */
        void setFaultName(java.lang.String faultName);
        
        /**
         * Sets (as xml) the "faultName" element
         */
        void xsetFaultName(org.apache.xmlbeans.XmlString faultName);
        
        /**
         * Nils the "faultName" element
         */
        void setNilFaultName();
        
        /**
         * Unsets the "faultName" element
         */
        void unsetFaultName();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument.TaskEvent newInstance() {
              return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument.TaskEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument.TaskEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument.TaskEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument newInstance() {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TaskEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
