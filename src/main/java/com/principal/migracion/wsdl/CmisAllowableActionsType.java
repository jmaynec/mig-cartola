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
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Clase Java para cmisAllowableActionsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cmisAllowableActionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="canDeleteObject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canUpdateProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canGetFolderTree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canGetProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canGetObjectRelationships" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canGetObjectParents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canGetFolderParent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canGetDescendants" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canMoveObject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canDeleteContentStream" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canCheckOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canCancelCheckOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canCheckIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canSetContentStream" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canGetAllVersions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canAddObjectToFolder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canRemoveObjectFromFolder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canGetContentStream" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canApplyPolicy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canGetAppliedPolicies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canRemovePolicy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canGetChildren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canCreateDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canCreateFolder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canCreateRelationship" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canDeleteTree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canGetRenditions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canGetACL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canApplyACL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "cmisAllowableActionsType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {
    "canDeleteObject",
    "canUpdateProperties",
    "canGetFolderTree",
    "canGetProperties",
    "canGetObjectRelationships",
    "canGetObjectParents",
    "canGetFolderParent",
    "canGetDescendants",
    "canMoveObject",
    "canDeleteContentStream",
    "canCheckOut",
    "canCancelCheckOut",
    "canCheckIn",
    "canSetContentStream",
    "canGetAllVersions",
    "canAddObjectToFolder",
    "canRemoveObjectFromFolder",
    "canGetContentStream",
    "canApplyPolicy",
    "canGetAppliedPolicies",
    "canRemovePolicy",
    "canGetChildren",
    "canCreateDocument",
    "canCreateFolder",
    "canCreateRelationship",
    "canDeleteTree",
    "canGetRenditions",
    "canGetACL",
    "canApplyACL",
    "any"
})
public class CmisAllowableActionsType {

    protected Boolean canDeleteObject;
    protected Boolean canUpdateProperties;
    protected Boolean canGetFolderTree;
    protected Boolean canGetProperties;
    protected Boolean canGetObjectRelationships;
    protected Boolean canGetObjectParents;
    protected Boolean canGetFolderParent;
    protected Boolean canGetDescendants;
    protected Boolean canMoveObject;
    protected Boolean canDeleteContentStream;
    protected Boolean canCheckOut;
    protected Boolean canCancelCheckOut;
    protected Boolean canCheckIn;
    protected Boolean canSetContentStream;
    protected Boolean canGetAllVersions;
    protected Boolean canAddObjectToFolder;
    protected Boolean canRemoveObjectFromFolder;
    protected Boolean canGetContentStream;
    protected Boolean canApplyPolicy;
    protected Boolean canGetAppliedPolicies;
    protected Boolean canRemovePolicy;
    protected Boolean canGetChildren;
    protected Boolean canCreateDocument;
    protected Boolean canCreateFolder;
    protected Boolean canCreateRelationship;
    protected Boolean canDeleteTree;
    protected Boolean canGetRenditions;
    protected Boolean canGetACL;
    protected Boolean canApplyACL;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtiene el valor de la propiedad canDeleteObject.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanDeleteObject() {
        return canDeleteObject;
    }

