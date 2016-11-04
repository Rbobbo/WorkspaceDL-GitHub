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
 * <p>Classe Java per wsJavaScriptElement complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsJavaScriptElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="assetSectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="assetUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="html" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="riskCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsJavaScriptElement", propOrder = {
    "assetCode",
    "assetSectionCode",
    "assetUnitCode",
    "html",
    "riskCode"
})
public class WsJavaScriptElement {

    protected String assetCode;
    protected String assetSectionCode;
    protected String assetUnitCode;
    protected String html;
    protected String riskCode;

    /**
     * Recupera il valore della proprietà assetCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetCode() {
        return assetCode;
    }

    /**
     * Imposta il valore della proprietà assetCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetCode(String value) {
        this.assetCode = value;
    }

    /**
     * Recupera il valore della proprietà assetSectionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetSectionCode() {
        return assetSectionCode;
    }

    /**
     * Imposta il valore della proprietà assetSectionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetSectionCode(String value) {
        this.assetSectionCode = value;
    }

    /**
     * Recupera il valore della proprietà assetUnitCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetUnitCode() {
        return assetUnitCode;
    }

    /**
     * Imposta il valore della proprietà assetUnitCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetUnitCode(String value) {
        this.assetUnitCode = value;
    }

    /**
     * Recupera il valore della proprietà html.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtml() {
        return html;
    }

    /**
     * Imposta il valore della proprietà html.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtml(String value) {
        this.html = value;
    }

    /**
     * Recupera il valore della proprietà riskCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskCode() {
        return riskCode;
    }

    /**
     * Imposta il valore della proprietà riskCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskCode(String value) {
        this.riskCode = value;
    }

}
