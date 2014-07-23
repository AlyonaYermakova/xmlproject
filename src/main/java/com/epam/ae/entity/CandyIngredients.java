
package com.epam.ae.entity;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candyIngredients complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="candyIngredients">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="water" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sugar" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="fruit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="chocolate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="vanilla" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "candyIngredients", namespace = "http://example.com/candies", propOrder = {
    "water",
    "sugar",
    "fruit",
    "chocolate",
    "vanilla"
})
public class CandyIngredients {

    @XmlElement(required = true)
    protected BigDecimal water;
    @XmlElement(required = true)
    protected BigDecimal sugar;
    @XmlElement(required = true)
    protected BigDecimal fruit;
    @XmlElement(required = true)
    protected BigDecimal chocolate;
    @XmlElement(required = true)
    protected BigDecimal vanilla;

    /**
     * Gets the value of the water property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWater() {
        return water;
    }

    /**
     * Sets the value of the water property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWater(BigDecimal value) {
        this.water = value;
    }

    /**
     * Gets the value of the sugar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSugar() {
        return sugar;
    }

    /**
     * Sets the value of the sugar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSugar(BigDecimal value) {
        this.sugar = value;
    }

    /**
     * Gets the value of the fruit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFruit() {
        return fruit;
    }

    /**
     * Sets the value of the fruit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFruit(BigDecimal value) {
        this.fruit = value;
    }

    /**
     * Gets the value of the chocolate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChocolate() {
        return chocolate;
    }

    /**
     * Sets the value of the chocolate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChocolate(BigDecimal value) {
        this.chocolate = value;
    }

    /**
     * Gets the value of the vanilla property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVanilla() {
        return vanilla;
    }

    /**
     * Sets the value of the vanilla property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVanilla(BigDecimal value) {
        this.vanilla = value;
    }

}
