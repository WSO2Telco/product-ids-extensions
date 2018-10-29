/**
 * AxisServiceGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:38 BST)
 */
package org.apache.axis2.description.xsd;


/**
 *  AxisServiceGroup bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class AxisServiceGroup implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = AxisServiceGroup
       Namespace URI = http://description.axis2.apache.org/xsd
       Namespace Prefix = ns17
     */

    /**
     * field for AxisDescription
     */
    protected org.apache.axis2.engine.xsd.AxisConfiguration localAxisDescription;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAxisDescriptionTracker = false;

    /**
     * field for FoundWebResources
     */
    protected boolean localFoundWebResources;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFoundWebResourcesTracker = false;

    /**
     * field for Key
     */
    protected java.lang.Object localKey;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localKeyTracker = false;

    /**
     * field for ModuleRefs
     */
    protected java.lang.Object localModuleRefs;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localModuleRefsTracker = false;

    /**
     * field for ServiceGroupClassLoader
     */
    protected java.lang.Object localServiceGroupClassLoader;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localServiceGroupClassLoaderTracker = false;

    /**
     * field for ServiceGroupName
     */
    protected java.lang.String localServiceGroupName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localServiceGroupNameTracker = false;

    /**
     * field for Services
     */
    protected java.util.xsd.Iterator localServices;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localServicesTracker = false;

    public boolean isAxisDescriptionSpecified() {
        return localAxisDescriptionTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.engine.xsd.AxisConfiguration
     */
    public org.apache.axis2.engine.xsd.AxisConfiguration getAxisDescription() {
        return localAxisDescription;
    }

    /**
     * Auto generated setter method
     * @param param AxisDescription
     */
    public void setAxisDescription(
        org.apache.axis2.engine.xsd.AxisConfiguration param) {
        localAxisDescriptionTracker = true;

        this.localAxisDescription = param;
    }

    public boolean isFoundWebResourcesSpecified() {
        return localFoundWebResourcesTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getFoundWebResources() {
        return localFoundWebResources;
    }

    /**
     * Auto generated setter method
     * @param param FoundWebResources
     */
    public void setFoundWebResources(boolean param) {
        // setting primitive attribute tracker to true
        localFoundWebResourcesTracker = true;

        this.localFoundWebResources = param;
    }

    public boolean isKeySpecified() {
        return localKeyTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getKey() {
        return localKey;
    }

    /**
     * Auto generated setter method
     * @param param Key
     */
    public void setKey(java.lang.Object param) {
        localKeyTracker = true;

        this.localKey = param;
    }

    public boolean isModuleRefsSpecified() {
        return localModuleRefsTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getModuleRefs() {
        return localModuleRefs;
    }

    /**
     * Auto generated setter method
     * @param param ModuleRefs
     */
    public void setModuleRefs(java.lang.Object param) {
        localModuleRefsTracker = true;

        this.localModuleRefs = param;
    }

    public boolean isServiceGroupClassLoaderSpecified() {
        return localServiceGroupClassLoaderTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getServiceGroupClassLoader() {
        return localServiceGroupClassLoader;
    }

    /**
     * Auto generated setter method
     * @param param ServiceGroupClassLoader
     */
    public void setServiceGroupClassLoader(java.lang.Object param) {
        localServiceGroupClassLoaderTracker = true;

        this.localServiceGroupClassLoader = param;
    }

    public boolean isServiceGroupNameSpecified() {
        return localServiceGroupNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getServiceGroupName() {
        return localServiceGroupName;
    }

    /**
     * Auto generated setter method
     * @param param ServiceGroupName
     */
    public void setServiceGroupName(java.lang.String param) {
        localServiceGroupNameTracker = true;

        this.localServiceGroupName = param;
    }

    public boolean isServicesSpecified() {
        return localServicesTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.xsd.Iterator
     */
    public java.util.xsd.Iterator getServices() {
        return localServices;
    }

    /**
     * Auto generated setter method
     * @param param Services
     */
    public void setServices(java.util.xsd.Iterator param) {
        localServicesTracker = true;

        this.localServices = param;
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
                    "http://description.axis2.apache.org/xsd");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":AxisServiceGroup", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "AxisServiceGroup", xmlWriter);
            }
        }

        if (localAxisDescriptionTracker) {
            if (localAxisDescription == null) {
                writeStartElement(null,
                    "http://description.axis2.apache.org/xsd",
                    "axisDescription", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localAxisDescription.serialize(new javax.xml.namespace.QName(
                        "http://description.axis2.apache.org/xsd",
                        "axisDescription"), xmlWriter);
            }
        }

        if (localFoundWebResourcesTracker) {
            namespace = "http://description.axis2.apache.org/xsd";
            writeStartElement(null, namespace, "foundWebResources", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "foundWebResources cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localFoundWebResources));
            }

            xmlWriter.writeEndElement();
        }

        if (localKeyTracker) {
            if (localKey != null) {
                if (localKey instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localKey).serialize(new javax.xml.namespace.QName(
                            "http://description.axis2.apache.org/xsd", "key"),
                        xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://description.axis2.apache.org/xsd", "key",
                        xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localKey,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://description.axis2.apache.org/xsd", "key", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localModuleRefsTracker) {
            if (localModuleRefs != null) {
                if (localModuleRefs instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localModuleRefs).serialize(new javax.xml.namespace.QName(
                            "http://description.axis2.apache.org/xsd",
                            "moduleRefs"), xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://description.axis2.apache.org/xsd",
                        "moduleRefs", xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localModuleRefs,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://description.axis2.apache.org/xsd", "moduleRefs",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localServiceGroupClassLoaderTracker) {
            if (localServiceGroupClassLoader != null) {
                if (localServiceGroupClassLoader instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localServiceGroupClassLoader).serialize(new javax.xml.namespace.QName(
                            "http://description.axis2.apache.org/xsd",
                            "serviceGroupClassLoader"), xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://description.axis2.apache.org/xsd",
                        "serviceGroupClassLoader", xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localServiceGroupClassLoader,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://description.axis2.apache.org/xsd",
                    "serviceGroupClassLoader", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localServiceGroupNameTracker) {
            namespace = "http://description.axis2.apache.org/xsd";
            writeStartElement(null, namespace, "serviceGroupName", xmlWriter);

            if (localServiceGroupName == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localServiceGroupName);
            }

            xmlWriter.writeEndElement();
        }

        if (localServicesTracker) {
            if (localServices == null) {
                writeStartElement(null,
                    "http://description.axis2.apache.org/xsd", "services",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localServices.serialize(new javax.xml.namespace.QName(
                        "http://description.axis2.apache.org/xsd", "services"),
                    xmlWriter);
            }
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://description.axis2.apache.org/xsd")) {
            return "ns17";
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
        public static AxisServiceGroup parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            AxisServiceGroup object = new AxisServiceGroup();

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

                        if (!"AxisServiceGroup".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (AxisServiceGroup) org.apache.axis2.transaction.xsd.ExtensionMapper.getTypeObject(nsUri,
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
                            "http://description.axis2.apache.org/xsd",
                            "axisDescription").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setAxisDescription(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setAxisDescription(org.apache.axis2.engine.xsd.AxisConfiguration.Factory.parse(
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
                            "http://description.axis2.apache.org/xsd",
                            "foundWebResources").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "foundWebResources" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFoundWebResources(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://description.axis2.apache.org/xsd", "key").equals(
                            reader.getName())) {
                    object.setKey(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
                            reader,
                            org.apache.axis2.transaction.xsd.ExtensionMapper.class));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://description.axis2.apache.org/xsd",
                            "moduleRefs").equals(reader.getName())) {
                    object.setModuleRefs(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
                            reader,
                            org.apache.axis2.transaction.xsd.ExtensionMapper.class));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://description.axis2.apache.org/xsd",
                            "serviceGroupClassLoader").equals(reader.getName())) {
                    object.setServiceGroupClassLoader(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
                            reader,
                            org.apache.axis2.transaction.xsd.ExtensionMapper.class));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://description.axis2.apache.org/xsd",
                            "serviceGroupName").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setServiceGroupName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "http://description.axis2.apache.org/xsd",
                            "services").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setServices(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setServices(java.util.xsd.Iterator.Factory.parse(
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
