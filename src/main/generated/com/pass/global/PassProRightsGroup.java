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
 * <p>Classe Java per passProRightsGroup complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="passProRightsGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="annual" type="{http://rgi.it/WSPassPro}passProRights" minOccurs="0"/&gt;
 *         &lt;element name="instalment" type="{http://rgi.it/WSPassPro}passProRights" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionInstalment" type="{http://rgi.it/WSPassPro}passProRights" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passProRightsGroup", propOrder = {
    "annual",
    "instalment",
    "subscriptionInstalment"
})
public class PassProRightsGroup {

    protected PassProRights annual;
    protected PassProRights instalment;
    protected PassProRights subscriptionInstalment;

    /**
     * Recupera il valore della proprietà annual.
     * 
     * @return
     *     possible object is
     *     {@link PassProRights }
     *     
     */
    public PassProRights getAnnual() {
        return annual;
    }

    /**
     * Imposta il valore della proprietà annual.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProRights }
     *     
     */
    public void setAnnual(PassProRights value) {
        this.annual = value;
    }

    /**
     * Recupera il valore della proprietà instalment.
     * 
     * @return
     *     possible object is
     *     {@link PassProRights }
     *     
     */
    public PassProRights getInstalment() {
        return instalment;
    }

    /**
     * Imposta il valore della proprietà instalment.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProRights }
     *     
     */
    public void setInstalment(PassProRights value) {
        this.instalment = value;
    }

    /**
     * Recupera il valore della proprietà subscriptionInstalment.
     * 
     * @return
     *     possible object is
     *     {@link PassProRights }
     *     
     */
    public PassProRights getSubscriptionInstalment() {
        return subscriptionInstalment;
    }

    /**
     * Imposta il valore della proprietà subscriptionInstalment.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProRights }
     *     
     */
    public void setSubscriptionInstalment(PassProRights value) {
        this.subscriptionInstalment = value;
    }

}
