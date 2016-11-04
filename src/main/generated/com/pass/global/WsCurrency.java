//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.11.03 alle 09:31:48 AM CET 
//


package com.pass.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per wsCurrency complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsCurrency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decimals" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="rndThreshold" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="rndValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsCurrency", propOrder = {
    "code",
    "decimals",
    "description",
    "id",
    "reference",
    "rndThreshold",
    "rndValue",
    "symbol"
})
public class WsCurrency {

    protected String code;
    protected TypeInt32 decimals;
    protected String description;
    protected TypeInt32 id;
    protected boolean reference;
    protected double rndThreshold;
    protected double rndValue;
    protected String symbol;

    /**
     * Recupera il valore della proprietà code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Imposta il valore della proprietà code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Recupera il valore della proprietà decimals.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getDecimals() {
        return decimals;
    }

    /**
     * Imposta il valore della proprietà decimals.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setDecimals(TypeInt32 value) {
        this.decimals = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setId(TypeInt32 value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà reference.
     * 
     */
    public boolean isReference() {
        return reference;
    }

    /**
     * Imposta il valore della proprietà reference.
     * 
     */
    public void setReference(boolean value) {
        this.reference = value;
    }

    /**
     * Recupera il valore della proprietà rndThreshold.
     * 
     */
    public double getRndThreshold() {
        return rndThreshold;
    }

    /**
     * Imposta il valore della proprietà rndThreshold.
     * 
     */
    public void setRndThreshold(double value) {
        this.rndThreshold = value;
    }

    /**
     * Recupera il valore della proprietà rndValue.
     * 
     */
    public double getRndValue() {
        return rndValue;
    }

    /**
     * Imposta il valore della proprietà rndValue.
     * 
     */
    public void setRndValue(double value) {
        this.rndValue = value;
    }

    /**
     * Recupera il valore della proprietà symbol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Imposta il valore della proprietà symbol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

}
