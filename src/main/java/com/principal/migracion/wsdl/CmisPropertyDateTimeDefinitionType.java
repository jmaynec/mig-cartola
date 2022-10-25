//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.10.24 a las 10:06:09 AM CLST 
//


package com.principal.migracion.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cmisPropertyDateTimeDefinitionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cmisPropertyDateTimeDefinitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisPropertyDefinitionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defaultValue" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisPropertyDateTime" minOccurs="0"/&gt;
 *         &lt;element name="resolution" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumDateTimeResolution" minOccurs="0"/&gt;
 *         &lt;element name="choice" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisChoiceDateTime" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "cmisPropertyDateTimeDefinitionType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {
    "defaultValue",
    "resolution",
    "choice"
})
public class CmisPropertyDateTimeDefinitionType
    extends CmisPropertyDefinitionType
{

    protected CmisPropertyDateTime defaultValue;
    @XmlSchemaType(name = "string")
    protected EnumDateTimeResolution resolution;
    protected List<CmisChoiceDateTime> choice;

    /**
     * Obtiene el valor de la propiedad defaultValue.
     * 
     * @return
     *     possible object is
     *     {@link CmisPropertyDateTime }
     *     
     */
    public CmisPropertyDateTime getDefaultValue() {
        return defaultValue;
    }

    /**
     * Define el valor de la propiedad defaultValue.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisPropertyDateTime }
     *     
     */
    public void setDefaultValue(CmisPropertyDateTime value) {
        this.defaultValue = value;
    }

    /**
     * Obtiene el valor de la propiedad resolution.
     * 
     * @return
     *     possible object is
     *     {@link EnumDateTimeResolution }
     *     
     */
    public EnumDateTimeResolution getResolution() {
        return resolution;
    }

    /**
     * Define el valor de la propiedad resolution.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumDateTimeResolution }
     *     
     */
    public void setResolution(EnumDateTimeResolution value) {
        this.resolution = value;
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
     * {@link CmisChoiceDateTime }
     * 
     * 
     */
    public List<CmisChoiceDateTime> getChoice() {
        if (choice == null) {
            choice = new ArrayList<CmisChoiceDateTime>();
        }
        return this.choice;
    }

}
