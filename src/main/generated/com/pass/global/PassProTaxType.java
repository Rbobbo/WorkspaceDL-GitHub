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
 * <p>Classe Java per passProTaxType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="passProTaxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="antiRacketRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="commissionStrippingCoeff" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountedPremium" type="{http://rgi.it/WSPassPro}wsPremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="exception" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="premium" type="{http://rgi.it/WSPassPro}wsPremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="rightTaxRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ssnRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tariffArticle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passProTaxType", propOrder = {
    "antiRacketRate",
    "code",
    "commissionStrippingCoeff",
    "description",
    "discountedPremium",
    "exception",
    "premium",
    "rightTaxRate",
    "ssnRate",
    "tariffArticle",
    "taxRate"
})
public class PassProTaxType {

    protected double antiRacketRate;
    protected String code;
    protected double commissionStrippingCoeff;
    protected String description;
    protected WsPremiumGroup discountedPremium;
    protected String exception;
    protected WsPremiumGroup premium;
    protected double rightTaxRate;
    protected double ssnRate;
    protected String tariffArticle;
    protected double taxRate;

    /**
     * Recupera il valore della proprietà antiRacketRate.
     * 
     */
    public double getAntiRacketRate() {
        return antiRacketRate;
    }

    /**
     * Imposta il valore della proprietà antiRacketRate.
     * 
     */
    public void setAntiRacketRate(double value) {
        this.antiRacketRate = value;
    }

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
     * Recupera il valore della proprietà commissionStrippingCoeff.
     * 
     */
    public double getCommissionStrippingCoeff() {
        return commissionStrippingCoeff;
    }

    /**
     * Imposta il valore della proprietà commissionStrippingCoeff.
     * 
     */
    public void setCommissionStrippingCoeff(double value) {
        this.commissionStrippingCoeff = value;
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
     * Recupera il valore della proprietà discountedPremium.
     * 
     * @return
     *     possible object is
     *     {@link WsPremiumGroup }
     *     
     */
    public WsPremiumGroup getDiscountedPremium() {
        return discountedPremium;
    }

    /**
     * Imposta il valore della proprietà discountedPremium.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPremiumGroup }
     *     
     */
    public void setDiscountedPremium(WsPremiumGroup value) {
        this.discountedPremium = value;
    }

    /**
     * Recupera il valore della proprietà exception.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getException() {
        return exception;
    }

    /**
     * Imposta il valore della proprietà exception.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setException(String value) {
        this.exception = value;
    }

    /**
     * Recupera il valore della proprietà premium.
     * 
     * @return
     *     possible object is
     *     {@link WsPremiumGroup }
     *     
     */
    public WsPremiumGroup getPremium() {
        return premium;
    }

    /**
     * Imposta il valore della proprietà premium.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPremiumGroup }
     *     
     */
    public void setPremium(WsPremiumGroup value) {
        this.premium = value;
    }

    /**
     * Recupera il valore della proprietà rightTaxRate.
     * 
     */
    public double getRightTaxRate() {
        return rightTaxRate;
    }

    /**
     * Imposta il valore della proprietà rightTaxRate.
     * 
     */
    public void setRightTaxRate(double value) {
        this.rightTaxRate = value;
    }

    /**
     * Recupera il valore della proprietà ssnRate.
     * 
     */
    public double getSsnRate() {
        return ssnRate;
    }

    /**
     * Imposta il valore della proprietà ssnRate.
     * 
     */
    public void setSsnRate(double value) {
        this.ssnRate = value;
    }

    /**
     * Recupera il valore della proprietà tariffArticle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffArticle() {
        return tariffArticle;
    }

    /**
     * Imposta il valore della proprietà tariffArticle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffArticle(String value) {
        this.tariffArticle = value;
    }

    /**
     * Recupera il valore della proprietà taxRate.
     * 
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * Imposta il valore della proprietà taxRate.
     * 
     */
    public void setTaxRate(double value) {
        this.taxRate = value;
    }

}
