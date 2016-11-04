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
 * <p>Classe Java per wsAgreement complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsAgreement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="commissionListCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountCoeff" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="extendedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flexListCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flexListCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minPremium" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="renewalBehaviour" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="tariffReferenceDate" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="transcoderCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transcoderCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsAgreement", propOrder = {
    "code",
    "commissionListCode",
    "description",
    "discountCoeff",
    "extendedDescription",
    "flexListCode",
    "flexListCode2",
    "minPremium",
    "renewalBehaviour",
    "tariffReferenceDate",
    "transcoderCode1",
    "transcoderCode2"
})
public class WsAgreement {

    protected String code;
    protected String commissionListCode;
    protected String description;
    protected double discountCoeff;
    protected String extendedDescription;
    protected String flexListCode;
    protected String flexListCode2;
    protected double minPremium;
    protected TypeInt32 renewalBehaviour;
    protected TypeData tariffReferenceDate;
    protected String transcoderCode1;
    protected String transcoderCode2;

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
     * Recupera il valore della proprietà commissionListCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionListCode() {
        return commissionListCode;
    }

    /**
     * Imposta il valore della proprietà commissionListCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionListCode(String value) {
        this.commissionListCode = value;
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
     * Recupera il valore della proprietà discountCoeff.
     * 
     */
    public double getDiscountCoeff() {
        return discountCoeff;
    }

    /**
     * Imposta il valore della proprietà discountCoeff.
     * 
     */
    public void setDiscountCoeff(double value) {
        this.discountCoeff = value;
    }

    /**
     * Recupera il valore della proprietà extendedDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedDescription() {
        return extendedDescription;
    }

    /**
     * Imposta il valore della proprietà extendedDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedDescription(String value) {
        this.extendedDescription = value;
    }

    /**
     * Recupera il valore della proprietà flexListCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexListCode() {
        return flexListCode;
    }

    /**
     * Imposta il valore della proprietà flexListCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexListCode(String value) {
        this.flexListCode = value;
    }

    /**
     * Recupera il valore della proprietà flexListCode2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexListCode2() {
        return flexListCode2;
    }

    /**
     * Imposta il valore della proprietà flexListCode2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexListCode2(String value) {
        this.flexListCode2 = value;
    }

    /**
     * Recupera il valore della proprietà minPremium.
     * 
     */
    public double getMinPremium() {
        return minPremium;
    }

    /**
     * Imposta il valore della proprietà minPremium.
     * 
     */
    public void setMinPremium(double value) {
        this.minPremium = value;
    }

    /**
     * Recupera il valore della proprietà renewalBehaviour.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getRenewalBehaviour() {
        return renewalBehaviour;
    }

    /**
     * Imposta il valore della proprietà renewalBehaviour.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setRenewalBehaviour(TypeInt32 value) {
        this.renewalBehaviour = value;
    }

    /**
     * Recupera il valore della proprietà tariffReferenceDate.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getTariffReferenceDate() {
        return tariffReferenceDate;
    }

    /**
     * Imposta il valore della proprietà tariffReferenceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setTariffReferenceDate(TypeData value) {
        this.tariffReferenceDate = value;
    }

    /**
     * Recupera il valore della proprietà transcoderCode1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranscoderCode1() {
        return transcoderCode1;
    }

    /**
     * Imposta il valore della proprietà transcoderCode1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranscoderCode1(String value) {
        this.transcoderCode1 = value;
    }

    /**
     * Recupera il valore della proprietà transcoderCode2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranscoderCode2() {
        return transcoderCode2;
    }

    /**
     * Imposta il valore della proprietà transcoderCode2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranscoderCode2(String value) {
        this.transcoderCode2 = value;
    }

}
