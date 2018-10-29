/*
 * An XML document type.
 * Localname: renderings
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingsDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.impl;
/**
 * A document containing one renderings(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803) element.
 *
 * This is a complex type.
 */
public class RenderingsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingsDocument
{
    private static final long serialVersionUID = 1L;
    
    public RenderingsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENDERINGS$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "renderings");
    
    
    /**
     * Gets the "renderings" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingsDocument.Renderings getRenderings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingsDocument.Renderings target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingsDocument.Renderings)get_store().find_element_user(RENDERINGS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "renderings" element
     */
    public void setRenderings(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingsDocument.Renderings renderings)
    {
        generatedSetterHelperImpl(renderings, RENDERINGS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "renderings" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingsDocument.Renderings addNewRenderings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingsDocument.Renderings target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingsDocument.Renderings)get_store().add_element_user(RENDERINGS$0);
            return target;
        }
    }
    /**
     * An XML renderings(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803).
     *
     * This is a complex type.
     */
    public static class RenderingsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.RenderingsDocument.Renderings
    {
        private static final long serialVersionUID = 1L;
        
        public RenderingsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RENDERING$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", "rendering");
        
        
        /**
         * Gets array of all "rendering" elements
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering[] getRenderingArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RENDERING$0, targetList);
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering[] result = new org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "rendering" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering getRenderingArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering)get_store().find_element_user(RENDERING$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "rendering" element
         */
        public int sizeOfRenderingArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RENDERING$0);
            }
        }
        
        /**
         * Sets array of all "rendering" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRenderingArray(org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering[] renderingArray)
        {
            check_orphaned();
            arraySetterHelper(renderingArray, RENDERING$0);
        }
        
        /**
         * Sets ith "rendering" element
         */
        public void setRenderingArray(int i, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering rendering)
        {
            generatedSetterHelperImpl(rendering, RENDERING$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "rendering" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering insertNewRendering(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering)get_store().insert_element_user(RENDERING$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "rendering" element
         */
        public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering addNewRendering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering target = null;
                target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRendering)get_store().add_element_user(RENDERING$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "rendering" element
         */
        public void removeRendering(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RENDERING$0, i);
            }
        }
    }
}
