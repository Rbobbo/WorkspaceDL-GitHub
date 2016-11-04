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
 * <p>Classe Java per passProCurrencyTax complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="passProCurrencyTax"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currencyCodeRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exchangeEndDate" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="exchangeStartDate" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="exchangeTax" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="openDate" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passProCurrencyTax", propOrder = {
    "currencyCode",
    "currencyCodeRef",
    "exchangeEndDate",
    "exchangeStartDate",
    "exchangeTax",
    "openDate"
})
public class PassProCurrencyTax {

    protected String currencyCode;
    protected String currencyCodeRef;
    protected TypeData exchangeEndDate;
    protected TypeData exchangeStartDate;
    protected TypeReal exchangeTax;
    protected TypeData openDate;

    /**
     * Recupera il valore della proprietà currencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Imposta il valore della proprietà currencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Recupera il valore della proprietà currencyCodeRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCodeRef() {
        return currencyCodeRef;
    }

    /**
     * Imposta il valore della proprietà currencyCodeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCodeRef(String value) {
        this.currencyCodeRef = value;
    }

    /**
     * Recupera il valore della proprietà exchangeEndDate.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getExchangeEndDate() {
        return exchangeEndDate;
    }

    /**
     * Imposta il valore della proprietà exchangeEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setExchangeEndDate(TypeData value) {
        this.exchangeEndDate = value;
    }

    /**
     * Recupera il valore della proprietà exchangeStartDate.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getExchangeStartDate() {
        return exchangeStartDate;
    }

    /**
     * Imposta il valore della proprietà exchangeStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setExchangeStartDate(TypeData value) {
        this.exchangeStartDate = value;
    }

    /**
     * Recupera il valore della proprietà exchangeTax.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getExchangeTax() {
        return exchangeTax;
    }

    /**
     * Imposta il valore della proprietà exchangeTax.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setExchangeTax(TypeReal value) {
        this.exchangeTax = value;
    }

    /**
     * Recupera il valore della proprietà openDate.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getOpenDate() {
        return openDate;
    }

    /**
     * Imposta il valore della proprietà openDate.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setOpenDate(TypeData value) {
        this.openDate = value;
    }

}
