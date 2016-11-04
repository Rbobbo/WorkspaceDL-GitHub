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
 * <p>Classe Java per passProRights complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="passProRights"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="antiracket" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="commissionRate" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="defaultPercentage" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="defaultValue" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="gross" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="manuallySet" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="max" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="min" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="net" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="paymentFrequencyInterest" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="percentage" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="ssn" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="taxable" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="taxes" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passProRights", propOrder = {
    "amount",
    "antiracket",
    "commissionRate",
    "defaultPercentage",
    "defaultValue",
    "gross",
    "manuallySet",
    "max",
    "min",
    "net",
    "paymentFrequencyInterest",
    "percentage",
    "ssn",
    "taxable",
    "taxes"
})
public class PassProRights {

    protected TypeReal amount;
    protected TypeReal antiracket;
    protected TypeReal commissionRate;
    protected TypeReal defaultPercentage;
    protected TypeReal defaultValue;
    protected TypeReal gross;
    protected TypeInt32 manuallySet;
    protected TypeReal max;
    protected TypeReal min;
    protected TypeReal net;
    protected TypeReal paymentFrequencyInterest;
    protected TypeReal percentage;
    protected TypeReal ssn;
    protected TypeReal taxable;
    protected TypeReal taxes;

    /**
     * Recupera il valore della proprietà amount.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getAmount() {
        return amount;
    }

    /**
     * Imposta il valore della proprietà amount.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setAmount(TypeReal value) {
        this.amount = value;
    }

    /**
     * Recupera il valore della proprietà antiracket.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getAntiracket() {
        return antiracket;
    }

    /**
     * Imposta il valore della proprietà antiracket.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setAntiracket(TypeReal value) {
        this.antiracket = value;
    }

    /**
     * Recupera il valore della proprietà commissionRate.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getCommissionRate() {
        return commissionRate;
    }

    /**
     * Imposta il valore della proprietà commissionRate.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setCommissionRate(TypeReal value) {
        this.commissionRate = value;
    }

    /**
     * Recupera il valore della proprietà defaultPercentage.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getDefaultPercentage() {
        return defaultPercentage;
    }

    /**
     * Imposta il valore della proprietà defaultPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setDefaultPercentage(TypeReal value) {
        this.defaultPercentage = value;
    }

    /**
     * Recupera il valore della proprietà defaultValue.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getDefaultValue() {
        return defaultValue;
    }

    /**
     * Imposta il valore della proprietà defaultValue.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setDefaultValue(TypeReal value) {
        this.defaultValue = value;
    }

    /**
     * Recupera il valore della proprietà gross.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getGross() {
        return gross;
    }

    /**
     * Imposta il valore della proprietà gross.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setGross(TypeReal value) {
        this.gross = value;
    }

    /**
     * Recupera il valore della proprietà manuallySet.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getManuallySet() {
        return manuallySet;
    }

    /**
     * Imposta il valore della proprietà manuallySet.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setManuallySet(TypeInt32 value) {
        this.manuallySet = value;
    }

    /**
     * Recupera il valore della proprietà max.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getMax() {
        return max;
    }

    /**
     * Imposta il valore della proprietà max.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setMax(TypeReal value) {
        this.max = value;
    }

    /**
     * Recupera il valore della proprietà min.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getMin() {
        return min;
    }

    /**
     * Imposta il valore della proprietà min.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setMin(TypeReal value) {
        this.min = value;
    }

    /**
     * Recupera il valore della proprietà net.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getNet() {
        return net;
    }

    /**
     * Imposta il valore della proprietà net.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setNet(TypeReal value) {
        this.net = value;
    }

    /**
     * Recupera il valore della proprietà paymentFrequencyInterest.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getPaymentFrequencyInterest() {
        return paymentFrequencyInterest;
    }

    /**
     * Imposta il valore della proprietà paymentFrequencyInterest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setPaymentFrequencyInterest(TypeReal value) {
        this.paymentFrequencyInterest = value;
    }

    /**
     * Recupera il valore della proprietà percentage.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getPercentage() {
        return percentage;
    }

    /**
     * Imposta il valore della proprietà percentage.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setPercentage(TypeReal value) {
        this.percentage = value;
    }

    /**
     * Recupera il valore della proprietà ssn.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getSsn() {
        return ssn;
    }

    /**
     * Imposta il valore della proprietà ssn.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setSsn(TypeReal value) {
        this.ssn = value;
    }

    /**
     * Recupera il valore della proprietà taxable.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getTaxable() {
        return taxable;
    }

    /**
     * Imposta il valore della proprietà taxable.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setTaxable(TypeReal value) {
        this.taxable = value;
    }

    /**
     * Recupera il valore della proprietà taxes.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getTaxes() {
        return taxes;
    }

    /**
     * Imposta il valore della proprietà taxes.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setTaxes(TypeReal value) {
        this.taxes = value;
    }

}
