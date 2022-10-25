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
 * <p>Clase Java para enumVersioningState.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="enumVersioningState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="checkedout"/&gt;
 *     &lt;enumeration value="minor"/&gt;
 *     &lt;enumeration value="major"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumVersioningState", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
@XmlEnum
public enum EnumVersioningState {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("checkedout")
    CHECKEDOUT("checkedout"),
    @XmlEnumValue("minor")
    MINOR("minor"),
    @XmlEnumValue("major")
    MAJOR("major");
    private final String value;

    EnumVersioningState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumVersioningState fromValue(String v) {
        for (EnumVersioningState c: EnumVersioningState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
