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
 * <p>Classe Java per wsDivisa complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsDivisa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decimali" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="riferimento" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="rndSoglia" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="rndValore" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsDivisa", propOrder = {
    "codice",
    "decimali",
    "descrizione",
    "riferimento",
    "rndSoglia",
    "rndValore"
})
public class WsDivisa {

    protected String codice;
    protected TypeInt32 decimali;
    protected String descrizione;
    protected boolean riferimento;
    protected double rndSoglia;
    protected double rndValore;

    /**
     * Recupera il valore della proprietà codice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodice() {
        return codice;
    }

    /**
     * Imposta il valore della proprietà codice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodice(String value) {
        this.codice = value;
    }

    /**
     * Recupera il valore della proprietà decimali.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getDecimali() {
        return decimali;
    }

    /**
     * Imposta il valore della proprietà decimali.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setDecimali(TypeInt32 value) {
        this.decimali = value;
    }

    /**
     * Recupera il valore della proprietà descrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Imposta il valore della proprietà descrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Recupera il valore della proprietà riferimento.
     * 
     */
    public boolean isRiferimento() {
        return riferimento;
    }

    /**
     * Imposta il valore della proprietà riferimento.
     * 
     */
    public void setRiferimento(boolean value) {
        this.riferimento = value;
    }

    /**
     * Recupera il valore della proprietà rndSoglia.
     * 
     */
    public double getRndSoglia() {
        return rndSoglia;
    }

    /**
     * Imposta il valore della proprietà rndSoglia.
     * 
     */
    public void setRndSoglia(double value) {
        this.rndSoglia = value;
    }

    /**
     * Recupera il valore della proprietà rndValore.
     * 
     */
    public double getRndValore() {
        return rndValore;
    }

    /**
     * Imposta il valore della proprietà rndValore.
     * 
     */
    public void setRndValore(double value) {
        this.rndValore = value;
    }

}
