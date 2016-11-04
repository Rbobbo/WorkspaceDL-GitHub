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
 * <p>Classe Java per passProLifePremiumGroup complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="passProLifePremiumGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="instalment" type="{http://rgi.it/WSPassPro}passProLifePremium" minOccurs="0"/&gt;
 *         &lt;element name="nextInstalment" type="{http://rgi.it/WSPassPro}passProLifePremium" minOccurs="0"/&gt;
 *         &lt;element name="policy" type="{http://rgi.it/WSPassPro}passProLifePremium" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passProLifePremiumGroup", propOrder = {
    "instalment",
    "nextInstalment",
    "policy"
})
public class PassProLifePremiumGroup {

    protected PassProLifePremium instalment;
    protected PassProLifePremium nextInstalment;
    protected PassProLifePremium policy;

    /**
     * Recupera il valore della proprietà instalment.
     * 
     * @return
     *     possible object is
     *     {@link PassProLifePremium }
     *     
     */
    public PassProLifePremium getInstalment() {
        return instalment;
    }

    /**
     * Imposta il valore della proprietà instalment.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProLifePremium }
     *     
     */
    public void setInstalment(PassProLifePremium value) {
        this.instalment = value;
    }

    /**
     * Recupera il valore della proprietà nextInstalment.
     * 
     * @return
     *     possible object is
     *     {@link PassProLifePremium }
     *     
     */
    public PassProLifePremium getNextInstalment() {
        return nextInstalment;
    }

    /**
     * Imposta il valore della proprietà nextInstalment.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProLifePremium }
     *     
     */
    public void setNextInstalment(PassProLifePremium value) {
        this.nextInstalment = value;
    }

    /**
     * Recupera il valore della proprietà policy.
     * 
     * @return
     *     possible object is
     *     {@link PassProLifePremium }
     *     
     */
    public PassProLifePremium getPolicy() {
        return policy;
    }

    /**
     * Imposta il valore della proprietà policy.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProLifePremium }
     *     
     */
    public void setPolicy(PassProLifePremium value) {
        this.policy = value;
    }

}
