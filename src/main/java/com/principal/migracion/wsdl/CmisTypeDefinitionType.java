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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Clase Java para cmisTypeDefinitionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cmisTypeDefinitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="localName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="localNamespace" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="queryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="baseId" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumBaseObjectTypeIds"/&gt;
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creatable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="fileable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="queryable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="fulltextIndexed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="includedInSupertypeQuery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="controllablePolicy" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="controllableACL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="propertyBooleanDefinition" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisPropertyBooleanDefinitionType"/&gt;
 *           &lt;element name="propertyDateTimeDefinition" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisPropertyDateTimeDefinitionType"/&gt;
 *           &lt;element name="propertyDecimalDefinition" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisPropertyDecimalDefinitionType"/&gt;
 *           &lt;element name="propertyIdDefinition" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisPropertyIdDefinitionType"/&gt;
 *           &lt;element name="propertyIntegerDefinition" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisPropertyIntegerDefinitionType"/&gt;
 *           &lt;element name="propertyHtmlDefinition" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisPropertyHtmlDefinitionType"/&gt;
 *           &lt;element name="propertyStringDefinition" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisPropertyStringDefinitionType"/&gt;
 *           &lt;element name="propertyUriDefinition" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisPropertyUriDefinitionType"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "cmisTypeDefinitionType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {
    "id",
    "localName",
    "localNamespace",
    "displayName",
    "queryName",
    "description",
    "baseId",
    "parentId",
    "creatable",
    "fileable",
    "queryable",
    "fulltextIndexed",
    "includedInSupertypeQuery",
    "controllablePolicy",
    "controllableACL",
    "propertyDefinition",
    "any"
})
@XmlSeeAlso({
    CmisTypeDocumentDefinitionType.class,
    CmisTypeFolderDefinitionType.class,
    CmisTypeRelationshipDefinitionType.class,
    CmisTypePolicyDefinitionType.class
})
public class CmisTypeDefinitionType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String localName;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "anyURI")
    protected String localNamespace;
    protected String displayName;
    protected String queryName;
    protected String description;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumBaseObjectTypeIds baseId;
    protected String parentId;
    protected boolean creatable;
    protected boolean fileable;
    protected boolean queryable;
    protected boolean fulltextIndexed;
    @XmlElement(defaultValue = "true")
    protected boolean includedInSupertypeQuery;
    protected boolean controllablePolicy;
    protected boolean controllableACL;
    @XmlElements({
        @XmlElement(name = "propertyBooleanDefinition", type = CmisPropertyBooleanDefinitionType.class),
        @XmlElement(name = "propertyDateTimeDefinition", type = CmisPropertyDateTimeDefinitionType.class),
        @XmlElement(name = "propertyDecimalDefinition", type = CmisPropertyDecimalDefinitionType.class),
        @XmlElement(name = "propertyIdDefinition", type = CmisPropertyIdDefinitionType.class),
        @XmlElement(name = "propertyIntegerDefinition", type = CmisPropertyIntegerDefinitionType.class),
        @XmlElement(name = "propertyHtmlDefinition", type = CmisPropertyHtmlDefinitionType.class),
        @XmlElement(name = "propertyStringDefinition", type = CmisPropertyStringDefinitionType.class),
        @XmlElement(name = "propertyUriDefinition", type = CmisPropertyUriDefinitionType.class)
    })
    protected List<CmisPropertyDefinitionType> propertyDefinition;
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
     * Obtiene el valor de la propiedad baseId.
     * 
     * @return
     *     possible object is
     *     {@link EnumBaseObjectTypeIds }
     *     
     */
    public EnumBaseObjectTypeIds getBaseId() {
        return baseId;
    }

    /**
     * Define el valor de la propiedad baseId.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumBaseObjectTypeIds }
     *     
     */
    public void setBaseId(EnumBaseObjectTypeIds value) {
        this.baseId = value;
    }

    /**
     * Obtiene el valor de la propiedad parentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Define el valor de la propiedad parentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentId(String value) {
        this.parentId = value;
    }

    /**
     * Obtiene el valor de la propiedad creatable.
     * 
     */
    public boolean isCreatable() {
        return creatable;
    }

    /**
     * Define el valor de la propiedad creatable.
     * 
     */
    public void setCreatable(boolean value) {
        this.creatable = value;
    }

    /**
     * Obtiene el valor de la propiedad fileable.
     * 
     */
    public boolean isFileable() {
        return fileable;
    }

    /**
     * Define el valor de la propiedad fileable.
     * 
     */
    public void setFileable(boolean value) {
        this.fileable = value;
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
     * Obtiene el valor de la propiedad fulltextIndexed.
     * 
     */
    public boolean isFulltextIndexed() {
        return fulltextIndexed;
    }

    /**
     * Define el valor de la propiedad fulltextIndexed.
     * 
     */
    public void setFulltextIndexed(boolean value) {
        this.fulltextIndexed = value;
    }

    /**
     * Obtiene el valor de la propiedad includedInSupertypeQuery.
     * 
     */
    public boolean isIncludedInSupertypeQuery() {
        return includedInSupertypeQuery;
    }

    /**
     * Define el valor de la propiedad includedInSupertypeQuery.
     * 
     */
    public void setIncludedInSupertypeQuery(boolean value) {
        this.includedInSupertypeQuery = value;
    }

    /**
     * Obtiene el valor de la propiedad controllablePolicy.
     * 
     */
    public boolean isControllablePolicy() {
        return controllablePolicy;
    }

    /**
     * Define el valor de la propiedad controllablePolicy.
     * 
     */
    public void setControllablePolicy(boolean value) {
        this.controllablePolicy = value;
    }

    /**
     * Obtiene el valor de la propiedad controllableACL.
     * 
     */
    public boolean isControllableACL() {
        return controllableACL;
    }

    /**
     * Define el valor de la propiedad controllableACL.
     * 
     */
    public void setControllableACL(boolean value) {
        this.controllableACL = value;
    }

    /**
     * Gets the value of the propertyDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CmisPropertyBooleanDefinitionType }
     * {@link CmisPropertyDateTimeDefinitionType }
     * {@link CmisPropertyDecimalDefinitionType }
     * {@link CmisPropertyIdDefinitionType }
     * {@link CmisPropertyIntegerDefinitionType }
     * {@link CmisPropertyHtmlDefinitionType }
     * {@link CmisPropertyStringDefinitionType }
     * {@link CmisPropertyUriDefinitionType }
     * 
     * 
     */
    public List<CmisPropertyDefinitionType> getPropertyDefinition() {
        if (propertyDefinition == null) {
            propertyDefinition = new ArrayList<CmisPropertyDefinitionType>();
        }
        return this.propertyDefinition;
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
