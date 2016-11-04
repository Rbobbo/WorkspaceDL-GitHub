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
 * <p>Classe Java per passProPaymentMethodLifePremium complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="passProPaymentMethodLifePremium"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="annual" type="{http://rgi.it/WSPassPro}passProLifePremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="recurringUnique" type="{http://rgi.it/WSPassPro}passProLifePremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="unique" type="{http://rgi.it/WSPassPro}passProLifePremiumGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passProPaymentMethodLifePremium", propOrder = {
    "annual",
    "recurringUnique",
    "unique"
})
public class PassProPaymentMethodLifePremium {

    protected PassProLifePremiumGroup annual;
    protected PassProLifePremiumGroup recurringUnique;
    protected PassProLifePremiumGroup unique;

    /**
     * Recupera il valore della proprietà annual.
     * 
     * @return
     *     possible object is
     *     {@link PassProLifePremiumGroup }
     *     
     */
    public PassProLifePremiumGroup getAnnual() {
        return annual;
    }

    /**
     * Imposta il valore della proprietà annual.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProLifePremiumGroup }
     *     
     */
    public void setAnnual(PassProLifePremiumGroup value) {
        this.annual = value;
    }

    /**
     * Recupera il valore della proprietà recurringUnique.
     * 
     * @return
     *     possible object is
     *     {@link PassProLifePremiumGroup }
     *     
     */
    public PassProLifePremiumGroup getRecurringUnique() {
        return recurringUnique;
    }

    /**
     * Imposta il valore della proprietà recurringUnique.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProLifePremiumGroup }
     *     
     */
    public void setRecurringUnique(PassProLifePremiumGroup value) {
        this.recurringUnique = value;
    }

    /**
     * Recupera il valore della proprietà unique.
     * 
     * @return
     *     possible object is
     *     {@link PassProLifePremiumGroup }
     *     
     */
    public PassProLifePremiumGroup getUnique() {
        return unique;
    }

    /**
     * Imposta il valore della proprietà unique.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProLifePremiumGroup }
     *     
     */
    public void setUnique(PassProLifePremiumGroup value) {
        this.unique = value;
    }

}
