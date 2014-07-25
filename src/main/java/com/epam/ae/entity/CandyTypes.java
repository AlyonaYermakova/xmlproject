package com.epam.ae.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candyTypes.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="candyTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Caramel"/>
 *     &lt;enumeration value="Chocolate"/>
 *     &lt;enumeration value="Waffle"/>
 *     &lt;enumeration value="Toffee"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "candyTypes", namespace = "http://example.com/candies")
@XmlEnum
public enum CandyTypes {

    @XmlEnumValue("Caramel")
    CARAMEL("Caramel"),
    @XmlEnumValue("Chocolate")
    CHOCOLATE("Chocolate"),
    @XmlEnumValue("Waffle")
    WAFFLE("Waffle"),
    @XmlEnumValue("Toffee")
    TOFFEE("Toffee");
    private final String value;

    CandyTypes(String v) {
        value = v;
    }

    public static CandyTypes fromValue(String v) {
        for (CandyTypes c : CandyTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }

}
