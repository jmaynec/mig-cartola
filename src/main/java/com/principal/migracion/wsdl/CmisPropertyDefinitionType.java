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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Clase Java para cmisPropertyDefinitionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cmisPropertyDefinitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="localName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="localNamespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="queryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="propertyType" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumPropertyType"/&gt;
 *         &lt;element name="cardinality" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumCardinality"/&gt;
 *         &lt;element name="updatability" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumUpdatability"/&gt;
 *         &lt;element name="inherited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="queryable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="orderable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="openChoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "cmisPropertyDefinitionType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {
    "id",
    "localName",
    "localNamespace",
    "displayName",
    "queryName",
    "description",
    "propertyType",
    "cardinality",
    "updatability",
    "inherited",
    "required",
    "queryable",
    "orderable",
    "openChoice",
    "any"
})
@XmlSeeAlso({
    CmisPropertyBooleanDefinitionType.class,
    CmisPropertyIdDefinitionType.class,
    CmisPropertyIntegerDefinitionType.class,
    CmisPropertyDateTimeDefinitionType.class,
    CmisPropertyDecimalDefinitionType.class,
    CmisPropertyHtmlDefinitionType.class,
    CmisPropertyStringDefinitionType.class,
    CmisPropertyUriDefinitionType.class
})
public class CmisPropertyDefinitionType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String localName;
    @XmlSchemaType(name = "anyURI")
    protected String localNamespace;
    protected String displayName;
    protected String queryName;
    protected String description;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumPropertyType propertyType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumCardinality cardinality;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumUpdatability updatability;
    protected Boolean inherited;
    protected boolean required;
    protected boolean queryable;
    protected boolean orderable;
    protected Boolean openChoice;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad localName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalName() {
        return localName;
    }

    /**
     * Define el valor de la propiedad localName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalName(String value) {
        this.localName = value;
    }

    /**
     * Obtiene el valor de la propiedad localNamespace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalNamespace() {
        return localNamespace;
    }

    /**
     * Define el valor de la propiedad localNamespace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalNamespace(String value) {
        this.localNamespace = value;
    }

    /**
     * Obtiene el valor de la propiedad displayName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Define el valor de la propiedad displayName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Obtiene el valor de la propiedad queryName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryName() {
        return queryName;
    }

    /**
     * Define el valor de la propiedad queryName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryName(String value) {
        this.queryName = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad propertyType.
     * 
     * @return
     *     possible object is
     *     {@link EnumPropertyType }
     *     
     */
    public EnumPropertyType getPropertyType() {
        return propertyType;
    }

    /**
     * Define el valor de la propiedad propertyType.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPropertyType }
     *     
     */
    public void setPropertyType(EnumPropertyType value) {
        this.propertyType = value;
    }

    /**
     * Obtiene el valor de la propiedad cardinality.
     * 
     * @return
     *     possible object is
     *     {@link EnumCardinality }
     *     
     */
    public EnumCardinality getCardinality() {
        return cardinality;
    }

    /**
     * Define el valor de la propiedad cardinality.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCardinality }
     *     
     */
    public void setCardinality(EnumCardinality value) {
        this.cardinality = value;
    }

    /**
     * Obtiene el valor de la propiedad updatability.
     * 
     * @return
     *     possible object is
     *     {@link EnumUpdatability }
     *     
     */
    public EnumUpdatability getUpdatability() {
        return updatability;
    }

    /**
     * Define el valor de la propiedad updatability.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumUpdatability }
     *     
     */
    public void setUpdatability(EnumUpdatability value) {
        this.updatability = value;
    }

    /**
     * Obtiene el valor de la propiedad inherited.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInherited() {
        return inherited;
    }

    /**
     * Define el valor de la propiedad inherited.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInherited(Boolean value) {
        this.inherited = value;
    }

    /**
     * Obtiene el valor de la propiedad required.
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Define el valor de la propiedad required.
     * 
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

    /**
     * Obtiene el valor de la propiedad queryable.
     * 
     */
    public boolean isQueryable() {
        return queryable;
    }

    /**
     * Define el valor de la propiedad queryable.
     * 
     */
    public void setQueryable(boolean value) {
        this.queryable = value;
    }

    /**
     * Obtiene el valor de la propiedad orderable.
     * 
     */
    public boolean isOrderable() {
        return orderable;
    }

    /**
     * Define el valor de la propiedad orderable.
     * 
     */
    public void setOrderable(boolean value) {
        this.orderable = value;
    }

    /**
     * Obtiene el valor de la propiedad openChoice.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenChoice() {
        return openChoice;
    }

    /**
     * Define el valor de la propiedad openChoice.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenChoice(Boolean value) {
        this.openChoice = value;
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
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
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
