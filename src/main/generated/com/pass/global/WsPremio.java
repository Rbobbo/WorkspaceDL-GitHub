//
// Questo file Ŕ stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrÓ persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.11.03 alle 09:31:48 AM CET 
//


package com.pass.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per wsPremio complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsPremio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessori" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="antiracket" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="imponibile" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="imposte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="intfraz" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="intfrazaccessori" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="intfraznetto" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="lordo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="netto" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="SSN" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsPremio", propOrder = {
    "accessori",
    "antiracket",
    "imponibile",
    "imposte",
    "intfraz",
    "intfrazaccessori",
    "intfraznetto",
    "lordo",
    "netto",
    "ssn"
})
public class WsPremio {

    protected double accessori;
    protected double antiracket;
    protected double imponibile;
    protected double imposte;
    protected double intfraz;
    protected double intfrazaccessori;
    protected double intfraznetto;
    protected double lordo;
    protected double netto;
    @XmlElement(name = "SSN")
    protected double ssn;

    /**
     * Recupera il valore della proprietÓ accessori.
     * 
     */
    public double getAccessori() {
        return accessori;
    }

    /**
     * Imposta il valore della proprietÓ accessori.
     * 
     */
    public void setAccessori(double value) {
        this.accessori = value;
    }

    /**
     * Recupera il valore della proprietÓ antiracket.
     * 
     */
    public double getAntiracket() {
        return antiracket;
    }

    /**
     * Imposta il valore della proprietÓ antiracket.
     * 
     */
    public void setAntiracket(double value) {
        this.antiracket = value;
    }

    /**
     * Recupera il valore della proprietÓ imponibile.
     * 
     */
    public double getImponibile() {
        return imponibile;
    }

    /**
     * Imposta il valore della proprietÓ imponibile.
     * 
     */
    public void setImponibile(double value) {
        this.imponibile = value;
    }

    /**
     * Recupera il valore della proprietÓ imposte.
     * 
     */
    public double getImposte() {
        return imposte;
    }

    /**
     * Imposta il valore della proprietÓ imposte.
     * 
     */
    public void setImposte(double value) {
        this.imposte = value;
    }

    /**
     * Recupera il valore della proprietÓ intfraz.
     * 
     */
    public double getIntfraz() {
        return intfraz;
    }

    /**
     * Imposta il valore della proprietÓ intfraz.
     * 
     */
    public void setIntfraz(double value) {
        this.intfraz = value;
    }

    /**
     * Recupera il valore della proprietÓ intfrazaccessori.
     * 
     */
    public double getIntfrazaccessori() {
        return intfrazaccessori;
    }

    /**
     * Imposta il valore della proprietÓ intfrazaccessori.
     * 
     */
    public void setIntfrazaccessori(double value) {
        this.intfrazaccessori = value;
    }

    /**
     * Recupera il valore della proprietÓ intfraznetto.
     * 
     */
    public double getIntfraznetto() {
        return intfraznetto;
    }

    /**
     * Imposta il valore della proprietÓ intfraznetto.
     * 
     */
    public void setIntfraznetto(double value) {
        this.intfraznetto = value;
    }

    /**
     * Recupera il valore della proprietÓ lordo.
     * 
     */
    public double getLordo() {
        return lordo;
    }

    /**
     * Imposta il valore della proprietÓ lordo.
     * 
     */
    public void setLordo(double value) {
        this.lordo = value;
    }

    /**
     * Recupera il valore della proprietÓ netto.
     * 
     */
    public double getNetto() {
        return netto;
    }

    /**
     * Imposta il valore della proprietÓ netto.
     * 
     */
    public void setNetto(double value) {
        this.netto = value;
    }

    /**
     * Recupera il valore della proprietÓ ssn.
     * 
     */
    public double getSSN() {
        return ssn;
    }

    /**
     * Imposta il valore della proprietÓ ssn.
     * 
     */
    public void setSSN(double value) {
        this.ssn = value;
    }

}
