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
 * <p>Classe Java per wsRischio complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsRischio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abilitazione" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="clausole" type="{http://rgi.it/WSPassPro}wsClausola" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="codgaranzia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codiceUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codiceVerTariffa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datatariffa" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descrizioneEst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descrizioneEstSezione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descrizioneSezione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errori" type="{http://rgi.it/WSPassPro}wsMessaggio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fattori" type="{http://rgi.it/WSPassPro}wsFattore" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="idVerTariffa" type="{http://rgi.it/WSPassPro}typeInt64" minOccurs="0"/&gt;
 *         &lt;element name="livelloDeroga" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="livelloVisibilita" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="maxIstanze" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="minIstanze" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="premio" type="{http://rgi.it/WSPassPro}wsGruppoPremi" minOccurs="0"/&gt;
 *         &lt;element name="premioAdeguatoAlMinimo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="premioCalcolatoInferioreAlMinimo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="premioScontato" type="{http://rgi.it/WSPassPro}wsGruppoPremi" minOccurs="0"/&gt;
 *         &lt;element name="premioScontatoAdeguatoAlMinimo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="premioScontatoCalcolatoInferioreAlMinimo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="premiotariffa" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="proprietaPersonalizzate" type="{http://rgi.it/WSPassPro}wsProprieta" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="scontoFlex" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="selezione" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="tacitoRinnovo" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="tipoPremioTariffa" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="unitInConvenzione" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="vita" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsRischio", propOrder = {
    "abilitazione",
    "clausoles",
    "codgaranzia",
    "codice",
    "codiceUnit",
    "codiceVerTariffa",
    "datatariffa",
    "descrizione",
    "descrizioneEst",
    "descrizioneEstSezione",
    "descrizioneSezione",
    "errore",
    "erroris",
    "fattoris",
    "idVerTariffa",
    "livelloDeroga",
    "livelloVisibilita",
    "maxIstanze",
    "minIstanze",
    "premio",
    "premioAdeguatoAlMinimo",
    "premioCalcolatoInferioreAlMinimo",
    "premioScontato",
    "premioScontatoAdeguatoAlMinimo",
    "premioScontatoCalcolatoInferioreAlMinimo",
    "premiotariffa",
    "proprietaPersonalizzates",
    "scontoFlex",
    "selezione",
    "tacitoRinnovo",
    "tipoPremioTariffa",
    "unitInConvenzione",
    "vita"
})
public class WsRischio {

    protected TypeBooleano abilitazione;
    @XmlElement(name = "clausole", nillable = true)
    protected List<WsClausola> clausoles;
    protected String codgaranzia;
    protected String codice;
    protected String codiceUnit;
    protected String codiceVerTariffa;
    protected TypeData datatariffa;
    protected String descrizione;
    protected String descrizioneEst;
    protected String descrizioneEstSezione;
    protected String descrizioneSezione;
    protected String errore;
    @XmlElement(name = "errori", nillable = true)
    protected List<WsMessaggio> erroris;
    @XmlElement(name = "fattori", nillable = true)
    protected List<WsFattore> fattoris;
    protected TypeInt64 idVerTariffa;
    protected TypeInt32 livelloDeroga;
    protected TypeInt32 livelloVisibilita;
    protected TypeInt32 maxIstanze;
    protected TypeInt32 minIstanze;
    protected WsGruppoPremi premio;
    protected TypeBooleano premioAdeguatoAlMinimo;
    protected TypeBooleano premioCalcolatoInferioreAlMinimo;
    protected WsGruppoPremi premioScontato;
    protected TypeBooleano premioScontatoAdeguatoAlMinimo;
    protected TypeBooleano premioScontatoCalcolatoInferioreAlMinimo;
    protected TypeReal premiotariffa;
    @XmlElement(name = "proprietaPersonalizzate", nillable = true)
    protected List<WsProprieta> proprietaPersonalizzates;
    protected TypeReal scontoFlex;
    protected TypeBooleano selezione;
    protected TypeInt32 tacitoRinnovo;
    protected TypeInt32 tipoPremioTariffa;
    protected TypeBooleano unitInConvenzione;
    protected TypeBooleano vita;

    /**
     * Recupera il valore della proprietà abilitazione.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getAbilitazione() {
        return abilitazione;
    }

    /**
     * Imposta il valore della proprietà abilitazione.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setAbilitazione(TypeBooleano value) {
        this.abilitazione = value;
    }

    /**
     * Gets the value of the clausoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clausoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClausoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsClausola }
     * 
     * 
     */
    public List<WsClausola> getClausoles() {
        if (clausoles == null) {
            clausoles = new ArrayList<WsClausola>();
        }
        return this.clausoles;
    }

