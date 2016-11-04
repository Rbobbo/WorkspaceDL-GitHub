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
 * <p>Classe Java per wsFattore complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsFattore"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="campi" type="{http://rgi.it/WSPassPro}wsCampoStruttura" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="classe" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="configurabile" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descrizioneEstesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dinamico" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="dipendente" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="fattoreApplicazione" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="formato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="helpFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indicizzazione" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="livelloDerogaListaValori" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="livelloVisibilita" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="modificabile" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="obbligatorio" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ordine" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="persistente" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SQL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="tipo" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="tipoparametro" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="valdefault" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valoreConvertito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valori" type="{http://rgi.it/WSPassPro}wsValoreLista" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="visibile" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="visibileInPreventivo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="visibilitaDinamica" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="visibilitaDinamicaInPrev" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsFattore", propOrder = {
    "campis",
    "classe",
    "codice",
    "configurabile",
    "descrizione",
    "descrizioneEstesa",
    "dinamico",
    "dipendente",
    "fattoreApplicazione",
    "formato",
    "helpFile",
    "indicizzazione",
    "livelloDerogaListaValori",
    "livelloVisibilita",
    "modificabile",
    "obbligatorio",
    "ordine",
    "persistente",
    "sql",
    "tipo",
    "tipoparametro",
    "valdefault",
    "valore",
    "valoreConvertito",
    "valoris",
    "visibile",
    "visibileInPreventivo",
    "visibilitaDinamica",
    "visibilitaDinamicaInPrev"
})
public class WsFattore {

    @XmlElement(name = "campi", nillable = true)
    protected List<WsCampoStruttura> campis;
    protected TypeInt32 classe;
    protected String codice;
    protected boolean configurabile;
    protected String descrizione;
    protected String descrizioneEstesa;
    protected TypeBooleano dinamico;
    protected TypeBooleano dipendente;
    protected boolean fattoreApplicazione;
    protected String formato;
    protected String helpFile;
    protected boolean indicizzazione;
    protected TypeInt32 livelloDerogaListaValori;
    protected TypeInt32 livelloVisibilita;
    protected boolean modificabile;
    protected boolean obbligatorio;
    protected TypeInt32 ordine;
    protected boolean persistente;
    @XmlElement(name = "SQL")
    protected boolean sql;
    protected TypeInt32 tipo;
    protected TypeInt32 tipoparametro;
    protected String valdefault;
    protected String valore;
    protected String valoreConvertito;
    @XmlElement(name = "valori", nillable = true)
    protected List<WsValoreLista> valoris;
    protected TypeBooleano visibile;
    protected TypeBooleano visibileInPreventivo;
    protected boolean visibilitaDinamica;
    protected boolean visibilitaDinamicaInPrev;

    /**
     * Gets the value of the campis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsCampoStruttura }
     * 
     * 
     */
    public List<WsCampoStruttura> getCampis() {
        if (campis == null) {
            campis = new ArrayList<WsCampoStruttura>();
        }
        return this.campis;
    }

    /**
     * Recupera il valore della proprietà classe.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getClasse() {
        return classe;
    }

    /**
     * Imposta il valore della proprietà classe.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setClasse(TypeInt32 value) {
        this.classe = value;
    }

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
     * Recupera il valore della proprietà configurabile.
     * 
     */
    public boolean isConfigurabile() {
        return configurabile;
    }

