//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.11.03 alle 09:31:48 AM CET 
//


package com.pass.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per wsCompany complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsCompany"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ANIACode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defRateAccessories" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isvapCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxRateAccessories" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="minRateAccessories" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="productDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productExtendedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="technicalDivisionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsCompany", propOrder = {
    "aniaCode",
    "code",
    "defRateAccessories",
    "description",
    "isvapCode",
    "maxRateAccessories",
    "minRateAccessories",
    "productDescription",
    "productExtendedDescription",
    "technicalDivisionCode"
})
public class WsCompany {

    @XmlElement(name = "ANIACode")
    protected String aniaCode;
    protected String code;
    protected double defRateAccessories;
    protected String description;
    protected String isvapCode;
    protected double maxRateAccessories;
    protected double minRateAccessories;
    protected String productDescription;
    protected String productExtendedDescription;
    protected String technicalDivisionCode;

    /**
     * Recupera il valore della propriet� aniaCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANIACode() {
        return aniaCode;
    }

    /**
     * Imposta il valore della propriet� aniaCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANIACode(String value) {
        this.aniaCode = value;
    }

    /**
     * Recupera il valore della propriet� code.
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
     * Imposta il valore della propriet� code.
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
     * Recupera il valore della propriet� defRateAccessories.
     * 
     */
    public double getDefRateAccessories() {
        return defRateAccessories;
    }

    /**
     * Imposta il valore della propriet� defRateAccessories.
     * 
     */
    public void setDefRateAccessories(double value) {
        this.defRateAccessories = value;
    }

    /**
     * Recupera il valore della propriet� description.
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
     * Imposta il valore della propriet� description.
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
     * Recupera il valore della propriet� isvapCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsvapCode() {
        return isvapCode;
    }

    /**
     * Imposta il valore della propriet� isvapCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsvapCode(String value) {
        this.isvapCode = value;
    }

    /**
     * Recupera il valore della propriet� maxRateAccessories.
     * 
     */
    public double getMaxRateAccessories() {
        return maxRateAccessories;
    }

    /**
     * Imposta il valore della propriet� maxRateAccessories.
     * 
     */
    public void setMaxRateAccessories(double value) {
        this.maxRateAccessories = value;
    }

    /**
     * Recupera il valore della propriet� minRateAccessories.
     * 
     */
    public double getMinRateAccessories() {
        return minRateAccessories;
    }

    /**
     * Imposta il valore della propriet� minRateAccessories.
     * 
     */
    public void setMinRateAccessories(double value) {
        this.minRateAccessories = value;
    }

    /**
     * Recupera il valore della propriet� productDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Imposta il valore della propriet� productDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Recupera il valore della propriet� productExtendedDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductExtendedDescription() {
        return productExtendedDescription;
    }

    /**
     * Imposta il valore della propriet� productExtendedDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductExtendedDescription(String value) {
        this.productExtendedDescription = value;
    }

    /**
     * Recupera il valore della propriet� technicalDivisionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalDivisionCode() {
        return technicalDivisionCode;
    }

    /**
     * Imposta il valore della propriet� technicalDivisionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalDivisionCode(String value) {
        this.technicalDivisionCode = value;
    }

}