    /**
     * Define el valor de la propiedad canDeleteObject.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanDeleteObject(Boolean value) {
        this.canDeleteObject = value;
    }

    /**
     * Obtiene el valor de la propiedad canUpdateProperties.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanUpdateProperties() {
        return canUpdateProperties;
    }

    /**
     * Define el valor de la propiedad canUpdateProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanUpdateProperties(Boolean value) {
        this.canUpdateProperties = value;
    }

    /**
     * Obtiene el valor de la propiedad canGetFolderTree.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanGetFolderTree() {
        return canGetFolderTree;
    }

    /**
     * Define el valor de la propiedad canGetFolderTree.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanGetFolderTree(Boolean value) {
        this.canGetFolderTree = value;
    }

    /**
     * Obtiene el valor de la propiedad canGetProperties.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanGetProperties() {
        return canGetProperties;
    }

    /**
     * Define el valor de la propiedad canGetProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanGetProperties(Boolean value) {
        this.canGetProperties = value;
    }

    /**
     * Obtiene el valor de la propiedad canGetObjectRelationships.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanGetObjectRelationships() {
        return canGetObjectRelationships;
    }

    /**
     * Define el valor de la propiedad canGetObjectRelationships.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanGetObjectRelationships(Boolean value) {
        this.canGetObjectRelationships = value;
    }

    /**
     * Obtiene el valor de la propiedad canGetObjectParents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanGetObjectParents() {
        return canGetObjectParents;
    }

    /**
     * Define el valor de la propiedad canGetObjectParents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanGetObjectParents(Boolean value) {
        this.canGetObjectParents = value;
    }

    /**
     * Obtiene el valor de la propiedad canGetFolderParent.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanGetFolderParent() {
        return canGetFolderParent;
    }

    /**
     * Define el valor de la propiedad canGetFolderParent.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanGetFolderParent(Boolean value) {
        this.canGetFolderParent = value;
    }

    /**
     * Obtiene el valor de la propiedad canGetDescendants.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanGetDescendants() {
        return canGetDescendants;
    }

    /**
     * Define el valor de la propiedad canGetDescendants.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanGetDescendants(Boolean value) {
        this.canGetDescendants = value;
    }

    /**
     * Obtiene el valor de la propiedad canMoveObject.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanMoveObject() {
        return canMoveObject;
    }

    /**
     * Define el valor de la propiedad canMoveObject.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanMoveObject(Boolean value) {
        this.canMoveObject = value;
    }

    /**
     * Obtiene el valor de la propiedad canDeleteContentStream.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanDeleteContentStream() {
        return canDeleteContentStream;
    }

    /**
     * Define el valor de la propiedad canDeleteContentStream.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanDeleteContentStream(Boolean value) {
        this.canDeleteContentStream = value;
    }

    /**
     * Obtiene el valor de la propiedad canCheckOut.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanCheckOut() {
        return canCheckOut;
    }

    /**
     * Define el valor de la propiedad canCheckOut.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanCheckOut(Boolean value) {
        this.canCheckOut = value;
    }

    /**
     * Obtiene el valor de la propiedad canCancelCheckOut.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanCancelCheckOut() {
        return canCancelCheckOut;
    }

    /**
     * Define el valor de la propiedad canCancelCheckOut.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanCancelCheckOut(Boolean value) {
        this.canCancelCheckOut = value;
    }

    /**
     * Obtiene el valor de la propiedad canCheckIn.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanCheckIn() {
        return canCheckIn;
    }

    /**
     * Define el valor de la propiedad canCheckIn.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanCheckIn(Boolean value) {
        this.canCheckIn = value;
    }

    /**
     * Obtiene el valor de la propiedad canSetContentStream.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanSetContentStream() {
        return canSetContentStream;
    }

    /**
     * Define el valor de la propiedad canSetContentStream.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanSetContentStream(Boolean value) {
        this.canSetContentStream = value;
    }

    /**
     * Obtiene el valor de la propiedad canGetAllVersions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanGetAllVersions() {
        return canGetAllVersions;
    }

    /**
     * Define el valor de la propiedad canGetAllVersions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanGetAllVersions(Boolean value) {
        this.canGetAllVersions = value;
    }

    /**
     * Obtiene el valor de la propiedad canAddObjectToFolder.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanAddObjectToFolder() {
        return canAddObjectToFolder;
    }

    /**
     * Define el valor de la propiedad canAddObjectToFolder.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanAddObjectToFolder(Boolean value) {
        this.canAddObjectToFolder = value;
    }

    /**
     * Obtiene el valor de la propiedad canRemoveObjectFromFolder.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanRemoveObjectFromFolder() {
        return canRemoveObjectFromFolder;
    }

    /**
     * Define el valor de la propiedad canRemoveObjectFromFolder.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanRemoveObjectFromFolder(Boolean value) {
        this.canRemoveObjectFromFolder = value;
    }

    /**
     * Obtiene el valor de la propiedad canGetContentStream.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanGetContentStream() {
        return canGetContentStream;
    }

    /**
     * Define el valor de la propiedad canGetContentStream.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanGetContentStream(Boolean value) {
        this.canGetContentStream = value;
    }

    /**
     * Obtiene el valor de la propiedad canApplyPolicy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanApplyPolicy() {
        return canApplyPolicy;
    }

    /**
     * Define el valor de la propiedad canApplyPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanApplyPolicy(Boolean value) {
        this.canApplyPolicy = value;
    }

    /**
     * Obtiene el valor de la propiedad canGetAppliedPolicies.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanGetAppliedPolicies() {
        return canGetAppliedPolicies;
    }

    /**
     * Define el valor de la propiedad canGetAppliedPolicies.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanGetAppliedPolicies(Boolean value) {
        this.canGetAppliedPolicies = value;
    }

    /**
     * Obtiene el valor de la propiedad canRemovePolicy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanRemovePolicy() {
        return canRemovePolicy;
    }

    /**
     * Define el valor de la propiedad canRemovePolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanRemovePolicy(Boolean value) {
        this.canRemovePolicy = value;
    }

    /**
     * Obtiene el valor de la propiedad canGetChildren.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanGetChildren() {
        return canGetChildren;
    }

    /**
     * Define el valor de la propiedad canGetChildren.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanGetChildren(Boolean value) {
        this.canGetChildren = value;
    }

    /**
     * Obtiene el valor de la propiedad canCreateDocument.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanCreateDocument() {
        return canCreateDocument;
    }

    /**
     * Define el valor de la propiedad canCreateDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanCreateDocument(Boolean value) {
        this.canCreateDocument = value;
    }

    /**
     * Obtiene el valor de la propiedad canCreateFolder.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanCreateFolder() {
        return canCreateFolder;
    }

    /**
     * Define el valor de la propiedad canCreateFolder.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanCreateFolder(Boolean value) {
        this.canCreateFolder = value;
    }

    /**
     * Obtiene el valor de la propiedad canCreateRelationship.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanCreateRelationship() {
        return canCreateRelationship;
    }

    /**
     * Define el valor de la propiedad canCreateRelationship.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanCreateRelationship(Boolean value) {
        this.canCreateRelationship = value;
    }

    /**
     * Obtiene el valor de la propiedad canDeleteTree.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanDeleteTree() {
        return canDeleteTree;
    }

    /**
     * Define el valor de la propiedad canDeleteTree.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanDeleteTree(Boolean value) {
        this.canDeleteTree = value;
    }

    /**
     * Obtiene el valor de la propiedad canGetRenditions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanGetRenditions() {
        return canGetRenditions;
    }

    /**
     * Define el valor de la propiedad canGetRenditions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanGetRenditions(Boolean value) {
        this.canGetRenditions = value;
    }

    /**
     * Obtiene el valor de la propiedad canGetACL.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanGetACL() {
        return canGetACL;
    }

    /**
     * Define el valor de la propiedad canGetACL.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanGetACL(Boolean value) {
        this.canGetACL = value;
    }

    /**
     * Obtiene el valor de la propiedad canApplyACL.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanApplyACL() {
        return canApplyACL;
    }

    /**
     * Define el valor de la propiedad canApplyACL.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanApplyACL(Boolean value) {
        this.canApplyACL = value;
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
