package com.epam.ae.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Candy complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Candy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="energy" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="type" type="{http://example.com/candies}candyTypes"/>
 *         &lt;element name="ingredients" type="{http://example.com/candies}candyIngredients"/>
 *         &lt;element name="value" type="{http://example.com/candies}candyValue"/>
 *         &lt;element name="production" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Candy", namespace = "http://example.com/candies", propOrder = {
        "name",
        "energy",
        "type",
        "ingredients",
        "value",
        "production"
})
public class Candy {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected BigInteger energy;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CandyTypes type;
    @XmlElement(required = true)
    protected CandyIngredients ingredients;
    @XmlElement(required = true)
    protected CandyValue value;
    @XmlElement(required = true)
    protected String production;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the energy property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getEnergy() {
        return energy;
    }

    /**
     * Sets the value of the energy property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setEnergy(BigInteger value) {
        this.energy = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link CandyTypes }
     */
    public CandyTypes getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link CandyTypes }
     */
    public void setType(CandyTypes value) {
        this.type = value;
    }

    /**
     * Gets the value of the ingredients property.
     *
     * @return possible object is
     * {@link CandyIngredients }
     */
    public CandyIngredients getIngredients() {
        return ingredients;
    }

    /**
     * Sets the value of the ingredients property.
     *
     * @param value allowed object is
     *              {@link CandyIngredients }
     */
    public void setIngredients(CandyIngredients value) {
        this.ingredients = value;
    }

    /**
     * Gets the value of the value property.
     *
     * @return possible object is
     * {@link CandyValue }
     */
    public CandyValue getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *              {@link CandyValue }
     */
    public void setValue(CandyValue value) {
        this.value = value;
    }

    /**
     * Gets the value of the production property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProduction() {
        return production;
    }

    /**
     * Sets the value of the production property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProduction(String value) {
        this.production = value;
    }

}
