//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.10.24 a las 10:06:09 AM CLST 
//


package com.principal.migracion.wsdl;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Clase Java para cmisProperty complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cmisProperty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisUndefinedAttribute"/&gt;
 *       &lt;attribute name="propertyDefinitionId" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="localName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="queryName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmisProperty", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
@XmlSeeAlso({
    CmisPropertyBoolean.class,
    CmisPropertyId.class,
    CmisPropertyInteger.class,
    CmisPropertyDateTime.class,
    CmisPropertyDecimal.class,
    CmisPropertyHtml.class,
    CmisPropertyString.class,
    CmisPropertyUri.class
})
public class CmisProperty {

    @XmlAttribute(name = "propertyDefinitionId")
    @XmlSchemaType(name = "anySimpleType")
    protected String propertyDefinitionId;
    @XmlAttribute(name = "localName")
    @XmlSchemaType(name = "anySimpleType")
    protected String localName;
    @XmlAttribute(name = "displayName")
    @XmlSchemaType(name = "anySimpleType")
    protected String displayName;
    @XmlAttribute(name = "queryName")
    @XmlSchemaType(name = "anySimpleType")
    protected String queryName;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtiene el valor de la propiedad propertyDefinitionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyDefinitionId() {
        return propertyDefinitionId;
    }

    /**
     * Define el valor de la propiedad propertyDefinitionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyDefinitionId(String value) {
        this.propertyDefinitionId = value;
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
