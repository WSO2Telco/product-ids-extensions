/**
 * Attachments.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:38 BST)
 */
package org.apache.axiom.attachments.xsd;


/**
 *  Attachments bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Attachments implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Attachments
       Namespace URI = http://attachments.axiom.apache.org/xsd
       Namespace Prefix = ns13
     */

    /**
     * field for SOAPPartContentID
     */
    protected java.lang.String localSOAPPartContentID;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSOAPPartContentIDTracker = false;

    /**
     * field for SOAPPartContentType
     */
    protected java.lang.String localSOAPPartContentType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSOAPPartContentTypeTracker = false;

    /**
     * field for SOAPPartInputStream
     */
    protected java.io.xsd.InputStream localSOAPPartInputStream;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSOAPPartInputStreamTracker = false;

    /**
     * field for AllContentIDs
     * This was an Array!
     */
    protected java.lang.String[] localAllContentIDs;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAllContentIDsTracker = false;

    /**
     * field for AttachmentSpecType
     */
    protected java.lang.String localAttachmentSpecType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAttachmentSpecTypeTracker = false;

    /**
     * field for ContentIDList
     */
    protected java.lang.Object localContentIDList;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localContentIDListTracker = false;

    /**
     * field for ContentIDSet
     */
    protected java.util.xsd.Set localContentIDSet;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localContentIDSetTracker = false;

    /**
     * field for ContentLength
     */
    protected long localContentLength;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localContentLengthTracker = false;

    /**
     * field for IncomingAttachmentStreams
     */
    protected org.apache.axiom.attachments.xsd.IncomingAttachmentStreams localIncomingAttachmentStreams;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIncomingAttachmentStreamsTracker = false;

    /**
     * field for IncomingAttachmentsAsSingleStream
     */
    protected java.io.xsd.InputStream localIncomingAttachmentsAsSingleStream;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIncomingAttachmentsAsSingleStreamTracker = false;

    /**
     * field for LifecycleManager
     */
    protected org.apache.axiom.attachments.lifecycle.xsd.LifecycleManager localLifecycleManager;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLifecycleManagerTracker = false;

    /**
     * field for Map
     */
    protected java.util.xsd.Map localMap;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMapTracker = false;

    public boolean isSOAPPartContentIDSpecified() {
        return localSOAPPartContentIDTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSOAPPartContentID() {
        return localSOAPPartContentID;
    }

    /**
     * Auto generated setter method
     * @param param SOAPPartContentID
     */
    public void setSOAPPartContentID(java.lang.String param) {
        localSOAPPartContentIDTracker = true;

        this.localSOAPPartContentID = param;
    }

    public boolean isSOAPPartContentTypeSpecified() {
        return localSOAPPartContentTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSOAPPartContentType() {
        return localSOAPPartContentType;
    }

    /**
     * Auto generated setter method
     * @param param SOAPPartContentType
     */
    public void setSOAPPartContentType(java.lang.String param) {
        localSOAPPartContentTypeTracker = true;

        this.localSOAPPartContentType = param;
    }

    public boolean isSOAPPartInputStreamSpecified() {
        return localSOAPPartInputStreamTracker;
    }

    /**
     * Auto generated getter method
     * @return java.io.xsd.InputStream
     */
    public java.io.xsd.InputStream getSOAPPartInputStream() {
        return localSOAPPartInputStream;
    }

    /**
     * Auto generated setter method
     * @param param SOAPPartInputStream
     */
    public void setSOAPPartInputStream(java.io.xsd.InputStream param) {
        localSOAPPartInputStreamTracker = true;

        this.localSOAPPartInputStream = param;
    }

    public boolean isAllContentIDsSpecified() {
        return localAllContentIDsTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String[]
     */
    public java.lang.String[] getAllContentIDs() {
        return localAllContentIDs;
    }

    /**
     * validate the array for AllContentIDs
     */
    protected void validateAllContentIDs(java.lang.String[] param) {
    }

    /**
     * Auto generated setter method
     * @param param AllContentIDs
     */
    public void setAllContentIDs(java.lang.String[] param) {
        validateAllContentIDs(param);

        localAllContentIDsTracker = true;

        this.localAllContentIDs = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param java.lang.String
     */
    public void addAllContentIDs(java.lang.String param) {
        if (localAllContentIDs == null) {
            localAllContentIDs = new java.lang.String[] {  };
        }

        //update the setting tracker
        localAllContentIDsTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localAllContentIDs);
        list.add(param);
        this.localAllContentIDs = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
    }

    public boolean isAttachmentSpecTypeSpecified() {
        return localAttachmentSpecTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAttachmentSpecType() {
        return localAttachmentSpecType;
    }

    /**
     * Auto generated setter method
     * @param param AttachmentSpecType
     */
    public void setAttachmentSpecType(java.lang.String param) {
        localAttachmentSpecTypeTracker = true;

        this.localAttachmentSpecType = param;
    }

    public boolean isContentIDListSpecified() {
        return localContentIDListTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getContentIDList() {
        return localContentIDList;
    }

    /**
     * Auto generated setter method
     * @param param ContentIDList
     */
    public void setContentIDList(java.lang.Object param) {
        localContentIDListTracker = true;

        this.localContentIDList = param;
    }

    public boolean isContentIDSetSpecified() {
        return localContentIDSetTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.xsd.Set
     */
    public java.util.xsd.Set getContentIDSet() {
        return localContentIDSet;
    }

    /**
     * Auto generated setter method
     * @param param ContentIDSet
     */
    public void setContentIDSet(java.util.xsd.Set param) {
        localContentIDSetTracker = true;

        this.localContentIDSet = param;
    }

    public boolean isContentLengthSpecified() {
        return localContentLengthTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getContentLength() {
        return localContentLength;
    }

    /**
     * Auto generated setter method
     * @param param ContentLength
     */
    public void setContentLength(long param) {
        // setting primitive attribute tracker to true
        localContentLengthTracker = param != java.lang.Long.MIN_VALUE;

        this.localContentLength = param;
    }

    public boolean isIncomingAttachmentStreamsSpecified() {
        return localIncomingAttachmentStreamsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axiom.attachments.xsd.IncomingAttachmentStreams
     */
    public org.apache.axiom.attachments.xsd.IncomingAttachmentStreams getIncomingAttachmentStreams() {
        return localIncomingAttachmentStreams;
    }

    /**
     * Auto generated setter method
     * @param param IncomingAttachmentStreams
     */
    public void setIncomingAttachmentStreams(
        org.apache.axiom.attachments.xsd.IncomingAttachmentStreams param) {
        localIncomingAttachmentStreamsTracker = true;

        this.localIncomingAttachmentStreams = param;
    }

    public boolean isIncomingAttachmentsAsSingleStreamSpecified() {
        return localIncomingAttachmentsAsSingleStreamTracker;
    }

    /**
     * Auto generated getter method
     * @return java.io.xsd.InputStream
     */
    public java.io.xsd.InputStream getIncomingAttachmentsAsSingleStream() {
        return localIncomingAttachmentsAsSingleStream;
    }

    /**
     * Auto generated setter method
     * @param param IncomingAttachmentsAsSingleStream
     */
    public void setIncomingAttachmentsAsSingleStream(
        java.io.xsd.InputStream param) {
        localIncomingAttachmentsAsSingleStreamTracker = true;

        this.localIncomingAttachmentsAsSingleStream = param;
    }

    public boolean isLifecycleManagerSpecified() {
        return localLifecycleManagerTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axiom.attachments.lifecycle.xsd.LifecycleManager
     */
    public org.apache.axiom.attachments.lifecycle.xsd.LifecycleManager getLifecycleManager() {
        return localLifecycleManager;
    }

    /**
     * Auto generated setter method
     * @param param LifecycleManager
     */
    public void setLifecycleManager(
        org.apache.axiom.attachments.lifecycle.xsd.LifecycleManager param) {
        localLifecycleManagerTracker = true;

        this.localLifecycleManager = param;
    }

    public boolean isMapSpecified() {
        return localMapTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.xsd.Map
     */
    public java.util.xsd.Map getMap() {
        return localMap;
    }

    /**
     * Auto generated setter method
     * @param param Map
     */
    public void setMap(java.util.xsd.Map param) {
        localMapTracker = true;

        this.localMap = param;
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
                    "http://attachments.axiom.apache.org/xsd");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":Attachments", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Attachments", xmlWriter);
            }
        }

        if (localSOAPPartContentIDTracker) {
            namespace = "http://attachments.axiom.apache.org/xsd";
            writeStartElement(null, namespace, "SOAPPartContentID", xmlWriter);

            if (localSOAPPartContentID == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localSOAPPartContentID);
            }

            xmlWriter.writeEndElement();
        }

        if (localSOAPPartContentTypeTracker) {
            namespace = "http://attachments.axiom.apache.org/xsd";
            writeStartElement(null, namespace, "SOAPPartContentType", xmlWriter);

            if (localSOAPPartContentType == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localSOAPPartContentType);
            }

            xmlWriter.writeEndElement();
        }

        if (localSOAPPartInputStreamTracker) {
            if (localSOAPPartInputStream == null) {
                writeStartElement(null,
                    "http://attachments.axiom.apache.org/xsd",
                    "SOAPPartInputStream", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localSOAPPartInputStream.serialize(new javax.xml.namespace.QName(
                        "http://attachments.axiom.apache.org/xsd",
                        "SOAPPartInputStream"), xmlWriter);
            }
        }

        if (localAllContentIDsTracker) {
            if (localAllContentIDs != null) {
                namespace = "http://attachments.axiom.apache.org/xsd";

                for (int i = 0; i < localAllContentIDs.length; i++) {
                    if (localAllContentIDs[i] != null) {
                        writeStartElement(null, namespace, "allContentIDs",
                            xmlWriter);

                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                localAllContentIDs[i]));

                        xmlWriter.writeEndElement();
                    } else {
                        // write null attribute
                        namespace = "http://attachments.axiom.apache.org/xsd";
                        writeStartElement(null, namespace, "allContentIDs",
                            xmlWriter);
                        writeAttribute("xsi",
                            "http://www.w3.org/2001/XMLSchema-instance", "nil",
                            "1", xmlWriter);
                        xmlWriter.writeEndElement();
                    }
                }
            } else {
                // write the null attribute
                // write null attribute
                writeStartElement(null,
                    "http://attachments.axiom.apache.org/xsd", "allContentIDs",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localAttachmentSpecTypeTracker) {
            namespace = "http://attachments.axiom.apache.org/xsd";
            writeStartElement(null, namespace, "attachmentSpecType", xmlWriter);

            if (localAttachmentSpecType == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localAttachmentSpecType);
            }

            xmlWriter.writeEndElement();
        }

        if (localContentIDListTracker) {
            if (localContentIDList != null) {
                if (localContentIDList instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localContentIDList).serialize(new javax.xml.namespace.QName(
                            "http://attachments.axiom.apache.org/xsd",
                            "contentIDList"), xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://attachments.axiom.apache.org/xsd",
                        "contentIDList", xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localContentIDList,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://attachments.axiom.apache.org/xsd", "contentIDList",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localContentIDSetTracker) {
            if (localContentIDSet == null) {
                writeStartElement(null,
                    "http://attachments.axiom.apache.org/xsd", "contentIDSet",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localContentIDSet.serialize(new javax.xml.namespace.QName(
                        "http://attachments.axiom.apache.org/xsd",
                        "contentIDSet"), xmlWriter);
            }
        }

        if (localContentLengthTracker) {
            namespace = "http://attachments.axiom.apache.org/xsd";
            writeStartElement(null, namespace, "contentLength", xmlWriter);

            if (localContentLength == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "contentLength cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localContentLength));
            }

            xmlWriter.writeEndElement();
        }

        if (localIncomingAttachmentStreamsTracker) {
            if (localIncomingAttachmentStreams == null) {
                writeStartElement(null,
                    "http://attachments.axiom.apache.org/xsd",
                    "incomingAttachmentStreams", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localIncomingAttachmentStreams.serialize(new javax.xml.namespace.QName(
                        "http://attachments.axiom.apache.org/xsd",
                        "incomingAttachmentStreams"), xmlWriter);
            }
        }

        if (localIncomingAttachmentsAsSingleStreamTracker) {
            if (localIncomingAttachmentsAsSingleStream == null) {
                writeStartElement(null,
                    "http://attachments.axiom.apache.org/xsd",
                    "incomingAttachmentsAsSingleStream", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localIncomingAttachmentsAsSingleStream.serialize(new javax.xml.namespace.QName(
                        "http://attachments.axiom.apache.org/xsd",
                        "incomingAttachmentsAsSingleStream"), xmlWriter);
            }
        }

        if (localLifecycleManagerTracker) {
            if (localLifecycleManager == null) {
                writeStartElement(null,
                    "http://attachments.axiom.apache.org/xsd",
                    "lifecycleManager", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localLifecycleManager.serialize(new javax.xml.namespace.QName(
                        "http://attachments.axiom.apache.org/xsd",
                        "lifecycleManager"), xmlWriter);
            }
        }

        if (localMapTracker) {
            if (localMap == null) {
                writeStartElement(null,
                    "http://attachments.axiom.apache.org/xsd", "map", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localMap.serialize(new javax.xml.namespace.QName(
                        "http://attachments.axiom.apache.org/xsd", "map"),
                    xmlWriter);
            }
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://attachments.axiom.apache.org/xsd")) {
            return "ns13";
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
        public static Attachments parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Attachments object = new Attachments();

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

                        if (!"Attachments".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Attachments) org.apache.axis2.transaction.xsd.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list4 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://attachments.axiom.apache.org/xsd",
                            "SOAPPartContentID").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setSOAPPartContentID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "http://attachments.axiom.apache.org/xsd",
                            "SOAPPartContentType").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setSOAPPartContentType(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "http://attachments.axiom.apache.org/xsd",
                            "SOAPPartInputStream").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setSOAPPartInputStream(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setSOAPPartInputStream(java.io.xsd.InputStream.Factory.parse(
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
                            "http://attachments.axiom.apache.org/xsd",
                            "allContentIDs").equals(reader.getName())) {
                    // Process the array and step past its final element's end.
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        list4.add(null);

                        reader.next();
                    } else {
                        list4.add(reader.getElementText());
                    }

                    //loop until we find a start element that is not part of this array
                    boolean loopDone4 = false;

                    while (!loopDone4) {
                        // Ensure we are at the EndElement
                        while (!reader.isEndElement()) {
                            reader.next();
                        }

                        // Step out of this element
                        reader.next();

                        // Step to next element event.
                        while (!reader.isStartElement() &&
                                !reader.isEndElement())
                            reader.next();

                        if (reader.isEndElement()) {
                            //two continuous end elements means we are exiting the xml structure
                            loopDone4 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                        "http://attachments.axiom.apache.org/xsd",
                                        "allContentIDs").equals(
                                        reader.getName())) {
                                nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                        "nil");

                                if ("true".equals(nillableValue) ||
                                        "1".equals(nillableValue)) {
                                    list4.add(null);

                                    reader.next();
                                } else {
                                    list4.add(reader.getElementText());
                                }
                            } else {
                                loopDone4 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setAllContentIDs((java.lang.String[]) list4.toArray(
                            new java.lang.String[list4.size()]));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://attachments.axiom.apache.org/xsd",
                            "attachmentSpecType").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setAttachmentSpecType(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "http://attachments.axiom.apache.org/xsd",
                            "contentIDList").equals(reader.getName())) {
                    object.setContentIDList(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
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
                            "http://attachments.axiom.apache.org/xsd",
                            "contentIDSet").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setContentIDSet(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setContentIDSet(java.util.xsd.Set.Factory.parse(
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
                            "http://attachments.axiom.apache.org/xsd",
                            "contentLength").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "contentLength" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setContentLength(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setContentLength(java.lang.Long.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://attachments.axiom.apache.org/xsd",
                            "incomingAttachmentStreams").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setIncomingAttachmentStreams(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setIncomingAttachmentStreams(org.apache.axiom.attachments.xsd.IncomingAttachmentStreams.Factory.parse(
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
                            "http://attachments.axiom.apache.org/xsd",
                            "incomingAttachmentsAsSingleStream").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setIncomingAttachmentsAsSingleStream(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setIncomingAttachmentsAsSingleStream(java.io.xsd.InputStream.Factory.parse(
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
                            "http://attachments.axiom.apache.org/xsd",
                            "lifecycleManager").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setLifecycleManager(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setLifecycleManager(org.apache.axiom.attachments.lifecycle.xsd.LifecycleManager.Factory.parse(
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
                            "http://attachments.axiom.apache.org/xsd", "map").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setMap(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setMap(java.util.xsd.Map.Factory.parse(reader));

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
