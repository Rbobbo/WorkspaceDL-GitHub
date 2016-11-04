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
 * <p>Classe Java per passProWarrantyUnitShare complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="passProWarrantyUnitShare"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="discountedPremium" type="{http://rgi.it/WSPassPro}wsPremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="ministerialDivisionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="percentage" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="premium" type="{http://rgi.it/WSPassPro}wsPremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="sectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subDivisionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantyExtendedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passProWarrantyUnitShare", propOrder = {
    "discountedPremium",
    "ministerialDivisionCode",
    "percentage",
    "premium",
    "sectionCode",
    "subDivisionCode",
    "unitCode",
    "warrantyCode",
    "warrantyDescription",
    "warrantyExtendedDescription"
})
public class PassProWarrantyUnitShare {

    protected WsPremiumGroup discountedPremium;
    protected String ministerialDivisionCode;
    protected TypeReal percentage;
    protected WsPremiumGroup premium;
    protected String sectionCode;
    protected String subDivisionCode;
    protected String unitCode;
    protected String warrantyCode;
    protected String warrantyDescription;
    protected String warrantyExtendedDescription;

    /**
     * Recupera il valore della propriet� discountedPremium.
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
     * Imposta il valore della propriet� discountedPremium.
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
     * Recupera il valore della propriet� ministerialDivisionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinisterialDivisionCode() {
        return ministerialDivisionCode;
    }

    /**
     * Imposta il valore della propriet� ministerialDivisionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinisterialDivisionCode(String value) {
        this.ministerialDivisionCode = value;
    }

    /**
     * Recupera il valore della propriet� percentage.
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
     * Imposta il valore della propriet� percentage.
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
     * Recupera il valore della propriet� premium.
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
     * Imposta il valore della propriet� premium.
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
     * Recupera il valore della propriet� sectionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionCode() {
        return sectionCode;
    }

    /**
     * Imposta il valore della propriet� sectionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionCode(String value) {
        this.sectionCode = value;
    }

    /**
     * Recupera il valore della propriet� subDivisionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDivisionCode() {
        return subDivisionCode;
    }

    /**
     * Imposta il valore della propriet� subDivisionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDivisionCode(String value) {
        this.subDivisionCode = value;
    }

    /**
     * Recupera il valore della propriet� unitCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Imposta il valore della propriet� unitCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * Recupera il valore della propriet� warrantyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyCode() {
        return warrantyCode;
    }

    /**
     * Imposta il valore della propriet� warrantyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyCode(String value) {
        this.warrantyCode = value;
    }

    /**
     * Recupera il valore della propriet� warrantyDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyDescription() {
        return warrantyDescription;
    }

    /**
     * Imposta il valore della propriet� warrantyDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyDescription(String value) {
        this.warrantyDescription = value;
    }

    /**
     * Recupera il valore della propriet� warrantyExtendedDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyExtendedDescription() {
        return warrantyExtendedDescription;
    }

    /**
     * Imposta il valore della propriet� warrantyExtendedDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyExtendedDescription(String value) {
        this.warrantyExtendedDescription = value;
    }

}
