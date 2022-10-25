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
 * <p>Clase Java para enumCapabilityContentStreamUpdates.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="enumCapabilityContentStreamUpdates"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="anytime"/&gt;
 *     &lt;enumeration value="pwconly"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumCapabilityContentStreamUpdates", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
@XmlEnum
public enum EnumCapabilityContentStreamUpdates {

    @XmlEnumValue("anytime")
    ANYTIME("anytime"),
    @XmlEnumValue("pwconly")
    PWCONLY("pwconly"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    EnumCapabilityContentStreamUpdates(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumCapabilityContentStreamUpdates fromValue(String v) {
        for (EnumCapabilityContentStreamUpdates c: EnumCapabilityContentStreamUpdates.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
