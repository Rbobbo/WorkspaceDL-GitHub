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
 * <p>Classe Java per passProLifePremium complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="passProLifePremium"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gross" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="net" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="paymentFrequencyInterest" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="rights" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
@XmlType(name = "passProLifePremium", propOrder = {
    "gross",
    "net",
    "paymentFrequencyInterest",
    "rights",
    "taxes"
})
public class PassProLifePremium {

    protected double gross;
    protected double net;
    protected double paymentFrequencyInterest;
    protected double rights;
    protected double taxes;

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
     * Recupera il valore della proprietà rights.
     * 
     */
    public double getRights() {
        return rights;
    }

    /**
     * Imposta il valore della proprietà rights.
     * 
     */
    public void setRights(double value) {
        this.rights = value;
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
