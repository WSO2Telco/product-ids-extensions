/**
 * XmlSchemaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:38 BST)
 */
package org.apache.ws.commons.schema.xsd;


/**
 *  XmlSchemaType bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class XmlSchemaType extends org.apache.ws.commons.schema.xsd.XmlSchemaAnnotated
    implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = XmlSchemaType
       Namespace URI = http://schema.commons.ws.apache.org/xsd
       Namespace Prefix = ns7
     */

    /**
     * field for QName
     */
    protected java.lang.Object localQName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localQNameTracker = false;

    /**
     * field for BaseSchemaType
     */
    protected java.lang.Object localBaseSchemaType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBaseSchemaTypeTracker = false;

    /**
     * field for BaseSchemaTypeName
     */
    protected java.lang.Object localBaseSchemaTypeName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBaseSchemaTypeNameTracker = false;

    /**
     * field for DataType
     */
    protected org.apache.ws.commons.schema.xsd.XmlSchemaDatatype localDataType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDataTypeTracker = false;

    /**
     * field for DeriveBy
     */
    protected org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod localDeriveBy;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDeriveByTracker = false;

    /**
     * field for _final
     */
    protected org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod local_final;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_finalTracker = false;

    /**
     * field for FinalResolved
     */
    protected org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod localFinalResolved;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFinalResolvedTracker = false;

    /**
     * field for Mixed
     */
    protected boolean localMixed;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMixedTracker = false;

    /**
     * field for Name
     */
    protected java.lang.String localName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNameTracker = false;

    public boolean isQNameSpecified() {
        return localQNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getQName() {
        return localQName;
    }

    /**
     * Auto generated setter method
     * @param param QName
     */
    public void setQName(java.lang.Object param) {
        localQNameTracker = true;

        this.localQName = param;
    }

    public boolean isBaseSchemaTypeSpecified() {
        return localBaseSchemaTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getBaseSchemaType() {
        return localBaseSchemaType;
    }

    /**
     * Auto generated setter method
     * @param param BaseSchemaType
     */
    public void setBaseSchemaType(java.lang.Object param) {
        localBaseSchemaTypeTracker = true;

        this.localBaseSchemaType = param;
    }

    public boolean isBaseSchemaTypeNameSpecified() {
        return localBaseSchemaTypeNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getBaseSchemaTypeName() {
        return localBaseSchemaTypeName;
    }

    /**
     * Auto generated setter method
     * @param param BaseSchemaTypeName
     */
    public void setBaseSchemaTypeName(java.lang.Object param) {
        localBaseSchemaTypeNameTracker = true;

        this.localBaseSchemaTypeName = param;
    }

    public boolean isDataTypeSpecified() {
        return localDataTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.ws.commons.schema.xsd.XmlSchemaDatatype
     */
    public org.apache.ws.commons.schema.xsd.XmlSchemaDatatype getDataType() {
        return localDataType;
    }

    /**
     * Auto generated setter method
     * @param param DataType
     */
    public void setDataType(
        org.apache.ws.commons.schema.xsd.XmlSchemaDatatype param) {
        localDataTypeTracker = true;

        this.localDataType = param;
    }

    public boolean isDeriveBySpecified() {
        return localDeriveByTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod
     */
    public org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod getDeriveBy() {
        return localDeriveBy;
    }

    /**
     * Auto generated setter method
     * @param param DeriveBy
     */
    public void setDeriveBy(
        org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod param) {
        localDeriveByTracker = true;

        this.localDeriveBy = param;
    }

    public boolean is_finalSpecified() {
        return local_finalTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod
     */
    public org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod get_final() {
        return local_final;
    }

    /**
     * Auto generated setter method
     * @param param _final
     */
    public void set_final(
        org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod param) {
        local_finalTracker = true;

        this.local_final = param;
    }

    public boolean isFinalResolvedSpecified() {
        return localFinalResolvedTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod
     */
    public org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod getFinalResolved() {
        return localFinalResolved;
    }

    /**
     * Auto generated setter method
     * @param param FinalResolved
     */
    public void setFinalResolved(
        org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod param) {
        localFinalResolvedTracker = true;

        this.localFinalResolved = param;
    }

    public boolean isMixedSpecified() {
        return localMixedTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getMixed() {
        return localMixed;
    }

    /**
     * Auto generated setter method
     * @param param Mixed
     */
    public void setMixed(boolean param) {
        // setting primitive attribute tracker to true
        localMixedTracker = true;

        this.localMixed = param;
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

        java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                "http://schema.commons.ws.apache.org/xsd");

        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "type", namespacePrefix + ":XmlSchemaType", xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "type", "XmlSchemaType", xmlWriter);
        }

        if (localLineNumberTracker) {
            namespace = "http://schema.commons.ws.apache.org/xsd";
            writeStartElement(null, namespace, "lineNumber", xmlWriter);

            if (localLineNumber == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "lineNumber cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localLineNumber));
            }

            xmlWriter.writeEndElement();
        }

        if (localLinePositionTracker) {
            namespace = "http://schema.commons.ws.apache.org/xsd";
            writeStartElement(null, namespace, "linePosition", xmlWriter);

            if (localLinePosition == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "linePosition cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localLinePosition));
            }

            xmlWriter.writeEndElement();
        }

        if (localMetaInfoMapTracker) {
            if (localMetaInfoMap == null) {
                writeStartElement(null,
                    "http://schema.commons.ws.apache.org/xsd", "metaInfoMap",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localMetaInfoMap.serialize(new javax.xml.namespace.QName(
                        "http://schema.commons.ws.apache.org/xsd", "metaInfoMap"),
                    xmlWriter);
            }
        }

        if (localSourceURITracker) {
            namespace = "http://schema.commons.ws.apache.org/xsd";
            writeStartElement(null, namespace, "sourceURI", xmlWriter);

            if (localSourceURI == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localSourceURI);
            }

            xmlWriter.writeEndElement();
        }

        if (localAnnotationTracker) {
            if (localAnnotation == null) {
                writeStartElement(null,
                    "http://schema.commons.ws.apache.org/xsd", "annotation",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localAnnotation.serialize(new javax.xml.namespace.QName(
                        "http://schema.commons.ws.apache.org/xsd", "annotation"),
                    xmlWriter);
            }
        }

        if (localIdTracker) {
            namespace = "http://schema.commons.ws.apache.org/xsd";
            writeStartElement(null, namespace, "id", xmlWriter);

            if (localId == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localId);
            }

            xmlWriter.writeEndElement();
        }

        if (localUnhandledAttributesTracker) {
            if (localUnhandledAttributes != null) {
                for (int i = 0; i < localUnhandledAttributes.length; i++) {
                    if (localUnhandledAttributes[i] != null) {
                        localUnhandledAttributes[i].serialize(new javax.xml.namespace.QName(
                                "http://schema.commons.ws.apache.org/xsd",
                                "unhandledAttributes"), xmlWriter);
                    } else {
                        writeStartElement(null,
                            "http://schema.commons.ws.apache.org/xsd",
                            "unhandledAttributes", xmlWriter);

                        // write the nil attribute
                        writeAttribute("xsi",
                            "http://www.w3.org/2001/XMLSchema-instance", "nil",
                            "1", xmlWriter);
                        xmlWriter.writeEndElement();
                    }
                }
            } else {
                writeStartElement(null,
                    "http://schema.commons.ws.apache.org/xsd",
                    "unhandledAttributes", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localQNameTracker) {
            if (localQName != null) {
                if (localQName instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localQName).serialize(new javax.xml.namespace.QName(
                            "http://schema.commons.ws.apache.org/xsd", "QName"),
                        xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://schema.commons.ws.apache.org/xsd", "QName",
                        xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localQName,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://schema.commons.ws.apache.org/xsd", "QName",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localBaseSchemaTypeTracker) {
            if (localBaseSchemaType != null) {
                if (localBaseSchemaType instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localBaseSchemaType).serialize(new javax.xml.namespace.QName(
                            "http://schema.commons.ws.apache.org/xsd",
                            "baseSchemaType"), xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://schema.commons.ws.apache.org/xsd",
                        "baseSchemaType", xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localBaseSchemaType,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://schema.commons.ws.apache.org/xsd",
                    "baseSchemaType", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localBaseSchemaTypeNameTracker) {
            if (localBaseSchemaTypeName != null) {
                if (localBaseSchemaTypeName instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localBaseSchemaTypeName).serialize(new javax.xml.namespace.QName(
                            "http://schema.commons.ws.apache.org/xsd",
                            "baseSchemaTypeName"), xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://schema.commons.ws.apache.org/xsd",
                        "baseSchemaTypeName", xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localBaseSchemaTypeName,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://schema.commons.ws.apache.org/xsd",
                    "baseSchemaTypeName", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localDataTypeTracker) {
            if (localDataType == null) {
                writeStartElement(null,
                    "http://schema.commons.ws.apache.org/xsd", "dataType",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localDataType.serialize(new javax.xml.namespace.QName(
                        "http://schema.commons.ws.apache.org/xsd", "dataType"),
                    xmlWriter);
            }
        }

        if (localDeriveByTracker) {
            if (localDeriveBy == null) {
                writeStartElement(null,
                    "http://schema.commons.ws.apache.org/xsd", "deriveBy",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localDeriveBy.serialize(new javax.xml.namespace.QName(
                        "http://schema.commons.ws.apache.org/xsd", "deriveBy"),
                    xmlWriter);
            }
        }

        if (local_finalTracker) {
            if (local_final == null) {
                writeStartElement(null,
                    "http://schema.commons.ws.apache.org/xsd", "final",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                local_final.serialize(new javax.xml.namespace.QName(
                        "http://schema.commons.ws.apache.org/xsd", "final"),
                    xmlWriter);
            }
        }

        if (localFinalResolvedTracker) {
            if (localFinalResolved == null) {
                writeStartElement(null,
                    "http://schema.commons.ws.apache.org/xsd", "finalResolved",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localFinalResolved.serialize(new javax.xml.namespace.QName(
                        "http://schema.commons.ws.apache.org/xsd",
                        "finalResolved"), xmlWriter);
            }
        }

        if (localMixedTracker) {
            namespace = "http://schema.commons.ws.apache.org/xsd";
            writeStartElement(null, namespace, "mixed", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "mixed cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMixed));
            }

            xmlWriter.writeEndElement();
        }

        if (localNameTracker) {
            namespace = "http://schema.commons.ws.apache.org/xsd";
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

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://schema.commons.ws.apache.org/xsd")) {
            return "ns7";
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
        public static XmlSchemaType parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            XmlSchemaType object = new XmlSchemaType();

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

                        if (!"XmlSchemaType".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (XmlSchemaType) org.apache.axis2.transaction.xsd.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list7 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://schema.commons.ws.apache.org/xsd",
                            "lineNumber").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "lineNumber" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLineNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setLineNumber(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://schema.commons.ws.apache.org/xsd",
                            "linePosition").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "linePosition" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLinePosition(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setLinePosition(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://schema.commons.ws.apache.org/xsd",
                            "metaInfoMap").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setMetaInfoMap(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setMetaInfoMap(java.util.xsd.Map.Factory.parse(
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
                            "http://schema.commons.ws.apache.org/xsd",
                            "sourceURI").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setSourceURI(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "http://schema.commons.ws.apache.org/xsd",
                            "annotation").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setAnnotation(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setAnnotation(org.apache.ws.commons.schema.xsd.XmlSchemaAnnotation.Factory.parse(
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
                            "http://schema.commons.ws.apache.org/xsd", "id").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "http://schema.commons.ws.apache.org/xsd",
                            "unhandledAttributes").equals(reader.getName())) {
                    // Process the array and step past its final element's end.
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        list7.add(null);
                        reader.next();
                    } else {
                        list7.add(org.w3c.dom.xsd.Attr.Factory.parse(reader));
                    }

                    //loop until we find a start element that is not part of this array
                    boolean loopDone7 = false;

                    while (!loopDone7) {
                        // We should be at the end element, but make sure
                        while (!reader.isEndElement())
                            reader.next();

                        // Step out of this element
                        reader.next();

                        // Step to next element event.
                        while (!reader.isStartElement() &&
                                !reader.isEndElement())
                            reader.next();

                        if (reader.isEndElement()) {
                            //two continuous end elements means we are exiting the xml structure
                            loopDone7 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                        "http://schema.commons.ws.apache.org/xsd",
                                        "unhandledAttributes").equals(
                                        reader.getName())) {
                                nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                        "nil");

                                if ("true".equals(nillableValue) ||
                                        "1".equals(nillableValue)) {
                                    list7.add(null);
                                    reader.next();
                                } else {
                                    list7.add(org.w3c.dom.xsd.Attr.Factory.parse(
                                            reader));
                                }
                            } else {
                                loopDone7 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setUnhandledAttributes((org.w3c.dom.xsd.Attr[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            org.w3c.dom.xsd.Attr.class, list7));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://schema.commons.ws.apache.org/xsd", "QName").equals(
                            reader.getName())) {
                    object.setQName(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
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
                            "http://schema.commons.ws.apache.org/xsd",
                            "baseSchemaType").equals(reader.getName())) {
                    object.setBaseSchemaType(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
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
                            "http://schema.commons.ws.apache.org/xsd",
                            "baseSchemaTypeName").equals(reader.getName())) {
                    object.setBaseSchemaTypeName(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
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
                            "http://schema.commons.ws.apache.org/xsd",
                            "dataType").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setDataType(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setDataType(org.apache.ws.commons.schema.xsd.XmlSchemaDatatype.Factory.parse(
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
                            "http://schema.commons.ws.apache.org/xsd",
                            "deriveBy").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setDeriveBy(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setDeriveBy(org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod.Factory.parse(
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
                            "http://schema.commons.ws.apache.org/xsd", "final").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.set_final(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.set_final(org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod.Factory.parse(
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
                            "http://schema.commons.ws.apache.org/xsd",
                            "finalResolved").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setFinalResolved(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setFinalResolved(org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod.Factory.parse(
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
                            "http://schema.commons.ws.apache.org/xsd", "mixed").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "mixed" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMixed(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://schema.commons.ws.apache.org/xsd", "name").equals(
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
