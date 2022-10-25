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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cmisPropertyHtmlDefinitionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cmisPropertyHtmlDefinitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisPropertyDefinitionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defaultValue" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisPropertyHtml" minOccurs="0"/&gt;
 *         &lt;element name="choice" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisChoiceHtml" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "cmisPropertyHtmlDefinitionType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {
    "defaultValue",
    "choice"
})
public class CmisPropertyHtmlDefinitionType
    extends CmisPropertyDefinitionType
{

    protected CmisPropertyHtml defaultValue;
    protected List<CmisChoiceHtml> choice;

    /**
     * Obtiene el valor de la propiedad defaultValue.
     * 
     * @return
     *     possible object is
     *     {@link CmisPropertyHtml }
     *     
     */
    public CmisPropertyHtml getDefaultValue() {
        return defaultValue;
    }

    /**
     * Define el valor de la propiedad defaultValue.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisPropertyHtml }
     *     
     */
    public void setDefaultValue(CmisPropertyHtml value) {
        this.defaultValue = value;
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
     * {@link CmisChoiceHtml }
     * 
     * 
     */
    public List<CmisChoiceHtml> getChoice() {
        if (choice == null) {
            choice = new ArrayList<CmisChoiceHtml>();
        }
        return this.choice;
    }

}