    /**
     * Imposta il valore della proprietà configurabile.
     * 
     */
    public void setConfigurabile(boolean value) {
        this.configurabile = value;
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
     * Recupera il valore della proprietà descrizioneEstesa.
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
     * Imposta il valore della proprietà descrizioneEstesa.
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
     * Recupera il valore della proprietà dinamico.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getDinamico() {
        return dinamico;
    }

    /**
     * Imposta il valore della proprietà dinamico.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setDinamico(TypeBooleano value) {
        this.dinamico = value;
    }

    /**
     * Recupera il valore della proprietà dipendente.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getDipendente() {
        return dipendente;
    }

    /**
     * Imposta il valore della proprietà dipendente.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setDipendente(TypeBooleano value) {
        this.dipendente = value;
    }

    /**
     * Recupera il valore della proprietà fattoreApplicazione.
     * 
     */
    public boolean isFattoreApplicazione() {
        return fattoreApplicazione;
    }

    /**
     * Imposta il valore della proprietà fattoreApplicazione.
     * 
     */
    public void setFattoreApplicazione(boolean value) {
        this.fattoreApplicazione = value;
    }

    /**
     * Recupera il valore della proprietà formato.
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
     * Imposta il valore della proprietà formato.
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
     * Recupera il valore della proprietà helpFile.
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
     * Imposta il valore della proprietà helpFile.
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
     * Recupera il valore della proprietà indicizzazione.
     * 
     */
    public boolean isIndicizzazione() {
        return indicizzazione;
    }

    /**
     * Imposta il valore della proprietà indicizzazione.
     * 
     */
    public void setIndicizzazione(boolean value) {
        this.indicizzazione = value;
    }

    /**
     * Recupera il valore della proprietà livelloDerogaListaValori.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getLivelloDerogaListaValori() {
        return livelloDerogaListaValori;
    }

    /**
     * Imposta il valore della proprietà livelloDerogaListaValori.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setLivelloDerogaListaValori(TypeInt32 value) {
        this.livelloDerogaListaValori = value;
    }

    /**
     * Recupera il valore della proprietà livelloVisibilita.
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
     * Imposta il valore della proprietà livelloVisibilita.
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
     * Recupera il valore della proprietà modificabile.
     * 
     */
    public boolean isModificabile() {
        return modificabile;
    }

    /**
     * Imposta il valore della proprietà modificabile.
     * 
     */
    public void setModificabile(boolean value) {
        this.modificabile = value;
    }

    /**
     * Recupera il valore della proprietà obbligatorio.
     * 
     */
    public boolean isObbligatorio() {
        return obbligatorio;
    }

    /**
     * Imposta il valore della proprietà obbligatorio.
     * 
     */
    public void setObbligatorio(boolean value) {
        this.obbligatorio = value;
    }

    /**
     * Recupera il valore della proprietà ordine.
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
     * Imposta il valore della proprietà ordine.
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
     * Recupera il valore della proprietà persistente.
     * 
     */
    public boolean isPersistente() {
        return persistente;
    }

    /**
     * Imposta il valore della proprietà persistente.
     * 
     */
    public void setPersistente(boolean value) {
        this.persistente = value;
    }

    /**
     * Recupera il valore della proprietà sql.
     * 
     */
    public boolean isSQL() {
        return sql;
    }

    /**
     * Imposta il valore della proprietà sql.
     * 
     */
    public void setSQL(boolean value) {
        this.sql = value;
    }

    /**
     * Recupera il valore della proprietà tipo.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getTipo() {
        return tipo;
    }

    /**
     * Imposta il valore della proprietà tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setTipo(TypeInt32 value) {
        this.tipo = value;
    }

    /**
     * Recupera il valore della proprietà tipoparametro.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getTipoparametro() {
        return tipoparametro;
    }

    /**
     * Imposta il valore della proprietà tipoparametro.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setTipoparametro(TypeInt32 value) {
        this.tipoparametro = value;
    }

    /**
     * Recupera il valore della proprietà valdefault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValdefault() {
        return valdefault;
    }

    /**
     * Imposta il valore della proprietà valdefault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValdefault(String value) {
        this.valdefault = value;
    }

    /**
     * Recupera il valore della proprietà valore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValore() {
        return valore;
    }

    /**
     * Imposta il valore della proprietà valore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValore(String value) {
        this.valore = value;
    }

    /**
     * Recupera il valore della proprietà valoreConvertito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValoreConvertito() {
        return valoreConvertito;
    }

    /**
     * Imposta il valore della proprietà valoreConvertito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValoreConvertito(String value) {
        this.valoreConvertito = value;
    }

    /**
     * Gets the value of the valoris property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valoris property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValoris().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsValoreLista }
     * 
     * 
     */
    public List<WsValoreLista> getValoris() {
        if (valoris == null) {
            valoris = new ArrayList<WsValoreLista>();
        }
        return this.valoris;
    }

    /**
     * Recupera il valore della proprietà visibile.
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
     * Imposta il valore della proprietà visibile.
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
     * Recupera il valore della proprietà visibileInPreventivo.
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
     * Imposta il valore della proprietà visibileInPreventivo.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setVisibileInPreventivo(TypeBooleano value) {
        this.visibileInPreventivo = value;
    }

    /**
     * Recupera il valore della proprietà visibilitaDinamica.
     * 
     */
    public boolean isVisibilitaDinamica() {
        return visibilitaDinamica;
    }

    /**
     * Imposta il valore della proprietà visibilitaDinamica.
     * 
     */
    public void setVisibilitaDinamica(boolean value) {
        this.visibilitaDinamica = value;
    }

    /**
     * Recupera il valore della proprietà visibilitaDinamicaInPrev.
     * 
     */
    public boolean isVisibilitaDinamicaInPrev() {
        return visibilitaDinamicaInPrev;
    }

    /**
     * Imposta il valore della proprietà visibilitaDinamicaInPrev.
     * 
     */
    public void setVisibilitaDinamicaInPrev(boolean value) {
        this.visibilitaDinamicaInPrev = value;
    }

}
