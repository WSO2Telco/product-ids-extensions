/**
 * Options.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:38 BST)
 */
package org.apache.axis2.client.xsd;


/**
 *  Options bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Options implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Options
       Namespace URI = http://client.axis2.apache.org/xsd
       Namespace Prefix = ns27
     */

    /**
     * field for Action
     */
    protected java.lang.String localAction;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localActionTracker = false;

    /**
     * field for CallTransportCleanup
     */
    protected boolean localCallTransportCleanup;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCallTransportCleanupTracker = false;

    /**
     * field for ExceptionToBeThrownOnSOAPFault
     */
    protected boolean localExceptionToBeThrownOnSOAPFault;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExceptionToBeThrownOnSOAPFaultTracker = false;

    /**
     * field for FaultTo
     */
    protected org.apache.axis2.addressing.xsd.EndpointReference localFaultTo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFaultToTracker = false;

    /**
     * field for From
     */
    protected org.apache.axis2.addressing.xsd.EndpointReference localFrom;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFromTracker = false;

    /**
     * field for Listener
     */
    protected org.apache.axis2.transport.xsd.TransportListener localListener;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localListenerTracker = false;

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
     * field for ManageSession
     */
    protected boolean localManageSession;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localManageSessionTracker = false;

    /**
     * field for MessageId
     */
    protected java.lang.String localMessageId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMessageIdTracker = false;

    /**
     * field for Parent
     */
    protected org.apache.axis2.client.xsd.Options localParent;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localParentTracker = false;

    /**
     * field for Password
     */
    protected java.lang.String localPassword;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPasswordTracker = false;

    /**
     * field for Properties
     * This was an Array!
     */
    protected java.lang.String[] localProperties;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPropertiesTracker = false;

    /**
     * field for RelatesTo
     */
    protected org.apache.axis2.addressing.xsd.RelatesTo localRelatesTo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRelatesToTracker = false;

    /**
     * field for Relationships
     * This was an Array!
     */
    protected org.apache.axis2.addressing.xsd.RelatesTo[] localRelationships;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRelationshipsTracker = false;

    /**
     * field for ReplyTo
     */
    protected org.apache.axis2.addressing.xsd.EndpointReference localReplyTo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReplyToTracker = false;

    /**
     * field for SoapVersionURI
     */
    protected java.lang.String localSoapVersionURI;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSoapVersionURITracker = false;

    /**
     * field for TimeOutInMilliSeconds
     */
    protected long localTimeOutInMilliSeconds;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTimeOutInMilliSecondsTracker = false;

    /**
     * field for To
     */
    protected org.apache.axis2.addressing.xsd.EndpointReference localTo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localToTracker = false;

    /**
     * field for TransportIn
     */
    protected org.apache.axis2.description.xsd.TransportInDescription localTransportIn;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTransportInTracker = false;

    /**
     * field for TransportInProtocol
     */
    protected java.lang.String localTransportInProtocol;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTransportInProtocolTracker = false;

    /**
     * field for TransportOut
     */
    protected org.apache.axis2.description.xsd.TransportOutDescription localTransportOut;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTransportOutTracker = false;

    /**
     * field for UseSeparateListener
     */
    protected boolean localUseSeparateListener;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUseSeparateListenerTracker = false;

    /**
     * field for UserName
     */
    protected java.lang.String localUserName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUserNameTracker = false;

    public boolean isActionSpecified() {
        return localActionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAction() {
        return localAction;
    }

    /**
     * Auto generated setter method
     * @param param Action
     */
    public void setAction(java.lang.String param) {
        localActionTracker = true;

        this.localAction = param;
    }

    public boolean isCallTransportCleanupSpecified() {
        return localCallTransportCleanupTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getCallTransportCleanup() {
        return localCallTransportCleanup;
    }

    /**
     * Auto generated setter method
     * @param param CallTransportCleanup
     */
    public void setCallTransportCleanup(boolean param) {
        // setting primitive attribute tracker to true
        localCallTransportCleanupTracker = true;

        this.localCallTransportCleanup = param;
    }

    public boolean isExceptionToBeThrownOnSOAPFaultSpecified() {
        return localExceptionToBeThrownOnSOAPFaultTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getExceptionToBeThrownOnSOAPFault() {
        return localExceptionToBeThrownOnSOAPFault;
    }

    /**
     * Auto generated setter method
     * @param param ExceptionToBeThrownOnSOAPFault
     */
    public void setExceptionToBeThrownOnSOAPFault(boolean param) {
        // setting primitive attribute tracker to true
        localExceptionToBeThrownOnSOAPFaultTracker = true;

        this.localExceptionToBeThrownOnSOAPFault = param;
    }

    public boolean isFaultToSpecified() {
        return localFaultToTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.addressing.xsd.EndpointReference
     */
    public org.apache.axis2.addressing.xsd.EndpointReference getFaultTo() {
        return localFaultTo;
    }

    /**
     * Auto generated setter method
     * @param param FaultTo
     */
    public void setFaultTo(
        org.apache.axis2.addressing.xsd.EndpointReference param) {
        localFaultToTracker = true;

        this.localFaultTo = param;
    }

    public boolean isFromSpecified() {
        return localFromTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.addressing.xsd.EndpointReference
     */
    public org.apache.axis2.addressing.xsd.EndpointReference getFrom() {
        return localFrom;
    }

    /**
     * Auto generated setter method
     * @param param From
     */
    public void setFrom(org.apache.axis2.addressing.xsd.EndpointReference param) {
        localFromTracker = true;

        this.localFrom = param;
    }

    public boolean isListenerSpecified() {
        return localListenerTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.transport.xsd.TransportListener
     */
    public org.apache.axis2.transport.xsd.TransportListener getListener() {
        return localListener;
    }

    /**
     * Auto generated setter method
     * @param param Listener
     */
    public void setListener(
        org.apache.axis2.transport.xsd.TransportListener param) {
        localListenerTracker = true;

        this.localListener = param;
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

    public boolean isManageSessionSpecified() {
        return localManageSessionTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getManageSession() {
        return localManageSession;
    }

    /**
     * Auto generated setter method
     * @param param ManageSession
     */
    public void setManageSession(boolean param) {
        // setting primitive attribute tracker to true
        localManageSessionTracker = true;

        this.localManageSession = param;
    }

    public boolean isMessageIdSpecified() {
        return localMessageIdTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMessageId() {
        return localMessageId;
    }

    /**
     * Auto generated setter method
     * @param param MessageId
     */
    public void setMessageId(java.lang.String param) {
        localMessageIdTracker = true;

        this.localMessageId = param;
    }

    public boolean isParentSpecified() {
        return localParentTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.client.xsd.Options
     */
    public org.apache.axis2.client.xsd.Options getParent() {
        return localParent;
    }

    /**
     * Auto generated setter method
     * @param param Parent
     */
    public void setParent(org.apache.axis2.client.xsd.Options param) {
        localParentTracker = true;

        this.localParent = param;
    }

    public boolean isPasswordSpecified() {
        return localPasswordTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPassword() {
        return localPassword;
    }

    /**
     * Auto generated setter method
     * @param param Password
     */
    public void setPassword(java.lang.String param) {
        localPasswordTracker = true;

        this.localPassword = param;
    }

    public boolean isPropertiesSpecified() {
        return localPropertiesTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String[]
     */
    public java.lang.String[] getProperties() {
        return localProperties;
    }

    /**
     * validate the array for Properties
     */
    protected void validateProperties(java.lang.String[] param) {
    }

    /**
     * Auto generated setter method
     * @param param Properties
     */
    public void setProperties(java.lang.String[] param) {
        validateProperties(param);

        localPropertiesTracker = true;

        this.localProperties = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param java.lang.String
     */
    public void addProperties(java.lang.String param) {
        if (localProperties == null) {
            localProperties = new java.lang.String[] {  };
        }

        //update the setting tracker
        localPropertiesTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localProperties);
        list.add(param);
        this.localProperties = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
    }

    public boolean isRelatesToSpecified() {
        return localRelatesToTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.addressing.xsd.RelatesTo
     */
    public org.apache.axis2.addressing.xsd.RelatesTo getRelatesTo() {
        return localRelatesTo;
    }

    /**
     * Auto generated setter method
     * @param param RelatesTo
     */
    public void setRelatesTo(org.apache.axis2.addressing.xsd.RelatesTo param) {
        localRelatesToTracker = true;

        this.localRelatesTo = param;
    }

    public boolean isRelationshipsSpecified() {
        return localRelationshipsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.addressing.xsd.RelatesTo[]
     */
    public org.apache.axis2.addressing.xsd.RelatesTo[] getRelationships() {
        return localRelationships;
    }

    /**
     * validate the array for Relationships
     */
    protected void validateRelationships(
        org.apache.axis2.addressing.xsd.RelatesTo[] param) {
    }

    /**
     * Auto generated setter method
     * @param param Relationships
     */
    public void setRelationships(
        org.apache.axis2.addressing.xsd.RelatesTo[] param) {
        validateRelationships(param);

        localRelationshipsTracker = true;

        this.localRelationships = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param org.apache.axis2.addressing.xsd.RelatesTo
     */
    public void addRelationships(
        org.apache.axis2.addressing.xsd.RelatesTo param) {
        if (localRelationships == null) {
            localRelationships = new org.apache.axis2.addressing.xsd.RelatesTo[] {
                    
                };
        }

        //update the setting tracker
        localRelationshipsTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localRelationships);
        list.add(param);
        this.localRelationships = (org.apache.axis2.addressing.xsd.RelatesTo[]) list.toArray(new org.apache.axis2.addressing.xsd.RelatesTo[list.size()]);
    }

    public boolean isReplyToSpecified() {
        return localReplyToTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.addressing.xsd.EndpointReference
     */
    public org.apache.axis2.addressing.xsd.EndpointReference getReplyTo() {
        return localReplyTo;
    }

    /**
     * Auto generated setter method
     * @param param ReplyTo
     */
    public void setReplyTo(
        org.apache.axis2.addressing.xsd.EndpointReference param) {
        localReplyToTracker = true;

        this.localReplyTo = param;
    }

    public boolean isSoapVersionURISpecified() {
        return localSoapVersionURITracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSoapVersionURI() {
        return localSoapVersionURI;
    }

    /**
     * Auto generated setter method
     * @param param SoapVersionURI
     */
    public void setSoapVersionURI(java.lang.String param) {
        localSoapVersionURITracker = true;

        this.localSoapVersionURI = param;
    }

    public boolean isTimeOutInMilliSecondsSpecified() {
        return localTimeOutInMilliSecondsTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getTimeOutInMilliSeconds() {
        return localTimeOutInMilliSeconds;
    }

    /**
     * Auto generated setter method
     * @param param TimeOutInMilliSeconds
     */
    public void setTimeOutInMilliSeconds(long param) {
        // setting primitive attribute tracker to true
        localTimeOutInMilliSecondsTracker = param != java.lang.Long.MIN_VALUE;

        this.localTimeOutInMilliSeconds = param;
    }

    public boolean isToSpecified() {
        return localToTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.addressing.xsd.EndpointReference
     */
    public org.apache.axis2.addressing.xsd.EndpointReference getTo() {
        return localTo;
    }

    /**
     * Auto generated setter method
     * @param param To
     */
    public void setTo(org.apache.axis2.addressing.xsd.EndpointReference param) {
        localToTracker = true;

        this.localTo = param;
    }

    public boolean isTransportInSpecified() {
        return localTransportInTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.description.xsd.TransportInDescription
     */
    public org.apache.axis2.description.xsd.TransportInDescription getTransportIn() {
        return localTransportIn;
    }

    /**
     * Auto generated setter method
     * @param param TransportIn
     */
    public void setTransportIn(
        org.apache.axis2.description.xsd.TransportInDescription param) {
        localTransportInTracker = true;

        this.localTransportIn = param;
    }

    public boolean isTransportInProtocolSpecified() {
        return localTransportInProtocolTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTransportInProtocol() {
        return localTransportInProtocol;
    }

    /**
     * Auto generated setter method
     * @param param TransportInProtocol
     */
    public void setTransportInProtocol(java.lang.String param) {
        localTransportInProtocolTracker = true;

        this.localTransportInProtocol = param;
    }

    public boolean isTransportOutSpecified() {
        return localTransportOutTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.description.xsd.TransportOutDescription
     */
    public org.apache.axis2.description.xsd.TransportOutDescription getTransportOut() {
        return localTransportOut;
    }

    /**
     * Auto generated setter method
     * @param param TransportOut
     */
    public void setTransportOut(
        org.apache.axis2.description.xsd.TransportOutDescription param) {
        localTransportOutTracker = true;

        this.localTransportOut = param;
    }

    public boolean isUseSeparateListenerSpecified() {
        return localUseSeparateListenerTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getUseSeparateListener() {
        return localUseSeparateListener;
    }

    /**
     * Auto generated setter method
     * @param param UseSeparateListener
     */
    public void setUseSeparateListener(boolean param) {
        // setting primitive attribute tracker to true
        localUseSeparateListenerTracker = true;

        this.localUseSeparateListener = param;
    }

    public boolean isUserNameSpecified() {
        return localUserNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getUserName() {
        return localUserName;
    }

    /**
     * Auto generated setter method
     * @param param UserName
     */
    public void setUserName(java.lang.String param) {
        localUserNameTracker = true;

        this.localUserName = param;
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
                    "http://client.axis2.apache.org/xsd");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":Options", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Options", xmlWriter);
            }
        }

        if (localActionTracker) {
            namespace = "http://client.axis2.apache.org/xsd";
            writeStartElement(null, namespace, "action", xmlWriter);

            if (localAction == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localAction);
            }

            xmlWriter.writeEndElement();
        }

        if (localCallTransportCleanupTracker) {
            namespace = "http://client.axis2.apache.org/xsd";
            writeStartElement(null, namespace, "callTransportCleanup", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "callTransportCleanup cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localCallTransportCleanup));
            }

            xmlWriter.writeEndElement();
        }

        if (localExceptionToBeThrownOnSOAPFaultTracker) {
            namespace = "http://client.axis2.apache.org/xsd";
            writeStartElement(null, namespace,
                "exceptionToBeThrownOnSOAPFault", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "exceptionToBeThrownOnSOAPFault cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localExceptionToBeThrownOnSOAPFault));
            }

            xmlWriter.writeEndElement();
        }

        if (localFaultToTracker) {
            if (localFaultTo == null) {
                writeStartElement(null, "http://client.axis2.apache.org/xsd",
                    "faultTo", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localFaultTo.serialize(new javax.xml.namespace.QName(
                        "http://client.axis2.apache.org/xsd", "faultTo"),
                    xmlWriter);
            }
        }

        if (localFromTracker) {
            if (localFrom == null) {
                writeStartElement(null, "http://client.axis2.apache.org/xsd",
                    "from", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localFrom.serialize(new javax.xml.namespace.QName(
                        "http://client.axis2.apache.org/xsd", "from"), xmlWriter);
            }
        }

        if (localListenerTracker) {
            if (localListener == null) {
                writeStartElement(null, "http://client.axis2.apache.org/xsd",
                    "listener", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localListener.serialize(new javax.xml.namespace.QName(
                        "http://client.axis2.apache.org/xsd", "listener"),
                    xmlWriter);
            }
        }

        if (localLogCorrelationIDStringTracker) {
            namespace = "http://client.axis2.apache.org/xsd";
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

        if (localManageSessionTracker) {
            namespace = "http://client.axis2.apache.org/xsd";
            writeStartElement(null, namespace, "manageSession", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "manageSession cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localManageSession));
            }

            xmlWriter.writeEndElement();
        }

        if (localMessageIdTracker) {
            namespace = "http://client.axis2.apache.org/xsd";
            writeStartElement(null, namespace, "messageId", xmlWriter);

            if (localMessageId == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localMessageId);
            }

            xmlWriter.writeEndElement();
        }

        if (localParentTracker) {
            if (localParent == null) {
                writeStartElement(null, "http://client.axis2.apache.org/xsd",
                    "parent", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localParent.serialize(new javax.xml.namespace.QName(
                        "http://client.axis2.apache.org/xsd", "parent"),
                    xmlWriter);
            }
        }

        if (localPasswordTracker) {
            namespace = "http://client.axis2.apache.org/xsd";
            writeStartElement(null, namespace, "password", xmlWriter);

            if (localPassword == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localPassword);
            }

            xmlWriter.writeEndElement();
        }

        if (localPropertiesTracker) {
            if (localProperties != null) {
                namespace = "http://client.axis2.apache.org/xsd";

                for (int i = 0; i < localProperties.length; i++) {
                    if (localProperties[i] != null) {
                        writeStartElement(null, namespace, "properties",
                            xmlWriter);

                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                localProperties[i]));

                        xmlWriter.writeEndElement();
                    } else {
                        // write null attribute
                        namespace = "http://client.axis2.apache.org/xsd";
                        writeStartElement(null, namespace, "properties",
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
                writeStartElement(null, "http://client.axis2.apache.org/xsd",
                    "properties", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localRelatesToTracker) {
            if (localRelatesTo == null) {
                writeStartElement(null, "http://client.axis2.apache.org/xsd",
                    "relatesTo", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localRelatesTo.serialize(new javax.xml.namespace.QName(
                        "http://client.axis2.apache.org/xsd", "relatesTo"),
                    xmlWriter);
            }
        }

        if (localRelationshipsTracker) {
            if (localRelationships != null) {
                for (int i = 0; i < localRelationships.length; i++) {
                    if (localRelationships[i] != null) {
                        localRelationships[i].serialize(new javax.xml.namespace.QName(
                                "http://client.axis2.apache.org/xsd",
                                "relationships"), xmlWriter);
                    } else {
                        writeStartElement(null,
                            "http://client.axis2.apache.org/xsd",
                            "relationships", xmlWriter);

                        // write the nil attribute
                        writeAttribute("xsi",
                            "http://www.w3.org/2001/XMLSchema-instance", "nil",
                            "1", xmlWriter);
                        xmlWriter.writeEndElement();
                    }
                }
            } else {
                writeStartElement(null, "http://client.axis2.apache.org/xsd",
                    "relationships", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localReplyToTracker) {
            if (localReplyTo == null) {
                writeStartElement(null, "http://client.axis2.apache.org/xsd",
                    "replyTo", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localReplyTo.serialize(new javax.xml.namespace.QName(
                        "http://client.axis2.apache.org/xsd", "replyTo"),
                    xmlWriter);
            }
        }

        if (localSoapVersionURITracker) {
            namespace = "http://client.axis2.apache.org/xsd";
            writeStartElement(null, namespace, "soapVersionURI", xmlWriter);

            if (localSoapVersionURI == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localSoapVersionURI);
            }

            xmlWriter.writeEndElement();
        }

        if (localTimeOutInMilliSecondsTracker) {
            namespace = "http://client.axis2.apache.org/xsd";
            writeStartElement(null, namespace, "timeOutInMilliSeconds",
                xmlWriter);

            if (localTimeOutInMilliSeconds == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "timeOutInMilliSeconds cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTimeOutInMilliSeconds));
            }

            xmlWriter.writeEndElement();
        }

        if (localToTracker) {
            if (localTo == null) {
                writeStartElement(null, "http://client.axis2.apache.org/xsd",
                    "to", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localTo.serialize(new javax.xml.namespace.QName(
                        "http://client.axis2.apache.org/xsd", "to"), xmlWriter);
            }
        }

        if (localTransportInTracker) {
            if (localTransportIn == null) {
                writeStartElement(null, "http://client.axis2.apache.org/xsd",
                    "transportIn", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localTransportIn.serialize(new javax.xml.namespace.QName(
                        "http://client.axis2.apache.org/xsd", "transportIn"),
                    xmlWriter);
            }
        }

        if (localTransportInProtocolTracker) {
            namespace = "http://client.axis2.apache.org/xsd";
            writeStartElement(null, namespace, "transportInProtocol", xmlWriter);

            if (localTransportInProtocol == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localTransportInProtocol);
            }

            xmlWriter.writeEndElement();
        }

        if (localTransportOutTracker) {
            if (localTransportOut == null) {
                writeStartElement(null, "http://client.axis2.apache.org/xsd",
                    "transportOut", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localTransportOut.serialize(new javax.xml.namespace.QName(
                        "http://client.axis2.apache.org/xsd", "transportOut"),
                    xmlWriter);
            }
        }

        if (localUseSeparateListenerTracker) {
            namespace = "http://client.axis2.apache.org/xsd";
            writeStartElement(null, namespace, "useSeparateListener", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "useSeparateListener cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localUseSeparateListener));
            }

            xmlWriter.writeEndElement();
        }

        if (localUserNameTracker) {
            namespace = "http://client.axis2.apache.org/xsd";
            writeStartElement(null, namespace, "userName", xmlWriter);

            if (localUserName == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localUserName);
            }

            xmlWriter.writeEndElement();
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://client.axis2.apache.org/xsd")) {
            return "ns27";
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
        public static Options parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Options object = new Options();

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

                        if (!"Options".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Options) org.apache.axis2.transaction.xsd.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list12 = new java.util.ArrayList();

                java.util.ArrayList list14 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://client.axis2.apache.org/xsd", "action").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setAction(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "http://client.axis2.apache.org/xsd",
                            "callTransportCleanup").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "callTransportCleanup" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCallTransportCleanup(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://client.axis2.apache.org/xsd",
                            "exceptionToBeThrownOnSOAPFault").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "exceptionToBeThrownOnSOAPFault" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setExceptionToBeThrownOnSOAPFault(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://client.axis2.apache.org/xsd", "faultTo").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setFaultTo(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setFaultTo(org.apache.axis2.addressing.xsd.EndpointReference.Factory.parse(
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
                            "http://client.axis2.apache.org/xsd", "from").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setFrom(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setFrom(org.apache.axis2.addressing.xsd.EndpointReference.Factory.parse(
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
                            "http://client.axis2.apache.org/xsd", "listener").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setListener(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setListener(org.apache.axis2.transport.xsd.TransportListener.Factory.parse(
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
                            "http://client.axis2.apache.org/xsd",
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
                            "http://client.axis2.apache.org/xsd",
                            "manageSession").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "manageSession" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setManageSession(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://client.axis2.apache.org/xsd", "messageId").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setMessageId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "http://client.axis2.apache.org/xsd", "parent").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setParent(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setParent(org.apache.axis2.client.xsd.Options.Factory.parse(
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
                            "http://client.axis2.apache.org/xsd", "password").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setPassword(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "http://client.axis2.apache.org/xsd", "properties").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        list12.add(null);

                        reader.next();
                    } else {
                        list12.add(reader.getElementText());
                    }

                    //loop until we find a start element that is not part of this array
                    boolean loopDone12 = false;

                    while (!loopDone12) {
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
                            loopDone12 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                        "http://client.axis2.apache.org/xsd",
                                        "properties").equals(reader.getName())) {
                                nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                        "nil");

                                if ("true".equals(nillableValue) ||
                                        "1".equals(nillableValue)) {
                                    list12.add(null);

                                    reader.next();
                                } else {
                                    list12.add(reader.getElementText());
                                }
                            } else {
                                loopDone12 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setProperties((java.lang.String[]) list12.toArray(
                            new java.lang.String[list12.size()]));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://client.axis2.apache.org/xsd", "relatesTo").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setRelatesTo(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setRelatesTo(org.apache.axis2.addressing.xsd.RelatesTo.Factory.parse(
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
                            "http://client.axis2.apache.org/xsd",
                            "relationships").equals(reader.getName())) {
                    // Process the array and step past its final element's end.
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        list14.add(null);
                        reader.next();
                    } else {
                        list14.add(org.apache.axis2.addressing.xsd.RelatesTo.Factory.parse(
                                reader));
                    }

                    //loop until we find a start element that is not part of this array
                    boolean loopDone14 = false;

                    while (!loopDone14) {
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
                            loopDone14 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                        "http://client.axis2.apache.org/xsd",
                                        "relationships").equals(
                                        reader.getName())) {
                                nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                        "nil");

                                if ("true".equals(nillableValue) ||
                                        "1".equals(nillableValue)) {
                                    list14.add(null);
                                    reader.next();
                                } else {
                                    list14.add(org.apache.axis2.addressing.xsd.RelatesTo.Factory.parse(
                                            reader));
                                }
                            } else {
                                loopDone14 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setRelationships((org.apache.axis2.addressing.xsd.RelatesTo[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            org.apache.axis2.addressing.xsd.RelatesTo.class,
                            list14));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://client.axis2.apache.org/xsd", "replyTo").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setReplyTo(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setReplyTo(org.apache.axis2.addressing.xsd.EndpointReference.Factory.parse(
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
                            "http://client.axis2.apache.org/xsd",
                            "soapVersionURI").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setSoapVersionURI(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "http://client.axis2.apache.org/xsd",
                            "timeOutInMilliSeconds").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "timeOutInMilliSeconds" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTimeOutInMilliSeconds(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setTimeOutInMilliSeconds(java.lang.Long.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://client.axis2.apache.org/xsd", "to").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setTo(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setTo(org.apache.axis2.addressing.xsd.EndpointReference.Factory.parse(
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
                            "http://client.axis2.apache.org/xsd", "transportIn").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setTransportIn(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setTransportIn(org.apache.axis2.description.xsd.TransportInDescription.Factory.parse(
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
                            "http://client.axis2.apache.org/xsd",
                            "transportInProtocol").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setTransportInProtocol(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "http://client.axis2.apache.org/xsd", "transportOut").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setTransportOut(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setTransportOut(org.apache.axis2.description.xsd.TransportOutDescription.Factory.parse(
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
                            "http://client.axis2.apache.org/xsd",
                            "useSeparateListener").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "useSeparateListener" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setUseSeparateListener(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://client.axis2.apache.org/xsd", "userName").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setUserName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
