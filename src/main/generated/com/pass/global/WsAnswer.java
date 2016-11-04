//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.11.03 alle 09:31:48 AM CET 
//


package com.pass.global;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per wsAnswer complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsAnswer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="factorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="factorDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="factorDescrExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="factorFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="factorType" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="formatter" type="{http://rgi.it/WSPassPro}passProFactorFormat" minOccurs="0"/&gt;
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paramType" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="values" type="{http://rgi.it/WSPassPro}wsAnswerValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsAnswer", propOrder = {
    "defaultValue",
    "factorCode",
    "factorDescr",
    "factorDescrExt",
    "factorFormat",
    "factorType",
    "formatter",
    "notes",
    "paramType",
    "value",
    "values"
})
public class WsAnswer {

    protected String defaultValue;
    protected String factorCode;
    protected String factorDescr;
    protected String factorDescrExt;
    protected String factorFormat;
    protected TypeInt32 factorType;
    protected PassProFactorFormat formatter;
    protected String notes;
    protected TypeInt32 paramType;
    protected String value;
    @XmlElement(nillable = true)
    protected List<WsAnswerValue> values;

    /**
     * Recupera il valore della propriet� defaultValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Imposta il valore della propriet� defaultValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Recupera il valore della propriet� factorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactorCode() {
        return factorCode;
    }

    /**
     * Imposta il valore della propriet� factorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactorCode(String value) {
        this.factorCode = value;
    }

    /**
     * Recupera il valore della propriet� factorDescr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactorDescr() {
        return factorDescr;
    }

    /**
     * Imposta il valore della propriet� factorDescr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactorDescr(String value) {
        this.factorDescr = value;
    }

    /**
     * Recupera il valore della propriet� factorDescrExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactorDescrExt() {
        return factorDescrExt;
    }

    /**
     * Imposta il valore della propriet� factorDescrExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactorDescrExt(String value) {
        this.factorDescrExt = value;
    }

    /**
     * Recupera il valore della propriet� factorFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactorFormat() {
        return factorFormat;
    }

    /**
     * Imposta il valore della propriet� factorFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactorFormat(String value) {
        this.factorFormat = value;
    }

    /**
     * Recupera il valore della propriet� factorType.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getFactorType() {
        return factorType;
    }

    /**
     * Imposta il valore della propriet� factorType.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setFactorType(TypeInt32 value) {
        this.factorType = value;
    }

    /**
     * Recupera il valore della propriet� formatter.
     * 
     * @return
     *     possible object is
     *     {@link PassProFactorFormat }
     *     
     */
    public PassProFactorFormat getFormatter() {
        return formatter;
    }

    /**
     * Imposta il valore della propriet� formatter.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProFactorFormat }
     *     
     */
    public void setFormatter(PassProFactorFormat value) {
        this.formatter = value;
    }

    /**
     * Recupera il valore della propriet� notes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Imposta il valore della propriet� notes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Recupera il valore della propriet� paramType.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getParamType() {
        return paramType;
    }

    /**
     * Imposta il valore della propriet� paramType.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setParamType(TypeInt32 value) {
        this.paramType = value;
    }

    /**
     * Recupera il valore della propriet� value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Imposta il valore della propriet� value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsAnswerValue }
     * 
     * 
     */
    public List<WsAnswerValue> getValues() {
        if (values == null) {
            values = new ArrayList<WsAnswerValue>();
        }
        return this.values;
    }

}
