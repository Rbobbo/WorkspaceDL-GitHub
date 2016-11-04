//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
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
 * <p>Classe Java per wsQuestionnaire complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsQuestionnaire"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="category" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="compulsory" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descriptionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="included" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="openDate" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="questions" type="{http://rgi.it/WSPassPro}wsQuestion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="score" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsQuestionnaire", propOrder = {
    "category",
    "code",
    "codeType",
    "codeVersion",
    "compulsory",
    "description",
    "descriptionType",
    "included",
    "openDate",
    "questions",
    "score"
})
public class WsQuestionnaire {

    protected TypeInt32 category;
    protected String code;
    protected String codeType;
    protected String codeVersion;
    protected TypeBooleano compulsory;
    protected String description;
    protected String descriptionType;
    protected TypeBooleano included;
    protected TypeData openDate;
    @XmlElement(nillable = true)
    protected List<WsQuestion> questions;
    protected TypeInt32 score;

    /**
     * Recupera il valore della proprietà category.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getCategory() {
        return category;
    }

    /**
     * Imposta il valore della proprietà category.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setCategory(TypeInt32 value) {
        this.category = value;
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
     * Recupera il valore della proprietà codeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeType() {
        return codeType;
    }

    /**
     * Imposta il valore della proprietà codeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeType(String value) {
        this.codeType = value;
    }

    /**
     * Recupera il valore della proprietà codeVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeVersion() {
        return codeVersion;
    }

    /**
     * Imposta il valore della proprietà codeVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeVersion(String value) {
        this.codeVersion = value;
    }

    /**
     * Recupera il valore della proprietà compulsory.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getCompulsory() {
        return compulsory;
    }

    /**
     * Imposta il valore della proprietà compulsory.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setCompulsory(TypeBooleano value) {
        this.compulsory = value;
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
     * Recupera il valore della proprietà descriptionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionType() {
        return descriptionType;
    }

    /**
     * Imposta il valore della proprietà descriptionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionType(String value) {
        this.descriptionType = value;
    }

    /**
     * Recupera il valore della proprietà included.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getIncluded() {
        return included;
    }

    /**
     * Imposta il valore della proprietà included.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setIncluded(TypeBooleano value) {
        this.included = value;
    }

    /**
     * Recupera il valore della proprietà openDate.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getOpenDate() {
        return openDate;
    }

    /**
     * Imposta il valore della proprietà openDate.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setOpenDate(TypeData value) {
        this.openDate = value;
    }

    /**
     * Gets the value of the questions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsQuestion }
     * 
     * 
     */
    public List<WsQuestion> getQuestions() {
        if (questions == null) {
            questions = new ArrayList<WsQuestion>();
        }
        return this.questions;
    }

    /**
     * Recupera il valore della proprietà score.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getScore() {
        return score;
    }

    /**
     * Imposta il valore della proprietà score.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setScore(TypeInt32 value) {
        this.score = value;
    }

}
