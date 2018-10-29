/*
 * XML Type:  tTaskInstanceData
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803;


/**
 * An XML tTaskInstanceData(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public interface TTaskInstanceData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TTaskInstanceData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B376691F9828D2A29ED491729187FB4").resolveHandle("ttaskinstancedata5fddtype");
    
    /**
     * Gets the "taskDetails" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails getTaskDetails();
    
    /**
     * Sets the "taskDetails" element
     */
    void setTaskDetails(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails taskDetails);
    
    /**
     * Appends and returns a new empty "taskDetails" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails addNewTaskDetails();
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Gets the "input" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData getInput();
    
    /**
     * Sets the "input" element
     */
    void setInput(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData input);
    
    /**
     * Appends and returns a new empty "input" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData addNewInput();
    
    /**
     * Gets the "output" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData getOutput();
    
    /**
     * Tests for nil "output" element
     */
    boolean isNilOutput();
    
    /**
     * Sets the "output" element
     */
    void setOutput(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData output);
    
    /**
     * Appends and returns a new empty "output" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TMessagePartsData addNewOutput();
    
    /**
     * Nils the "output" element
     */
    void setNilOutput();
    
    /**
     * Gets the "fault" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFaultData getFault();
    
    /**
     * Tests for nil "fault" element
     */
    boolean isNilFault();
    
    /**
     * True if has "fault" element
     */
    boolean isSetFault();
    
    /**
     * Sets the "fault" element
     */
    void setFault(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFaultData fault);
    
    /**
     * Appends and returns a new empty "fault" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFaultData addNewFault();
    
    /**
     * Nils the "fault" element
     */
    void setNilFault();
    
    /**
     * Unsets the "fault" element
     */
    void unsetFault();
    
    /**
     * Gets the "renderings" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingsDocument.Renderings getRenderings();
    
    /**
     * True if has "renderings" element
     */
    boolean isSetRenderings();
    
    /**
     * Sets the "renderings" element
     */
    void setRenderings(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingsDocument.Renderings renderings);
    
    /**
     * Appends and returns a new empty "renderings" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingsDocument.Renderings addNewRenderings();
    
    /**
     * Unsets the "renderings" element
     */
    void unsetRenderings();
    
    /**
     * Gets the "comments" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComments getComments();
    
    /**
     * True if has "comments" element
     */
    boolean isSetComments();
    
    /**
     * Sets the "comments" element
     */
    void setComments(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComments comments);
    
    /**
     * Appends and returns a new empty "comments" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComments addNewComments();
    
    /**
     * Unsets the "comments" element
     */
    void unsetComments();
    
    /**
     * Gets the "attachmentInfos" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfos getAttachmentInfos();
    
    /**
     * True if has "attachmentInfos" element
     */
    boolean isSetAttachmentInfos();
    
    /**
     * Sets the "attachmentInfos" element
     */
    void setAttachmentInfos(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfos attachmentInfos);
    
    /**
     * Appends and returns a new empty "attachmentInfos" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfos addNewAttachmentInfos();
    
    /**
     * Unsets the "attachmentInfos" element
     */
    void unsetAttachmentInfos();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData newInstance() {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
