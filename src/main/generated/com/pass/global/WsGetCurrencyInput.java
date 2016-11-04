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
 * <p>Classe Java per wsGetCurrencyInput complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsGetCurrencyInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currencies" type="{http://rgi.it/WSPassPro}wsCurrency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsGetCurrencyInput", propOrder = {
    "codLang",
    "currencies"
})
public class WsGetCurrencyInput {

    protected String codLang;
    @XmlElement(nillable = true)
    protected List<WsCurrency> currencies;

    /**
     * Recupera il valore della proprietà codLang.
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
     * Imposta il valore della proprietà codLang.
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
     * Gets the value of the currencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsCurrency }
     * 
     * 
     */
    public List<WsCurrency> getCurrencies() {
        if (currencies == null) {
            currencies = new ArrayList<WsCurrency>();
        }
        return this.currencies;
    }

}
