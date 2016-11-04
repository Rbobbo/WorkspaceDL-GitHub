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
 * <p>Classe Java per wsGetLogicWarrantySelectionJSInput complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsGetLogicWarrantySelectionJSInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htmlFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://rgi.it/WSPassPro}wsProduct" minOccurs="0"/&gt;
 *         &lt;element name="test" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsGetLogicWarrantySelectionJSInput", propOrder = {
    "actionLevelCode",
    "htmlFormName",
    "product",
    "test"
})
public class WsGetLogicWarrantySelectionJSInput {

    protected String actionLevelCode;
    protected String htmlFormName;
    protected WsProduct product;
    protected TypeBooleano test;

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
     * Recupera il valore della proprietà htmlFormName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlFormName() {
        return htmlFormName;
    }

    /**
     * Imposta il valore della proprietà htmlFormName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlFormName(String value) {
        this.htmlFormName = value;
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
     * Recupera il valore della proprietà test.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getTest() {
        return test;
    }

    /**
     * Imposta il valore della proprietà test.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setTest(TypeBooleano value) {
        this.test = value;
    }

}