    /**
     * Recupera il valore della proprietà codgaranzia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodgaranzia() {
        return codgaranzia;
    }

    /**
     * Imposta il valore della proprietà codgaranzia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodgaranzia(String value) {
        this.codgaranzia = value;
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
     * Recupera il valore della proprietà codiceUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceUnit() {
        return codiceUnit;
    }

    /**
     * Imposta il valore della proprietà codiceUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceUnit(String value) {
        this.codiceUnit = value;
    }

    /**
     * Recupera il valore della proprietà codiceVerTariffa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceVerTariffa() {
        return codiceVerTariffa;
    }

    /**
     * Imposta il valore della proprietà codiceVerTariffa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceVerTariffa(String value) {
        this.codiceVerTariffa = value;
    }

    /**
     * Recupera il valore della proprietà datatariffa.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getDatatariffa() {
        return datatariffa;
    }

    /**
     * Imposta il valore della proprietà datatariffa.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setDatatariffa(TypeData value) {
        this.datatariffa = value;
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
     * Recupera il valore della proprietà descrizioneEst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneEst() {
        return descrizioneEst;
    }

    /**
     * Imposta il valore della proprietà descrizioneEst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneEst(String value) {
        this.descrizioneEst = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneEstSezione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneEstSezione() {
        return descrizioneEstSezione;
    }

    /**
     * Imposta il valore della proprietà descrizioneEstSezione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneEstSezione(String value) {
        this.descrizioneEstSezione = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneSezione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneSezione() {
        return descrizioneSezione;
    }

    /**
     * Imposta il valore della proprietà descrizioneSezione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneSezione(String value) {
        this.descrizioneSezione = value;
    }

    /**
     * Recupera il valore della proprietà errore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrore() {
        return errore;
    }

    /**
     * Imposta il valore della proprietà errore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrore(String value) {
        this.errore = value;
    }

    /**
     * Gets the value of the erroris property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the erroris property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErroris().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsMessaggio }
     * 
     * 
     */
    public List<WsMessaggio> getErroris() {
        if (erroris == null) {
            erroris = new ArrayList<WsMessaggio>();
        }
        return this.erroris;
    }

    /**
     * Gets the value of the fattoris property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fattoris property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFattoris().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsFattore }
     * 
     * 
     */
    public List<WsFattore> getFattoris() {
        if (fattoris == null) {
            fattoris = new ArrayList<WsFattore>();
        }
        return this.fattoris;
    }

    /**
     * Recupera il valore della proprietà idVerTariffa.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt64 }
     *     
     */
    public TypeInt64 getIdVerTariffa() {
        return idVerTariffa;
    }

    /**
     * Imposta il valore della proprietà idVerTariffa.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt64 }
     *     
     */
    public void setIdVerTariffa(TypeInt64 value) {
        this.idVerTariffa = value;
    }

    /**
     * Recupera il valore della proprietà livelloDeroga.
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
     * Imposta il valore della proprietà livelloDeroga.
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
     * Recupera il valore della proprietà maxIstanze.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMaxIstanze() {
        return maxIstanze;
    }

    /**
     * Imposta il valore della proprietà maxIstanze.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMaxIstanze(TypeInt32 value) {
        this.maxIstanze = value;
    }

    /**
     * Recupera il valore della proprietà minIstanze.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMinIstanze() {
        return minIstanze;
    }

    /**
     * Imposta il valore della proprietà minIstanze.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMinIstanze(TypeInt32 value) {
        this.minIstanze = value;
    }

    /**
     * Recupera il valore della proprietà premio.
     * 
     * @return
     *     possible object is
     *     {@link WsGruppoPremi }
     *     
     */
    public WsGruppoPremi getPremio() {
        return premio;
    }

    /**
     * Imposta il valore della proprietà premio.
     * 
     * @param value
     *     allowed object is
     *     {@link WsGruppoPremi }
     *     
     */
    public void setPremio(WsGruppoPremi value) {
        this.premio = value;
    }

