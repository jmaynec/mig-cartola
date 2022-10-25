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
 * <p>Clase Java para enumContentStreamAllowed.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="enumContentStreamAllowed"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="notallowed"/&gt;
 *     &lt;enumeration value="allowed"/&gt;
 *     &lt;enumeration value="required"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumContentStreamAllowed", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
@XmlEnum
public enum EnumContentStreamAllowed {

    @XmlEnumValue("notallowed")
    NOTALLOWED("notallowed"),
    @XmlEnumValue("allowed")
    ALLOWED("allowed"),
    @XmlEnumValue("required")
    REQUIRED("required");
    private final String value;

    EnumContentStreamAllowed(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumContentStreamAllowed fromValue(String v) {
        for (EnumContentStreamAllowed c: EnumContentStreamAllowed.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
