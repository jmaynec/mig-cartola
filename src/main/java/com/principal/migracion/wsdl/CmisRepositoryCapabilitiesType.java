//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.10.24 a las 10:06:09 AM CLST 
//


package com.principal.migracion.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Clase Java para cmisRepositoryCapabilitiesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cmisRepositoryCapabilitiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="capabilityACL" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumCapabilityACL"/&gt;
 *         &lt;element name="capabilityAllVersionsSearchable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="capabilityChanges" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumCapabilityChanges"/&gt;
 *         &lt;element name="capabilityContentStreamUpdatability" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumCapabilityContentStreamUpdates"/&gt;
 *         &lt;element name="capabilityGetDescendants" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="capabilityGetFolderTree" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="capabilityMultifiling" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="capabilityPWCSearchable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="capabilityPWCUpdatable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="capabilityQuery" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumCapabilityQuery"/&gt;
 *         &lt;element name="capabilityRenditions" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumCapabilityRendition"/&gt;
 *         &lt;element name="capabilityUnfiling" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="capabilityVersionSpecificFiling" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="capabilityJoin" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumCapabilityJoin"/&gt;
 *         &lt;any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisUndefinedAttribute"/&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmisRepositoryCapabilitiesType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {
    "capabilityACL",
    "capabilityAllVersionsSearchable",
    "capabilityChanges",
    "capabilityContentStreamUpdatability",
    "capabilityGetDescendants",
    "capabilityGetFolderTree",
    "capabilityMultifiling",
    "capabilityPWCSearchable",
    "capabilityPWCUpdatable",
    "capabilityQuery",
    "capabilityRenditions",
    "capabilityUnfiling",
    "capabilityVersionSpecificFiling",
    "capabilityJoin",
    "any"
})
public class CmisRepositoryCapabilitiesType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumCapabilityACL capabilityACL;
    protected boolean capabilityAllVersionsSearchable;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumCapabilityChanges capabilityChanges;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumCapabilityContentStreamUpdates capabilityContentStreamUpdatability;
    protected boolean capabilityGetDescendants;
    protected boolean capabilityGetFolderTree;
    protected boolean capabilityMultifiling;
    protected boolean capabilityPWCSearchable;
    protected boolean capabilityPWCUpdatable;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumCapabilityQuery capabilityQuery;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumCapabilityRendition capabilityRenditions;
    protected boolean capabilityUnfiling;
    protected boolean capabilityVersionSpecificFiling;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumCapabilityJoin capabilityJoin;
    @XmlAnyElement
    protected List<Element> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtiene el valor de la propiedad capabilityACL.
     * 
     * @return
     *     possible object is
     *     {@link EnumCapabilityACL }
     *     
     */
    public EnumCapabilityACL getCapabilityACL() {
        return capabilityACL;
    }

    /**
     * Define el valor de la propiedad capabilityACL.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCapabilityACL }
     *     
     */
    public void setCapabilityACL(EnumCapabilityACL value) {
        this.capabilityACL = value;
    }

    /**
     * Obtiene el valor de la propiedad capabilityAllVersionsSearchable.
     * 
     */
    public boolean isCapabilityAllVersionsSearchable() {
        return capabilityAllVersionsSearchable;
    }

    /**
     * Define el valor de la propiedad capabilityAllVersionsSearchable.
     * 
     */
    public void setCapabilityAllVersionsSearchable(boolean value) {
        this.capabilityAllVersionsSearchable = value;
    }

    /**
     * Obtiene el valor de la propiedad capabilityChanges.
     * 
     * @return
     *     possible object is
     *     {@link EnumCapabilityChanges }
     *     
     */
    public EnumCapabilityChanges getCapabilityChanges() {
        return capabilityChanges;
    }

    /**
     * Define el valor de la propiedad capabilityChanges.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCapabilityChanges }
     *     
     */
    public void setCapabilityChanges(EnumCapabilityChanges value) {
        this.capabilityChanges = value;
    }

    /**
     * Obtiene el valor de la propiedad capabilityContentStreamUpdatability.
     * 
     * @return
     *     possible object is
     *     {@link EnumCapabilityContentStreamUpdates }
     *     
     */
    public EnumCapabilityContentStreamUpdates getCapabilityContentStreamUpdatability() {
        return capabilityContentStreamUpdatability;
    }

    /**
     * Define el valor de la propiedad capabilityContentStreamUpdatability.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCapabilityContentStreamUpdates }
     *     
     */
    public void setCapabilityContentStreamUpdatability(EnumCapabilityContentStreamUpdates value) {
        this.capabilityContentStreamUpdatability = value;
    }

    /**
     * Obtiene el valor de la propiedad capabilityGetDescendants.
     * 
     */
    public boolean isCapabilityGetDescendants() {
        return capabilityGetDescendants;
    }

    /**
     * Define el valor de la propiedad capabilityGetDescendants.
     * 
     */
    public void setCapabilityGetDescendants(boolean value) {
        this.capabilityGetDescendants = value;
    }

    /**
     * Obtiene el valor de la propiedad capabilityGetFolderTree.
     * 
     */
    public boolean isCapabilityGetFolderTree() {
        return capabilityGetFolderTree;
    }

    /**
     * Define el valor de la propiedad capabilityGetFolderTree.
     * 
     */
    public void setCapabilityGetFolderTree(boolean value) {
        this.capabilityGetFolderTree = value;
    }

    /**
     * Obtiene el valor de la propiedad capabilityMultifiling.
     * 
     */
    public boolean isCapabilityMultifiling() {
        return capabilityMultifiling;
    }

    /**
     * Define el valor de la propiedad capabilityMultifiling.
     * 
     */
    public void setCapabilityMultifiling(boolean value) {
        this.capabilityMultifiling = value;
    }

    /**
     * Obtiene el valor de la propiedad capabilityPWCSearchable.
     * 
     */
    public boolean isCapabilityPWCSearchable() {
        return capabilityPWCSearchable;
    }

    /**
     * Define el valor de la propiedad capabilityPWCSearchable.
     * 
     */
    public void setCapabilityPWCSearchable(boolean value) {
        this.capabilityPWCSearchable = value;
    }

    /**
     * Obtiene el valor de la propiedad capabilityPWCUpdatable.
     * 
     */
    public boolean isCapabilityPWCUpdatable() {
        return capabilityPWCUpdatable;
    }

    /**
     * Define el valor de la propiedad capabilityPWCUpdatable.
     * 
     */
    public void setCapabilityPWCUpdatable(boolean value) {
        this.capabilityPWCUpdatable = value;
    }

    /**
     * Obtiene el valor de la propiedad capabilityQuery.
     * 
     * @return
     *     possible object is
     *     {@link EnumCapabilityQuery }
     *     
     */
    public EnumCapabilityQuery getCapabilityQuery() {
        return capabilityQuery;
    }

    /**
     * Define el valor de la propiedad capabilityQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCapabilityQuery }
     *     
     */
    public void setCapabilityQuery(EnumCapabilityQuery value) {
        this.capabilityQuery = value;
    }

    /**
     * Obtiene el valor de la propiedad capabilityRenditions.
     * 
     * @return
     *     possible object is
     *     {@link EnumCapabilityRendition }
     *     
     */
    public EnumCapabilityRendition getCapabilityRenditions() {
        return capabilityRenditions;
    }

    /**
     * Define el valor de la propiedad capabilityRenditions.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCapabilityRendition }
     *     
     */
    public void setCapabilityRenditions(EnumCapabilityRendition value) {
        this.capabilityRenditions = value;
    }

    /**
     * Obtiene el valor de la propiedad capabilityUnfiling.
     * 
     */
    public boolean isCapabilityUnfiling() {
        return capabilityUnfiling;
    }

    /**
     * Define el valor de la propiedad capabilityUnfiling.
     * 
     */
    public void setCapabilityUnfiling(boolean value) {
        this.capabilityUnfiling = value;
    }

    /**
     * Obtiene el valor de la propiedad capabilityVersionSpecificFiling.
     * 
     */
    public boolean isCapabilityVersionSpecificFiling() {
        return capabilityVersionSpecificFiling;
    }

    /**
     * Define el valor de la propiedad capabilityVersionSpecificFiling.
     * 
     */
    public void setCapabilityVersionSpecificFiling(boolean value) {
        this.capabilityVersionSpecificFiling = value;
    }

    /**
     * Obtiene el valor de la propiedad capabilityJoin.
     * 
     * @return
     *     possible object is
     *     {@link EnumCapabilityJoin }
     *     
     */
    public EnumCapabilityJoin getCapabilityJoin() {
        return capabilityJoin;
    }

    /**
     * Define el valor de la propiedad capabilityJoin.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCapabilityJoin }
     *     
     */
    public void setCapabilityJoin(EnumCapabilityJoin value) {
        this.capabilityJoin = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
