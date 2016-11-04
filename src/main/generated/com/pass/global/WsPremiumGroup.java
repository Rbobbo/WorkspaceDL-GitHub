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
 * <p>Classe Java per wsPremiumGroup complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsPremiumGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="annual" type="{http://rgi.it/WSPassPro}wsPremium" minOccurs="0"/&gt;
 *         &lt;element name="instalment" type="{http://rgi.it/WSPassPro}wsPremium" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionInstalment" type="{http://rgi.it/WSPassPro}wsPremium" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsPremiumGroup", propOrder = {
    "annual",
    "instalment",
    "subscriptionInstalment"
})
public class WsPremiumGroup {

    protected WsPremium annual;
    protected WsPremium instalment;
    protected WsPremium subscriptionInstalment;

    /**
     * Recupera il valore della proprietà annual.
     * 
     * @return
     *     possible object is
     *     {@link WsPremium }
     *     
     */
    public WsPremium getAnnual() {
        return annual;
    }

    /**
     * Imposta il valore della proprietà annual.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPremium }
     *     
     */
    public void setAnnual(WsPremium value) {
        this.annual = value;
    }

    /**
     * Recupera il valore della proprietà instalment.
     * 
     * @return
     *     possible object is
     *     {@link WsPremium }
     *     
     */
    public WsPremium getInstalment() {
        return instalment;
    }

    /**
     * Imposta il valore della proprietà instalment.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPremium }
     *     
     */
    public void setInstalment(WsPremium value) {
        this.instalment = value;
    }

    /**
     * Recupera il valore della proprietà subscriptionInstalment.
     * 
     * @return
     *     possible object is
     *     {@link WsPremium }
     *     
     */
    public WsPremium getSubscriptionInstalment() {
        return subscriptionInstalment;
    }

    /**
     * Imposta il valore della proprietà subscriptionInstalment.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPremium }
     *     
     */
    public void setSubscriptionInstalment(WsPremium value) {
        this.subscriptionInstalment = value;
    }

}
