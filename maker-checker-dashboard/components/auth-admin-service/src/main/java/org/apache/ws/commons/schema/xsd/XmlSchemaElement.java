/**
 * XmlSchemaElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:38 BST)
 */
package org.apache.ws.commons.schema.xsd;


/**
 *  XmlSchemaElement bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class XmlSchemaElement extends org.apache.ws.commons.schema.xsd.XmlSchemaParticle
    implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = XmlSchemaElement
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
     * field for _abstract
     */
    protected boolean local_abstract;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_abstractTracker = false;

    /**
     * field for Block
     */
    protected org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod localBlock;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBlockTracker = false;

    /**
     * field for BlockResolved
     */
    protected org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod localBlockResolved;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBlockResolvedTracker = false;

    /**
     * field for Constraints
     */
    protected org.apache.ws.commons.schema.xsd.XmlSchemaObjectCollection localConstraints;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localConstraintsTracker = false;

    /**
     * field for DefaultValue
     */
    protected java.lang.String localDefaultValue;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDefaultValueTracker = false;

    /**
     * field for ElementType
     */
    protected java.lang.Object localElementType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localElementTypeTracker = false;

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
     * field for FixedValue
     */
    protected java.lang.String localFixedValue;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFixedValueTracker = false;

    /**
     * field for Form
     */
    protected org.apache.ws.commons.schema.xsd.XmlSchemaForm localForm;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFormTracker = false;

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
     * field for Nillable
     */
    protected boolean localNillable;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNillableTracker = false;

    /**
     * field for RefName
     */
    protected java.lang.Object localRefName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRefNameTracker = false;

    /**
     * field for SchemaType
     */
    protected org.apache.ws.commons.schema.xsd.XmlSchemaType localSchemaType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSchemaTypeTracker = false;

    /**
     * field for SchemaTypeName
     */
    protected java.lang.Object localSchemaTypeName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSchemaTypeNameTracker = false;

    /**
     * field for SubstitutionGroup
     */
    protected java.lang.Object localSubstitutionGroup;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSubstitutionGroupTracker = false;

    /**
     * field for Type
     */
    protected org.apache.ws.commons.schema.xsd.XmlSchemaType localType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTypeTracker = false;

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

    public boolean is_abstractSpecified() {
        return local_abstractTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean get_abstract() {
        return local_abstract;
    }

    /**
     * Auto generated setter method
     * @param param _abstract
     */
    public void set_abstract(boolean param) {
        // setting primitive attribute tracker to true
        local_abstractTracker = true;

        this.local_abstract = param;
    }

    public boolean isBlockSpecified() {
        return localBlockTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod
     */
    public org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod getBlock() {
        return localBlock;
    }

    /**
     * Auto generated setter method
     * @param param Block
     */
    public void setBlock(
        org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod param) {
        localBlockTracker = true;

        this.localBlock = param;
    }

    public boolean isBlockResolvedSpecified() {
        return localBlockResolvedTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod
     */
    public org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod getBlockResolved() {
        return localBlockResolved;
    }

    /**
     * Auto generated setter method
     * @param param BlockResolved
     */
    public void setBlockResolved(
        org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod param) {
        localBlockResolvedTracker = true;

        this.localBlockResolved = param;
    }

    public boolean isConstraintsSpecified() {
        return localConstraintsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.ws.commons.schema.xsd.XmlSchemaObjectCollection
     */
    public org.apache.ws.commons.schema.xsd.XmlSchemaObjectCollection getConstraints() {
        return localConstraints;
    }

    /**
     * Auto generated setter method
     * @param param Constraints
     */
    public void setConstraints(
        org.apache.ws.commons.schema.xsd.XmlSchemaObjectCollection param) {
        localConstraintsTracker = true;

        this.localConstraints = param;
    }

    public boolean isDefaultValueSpecified() {
        return localDefaultValueTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDefaultValue() {
        return localDefaultValue;
    }

    /**
     * Auto generated setter method
     * @param param DefaultValue
     */
    public void setDefaultValue(java.lang.String param) {
        localDefaultValueTracker = true;

        this.localDefaultValue = param;
    }

    public boolean isElementTypeSpecified() {
        return localElementTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getElementType() {
        return localElementType;
    }

    /**
     * Auto generated setter method
     * @param param ElementType
     */
    public void setElementType(java.lang.Object param) {
        localElementTypeTracker = true;

        this.localElementType = param;
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

    public boolean isFixedValueSpecified() {
        return localFixedValueTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFixedValue() {
        return localFixedValue;
    }

    /**
     * Auto generated setter method
     * @param param FixedValue
     */
    public void setFixedValue(java.lang.String param) {
        localFixedValueTracker = true;

        this.localFixedValue = param;
    }

    public boolean isFormSpecified() {
        return localFormTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.ws.commons.schema.xsd.XmlSchemaForm
     */
    public org.apache.ws.commons.schema.xsd.XmlSchemaForm getForm() {
        return localForm;
    }

    /**
     * Auto generated setter method
     * @param param Form
     */
    public void setForm(org.apache.ws.commons.schema.xsd.XmlSchemaForm param) {
        localFormTracker = true;

        this.localForm = param;
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

    public boolean isNillableSpecified() {
        return localNillableTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getNillable() {
        return localNillable;
    }

    /**
     * Auto generated setter method
     * @param param Nillable
     */
    public void setNillable(boolean param) {
        // setting primitive attribute tracker to true
        localNillableTracker = true;

        this.localNillable = param;
    }

    public boolean isRefNameSpecified() {
        return localRefNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getRefName() {
        return localRefName;
    }

    /**
     * Auto generated setter method
     * @param param RefName
     */
    public void setRefName(java.lang.Object param) {
        localRefNameTracker = true;

        this.localRefName = param;
    }

    public boolean isSchemaTypeSpecified() {
        return localSchemaTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.ws.commons.schema.xsd.XmlSchemaType
     */
    public org.apache.ws.commons.schema.xsd.XmlSchemaType getSchemaType() {
        return localSchemaType;
    }

    /**
     * Auto generated setter method
     * @param param SchemaType
     */
    public void setSchemaType(
        org.apache.ws.commons.schema.xsd.XmlSchemaType param) {
        localSchemaTypeTracker = true;

        this.localSchemaType = param;
    }

    public boolean isSchemaTypeNameSpecified() {
        return localSchemaTypeNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getSchemaTypeName() {
        return localSchemaTypeName;
    }

    /**
     * Auto generated setter method
     * @param param SchemaTypeName
     */
    public void setSchemaTypeName(java.lang.Object param) {
        localSchemaTypeNameTracker = true;

        this.localSchemaTypeName = param;
    }

    public boolean isSubstitutionGroupSpecified() {
        return localSubstitutionGroupTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getSubstitutionGroup() {
        return localSubstitutionGroup;
    }

    /**
     * Auto generated setter method
     * @param param SubstitutionGroup
     */
    public void setSubstitutionGroup(java.lang.Object param) {
        localSubstitutionGroupTracker = true;

        this.localSubstitutionGroup = param;
    }

    public boolean isTypeSpecified() {
        return localTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.ws.commons.schema.xsd.XmlSchemaType
     */
    public org.apache.ws.commons.schema.xsd.XmlSchemaType getType() {
        return localType;
    }

    /**
     * Auto generated setter method
     * @param param Type
     */
    public void setType(org.apache.ws.commons.schema.xsd.XmlSchemaType param) {
        localTypeTracker = true;

        this.localType = param;
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
                "type", namespacePrefix + ":XmlSchemaElement", xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "type", "XmlSchemaElement", xmlWriter);
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

        if (localMaxOccursTracker) {
            namespace = "http://schema.commons.ws.apache.org/xsd";
            writeStartElement(null, namespace, "maxOccurs", xmlWriter);

            if (localMaxOccurs == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "maxOccurs cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMaxOccurs));
            }

            xmlWriter.writeEndElement();
        }

        if (localMinOccursTracker) {
            namespace = "http://schema.commons.ws.apache.org/xsd";
            writeStartElement(null, namespace, "minOccurs", xmlWriter);

            if (localMinOccurs == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "minOccurs cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMinOccurs));
            }

            xmlWriter.writeEndElement();
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

        if (local_abstractTracker) {
            namespace = "http://schema.commons.ws.apache.org/xsd";
            writeStartElement(null, namespace, "abstract", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "abstract cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        local_abstract));
            }

            xmlWriter.writeEndElement();
        }

        if (localBlockTracker) {
            if (localBlock == null) {
                writeStartElement(null,
                    "http://schema.commons.ws.apache.org/xsd", "block",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localBlock.serialize(new javax.xml.namespace.QName(
                        "http://schema.commons.ws.apache.org/xsd", "block"),
                    xmlWriter);
            }
        }

        if (localBlockResolvedTracker) {
            if (localBlockResolved == null) {
                writeStartElement(null,
                    "http://schema.commons.ws.apache.org/xsd", "blockResolved",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localBlockResolved.serialize(new javax.xml.namespace.QName(
                        "http://schema.commons.ws.apache.org/xsd",
                        "blockResolved"), xmlWriter);
            }
        }

        if (localConstraintsTracker) {
            if (localConstraints == null) {
                writeStartElement(null,
                    "http://schema.commons.ws.apache.org/xsd", "constraints",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localConstraints.serialize(new javax.xml.namespace.QName(
                        "http://schema.commons.ws.apache.org/xsd", "constraints"),
                    xmlWriter);
            }
        }

        if (localDefaultValueTracker) {
            namespace = "http://schema.commons.ws.apache.org/xsd";
            writeStartElement(null, namespace, "defaultValue", xmlWriter);

            if (localDefaultValue == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localDefaultValue);
            }

            xmlWriter.writeEndElement();
        }

        if (localElementTypeTracker) {
            if (localElementType != null) {
                if (localElementType instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localElementType).serialize(new javax.xml.namespace.QName(
                            "http://schema.commons.ws.apache.org/xsd",
                            "elementType"), xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://schema.commons.ws.apache.org/xsd",
                        "elementType", xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localElementType,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://schema.commons.ws.apache.org/xsd", "elementType",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
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

        if (localFixedValueTracker) {
            namespace = "http://schema.commons.ws.apache.org/xsd";
            writeStartElement(null, namespace, "fixedValue", xmlWriter);

            if (localFixedValue == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localFixedValue);
            }

            xmlWriter.writeEndElement();
        }

        if (localFormTracker) {
            if (localForm == null) {
                writeStartElement(null,
                    "http://schema.commons.ws.apache.org/xsd", "form", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localForm.serialize(new javax.xml.namespace.QName(
                        "http://schema.commons.ws.apache.org/xsd", "form"),
                    xmlWriter);
            }
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

        if (localNillableTracker) {
            namespace = "http://schema.commons.ws.apache.org/xsd";
            writeStartElement(null, namespace, "nillable", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "nillable cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localNillable));
            }

            xmlWriter.writeEndElement();
        }

        if (localRefNameTracker) {
            if (localRefName != null) {
                if (localRefName instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localRefName).serialize(new javax.xml.namespace.QName(
                            "http://schema.commons.ws.apache.org/xsd", "refName"),
                        xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://schema.commons.ws.apache.org/xsd", "refName",
                        xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localRefName,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://schema.commons.ws.apache.org/xsd", "refName",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localSchemaTypeTracker) {
            if (localSchemaType == null) {
                writeStartElement(null,
                    "http://schema.commons.ws.apache.org/xsd", "schemaType",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localSchemaType.serialize(new javax.xml.namespace.QName(
                        "http://schema.commons.ws.apache.org/xsd", "schemaType"),
                    xmlWriter);
            }
        }

        if (localSchemaTypeNameTracker) {
            if (localSchemaTypeName != null) {
                if (localSchemaTypeName instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localSchemaTypeName).serialize(new javax.xml.namespace.QName(
                            "http://schema.commons.ws.apache.org/xsd",
                            "schemaTypeName"), xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://schema.commons.ws.apache.org/xsd",
                        "schemaTypeName", xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localSchemaTypeName,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://schema.commons.ws.apache.org/xsd",
                    "schemaTypeName", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localSubstitutionGroupTracker) {
            if (localSubstitutionGroup != null) {
                if (localSubstitutionGroup instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localSubstitutionGroup).serialize(new javax.xml.namespace.QName(
                            "http://schema.commons.ws.apache.org/xsd",
                            "substitutionGroup"), xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://schema.commons.ws.apache.org/xsd",
                        "substitutionGroup", xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localSubstitutionGroup,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://schema.commons.ws.apache.org/xsd",
                    "substitutionGroup", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localTypeTracker) {
            if (localType == null) {
                writeStartElement(null,
                    "http://schema.commons.ws.apache.org/xsd", "type", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localType.serialize(new javax.xml.namespace.QName(
                        "http://schema.commons.ws.apache.org/xsd", "type"),
                    xmlWriter);
            }
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
        public static XmlSchemaElement parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            XmlSchemaElement object = new XmlSchemaElement();

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

                        if (!"XmlSchemaElement".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (XmlSchemaElement) org.apache.axis2.transaction.xsd.ExtensionMapper.getTypeObject(nsUri,
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
                            "http://schema.commons.ws.apache.org/xsd",
                            "maxOccurs").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "maxOccurs" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMaxOccurs(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setMaxOccurs(java.lang.Long.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://schema.commons.ws.apache.org/xsd",
                            "minOccurs").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "minOccurs" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMinOccurs(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setMinOccurs(java.lang.Long.MIN_VALUE);
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
                            "abstract").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "abstract" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.set_abstract(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://schema.commons.ws.apache.org/xsd", "block").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setBlock(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setBlock(org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod.Factory.parse(
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
                            "blockResolved").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setBlockResolved(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setBlockResolved(org.apache.ws.commons.schema.xsd.XmlSchemaDerivationMethod.Factory.parse(
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
                            "constraints").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setConstraints(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setConstraints(org.apache.ws.commons.schema.xsd.XmlSchemaObjectCollection.Factory.parse(
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
                            "defaultValue").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setDefaultValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "elementType").equals(reader.getName())) {
                    object.setElementType(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
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
                            "fixedValue").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setFixedValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "http://schema.commons.ws.apache.org/xsd", "form").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setForm(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setForm(org.apache.ws.commons.schema.xsd.XmlSchemaForm.Factory.parse(
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

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://schema.commons.ws.apache.org/xsd",
                            "nillable").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "nillable" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNillable(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://schema.commons.ws.apache.org/xsd", "refName").equals(
                            reader.getName())) {
                    object.setRefName(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
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
                            "schemaType").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setSchemaType(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setSchemaType(org.apache.ws.commons.schema.xsd.XmlSchemaType.Factory.parse(
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
                            "schemaTypeName").equals(reader.getName())) {
                    object.setSchemaTypeName(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
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
                            "substitutionGroup").equals(reader.getName())) {
                    object.setSubstitutionGroup(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
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
                            "http://schema.commons.ws.apache.org/xsd", "type").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setType(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setType(org.apache.ws.commons.schema.xsd.XmlSchemaType.Factory.parse(
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
