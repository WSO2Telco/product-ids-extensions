/*
 * XML Type:  tTaskEventType
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803;


/**
 * An XML tTaskEventType(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is an atomic type that is a restriction of org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.
 */
public interface TTaskEventType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TTaskEventType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B376691F9828D2A29ED491729187FB4").resolveHandle("ttaskeventtypec792type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CREATE = Enum.forString("create");
    static final Enum CLAIM = Enum.forString("claim");
    static final Enum START = Enum.forString("start");
    static final Enum STOP = Enum.forString("stop");
    static final Enum RELEASE = Enum.forString("release");
    static final Enum SUSPEND = Enum.forString("suspend");
    static final Enum SUSPEND_UNTIL = Enum.forString("suspendUntil");
    static final Enum RESUME = Enum.forString("resume");
    static final Enum COMPLETE = Enum.forString("complete");
    static final Enum REMOVE = Enum.forString("remove");
    static final Enum FAIL = Enum.forString("fail");
    static final Enum SET_PRIORITY = Enum.forString("setPriority");
    static final Enum ADD_ATTACHMENT = Enum.forString("addAttachment");
    static final Enum DELETEATTACHMENT = Enum.forString("deleteattachment");
    static final Enum ADD_COMMENT = Enum.forString("addComment");
    static final Enum SKIP = Enum.forString("skip");
    static final Enum FORWARD = Enum.forString("forward");
    static final Enum DELEGATE = Enum.forString("delegate");
    static final Enum SET_OUTPUT = Enum.forString("setOutput");
    static final Enum DELETE_OUTPUT = Enum.forString("deleteOutput");
    static final Enum SET_FAULT = Enum.forString("setFault");
    static final Enum DELETE_FAULT = Enum.forString("deleteFault");
    static final Enum ACTIVATE = Enum.forString("activate");
    static final Enum NOMINATE = Enum.forString("nominate");
    static final Enum SET_GENERIC_HUMAN_ROLE = Enum.forString("setGenericHumanRole");
    static final Enum EXPIRE = Enum.forString("expire");
    static final Enum ESCALATED = Enum.forString("escalated");
    
    static final int INT_CREATE = Enum.INT_CREATE;
    static final int INT_CLAIM = Enum.INT_CLAIM;
    static final int INT_START = Enum.INT_START;
    static final int INT_STOP = Enum.INT_STOP;
    static final int INT_RELEASE = Enum.INT_RELEASE;
    static final int INT_SUSPEND = Enum.INT_SUSPEND;
    static final int INT_SUSPEND_UNTIL = Enum.INT_SUSPEND_UNTIL;
    static final int INT_RESUME = Enum.INT_RESUME;
    static final int INT_COMPLETE = Enum.INT_COMPLETE;
    static final int INT_REMOVE = Enum.INT_REMOVE;
    static final int INT_FAIL = Enum.INT_FAIL;
    static final int INT_SET_PRIORITY = Enum.INT_SET_PRIORITY;
    static final int INT_ADD_ATTACHMENT = Enum.INT_ADD_ATTACHMENT;
    static final int INT_DELETEATTACHMENT = Enum.INT_DELETEATTACHMENT;
    static final int INT_ADD_COMMENT = Enum.INT_ADD_COMMENT;
    static final int INT_SKIP = Enum.INT_SKIP;
    static final int INT_FORWARD = Enum.INT_FORWARD;
    static final int INT_DELEGATE = Enum.INT_DELEGATE;
    static final int INT_SET_OUTPUT = Enum.INT_SET_OUTPUT;
    static final int INT_DELETE_OUTPUT = Enum.INT_DELETE_OUTPUT;
    static final int INT_SET_FAULT = Enum.INT_SET_FAULT;
    static final int INT_DELETE_FAULT = Enum.INT_DELETE_FAULT;
    static final int INT_ACTIVATE = Enum.INT_ACTIVATE;
    static final int INT_NOMINATE = Enum.INT_NOMINATE;
    static final int INT_SET_GENERIC_HUMAN_ROLE = Enum.INT_SET_GENERIC_HUMAN_ROLE;
    static final int INT_EXPIRE = Enum.INT_EXPIRE;
    static final int INT_ESCALATED = Enum.INT_ESCALATED;
    
    /**
     * Enumeration value class for org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CREATE
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_CREATE = 1;
        static final int INT_CLAIM = 2;
        static final int INT_START = 3;
        static final int INT_STOP = 4;
        static final int INT_RELEASE = 5;
        static final int INT_SUSPEND = 6;
        static final int INT_SUSPEND_UNTIL = 7;
        static final int INT_RESUME = 8;
        static final int INT_COMPLETE = 9;
        static final int INT_REMOVE = 10;
        static final int INT_FAIL = 11;
        static final int INT_SET_PRIORITY = 12;
        static final int INT_ADD_ATTACHMENT = 13;
        static final int INT_DELETEATTACHMENT = 14;
        static final int INT_ADD_COMMENT = 15;
        static final int INT_SKIP = 16;
        static final int INT_FORWARD = 17;
        static final int INT_DELEGATE = 18;
        static final int INT_SET_OUTPUT = 19;
        static final int INT_DELETE_OUTPUT = 20;
        static final int INT_SET_FAULT = 21;
        static final int INT_DELETE_FAULT = 22;
        static final int INT_ACTIVATE = 23;
        static final int INT_NOMINATE = 24;
        static final int INT_SET_GENERIC_HUMAN_ROLE = 25;
        static final int INT_EXPIRE = 26;
        static final int INT_ESCALATED = 27;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("create", INT_CREATE),
                new Enum("claim", INT_CLAIM),
                new Enum("start", INT_START),
                new Enum("stop", INT_STOP),
                new Enum("release", INT_RELEASE),
                new Enum("suspend", INT_SUSPEND),
                new Enum("suspendUntil", INT_SUSPEND_UNTIL),
                new Enum("resume", INT_RESUME),
                new Enum("complete", INT_COMPLETE),
                new Enum("remove", INT_REMOVE),
                new Enum("fail", INT_FAIL),
                new Enum("setPriority", INT_SET_PRIORITY),
                new Enum("addAttachment", INT_ADD_ATTACHMENT),
                new Enum("deleteattachment", INT_DELETEATTACHMENT),
                new Enum("addComment", INT_ADD_COMMENT),
                new Enum("skip", INT_SKIP),
                new Enum("forward", INT_FORWARD),
                new Enum("delegate", INT_DELEGATE),
                new Enum("setOutput", INT_SET_OUTPUT),
                new Enum("deleteOutput", INT_DELETE_OUTPUT),
                new Enum("setFault", INT_SET_FAULT),
                new Enum("deleteFault", INT_DELETE_FAULT),
                new Enum("activate", INT_ACTIVATE),
                new Enum("nominate", INT_NOMINATE),
                new Enum("setGenericHumanRole", INT_SET_GENERIC_HUMAN_ROLE),
                new Enum("expire", INT_EXPIRE),
                new Enum("escalated", INT_ESCALATED),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType newValue(java.lang.Object obj) {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType) type.newValue( obj ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType newInstance() {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
