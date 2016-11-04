//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.11.03 alle 09:31:48 AM CET 
//


package com.pass.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per wsPaymentFrequency complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsPaymentFrequency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalInterest" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="additionalInterestRefund" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="derogationLevel" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="instalmentMinPremium" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="instalmentMinPremiumDerogationLevel" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="instalmentNumber" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="interests" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="maxDurationDays" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="minDurationDays" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="paymentFrequencyType" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="policy" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="premiumAdjustment" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="quote" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="settlementRights" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="subscriptionInstalmentRights" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="visibilityLevel" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="visible" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsPaymentFrequency", propOrder = {
    "additionalInterest",
    "additionalInterestRefund",
    "code",
    "derogationLevel",
    "description",
    "extension",
    "instalmentMinPremium",
    "instalmentMinPremiumDerogationLevel",
    "instalmentNumber",
    "interests",
    "maxDurationDays",
    "minDurationDays",
    "paymentFrequencyType",
    "policy",
    "premiumAdjustment",
    "quote",
    "settlementRights",
    "subscriptionInstalmentRights",
    "visibilityLevel",
    "visible"
})
public class WsPaymentFrequency {

    protected double additionalInterest;
    protected boolean additionalInterestRefund;
    protected String code;
    protected TypeInt32 derogationLevel;
    protected String description;
    protected boolean extension;
    protected double instalmentMinPremium;
    protected TypeInt32 instalmentMinPremiumDerogationLevel;
    protected TypeInt32 instalmentNumber;
    protected double interests;
    protected TypeInt32 maxDurationDays;
    protected TypeInt32 minDurationDays;
    protected TypeInt32 paymentFrequencyType;
    protected boolean policy;
    protected boolean premiumAdjustment;
    protected boolean quote;
    protected double settlementRights;
    protected double subscriptionInstalmentRights;
    protected TypeInt32 visibilityLevel;
    protected TypeBooleano visible;

    /**
     * Recupera il valore della propriet� additionalInterest.
     * 
     */
    public double getAdditionalInterest() {
        return additionalInterest;
    }

    /**
     * Imposta il valore della propriet� additionalInterest.
     * 
     */
    public void setAdditionalInterest(double value) {
        this.additionalInterest = value;
    }

    /**
     * Recupera il valore della propriet� additionalInterestRefund.
     * 
     */
    public boolean isAdditionalInterestRefund() {
        return additionalInterestRefund;
    }

    /**
     * Imposta il valore della propriet� additionalInterestRefund.
     * 
     */
    public void setAdditionalInterestRefund(boolean value) {
        this.additionalInterestRefund = value;
    }

    /**
     * Recupera il valore della propriet� code.
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
     * Imposta il valore della propriet� code.
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
     * Recupera il valore della propriet� derogationLevel.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getDerogationLevel() {
        return derogationLevel;
    }

    /**
     * Imposta il valore della propriet� derogationLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setDerogationLevel(TypeInt32 value) {
        this.derogationLevel = value;
    }

    /**
     * Recupera il valore della propriet� description.
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
     * Imposta il valore della propriet� description.
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
     * Recupera il valore della propriet� extension.
     * 
     */
    public boolean isExtension() {
        return extension;
    }

    /**
     * Imposta il valore della propriet� extension.
     * 
     */
    public void setExtension(boolean value) {
        this.extension = value;
    }

    /**
     * Recupera il valore della propriet� instalmentMinPremium.
     * 
     */
    public double getInstalmentMinPremium() {
        return instalmentMinPremium;
    }

    /**
     * Imposta il valore della propriet� instalmentMinPremium.
     * 
     */
    public void setInstalmentMinPremium(double value) {
        this.instalmentMinPremium = value;
    }

    /**
     * Recupera il valore della propriet� instalmentMinPremiumDerogationLevel.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getInstalmentMinPremiumDerogationLevel() {
        return instalmentMinPremiumDerogationLevel;
    }

    /**
     * Imposta il valore della propriet� instalmentMinPremiumDerogationLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setInstalmentMinPremiumDerogationLevel(TypeInt32 value) {
        this.instalmentMinPremiumDerogationLevel = value;
    }

    /**
     * Recupera il valore della propriet� instalmentNumber.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getInstalmentNumber() {
        return instalmentNumber;
    }

    /**
     * Imposta il valore della propriet� instalmentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setInstalmentNumber(TypeInt32 value) {
        this.instalmentNumber = value;
    }

    /**
     * Recupera il valore della propriet� interests.
     * 
     */
    public double getInterests() {
        return interests;
    }

    /**
     * Imposta il valore della propriet� interests.
     * 
     */
    public void setInterests(double value) {
        this.interests = value;
    }

    /**
     * Recupera il valore della propriet� maxDurationDays.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMaxDurationDays() {
        return maxDurationDays;
    }

    /**
     * Imposta il valore della propriet� maxDurationDays.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMaxDurationDays(TypeInt32 value) {
        this.maxDurationDays = value;
    }

    /**
     * Recupera il valore della propriet� minDurationDays.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMinDurationDays() {
        return minDurationDays;
    }

    /**
     * Imposta il valore della propriet� minDurationDays.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMinDurationDays(TypeInt32 value) {
        this.minDurationDays = value;
    }

    /**
     * Recupera il valore della propriet� paymentFrequencyType.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getPaymentFrequencyType() {
        return paymentFrequencyType;
    }

    /**
     * Imposta il valore della propriet� paymentFrequencyType.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setPaymentFrequencyType(TypeInt32 value) {
        this.paymentFrequencyType = value;
    }

    /**
     * Recupera il valore della propriet� policy.
     * 
     */
    public boolean isPolicy() {
        return policy;
    }

    /**
     * Imposta il valore della propriet� policy.
     * 
     */
    public void setPolicy(boolean value) {
        this.policy = value;
    }

    /**
     * Recupera il valore della propriet� premiumAdjustment.
     * 
     */
    public boolean isPremiumAdjustment() {
        return premiumAdjustment;
    }

    /**
     * Imposta il valore della propriet� premiumAdjustment.
     * 
     */
    public void setPremiumAdjustment(boolean value) {
        this.premiumAdjustment = value;
    }

    /**
     * Recupera il valore della propriet� quote.
     * 
     */
    public boolean isQuote() {
        return quote;
    }

    /**
     * Imposta il valore della propriet� quote.
     * 
     */
    public void setQuote(boolean value) {
        this.quote = value;
    }

    /**
     * Recupera il valore della propriet� settlementRights.
     * 
     */
    public double getSettlementRights() {
        return settlementRights;
    }

    /**
     * Imposta il valore della propriet� settlementRights.
     * 
     */
    public void setSettlementRights(double value) {
        this.settlementRights = value;
    }

    /**
     * Recupera il valore della propriet� subscriptionInstalmentRights.
     * 
     */
    public double getSubscriptionInstalmentRights() {
        return subscriptionInstalmentRights;
    }

    /**
     * Imposta il valore della propriet� subscriptionInstalmentRights.
     * 
     */
    public void setSubscriptionInstalmentRights(double value) {
        this.subscriptionInstalmentRights = value;
    }

    /**
     * Recupera il valore della propriet� visibilityLevel.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getVisibilityLevel() {
        return visibilityLevel;
    }

    /**
     * Imposta il valore della propriet� visibilityLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setVisibilityLevel(TypeInt32 value) {
        this.visibilityLevel = value;
    }

    /**
     * Recupera il valore della propriet� visible.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getVisible() {
        return visible;
    }

    /**
     * Imposta il valore della propriet� visible.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setVisible(TypeBooleano value) {
        this.visible = value;
    }

}
