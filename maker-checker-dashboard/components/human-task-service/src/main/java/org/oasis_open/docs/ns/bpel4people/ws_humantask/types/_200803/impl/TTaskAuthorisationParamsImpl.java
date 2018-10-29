/*
 * XML Type:  tTaskAuthorisationParams
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAuthorisationParams
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * An XML tTaskAuthorisationParams(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
 *
 * This is a complex type.
 */
public class TTaskAuthorisationParamsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAuthorisationParams
{
    private static final long serialVersionUID = 1L;
    
    public TTaskAuthorisationParamsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHORISEDTOCLAIM$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToClaim");
    private static final javax.xml.namespace.QName AUTHORISEDTOCOMPLETE$2 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToComplete");
    private static final javax.xml.namespace.QName AUTHORISEDTODELEGATE$4 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToDelegate");
    private static final javax.xml.namespace.QName AUTHORISEDTOEXIT$6 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToExit");
    private static final javax.xml.namespace.QName AUTHORISEDTONOMINATE$8 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToNominate");
    private static final javax.xml.namespace.QName AUTHORISEDTOSTOP$10 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToStop");
    private static final javax.xml.namespace.QName AUTHORISEDTOCOMMENT$12 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToComment");
    private static final javax.xml.namespace.QName AUTHORISEDTOGETCOMMENTS$14 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToGetComments");
    private static final javax.xml.namespace.QName AUTHORISEDTODELETECOMMENT$16 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToDeleteComment");
    private static final javax.xml.namespace.QName AUTHORISEDTOUPDATECOMMENT$18 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToUpdateComment");
    private static final javax.xml.namespace.QName AUTHORISEDTODELETEFAULT$20 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToDeleteFault");
    private static final javax.xml.namespace.QName AUTHORISEDTOFAIL$22 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToFail");
    private static final javax.xml.namespace.QName AUTHORISEDTOFORWARD$24 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToForward");
    private static final javax.xml.namespace.QName AUTHORISEDTODELETEOUTPUT$26 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToDeleteOutput");
    private static final javax.xml.namespace.QName AUTHORISEDTORELEASE$28 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToRelease");
    private static final javax.xml.namespace.QName AUTHORISEDTORESUME$30 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToResume");
    private static final javax.xml.namespace.QName AUTHORISEDTOREMOVE$32 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToRemove");
    private static final javax.xml.namespace.QName AUTHORISEDTOSUSPEND$34 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToSuspend");
    private static final javax.xml.namespace.QName AUTHORISEDTOSETPRIORITY$36 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToSetPriority");
    private static final javax.xml.namespace.QName AUTHORISEDTOSKIP$38 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToSkip");
    private static final javax.xml.namespace.QName AUTHORISEDTOSTART$40 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToStart");
    private static final javax.xml.namespace.QName AUTHORISEDTOSETFAULT$42 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToSetFault");
    private static final javax.xml.namespace.QName AUTHORISEDTOGETINPUT$44 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToGetInput");
    private static final javax.xml.namespace.QName AUTHORISEDTOGETDESCRIPTION$46 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToGetDescription");
    private static final javax.xml.namespace.QName AUTHORISEDTOSETOUTPUT$48 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToSetOutput");
    private static final javax.xml.namespace.QName AUTHORISEDTOACTIVATE$50 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "authorisedToActivate");
    
    
    /**
     * Gets the "authorisedToClaim" element
     */
    public boolean getAuthorisedToClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOCLAIM$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToClaim" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOCLAIM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToClaim" element
     */
    public void setAuthorisedToClaim(boolean authorisedToClaim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOCLAIM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTOCLAIM$0);
            }
            target.setBooleanValue(authorisedToClaim);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToClaim" element
     */
    public void xsetAuthorisedToClaim(org.apache.xmlbeans.XmlBoolean authorisedToClaim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOCLAIM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTOCLAIM$0);
            }
            target.set(authorisedToClaim);
        }
    }
    
    /**
     * Gets the "authorisedToComplete" element
     */
    public boolean getAuthorisedToComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOCOMPLETE$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToComplete" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOCOMPLETE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToComplete" element
     */
    public void setAuthorisedToComplete(boolean authorisedToComplete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOCOMPLETE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTOCOMPLETE$2);
            }
            target.setBooleanValue(authorisedToComplete);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToComplete" element
     */
    public void xsetAuthorisedToComplete(org.apache.xmlbeans.XmlBoolean authorisedToComplete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOCOMPLETE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTOCOMPLETE$2);
            }
            target.set(authorisedToComplete);
        }
    }
    
    /**
     * Gets the "authorisedToDelegate" element
     */
    public boolean getAuthorisedToDelegate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTODELEGATE$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToDelegate" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToDelegate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTODELEGATE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToDelegate" element
     */
    public void setAuthorisedToDelegate(boolean authorisedToDelegate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTODELEGATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTODELEGATE$4);
            }
            target.setBooleanValue(authorisedToDelegate);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToDelegate" element
     */
    public void xsetAuthorisedToDelegate(org.apache.xmlbeans.XmlBoolean authorisedToDelegate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTODELEGATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTODELEGATE$4);
            }
            target.set(authorisedToDelegate);
        }
    }
    
    /**
     * Gets the "authorisedToExit" element
     */
    public boolean getAuthorisedToExit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOEXIT$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToExit" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToExit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOEXIT$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToExit" element
     */
    public void setAuthorisedToExit(boolean authorisedToExit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOEXIT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTOEXIT$6);
            }
            target.setBooleanValue(authorisedToExit);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToExit" element
     */
    public void xsetAuthorisedToExit(org.apache.xmlbeans.XmlBoolean authorisedToExit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOEXIT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTOEXIT$6);
            }
            target.set(authorisedToExit);
        }
    }
    
    /**
     * Gets the "authorisedToNominate" element
     */
    public boolean getAuthorisedToNominate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTONOMINATE$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToNominate" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToNominate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTONOMINATE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToNominate" element
     */
    public void setAuthorisedToNominate(boolean authorisedToNominate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTONOMINATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTONOMINATE$8);
            }
            target.setBooleanValue(authorisedToNominate);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToNominate" element
     */
    public void xsetAuthorisedToNominate(org.apache.xmlbeans.XmlBoolean authorisedToNominate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTONOMINATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTONOMINATE$8);
            }
            target.set(authorisedToNominate);
        }
    }
    
    /**
     * Gets the "authorisedToStop" element
     */
    public boolean getAuthorisedToStop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOSTOP$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToStop" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToStop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOSTOP$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToStop" element
     */
    public void setAuthorisedToStop(boolean authorisedToStop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOSTOP$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTOSTOP$10);
            }
            target.setBooleanValue(authorisedToStop);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToStop" element
     */
    public void xsetAuthorisedToStop(org.apache.xmlbeans.XmlBoolean authorisedToStop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOSTOP$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTOSTOP$10);
            }
            target.set(authorisedToStop);
        }
    }
    
    /**
     * Gets the "authorisedToComment" element
     */
    public boolean getAuthorisedToComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOCOMMENT$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToComment" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOCOMMENT$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToComment" element
     */
    public void setAuthorisedToComment(boolean authorisedToComment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOCOMMENT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTOCOMMENT$12);
            }
            target.setBooleanValue(authorisedToComment);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToComment" element
     */
    public void xsetAuthorisedToComment(org.apache.xmlbeans.XmlBoolean authorisedToComment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOCOMMENT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTOCOMMENT$12);
            }
            target.set(authorisedToComment);
        }
    }
    
    /**
     * Gets the "authorisedToGetComments" element
     */
    public boolean getAuthorisedToGetComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOGETCOMMENTS$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToGetComments" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToGetComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOGETCOMMENTS$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToGetComments" element
     */
    public void setAuthorisedToGetComments(boolean authorisedToGetComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOGETCOMMENTS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTOGETCOMMENTS$14);
            }
            target.setBooleanValue(authorisedToGetComments);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToGetComments" element
     */
    public void xsetAuthorisedToGetComments(org.apache.xmlbeans.XmlBoolean authorisedToGetComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOGETCOMMENTS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTOGETCOMMENTS$14);
            }
            target.set(authorisedToGetComments);
        }
    }
    
    /**
     * Gets the "authorisedToDeleteComment" element
     */
    public boolean getAuthorisedToDeleteComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTODELETECOMMENT$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToDeleteComment" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToDeleteComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTODELETECOMMENT$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToDeleteComment" element
     */
    public void setAuthorisedToDeleteComment(boolean authorisedToDeleteComment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTODELETECOMMENT$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTODELETECOMMENT$16);
            }
            target.setBooleanValue(authorisedToDeleteComment);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToDeleteComment" element
     */
    public void xsetAuthorisedToDeleteComment(org.apache.xmlbeans.XmlBoolean authorisedToDeleteComment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTODELETECOMMENT$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTODELETECOMMENT$16);
            }
            target.set(authorisedToDeleteComment);
        }
    }
    
    /**
     * Gets the "authorisedToUpdateComment" element
     */
    public boolean getAuthorisedToUpdateComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOUPDATECOMMENT$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToUpdateComment" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToUpdateComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOUPDATECOMMENT$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToUpdateComment" element
     */
    public void setAuthorisedToUpdateComment(boolean authorisedToUpdateComment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOUPDATECOMMENT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTOUPDATECOMMENT$18);
            }
            target.setBooleanValue(authorisedToUpdateComment);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToUpdateComment" element
     */
    public void xsetAuthorisedToUpdateComment(org.apache.xmlbeans.XmlBoolean authorisedToUpdateComment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOUPDATECOMMENT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTOUPDATECOMMENT$18);
            }
            target.set(authorisedToUpdateComment);
        }
    }
    
    /**
     * Gets the "authorisedToDeleteFault" element
     */
    public boolean getAuthorisedToDeleteFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTODELETEFAULT$20, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToDeleteFault" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToDeleteFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTODELETEFAULT$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToDeleteFault" element
     */
    public void setAuthorisedToDeleteFault(boolean authorisedToDeleteFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTODELETEFAULT$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTODELETEFAULT$20);
            }
            target.setBooleanValue(authorisedToDeleteFault);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToDeleteFault" element
     */
    public void xsetAuthorisedToDeleteFault(org.apache.xmlbeans.XmlBoolean authorisedToDeleteFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTODELETEFAULT$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTODELETEFAULT$20);
            }
            target.set(authorisedToDeleteFault);
        }
    }
    
    /**
     * Gets the "authorisedToFail" element
     */
    public boolean getAuthorisedToFail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOFAIL$22, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToFail" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToFail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOFAIL$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToFail" element
     */
    public void setAuthorisedToFail(boolean authorisedToFail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOFAIL$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTOFAIL$22);
            }
            target.setBooleanValue(authorisedToFail);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToFail" element
     */
    public void xsetAuthorisedToFail(org.apache.xmlbeans.XmlBoolean authorisedToFail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOFAIL$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTOFAIL$22);
            }
            target.set(authorisedToFail);
        }
    }
    
    /**
     * Gets the "authorisedToForward" element
     */
    public boolean getAuthorisedToForward()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOFORWARD$24, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToForward" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToForward()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOFORWARD$24, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToForward" element
     */
    public void setAuthorisedToForward(boolean authorisedToForward)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOFORWARD$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTOFORWARD$24);
            }
            target.setBooleanValue(authorisedToForward);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToForward" element
     */
    public void xsetAuthorisedToForward(org.apache.xmlbeans.XmlBoolean authorisedToForward)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOFORWARD$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTOFORWARD$24);
            }
            target.set(authorisedToForward);
        }
    }
    
    /**
     * Gets the "authorisedToDeleteOutput" element
     */
    public boolean getAuthorisedToDeleteOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTODELETEOUTPUT$26, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToDeleteOutput" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToDeleteOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTODELETEOUTPUT$26, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToDeleteOutput" element
     */
    public void setAuthorisedToDeleteOutput(boolean authorisedToDeleteOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTODELETEOUTPUT$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTODELETEOUTPUT$26);
            }
            target.setBooleanValue(authorisedToDeleteOutput);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToDeleteOutput" element
     */
    public void xsetAuthorisedToDeleteOutput(org.apache.xmlbeans.XmlBoolean authorisedToDeleteOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTODELETEOUTPUT$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTODELETEOUTPUT$26);
            }
            target.set(authorisedToDeleteOutput);
        }
    }
    
    /**
     * Gets the "authorisedToRelease" element
     */
    public boolean getAuthorisedToRelease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTORELEASE$28, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToRelease" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToRelease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTORELEASE$28, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToRelease" element
     */
    public void setAuthorisedToRelease(boolean authorisedToRelease)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTORELEASE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTORELEASE$28);
            }
            target.setBooleanValue(authorisedToRelease);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToRelease" element
     */
    public void xsetAuthorisedToRelease(org.apache.xmlbeans.XmlBoolean authorisedToRelease)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTORELEASE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTORELEASE$28);
            }
            target.set(authorisedToRelease);
        }
    }
    
    /**
     * Gets the "authorisedToResume" element
     */
    public boolean getAuthorisedToResume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTORESUME$30, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToResume" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToResume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTORESUME$30, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToResume" element
     */
    public void setAuthorisedToResume(boolean authorisedToResume)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTORESUME$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTORESUME$30);
            }
            target.setBooleanValue(authorisedToResume);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToResume" element
     */
    public void xsetAuthorisedToResume(org.apache.xmlbeans.XmlBoolean authorisedToResume)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTORESUME$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTORESUME$30);
            }
            target.set(authorisedToResume);
        }
    }
    
    /**
     * Gets the "authorisedToRemove" element
     */
    public boolean getAuthorisedToRemove()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOREMOVE$32, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToRemove" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToRemove()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOREMOVE$32, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToRemove" element
     */
    public void setAuthorisedToRemove(boolean authorisedToRemove)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOREMOVE$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTOREMOVE$32);
            }
            target.setBooleanValue(authorisedToRemove);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToRemove" element
     */
    public void xsetAuthorisedToRemove(org.apache.xmlbeans.XmlBoolean authorisedToRemove)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOREMOVE$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTOREMOVE$32);
            }
            target.set(authorisedToRemove);
        }
    }
    
    /**
     * Gets the "authorisedToSuspend" element
     */
    public boolean getAuthorisedToSuspend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOSUSPEND$34, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToSuspend" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToSuspend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOSUSPEND$34, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToSuspend" element
     */
    public void setAuthorisedToSuspend(boolean authorisedToSuspend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOSUSPEND$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTOSUSPEND$34);
            }
            target.setBooleanValue(authorisedToSuspend);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToSuspend" element
     */
    public void xsetAuthorisedToSuspend(org.apache.xmlbeans.XmlBoolean authorisedToSuspend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOSUSPEND$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTOSUSPEND$34);
            }
            target.set(authorisedToSuspend);
        }
    }
    
    /**
     * Gets the "authorisedToSetPriority" element
     */
    public boolean getAuthorisedToSetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOSETPRIORITY$36, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToSetPriority" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToSetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOSETPRIORITY$36, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToSetPriority" element
     */
    public void setAuthorisedToSetPriority(boolean authorisedToSetPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOSETPRIORITY$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTOSETPRIORITY$36);
            }
            target.setBooleanValue(authorisedToSetPriority);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToSetPriority" element
     */
    public void xsetAuthorisedToSetPriority(org.apache.xmlbeans.XmlBoolean authorisedToSetPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOSETPRIORITY$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTOSETPRIORITY$36);
            }
            target.set(authorisedToSetPriority);
        }
    }
    
    /**
     * Gets the "authorisedToSkip" element
     */
    public boolean getAuthorisedToSkip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOSKIP$38, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToSkip" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToSkip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOSKIP$38, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToSkip" element
     */
    public void setAuthorisedToSkip(boolean authorisedToSkip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOSKIP$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTOSKIP$38);
            }
            target.setBooleanValue(authorisedToSkip);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToSkip" element
     */
    public void xsetAuthorisedToSkip(org.apache.xmlbeans.XmlBoolean authorisedToSkip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOSKIP$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTOSKIP$38);
            }
            target.set(authorisedToSkip);
        }
    }
    
    /**
     * Gets the "authorisedToStart" element
     */
    public boolean getAuthorisedToStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOSTART$40, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToStart" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOSTART$40, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToStart" element
     */
    public void setAuthorisedToStart(boolean authorisedToStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOSTART$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTOSTART$40);
            }
            target.setBooleanValue(authorisedToStart);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToStart" element
     */
    public void xsetAuthorisedToStart(org.apache.xmlbeans.XmlBoolean authorisedToStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOSTART$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTOSTART$40);
            }
            target.set(authorisedToStart);
        }
    }
    
    /**
     * Gets the "authorisedToSetFault" element
     */
    public boolean getAuthorisedToSetFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOSETFAULT$42, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToSetFault" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToSetFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOSETFAULT$42, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToSetFault" element
     */
    public void setAuthorisedToSetFault(boolean authorisedToSetFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOSETFAULT$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTOSETFAULT$42);
            }
            target.setBooleanValue(authorisedToSetFault);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToSetFault" element
     */
    public void xsetAuthorisedToSetFault(org.apache.xmlbeans.XmlBoolean authorisedToSetFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOSETFAULT$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTOSETFAULT$42);
            }
            target.set(authorisedToSetFault);
        }
    }
    
    /**
     * Gets the "authorisedToGetInput" element
     */
    public boolean getAuthorisedToGetInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOGETINPUT$44, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToGetInput" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToGetInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOGETINPUT$44, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToGetInput" element
     */
    public void setAuthorisedToGetInput(boolean authorisedToGetInput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOGETINPUT$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTOGETINPUT$44);
            }
            target.setBooleanValue(authorisedToGetInput);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToGetInput" element
     */
    public void xsetAuthorisedToGetInput(org.apache.xmlbeans.XmlBoolean authorisedToGetInput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOGETINPUT$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTOGETINPUT$44);
            }
            target.set(authorisedToGetInput);
        }
    }
    
    /**
     * Gets the "authorisedToGetDescription" element
     */
    public boolean getAuthorisedToGetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOGETDESCRIPTION$46, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToGetDescription" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToGetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOGETDESCRIPTION$46, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToGetDescription" element
     */
    public void setAuthorisedToGetDescription(boolean authorisedToGetDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOGETDESCRIPTION$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTOGETDESCRIPTION$46);
            }
            target.setBooleanValue(authorisedToGetDescription);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToGetDescription" element
     */
    public void xsetAuthorisedToGetDescription(org.apache.xmlbeans.XmlBoolean authorisedToGetDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOGETDESCRIPTION$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTOGETDESCRIPTION$46);
            }
            target.set(authorisedToGetDescription);
        }
    }
    
    /**
     * Gets the "authorisedToSetOutput" element
     */
    public boolean getAuthorisedToSetOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOSETOUTPUT$48, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToSetOutput" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToSetOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOSETOUTPUT$48, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToSetOutput" element
     */
    public void setAuthorisedToSetOutput(boolean authorisedToSetOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOSETOUTPUT$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTOSETOUTPUT$48);
            }
            target.setBooleanValue(authorisedToSetOutput);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToSetOutput" element
     */
    public void xsetAuthorisedToSetOutput(org.apache.xmlbeans.XmlBoolean authorisedToSetOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOSETOUTPUT$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTOSETOUTPUT$48);
            }
            target.set(authorisedToSetOutput);
        }
    }
    
    /**
     * Gets the "authorisedToActivate" element
     */
    public boolean getAuthorisedToActivate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOACTIVATE$50, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorisedToActivate" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuthorisedToActivate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOACTIVATE$50, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorisedToActivate" element
     */
    public void setAuthorisedToActivate(boolean authorisedToActivate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORISEDTOACTIVATE$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORISEDTOACTIVATE$50);
            }
            target.setBooleanValue(authorisedToActivate);
        }
    }
    
    /**
     * Sets (as xml) the "authorisedToActivate" element
     */
    public void xsetAuthorisedToActivate(org.apache.xmlbeans.XmlBoolean authorisedToActivate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTHORISEDTOACTIVATE$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTHORISEDTOACTIVATE$50);
            }
            target.set(authorisedToActivate);
        }
    }
}
