//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.10.24 a las 10:06:09 AM CLST 
//


package com.principal.migracion.wsdl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cmisPropertyDecimalDefinitionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cmisPropertyDecimalDefinitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisPropertyDefinitionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defaultValue" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisPropertyDecimal" minOccurs="0"/&gt;
 *         &lt;element name="maxValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="minValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="precision" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumDecimalPrecision" minOccurs="0"/&gt;
 *         &lt;element name="choice" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisChoiceDecimal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmisPropertyDecimalDefinitionType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {
    "defaultValue",
    "maxValue",
    "minValue",
    "precision",
    "choice"
})
public class CmisPropertyDecimalDefinitionType
    extends CmisPropertyDefinitionType
{

    protected CmisPropertyDecimal defaultValue;
    protected BigDecimal maxValue;
    protected BigDecimal minValue;
    protected BigInteger precision;
    protected List<CmisChoiceDecimal> choice;

    /**
     * Obtiene el valor de la propiedad defaultValue.
     * 
     * @return
     *     possible object is
     *     {@link CmisPropertyDecimal }
     *     
     */
    public CmisPropertyDecimal getDefaultValue() {
        return defaultValue;
    }

    /**
     * Define el valor de la propiedad defaultValue.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisPropertyDecimal }
     *     
     */
    public void setDefaultValue(CmisPropertyDecimal value) {
        this.defaultValue = value;
    }

    /**
     * Obtiene el valor de la propiedad maxValue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxValue() {
        return maxValue;
    }

    /**
     * Define el valor de la propiedad maxValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxValue(BigDecimal value) {
        this.maxValue = value;
    }

    /**
     * Obtiene el valor de la propiedad minValue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinValue() {
        return minValue;
    }

    /**
     * Define el valor de la propiedad minValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinValue(BigDecimal value) {
        this.minValue = value;
    }

    /**
     * Obtiene el valor de la propiedad precision.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrecision() {
        return precision;
    }

    /**
     * Define el valor de la propiedad precision.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrecision(BigInteger value) {
        this.precision = value;
    }

    /**
     * Gets the value of the choice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the choice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CmisChoiceDecimal }
     * 
     * 
     */
    public List<CmisChoiceDecimal> getChoice() {
        if (choice == null) {
            choice = new ArrayList<CmisChoiceDecimal>();
        }
        return this.choice;
    }

}
