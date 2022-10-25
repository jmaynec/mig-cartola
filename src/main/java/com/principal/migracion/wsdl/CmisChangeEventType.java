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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * <p>Clase Java para cmisChangeEventType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cmisChangeEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="changeType" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumTypeOfChanges"/&gt;
 *         &lt;element name="changeTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmisChangeEventType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {
    "changeType",
    "changeTime",
    "any"
})
public class CmisChangeEventType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumTypeOfChanges changeType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeTime;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Obtiene el valor de la propiedad changeType.
     * 
     * @return
     *     possible object is
     *     {@link EnumTypeOfChanges }
     *     
     */
    public EnumTypeOfChanges getChangeType() {
        return changeType;
    }

    /**
     * Define el valor de la propiedad changeType.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTypeOfChanges }
     *     
     */
    public void setChangeType(EnumTypeOfChanges value) {
        this.changeType = value;
    }

    /**
     * Obtiene el valor de la propiedad changeTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeTime() {
        return changeTime;
    }

    /**
     * Define el valor de la propiedad changeTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeTime(XMLGregorianCalendar value) {
        this.changeTime = value;
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

}
