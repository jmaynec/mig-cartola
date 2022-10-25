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
 * <p>Clase Java para enumPropertiesRelationship.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="enumPropertiesRelationship"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cmis:sourceId"/&gt;
 *     &lt;enumeration value="cmis:targetId"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumPropertiesRelationship", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
@XmlEnum
public enum EnumPropertiesRelationship {

    @XmlEnumValue("cmis:sourceId")
    CMIS_SOURCE_ID("cmis:sourceId"),
    @XmlEnumValue("cmis:targetId")
    CMIS_TARGET_ID("cmis:targetId");
    private final String value;

    EnumPropertiesRelationship(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumPropertiesRelationship fromValue(String v) {
        for (EnumPropertiesRelationship c: EnumPropertiesRelationship.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
