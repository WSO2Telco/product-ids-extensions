/**
 * PhasesInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:38 BST)
 */
package org.apache.axis2.deployment.util.xsd;


/**
 *  PhasesInfo bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class PhasesInfo implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = PhasesInfo
       Namespace URI = http://util.deployment.axis2.apache.org/xsd
       Namespace Prefix = ns24
     */

    /**
     * field for INPhases
     */
    protected java.lang.Object localINPhases;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localINPhasesTracker = false;

    /**
     * field for IN_FaultPhases
     */
    protected java.lang.Object localIN_FaultPhases;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIN_FaultPhasesTracker = false;

    /**
     * field for OUTPhases
     */
    protected java.lang.Object localOUTPhases;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOUTPhasesTracker = false;

    /**
     * field for OUT_FaultPhases
     */
    protected java.lang.Object localOUT_FaultPhases;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOUT_FaultPhasesTracker = false;

    /**
     * field for GlobalInFaultPhases
     */
    protected java.lang.Object localGlobalInFaultPhases;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGlobalInFaultPhasesTracker = false;

    /**
     * field for GlobalInflow
     */
    protected java.lang.Object localGlobalInflow;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGlobalInflowTracker = false;

    /**
     * field for GlobalOutPhaseList
     */
    protected java.lang.Object localGlobalOutPhaseList;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGlobalOutPhaseListTracker = false;

    /**
     * field for OperationInFaultPhases
     */
    protected java.lang.Object localOperationInFaultPhases;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOperationInFaultPhasesTracker = false;

    /**
     * field for OperationInPhases
     */
    protected java.lang.Object localOperationInPhases;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOperationInPhasesTracker = false;

    /**
     * field for OperationOutFaultPhases
     */
    protected java.lang.Object localOperationOutFaultPhases;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOperationOutFaultPhasesTracker = false;

    /**
     * field for OperationOutPhases
     */
    protected java.lang.Object localOperationOutPhases;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOperationOutPhasesTracker = false;

    /**
     * field for OperationPhases
     */
    protected org.apache.axis2.description.xsd.AxisOperation localOperationPhases;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOperationPhasesTracker = false;

    /**
     * field for OutFaultPhaseList
     */
    protected java.lang.Object localOutFaultPhaseList;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOutFaultPhaseListTracker = false;

    public boolean isINPhasesSpecified() {
        return localINPhasesTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getINPhases() {
        return localINPhases;
    }

    /**
     * Auto generated setter method
     * @param param INPhases
     */
    public void setINPhases(java.lang.Object param) {
        localINPhasesTracker = true;

        this.localINPhases = param;
    }

    public boolean isIN_FaultPhasesSpecified() {
        return localIN_FaultPhasesTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getIN_FaultPhases() {
        return localIN_FaultPhases;
    }

    /**
     * Auto generated setter method
     * @param param IN_FaultPhases
     */
    public void setIN_FaultPhases(java.lang.Object param) {
        localIN_FaultPhasesTracker = true;

        this.localIN_FaultPhases = param;
    }

    public boolean isOUTPhasesSpecified() {
        return localOUTPhasesTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getOUTPhases() {
        return localOUTPhases;
    }

    /**
     * Auto generated setter method
     * @param param OUTPhases
     */
    public void setOUTPhases(java.lang.Object param) {
        localOUTPhasesTracker = true;

        this.localOUTPhases = param;
    }

    public boolean isOUT_FaultPhasesSpecified() {
        return localOUT_FaultPhasesTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getOUT_FaultPhases() {
        return localOUT_FaultPhases;
    }

    /**
     * Auto generated setter method
     * @param param OUT_FaultPhases
     */
    public void setOUT_FaultPhases(java.lang.Object param) {
        localOUT_FaultPhasesTracker = true;

        this.localOUT_FaultPhases = param;
    }

    public boolean isGlobalInFaultPhasesSpecified() {
        return localGlobalInFaultPhasesTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getGlobalInFaultPhases() {
        return localGlobalInFaultPhases;
    }

    /**
     * Auto generated setter method
     * @param param GlobalInFaultPhases
     */
    public void setGlobalInFaultPhases(java.lang.Object param) {
        localGlobalInFaultPhasesTracker = true;

        this.localGlobalInFaultPhases = param;
    }

    public boolean isGlobalInflowSpecified() {
        return localGlobalInflowTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getGlobalInflow() {
        return localGlobalInflow;
    }

    /**
     * Auto generated setter method
     * @param param GlobalInflow
     */
    public void setGlobalInflow(java.lang.Object param) {
        localGlobalInflowTracker = true;

        this.localGlobalInflow = param;
    }

    public boolean isGlobalOutPhaseListSpecified() {
        return localGlobalOutPhaseListTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getGlobalOutPhaseList() {
        return localGlobalOutPhaseList;
    }

    /**
     * Auto generated setter method
     * @param param GlobalOutPhaseList
     */
    public void setGlobalOutPhaseList(java.lang.Object param) {
        localGlobalOutPhaseListTracker = true;

        this.localGlobalOutPhaseList = param;
    }

    public boolean isOperationInFaultPhasesSpecified() {
        return localOperationInFaultPhasesTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getOperationInFaultPhases() {
        return localOperationInFaultPhases;
    }

    /**
     * Auto generated setter method
     * @param param OperationInFaultPhases
     */
    public void setOperationInFaultPhases(java.lang.Object param) {
        localOperationInFaultPhasesTracker = true;

        this.localOperationInFaultPhases = param;
    }

    public boolean isOperationInPhasesSpecified() {
        return localOperationInPhasesTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getOperationInPhases() {
        return localOperationInPhases;
    }

    /**
     * Auto generated setter method
     * @param param OperationInPhases
     */
    public void setOperationInPhases(java.lang.Object param) {
        localOperationInPhasesTracker = true;

        this.localOperationInPhases = param;
    }

    public boolean isOperationOutFaultPhasesSpecified() {
        return localOperationOutFaultPhasesTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getOperationOutFaultPhases() {
        return localOperationOutFaultPhases;
    }

    /**
     * Auto generated setter method
     * @param param OperationOutFaultPhases
     */
    public void setOperationOutFaultPhases(java.lang.Object param) {
        localOperationOutFaultPhasesTracker = true;

        this.localOperationOutFaultPhases = param;
    }

    public boolean isOperationOutPhasesSpecified() {
        return localOperationOutPhasesTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getOperationOutPhases() {
        return localOperationOutPhases;
    }

    /**
     * Auto generated setter method
     * @param param OperationOutPhases
     */
    public void setOperationOutPhases(java.lang.Object param) {
        localOperationOutPhasesTracker = true;

        this.localOperationOutPhases = param;
    }

    public boolean isOperationPhasesSpecified() {
        return localOperationPhasesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.description.xsd.AxisOperation
     */
    public org.apache.axis2.description.xsd.AxisOperation getOperationPhases() {
        return localOperationPhases;
    }

    /**
     * Auto generated setter method
     * @param param OperationPhases
     */
    public void setOperationPhases(
        org.apache.axis2.description.xsd.AxisOperation param) {
        localOperationPhasesTracker = true;

        this.localOperationPhases = param;
    }

    public boolean isOutFaultPhaseListSpecified() {
        return localOutFaultPhaseListTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.Object
     */
    public java.lang.Object getOutFaultPhaseList() {
        return localOutFaultPhaseList;
    }

    /**
     * Auto generated setter method
     * @param param OutFaultPhaseList
     */
    public void setOutFaultPhaseList(java.lang.Object param) {
        localOutFaultPhaseListTracker = true;

        this.localOutFaultPhaseList = param;
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
                    "http://util.deployment.axis2.apache.org/xsd");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":PhasesInfo", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "PhasesInfo", xmlWriter);
            }
        }

        if (localINPhasesTracker) {
            if (localINPhases != null) {
                if (localINPhases instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localINPhases).serialize(new javax.xml.namespace.QName(
                            "http://util.deployment.axis2.apache.org/xsd",
                            "INPhases"), xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://util.deployment.axis2.apache.org/xsd",
                        "INPhases", xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localINPhases,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://util.deployment.axis2.apache.org/xsd", "INPhases",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localIN_FaultPhasesTracker) {
            if (localIN_FaultPhases != null) {
                if (localIN_FaultPhases instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localIN_FaultPhases).serialize(new javax.xml.namespace.QName(
                            "http://util.deployment.axis2.apache.org/xsd",
                            "IN_FaultPhases"), xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://util.deployment.axis2.apache.org/xsd",
                        "IN_FaultPhases", xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localIN_FaultPhases,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://util.deployment.axis2.apache.org/xsd",
                    "IN_FaultPhases", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localOUTPhasesTracker) {
            if (localOUTPhases != null) {
                if (localOUTPhases instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localOUTPhases).serialize(new javax.xml.namespace.QName(
                            "http://util.deployment.axis2.apache.org/xsd",
                            "OUTPhases"), xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://util.deployment.axis2.apache.org/xsd",
                        "OUTPhases", xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localOUTPhases,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://util.deployment.axis2.apache.org/xsd", "OUTPhases",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localOUT_FaultPhasesTracker) {
            if (localOUT_FaultPhases != null) {
                if (localOUT_FaultPhases instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localOUT_FaultPhases).serialize(new javax.xml.namespace.QName(
                            "http://util.deployment.axis2.apache.org/xsd",
                            "OUT_FaultPhases"), xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://util.deployment.axis2.apache.org/xsd",
                        "OUT_FaultPhases", xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localOUT_FaultPhases,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://util.deployment.axis2.apache.org/xsd",
                    "OUT_FaultPhases", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localGlobalInFaultPhasesTracker) {
            if (localGlobalInFaultPhases != null) {
                if (localGlobalInFaultPhases instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localGlobalInFaultPhases).serialize(new javax.xml.namespace.QName(
                            "http://util.deployment.axis2.apache.org/xsd",
                            "globalInFaultPhases"), xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://util.deployment.axis2.apache.org/xsd",
                        "globalInFaultPhases", xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localGlobalInFaultPhases,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://util.deployment.axis2.apache.org/xsd",
                    "globalInFaultPhases", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localGlobalInflowTracker) {
            if (localGlobalInflow != null) {
                if (localGlobalInflow instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localGlobalInflow).serialize(new javax.xml.namespace.QName(
                            "http://util.deployment.axis2.apache.org/xsd",
                            "globalInflow"), xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://util.deployment.axis2.apache.org/xsd",
                        "globalInflow", xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localGlobalInflow,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://util.deployment.axis2.apache.org/xsd",
                    "globalInflow", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localGlobalOutPhaseListTracker) {
            if (localGlobalOutPhaseList != null) {
                if (localGlobalOutPhaseList instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localGlobalOutPhaseList).serialize(new javax.xml.namespace.QName(
                            "http://util.deployment.axis2.apache.org/xsd",
                            "globalOutPhaseList"), xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://util.deployment.axis2.apache.org/xsd",
                        "globalOutPhaseList", xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localGlobalOutPhaseList,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://util.deployment.axis2.apache.org/xsd",
                    "globalOutPhaseList", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localOperationInFaultPhasesTracker) {
            if (localOperationInFaultPhases != null) {
                if (localOperationInFaultPhases instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localOperationInFaultPhases).serialize(new javax.xml.namespace.QName(
                            "http://util.deployment.axis2.apache.org/xsd",
                            "operationInFaultPhases"), xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://util.deployment.axis2.apache.org/xsd",
                        "operationInFaultPhases", xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localOperationInFaultPhases,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://util.deployment.axis2.apache.org/xsd",
                    "operationInFaultPhases", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localOperationInPhasesTracker) {
            if (localOperationInPhases != null) {
                if (localOperationInPhases instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localOperationInPhases).serialize(new javax.xml.namespace.QName(
                            "http://util.deployment.axis2.apache.org/xsd",
                            "operationInPhases"), xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://util.deployment.axis2.apache.org/xsd",
                        "operationInPhases", xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localOperationInPhases,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://util.deployment.axis2.apache.org/xsd",
                    "operationInPhases", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localOperationOutFaultPhasesTracker) {
            if (localOperationOutFaultPhases != null) {
                if (localOperationOutFaultPhases instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localOperationOutFaultPhases).serialize(new javax.xml.namespace.QName(
                            "http://util.deployment.axis2.apache.org/xsd",
                            "operationOutFaultPhases"), xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://util.deployment.axis2.apache.org/xsd",
                        "operationOutFaultPhases", xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localOperationOutFaultPhases,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://util.deployment.axis2.apache.org/xsd",
                    "operationOutFaultPhases", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localOperationOutPhasesTracker) {
            if (localOperationOutPhases != null) {
                if (localOperationOutPhases instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localOperationOutPhases).serialize(new javax.xml.namespace.QName(
                            "http://util.deployment.axis2.apache.org/xsd",
                            "operationOutPhases"), xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://util.deployment.axis2.apache.org/xsd",
                        "operationOutPhases", xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localOperationOutPhases,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://util.deployment.axis2.apache.org/xsd",
                    "operationOutPhases", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localOperationPhasesTracker) {
            if (localOperationPhases == null) {
                writeStartElement(null,
                    "http://util.deployment.axis2.apache.org/xsd",
                    "operationPhases", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localOperationPhases.serialize(new javax.xml.namespace.QName(
                        "http://util.deployment.axis2.apache.org/xsd",
                        "operationPhases"), xmlWriter);
            }
        }

        if (localOutFaultPhaseListTracker) {
            if (localOutFaultPhaseList != null) {
                if (localOutFaultPhaseList instanceof org.apache.axis2.databinding.ADBBean) {
                    ((org.apache.axis2.databinding.ADBBean) localOutFaultPhaseList).serialize(new javax.xml.namespace.QName(
                            "http://util.deployment.axis2.apache.org/xsd",
                            "outFaultPhaseList"), xmlWriter, true);
                } else {
                    writeStartElement(null,
                        "http://util.deployment.axis2.apache.org/xsd",
                        "outFaultPhaseList", xmlWriter);
                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localOutFaultPhaseList,
                        xmlWriter);
                    xmlWriter.writeEndElement();
                }
            } else {
                // write null attribute
                writeStartElement(null,
                    "http://util.deployment.axis2.apache.org/xsd",
                    "outFaultPhaseList", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://util.deployment.axis2.apache.org/xsd")) {
            return "ns24";
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
        public static PhasesInfo parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            PhasesInfo object = new PhasesInfo();

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

                        if (!"PhasesInfo".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (PhasesInfo) org.apache.axis2.transaction.xsd.ExtensionMapper.getTypeObject(nsUri,
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
                            "http://util.deployment.axis2.apache.org/xsd",
                            "INPhases").equals(reader.getName())) {
                    object.setINPhases(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
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
                            "http://util.deployment.axis2.apache.org/xsd",
                            "IN_FaultPhases").equals(reader.getName())) {
                    object.setIN_FaultPhases(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
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
                            "http://util.deployment.axis2.apache.org/xsd",
                            "OUTPhases").equals(reader.getName())) {
                    object.setOUTPhases(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
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
                            "http://util.deployment.axis2.apache.org/xsd",
                            "OUT_FaultPhases").equals(reader.getName())) {
                    object.setOUT_FaultPhases(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
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
                            "http://util.deployment.axis2.apache.org/xsd",
                            "globalInFaultPhases").equals(reader.getName())) {
                    object.setGlobalInFaultPhases(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
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
                            "http://util.deployment.axis2.apache.org/xsd",
                            "globalInflow").equals(reader.getName())) {
                    object.setGlobalInflow(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
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
                            "http://util.deployment.axis2.apache.org/xsd",
                            "globalOutPhaseList").equals(reader.getName())) {
                    object.setGlobalOutPhaseList(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
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
                            "http://util.deployment.axis2.apache.org/xsd",
                            "operationInFaultPhases").equals(reader.getName())) {
                    object.setOperationInFaultPhases(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
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
                            "http://util.deployment.axis2.apache.org/xsd",
                            "operationInPhases").equals(reader.getName())) {
                    object.setOperationInPhases(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
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
                            "http://util.deployment.axis2.apache.org/xsd",
                            "operationOutFaultPhases").equals(reader.getName())) {
                    object.setOperationOutFaultPhases(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
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
                            "http://util.deployment.axis2.apache.org/xsd",
                            "operationOutPhases").equals(reader.getName())) {
                    object.setOperationOutPhases(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
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
                            "http://util.deployment.axis2.apache.org/xsd",
                            "operationPhases").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setOperationPhases(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setOperationPhases(org.apache.axis2.description.xsd.AxisOperation.Factory.parse(
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
                            "http://util.deployment.axis2.apache.org/xsd",
                            "outFaultPhaseList").equals(reader.getName())) {
                    object.setOutFaultPhaseList(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
                            reader,
                            org.apache.axis2.transaction.xsd.ExtensionMapper.class));

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
