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
 * <p>Clase Java para enumCapabilityQuery.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="enumCapabilityQuery"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="metadataonly"/&gt;
 *     &lt;enumeration value="fulltextonly"/&gt;
 *     &lt;enumeration value="bothseparate"/&gt;
 *     &lt;enumeration value="bothcombined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumCapabilityQuery", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
@XmlEnum
public enum EnumCapabilityQuery {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("metadataonly")
    METADATAONLY("metadataonly"),
    @XmlEnumValue("fulltextonly")
    FULLTEXTONLY("fulltextonly"),
    @XmlEnumValue("bothseparate")
    BOTHSEPARATE("bothseparate"),
    @XmlEnumValue("bothcombined")
    BOTHCOMBINED("bothcombined");
    private final String value;

    EnumCapabilityQuery(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumCapabilityQuery fromValue(String v) {
        for (EnumCapabilityQuery c: EnumCapabilityQuery.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
