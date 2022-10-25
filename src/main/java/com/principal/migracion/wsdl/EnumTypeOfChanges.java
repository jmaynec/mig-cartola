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
 * <p>Clase Java para enumTypeOfChanges.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="enumTypeOfChanges"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="created"/&gt;
 *     &lt;enumeration value="updated"/&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *     &lt;enumeration value="security"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumTypeOfChanges", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
@XmlEnum
public enum EnumTypeOfChanges {

    @XmlEnumValue("created")
    CREATED("created"),
    @XmlEnumValue("updated")
    UPDATED("updated"),
    @XmlEnumValue("deleted")
    DELETED("deleted"),
    @XmlEnumValue("security")
    SECURITY("security");
    private final String value;

    EnumTypeOfChanges(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumTypeOfChanges fromValue(String v) {
        for (EnumTypeOfChanges c: EnumTypeOfChanges.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
