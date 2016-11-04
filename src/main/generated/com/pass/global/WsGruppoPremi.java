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
 * <p>Classe Java per wsGruppoPremi complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsGruppoPremi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="annuo" type="{http://rgi.it/WSPassPro}wsPremio" minOccurs="0"/&gt;
 *         &lt;element name="rata" type="{http://rgi.it/WSPassPro}wsPremio" minOccurs="0"/&gt;
 *         &lt;element name="rataFirma" type="{http://rgi.it/WSPassPro}wsPremio" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsGruppoPremi", propOrder = {
    "annuo",
    "rata",
    "rataFirma"
})
public class WsGruppoPremi {

    protected WsPremio annuo;
    protected WsPremio rata;
    protected WsPremio rataFirma;

    /**
     * Recupera il valore della proprietà annuo.
     * 
     * @return
     *     possible object is
     *     {@link WsPremio }
     *     
     */
    public WsPremio getAnnuo() {
        return annuo;
    }

    /**
     * Imposta il valore della proprietà annuo.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPremio }
     *     
     */
    public void setAnnuo(WsPremio value) {
        this.annuo = value;
    }

    /**
     * Recupera il valore della proprietà rata.
     * 
     * @return
     *     possible object is
     *     {@link WsPremio }
     *     
     */
    public WsPremio getRata() {
        return rata;
    }

    /**
     * Imposta il valore della proprietà rata.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPremio }
     *     
     */
    public void setRata(WsPremio value) {
        this.rata = value;
    }

    /**
     * Recupera il valore della proprietà rataFirma.
     * 
     * @return
     *     possible object is
     *     {@link WsPremio }
     *     
     */
    public WsPremio getRataFirma() {
        return rataFirma;
    }

    /**
     * Imposta il valore della proprietà rataFirma.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPremio }
     *     
     */
    public void setRataFirma(WsPremio value) {
        this.rataFirma = value;
    }

}
