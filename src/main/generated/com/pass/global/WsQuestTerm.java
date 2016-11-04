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
 * <p>Classe Java per wsQuestTerm complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsQuestTerm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="factorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operator" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="questionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsQuestTerm", propOrder = {
    "factorCode",
    "operator",
    "questionCode",
    "value"
})
public class WsQuestTerm {

    protected String factorCode;
    protected TypeInt32 operator;
    protected String questionCode;
    protected String value;

    /**
     * Recupera il valore della proprietà factorCode.
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
     * Imposta il valore della proprietà factorCode.
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
     * Recupera il valore della proprietà operator.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getOperator() {
        return operator;
    }

    /**
     * Imposta il valore della proprietà operator.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setOperator(TypeInt32 value) {
        this.operator = value;
    }

    /**
     * Recupera il valore della proprietà questionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionCode() {
        return questionCode;
    }

    /**
     * Imposta il valore della proprietà questionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionCode(String value) {
        this.questionCode = value;
    }

    /**
     * Recupera il valore della proprietà value.
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
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
