/**
 * HumanTaskClientAPIAdmin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;


/*
 *  HumanTaskClientAPIAdmin java interface
 */
public interface HumanTaskClientAPIAdmin {
    /**
     * Auto generated method signature
     *
     * @param deleteComment0
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteCommentResponseDocument deleteComment(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteCommentDocument deleteComment0)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deleteComment0
     */
    public void startdeleteComment(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteCommentDocument deleteComment0,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getOutcome2
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutcomeResponseDocument getOutcome(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutcomeDocument getOutcome2)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getOutcome2
     */
    public void startgetOutcome(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutcomeDocument getOutcome2,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getRendering4
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingResponseDocument getRendering(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingDocument getRendering4)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getRendering4
     */
    public void startgetRendering(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingDocument getRendering4,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getSubtasks6
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksResponseDocument getSubtasks(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksDocument getSubtasks6)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getSubtasks6
     */
    public void startgetSubtasks(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtasksDocument getSubtasks6,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param remove8
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.RemoveResponseDocument remove(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.RemoveDocument remove8)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param remove8
     */
    public void startremove(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.RemoveDocument remove8,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getMyTaskAbstracts10
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsResponseDocument getMyTaskAbstracts(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument getMyTaskAbstracts10)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getMyTaskAbstracts10
     */
    public void startgetMyTaskAbstracts(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskAbstractsDocument getMyTaskAbstracts10,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getRenderingTypes12
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingTypesResponseDocument getRenderingTypes(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingTypesDocument getRenderingTypes12)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getRenderingTypes12
     */
    public void startgetRenderingTypes(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingTypesDocument getRenderingTypes12,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param skip14
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SkipResponseDocument skip(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SkipDocument skip14)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param skip14
     */
    public void startskip(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SkipDocument skip14,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchClaim16
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchClaimResponseDocument batchClaim(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchClaimDocument batchClaim16)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchClaim16
     */
    public void startbatchClaim(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchClaimDocument batchClaim16,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchSuspendUntil18
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilResponseDocument batchSuspendUntil(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument batchSuspendUntil18)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchSuspendUntil18
     */
    public void startbatchSuspendUntil(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendUntilDocument batchSuspendUntil18,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param loadAuthorisationParams20
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsResponseDocument loadAuthorisationParams(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsDocument loadAuthorisationParams20)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param loadAuthorisationParams20
     */
    public void startloadAuthorisationParams(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadAuthorisationParamsDocument loadAuthorisationParams20,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param delegate22
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.RecipientNotAllowedException :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DelegateResponseDocument delegate(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DelegateDocument delegate22)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.RecipientNotAllowedException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param delegate22
     */
    public void startdelegate(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DelegateDocument delegate22,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getOutput24
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputResponseDocument getOutput(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputDocument getOutput24)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getOutput24
     */
    public void startgetOutput(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetOutputDocument getOutput24,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setOutput26
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputResponseDocument setOutput(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument setOutput26)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setOutput26
     */
    public void startsetOutput(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetOutputDocument setOutput26,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchFail28
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchFailResponseDocument batchFail(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchFailDocument batchFail28)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchFail28
     */
    public void startbatchFail(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchFailDocument batchFail28,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchSetPriority30
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSetPriorityResponseDocument batchSetPriority(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSetPriorityDocument batchSetPriority30)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchSetPriority30
     */
    public void startbatchSetPriority(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSetPriorityDocument batchSetPriority30,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param loadTaskEvents32
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskEventsResponseDocument loadTaskEvents(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskEventsDocument loadTaskEvents32)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param loadTaskEvents32
     */
    public void startloadTaskEvents(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskEventsDocument loadTaskEvents32,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAttachmentInfos34
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentInfosResponseDocument getAttachmentInfos(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentInfosDocument getAttachmentInfos34)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAttachmentInfos34
     */
    public void startgetAttachmentInfos(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentInfosDocument getAttachmentInfos34,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param forward36
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardResponseDocument forward(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardDocument forward36)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param forward36
     */
    public void startforward(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ForwardDocument forward36,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param deleteOutput38
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteOutputResponseDocument deleteOutput(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteOutputDocument deleteOutput38)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deleteOutput38
     */
    public void startdeleteOutput(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteOutputDocument deleteOutput38,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setGenericHumanRole40
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleResponseDocument setGenericHumanRole(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleDocument setGenericHumanRole40)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setGenericHumanRole40
     */
    public void startsetGenericHumanRole(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetGenericHumanRoleDocument setGenericHumanRole40,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param resume42
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ResumeResponseDocument resume(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ResumeDocument resume42)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param resume42
     */
    public void startresume(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ResumeDocument resume42,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setTaskStartDeadlineExpression44
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDeadlineExpressionResponseDocument setTaskStartDeadlineExpression(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDeadlineExpressionDocument setTaskStartDeadlineExpression44)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setTaskStartDeadlineExpression44
     */
    public void startsetTaskStartDeadlineExpression(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDeadlineExpressionDocument setTaskStartDeadlineExpression44,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getParentTask46
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskResponseDocument getParentTask(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskDocument getParentTask46)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getParentTask46
     */
    public void startgetParentTask(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskDocument getParentTask46,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchNominate48
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchNominateResponseDocument batchNominate(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchNominateDocument batchNominate48)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchNominate48
     */
    public void startbatchNominate(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchNominateDocument batchNominate48,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param start50
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StartResponseDocument start(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StartDocument start50)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param start50
     */
    public void startstart(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StartDocument start50,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchRelease52
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchReleaseResponseDocument batchRelease(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchReleaseDocument batchRelease52)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchRelease52
     */
    public void startbatchRelease(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchReleaseDocument batchRelease52,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getTaskOperations54
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskOperationsResponseDocument getTaskOperations(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskOperationsDocument getTaskOperations54)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getTaskOperations54
     */
    public void startgetTaskOperations(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskOperationsDocument getTaskOperations54,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchStop56
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchStopResponseDocument batchStop(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchStopDocument batchStop56)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchStop56
     */
    public void startbatchStop(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchStopDocument batchStop56,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchSkip58
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSkipResponseDocument batchSkip(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSkipDocument batchSkip58)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchSkip58
     */
    public void startbatchSkip(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSkipDocument batchSkip58,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchSetGenericHumanRole60
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSetGenericHumanRoleResponseDocument batchSetGenericHumanRole(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSetGenericHumanRoleDocument batchSetGenericHumanRole60)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchSetGenericHumanRole60
     */
    public void startbatchSetGenericHumanRole(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSetGenericHumanRoleDocument batchSetGenericHumanRole60,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchRemove62
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchRemoveResponseDocument batchRemove(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchRemoveDocument batchRemove62)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchRemove62
     */
    public void startbatchRemove(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchRemoveDocument batchRemove62,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getTaskDetails64
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskDetailsResponseDocument getTaskDetails(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskDetailsDocument getTaskDetails64)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getTaskDetails64
     */
    public void startgetTaskDetails(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskDetailsDocument getTaskDetails64,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchComplete66
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchCompleteResponseDocument batchComplete(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchCompleteDocument batchComplete66)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchComplete66
     */
    public void startbatchComplete(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchCompleteDocument batchComplete66,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param deleteAttachment68
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteAttachmentResponseDocument deleteAttachment(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteAttachmentDocument deleteAttachment68)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deleteAttachment68
     */
    public void startdeleteAttachment(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteAttachmentDocument deleteAttachment68,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param complete70
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteResponseDocument complete(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteDocument complete70)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param complete70
     */
    public void startcomplete(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.CompleteDocument complete70,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param instantiateSubtask72
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskResponseDocument instantiateSubtask(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskDocument instantiateSubtask72)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param instantiateSubtask72
     */
    public void startinstantiateSubtask(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.InstantiateSubtaskDocument instantiateSubtask72,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param release74
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ReleaseResponseDocument release(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ReleaseDocument release74)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param release74
     */
    public void startrelease(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ReleaseDocument release74,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getTaskHistory76
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponseDocument getTaskHistory(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryDocument getTaskHistory76)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getTaskHistory76
     */
    public void startgetTaskHistory(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryDocument getTaskHistory76,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getFault78
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultResponseDocument getFault(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultDocument getFault78)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getFault78
     */
    public void startgetFault(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetFaultDocument getFault78,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setTaskCompletionDurationExpression80
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionResponseDocument setTaskCompletionDurationExpression(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionDocument setTaskCompletionDurationExpression80)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setTaskCompletionDurationExpression80
     */
    public void startsetTaskCompletionDurationExpression(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDurationExpressionDocument setTaskCompletionDurationExpression80,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param deleteFault82
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteFaultResponseDocument deleteFault(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteFaultDocument deleteFault82)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deleteFault82
     */
    public void startdeleteFault(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.DeleteFaultDocument deleteFault82,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param addAttachment84
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddAttachmentResponseDocument addAttachment(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddAttachmentDocument addAttachment84)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param addAttachment84
     */
    public void startaddAttachment(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddAttachmentDocument addAttachment84,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getInput86
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetInputResponseDocument getInput(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetInputDocument getInput86)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getInput86
     */
    public void startgetInput(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetInputDocument getInput86,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param loadTask88
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskResponseDocument loadTask(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskDocument loadTask88)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param loadTask88
     */
    public void startloadTask(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.LoadTaskDocument loadTask88,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param suspendUntil90
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilResponseDocument suspendUntil(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilDocument suspendUntil90)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param suspendUntil90
     */
    public void startsuspendUntil(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendUntilDocument suspendUntil90,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param hasSubtasks92
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HasSubtasksResponseDocument hasSubtasks(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HasSubtasksDocument hasSubtasks92)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param hasSubtasks92
     */
    public void starthasSubtasks(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HasSubtasksDocument hasSubtasks92,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getMyTaskDetails94
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsResponseDocument getMyTaskDetails(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsDocument getMyTaskDetails94)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getMyTaskDetails94
     */
    public void startgetMyTaskDetails(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetMyTaskDetailsDocument getMyTaskDetails94,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setFault96
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetFaultResponseDocument setFault(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetFaultDocument setFault96)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setFault96
     */
    public void startsetFault(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetFaultDocument setFault96,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchForward98
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchForwardResponseDocument batchForward(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchForwardDocument batchForward98)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchForward98
     */
    public void startbatchForward(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchForwardDocument batchForward98,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setTaskStartDurationExpression100
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDurationExpressionResponseDocument setTaskStartDurationExpression(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDurationExpressionDocument setTaskStartDurationExpression100)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setTaskStartDurationExpression100
     */
    public void startsetTaskStartDurationExpression(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskStartDurationExpressionDocument setTaskStartDurationExpression100,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchStart102
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchStartResponseDocument batchStart(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchStartDocument batchStart102)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchStart102
     */
    public void startbatchStart(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchStartDocument batchStart102,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchSuspend104
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendResponseDocument batchSuspend(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendDocument batchSuspend104)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchSuspend104
     */
    public void startbatchSuspend(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchSuspendDocument batchSuspend104,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getTaskDescription106
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskDescriptionResponseDocument getTaskDescription(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskDescriptionDocument getTaskDescription106)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getTaskDescription106
     */
    public void startgetTaskDescription(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskDescriptionDocument getTaskDescription106,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param nominate108
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.NominateResponseDocument nominate(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.NominateDocument nominate108)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param nominate108
     */
    public void startnominate(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.NominateDocument nominate108,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param simpleQuery110
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryResponseDocument simpleQuery(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryDocument simpleQuery110)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param simpleQuery110
     */
    public void startsimpleQuery(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SimpleQueryDocument simpleQuery110,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param addComment112
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddCommentResponseDocument addComment(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddCommentDocument addComment112)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param addComment112
     */
    public void startaddComment(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.AddCommentDocument addComment112,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param isSubtask114
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IsSubtaskResponseDocument isSubtask(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IsSubtaskDocument isSubtask114)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param isSubtask114
     */
    public void startisSubtask(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IsSubtaskDocument isSubtask114,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param claim116
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ClaimResponseDocument claim(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ClaimDocument claim116)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param claim116
     */
    public void startclaim(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ClaimDocument claim116,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getComments118
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetCommentsResponseDocument getComments(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetCommentsDocument getComments118)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getComments118
     */
    public void startgetComments(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetCommentsDocument getComments118,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param query120
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryResponseDocument query(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryDocument query120)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param query120
     */
    public void startquery(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.QueryDocument query120,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAssignableUserList122
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAssignableUserListResponseDocument getAssignableUserList(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAssignableUserListDocument getAssignableUserList122)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAssignableUserList122
     */
    public void startgetAssignableUserList(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAssignableUserListDocument getAssignableUserList122,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchDelegate124
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchDelegateResponseDocument batchDelegate(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchDelegateDocument batchDelegate124)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchDelegate124
     */
    public void startbatchDelegate(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchDelegateDocument batchDelegate124,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAttachment126
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentResponseDocument getAttachment(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentDocument getAttachment126)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAttachment126
     */
    public void startgetAttachment(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetAttachmentDocument getAttachment126,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param suspend128
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendResponseDocument suspend(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendDocument suspend128)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param suspend128
     */
    public void startsuspend(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SuspendDocument suspend128,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateComment130
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.UpdateCommentResponseDocument updateComment(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.UpdateCommentDocument updateComment130)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateComment130
     */
    public void startupdateComment(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.UpdateCommentDocument updateComment130,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getParentTaskIdentifier132
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierResponseDocument getParentTaskIdentifier(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierDocument getParentTaskIdentifier132)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getParentTaskIdentifier132
     */
    public void startgetParentTaskIdentifier(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetParentTaskIdentifierDocument getParentTaskIdentifier132,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchResume134
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchResumeResponseDocument batchResume(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchResumeDocument batchResume134)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchResume134
     */
    public void startbatchResume(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchResumeDocument batchResume134,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param stop136
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StopResponseDocument stop(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StopDocument stop136)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param stop136
     */
    public void startstop(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.StopDocument stop136,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setTaskCompletionDeadlineExpression138
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDeadlineExpressionResponseDocument setTaskCompletionDeadlineExpression(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDeadlineExpressionDocument setTaskCompletionDeadlineExpression138)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setTaskCompletionDeadlineExpression138
     */
    public void startsetTaskCompletionDeadlineExpression(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetTaskCompletionDeadlineExpressionDocument setTaskCompletionDeadlineExpression138,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param fail140
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailResponseDocument fail(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailDocument fail140)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param fail140
     */
    public void startfail(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.FailDocument fail140,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getTaskInstanceData142
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataResponseDocument getTaskInstanceData(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataDocument getTaskInstanceData142)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getTaskInstanceData142
     */
    public void startgetTaskInstanceData(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskInstanceDataDocument getTaskInstanceData142,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param batchActivate144
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchActivateResponseDocument batchActivate(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchActivateDocument batchActivate144)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param batchActivate144
     */
    public void startbatchActivate(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.BatchActivateDocument batchActivate144,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param setPriority146
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetPriorityResponseDocument setPriority(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetPriorityDocument setPriority146)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param setPriority146
     */
    public void startsetPriority(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.SetPriorityDocument setPriority146,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getSubtaskIdentifiers148
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersResponseDocument getSubtaskIdentifiers(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersDocument getSubtaskIdentifiers148)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getSubtaskIdentifiers148
     */
    public void startgetSubtaskIdentifiers(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetSubtaskIdentifiersDocument getSubtaskIdentifiers148,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param activate150
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault :
     * @throws org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault :
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ActivateResponseDocument activate(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ActivateDocument activate150)
        throws java.rmi.RemoteException,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalArgumentFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalOperationFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalStateFault,
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.IllegalAccessFault;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param activate150
     */
    public void startactivate(
        org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.ActivateDocument activate150,
        final org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.HumanTaskClientAPIAdminCallbackHandler callback)
        throws java.rmi.RemoteException;

    //
}
