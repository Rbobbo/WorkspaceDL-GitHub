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
 * <p>Classe Java per passProIndexType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="passProIndexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustmentMaxPerc" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentMinPerc" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="increasePerc" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="indexValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="operativity" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="rebasingCoeff" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="referenceBase" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passProIndexType", propOrder = {
    "adjustmentMaxPerc",
    "adjustmentMinPerc",
    "code",
    "description",
    "increasePerc",
    "indexValue",
    "operativity",
    "rebasingCoeff",
    "referenceBase"
})
public class PassProIndexType {

    protected TypeReal adjustmentMaxPerc;
    protected TypeReal adjustmentMinPerc;
    protected String code;
    protected String description;
    protected double increasePerc;
    protected double indexValue;
    protected TypeBooleano operativity;
    protected TypeReal rebasingCoeff;
    protected TypeData referenceBase;

    /**
     * Recupera il valore della proprietà adjustmentMaxPerc.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getAdjustmentMaxPerc() {
        return adjustmentMaxPerc;
    }

    /**
     * Imposta il valore della proprietà adjustmentMaxPerc.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setAdjustmentMaxPerc(TypeReal value) {
        this.adjustmentMaxPerc = value;
    }

    /**
     * Recupera il valore della proprietà adjustmentMinPerc.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getAdjustmentMinPerc() {
        return adjustmentMinPerc;
    }

    /**
     * Imposta il valore della proprietà adjustmentMinPerc.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setAdjustmentMinPerc(TypeReal value) {
        this.adjustmentMinPerc = value;
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
     * Recupera il valore della proprietà increasePerc.
     * 
     */
    public double getIncreasePerc() {
        return increasePerc;
    }

    /**
     * Imposta il valore della proprietà increasePerc.
     * 
     */
    public void setIncreasePerc(double value) {
        this.increasePerc = value;
    }

    /**
     * Recupera il valore della proprietà indexValue.
     * 
     */
    public double getIndexValue() {
        return indexValue;
    }

    /**
     * Imposta il valore della proprietà indexValue.
     * 
     */
    public void setIndexValue(double value) {
        this.indexValue = value;
    }

    /**
     * Recupera il valore della proprietà operativity.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getOperativity() {
        return operativity;
    }

    /**
     * Imposta il valore della proprietà operativity.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setOperativity(TypeBooleano value) {
        this.operativity = value;
    }

    /**
     * Recupera il valore della proprietà rebasingCoeff.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getRebasingCoeff() {
        return rebasingCoeff;
    }

    /**
     * Imposta il valore della proprietà rebasingCoeff.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setRebasingCoeff(TypeReal value) {
        this.rebasingCoeff = value;
    }

    /**
     * Recupera il valore della proprietà referenceBase.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getReferenceBase() {
        return referenceBase;
    }

    /**
     * Imposta il valore della proprietà referenceBase.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setReferenceBase(TypeData value) {
        this.referenceBase = value;
    }

}
