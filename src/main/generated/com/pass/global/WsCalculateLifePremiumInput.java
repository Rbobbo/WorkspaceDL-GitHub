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
 * <p>Classe Java per wsCalculateLifePremiumInput complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsCalculateLifePremiumInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="langCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://rgi.it/WSPassPro}wsProduct" minOccurs="0"/&gt;
 *         &lt;element name="quoteMode" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="titleRatePlanMode" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsCalculateLifePremiumInput", propOrder = {
    "langCode",
    "product",
    "quoteMode",
    "titleRatePlanMode"
})
public class WsCalculateLifePremiumInput {

    protected String langCode;
    protected WsProduct product;
    protected TypeBooleano quoteMode;
    protected TypeInt32 titleRatePlanMode;

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
     * Recupera il valore della proprietà titleRatePlanMode.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getTitleRatePlanMode() {
        return titleRatePlanMode;
    }

    /**
     * Imposta il valore della proprietà titleRatePlanMode.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setTitleRatePlanMode(TypeInt32 value) {
        this.titleRatePlanMode = value;
    }

}
