//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.10.24 a las 10:06:09 AM CLST 
//


package com.principal.migracion.wsdl;

import java.math.BigInteger;
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
 * <p>Clase Java para cmisQueryType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cmisQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="statement" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="searchAllVersions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="includeAllowableActions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="includeRelationships" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumIncludeRelationships" minOccurs="0"/&gt;
 *         &lt;element name="renditionFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxItems" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="skipCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "cmisQueryType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {
    "statement",
    "searchAllVersions",
    "includeAllowableActions",
    "includeRelationships",
    "renditionFilter",
    "maxItems",
    "skipCount",
    "any"
})
public class CmisQueryType {

    @XmlElement(required = true)
    protected String statement;
    protected Boolean searchAllVersions;
    protected Boolean includeAllowableActions;
    @XmlSchemaType(name = "string")
    protected EnumIncludeRelationships includeRelationships;
    protected String renditionFilter;
    protected BigInteger maxItems;
    protected BigInteger skipCount;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtiene el valor de la propiedad statement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatement() {
        return statement;
    }

    /**
     * Define el valor de la propiedad statement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatement(String value) {
        this.statement = value;
    }

    /**
     * Obtiene el valor de la propiedad searchAllVersions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchAllVersions() {
        return searchAllVersions;
    }

    /**
     * Define el valor de la propiedad searchAllVersions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchAllVersions(Boolean value) {
        this.searchAllVersions = value;
    }

    /**
     * Obtiene el valor de la propiedad includeAllowableActions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAllowableActions() {
        return includeAllowableActions;
    }

    /**
     * Define el valor de la propiedad includeAllowableActions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAllowableActions(Boolean value) {
        this.includeAllowableActions = value;
    }

    /**
     * Obtiene el valor de la propiedad includeRelationships.
     * 
     * @return
     *     possible object is
     *     {@link EnumIncludeRelationships }
     *     
     */
    public EnumIncludeRelationships getIncludeRelationships() {
        return includeRelationships;
    }

    /**
     * Define el valor de la propiedad includeRelationships.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumIncludeRelationships }
     *     
     */
    public void setIncludeRelationships(EnumIncludeRelationships value) {
        this.includeRelationships = value;
    }

    /**
     * Obtiene el valor de la propiedad renditionFilter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenditionFilter() {
        return renditionFilter;
    }

    /**
     * Define el valor de la propiedad renditionFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenditionFilter(String value) {
        this.renditionFilter = value;
    }

    /**
     * Obtiene el valor de la propiedad maxItems.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxItems() {
        return maxItems;
    }

    /**
     * Define el valor de la propiedad maxItems.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxItems(BigInteger value) {
        this.maxItems = value;
    }

    /**
     * Obtiene el valor de la propiedad skipCount.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSkipCount() {
        return skipCount;
    }

    /**
     * Define el valor de la propiedad skipCount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSkipCount(BigInteger value) {
        this.skipCount = value;
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
