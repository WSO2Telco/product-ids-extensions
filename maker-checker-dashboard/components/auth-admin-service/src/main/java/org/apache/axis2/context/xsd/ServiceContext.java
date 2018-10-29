/**
 * ServiceContext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:38 BST)
 */
package org.apache.axis2.context.xsd;


/**
 *  ServiceContext bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ServiceContext implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = ServiceContext
       Namespace URI = http://context.axis2.apache.org/xsd
       Namespace Prefix = ns26
     */

    /**
     * field for AxisService
     */
    protected org.apache.axis2.description.xsd.AxisService localAxisService;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAxisServiceTracker = false;

    /**
     * field for CachingOperationContext
     */
    protected boolean localCachingOperationContext;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCachingOperationContextTracker = false;

    /**
     * field for ConfigurationContext
     */
    protected org.apache.axis2.context.xsd.ConfigurationContext localConfigurationContext;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localConfigurationContextTracker = false;

    /**
     * field for GroupName
     */
    protected java.lang.String localGroupName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGroupNameTracker = false;

    /**
     * field for LastOperationContext
     */
    protected org.apache.axis2.context.xsd.OperationContext localLastOperationContext;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLastOperationContextTracker = false;

    /**
     * field for LogCorrelationIDString
     */
    protected java.lang.String localLogCorrelationIDString;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLogCorrelationIDStringTracker = false;

    /**
     * field for MyEPR
     */
    protected org.apache.axis2.addressing.xsd.EndpointReference localMyEPR;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMyEPRTracker = false;

    /**
     * field for Name
     */
    protected java.lang.String localName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNameTracker = false;

    /**
     * field for RootContext
     */
    protected org.apache.axis2.context.xsd.ConfigurationContext localRootContext;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRootContextTracker = false;

    /**
     * field for ServiceGroupContext
     */
    protected org.apache.axis2.context.xsd.ServiceGroupContext localServiceGroupContext;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localServiceGroupContextTracker = false;

    /**
     * field for TargetEPR
     */
    protected org.apache.axis2.addressing.xsd.EndpointReference localTargetEPR;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTargetEPRTracker = false;

    public boolean isAxisServiceSpecified() {
        return localAxisServiceTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.description.xsd.AxisService
     */
    public org.apache.axis2.description.xsd.AxisService getAxisService() {
        return localAxisService;
    }

    /**
     * Auto generated setter method
     * @param param AxisService
     */
    public void setAxisService(
        org.apache.axis2.description.xsd.AxisService param) {
        localAxisServiceTracker = true;

        this.localAxisService = param;
    }

    public boolean isCachingOperationContextSpecified() {
        return localCachingOperationContextTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getCachingOperationContext() {
        return localCachingOperationContext;
    }

    /**
     * Auto generated setter method
     * @param param CachingOperationContext
     */
    public void setCachingOperationContext(boolean param) {
        // setting primitive attribute tracker to true
        localCachingOperationContextTracker = true;

        this.localCachingOperationContext = param;
    }

    public boolean isConfigurationContextSpecified() {
        return localConfigurationContextTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.context.xsd.ConfigurationContext
     */
    public org.apache.axis2.context.xsd.ConfigurationContext getConfigurationContext() {
        return localConfigurationContext;
    }

    /**
     * Auto generated setter method
     * @param param ConfigurationContext
     */
    public void setConfigurationContext(
        org.apache.axis2.context.xsd.ConfigurationContext param) {
        localConfigurationContextTracker = true;

        this.localConfigurationContext = param;
    }

    public boolean isGroupNameSpecified() {
        return localGroupNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getGroupName() {
        return localGroupName;
    }

    /**
     * Auto generated setter method
     * @param param GroupName
     */
    public void setGroupName(java.lang.String param) {
        localGroupNameTracker = true;

        this.localGroupName = param;
    }

    public boolean isLastOperationContextSpecified() {
        return localLastOperationContextTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.context.xsd.OperationContext
     */
    public org.apache.axis2.context.xsd.OperationContext getLastOperationContext() {
        return localLastOperationContext;
    }

    /**
     * Auto generated setter method
     * @param param LastOperationContext
     */
    public void setLastOperationContext(
        org.apache.axis2.context.xsd.OperationContext param) {
        localLastOperationContextTracker = true;

        this.localLastOperationContext = param;
    }

    public boolean isLogCorrelationIDStringSpecified() {
        return localLogCorrelationIDStringTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getLogCorrelationIDString() {
        return localLogCorrelationIDString;
    }

    /**
     * Auto generated setter method
     * @param param LogCorrelationIDString
     */
    public void setLogCorrelationIDString(java.lang.String param) {
        localLogCorrelationIDStringTracker = true;

        this.localLogCorrelationIDString = param;
    }

    public boolean isMyEPRSpecified() {
        return localMyEPRTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.addressing.xsd.EndpointReference
     */
    public org.apache.axis2.addressing.xsd.EndpointReference getMyEPR() {
        return localMyEPR;
    }

    /**
     * Auto generated setter method
     * @param param MyEPR
     */
    public void setMyEPR(
        org.apache.axis2.addressing.xsd.EndpointReference param) {
        localMyEPRTracker = true;

        this.localMyEPR = param;
    }

    public boolean isNameSpecified() {
        return localNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getName() {
        return localName;
    }

    /**
     * Auto generated setter method
     * @param param Name
     */
    public void setName(java.lang.String param) {
        localNameTracker = true;

        this.localName = param;
    }

    public boolean isRootContextSpecified() {
        return localRootContextTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.context.xsd.ConfigurationContext
     */
    public org.apache.axis2.context.xsd.ConfigurationContext getRootContext() {
        return localRootContext;
    }

    /**
     * Auto generated setter method
     * @param param RootContext
     */
    public void setRootContext(
        org.apache.axis2.context.xsd.ConfigurationContext param) {
        localRootContextTracker = true;

        this.localRootContext = param;
    }

    public boolean isServiceGroupContextSpecified() {
        return localServiceGroupContextTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.context.xsd.ServiceGroupContext
     */
    public org.apache.axis2.context.xsd.ServiceGroupContext getServiceGroupContext() {
        return localServiceGroupContext;
    }

    /**
     * Auto generated setter method
     * @param param ServiceGroupContext
     */
    public void setServiceGroupContext(
        org.apache.axis2.context.xsd.ServiceGroupContext param) {
        localServiceGroupContextTracker = true;

        this.localServiceGroupContext = param;
    }

    public boolean isTargetEPRSpecified() {
        return localTargetEPRTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.addressing.xsd.EndpointReference
     */
    public org.apache.axis2.addressing.xsd.EndpointReference getTargetEPR() {
        return localTargetEPR;
    }

    /**
     * Auto generated setter method
     * @param param TargetEPR
     */
    public void setTargetEPR(
        org.apache.axis2.addressing.xsd.EndpointReference param) {
        localTargetEPRTracker = true;

        this.localTargetEPR = param;
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName,
        final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, parentQName));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
            xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://context.axis2.apache.org/xsd");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":ServiceContext", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "ServiceContext", xmlWriter);
            }
        }

        if (localAxisServiceTracker) {
            if (localAxisService == null) {
                writeStartElement(null, "http://context.axis2.apache.org/xsd",
                    "axisService", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localAxisService.serialize(new javax.xml.namespace.QName(
                        "http://context.axis2.apache.org/xsd", "axisService"),
                    xmlWriter);
            }
        }

        if (localCachingOperationContextTracker) {
            namespace = "http://context.axis2.apache.org/xsd";
            writeStartElement(null, namespace, "cachingOperationContext",
                xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "cachingOperationContext cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localCachingOperationContext));
            }

            xmlWriter.writeEndElement();
        }

        if (localConfigurationContextTracker) {
            if (localConfigurationContext == null) {
                writeStartElement(null, "http://context.axis2.apache.org/xsd",
                    "configurationContext", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localConfigurationContext.serialize(new javax.xml.namespace.QName(
                        "http://context.axis2.apache.org/xsd",
                        "configurationContext"), xmlWriter);
            }
        }

        if (localGroupNameTracker) {
            namespace = "http://context.axis2.apache.org/xsd";
            writeStartElement(null, namespace, "groupName", xmlWriter);

            if (localGroupName == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localGroupName);
            }

            xmlWriter.writeEndElement();
        }

        if (localLastOperationContextTracker) {
            if (localLastOperationContext == null) {
                writeStartElement(null, "http://context.axis2.apache.org/xsd",
                    "lastOperationContext", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localLastOperationContext.serialize(new javax.xml.namespace.QName(
                        "http://context.axis2.apache.org/xsd",
                        "lastOperationContext"), xmlWriter);
            }
        }

        if (localLogCorrelationIDStringTracker) {
            namespace = "http://context.axis2.apache.org/xsd";
            writeStartElement(null, namespace, "logCorrelationIDString",
                xmlWriter);

            if (localLogCorrelationIDString == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localLogCorrelationIDString);
            }

            xmlWriter.writeEndElement();
        }

        if (localMyEPRTracker) {
            if (localMyEPR == null) {
                writeStartElement(null, "http://context.axis2.apache.org/xsd",
                    "myEPR", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localMyEPR.serialize(new javax.xml.namespace.QName(
                        "http://context.axis2.apache.org/xsd", "myEPR"),
                    xmlWriter);
            }
        }

        if (localNameTracker) {
            namespace = "http://context.axis2.apache.org/xsd";
            writeStartElement(null, namespace, "name", xmlWriter);

            if (localName == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localName);
            }

            xmlWriter.writeEndElement();
        }

        if (localRootContextTracker) {
            if (localRootContext == null) {
                writeStartElement(null, "http://context.axis2.apache.org/xsd",
                    "rootContext", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localRootContext.serialize(new javax.xml.namespace.QName(
                        "http://context.axis2.apache.org/xsd", "rootContext"),
                    xmlWriter);
            }
        }

        if (localServiceGroupContextTracker) {
            if (localServiceGroupContext == null) {
                writeStartElement(null, "http://context.axis2.apache.org/xsd",
                    "serviceGroupContext", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localServiceGroupContext.serialize(new javax.xml.namespace.QName(
                        "http://context.axis2.apache.org/xsd",
                        "serviceGroupContext"), xmlWriter);
            }
        }

        if (localTargetEPRTracker) {
            if (localTargetEPR == null) {
                writeStartElement(null, "http://context.axis2.apache.org/xsd",
                    "targetEPR", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localTargetEPR.serialize(new javax.xml.namespace.QName(
                        "http://context.axis2.apache.org/xsd", "targetEPR"),
                    xmlWriter);
            }
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://context.axis2.apache.org/xsd")) {
            return "ns26";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
        java.lang.String namespace, java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
        java.lang.String namespace, java.lang.String attName,
        java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
        java.lang.String attName, java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
        java.lang.String attName, javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static ServiceContext parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            ServiceContext object = new ServiceContext();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                    ":") + 1);

                        if (!"ServiceContext".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (ServiceContext) org.apache.axis2.transaction.xsd.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://context.axis2.apache.org/xsd", "axisService").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setAxisService(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setAxisService(org.apache.axis2.description.xsd.AxisService.Factory.parse(
                                reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://context.axis2.apache.org/xsd",
                            "cachingOperationContext").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "cachingOperationContext" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCachingOperationContext(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://context.axis2.apache.org/xsd",
                            "configurationContext").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setConfigurationContext(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setConfigurationContext(org.apache.axis2.context.xsd.ConfigurationContext.Factory.parse(
                                reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://context.axis2.apache.org/xsd", "groupName").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setGroupName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://context.axis2.apache.org/xsd",
                            "lastOperationContext").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setLastOperationContext(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setLastOperationContext(org.apache.axis2.context.xsd.OperationContext.Factory.parse(
                                reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://context.axis2.apache.org/xsd",
                            "logCorrelationIDString").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setLogCorrelationIDString(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://context.axis2.apache.org/xsd", "myEPR").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setMyEPR(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setMyEPR(org.apache.axis2.addressing.xsd.EndpointReference.Factory.parse(
                                reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://context.axis2.apache.org/xsd", "name").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://context.axis2.apache.org/xsd", "rootContext").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setRootContext(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setRootContext(org.apache.axis2.context.xsd.ConfigurationContext.Factory.parse(
                                reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://context.axis2.apache.org/xsd",
                            "serviceGroupContext").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setServiceGroupContext(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setServiceGroupContext(org.apache.axis2.context.xsd.ServiceGroupContext.Factory.parse(
                                reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://context.axis2.apache.org/xsd", "targetEPR").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setTargetEPR(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setTargetEPR(org.apache.axis2.addressing.xsd.EndpointReference.Factory.parse(
                                reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()) {
                    // 2 - A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
