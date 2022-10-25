//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.10.24 a las 10:06:09 AM CLST 
//


package com.principal.migracion.wsdl;

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
 * <p>Clase Java para cmisRepositoryInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cmisRepositoryInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="repositoryId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="repositoryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="repositoryDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rootFolderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="latestChangeLogToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="capabilities" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisRepositoryCapabilitiesType"/&gt;
 *         &lt;element name="aclCapability" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisACLCapabilityType" minOccurs="0"/&gt;
 *         &lt;element name="cmisVersionSupported" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="thinClientURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="changesIncomplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="changesOnType" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumBaseObjectTypeIds" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="principalAnonymous" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="principalAnyone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "cmisRepositoryInfoType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {
    "repositoryId",
    "repositoryName",
    "repositoryDescription",
    "vendorName",
    "productName",
    "productVersion",
    "rootFolderId",
    "latestChangeLogToken",
    "capabilities",
    "aclCapability",
    "cmisVersionSupported",
    "thinClientURI",
    "changesIncomplete",
    "changesOnType",
    "principalAnonymous",
    "principalAnyone",
    "any"
})
public class CmisRepositoryInfoType {

    @XmlElement(required = true)
    protected String repositoryId;
    @XmlElement(required = true)
    protected String repositoryName;
    @XmlElement(required = true)
    protected String repositoryDescription;
    @XmlElement(required = true)
    protected String vendorName;
    @XmlElement(required = true)
    protected String productName;
    @XmlElement(required = true)
    protected String productVersion;
    @XmlElement(required = true)
    protected String rootFolderId;
    protected String latestChangeLogToken;
    @XmlElement(required = true)
    protected CmisRepositoryCapabilitiesType capabilities;
    protected CmisACLCapabilityType aclCapability;
    @XmlElement(required = true)
    protected String cmisVersionSupported;
    @XmlSchemaType(name = "anyURI")
    protected String thinClientURI;
    protected Boolean changesIncomplete;
    @XmlSchemaType(name = "string")
    protected List<EnumBaseObjectTypeIds> changesOnType;
    protected String principalAnonymous;
    protected String principalAnyone;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Obtiene el valor de la propiedad repositoryName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * Define el valor de la propiedad repositoryName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepositoryName(String value) {
        this.repositoryName = value;
    }

    /**
     * Obtiene el valor de la propiedad repositoryDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepositoryDescription() {
        return repositoryDescription;
    }

    /**
     * Define el valor de la propiedad repositoryDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepositoryDescription(String value) {
        this.repositoryDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad vendorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Define el valor de la propiedad vendorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Obtiene el valor de la propiedad productName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Define el valor de la propiedad productName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Obtiene el valor de la propiedad productVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductVersion() {
        return productVersion;
    }

    /**
     * Define el valor de la propiedad productVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductVersion(String value) {
        this.productVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad rootFolderId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootFolderId() {
        return rootFolderId;
    }

    /**
     * Define el valor de la propiedad rootFolderId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootFolderId(String value) {
        this.rootFolderId = value;
    }

    /**
     * Obtiene el valor de la propiedad latestChangeLogToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestChangeLogToken() {
        return latestChangeLogToken;
    }

    /**
     * Define el valor de la propiedad latestChangeLogToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestChangeLogToken(String value) {
        this.latestChangeLogToken = value;
    }

    /**
     * Obtiene el valor de la propiedad capabilities.
     * 
     * @return
     *     possible object is
     *     {@link CmisRepositoryCapabilitiesType }
     *     
     */
    public CmisRepositoryCapabilitiesType getCapabilities() {
        return capabilities;
    }

    /**
     * Define el valor de la propiedad capabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisRepositoryCapabilitiesType }
     *     
     */
    public void setCapabilities(CmisRepositoryCapabilitiesType value) {
        this.capabilities = value;
    }

    /**
     * Obtiene el valor de la propiedad aclCapability.
     * 
     * @return
     *     possible object is
     *     {@link CmisACLCapabilityType }
     *     
     */
    public CmisACLCapabilityType getAclCapability() {
        return aclCapability;
    }

    /**
     * Define el valor de la propiedad aclCapability.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisACLCapabilityType }
     *     
     */
    public void setAclCapability(CmisACLCapabilityType value) {
        this.aclCapability = value;
    }

    /**
     * Obtiene el valor de la propiedad cmisVersionSupported.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmisVersionSupported() {
        return cmisVersionSupported;
    }

    /**
     * Define el valor de la propiedad cmisVersionSupported.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmisVersionSupported(String value) {
        this.cmisVersionSupported = value;
    }

    /**
     * Obtiene el valor de la propiedad thinClientURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThinClientURI() {
        return thinClientURI;
    }

    /**
     * Define el valor de la propiedad thinClientURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThinClientURI(String value) {
        this.thinClientURI = value;
    }

    /**
     * Obtiene el valor de la propiedad changesIncomplete.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangesIncomplete() {
        return changesIncomplete;
    }

    /**
     * Define el valor de la propiedad changesIncomplete.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangesIncomplete(Boolean value) {
        this.changesIncomplete = value;
    }

    /**
     * Gets the value of the changesOnType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changesOnType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangesOnType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumBaseObjectTypeIds }
     * 
     * 
     */
    public List<EnumBaseObjectTypeIds> getChangesOnType() {
        if (changesOnType == null) {
            changesOnType = new ArrayList<EnumBaseObjectTypeIds>();
        }
        return this.changesOnType;
    }

    /**
     * Obtiene el valor de la propiedad principalAnonymous.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalAnonymous() {
        return principalAnonymous;
    }

    /**
     * Define el valor de la propiedad principalAnonymous.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalAnonymous(String value) {
        this.principalAnonymous = value;
    }

    /**
     * Obtiene el valor de la propiedad principalAnyone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalAnyone() {
        return principalAnyone;
    }

    /**
     * Define el valor de la propiedad principalAnyone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalAnyone(String value) {
        this.principalAnyone = value;
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
