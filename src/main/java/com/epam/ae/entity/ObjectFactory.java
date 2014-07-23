
package com.epam.ae.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epam.ae.entity package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CandyBox_QNAME = new QName("http://example.com/candies", "candyBox");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epam.ae.entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CandyList }
     * 
     */
    public CandyList createCandyList() {
        return new CandyList();
    }

    /**
     * Create an instance of {@link CandyValue }
     * 
     */
    public CandyValue createCandyValue() {
        return new CandyValue();
    }

    /**
     * Create an instance of {@link Candy }
     * 
     */
    public Candy createCandy() {
        return new Candy();
    }

    /**
     * Create an instance of {@link CandyIngredients }
     * 
     */
    public CandyIngredients createCandyIngredients() {
        return new CandyIngredients();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CandyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/candies", name = "candyBox")
    public JAXBElement<CandyList> createCandyBox(CandyList value) {
        return new JAXBElement<CandyList>(_CandyBox_QNAME, CandyList.class, null, value);
    }

}
