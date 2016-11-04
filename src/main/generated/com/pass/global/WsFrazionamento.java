//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.11.03 alle 09:31:48 AM CET 
//


package com.pass.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per wsFrazionamento complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsFrazionamento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dirittiPrimaRata" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="dirittiQuietanza" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="durataMaxGG" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="interessi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="interessiAddizionali" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="livelloDeroga" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="livelloDerogaPremioMinimoRata" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="livelloVisibilita" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="numrate" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="polizza" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="premioMinimoRata" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="preventivo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="proroga" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="regolazionePremio" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="rimborsoInteressiAddizionali" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="tipoFrazionamento" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsFrazionamento", propOrder = {
    "codice",
    "descrizione",
    "dirittiPrimaRata",
    "dirittiQuietanza",
    "durataMaxGG",
    "interessi",
    "interessiAddizionali",
    "livelloDeroga",
    "livelloDerogaPremioMinimoRata",
    "livelloVisibilita",
    "numrate",
    "polizza",
    "premioMinimoRata",
    "preventivo",
    "proroga",
    "regolazionePremio",
    "rimborsoInteressiAddizionali",
    "tipoFrazionamento"
})
public class WsFrazionamento {

    protected String codice;
    protected String descrizione;
    protected double dirittiPrimaRata;
    protected double dirittiQuietanza;
    protected TypeInt32 durataMaxGG;
    protected double interessi;
    protected double interessiAddizionali;
    protected TypeInt32 livelloDeroga;
    protected TypeInt32 livelloDerogaPremioMinimoRata;
    protected TypeInt32 livelloVisibilita;
    protected TypeInt32 numrate;
    protected boolean polizza;
    protected double premioMinimoRata;
    protected boolean preventivo;
    protected boolean proroga;
    protected boolean regolazionePremio;
    protected boolean rimborsoInteressiAddizionali;
    protected TypeInt32 tipoFrazionamento;

    /**
     * Recupera il valore della propriet� codice.
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
     * Imposta il valore della propriet� codice.
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
     * Recupera il valore della propriet� descrizione.
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
     * Imposta il valore della propriet� descrizione.
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
     * Recupera il valore della propriet� dirittiPrimaRata.
     * 
     */
    public double getDirittiPrimaRata() {
        return dirittiPrimaRata;
    }

    /**
     * Imposta il valore della propriet� dirittiPrimaRata.
     * 
     */
    public void setDirittiPrimaRata(double value) {
        this.dirittiPrimaRata = value;
    }

    /**
     * Recupera il valore della propriet� dirittiQuietanza.
     * 
     */
    public double getDirittiQuietanza() {
        return dirittiQuietanza;
    }

    /**
     * Imposta il valore della propriet� dirittiQuietanza.
     * 
     */
    public void setDirittiQuietanza(double value) {
        this.dirittiQuietanza = value;
    }

    /**
     * Recupera il valore della propriet� durataMaxGG.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getDurataMaxGG() {
        return durataMaxGG;
    }

    /**
     * Imposta il valore della propriet� durataMaxGG.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setDurataMaxGG(TypeInt32 value) {
        this.durataMaxGG = value;
    }

    /**
     * Recupera il valore della propriet� interessi.
     * 
     */
    public double getInteressi() {
        return interessi;
    }

    /**
     * Imposta il valore della propriet� interessi.
     * 
     */
    public void setInteressi(double value) {
        this.interessi = value;
    }

    /**
     * Recupera il valore della propriet� interessiAddizionali.
     * 
     */
    public double getInteressiAddizionali() {
        return interessiAddizionali;
    }

    /**
     * Imposta il valore della propriet� interessiAddizionali.
     * 
     */
    public void setInteressiAddizionali(double value) {
        this.interessiAddizionali = value;
    }

    /**
     * Recupera il valore della propriet� livelloDeroga.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getLivelloDeroga() {
        return livelloDeroga;
    }

    /**
     * Imposta il valore della propriet� livelloDeroga.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setLivelloDeroga(TypeInt32 value) {
        this.livelloDeroga = value;
    }

    /**
     * Recupera il valore della propriet� livelloDerogaPremioMinimoRata.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getLivelloDerogaPremioMinimoRata() {
        return livelloDerogaPremioMinimoRata;
    }

    /**
     * Imposta il valore della propriet� livelloDerogaPremioMinimoRata.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setLivelloDerogaPremioMinimoRata(TypeInt32 value) {
        this.livelloDerogaPremioMinimoRata = value;
    }

    /**
     * Recupera il valore della propriet� livelloVisibilita.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getLivelloVisibilita() {
        return livelloVisibilita;
    }

    /**
     * Imposta il valore della propriet� livelloVisibilita.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setLivelloVisibilita(TypeInt32 value) {
        this.livelloVisibilita = value;
    }

    /**
     * Recupera il valore della propriet� numrate.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getNumrate() {
        return numrate;
    }

    /**
     * Imposta il valore della propriet� numrate.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setNumrate(TypeInt32 value) {
        this.numrate = value;
    }

    /**
     * Recupera il valore della propriet� polizza.
     * 
     */
    public boolean isPolizza() {
        return polizza;
    }

    /**
     * Imposta il valore della propriet� polizza.
     * 
     */
    public void setPolizza(boolean value) {
        this.polizza = value;
    }

    /**
     * Recupera il valore della propriet� premioMinimoRata.
     * 
     */
    public double getPremioMinimoRata() {
        return premioMinimoRata;
    }

    /**
     * Imposta il valore della propriet� premioMinimoRata.
     * 
     */
    public void setPremioMinimoRata(double value) {
        this.premioMinimoRata = value;
    }

    /**
     * Recupera il valore della propriet� preventivo.
     * 
     */
    public boolean isPreventivo() {
        return preventivo;
    }

    /**
     * Imposta il valore della propriet� preventivo.
     * 
     */
    public void setPreventivo(boolean value) {
        this.preventivo = value;
    }

    /**
     * Recupera il valore della propriet� proroga.
     * 
     */
    public boolean isProroga() {
        return proroga;
    }

    /**
     * Imposta il valore della propriet� proroga.
     * 
     */
    public void setProroga(boolean value) {
        this.proroga = value;
    }

    /**
     * Recupera il valore della propriet� regolazionePremio.
     * 
     */
    public boolean isRegolazionePremio() {
        return regolazionePremio;
    }

    /**
     * Imposta il valore della propriet� regolazionePremio.
     * 
     */
    public void setRegolazionePremio(boolean value) {
        this.regolazionePremio = value;
    }

    /**
     * Recupera il valore della propriet� rimborsoInteressiAddizionali.
     * 
     */
    public boolean isRimborsoInteressiAddizionali() {
        return rimborsoInteressiAddizionali;
    }

    /**
     * Imposta il valore della propriet� rimborsoInteressiAddizionali.
     * 
     */
    public void setRimborsoInteressiAddizionali(boolean value) {
        this.rimborsoInteressiAddizionali = value;
    }

    /**
     * Recupera il valore della propriet� tipoFrazionamento.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getTipoFrazionamento() {
        return tipoFrazionamento;
    }

    /**
     * Imposta il valore della propriet� tipoFrazionamento.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setTipoFrazionamento(TypeInt32 value) {
        this.tipoFrazionamento = value;
    }

}
