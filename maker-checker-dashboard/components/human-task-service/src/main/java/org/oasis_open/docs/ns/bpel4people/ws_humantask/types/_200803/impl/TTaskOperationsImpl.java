/*
 * XML Type:  tTaskOperations
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * An XML tTaskOperations(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public class TTaskOperationsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations
{
    private static final long serialVersionUID = 1L;
    
    public TTaskOperationsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVATE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "activate");
    private static final javax.xml.namespace.QName ADDATTACHMENT$2 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "addAttachment");
    private static final javax.xml.namespace.QName ADDCOMMENT$4 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "addComment");
    private static final javax.xml.namespace.QName CLAIM$6 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "claim");
    private static final javax.xml.namespace.QName COMPLETE$8 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "complete");
    private static final javax.xml.namespace.QName DELEGATE$10 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "delegate");
    private static final javax.xml.namespace.QName DELETEATTACHMENT$12 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "deleteAttachment");
    private static final javax.xml.namespace.QName DELETECOMMENT$14 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "deleteComment");
    private static final javax.xml.namespace.QName DELETEFAULT$16 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "deleteFault");
    private static final javax.xml.namespace.QName DELETEOUTPUT$18 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "deleteOutput");
    private static final javax.xml.namespace.QName FAIL$20 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "fail");
    private static final javax.xml.namespace.QName FORWARD$22 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "forward");
    private static final javax.xml.namespace.QName GETATTACHMENT$24 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "getAttachment");
    private static final javax.xml.namespace.QName GETATTACHMENTINFOS$26 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "getAttachmentInfos");
    private static final javax.xml.namespace.QName GETCOMMENTS$28 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "getComments");
    private static final javax.xml.namespace.QName GETFAULT$30 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "getFault");
    private static final javax.xml.namespace.QName GETINPUT$32 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "getInput");
    private static final javax.xml.namespace.QName GETOUTCOME$34 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "getOutcome");
    private static final javax.xml.namespace.QName GETOUTPUT$36 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "getOutput");
    private static final javax.xml.namespace.QName GETPARENTTASK$38 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "getParentTask");
    private static final javax.xml.namespace.QName GETPARENTTASKIDENTIFIER$40 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "getParentTaskIdentifier");
    private static final javax.xml.namespace.QName GETRENDERING$42 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "getRendering");
    private static final javax.xml.namespace.QName GETRENDERINGTYPES$44 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "getRenderingTypes");
    private static final javax.xml.namespace.QName GETSUBTASKIDENTIFIERS$46 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "getSubtaskIdentifiers");
    private static final javax.xml.namespace.QName GETSUBTASKS$48 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "getSubtasks");
    private static final javax.xml.namespace.QName GETTASKDESCRIPTION$50 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "getTaskDescription");
    private static final javax.xml.namespace.QName GETTASKDETAILS$52 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "getTaskDetails");
    private static final javax.xml.namespace.QName GETTASKHISTORY$54 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "getTaskHistory");
    private static final javax.xml.namespace.QName GETTASKINSTANCEDATA$56 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "getTaskInstanceData");
    private static final javax.xml.namespace.QName HASSUBTASKS$58 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "hasSubtasks");
    private static final javax.xml.namespace.QName INSTANTIATESUBTASK$60 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "instantiateSubtask");
    private static final javax.xml.namespace.QName ISSUBTASK$62 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "isSubtask");
    private static final javax.xml.namespace.QName NOMINATE$64 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "nominate");
    private static final javax.xml.namespace.QName RELEASE$66 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "release");
    private static final javax.xml.namespace.QName REMOVE$68 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "remove");
    private static final javax.xml.namespace.QName RESUME$70 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "resume");
    private static final javax.xml.namespace.QName SETFAULT$72 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "setFault");
    private static final javax.xml.namespace.QName SETGENERICHUMANROLE$74 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "setGenericHumanRole");
    private static final javax.xml.namespace.QName SETOUTPUT$76 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "setOutput");
    private static final javax.xml.namespace.QName SETPRIORITY$78 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "setPriority");
    private static final javax.xml.namespace.QName SETTASKCOMPLETIONDEADLINEEXPRESSION$80 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "setTaskCompletionDeadlineExpression");
    private static final javax.xml.namespace.QName SETTASKCOMPLETIONDURATIONEXPRESSION$82 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "setTaskCompletionDurationExpression");
    private static final javax.xml.namespace.QName SETTASKSTARTDEADLINEEXPRESSION$84 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "setTaskStartDeadlineExpression");
    private static final javax.xml.namespace.QName SETTASKSTARTDURATIONEXPRESSION$86 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "setTaskStartDurationExpression");
    private static final javax.xml.namespace.QName SKIP$88 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "skip");
    private static final javax.xml.namespace.QName START$90 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "start");
    private static final javax.xml.namespace.QName STOP$92 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "stop");
    private static final javax.xml.namespace.QName SUSPEND$94 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "suspend");
    private static final javax.xml.namespace.QName SUSPENDUNTIL$96 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "suspendUntil");
    private static final javax.xml.namespace.QName UPDATECOMMENT$98 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "updateComment");
    
    
    /**
     * Gets array of all "activate" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getActivateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVATE$0, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "activate" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getActivateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(ACTIVATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "activate" element
     */
    public int sizeOfActivateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVATE$0);
        }
    }
    
    /**
     * Sets array of all "activate" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setActivateArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] activateArray)
    {
        check_orphaned();
        arraySetterHelper(activateArray, ACTIVATE$0);
    }
    
    /**
     * Sets ith "activate" element
     */
    public void setActivateArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation activate)
    {
        generatedSetterHelperImpl(activate, ACTIVATE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "activate" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewActivate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(ACTIVATE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "activate" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewActivate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(ACTIVATE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "activate" element
     */
    public void removeActivate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVATE$0, i);
        }
    }
    
    /**
     * Gets array of all "addAttachment" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getAddAttachmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDATTACHMENT$2, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "addAttachment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getAddAttachmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(ADDATTACHMENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "addAttachment" element
     */
    public int sizeOfAddAttachmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDATTACHMENT$2);
        }
    }
    
    /**
     * Sets array of all "addAttachment" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAddAttachmentArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] addAttachmentArray)
    {
        check_orphaned();
        arraySetterHelper(addAttachmentArray, ADDATTACHMENT$2);
    }
    
    /**
     * Sets ith "addAttachment" element
     */
    public void setAddAttachmentArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addAttachment)
    {
        generatedSetterHelperImpl(addAttachment, ADDATTACHMENT$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "addAttachment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewAddAttachment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(ADDATTACHMENT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "addAttachment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewAddAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(ADDATTACHMENT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "addAttachment" element
     */
    public void removeAddAttachment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDATTACHMENT$2, i);
        }
    }
    
    /**
     * Gets array of all "addComment" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getAddCommentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDCOMMENT$4, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "addComment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getAddCommentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(ADDCOMMENT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "addComment" element
     */
    public int sizeOfAddCommentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDCOMMENT$4);
        }
    }
    
    /**
     * Sets array of all "addComment" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAddCommentArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] addCommentArray)
    {
        check_orphaned();
        arraySetterHelper(addCommentArray, ADDCOMMENT$4);
    }
    
    /**
     * Sets ith "addComment" element
     */
    public void setAddCommentArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addComment)
    {
        generatedSetterHelperImpl(addComment, ADDCOMMENT$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "addComment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewAddComment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(ADDCOMMENT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "addComment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewAddComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(ADDCOMMENT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "addComment" element
     */
    public void removeAddComment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDCOMMENT$4, i);
        }
    }
    
    /**
     * Gets array of all "claim" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getClaimArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CLAIM$6, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "claim" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getClaimArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(CLAIM$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "claim" element
     */
    public int sizeOfClaimArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLAIM$6);
        }
    }
    
    /**
     * Sets array of all "claim" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setClaimArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] claimArray)
    {
        check_orphaned();
        arraySetterHelper(claimArray, CLAIM$6);
    }
    
    /**
     * Sets ith "claim" element
     */
    public void setClaimArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation claim)
    {
        generatedSetterHelperImpl(claim, CLAIM$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "claim" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewClaim(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(CLAIM$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "claim" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(CLAIM$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "claim" element
     */
    public void removeClaim(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLAIM$6, i);
        }
    }
    
    /**
     * Gets array of all "complete" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getCompleteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPLETE$8, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "complete" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getCompleteArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(COMPLETE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "complete" element
     */
    public int sizeOfCompleteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLETE$8);
        }
    }
    
    /**
     * Sets array of all "complete" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCompleteArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] completeArray)
    {
        check_orphaned();
        arraySetterHelper(completeArray, COMPLETE$8);
    }
    
    /**
     * Sets ith "complete" element
     */
    public void setCompleteArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation complete)
    {
        generatedSetterHelperImpl(complete, COMPLETE$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "complete" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewComplete(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(COMPLETE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "complete" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(COMPLETE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "complete" element
     */
    public void removeComplete(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLETE$8, i);
        }
    }
    
    /**
     * Gets array of all "delegate" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getDelegateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELEGATE$10, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "delegate" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getDelegateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(DELEGATE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "delegate" element
     */
    public int sizeOfDelegateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELEGATE$10);
        }
    }
    
    /**
     * Sets array of all "delegate" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDelegateArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] delegateArray)
    {
        check_orphaned();
        arraySetterHelper(delegateArray, DELEGATE$10);
    }
    
    /**
     * Sets ith "delegate" element
     */
    public void setDelegateArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation delegate)
    {
        generatedSetterHelperImpl(delegate, DELEGATE$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "delegate" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewDelegate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(DELEGATE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "delegate" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewDelegate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(DELEGATE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "delegate" element
     */
    public void removeDelegate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELEGATE$10, i);
        }
    }
    
    /**
     * Gets array of all "deleteAttachment" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getDeleteAttachmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELETEATTACHMENT$12, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "deleteAttachment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getDeleteAttachmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(DELETEATTACHMENT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "deleteAttachment" element
     */
    public int sizeOfDeleteAttachmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELETEATTACHMENT$12);
        }
    }
    
    /**
     * Sets array of all "deleteAttachment" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDeleteAttachmentArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] deleteAttachmentArray)
    {
        check_orphaned();
        arraySetterHelper(deleteAttachmentArray, DELETEATTACHMENT$12);
    }
    
    /**
     * Sets ith "deleteAttachment" element
     */
    public void setDeleteAttachmentArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation deleteAttachment)
    {
        generatedSetterHelperImpl(deleteAttachment, DELETEATTACHMENT$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deleteAttachment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewDeleteAttachment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(DELETEATTACHMENT$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deleteAttachment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewDeleteAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(DELETEATTACHMENT$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "deleteAttachment" element
     */
    public void removeDeleteAttachment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELETEATTACHMENT$12, i);
        }
    }
    
    /**
     * Gets array of all "deleteComment" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getDeleteCommentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELETECOMMENT$14, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "deleteComment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getDeleteCommentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(DELETECOMMENT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "deleteComment" element
     */
    public int sizeOfDeleteCommentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELETECOMMENT$14);
        }
    }
    
    /**
     * Sets array of all "deleteComment" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDeleteCommentArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] deleteCommentArray)
    {
        check_orphaned();
        arraySetterHelper(deleteCommentArray, DELETECOMMENT$14);
    }
    
    /**
     * Sets ith "deleteComment" element
     */
    public void setDeleteCommentArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation deleteComment)
    {
        generatedSetterHelperImpl(deleteComment, DELETECOMMENT$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deleteComment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewDeleteComment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(DELETECOMMENT$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deleteComment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewDeleteComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(DELETECOMMENT$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "deleteComment" element
     */
    public void removeDeleteComment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELETECOMMENT$14, i);
        }
    }
    
    /**
     * Gets array of all "deleteFault" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getDeleteFaultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELETEFAULT$16, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "deleteFault" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getDeleteFaultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(DELETEFAULT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "deleteFault" element
     */
    public int sizeOfDeleteFaultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELETEFAULT$16);
        }
    }
    
    /**
     * Sets array of all "deleteFault" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDeleteFaultArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] deleteFaultArray)
    {
        check_orphaned();
        arraySetterHelper(deleteFaultArray, DELETEFAULT$16);
    }
    
    /**
     * Sets ith "deleteFault" element
     */
    public void setDeleteFaultArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation deleteFault)
    {
        generatedSetterHelperImpl(deleteFault, DELETEFAULT$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deleteFault" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewDeleteFault(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(DELETEFAULT$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deleteFault" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewDeleteFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(DELETEFAULT$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "deleteFault" element
     */
    public void removeDeleteFault(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELETEFAULT$16, i);
        }
    }
    
    /**
     * Gets array of all "deleteOutput" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getDeleteOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELETEOUTPUT$18, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "deleteOutput" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getDeleteOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(DELETEOUTPUT$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "deleteOutput" element
     */
    public int sizeOfDeleteOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELETEOUTPUT$18);
        }
    }
    
    /**
     * Sets array of all "deleteOutput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDeleteOutputArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] deleteOutputArray)
    {
        check_orphaned();
        arraySetterHelper(deleteOutputArray, DELETEOUTPUT$18);
    }
    
    /**
     * Sets ith "deleteOutput" element
     */
    public void setDeleteOutputArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation deleteOutput)
    {
        generatedSetterHelperImpl(deleteOutput, DELETEOUTPUT$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deleteOutput" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewDeleteOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(DELETEOUTPUT$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deleteOutput" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewDeleteOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(DELETEOUTPUT$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "deleteOutput" element
     */
    public void removeDeleteOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELETEOUTPUT$18, i);
        }
    }
    
    /**
     * Gets array of all "fail" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getFailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FAIL$20, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "fail" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getFailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(FAIL$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "fail" element
     */
    public int sizeOfFailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAIL$20);
        }
    }
    
    /**
     * Sets array of all "fail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFailArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] failArray)
    {
        check_orphaned();
        arraySetterHelper(failArray, FAIL$20);
    }
    
    /**
     * Sets ith "fail" element
     */
    public void setFailArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation fail)
    {
        generatedSetterHelperImpl(fail, FAIL$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fail" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewFail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(FAIL$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fail" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewFail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(FAIL$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "fail" element
     */
    public void removeFail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAIL$20, i);
        }
    }
    
    /**
     * Gets array of all "forward" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getForwardArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FORWARD$22, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "forward" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getForwardArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(FORWARD$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "forward" element
     */
    public int sizeOfForwardArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORWARD$22);
        }
    }
    
    /**
     * Sets array of all "forward" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setForwardArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] forwardArray)
    {
        check_orphaned();
        arraySetterHelper(forwardArray, FORWARD$22);
    }
    
    /**
     * Sets ith "forward" element
     */
    public void setForwardArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation forward)
    {
        generatedSetterHelperImpl(forward, FORWARD$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "forward" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewForward(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(FORWARD$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "forward" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewForward()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(FORWARD$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "forward" element
     */
    public void removeForward(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORWARD$22, i);
        }
    }
    
    /**
     * Gets array of all "getAttachment" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getGetAttachmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GETATTACHMENT$24, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "getAttachment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getGetAttachmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(GETATTACHMENT$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "getAttachment" element
     */
    public int sizeOfGetAttachmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GETATTACHMENT$24);
        }
    }
    
    /**
     * Sets array of all "getAttachment" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGetAttachmentArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getAttachmentArray)
    {
        check_orphaned();
        arraySetterHelper(getAttachmentArray, GETATTACHMENT$24);
    }
    
    /**
     * Sets ith "getAttachment" element
     */
    public void setGetAttachmentArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getAttachment)
    {
        generatedSetterHelperImpl(getAttachment, GETATTACHMENT$24, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "getAttachment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewGetAttachment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(GETATTACHMENT$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getAttachment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewGetAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(GETATTACHMENT$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "getAttachment" element
     */
    public void removeGetAttachment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GETATTACHMENT$24, i);
        }
    }
    
    /**
     * Gets array of all "getAttachmentInfos" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getGetAttachmentInfosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GETATTACHMENTINFOS$26, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "getAttachmentInfos" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getGetAttachmentInfosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(GETATTACHMENTINFOS$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "getAttachmentInfos" element
     */
    public int sizeOfGetAttachmentInfosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GETATTACHMENTINFOS$26);
        }
    }
    
    /**
     * Sets array of all "getAttachmentInfos" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGetAttachmentInfosArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getAttachmentInfosArray)
    {
        check_orphaned();
        arraySetterHelper(getAttachmentInfosArray, GETATTACHMENTINFOS$26);
    }
    
    /**
     * Sets ith "getAttachmentInfos" element
     */
    public void setGetAttachmentInfosArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getAttachmentInfos)
    {
        generatedSetterHelperImpl(getAttachmentInfos, GETATTACHMENTINFOS$26, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "getAttachmentInfos" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewGetAttachmentInfos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(GETATTACHMENTINFOS$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getAttachmentInfos" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewGetAttachmentInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(GETATTACHMENTINFOS$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "getAttachmentInfos" element
     */
    public void removeGetAttachmentInfos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GETATTACHMENTINFOS$26, i);
        }
    }
    
    /**
     * Gets array of all "getComments" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getGetCommentsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GETCOMMENTS$28, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "getComments" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getGetCommentsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(GETCOMMENTS$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "getComments" element
     */
    public int sizeOfGetCommentsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GETCOMMENTS$28);
        }
    }
    
    /**
     * Sets array of all "getComments" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGetCommentsArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getCommentsArray)
    {
        check_orphaned();
        arraySetterHelper(getCommentsArray, GETCOMMENTS$28);
    }
    
    /**
     * Sets ith "getComments" element
     */
    public void setGetCommentsArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getComments)
    {
        generatedSetterHelperImpl(getComments, GETCOMMENTS$28, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "getComments" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewGetComments(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(GETCOMMENTS$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getComments" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewGetComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(GETCOMMENTS$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "getComments" element
     */
    public void removeGetComments(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GETCOMMENTS$28, i);
        }
    }
    
    /**
     * Gets array of all "getFault" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getGetFaultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GETFAULT$30, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "getFault" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getGetFaultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(GETFAULT$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "getFault" element
     */
    public int sizeOfGetFaultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GETFAULT$30);
        }
    }
    
    /**
     * Sets array of all "getFault" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGetFaultArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getFaultArray)
    {
        check_orphaned();
        arraySetterHelper(getFaultArray, GETFAULT$30);
    }
    
    /**
     * Sets ith "getFault" element
     */
    public void setGetFaultArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getFault)
    {
        generatedSetterHelperImpl(getFault, GETFAULT$30, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "getFault" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewGetFault(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(GETFAULT$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getFault" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewGetFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(GETFAULT$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "getFault" element
     */
    public void removeGetFault(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GETFAULT$30, i);
        }
    }
    
    /**
     * Gets array of all "getInput" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getGetInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GETINPUT$32, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "getInput" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getGetInputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(GETINPUT$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "getInput" element
     */
    public int sizeOfGetInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GETINPUT$32);
        }
    }
    
    /**
     * Sets array of all "getInput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGetInputArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getInputArray)
    {
        check_orphaned();
        arraySetterHelper(getInputArray, GETINPUT$32);
    }
    
    /**
     * Sets ith "getInput" element
     */
    public void setGetInputArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getInput)
    {
        generatedSetterHelperImpl(getInput, GETINPUT$32, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "getInput" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewGetInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(GETINPUT$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getInput" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewGetInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(GETINPUT$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "getInput" element
     */
    public void removeGetInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GETINPUT$32, i);
        }
    }
    
    /**
     * Gets array of all "getOutcome" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getGetOutcomeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GETOUTCOME$34, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "getOutcome" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getGetOutcomeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(GETOUTCOME$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "getOutcome" element
     */
    public int sizeOfGetOutcomeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GETOUTCOME$34);
        }
    }
    
    /**
     * Sets array of all "getOutcome" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGetOutcomeArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getOutcomeArray)
    {
        check_orphaned();
        arraySetterHelper(getOutcomeArray, GETOUTCOME$34);
    }
    
    /**
     * Sets ith "getOutcome" element
     */
    public void setGetOutcomeArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getOutcome)
    {
        generatedSetterHelperImpl(getOutcome, GETOUTCOME$34, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "getOutcome" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewGetOutcome(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(GETOUTCOME$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getOutcome" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewGetOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(GETOUTCOME$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "getOutcome" element
     */
    public void removeGetOutcome(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GETOUTCOME$34, i);
        }
    }
    
    /**
     * Gets array of all "getOutput" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getGetOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GETOUTPUT$36, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "getOutput" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getGetOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(GETOUTPUT$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "getOutput" element
     */
    public int sizeOfGetOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GETOUTPUT$36);
        }
    }
    
    /**
     * Sets array of all "getOutput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGetOutputArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getOutputArray)
    {
        check_orphaned();
        arraySetterHelper(getOutputArray, GETOUTPUT$36);
    }
    
    /**
     * Sets ith "getOutput" element
     */
    public void setGetOutputArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getOutput)
    {
        generatedSetterHelperImpl(getOutput, GETOUTPUT$36, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "getOutput" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewGetOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(GETOUTPUT$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getOutput" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewGetOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(GETOUTPUT$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "getOutput" element
     */
    public void removeGetOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GETOUTPUT$36, i);
        }
    }
    
    /**
     * Gets array of all "getParentTask" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getGetParentTaskArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GETPARENTTASK$38, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "getParentTask" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getGetParentTaskArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(GETPARENTTASK$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "getParentTask" element
     */
    public int sizeOfGetParentTaskArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GETPARENTTASK$38);
        }
    }
    
    /**
     * Sets array of all "getParentTask" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGetParentTaskArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getParentTaskArray)
    {
        check_orphaned();
        arraySetterHelper(getParentTaskArray, GETPARENTTASK$38);
    }
    
    /**
     * Sets ith "getParentTask" element
     */
    public void setGetParentTaskArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getParentTask)
    {
        generatedSetterHelperImpl(getParentTask, GETPARENTTASK$38, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "getParentTask" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewGetParentTask(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(GETPARENTTASK$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getParentTask" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewGetParentTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(GETPARENTTASK$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "getParentTask" element
     */
    public void removeGetParentTask(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GETPARENTTASK$38, i);
        }
    }
    
    /**
     * Gets array of all "getParentTaskIdentifier" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getGetParentTaskIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GETPARENTTASKIDENTIFIER$40, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "getParentTaskIdentifier" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getGetParentTaskIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(GETPARENTTASKIDENTIFIER$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "getParentTaskIdentifier" element
     */
    public int sizeOfGetParentTaskIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GETPARENTTASKIDENTIFIER$40);
        }
    }
    
    /**
     * Sets array of all "getParentTaskIdentifier" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGetParentTaskIdentifierArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getParentTaskIdentifierArray)
    {
        check_orphaned();
        arraySetterHelper(getParentTaskIdentifierArray, GETPARENTTASKIDENTIFIER$40);
    }
    
    /**
     * Sets ith "getParentTaskIdentifier" element
     */
    public void setGetParentTaskIdentifierArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getParentTaskIdentifier)
    {
        generatedSetterHelperImpl(getParentTaskIdentifier, GETPARENTTASKIDENTIFIER$40, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "getParentTaskIdentifier" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewGetParentTaskIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(GETPARENTTASKIDENTIFIER$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getParentTaskIdentifier" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewGetParentTaskIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(GETPARENTTASKIDENTIFIER$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "getParentTaskIdentifier" element
     */
    public void removeGetParentTaskIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GETPARENTTASKIDENTIFIER$40, i);
        }
    }
    
    /**
     * Gets array of all "getRendering" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getGetRenderingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GETRENDERING$42, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "getRendering" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getGetRenderingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(GETRENDERING$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "getRendering" element
     */
    public int sizeOfGetRenderingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GETRENDERING$42);
        }
    }
    
    /**
     * Sets array of all "getRendering" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGetRenderingArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getRenderingArray)
    {
        check_orphaned();
        arraySetterHelper(getRenderingArray, GETRENDERING$42);
    }
    
    /**
     * Sets ith "getRendering" element
     */
    public void setGetRenderingArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getRendering)
    {
        generatedSetterHelperImpl(getRendering, GETRENDERING$42, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "getRendering" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewGetRendering(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(GETRENDERING$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getRendering" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewGetRendering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(GETRENDERING$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "getRendering" element
     */
    public void removeGetRendering(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GETRENDERING$42, i);
        }
    }
    
    /**
     * Gets array of all "getRenderingTypes" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getGetRenderingTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GETRENDERINGTYPES$44, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "getRenderingTypes" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getGetRenderingTypesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(GETRENDERINGTYPES$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "getRenderingTypes" element
     */
    public int sizeOfGetRenderingTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GETRENDERINGTYPES$44);
        }
    }
    
    /**
     * Sets array of all "getRenderingTypes" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGetRenderingTypesArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getRenderingTypesArray)
    {
        check_orphaned();
        arraySetterHelper(getRenderingTypesArray, GETRENDERINGTYPES$44);
    }
    
    /**
     * Sets ith "getRenderingTypes" element
     */
    public void setGetRenderingTypesArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getRenderingTypes)
    {
        generatedSetterHelperImpl(getRenderingTypes, GETRENDERINGTYPES$44, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "getRenderingTypes" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewGetRenderingTypes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(GETRENDERINGTYPES$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getRenderingTypes" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewGetRenderingTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(GETRENDERINGTYPES$44);
            return target;
        }
    }
    
    /**
     * Removes the ith "getRenderingTypes" element
     */
    public void removeGetRenderingTypes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GETRENDERINGTYPES$44, i);
        }
    }
    
    /**
     * Gets array of all "getSubtaskIdentifiers" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getGetSubtaskIdentifiersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GETSUBTASKIDENTIFIERS$46, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "getSubtaskIdentifiers" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getGetSubtaskIdentifiersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(GETSUBTASKIDENTIFIERS$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "getSubtaskIdentifiers" element
     */
    public int sizeOfGetSubtaskIdentifiersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GETSUBTASKIDENTIFIERS$46);
        }
    }
    
    /**
     * Sets array of all "getSubtaskIdentifiers" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGetSubtaskIdentifiersArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getSubtaskIdentifiersArray)
    {
        check_orphaned();
        arraySetterHelper(getSubtaskIdentifiersArray, GETSUBTASKIDENTIFIERS$46);
    }
    
    /**
     * Sets ith "getSubtaskIdentifiers" element
     */
    public void setGetSubtaskIdentifiersArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getSubtaskIdentifiers)
    {
        generatedSetterHelperImpl(getSubtaskIdentifiers, GETSUBTASKIDENTIFIERS$46, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "getSubtaskIdentifiers" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewGetSubtaskIdentifiers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(GETSUBTASKIDENTIFIERS$46, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getSubtaskIdentifiers" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewGetSubtaskIdentifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(GETSUBTASKIDENTIFIERS$46);
            return target;
        }
    }
    
    /**
     * Removes the ith "getSubtaskIdentifiers" element
     */
    public void removeGetSubtaskIdentifiers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GETSUBTASKIDENTIFIERS$46, i);
        }
    }
    
    /**
     * Gets array of all "getSubtasks" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getGetSubtasksArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GETSUBTASKS$48, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "getSubtasks" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getGetSubtasksArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(GETSUBTASKS$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "getSubtasks" element
     */
    public int sizeOfGetSubtasksArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GETSUBTASKS$48);
        }
    }
    
    /**
     * Sets array of all "getSubtasks" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGetSubtasksArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getSubtasksArray)
    {
        check_orphaned();
        arraySetterHelper(getSubtasksArray, GETSUBTASKS$48);
    }
    
    /**
     * Sets ith "getSubtasks" element
     */
    public void setGetSubtasksArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getSubtasks)
    {
        generatedSetterHelperImpl(getSubtasks, GETSUBTASKS$48, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "getSubtasks" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewGetSubtasks(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(GETSUBTASKS$48, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getSubtasks" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewGetSubtasks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(GETSUBTASKS$48);
            return target;
        }
    }
    
    /**
     * Removes the ith "getSubtasks" element
     */
    public void removeGetSubtasks(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GETSUBTASKS$48, i);
        }
    }
    
    /**
     * Gets array of all "getTaskDescription" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getGetTaskDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GETTASKDESCRIPTION$50, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "getTaskDescription" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getGetTaskDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(GETTASKDESCRIPTION$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "getTaskDescription" element
     */
    public int sizeOfGetTaskDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GETTASKDESCRIPTION$50);
        }
    }
    
    /**
     * Sets array of all "getTaskDescription" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGetTaskDescriptionArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getTaskDescriptionArray)
    {
        check_orphaned();
        arraySetterHelper(getTaskDescriptionArray, GETTASKDESCRIPTION$50);
    }
    
    /**
     * Sets ith "getTaskDescription" element
     */
    public void setGetTaskDescriptionArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getTaskDescription)
    {
        generatedSetterHelperImpl(getTaskDescription, GETTASKDESCRIPTION$50, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "getTaskDescription" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewGetTaskDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(GETTASKDESCRIPTION$50, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getTaskDescription" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewGetTaskDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(GETTASKDESCRIPTION$50);
            return target;
        }
    }
    
    /**
     * Removes the ith "getTaskDescription" element
     */
    public void removeGetTaskDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GETTASKDESCRIPTION$50, i);
        }
    }
    
    /**
     * Gets array of all "getTaskDetails" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getGetTaskDetailsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GETTASKDETAILS$52, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "getTaskDetails" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getGetTaskDetailsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(GETTASKDETAILS$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "getTaskDetails" element
     */
    public int sizeOfGetTaskDetailsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GETTASKDETAILS$52);
        }
    }
    
    /**
     * Sets array of all "getTaskDetails" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGetTaskDetailsArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getTaskDetailsArray)
    {
        check_orphaned();
        arraySetterHelper(getTaskDetailsArray, GETTASKDETAILS$52);
    }
    
    /**
     * Sets ith "getTaskDetails" element
     */
    public void setGetTaskDetailsArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getTaskDetails)
    {
        generatedSetterHelperImpl(getTaskDetails, GETTASKDETAILS$52, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "getTaskDetails" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewGetTaskDetails(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(GETTASKDETAILS$52, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getTaskDetails" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewGetTaskDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(GETTASKDETAILS$52);
            return target;
        }
    }
    
    /**
     * Removes the ith "getTaskDetails" element
     */
    public void removeGetTaskDetails(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GETTASKDETAILS$52, i);
        }
    }
    
    /**
     * Gets array of all "getTaskHistory" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getGetTaskHistoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GETTASKHISTORY$54, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "getTaskHistory" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getGetTaskHistoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(GETTASKHISTORY$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "getTaskHistory" element
     */
    public int sizeOfGetTaskHistoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GETTASKHISTORY$54);
        }
    }
    
    /**
     * Sets array of all "getTaskHistory" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGetTaskHistoryArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getTaskHistoryArray)
    {
        check_orphaned();
        arraySetterHelper(getTaskHistoryArray, GETTASKHISTORY$54);
    }
    
    /**
     * Sets ith "getTaskHistory" element
     */
    public void setGetTaskHistoryArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getTaskHistory)
    {
        generatedSetterHelperImpl(getTaskHistory, GETTASKHISTORY$54, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "getTaskHistory" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewGetTaskHistory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(GETTASKHISTORY$54, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getTaskHistory" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewGetTaskHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(GETTASKHISTORY$54);
            return target;
        }
    }
    
    /**
     * Removes the ith "getTaskHistory" element
     */
    public void removeGetTaskHistory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GETTASKHISTORY$54, i);
        }
    }
    
    /**
     * Gets array of all "getTaskInstanceData" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getGetTaskInstanceDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GETTASKINSTANCEDATA$56, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "getTaskInstanceData" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getGetTaskInstanceDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(GETTASKINSTANCEDATA$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "getTaskInstanceData" element
     */
    public int sizeOfGetTaskInstanceDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GETTASKINSTANCEDATA$56);
        }
    }
    
    /**
     * Sets array of all "getTaskInstanceData" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGetTaskInstanceDataArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getTaskInstanceDataArray)
    {
        check_orphaned();
        arraySetterHelper(getTaskInstanceDataArray, GETTASKINSTANCEDATA$56);
    }
    
    /**
     * Sets ith "getTaskInstanceData" element
     */
    public void setGetTaskInstanceDataArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getTaskInstanceData)
    {
        generatedSetterHelperImpl(getTaskInstanceData, GETTASKINSTANCEDATA$56, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "getTaskInstanceData" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewGetTaskInstanceData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(GETTASKINSTANCEDATA$56, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getTaskInstanceData" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewGetTaskInstanceData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(GETTASKINSTANCEDATA$56);
            return target;
        }
    }
    
    /**
     * Removes the ith "getTaskInstanceData" element
     */
    public void removeGetTaskInstanceData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GETTASKINSTANCEDATA$56, i);
        }
    }
    
    /**
     * Gets array of all "hasSubtasks" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getHasSubtasksArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HASSUBTASKS$58, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "hasSubtasks" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getHasSubtasksArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(HASSUBTASKS$58, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hasSubtasks" element
     */
    public int sizeOfHasSubtasksArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASSUBTASKS$58);
        }
    }
    
    /**
     * Sets array of all "hasSubtasks" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setHasSubtasksArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] hasSubtasksArray)
    {
        check_orphaned();
        arraySetterHelper(hasSubtasksArray, HASSUBTASKS$58);
    }
    
    /**
     * Sets ith "hasSubtasks" element
     */
    public void setHasSubtasksArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation hasSubtasks)
    {
        generatedSetterHelperImpl(hasSubtasks, HASSUBTASKS$58, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hasSubtasks" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewHasSubtasks(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(HASSUBTASKS$58, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hasSubtasks" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewHasSubtasks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(HASSUBTASKS$58);
            return target;
        }
    }
    
    /**
     * Removes the ith "hasSubtasks" element
     */
    public void removeHasSubtasks(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASSUBTASKS$58, i);
        }
    }
    
    /**
     * Gets array of all "instantiateSubtask" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getInstantiateSubtaskArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INSTANTIATESUBTASK$60, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "instantiateSubtask" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getInstantiateSubtaskArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(INSTANTIATESUBTASK$60, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "instantiateSubtask" element
     */
    public int sizeOfInstantiateSubtaskArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSTANTIATESUBTASK$60);
        }
    }
    
    /**
     * Sets array of all "instantiateSubtask" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInstantiateSubtaskArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] instantiateSubtaskArray)
    {
        check_orphaned();
        arraySetterHelper(instantiateSubtaskArray, INSTANTIATESUBTASK$60);
    }
    
    /**
     * Sets ith "instantiateSubtask" element
     */
    public void setInstantiateSubtaskArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation instantiateSubtask)
    {
        generatedSetterHelperImpl(instantiateSubtask, INSTANTIATESUBTASK$60, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "instantiateSubtask" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewInstantiateSubtask(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(INSTANTIATESUBTASK$60, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "instantiateSubtask" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewInstantiateSubtask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(INSTANTIATESUBTASK$60);
            return target;
        }
    }
    
    /**
     * Removes the ith "instantiateSubtask" element
     */
    public void removeInstantiateSubtask(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSTANTIATESUBTASK$60, i);
        }
    }
    
    /**
     * Gets array of all "isSubtask" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getIsSubtaskArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ISSUBTASK$62, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "isSubtask" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getIsSubtaskArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(ISSUBTASK$62, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "isSubtask" element
     */
    public int sizeOfIsSubtaskArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSUBTASK$62);
        }
    }
    
    /**
     * Sets array of all "isSubtask" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIsSubtaskArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] isSubtaskArray)
    {
        check_orphaned();
        arraySetterHelper(isSubtaskArray, ISSUBTASK$62);
    }
    
    /**
     * Sets ith "isSubtask" element
     */
    public void setIsSubtaskArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation isSubtask)
    {
        generatedSetterHelperImpl(isSubtask, ISSUBTASK$62, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "isSubtask" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewIsSubtask(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(ISSUBTASK$62, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "isSubtask" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewIsSubtask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(ISSUBTASK$62);
            return target;
        }
    }
    
    /**
     * Removes the ith "isSubtask" element
     */
    public void removeIsSubtask(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSUBTASK$62, i);
        }
    }
    
    /**
     * Gets array of all "nominate" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getNominateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NOMINATE$64, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "nominate" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getNominateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(NOMINATE$64, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "nominate" element
     */
    public int sizeOfNominateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOMINATE$64);
        }
    }
    
    /**
     * Sets array of all "nominate" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setNominateArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] nominateArray)
    {
        check_orphaned();
        arraySetterHelper(nominateArray, NOMINATE$64);
    }
    
    /**
     * Sets ith "nominate" element
     */
    public void setNominateArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation nominate)
    {
        generatedSetterHelperImpl(nominate, NOMINATE$64, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "nominate" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewNominate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(NOMINATE$64, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "nominate" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewNominate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(NOMINATE$64);
            return target;
        }
    }
    
    /**
     * Removes the ith "nominate" element
     */
    public void removeNominate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOMINATE$64, i);
        }
    }
    
    /**
     * Gets array of all "release" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getReleaseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELEASE$66, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "release" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getReleaseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(RELEASE$66, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "release" element
     */
    public int sizeOfReleaseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELEASE$66);
        }
    }
    
    /**
     * Sets array of all "release" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setReleaseArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] releaseArray)
    {
        check_orphaned();
        arraySetterHelper(releaseArray, RELEASE$66);
    }
    
    /**
     * Sets ith "release" element
     */
    public void setReleaseArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation release)
    {
        generatedSetterHelperImpl(release, RELEASE$66, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "release" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewRelease(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(RELEASE$66, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "release" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewRelease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(RELEASE$66);
            return target;
        }
    }
    
    /**
     * Removes the ith "release" element
     */
    public void removeRelease(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELEASE$66, i);
        }
    }
    
    /**
     * Gets array of all "remove" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getRemoveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REMOVE$68, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "remove" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getRemoveArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(REMOVE$68, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "remove" element
     */
    public int sizeOfRemoveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REMOVE$68);
        }
    }
    
    /**
     * Sets array of all "remove" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRemoveArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] removeArray)
    {
        check_orphaned();
        arraySetterHelper(removeArray, REMOVE$68);
    }
    
    /**
     * Sets ith "remove" element
     */
    public void setRemoveArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation remove)
    {
        generatedSetterHelperImpl(remove, REMOVE$68, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "remove" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewRemove(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(REMOVE$68, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "remove" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewRemove()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(REMOVE$68);
            return target;
        }
    }
    
    /**
     * Removes the ith "remove" element
     */
    public void removeRemove(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REMOVE$68, i);
        }
    }
    
    /**
     * Gets array of all "resume" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getResumeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESUME$70, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resume" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getResumeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(RESUME$70, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resume" element
     */
    public int sizeOfResumeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESUME$70);
        }
    }
    
    /**
     * Sets array of all "resume" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResumeArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] resumeArray)
    {
        check_orphaned();
        arraySetterHelper(resumeArray, RESUME$70);
    }
    
    /**
     * Sets ith "resume" element
     */
    public void setResumeArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation resume)
    {
        generatedSetterHelperImpl(resume, RESUME$70, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resume" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewResume(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(RESUME$70, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resume" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewResume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(RESUME$70);
            return target;
        }
    }
    
    /**
     * Removes the ith "resume" element
     */
    public void removeResume(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESUME$70, i);
        }
    }
    
    /**
     * Gets array of all "setFault" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getSetFaultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SETFAULT$72, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "setFault" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getSetFaultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(SETFAULT$72, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "setFault" element
     */
    public int sizeOfSetFaultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SETFAULT$72);
        }
    }
    
    /**
     * Sets array of all "setFault" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSetFaultArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] setFaultArray)
    {
        check_orphaned();
        arraySetterHelper(setFaultArray, SETFAULT$72);
    }
    
    /**
     * Sets ith "setFault" element
     */
    public void setSetFaultArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation setFault)
    {
        generatedSetterHelperImpl(setFault, SETFAULT$72, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "setFault" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewSetFault(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(SETFAULT$72, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "setFault" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewSetFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(SETFAULT$72);
            return target;
        }
    }
    
    /**
     * Removes the ith "setFault" element
     */
    public void removeSetFault(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SETFAULT$72, i);
        }
    }
    
    /**
     * Gets array of all "setGenericHumanRole" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getSetGenericHumanRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SETGENERICHUMANROLE$74, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "setGenericHumanRole" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getSetGenericHumanRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(SETGENERICHUMANROLE$74, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "setGenericHumanRole" element
     */
    public int sizeOfSetGenericHumanRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SETGENERICHUMANROLE$74);
        }
    }
    
    /**
     * Sets array of all "setGenericHumanRole" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSetGenericHumanRoleArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] setGenericHumanRoleArray)
    {
        check_orphaned();
        arraySetterHelper(setGenericHumanRoleArray, SETGENERICHUMANROLE$74);
    }
    
    /**
     * Sets ith "setGenericHumanRole" element
     */
    public void setSetGenericHumanRoleArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation setGenericHumanRole)
    {
        generatedSetterHelperImpl(setGenericHumanRole, SETGENERICHUMANROLE$74, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "setGenericHumanRole" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewSetGenericHumanRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(SETGENERICHUMANROLE$74, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "setGenericHumanRole" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewSetGenericHumanRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(SETGENERICHUMANROLE$74);
            return target;
        }
    }
    
    /**
     * Removes the ith "setGenericHumanRole" element
     */
    public void removeSetGenericHumanRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SETGENERICHUMANROLE$74, i);
        }
    }
    
    /**
     * Gets array of all "setOutput" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getSetOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SETOUTPUT$76, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "setOutput" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getSetOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(SETOUTPUT$76, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "setOutput" element
     */
    public int sizeOfSetOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SETOUTPUT$76);
        }
    }
    
    /**
     * Sets array of all "setOutput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSetOutputArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] setOutputArray)
    {
        check_orphaned();
        arraySetterHelper(setOutputArray, SETOUTPUT$76);
    }
    
    /**
     * Sets ith "setOutput" element
     */
    public void setSetOutputArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation setOutput)
    {
        generatedSetterHelperImpl(setOutput, SETOUTPUT$76, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "setOutput" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewSetOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(SETOUTPUT$76, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "setOutput" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewSetOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(SETOUTPUT$76);
            return target;
        }
    }
    
    /**
     * Removes the ith "setOutput" element
     */
    public void removeSetOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SETOUTPUT$76, i);
        }
    }
    
    /**
     * Gets array of all "setPriority" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getSetPriorityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SETPRIORITY$78, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "setPriority" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getSetPriorityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(SETPRIORITY$78, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "setPriority" element
     */
    public int sizeOfSetPriorityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SETPRIORITY$78);
        }
    }
    
    /**
     * Sets array of all "setPriority" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSetPriorityArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] setPriorityArray)
    {
        check_orphaned();
        arraySetterHelper(setPriorityArray, SETPRIORITY$78);
    }
    
    /**
     * Sets ith "setPriority" element
     */
    public void setSetPriorityArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation setPriority)
    {
        generatedSetterHelperImpl(setPriority, SETPRIORITY$78, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "setPriority" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewSetPriority(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(SETPRIORITY$78, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "setPriority" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewSetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(SETPRIORITY$78);
            return target;
        }
    }
    
    /**
     * Removes the ith "setPriority" element
     */
    public void removeSetPriority(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SETPRIORITY$78, i);
        }
    }
    
    /**
     * Gets array of all "setTaskCompletionDeadlineExpression" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getSetTaskCompletionDeadlineExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SETTASKCOMPLETIONDEADLINEEXPRESSION$80, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "setTaskCompletionDeadlineExpression" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getSetTaskCompletionDeadlineExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(SETTASKCOMPLETIONDEADLINEEXPRESSION$80, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "setTaskCompletionDeadlineExpression" element
     */
    public int sizeOfSetTaskCompletionDeadlineExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SETTASKCOMPLETIONDEADLINEEXPRESSION$80);
        }
    }
    
    /**
     * Sets array of all "setTaskCompletionDeadlineExpression" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSetTaskCompletionDeadlineExpressionArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] setTaskCompletionDeadlineExpressionArray)
    {
        check_orphaned();
        arraySetterHelper(setTaskCompletionDeadlineExpressionArray, SETTASKCOMPLETIONDEADLINEEXPRESSION$80);
    }
    
    /**
     * Sets ith "setTaskCompletionDeadlineExpression" element
     */
    public void setSetTaskCompletionDeadlineExpressionArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation setTaskCompletionDeadlineExpression)
    {
        generatedSetterHelperImpl(setTaskCompletionDeadlineExpression, SETTASKCOMPLETIONDEADLINEEXPRESSION$80, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "setTaskCompletionDeadlineExpression" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewSetTaskCompletionDeadlineExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(SETTASKCOMPLETIONDEADLINEEXPRESSION$80, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "setTaskCompletionDeadlineExpression" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewSetTaskCompletionDeadlineExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(SETTASKCOMPLETIONDEADLINEEXPRESSION$80);
            return target;
        }
    }
    
    /**
     * Removes the ith "setTaskCompletionDeadlineExpression" element
     */
    public void removeSetTaskCompletionDeadlineExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SETTASKCOMPLETIONDEADLINEEXPRESSION$80, i);
        }
    }
    
    /**
     * Gets array of all "setTaskCompletionDurationExpression" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getSetTaskCompletionDurationExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SETTASKCOMPLETIONDURATIONEXPRESSION$82, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "setTaskCompletionDurationExpression" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getSetTaskCompletionDurationExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(SETTASKCOMPLETIONDURATIONEXPRESSION$82, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "setTaskCompletionDurationExpression" element
     */
    public int sizeOfSetTaskCompletionDurationExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SETTASKCOMPLETIONDURATIONEXPRESSION$82);
        }
    }
    
    /**
     * Sets array of all "setTaskCompletionDurationExpression" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSetTaskCompletionDurationExpressionArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] setTaskCompletionDurationExpressionArray)
    {
        check_orphaned();
        arraySetterHelper(setTaskCompletionDurationExpressionArray, SETTASKCOMPLETIONDURATIONEXPRESSION$82);
    }
    
    /**
     * Sets ith "setTaskCompletionDurationExpression" element
     */
    public void setSetTaskCompletionDurationExpressionArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation setTaskCompletionDurationExpression)
    {
        generatedSetterHelperImpl(setTaskCompletionDurationExpression, SETTASKCOMPLETIONDURATIONEXPRESSION$82, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "setTaskCompletionDurationExpression" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewSetTaskCompletionDurationExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(SETTASKCOMPLETIONDURATIONEXPRESSION$82, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "setTaskCompletionDurationExpression" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewSetTaskCompletionDurationExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(SETTASKCOMPLETIONDURATIONEXPRESSION$82);
            return target;
        }
    }
    
    /**
     * Removes the ith "setTaskCompletionDurationExpression" element
     */
    public void removeSetTaskCompletionDurationExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SETTASKCOMPLETIONDURATIONEXPRESSION$82, i);
        }
    }
    
    /**
     * Gets array of all "setTaskStartDeadlineExpression" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getSetTaskStartDeadlineExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SETTASKSTARTDEADLINEEXPRESSION$84, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "setTaskStartDeadlineExpression" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getSetTaskStartDeadlineExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(SETTASKSTARTDEADLINEEXPRESSION$84, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "setTaskStartDeadlineExpression" element
     */
    public int sizeOfSetTaskStartDeadlineExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SETTASKSTARTDEADLINEEXPRESSION$84);
        }
    }
    
    /**
     * Sets array of all "setTaskStartDeadlineExpression" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSetTaskStartDeadlineExpressionArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] setTaskStartDeadlineExpressionArray)
    {
        check_orphaned();
        arraySetterHelper(setTaskStartDeadlineExpressionArray, SETTASKSTARTDEADLINEEXPRESSION$84);
    }
    
    /**
     * Sets ith "setTaskStartDeadlineExpression" element
     */
    public void setSetTaskStartDeadlineExpressionArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation setTaskStartDeadlineExpression)
    {
        generatedSetterHelperImpl(setTaskStartDeadlineExpression, SETTASKSTARTDEADLINEEXPRESSION$84, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "setTaskStartDeadlineExpression" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewSetTaskStartDeadlineExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(SETTASKSTARTDEADLINEEXPRESSION$84, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "setTaskStartDeadlineExpression" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewSetTaskStartDeadlineExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(SETTASKSTARTDEADLINEEXPRESSION$84);
            return target;
        }
    }
    
    /**
     * Removes the ith "setTaskStartDeadlineExpression" element
     */
    public void removeSetTaskStartDeadlineExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SETTASKSTARTDEADLINEEXPRESSION$84, i);
        }
    }
    
    /**
     * Gets array of all "setTaskStartDurationExpression" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getSetTaskStartDurationExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SETTASKSTARTDURATIONEXPRESSION$86, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "setTaskStartDurationExpression" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getSetTaskStartDurationExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(SETTASKSTARTDURATIONEXPRESSION$86, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "setTaskStartDurationExpression" element
     */
    public int sizeOfSetTaskStartDurationExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SETTASKSTARTDURATIONEXPRESSION$86);
        }
    }
    
    /**
     * Sets array of all "setTaskStartDurationExpression" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSetTaskStartDurationExpressionArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] setTaskStartDurationExpressionArray)
    {
        check_orphaned();
        arraySetterHelper(setTaskStartDurationExpressionArray, SETTASKSTARTDURATIONEXPRESSION$86);
    }
    
    /**
     * Sets ith "setTaskStartDurationExpression" element
     */
    public void setSetTaskStartDurationExpressionArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation setTaskStartDurationExpression)
    {
        generatedSetterHelperImpl(setTaskStartDurationExpression, SETTASKSTARTDURATIONEXPRESSION$86, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "setTaskStartDurationExpression" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewSetTaskStartDurationExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(SETTASKSTARTDURATIONEXPRESSION$86, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "setTaskStartDurationExpression" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewSetTaskStartDurationExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(SETTASKSTARTDURATIONEXPRESSION$86);
            return target;
        }
    }
    
    /**
     * Removes the ith "setTaskStartDurationExpression" element
     */
    public void removeSetTaskStartDurationExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SETTASKSTARTDURATIONEXPRESSION$86, i);
        }
    }
    
    /**
     * Gets array of all "skip" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getSkipArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SKIP$88, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "skip" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getSkipArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(SKIP$88, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "skip" element
     */
    public int sizeOfSkipArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SKIP$88);
        }
    }
    
    /**
     * Sets array of all "skip" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSkipArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] skipArray)
    {
        check_orphaned();
        arraySetterHelper(skipArray, SKIP$88);
    }
    
    /**
     * Sets ith "skip" element
     */
    public void setSkipArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation skip)
    {
        generatedSetterHelperImpl(skip, SKIP$88, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "skip" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewSkip(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(SKIP$88, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "skip" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewSkip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(SKIP$88);
            return target;
        }
    }
    
    /**
     * Removes the ith "skip" element
     */
    public void removeSkip(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SKIP$88, i);
        }
    }
    
    /**
     * Gets array of all "start" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(START$90, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "start" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getStartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(START$90, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "start" element
     */
    public int sizeOfStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(START$90);
        }
    }
    
    /**
     * Sets array of all "start" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setStartArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] startArray)
    {
        check_orphaned();
        arraySetterHelper(startArray, START$90);
    }
    
    /**
     * Sets ith "start" element
     */
    public void setStartArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation start)
    {
        generatedSetterHelperImpl(start, START$90, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "start" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(START$90, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "start" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(START$90);
            return target;
        }
    }
    
    /**
     * Removes the ith "start" element
     */
    public void removeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(START$90, i);
        }
    }
    
    /**
     * Gets array of all "stop" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getStopArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STOP$92, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "stop" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getStopArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(STOP$92, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "stop" element
     */
    public int sizeOfStopArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STOP$92);
        }
    }
    
    /**
     * Sets array of all "stop" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setStopArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] stopArray)
    {
        check_orphaned();
        arraySetterHelper(stopArray, STOP$92);
    }
    
    /**
     * Sets ith "stop" element
     */
    public void setStopArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation stop)
    {
        generatedSetterHelperImpl(stop, STOP$92, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "stop" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewStop(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(STOP$92, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "stop" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewStop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(STOP$92);
            return target;
        }
    }
    
    /**
     * Removes the ith "stop" element
     */
    public void removeStop(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STOP$92, i);
        }
    }
    
    /**
     * Gets array of all "suspend" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getSuspendArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUSPEND$94, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "suspend" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getSuspendArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(SUSPEND$94, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "suspend" element
     */
    public int sizeOfSuspendArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUSPEND$94);
        }
    }
    
    /**
     * Sets array of all "suspend" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSuspendArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] suspendArray)
    {
        check_orphaned();
        arraySetterHelper(suspendArray, SUSPEND$94);
    }
    
    /**
     * Sets ith "suspend" element
     */
    public void setSuspendArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation suspend)
    {
        generatedSetterHelperImpl(suspend, SUSPEND$94, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "suspend" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewSuspend(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(SUSPEND$94, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "suspend" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewSuspend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(SUSPEND$94);
            return target;
        }
    }
    
    /**
     * Removes the ith "suspend" element
     */
    public void removeSuspend(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUSPEND$94, i);
        }
    }
    
    /**
     * Gets array of all "suspendUntil" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getSuspendUntilArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUSPENDUNTIL$96, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "suspendUntil" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getSuspendUntilArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(SUSPENDUNTIL$96, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "suspendUntil" element
     */
    public int sizeOfSuspendUntilArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUSPENDUNTIL$96);
        }
    }
    
    /**
     * Sets array of all "suspendUntil" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSuspendUntilArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] suspendUntilArray)
    {
        check_orphaned();
        arraySetterHelper(suspendUntilArray, SUSPENDUNTIL$96);
    }
    
    /**
     * Sets ith "suspendUntil" element
     */
    public void setSuspendUntilArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation suspendUntil)
    {
        generatedSetterHelperImpl(suspendUntil, SUSPENDUNTIL$96, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "suspendUntil" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewSuspendUntil(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(SUSPENDUNTIL$96, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "suspendUntil" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewSuspendUntil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(SUSPENDUNTIL$96);
            return target;
        }
    }
    
    /**
     * Removes the ith "suspendUntil" element
     */
    public void removeSuspendUntil(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUSPENDUNTIL$96, i);
        }
    }
    
    /**
     * Gets array of all "updateComment" elements
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] getUpdateCommentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UPDATECOMMENT$98, targetList);
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "updateComment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation getUpdateCommentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().find_element_user(UPDATECOMMENT$98, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "updateComment" element
     */
    public int sizeOfUpdateCommentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPDATECOMMENT$98);
        }
    }
    
    /**
     * Sets array of all "updateComment" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setUpdateCommentArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation[] updateCommentArray)
    {
        check_orphaned();
        arraySetterHelper(updateCommentArray, UPDATECOMMENT$98);
    }
    
    /**
     * Sets ith "updateComment" element
     */
    public void setUpdateCommentArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation updateComment)
    {
        generatedSetterHelperImpl(updateComment, UPDATECOMMENT$98, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "updateComment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation insertNewUpdateComment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().insert_element_user(UPDATECOMMENT$98, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "updateComment" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation addNewUpdateComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperation)get_store().add_element_user(UPDATECOMMENT$98);
            return target;
        }
    }
    
    /**
     * Removes the ith "updateComment" element
     */
    public void removeUpdateComment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPDATECOMMENT$98, i);
        }
    }
}
