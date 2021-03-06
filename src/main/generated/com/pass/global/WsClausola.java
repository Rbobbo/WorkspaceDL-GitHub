//
// Questo file Ŕ stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrÓ persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.11.03 alle 09:31:48 AM CET 
//


package com.pass.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per wsClausola complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsClausola"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clausolaApplicazione" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataFine" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="dataInizio" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descrizioneEstesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enabled" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="formato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasFattore" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="helpFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="livelloDeroga" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="livelloVisibilita" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="ordine" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="selected" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="testo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="testoObbligatorio" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="tipoTesto" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="visibile" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="visibileInPreventivo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsClausola", propOrder = {
    "clausolaApplicazione",
    "codice",
    "dataFine",
    "dataInizio",
    "descrizione",
    "descrizioneEstesa",
    "enabled",
    "formato",
    "hasFattore",
    "helpFile",
    "livelloDeroga",
    "livelloVisibilita",
    "ordine",
    "selected",
    "testo",
    "testoObbligatorio",
    "tipoTesto",
    "visibile",
    "visibileInPreventivo"
})
public class WsClausola {

    protected TypeBooleano clausolaApplicazione;
    protected String codice;
    protected TypeData dataFine;
    protected TypeData dataInizio;
    protected String descrizione;
    protected String descrizioneEstesa;
    protected TypeBooleano enabled;
    protected String formato;
    protected TypeBooleano hasFattore;
    protected String helpFile;
    protected TypeInt32 livelloDeroga;
    protected TypeInt32 livelloVisibilita;
    protected TypeInt32 ordine;
    protected TypeBooleano selected;
    protected String testo;
    protected boolean testoObbligatorio;
    protected TypeInt32 tipoTesto;
    protected TypeBooleano visibile;
    protected TypeBooleano visibileInPreventivo;

    /**
     * Recupera il valore della proprietÓ clausolaApplicazione.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getClausolaApplicazione() {
        return clausolaApplicazione;
    }

    /**
     * Imposta il valore della proprietÓ clausolaApplicazione.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setClausolaApplicazione(TypeBooleano value) {
        this.clausolaApplicazione = value;
    }

    /**
     * Recupera il valore della proprietÓ codice.
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
     * Imposta il valore della proprietÓ codice.
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
     * Recupera il valore della proprietÓ dataFine.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getDataFine() {
        return dataFine;
    }

    /**
     * Imposta il valore della proprietÓ dataFine.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setDataFine(TypeData value) {
        this.dataFine = value;
    }

    /**
     * Recupera il valore della proprietÓ dataInizio.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getDataInizio() {
        return dataInizio;
    }

    /**
     * Imposta il valore della proprietÓ dataInizio.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setDataInizio(TypeData value) {
        this.dataInizio = value;
    }

    /**
     * Recupera il valore della proprietÓ descrizione.
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
     * Imposta il valore della proprietÓ descrizione.
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
     * Recupera il valore della proprietÓ descrizioneEstesa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneEstesa() {
        return descrizioneEstesa;
    }

    /**
     * Imposta il valore della proprietÓ descrizioneEstesa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneEstesa(String value) {
        this.descrizioneEstesa = value;
    }

    /**
     * Recupera il valore della proprietÓ enabled.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getEnabled() {
        return enabled;
    }

    /**
     * Imposta il valore della proprietÓ enabled.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setEnabled(TypeBooleano value) {
        this.enabled = value;
    }

    /**
     * Recupera il valore della proprietÓ formato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormato() {
        return formato;
    }

    /**
     * Imposta il valore della proprietÓ formato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormato(String value) {
        this.formato = value;
    }

    /**
     * Recupera il valore della proprietÓ hasFattore.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getHasFattore() {
        return hasFattore;
    }

    /**
     * Imposta il valore della proprietÓ hasFattore.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setHasFattore(TypeBooleano value) {
        this.hasFattore = value;
    }

    /**
     * Recupera il valore della proprietÓ helpFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpFile() {
        return helpFile;
    }

    /**
     * Imposta il valore della proprietÓ helpFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpFile(String value) {
        this.helpFile = value;
    }

    /**
     * Recupera il valore della proprietÓ livelloDeroga.
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
     * Imposta il valore della proprietÓ livelloDeroga.
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
     * Recupera il valore della proprietÓ livelloVisibilita.
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
     * Imposta il valore della proprietÓ livelloVisibilita.
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
     * Recupera il valore della proprietÓ ordine.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getOrdine() {
        return ordine;
    }

    /**
     * Imposta il valore della proprietÓ ordine.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setOrdine(TypeInt32 value) {
        this.ordine = value;
    }

    /**
     * Recupera il valore della proprietÓ selected.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getSelected() {
        return selected;
    }

    /**
     * Imposta il valore della proprietÓ selected.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setSelected(TypeBooleano value) {
        this.selected = value;
    }

    /**
     * Recupera il valore della proprietÓ testo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTesto() {
        return testo;
    }

    /**
     * Imposta il valore della proprietÓ testo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTesto(String value) {
        this.testo = value;
    }

    /**
     * Recupera il valore della proprietÓ testoObbligatorio.
     * 
     */
    public boolean isTestoObbligatorio() {
        return testoObbligatorio;
    }

    /**
     * Imposta il valore della proprietÓ testoObbligatorio.
     * 
     */
    public void setTestoObbligatorio(boolean value) {
        this.testoObbligatorio = value;
    }

    /**
     * Recupera il valore della proprietÓ tipoTesto.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getTipoTesto() {
        return tipoTesto;
    }

    /**
     * Imposta il valore della proprietÓ tipoTesto.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setTipoTesto(TypeInt32 value) {
        this.tipoTesto = value;
    }

    /**
     * Recupera il valore della proprietÓ visibile.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getVisibile() {
        return visibile;
    }

    /**
     * Imposta il valore della proprietÓ visibile.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setVisibile(TypeBooleano value) {
        this.visibile = value;
    }

    /**
     * Recupera il valore della proprietÓ visibileInPreventivo.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getVisibileInPreventivo() {
        return visibileInPreventivo;
    }

    /**
     * Imposta il valore della proprietÓ visibileInPreventivo.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setVisibileInPreventivo(TypeBooleano value) {
        this.visibileInPreventivo = value;
    }

}
