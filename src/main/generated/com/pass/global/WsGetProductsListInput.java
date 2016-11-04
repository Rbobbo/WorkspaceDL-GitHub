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
 * <p>Classe Java per wsGetProductsListInput complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsGetProductsListInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agreementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="assetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="targetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validityDate" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="warrantyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsGetProductsListInput", propOrder = {
    "agreementCode",
    "assetCode",
    "companyCode",
    "listCode",
    "targetCode",
    "validityDate",
    "warrantyCode"
})
public class WsGetProductsListInput {

    protected String agreementCode;
    protected String assetCode;
    protected String companyCode;
    protected String listCode;
    protected String targetCode;
    protected TypeData validityDate;
    protected String warrantyCode;

    /**
     * Recupera il valore della proprietà agreementCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementCode() {
        return agreementCode;
    }

    /**
     * Imposta il valore della proprietà agreementCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementCode(String value) {
        this.agreementCode = value;
    }

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
     * Recupera il valore della proprietà companyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Imposta il valore della proprietà companyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Recupera il valore della proprietà listCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListCode() {
        return listCode;
    }

    /**
     * Imposta il valore della proprietà listCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListCode(String value) {
        this.listCode = value;
    }

    /**
     * Recupera il valore della proprietà targetCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCode() {
        return targetCode;
    }

    /**
     * Imposta il valore della proprietà targetCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCode(String value) {
        this.targetCode = value;
    }

    /**
     * Recupera il valore della proprietà validityDate.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getValidityDate() {
        return validityDate;
    }

    /**
     * Imposta il valore della proprietà validityDate.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setValidityDate(TypeData value) {
        this.validityDate = value;
    }

    /**
     * Recupera il valore della proprietà warrantyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyCode() {
        return warrantyCode;
    }

    /**
     * Imposta il valore della proprietà warrantyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyCode(String value) {
        this.warrantyCode = value;
    }

}
