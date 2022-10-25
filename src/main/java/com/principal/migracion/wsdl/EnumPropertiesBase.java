//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.10.24 a las 10:06:09 AM CLST 
//


package com.principal.migracion.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para enumPropertiesBase.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="enumPropertiesBase"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cmis:name"/&gt;
 *     &lt;enumeration value="cmis:objectId"/&gt;
 *     &lt;enumeration value="cmis:objectTypeId"/&gt;
 *     &lt;enumeration value="cmis:baseTypeId"/&gt;
 *     &lt;enumeration value="cmis:createdBy"/&gt;
 *     &lt;enumeration value="cmis:creationDate"/&gt;
 *     &lt;enumeration value="cmis:lastModifiedBy"/&gt;
 *     &lt;enumeration value="cmis:lastModificationDate"/&gt;
 *     &lt;enumeration value="cmis:changeToken"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumPropertiesBase", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
@XmlEnum
public enum EnumPropertiesBase {

    @XmlEnumValue("cmis:name")
    CMIS_NAME("cmis:name"),
    @XmlEnumValue("cmis:objectId")
    CMIS_OBJECT_ID("cmis:objectId"),
    @XmlEnumValue("cmis:objectTypeId")
    CMIS_OBJECT_TYPE_ID("cmis:objectTypeId"),
    @XmlEnumValue("cmis:baseTypeId")
    CMIS_BASE_TYPE_ID("cmis:baseTypeId"),
    @XmlEnumValue("cmis:createdBy")
    CMIS_CREATED_BY("cmis:createdBy"),
    @XmlEnumValue("cmis:creationDate")
    CMIS_CREATION_DATE("cmis:creationDate"),
    @XmlEnumValue("cmis:lastModifiedBy")
    CMIS_LAST_MODIFIED_BY("cmis:lastModifiedBy"),
    @XmlEnumValue("cmis:lastModificationDate")
    CMIS_LAST_MODIFICATION_DATE("cmis:lastModificationDate"),
    @XmlEnumValue("cmis:changeToken")
    CMIS_CHANGE_TOKEN("cmis:changeToken");
    private final String value;

    EnumPropertiesBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumPropertiesBase fromValue(String v) {
        for (EnumPropertiesBase c: EnumPropertiesBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
