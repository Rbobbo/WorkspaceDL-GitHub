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
 * <p>Classe Java per wsGetValuedProductInput complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsGetValuedProductInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adaptToMinimumPrize" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="applyDiscounts" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="calculatePrizes" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="codLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="factorOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://rgi.it/WSPassPro}wsProduct" minOccurs="0"/&gt;
 *         &lt;element name="quotationMode" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
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
@XmlType(name = "wsGetValuedProductInput", propOrder = {
    "adaptToMinimumPrize",
    "applyDiscounts",
    "calculatePrizes",
    "codLang",
    "factorOrderCode",
    "product",
    "quotationMode",
    "showHiddenElements"
})
public class WsGetValuedProductInput {

    protected TypeBooleano adaptToMinimumPrize;
    protected TypeBooleano applyDiscounts;
    protected TypeBooleano calculatePrizes;
    protected String codLang;
    protected String factorOrderCode;
    protected WsProduct product;
    protected TypeBooleano quotationMode;
    protected TypeBooleano showHiddenElements;

    /**
     * Recupera il valore della propriet� adaptToMinimumPrize.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getAdaptToMinimumPrize() {
        return adaptToMinimumPrize;
    }

    /**
     * Imposta il valore della propriet� adaptToMinimumPrize.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setAdaptToMinimumPrize(TypeBooleano value) {
        this.adaptToMinimumPrize = value;
    }

    /**
     * Recupera il valore della propriet� applyDiscounts.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getApplyDiscounts() {
        return applyDiscounts;
    }

    /**
     * Imposta il valore della propriet� applyDiscounts.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setApplyDiscounts(TypeBooleano value) {
        this.applyDiscounts = value;
    }

    /**
     * Recupera il valore della propriet� calculatePrizes.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getCalculatePrizes() {
        return calculatePrizes;
    }

    /**
     * Imposta il valore della propriet� calculatePrizes.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setCalculatePrizes(TypeBooleano value) {
        this.calculatePrizes = value;
    }

    /**
     * Recupera il valore della propriet� codLang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLang() {
        return codLang;
    }

    /**
     * Imposta il valore della propriet� codLang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLang(String value) {
        this.codLang = value;
    }

    /**
     * Recupera il valore della propriet� factorOrderCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactorOrderCode() {
        return factorOrderCode;
    }

    /**
     * Imposta il valore della propriet� factorOrderCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactorOrderCode(String value) {
        this.factorOrderCode = value;
    }

    /**
     * Recupera il valore della propriet� product.
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
     * Imposta il valore della propriet� product.
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
     * Recupera il valore della propriet� quotationMode.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getQuotationMode() {
        return quotationMode;
    }

    /**
     * Imposta il valore della propriet� quotationMode.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setQuotationMode(TypeBooleano value) {
        this.quotationMode = value;
    }

    /**
     * Recupera il valore della propriet� showHiddenElements.
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
     * Imposta il valore della propriet� showHiddenElements.
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
