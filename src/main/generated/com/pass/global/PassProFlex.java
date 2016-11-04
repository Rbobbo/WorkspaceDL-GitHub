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
 * <p>Classe Java per passProFlex complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="passProFlex"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="averageDiscount" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="averageMiscountDerogationLevel" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defaultDiscount" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="discountStep" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="erosion" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://rgi.it/WSPassPro}typeInt64" minOccurs="0"/&gt;
 *         &lt;element name="maximumDiscount" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="maximunMiscountDerogationLevel" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="minimumDiscount" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passProFlex", propOrder = {
    "averageDiscount",
    "averageMiscountDerogationLevel",
    "code",
    "defaultDiscount",
    "discountStep",
    "erosion",
    "id",
    "maximumDiscount",
    "maximunMiscountDerogationLevel",
    "minimumDiscount"
})
public class PassProFlex {

    protected TypeReal averageDiscount;
    protected TypeInt32 averageMiscountDerogationLevel;
    protected String code;
    protected TypeReal defaultDiscount;
    protected TypeReal discountStep;
    protected TypeInt32 erosion;
    @XmlElement(name = "ID")
    protected TypeInt64 id;
    protected TypeReal maximumDiscount;
    protected TypeInt32 maximunMiscountDerogationLevel;
    protected TypeReal minimumDiscount;

    /**
     * Recupera il valore della proprietà averageDiscount.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getAverageDiscount() {
        return averageDiscount;
    }

    /**
     * Imposta il valore della proprietà averageDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setAverageDiscount(TypeReal value) {
        this.averageDiscount = value;
    }

    /**
     * Recupera il valore della proprietà averageMiscountDerogationLevel.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getAverageMiscountDerogationLevel() {
        return averageMiscountDerogationLevel;
    }

    /**
     * Imposta il valore della proprietà averageMiscountDerogationLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setAverageMiscountDerogationLevel(TypeInt32 value) {
        this.averageMiscountDerogationLevel = value;
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
     * Recupera il valore della proprietà defaultDiscount.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getDefaultDiscount() {
        return defaultDiscount;
    }

    /**
     * Imposta il valore della proprietà defaultDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setDefaultDiscount(TypeReal value) {
        this.defaultDiscount = value;
    }

    /**
     * Recupera il valore della proprietà discountStep.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getDiscountStep() {
        return discountStep;
    }

    /**
     * Imposta il valore della proprietà discountStep.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setDiscountStep(TypeReal value) {
        this.discountStep = value;
    }

    /**
     * Recupera il valore della proprietà erosion.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getErosion() {
        return erosion;
    }

    /**
     * Imposta il valore della proprietà erosion.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setErosion(TypeInt32 value) {
        this.erosion = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt64 }
     *     
     */
    public TypeInt64 getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt64 }
     *     
     */
    public void setID(TypeInt64 value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà maximumDiscount.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getMaximumDiscount() {
        return maximumDiscount;
    }

    /**
     * Imposta il valore della proprietà maximumDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setMaximumDiscount(TypeReal value) {
        this.maximumDiscount = value;
    }

    /**
     * Recupera il valore della proprietà maximunMiscountDerogationLevel.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMaximunMiscountDerogationLevel() {
        return maximunMiscountDerogationLevel;
    }

    /**
     * Imposta il valore della proprietà maximunMiscountDerogationLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMaximunMiscountDerogationLevel(TypeInt32 value) {
        this.maximunMiscountDerogationLevel = value;
    }

    /**
     * Recupera il valore della proprietà minimumDiscount.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getMinimumDiscount() {
        return minimumDiscount;
    }

    /**
     * Imposta il valore della proprietà minimumDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setMinimumDiscount(TypeReal value) {
        this.minimumDiscount = value;
    }

}
