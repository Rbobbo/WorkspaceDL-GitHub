//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.11.03 alle 09:31:48 AM CET 
//


package com.pass.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per wsPremium complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsPremium"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessories" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="antiracket" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="gross" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="net" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="paymentFrequencyInterest" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="paymentFrequencyInterestAccessories" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="paymentFrequencyInterestNet" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="SSN" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="taxable" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="taxes" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsPremium", propOrder = {
    "accessories",
    "antiracket",
    "gross",
    "net",
    "paymentFrequencyInterest",
    "paymentFrequencyInterestAccessories",
    "paymentFrequencyInterestNet",
    "ssn",
    "taxable",
    "taxes"
})
public class WsPremium {

    protected double accessories;
    protected double antiracket;
    protected double gross;
    protected double net;
    protected double paymentFrequencyInterest;
    protected double paymentFrequencyInterestAccessories;
    protected double paymentFrequencyInterestNet;
    @XmlElement(name = "SSN")
    protected double ssn;
    protected double taxable;
    protected double taxes;

    /**
     * Recupera il valore della proprietà accessories.
     * 
     */
    public double getAccessories() {
        return accessories;
    }

    /**
     * Imposta il valore della proprietà accessories.
     * 
     */
    public void setAccessories(double value) {
        this.accessories = value;
    }

    /**
     * Recupera il valore della proprietà antiracket.
     * 
     */
    public double getAntiracket() {
        return antiracket;
    }

    /**
     * Imposta il valore della proprietà antiracket.
     * 
     */
    public void setAntiracket(double value) {
        this.antiracket = value;
    }

    /**
     * Recupera il valore della proprietà gross.
     * 
     */
    public double getGross() {
        return gross;
    }

    /**
     * Imposta il valore della proprietà gross.
     * 
     */
    public void setGross(double value) {
        this.gross = value;
    }

    /**
     * Recupera il valore della proprietà net.
     * 
     */
    public double getNet() {
        return net;
    }

    /**
     * Imposta il valore della proprietà net.
     * 
     */
    public void setNet(double value) {
        this.net = value;
    }

    /**
     * Recupera il valore della proprietà paymentFrequencyInterest.
     * 
     */
    public double getPaymentFrequencyInterest() {
        return paymentFrequencyInterest;
    }

    /**
     * Imposta il valore della proprietà paymentFrequencyInterest.
     * 
     */
    public void setPaymentFrequencyInterest(double value) {
        this.paymentFrequencyInterest = value;
    }

    /**
     * Recupera il valore della proprietà paymentFrequencyInterestAccessories.
     * 
     */
    public double getPaymentFrequencyInterestAccessories() {
        return paymentFrequencyInterestAccessories;
    }

    /**
     * Imposta il valore della proprietà paymentFrequencyInterestAccessories.
     * 
     */
    public void setPaymentFrequencyInterestAccessories(double value) {
        this.paymentFrequencyInterestAccessories = value;
    }

    /**
     * Recupera il valore della proprietà paymentFrequencyInterestNet.
     * 
     */
    public double getPaymentFrequencyInterestNet() {
        return paymentFrequencyInterestNet;
    }

    /**
     * Imposta il valore della proprietà paymentFrequencyInterestNet.
     * 
     */
    public void setPaymentFrequencyInterestNet(double value) {
        this.paymentFrequencyInterestNet = value;
    }

    /**
     * Recupera il valore della proprietà ssn.
     * 
     */
    public double getSSN() {
        return ssn;
    }

    /**
     * Imposta il valore della proprietà ssn.
     * 
     */
    public void setSSN(double value) {
        this.ssn = value;
    }

    /**
     * Recupera il valore della proprietà taxable.
     * 
     */
    public double getTaxable() {
        return taxable;
    }

    /**
     * Imposta il valore della proprietà taxable.
     * 
     */
    public void setTaxable(double value) {
        this.taxable = value;
    }

    /**
     * Recupera il valore della proprietà taxes.
     * 
     */
    public double getTaxes() {
        return taxes;
    }

    /**
     * Imposta il valore della proprietà taxes.
     * 
     */
    public void setTaxes(double value) {
        this.taxes = value;
    }

}