    /**
     * Recupera il valore della proprietà premioAdeguatoAlMinimo.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getPremioAdeguatoAlMinimo() {
        return premioAdeguatoAlMinimo;
    }

    /**
     * Imposta il valore della proprietà premioAdeguatoAlMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setPremioAdeguatoAlMinimo(TypeBooleano value) {
        this.premioAdeguatoAlMinimo = value;
    }

    /**
     * Recupera il valore della proprietà premioCalcolatoInferioreAlMinimo.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getPremioCalcolatoInferioreAlMinimo() {
        return premioCalcolatoInferioreAlMinimo;
    }

    /**
     * Imposta il valore della proprietà premioCalcolatoInferioreAlMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setPremioCalcolatoInferioreAlMinimo(TypeBooleano value) {
        this.premioCalcolatoInferioreAlMinimo = value;
    }

    /**
     * Recupera il valore della proprietà premioScontato.
     * 
     * @return
     *     possible object is
     *     {@link WsGruppoPremi }
     *     
     */
    public WsGruppoPremi getPremioScontato() {
        return premioScontato;
    }

    /**
     * Imposta il valore della proprietà premioScontato.
     * 
     * @param value
     *     allowed object is
     *     {@link WsGruppoPremi }
     *     
     */
    public void setPremioScontato(WsGruppoPremi value) {
        this.premioScontato = value;
    }

    /**
     * Recupera il valore della proprietà premioScontatoAdeguatoAlMinimo.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getPremioScontatoAdeguatoAlMinimo() {
        return premioScontatoAdeguatoAlMinimo;
    }

    /**
     * Imposta il valore della proprietà premioScontatoAdeguatoAlMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setPremioScontatoAdeguatoAlMinimo(TypeBooleano value) {
        this.premioScontatoAdeguatoAlMinimo = value;
    }

    /**
     * Recupera il valore della proprietà premioScontatoCalcolatoInferioreAlMinimo.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getPremioScontatoCalcolatoInferioreAlMinimo() {
        return premioScontatoCalcolatoInferioreAlMinimo;
    }

    /**
     * Imposta il valore della proprietà premioScontatoCalcolatoInferioreAlMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setPremioScontatoCalcolatoInferioreAlMinimo(TypeBooleano value) {
        this.premioScontatoCalcolatoInferioreAlMinimo = value;
    }

    /**
     * Recupera il valore della proprietà premiotariffa.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getPremiotariffa() {
        return premiotariffa;
    }

    /**
     * Imposta il valore della proprietà premiotariffa.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setPremiotariffa(TypeReal value) {
        this.premiotariffa = value;
    }

    /**
     * Gets the value of the proprietaPersonalizzates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proprietaPersonalizzates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProprietaPersonalizzates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsProprieta }
     * 
     * 
     */
    public List<WsProprieta> getProprietaPersonalizzates() {
        if (proprietaPersonalizzates == null) {
            proprietaPersonalizzates = new ArrayList<WsProprieta>();
        }
        return this.proprietaPersonalizzates;
    }

    /**
     * Recupera il valore della proprietà scontoFlex.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getScontoFlex() {
        return scontoFlex;
    }

    /**
     * Imposta il valore della proprietà scontoFlex.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setScontoFlex(TypeReal value) {
        this.scontoFlex = value;
    }

    /**
     * Recupera il valore della proprietà selezione.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getSelezione() {
        return selezione;
    }

    /**
     * Imposta il valore della proprietà selezione.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setSelezione(TypeBooleano value) {
        this.selezione = value;
    }

    /**
     * Recupera il valore della proprietà tacitoRinnovo.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getTacitoRinnovo() {
        return tacitoRinnovo;
    }

    /**
     * Imposta il valore della proprietà tacitoRinnovo.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setTacitoRinnovo(TypeInt32 value) {
        this.tacitoRinnovo = value;
    }

    /**
     * Recupera il valore della proprietà tipoPremioTariffa.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getTipoPremioTariffa() {
        return tipoPremioTariffa;
    }

    /**
     * Imposta il valore della proprietà tipoPremioTariffa.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setTipoPremioTariffa(TypeInt32 value) {
        this.tipoPremioTariffa = value;
    }

    /**
     * Recupera il valore della proprietà unitInConvenzione.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getUnitInConvenzione() {
        return unitInConvenzione;
    }

    /**
     * Imposta il valore della proprietà unitInConvenzione.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setUnitInConvenzione(TypeBooleano value) {
        this.unitInConvenzione = value;
    }

    /**
     * Recupera il valore della proprietà vita.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getVita() {
        return vita;
    }

    /**
     * Imposta il valore della proprietà vita.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setVita(TypeBooleano value) {
        this.vita = value;
    }

}
