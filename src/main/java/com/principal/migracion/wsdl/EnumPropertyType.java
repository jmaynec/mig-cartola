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
 * <p>Clase Java para enumPropertyType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="enumPropertyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="boolean"/&gt;
 *     &lt;enumeration value="id"/&gt;
 *     &lt;enumeration value="integer"/&gt;
 *     &lt;enumeration value="datetime"/&gt;
 *     &lt;enumeration value="decimal"/&gt;
 *     &lt;enumeration value="html"/&gt;
 *     &lt;enumeration value="string"/&gt;
 *     &lt;enumeration value="uri"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumPropertyType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
@XmlEnum
public enum EnumPropertyType {

    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("id")
    ID("id"),
    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("datetime")
    DATETIME("datetime"),
    @XmlEnumValue("decimal")
    DECIMAL("decimal"),
    @XmlEnumValue("html")
    HTML("html"),
    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("uri")
    URI("uri");
    private final String value;

    EnumPropertyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumPropertyType fromValue(String v) {
        for (EnumPropertyType c: EnumPropertyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
