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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cmisTypeDocumentDefinitionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cmisTypeDocumentDefinitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisTypeDefinitionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="versionable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="contentStreamAllowed" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumContentStreamAllowed"/&gt;
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
@XmlType(name = "cmisTypeDocumentDefinitionType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {
    "versionable",
    "contentStreamAllowed"
})
public class CmisTypeDocumentDefinitionType
    extends CmisTypeDefinitionType
{

    protected boolean versionable;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumContentStreamAllowed contentStreamAllowed;

    /**
     * Obtiene el valor de la propiedad versionable.
     * 
     */
    public boolean isVersionable() {
        return versionable;
    }

    /**
     * Define el valor de la propiedad versionable.
     * 
     */
    public void setVersionable(boolean value) {
        this.versionable = value;
    }

    /**
     * Obtiene el valor de la propiedad contentStreamAllowed.
     * 
     * @return
     *     possible object is
     *     {@link EnumContentStreamAllowed }
     *     
     */
    public EnumContentStreamAllowed getContentStreamAllowed() {
        return contentStreamAllowed;
    }

    /**
     * Define el valor de la propiedad contentStreamAllowed.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumContentStreamAllowed }
     *     
     */
    public void setContentStreamAllowed(EnumContentStreamAllowed value) {
        this.contentStreamAllowed = value;
    }

}
