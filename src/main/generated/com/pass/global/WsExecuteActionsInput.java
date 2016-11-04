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
 * <p>Classe Java per wsExecuteActionsInput complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsExecuteActionsInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actionLevels" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="adaptToMinimumPremium" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="applyDiscount" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="langCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://rgi.it/WSPassPro}wsProduct" minOccurs="0"/&gt;
 *         &lt;element name="quoteMode" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="showHiddenElements" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsExecuteActionsInput", propOrder = {
    "actionLevelCode",
    "actionLevels",
    "adaptToMinimumPremium",
    "applyDiscount",
    "langCode",
    "product",
    "quoteMode",
    "showHiddenElements"
})
public class WsExecuteActionsInput {

    protected String actionLevelCode;
    @XmlElement(nillable = true)
    protected List<String> actionLevels;
    protected TypeBooleano adaptToMinimumPremium;
    protected TypeBooleano applyDiscount;
    protected String langCode;
    protected WsProduct product;
    protected TypeBooleano quoteMode;
    protected TypeBooleano showHiddenElements;

    /**
     * Recupera il valore della proprietà actionLevelCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionLevelCode() {
        return actionLevelCode;
    }

    /**
     * Imposta il valore della proprietà actionLevelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionLevelCode(String value) {
        this.actionLevelCode = value;
    }

    /**
     * Gets the value of the actionLevels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionLevels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionLevels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getActionLevels() {
        if (actionLevels == null) {
            actionLevels = new ArrayList<String>();
        }
        return this.actionLevels;
    }

    /**
     * Recupera il valore della proprietà adaptToMinimumPremium.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getAdaptToMinimumPremium() {
        return adaptToMinimumPremium;
    }

    /**
     * Imposta il valore della proprietà adaptToMinimumPremium.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setAdaptToMinimumPremium(TypeBooleano value) {
        this.adaptToMinimumPremium = value;
    }

    /**
     * Recupera il valore della proprietà applyDiscount.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getApplyDiscount() {
        return applyDiscount;
    }

    /**
     * Imposta il valore della proprietà applyDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setApplyDiscount(TypeBooleano value) {
        this.applyDiscount = value;
    }

    /**
     * Recupera il valore della proprietà langCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCode() {
        return langCode;
    }

    /**
     * Imposta il valore della proprietà langCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangCode(String value) {
        this.langCode = value;
    }

    /**
     * Recupera il valore della proprietà product.
     * 
     * @return
     *     possible object is
     *     {@link WsProduct }
     *     
     */
    public WsProduct getProduct() {
        return product;
    }

    /**
     * Imposta il valore della proprietà product.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProduct }
     *     
     */
    public void setProduct(WsProduct value) {
        this.product = value;
    }

    /**
     * Recupera il valore della proprietà quoteMode.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getQuoteMode() {
        return quoteMode;
    }

    /**
     * Imposta il valore della proprietà quoteMode.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setQuoteMode(TypeBooleano value) {
        this.quoteMode = value;
    }

    /**
     * Recupera il valore della proprietà showHiddenElements.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getShowHiddenElements() {
        return showHiddenElements;
    }

    /**
     * Imposta il valore della proprietà showHiddenElements.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setShowHiddenElements(TypeBooleano value) {
        this.showHiddenElements = value;
    }

}
