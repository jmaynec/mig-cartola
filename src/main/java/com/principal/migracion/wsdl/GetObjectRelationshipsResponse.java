//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.10.24 a las 10:06:09 AM CLST 
//


package com.principal.migracion.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="objects" type="{http://docs.oasis-open.org/ns/cmis/messaging/200908/}cmisObjectListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "objects"
})
@XmlRootElement(name = "getObjectRelationshipsResponse")
public class GetObjectRelationshipsResponse {

    @XmlElement(required = true)
    protected CmisObjectListType objects;

    /**
     * Obtiene el valor de la propiedad objects.
     * 
     * @return
     *     possible object is
     *     {@link CmisObjectListType }
     *     
     */
    public CmisObjectListType getObjects() {
        return objects;
    }

    /**
     * Define el valor de la propiedad objects.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisObjectListType }
     *     
     */
    public void setObjects(CmisObjectListType value) {
        this.objects = value;
    }

}
