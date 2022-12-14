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
 * <p>Clase Java para enumPropertiesDocument.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="enumPropertiesDocument"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cmis:isImmutable"/&gt;
 *     &lt;enumeration value="cmis:isLatestVersion"/&gt;
 *     &lt;enumeration value="cmis:isMajorVersion"/&gt;
 *     &lt;enumeration value="cmis:isLatestMajorVersion"/&gt;
 *     &lt;enumeration value="cmis:versionLabel"/&gt;
 *     &lt;enumeration value="cmis:versionSeriesId"/&gt;
 *     &lt;enumeration value="cmis:isVersionSeriesCheckedOut"/&gt;
 *     &lt;enumeration value="cmis:versionSeriesCheckedOutBy"/&gt;
 *     &lt;enumeration value="cmis:versionSeriesCheckedOutId"/&gt;
 *     &lt;enumeration value="cmis:checkinComment"/&gt;
 *     &lt;enumeration value="cmis:contentStreamLength"/&gt;
 *     &lt;enumeration value="cmis:contentStreamMimeType"/&gt;
 *     &lt;enumeration value="cmis:contentStreamFileName"/&gt;
 *     &lt;enumeration value="cmis:contentStreamId"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumPropertiesDocument", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
@XmlEnum
public enum EnumPropertiesDocument {

    @XmlEnumValue("cmis:isImmutable")
    CMIS_IS_IMMUTABLE("cmis:isImmutable"),
    @XmlEnumValue("cmis:isLatestVersion")
    CMIS_IS_LATEST_VERSION("cmis:isLatestVersion"),
    @XmlEnumValue("cmis:isMajorVersion")
    CMIS_IS_MAJOR_VERSION("cmis:isMajorVersion"),
    @XmlEnumValue("cmis:isLatestMajorVersion")
    CMIS_IS_LATEST_MAJOR_VERSION("cmis:isLatestMajorVersion"),
    @XmlEnumValue("cmis:versionLabel")
    CMIS_VERSION_LABEL("cmis:versionLabel"),
    @XmlEnumValue("cmis:versionSeriesId")
    CMIS_VERSION_SERIES_ID("cmis:versionSeriesId"),
    @XmlEnumValue("cmis:isVersionSeriesCheckedOut")
    CMIS_IS_VERSION_SERIES_CHECKED_OUT("cmis:isVersionSeriesCheckedOut"),
    @XmlEnumValue("cmis:versionSeriesCheckedOutBy")
    CMIS_VERSION_SERIES_CHECKED_OUT_BY("cmis:versionSeriesCheckedOutBy"),
    @XmlEnumValue("cmis:versionSeriesCheckedOutId")
    CMIS_VERSION_SERIES_CHECKED_OUT_ID("cmis:versionSeriesCheckedOutId"),
    @XmlEnumValue("cmis:checkinComment")
    CMIS_CHECKIN_COMMENT("cmis:checkinComment"),
    @XmlEnumValue("cmis:contentStreamLength")
    CMIS_CONTENT_STREAM_LENGTH("cmis:contentStreamLength"),
    @XmlEnumValue("cmis:contentStreamMimeType")
    CMIS_CONTENT_STREAM_MIME_TYPE("cmis:contentStreamMimeType"),
    @XmlEnumValue("cmis:contentStreamFileName")
    CMIS_CONTENT_STREAM_FILE_NAME("cmis:contentStreamFileName"),
    @XmlEnumValue("cmis:contentStreamId")
    CMIS_CONTENT_STREAM_ID("cmis:contentStreamId");
    private final String value;

    EnumPropertiesDocument(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumPropertiesDocument fromValue(String v) {
        for (EnumPropertiesDocument c: EnumPropertiesDocument.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
