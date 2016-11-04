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
 * <p>Classe Java per passProExtDiscount complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="passProExtDiscount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessories" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="coeff" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="effectiveAmount" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="effectiveCoeff" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="effectivePercentage" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="gross" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="manuallySet" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="net" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="percentage" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="taxable" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passProExtDiscount", propOrder = {
    "accessories",
    "amount",
    "coeff",
    "effectiveAmount",
    "effectiveCoeff",
    "effectivePercentage",
    "gross",
    "manuallySet",
    "net",
    "percentage",
    "taxable"
})
public class PassProExtDiscount {

    protected TypeReal accessories;
    protected TypeReal amount;
    protected TypeReal coeff;
    protected TypeReal effectiveAmount;
    protected TypeReal effectiveCoeff;
    protected TypeReal effectivePercentage;
    protected TypeReal gross;
    protected TypeInt32 manuallySet;
    protected TypeReal net;
    protected TypeReal percentage;
    protected TypeReal taxable;

    /**
     * Recupera il valore della proprietà accessories.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getAccessories() {
        return accessories;
    }

    /**
     * Imposta il valore della proprietà accessories.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setAccessories(TypeReal value) {
        this.accessories = value;
    }

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
     * Recupera il valore della proprietà coeff.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getCoeff() {
        return coeff;
    }

    /**
     * Imposta il valore della proprietà coeff.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setCoeff(TypeReal value) {
        this.coeff = value;
    }

    /**
     * Recupera il valore della proprietà effectiveAmount.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getEffectiveAmount() {
        return effectiveAmount;
    }

    /**
     * Imposta il valore della proprietà effectiveAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setEffectiveAmount(TypeReal value) {
        this.effectiveAmount = value;
    }

    /**
     * Recupera il valore della proprietà effectiveCoeff.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getEffectiveCoeff() {
        return effectiveCoeff;
    }

    /**
     * Imposta il valore della proprietà effectiveCoeff.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setEffectiveCoeff(TypeReal value) {
        this.effectiveCoeff = value;
    }

    /**
     * Recupera il valore della proprietà effectivePercentage.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getEffectivePercentage() {
        return effectivePercentage;
    }

    /**
     * Imposta il valore della proprietà effectivePercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setEffectivePercentage(TypeReal value) {
        this.effectivePercentage = value;
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

}
