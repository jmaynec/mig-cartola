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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cmisACLCapabilityType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cmisACLCapabilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="supportedPermissions" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumSupportedPermissions"/&gt;
 *         &lt;element name="propagation" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumACLPropagation"/&gt;
 *         &lt;element name="permissions" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisPermissionDefinition" maxOccurs="unbounded"/&gt;
 *         &lt;element name="mapping" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisPermissionMapping" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmisACLCapabilityType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {
    "supportedPermissions",
    "propagation",
    "permissions",
    "mapping"
})
public class CmisACLCapabilityType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumSupportedPermissions supportedPermissions;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumACLPropagation propagation;
    @XmlElement(required = true)
    protected List<CmisPermissionDefinition> permissions;
    protected List<CmisPermissionMapping> mapping;

    /**
     * Obtiene el valor de la propiedad supportedPermissions.
     * 
     * @return
     *     possible object is
     *     {@link EnumSupportedPermissions }
     *     
     */
    public EnumSupportedPermissions getSupportedPermissions() {
        return supportedPermissions;
    }

    /**
     * Define el valor de la propiedad supportedPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumSupportedPermissions }
     *     
     */
    public void setSupportedPermissions(EnumSupportedPermissions value) {
        this.supportedPermissions = value;
    }

    /**
     * Obtiene el valor de la propiedad propagation.
     * 
     * @return
     *     possible object is
     *     {@link EnumACLPropagation }
     *     
     */
    public EnumACLPropagation getPropagation() {
        return propagation;
    }

    /**
     * Define el valor de la propiedad propagation.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumACLPropagation }
     *     
     */
    public void setPropagation(EnumACLPropagation value) {
        this.propagation = value;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CmisPermissionDefinition }
     * 
     * 
     */
    public List<CmisPermissionDefinition> getPermissions() {
        if (permissions == null) {
            permissions = new ArrayList<CmisPermissionDefinition>();
        }
        return this.permissions;
    }

    /**
     * Gets the value of the mapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CmisPermissionMapping }
     * 
     * 
     */
    public List<CmisPermissionMapping> getMapping() {
        if (mapping == null) {
            mapping = new ArrayList<CmisPermissionMapping>();
        }
        return this.mapping;
    }

}
