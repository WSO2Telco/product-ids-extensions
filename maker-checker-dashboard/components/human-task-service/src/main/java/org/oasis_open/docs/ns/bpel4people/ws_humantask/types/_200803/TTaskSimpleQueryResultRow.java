/*
 * XML Type:  tTaskSimpleQueryResultRow
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803;


/**
 * An XML tTaskSimpleQueryResultRow(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public interface TTaskSimpleQueryResultRow extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TTaskSimpleQueryResultRow.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B376691F9828D2A29ED491729187FB4").resolveHandle("ttasksimplequeryresultrow74e5type");
    
    /**
     * Gets the "id" element
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetId();
    
    /**
     * Sets the "id" element
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" element
     */
    void xsetId(org.apache.xmlbeans.XmlAnyURI id);
    
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
     * Gets the "name" element
     */
    javax.xml.namespace.QName getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlQName xgetName();
    
    /**
     * Sets the "name" element
     */
    void setName(javax.xml.namespace.QName name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlQName name);
    
    /**
     * Gets the "presentationSubject" element
     */
    java.lang.String getPresentationSubject();
    
    /**
     * Gets (as xml) the "presentationSubject" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject xgetPresentationSubject();
    
    /**
     * True if has "presentationSubject" element
     */
    boolean isSetPresentationSubject();
    
    /**
     * Sets the "presentationSubject" element
     */
    void setPresentationSubject(java.lang.String presentationSubject);
    
    /**
     * Sets (as xml) the "presentationSubject" element
     */
    void xsetPresentationSubject(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationSubject presentationSubject);
    
    /**
     * Unsets the "presentationSubject" element
     */
    void unsetPresentationSubject();
    
    /**
     * Gets the "presentationName" element
     */
    java.lang.String getPresentationName();
    
    /**
     * Gets (as xml) the "presentationName" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName xgetPresentationName();
    
    /**
     * True if has "presentationName" element
     */
    boolean isSetPresentationName();
    
    /**
     * Sets the "presentationName" element
     */
    void setPresentationName(java.lang.String presentationName);
    
    /**
     * Sets (as xml) the "presentationName" element
     */
    void xsetPresentationName(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationName presentationName);
    
    /**
     * Unsets the "presentationName" element
     */
    void unsetPresentationName();
    
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
     * Gets the "priority" element
     */
    int getPriority();
    
    /**
     * Gets (as xml) the "priority" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority xgetPriority();
    
    /**
     * Sets the "priority" element
     */
    void setPriority(int priority);
    
    /**
     * Sets (as xml) the "priority" element
     */
    void xsetPriority(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority priority);
    
    /**
     * Gets the "createdTime" element
     */
    java.util.Calendar getCreatedTime();
    
    /**
     * Gets (as xml) the "createdTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCreatedTime();
    
    /**
     * True if has "createdTime" element
     */
    boolean isSetCreatedTime();
    
    /**
     * Sets the "createdTime" element
     */
    void setCreatedTime(java.util.Calendar createdTime);
    
    /**
     * Sets (as xml) the "createdTime" element
     */
    void xsetCreatedTime(org.apache.xmlbeans.XmlDateTime createdTime);
    
    /**
     * Unsets the "createdTime" element
     */
    void unsetCreatedTime();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow newInstance() {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
