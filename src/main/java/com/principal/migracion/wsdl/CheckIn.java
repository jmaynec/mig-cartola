//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.10.24 a las 10:06:09 AM CLST 
//


package com.principal.migracion.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="repositoryId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="objectId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="major" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="properties" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisPropertiesType" minOccurs="0"/&gt;
 *         &lt;element name="contentStream" type="{http://docs.oasis-open.org/ns/cmis/messaging/200908/}cmisContentStreamType" minOccurs="0"/&gt;
 *         &lt;element name="checkinComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policies" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addACEs" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisAccessControlListType" minOccurs="0"/&gt;
 *         &lt;element name="removeACEs" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisAccessControlListType" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://docs.oasis-open.org/ns/cmis/messaging/200908/}cmisExtensionType" minOccurs="0"/&gt;
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
    "repositoryId",
    "objectId",
    "major",
    "properties",
    "contentStream",
    "checkinComment",
    "policies",
    "addACEs",
    "removeACEs",
    "extension"
})
@XmlRootElement(name = "checkIn")
public class CheckIn {

    @XmlElement(required = true)
    protected String repositoryId;
    @XmlElement(required = true)
    protected String objectId;
    @XmlElementRef(name = "major", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> major;
    @XmlElementRef(name = "properties", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
    protected JAXBElement<CmisPropertiesType> properties;
    @XmlElementRef(name = "contentStream", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
    protected JAXBElement<CmisContentStreamType> contentStream;
    @XmlElementRef(name = "checkinComment", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> checkinComment;
    @XmlElement(nillable = true)
    protected List<String> policies;
    @XmlElementRef(name = "addACEs", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
    protected JAXBElement<CmisAccessControlListType> addACEs;
    @XmlElementRef(name = "removeACEs", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
    protected JAXBElement<CmisAccessControlListType> removeACEs;
    @XmlElementRef(name = "extension", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
    protected JAXBElement<CmisExtensionType> extension;

    /**
     * Obtiene el valor de la propiedad repositoryId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepositoryId() {
        return repositoryId;
    }

    /**
     * Define el valor de la propiedad repositoryId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepositoryId(String value) {
        this.repositoryId = value;
    }

    /**
     * Obtiene el valor de la propiedad objectId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Define el valor de la propiedad objectId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Obtiene el valor de la propiedad major.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMajor() {
        return major;
    }

    /**
     * Define el valor de la propiedad major.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMajor(JAXBElement<Boolean> value) {
        this.major = value;
    }

    /**
     * Obtiene el valor de la propiedad properties.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CmisPropertiesType }{@code >}
     *     
     */
    public JAXBElement<CmisPropertiesType> getProperties() {
        return properties;
    }

    /**
     * Define el valor de la propiedad properties.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CmisPropertiesType }{@code >}
     *     
     */
    public void setProperties(JAXBElement<CmisPropertiesType> value) {
        this.properties = value;
    }

    /**
     * Obtiene el valor de la propiedad contentStream.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CmisContentStreamType }{@code >}
     *     
     */
    public JAXBElement<CmisContentStreamType> getContentStream() {
        return contentStream;
    }

    /**
     * Define el valor de la propiedad contentStream.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CmisContentStreamType }{@code >}
     *     
     */
    public void setContentStream(JAXBElement<CmisContentStreamType> value) {
        this.contentStream = value;
    }

    /**
     * Obtiene el valor de la propiedad checkinComment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCheckinComment() {
        return checkinComment;
    }

    /**
     * Define el valor de la propiedad checkinComment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCheckinComment(JAXBElement<String> value) {
        this.checkinComment = value;
    }

    /**
     * Gets the value of the policies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPolicies() {
        if (policies == null) {
            policies = new ArrayList<String>();
        }
        return this.policies;
    }

    /**
     * Obtiene el valor de la propiedad addACEs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CmisAccessControlListType }{@code >}
     *     
     */
    public JAXBElement<CmisAccessControlListType> getAddACEs() {
        return addACEs;
    }

    /**
     * Define el valor de la propiedad addACEs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CmisAccessControlListType }{@code >}
     *     
     */
    public void setAddACEs(JAXBElement<CmisAccessControlListType> value) {
        this.addACEs = value;
    }

    /**
     * Obtiene el valor de la propiedad removeACEs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CmisAccessControlListType }{@code >}
     *     
     */
    public JAXBElement<CmisAccessControlListType> getRemoveACEs() {
        return removeACEs;
    }

    /**
     * Define el valor de la propiedad removeACEs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CmisAccessControlListType }{@code >}
     *     
     */
    public void setRemoveACEs(JAXBElement<CmisAccessControlListType> value) {
        this.removeACEs = value;
    }

    /**
     * Obtiene el valor de la propiedad extension.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CmisExtensionType }{@code >}
     *     
     */
    public JAXBElement<CmisExtensionType> getExtension() {
        return extension;
    }

    /**
     * Define el valor de la propiedad extension.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CmisExtensionType }{@code >}
     *     
     */
    public void setExtension(JAXBElement<CmisExtensionType> value) {
        this.extension = value;
    }

}
