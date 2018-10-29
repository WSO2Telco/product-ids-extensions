/*
 * XML Type:  tTaskAbstract
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803;


/**
 * An XML tTaskAbstract(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public interface TTaskAbstract extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TTaskAbstract.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B376691F9828D2A29ED491729187FB4").resolveHandle("ttaskabstract70a0type");
    
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
     * True if has "priority" element
     */
    boolean isSetPriority();
    
    /**
     * Sets the "priority" element
     */
    void setPriority(int priority);
    
    /**
     * Sets (as xml) the "priority" element
     */
    void xsetPriority(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPriority priority);
    
    /**
     * Unsets the "priority" element
     */
    void unsetPriority();
    
    /**
     * Gets the "taskInitiator" element
     */
    java.lang.String getTaskInitiator();
    
    /**
     * Gets (as xml) the "taskInitiator" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser xgetTaskInitiator();
    
    /**
     * True if has "taskInitiator" element
     */
    boolean isSetTaskInitiator();
    
    /**
     * Sets the "taskInitiator" element
     */
    void setTaskInitiator(java.lang.String taskInitiator);
    
    /**
     * Sets (as xml) the "taskInitiator" element
     */
    void xsetTaskInitiator(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser taskInitiator);
    
    /**
     * Unsets the "taskInitiator" element
     */
    void unsetTaskInitiator();
    
    /**
     * Gets the "taskStakeholders" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity getTaskStakeholders();
    
    /**
     * True if has "taskStakeholders" element
     */
    boolean isSetTaskStakeholders();
    
    /**
     * Sets the "taskStakeholders" element
     */
    void setTaskStakeholders(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity taskStakeholders);
    
    /**
     * Appends and returns a new empty "taskStakeholders" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity addNewTaskStakeholders();
    
    /**
     * Unsets the "taskStakeholders" element
     */
    void unsetTaskStakeholders();
    
    /**
     * Gets the "potentialOwners" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity getPotentialOwners();
    
    /**
     * True if has "potentialOwners" element
     */
    boolean isSetPotentialOwners();
    
    /**
     * Sets the "potentialOwners" element
     */
    void setPotentialOwners(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity potentialOwners);
    
    /**
     * Appends and returns a new empty "potentialOwners" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity addNewPotentialOwners();
    
    /**
     * Unsets the "potentialOwners" element
     */
    void unsetPotentialOwners();
    
    /**
     * Gets the "businessAdministrators" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity getBusinessAdministrators();
    
    /**
     * True if has "businessAdministrators" element
     */
    boolean isSetBusinessAdministrators();
    
    /**
     * Sets the "businessAdministrators" element
     */
    void setBusinessAdministrators(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity businessAdministrators);
    
    /**
     * Appends and returns a new empty "businessAdministrators" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity addNewBusinessAdministrators();
    
    /**
     * Unsets the "businessAdministrators" element
     */
    void unsetBusinessAdministrators();
    
    /**
     * Gets the "actualOwner" element
     */
    java.lang.String getActualOwner();
    
    /**
     * Gets (as xml) the "actualOwner" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser xgetActualOwner();
    
    /**
     * True if has "actualOwner" element
     */
    boolean isSetActualOwner();
    
    /**
     * Sets the "actualOwner" element
     */
    void setActualOwner(java.lang.String actualOwner);
    
    /**
     * Sets (as xml) the "actualOwner" element
     */
    void xsetActualOwner(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TUser actualOwner);
    
    /**
     * Unsets the "actualOwner" element
     */
    void unsetActualOwner();
    
    /**
     * Gets the "notificationRecipients" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity getNotificationRecipients();
    
    /**
     * True if has "notificationRecipients" element
     */
    boolean isSetNotificationRecipients();
    
    /**
     * Sets the "notificationRecipients" element
     */
    void setNotificationRecipients(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity notificationRecipients);
    
    /**
     * Appends and returns a new empty "notificationRecipients" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity addNewNotificationRecipients();
    
    /**
     * Unsets the "notificationRecipients" element
     */
    void unsetNotificationRecipients();
    
    /**
     * Gets the "createdTime" element
     */
    java.util.Calendar getCreatedTime();
    
    /**
     * Gets (as xml) the "createdTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCreatedTime();
    
    /**
     * Sets the "createdTime" element
     */
    void setCreatedTime(java.util.Calendar createdTime);
    
    /**
     * Sets (as xml) the "createdTime" element
     */
    void xsetCreatedTime(org.apache.xmlbeans.XmlDateTime createdTime);
    
    /**
     * Gets the "updatedTime" element
     */
    java.util.Calendar getUpdatedTime();
    
    /**
     * Gets (as xml) the "updatedTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetUpdatedTime();
    
    /**
     * Sets the "updatedTime" element
     */
    void setUpdatedTime(java.util.Calendar updatedTime);
    
    /**
     * Sets (as xml) the "updatedTime" element
     */
    void xsetUpdatedTime(org.apache.xmlbeans.XmlDateTime updatedTime);
    
    /**
     * Gets the "activationTime" element
     */
    java.util.Calendar getActivationTime();
    
    /**
     * Gets (as xml) the "activationTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetActivationTime();
    
    /**
     * True if has "activationTime" element
     */
    boolean isSetActivationTime();
    
    /**
     * Sets the "activationTime" element
     */
    void setActivationTime(java.util.Calendar activationTime);
    
    /**
     * Sets (as xml) the "activationTime" element
     */
    void xsetActivationTime(org.apache.xmlbeans.XmlDateTime activationTime);
    
    /**
     * Unsets the "activationTime" element
     */
    void unsetActivationTime();
    
    /**
     * Gets the "expirationTime" element
     */
    java.util.Calendar getExpirationTime();
    
    /**
     * Gets (as xml) the "expirationTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetExpirationTime();
    
    /**
     * True if has "expirationTime" element
     */
    boolean isSetExpirationTime();
    
    /**
     * Sets the "expirationTime" element
     */
    void setExpirationTime(java.util.Calendar expirationTime);
    
    /**
     * Sets (as xml) the "expirationTime" element
     */
    void xsetExpirationTime(org.apache.xmlbeans.XmlDateTime expirationTime);
    
    /**
     * Unsets the "expirationTime" element
     */
    void unsetExpirationTime();
    
    /**
     * Gets the "isSkipable" element
     */
    boolean getIsSkipable();
    
    /**
     * Gets (as xml) the "isSkipable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsSkipable();
    
    /**
     * True if has "isSkipable" element
     */
    boolean isSetIsSkipable();
    
    /**
     * Sets the "isSkipable" element
     */
    void setIsSkipable(boolean isSkipable);
    
    /**
     * Sets (as xml) the "isSkipable" element
     */
    void xsetIsSkipable(org.apache.xmlbeans.XmlBoolean isSkipable);
    
    /**
     * Unsets the "isSkipable" element
     */
    void unsetIsSkipable();
    
    /**
     * Gets the "hasPotentialOwners" element
     */
    boolean getHasPotentialOwners();
    
    /**
     * Gets (as xml) the "hasPotentialOwners" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHasPotentialOwners();
    
    /**
     * True if has "hasPotentialOwners" element
     */
    boolean isSetHasPotentialOwners();
    
    /**
     * Sets the "hasPotentialOwners" element
     */
    void setHasPotentialOwners(boolean hasPotentialOwners);
    
    /**
     * Sets (as xml) the "hasPotentialOwners" element
     */
    void xsetHasPotentialOwners(org.apache.xmlbeans.XmlBoolean hasPotentialOwners);
    
    /**
     * Unsets the "hasPotentialOwners" element
     */
    void unsetHasPotentialOwners();
    
    /**
     * Gets the "startByTimeExists" element
     */
    boolean getStartByTimeExists();
    
    /**
     * Gets (as xml) the "startByTimeExists" element
     */
    org.apache.xmlbeans.XmlBoolean xgetStartByTimeExists();
    
    /**
     * True if has "startByTimeExists" element
     */
    boolean isSetStartByTimeExists();
    
    /**
     * Sets the "startByTimeExists" element
     */
    void setStartByTimeExists(boolean startByTimeExists);
    
    /**
     * Sets (as xml) the "startByTimeExists" element
     */
    void xsetStartByTimeExists(org.apache.xmlbeans.XmlBoolean startByTimeExists);
    
    /**
     * Unsets the "startByTimeExists" element
     */
    void unsetStartByTimeExists();
    
    /**
     * Gets the "completeByTimeExists" element
     */
    boolean getCompleteByTimeExists();
    
    /**
     * Gets (as xml) the "completeByTimeExists" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCompleteByTimeExists();
    
    /**
     * True if has "completeByTimeExists" element
     */
    boolean isSetCompleteByTimeExists();
    
    /**
     * Sets the "completeByTimeExists" element
     */
    void setCompleteByTimeExists(boolean completeByTimeExists);
    
    /**
     * Sets (as xml) the "completeByTimeExists" element
     */
    void xsetCompleteByTimeExists(org.apache.xmlbeans.XmlBoolean completeByTimeExists);
    
    /**
     * Unsets the "completeByTimeExists" element
     */
    void unsetCompleteByTimeExists();
    
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
     * Gets the "presentationDescription" element
     */
    java.lang.String getPresentationDescription();
    
    /**
     * Gets (as xml) the "presentationDescription" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationDescription xgetPresentationDescription();
    
    /**
     * True if has "presentationDescription" element
     */
    boolean isSetPresentationDescription();
    
    /**
     * Sets the "presentationDescription" element
     */
    void setPresentationDescription(java.lang.String presentationDescription);
    
    /**
     * Sets (as xml) the "presentationDescription" element
     */
    void xsetPresentationDescription(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TPresentationDescription presentationDescription);
    
    /**
     * Unsets the "presentationDescription" element
     */
    void unsetPresentationDescription();
    
    /**
     * Gets the "renderingMethodExists" element
     */
    boolean getRenderingMethodExists();
    
    /**
     * Gets (as xml) the "renderingMethodExists" element
     */
    org.apache.xmlbeans.XmlBoolean xgetRenderingMethodExists();
    
    /**
     * Sets the "renderingMethodExists" element
     */
    void setRenderingMethodExists(boolean renderingMethodExists);
    
    /**
     * Sets (as xml) the "renderingMethodExists" element
     */
    void xsetRenderingMethodExists(org.apache.xmlbeans.XmlBoolean renderingMethodExists);
    
    /**
     * Gets the "hasOutput" element
     */
    boolean getHasOutput();
    
    /**
     * Gets (as xml) the "hasOutput" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHasOutput();
    
    /**
     * True if has "hasOutput" element
     */
    boolean isSetHasOutput();
    
    /**
     * Sets the "hasOutput" element
     */
    void setHasOutput(boolean hasOutput);
    
    /**
     * Sets (as xml) the "hasOutput" element
     */
    void xsetHasOutput(org.apache.xmlbeans.XmlBoolean hasOutput);
    
    /**
     * Unsets the "hasOutput" element
     */
    void unsetHasOutput();
    
    /**
     * Gets the "hasFault" element
     */
    boolean getHasFault();
    
    /**
     * Gets (as xml) the "hasFault" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHasFault();
    
    /**
     * True if has "hasFault" element
     */
    boolean isSetHasFault();
    
    /**
     * Sets the "hasFault" element
     */
    void setHasFault(boolean hasFault);
    
    /**
     * Sets (as xml) the "hasFault" element
     */
    void xsetHasFault(org.apache.xmlbeans.XmlBoolean hasFault);
    
    /**
     * Unsets the "hasFault" element
     */
    void unsetHasFault();
    
    /**
     * Gets the "hasAttachments" element
     */
    boolean getHasAttachments();
    
    /**
     * Gets (as xml) the "hasAttachments" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHasAttachments();
    
    /**
     * True if has "hasAttachments" element
     */
    boolean isSetHasAttachments();
    
    /**
     * Sets the "hasAttachments" element
     */
    void setHasAttachments(boolean hasAttachments);
    
    /**
     * Sets (as xml) the "hasAttachments" element
     */
    void xsetHasAttachments(org.apache.xmlbeans.XmlBoolean hasAttachments);
    
    /**
     * Unsets the "hasAttachments" element
     */
    void unsetHasAttachments();
    
    /**
     * Gets the "hasComments" element
     */
    boolean getHasComments();
    
    /**
     * Gets (as xml) the "hasComments" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHasComments();
    
    /**
     * True if has "hasComments" element
     */
    boolean isSetHasComments();
    
    /**
     * Sets the "hasComments" element
     */
    void setHasComments(boolean hasComments);
    
    /**
     * Sets (as xml) the "hasComments" element
     */
    void xsetHasComments(org.apache.xmlbeans.XmlBoolean hasComments);
    
    /**
     * Unsets the "hasComments" element
     */
    void unsetHasComments();
    
    /**
     * Gets the "escalated" element
     */
    boolean getEscalated();
    
    /**
     * Gets (as xml) the "escalated" element
     */
    org.apache.xmlbeans.XmlBoolean xgetEscalated();
    
    /**
     * True if has "escalated" element
     */
    boolean isSetEscalated();
    
    /**
     * Sets the "escalated" element
     */
    void setEscalated(boolean escalated);
    
    /**
     * Sets (as xml) the "escalated" element
     */
    void xsetEscalated(org.apache.xmlbeans.XmlBoolean escalated);
    
    /**
     * Unsets the "escalated" element
     */
    void unsetEscalated();
    
    /**
     * Gets the "outcome" element
     */
    java.lang.String getOutcome();
    
    /**
     * Gets (as xml) the "outcome" element
     */
    org.apache.xmlbeans.XmlString xgetOutcome();
    
    /**
     * True if has "outcome" element
     */
    boolean isSetOutcome();
    
    /**
     * Sets the "outcome" element
     */
    void setOutcome(java.lang.String outcome);
    
    /**
     * Sets (as xml) the "outcome" element
     */
    void xsetOutcome(org.apache.xmlbeans.XmlString outcome);
    
    /**
     * Unsets the "outcome" element
     */
    void unsetOutcome();
    
    /**
     * Gets the "parentTaskId" element
     */
    java.lang.String getParentTaskId();
    
    /**
     * Gets (as xml) the "parentTaskId" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetParentTaskId();
    
    /**
     * True if has "parentTaskId" element
     */
    boolean isSetParentTaskId();
    
    /**
     * Sets the "parentTaskId" element
     */
    void setParentTaskId(java.lang.String parentTaskId);
    
    /**
     * Sets (as xml) the "parentTaskId" element
     */
    void xsetParentTaskId(org.apache.xmlbeans.XmlAnyURI parentTaskId);
    
    /**
     * Unsets the "parentTaskId" element
     */
    void unsetParentTaskId();
    
    /**
     * Gets the "hasSubTasks" element
     */
    boolean getHasSubTasks();
    
    /**
     * Gets (as xml) the "hasSubTasks" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHasSubTasks();
    
    /**
     * True if has "hasSubTasks" element
     */
    boolean isSetHasSubTasks();
    
    /**
     * Sets the "hasSubTasks" element
     */
    void setHasSubTasks(boolean hasSubTasks);
    
    /**
     * Sets (as xml) the "hasSubTasks" element
     */
    void xsetHasSubTasks(org.apache.xmlbeans.XmlBoolean hasSubTasks);
    
    /**
     * Unsets the "hasSubTasks" element
     */
    void unsetHasSubTasks();
    
    /**
     * Gets the "numberOfComments" element
     */
    int getNumberOfComments();
    
    /**
     * Gets (as xml) the "numberOfComments" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberOfComments();
    
    /**
     * True if has "numberOfComments" element
     */
    boolean isSetNumberOfComments();
    
    /**
     * Sets the "numberOfComments" element
     */
    void setNumberOfComments(int numberOfComments);
    
    /**
     * Sets (as xml) the "numberOfComments" element
     */
    void xsetNumberOfComments(org.apache.xmlbeans.XmlInt numberOfComments);
    
    /**
     * Unsets the "numberOfComments" element
     */
    void unsetNumberOfComments();
    
    /**
     * Gets the "numberOfAttachments" element
     */
    int getNumberOfAttachments();
    
    /**
     * Gets (as xml) the "numberOfAttachments" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberOfAttachments();
    
    /**
     * True if has "numberOfAttachments" element
     */
    boolean isSetNumberOfAttachments();
    
    /**
     * Sets the "numberOfAttachments" element
     */
    void setNumberOfAttachments(int numberOfAttachments);
    
    /**
     * Sets (as xml) the "numberOfAttachments" element
     */
    void xsetNumberOfAttachments(org.apache.xmlbeans.XmlInt numberOfAttachments);
    
    /**
     * Unsets the "numberOfAttachments" element
     */
    void unsetNumberOfAttachments();
    
    /**
     * Gets the "previousStatus" element
     */
    java.lang.String getPreviousStatus();
    
    /**
     * Gets (as xml) the "previousStatus" element
     */
    org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus xgetPreviousStatus();
    
    /**
     * True if has "previousStatus" element
     */
    boolean isSetPreviousStatus();
    
    /**
     * Sets the "previousStatus" element
     */
    void setPreviousStatus(java.lang.String previousStatus);
    
    /**
     * Sets (as xml) the "previousStatus" element
     */
    void xsetPreviousStatus(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TStatus previousStatus);
    
    /**
     * Unsets the "previousStatus" element
     */
    void unsetPreviousStatus();
    
    /**
     * Gets the "responseServiceName" element
     */
    java.lang.String getResponseServiceName();
    
    /**
     * Gets (as xml) the "responseServiceName" element
     */
    org.apache.xmlbeans.XmlString xgetResponseServiceName();
    
    /**
     * True if has "responseServiceName" element
     */
    boolean isSetResponseServiceName();
    
    /**
     * Sets the "responseServiceName" element
     */
    void setResponseServiceName(java.lang.String responseServiceName);
    
    /**
     * Sets (as xml) the "responseServiceName" element
     */
    void xsetResponseServiceName(org.apache.xmlbeans.XmlString responseServiceName);
    
    /**
     * Unsets the "responseServiceName" element
     */
    void unsetResponseServiceName();
    
    /**
     * Gets the "responseOperationName" element
     */
    java.lang.String getResponseOperationName();
    
    /**
     * Gets (as xml) the "responseOperationName" element
     */
    org.apache.xmlbeans.XmlString xgetResponseOperationName();
    
    /**
     * True if has "responseOperationName" element
     */
    boolean isSetResponseOperationName();
    
    /**
     * Sets the "responseOperationName" element
     */
    void setResponseOperationName(java.lang.String responseOperationName);
    
    /**
     * Sets (as xml) the "responseOperationName" element
     */
    void xsetResponseOperationName(org.apache.xmlbeans.XmlString responseOperationName);
    
    /**
     * Unsets the "responseOperationName" element
     */
    void unsetResponseOperationName();
    
    /**
     * Gets the "isClaimable" element
     */
    boolean getIsClaimable();
    
    /**
     * Gets (as xml) the "isClaimable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsClaimable();
    
    /**
     * True if has "isClaimable" element
     */
    boolean isSetIsClaimable();
    
    /**
     * Sets the "isClaimable" element
     */
    void setIsClaimable(boolean isClaimable);
    
    /**
     * Sets (as xml) the "isClaimable" element
     */
    void xsetIsClaimable(org.apache.xmlbeans.XmlBoolean isClaimable);
    
    /**
     * Unsets the "isClaimable" element
     */
    void unsetIsClaimable();
    
    /**
     * Gets the "isStartable" element
     */
    boolean getIsStartable();
    
    /**
     * Gets (as xml) the "isStartable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsStartable();
    
    /**
     * True if has "isStartable" element
     */
    boolean isSetIsStartable();
    
    /**
     * Sets the "isStartable" element
     */
    void setIsStartable(boolean isStartable);
    
    /**
     * Sets (as xml) the "isStartable" element
     */
    void xsetIsStartable(org.apache.xmlbeans.XmlBoolean isStartable);
    
    /**
     * Unsets the "isStartable" element
     */
    void unsetIsStartable();
    
    /**
     * Gets the "isStopable" element
     */
    boolean getIsStopable();
    
    /**
     * Gets (as xml) the "isStopable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsStopable();
    
    /**
     * True if has "isStopable" element
     */
    boolean isSetIsStopable();
    
    /**
     * Sets the "isStopable" element
     */
    void setIsStopable(boolean isStopable);
    
    /**
     * Sets (as xml) the "isStopable" element
     */
    void xsetIsStopable(org.apache.xmlbeans.XmlBoolean isStopable);
    
    /**
     * Unsets the "isStopable" element
     */
    void unsetIsStopable();
    
    /**
     * Gets the "isReleasable" element
     */
    boolean getIsReleasable();
    
    /**
     * Gets (as xml) the "isReleasable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsReleasable();
    
    /**
     * True if has "isReleasable" element
     */
    boolean isSetIsReleasable();
    
    /**
     * Sets the "isReleasable" element
     */
    void setIsReleasable(boolean isReleasable);
    
    /**
     * Sets (as xml) the "isReleasable" element
     */
    void xsetIsReleasable(org.apache.xmlbeans.XmlBoolean isReleasable);
    
    /**
     * Unsets the "isReleasable" element
     */
    void unsetIsReleasable();
    
    /**
     * Gets the "isSuspendable" element
     */
    boolean getIsSuspendable();
    
    /**
     * Gets (as xml) the "isSuspendable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsSuspendable();
    
    /**
     * True if has "isSuspendable" element
     */
    boolean isSetIsSuspendable();
    
    /**
     * Sets the "isSuspendable" element
     */
    void setIsSuspendable(boolean isSuspendable);
    
    /**
     * Sets (as xml) the "isSuspendable" element
     */
    void xsetIsSuspendable(org.apache.xmlbeans.XmlBoolean isSuspendable);
    
    /**
     * Unsets the "isSuspendable" element
     */
    void unsetIsSuspendable();
    
    /**
     * Gets the "isResumable" element
     */
    boolean getIsResumable();
    
    /**
     * Gets (as xml) the "isResumable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsResumable();
    
    /**
     * True if has "isResumable" element
     */
    boolean isSetIsResumable();
    
    /**
     * Sets the "isResumable" element
     */
    void setIsResumable(boolean isResumable);
    
    /**
     * Sets (as xml) the "isResumable" element
     */
    void xsetIsResumable(org.apache.xmlbeans.XmlBoolean isResumable);
    
    /**
     * Unsets the "isResumable" element
     */
    void unsetIsResumable();
    
    /**
     * Gets the "isCompletable" element
     */
    boolean getIsCompletable();
    
    /**
     * Gets (as xml) the "isCompletable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsCompletable();
    
    /**
     * True if has "isCompletable" element
     */
    boolean isSetIsCompletable();
    
    /**
     * Sets the "isCompletable" element
     */
    void setIsCompletable(boolean isCompletable);
    
    /**
     * Sets (as xml) the "isCompletable" element
     */
    void xsetIsCompletable(org.apache.xmlbeans.XmlBoolean isCompletable);
    
    /**
     * Unsets the "isCompletable" element
     */
    void unsetIsCompletable();
    
    /**
     * Gets the "isRemovable" element
     */
    boolean getIsRemovable();
    
    /**
     * Gets (as xml) the "isRemovable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsRemovable();
    
    /**
     * True if has "isRemovable" element
     */
    boolean isSetIsRemovable();
    
    /**
     * Sets the "isRemovable" element
     */
    void setIsRemovable(boolean isRemovable);
    
    /**
     * Sets (as xml) the "isRemovable" element
     */
    void xsetIsRemovable(org.apache.xmlbeans.XmlBoolean isRemovable);
    
    /**
     * Unsets the "isRemovable" element
     */
    void unsetIsRemovable();
    
    /**
     * Gets the "isForwardable" element
     */
    boolean getIsForwardable();
    
    /**
     * Gets (as xml) the "isForwardable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsForwardable();
    
    /**
     * True if has "isForwardable" element
     */
    boolean isSetIsForwardable();
    
    /**
     * Sets the "isForwardable" element
     */
    void setIsForwardable(boolean isForwardable);
    
    /**
     * Sets (as xml) the "isForwardable" element
     */
    void xsetIsForwardable(org.apache.xmlbeans.XmlBoolean isForwardable);
    
    /**
     * Unsets the "isForwardable" element
     */
    void unsetIsForwardable();
    
    /**
     * Gets the "isDelegatable" element
     */
    boolean getIsDelegatable();
    
    /**
     * Gets (as xml) the "isDelegatable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsDelegatable();
    
    /**
     * True if has "isDelegatable" element
     */
    boolean isSetIsDelegatable();
    
    /**
     * Sets the "isDelegatable" element
     */
    void setIsDelegatable(boolean isDelegatable);
    
    /**
     * Sets (as xml) the "isDelegatable" element
     */
    void xsetIsDelegatable(org.apache.xmlbeans.XmlBoolean isDelegatable);
    
    /**
     * Unsets the "isDelegatable" element
     */
    void unsetIsDelegatable();
    
    /**
     * Gets the "packageName" element
     */
    java.lang.String getPackageName();
    
    /**
     * Gets (as xml) the "packageName" element
     */
    org.apache.xmlbeans.XmlString xgetPackageName();
    
    /**
     * Sets the "packageName" element
     */
    void setPackageName(java.lang.String packageName);
    
    /**
     * Sets (as xml) the "packageName" element
     */
    void xsetPackageName(org.apache.xmlbeans.XmlString packageName);
    
    /**
     * Gets the "tenantId" element
     */
    int getTenantId();
    
    /**
     * Gets (as xml) the "tenantId" element
     */
    org.apache.xmlbeans.XmlInt xgetTenantId();
    
    /**
     * True if has "tenantId" element
     */
    boolean isSetTenantId();
    
    /**
     * Sets the "tenantId" element
     */
    void setTenantId(int tenantId);
    
    /**
     * Sets (as xml) the "tenantId" element
     */
    void xsetTenantId(org.apache.xmlbeans.XmlInt tenantId);
    
    /**
     * Unsets the "tenantId" element
     */
    void unsetTenantId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract newInstance() {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
