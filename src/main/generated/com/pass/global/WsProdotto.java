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
 * <p>Classe Java per wsProdotto complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsProdotto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beni" type="{http://rgi.it/WSPassPro}wsBene" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="clausole" type="{http://rgi.it/WSPassPro}wsClausola" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="codConvenzione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codDivisa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codFlex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codFrazionamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codOperazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codiceVersione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="convenzioni" type="{http://rgi.it/WSPassPro}wsConvenzione" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dataApertura" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="dataFineVersione" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="dataFlex" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="dataImposta" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="dataInizioVersione" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="defAnniPolizza" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="defGiorniPolizza" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="defMesiPolizza" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descrizioneEstesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="divise" type="{http://rgi.it/WSPassPro}wsDivisa" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="durataAnno" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="durataPolizza" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="durataRata" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="esenteImposta" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="fattori" type="{http://rgi.it/WSPassPro}wsFattore" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="frazionamenti" type="{http://rgi.it/WSPassPro}wsFrazionamento" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GGValiditaPreventivo" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="gestAppCert" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="impostaAgevolataAmmessa" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="indicizzazione" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="livelloDeroga" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="livelloOperazione" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="livelloUtente" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="maxAnniPolizza" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="maxGiorniPolizza" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="maxMesiPolizza" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="messaggi" type="{http://rgi.it/WSPassPro}wsMessaggio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="messaggiLivelli" type="{http://rgi.it/WSPassPro}wsLivelloAzione" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="minAnniPolizza" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="minGiorniPolizza" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="minMesiPolizza" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="modoCalcoloImposte" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="modoPremioMinimo" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="multibene" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="pacchettoAttivita" type="{http://rgi.it/WSPassPro}wsPacchettoAttivita" minOccurs="0"/&gt;
 *         &lt;element name="premio" type="{http://rgi.it/WSPassPro}wsGruppoPremi" minOccurs="0"/&gt;
 *         &lt;element name="premioAdeguatoAlMinimo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="premioCalcolatoInferioreAlMinimo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="premioMinimo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="premioScontato" type="{http://rgi.it/WSPassPro}wsGruppoPremi" minOccurs="0"/&gt;
 *         &lt;element name="premioScontatoAdeguatoAlMinimo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="premioScontatoCalcolatoInferioreAlMinimo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="quickquotation" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="regolazionePremio" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="secondoRischio" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="tacitoRinnovo" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="tipo" type="{http://rgi.it/WSPassPro}wsTipo" minOccurs="0"/&gt;
 *         &lt;element name="usoImpostaAgevolata" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="vincolo" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
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
@XmlType(name = "wsProdotto", propOrder = {
    "benis",
    "clausoles",
    "codConvenzione",
    "codDivisa",
    "codFlex",
    "codFrazionamento",
    "codOperazione",
    "codice",
    "codiceVersione",
    "convenzionis",
    "dataApertura",
    "dataFineVersione",
    "dataFlex",
    "dataImposta",
    "dataInizioVersione",
    "defAnniPolizza",
    "defGiorniPolizza",
    "defMesiPolizza",
    "descrizione",
    "descrizioneEstesa",
    "divises",
    "durataAnno",
    "durataPolizza",
    "durataRata",
    "esenteImposta",
    "fattoris",
    "frazionamentis",
    "ggValiditaPreventivo",
    "gestAppCert",
    "impostaAgevolataAmmessa",
    "indicizzazione",
    "livelloDeroga",
    "livelloOperazione",
    "livelloUtente",
    "maxAnniPolizza",
    "maxGiorniPolizza",
    "maxMesiPolizza",
    "messaggis",
    "messaggiLivellis",
    "minAnniPolizza",
    "minGiorniPolizza",
    "minMesiPolizza",
    "modoCalcoloImposte",
    "modoPremioMinimo",
    "multibene",
    "pacchettoAttivita",
    "premio",
    "premioAdeguatoAlMinimo",
    "premioCalcolatoInferioreAlMinimo",
    "premioMinimo",
    "premioScontato",
    "premioScontatoAdeguatoAlMinimo",
    "premioScontatoCalcolatoInferioreAlMinimo",
    "quickquotation",
    "regolazionePremio",
    "secondoRischio",
    "tacitoRinnovo",
    "tipo",
    "usoImpostaAgevolata",
    "vincolo",
    "vita"
})
public class WsProdotto {

    @XmlElement(name = "beni", nillable = true)
    protected List<WsBene> benis;
    @XmlElement(name = "clausole", nillable = true)
    protected List<WsClausola> clausoles;
    protected String codConvenzione;
    protected String codDivisa;
    protected String codFlex;
    protected String codFrazionamento;
    protected String codOperazione;
    protected String codice;
    protected String codiceVersione;
    @XmlElement(name = "convenzioni", nillable = true)
    protected List<WsConvenzione> convenzionis;
    protected TypeData dataApertura;
    protected TypeData dataFineVersione;
    protected TypeData dataFlex;
    protected TypeData dataImposta;
    protected TypeData dataInizioVersione;
    protected TypeInt32 defAnniPolizza;
    protected TypeInt32 defGiorniPolizza;
    protected TypeInt32 defMesiPolizza;
    protected String descrizione;
    protected String descrizioneEstesa;
    @XmlElement(name = "divise", nillable = true)
    protected List<WsDivisa> divises;
    protected TypeInt32 durataAnno;
    protected TypeInt32 durataPolizza;
    protected TypeInt32 durataRata;
    protected TypeBooleano esenteImposta;
    @XmlElement(name = "fattori", nillable = true)
    protected List<WsFattore> fattoris;
    @XmlElement(name = "frazionamenti", nillable = true)
    protected List<WsFrazionamento> frazionamentis;
    @XmlElement(name = "GGValiditaPreventivo")
    protected TypeInt32 ggValiditaPreventivo;
    protected TypeBooleano gestAppCert;
    protected TypeInt32 impostaAgevolataAmmessa;
    protected TypeInt32 indicizzazione;
    protected TypeInt32 livelloDeroga;
    protected TypeInt32 livelloOperazione;
    protected TypeInt32 livelloUtente;
    protected TypeInt32 maxAnniPolizza;
    protected TypeInt32 maxGiorniPolizza;
    protected TypeInt32 maxMesiPolizza;
    @XmlElement(name = "messaggi", nillable = true)
    protected List<WsMessaggio> messaggis;
    @XmlElement(name = "messaggiLivelli", nillable = true)
    protected List<WsLivelloAzione> messaggiLivellis;
    protected TypeInt32 minAnniPolizza;
    protected TypeInt32 minGiorniPolizza;
    protected TypeInt32 minMesiPolizza;
    protected TypeInt32 modoCalcoloImposte;
    protected TypeInt32 modoPremioMinimo;
    protected TypeBooleano multibene;
    protected WsPacchettoAttivita pacchettoAttivita;
    protected WsGruppoPremi premio;
    protected TypeBooleano premioAdeguatoAlMinimo;
    protected TypeBooleano premioCalcolatoInferioreAlMinimo;
    protected double premioMinimo;
    protected WsGruppoPremi premioScontato;
    protected TypeBooleano premioScontatoAdeguatoAlMinimo;
    protected TypeBooleano premioScontatoCalcolatoInferioreAlMinimo;
    protected TypeBooleano quickquotation;
    protected TypeInt32 regolazionePremio;
    protected TypeInt32 secondoRischio;
    protected TypeInt32 tacitoRinnovo;
    protected WsTipo tipo;
    protected TypeBooleano usoImpostaAgevolata;
    protected TypeInt32 vincolo;
    protected TypeBooleano vita;

    /**
     * Gets the value of the benis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the benis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBenis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsBene }
     * 
     * 
     */
    public List<WsBene> getBenis() {
        if (benis == null) {
            benis = new ArrayList<WsBene>();
        }
        return this.benis;
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
     * Recupera il valore della proprietà codConvenzione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodConvenzione() {
        return codConvenzione;
    }

    /**
     * Imposta il valore della proprietà codConvenzione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodConvenzione(String value) {
        this.codConvenzione = value;
    }

    /**
     * Recupera il valore della proprietà codDivisa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDivisa() {
        return codDivisa;
    }

    /**
     * Imposta il valore della proprietà codDivisa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDivisa(String value) {
        this.codDivisa = value;
    }

    /**
     * Recupera il valore della proprietà codFlex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodFlex() {
        return codFlex;
    }

    /**
     * Imposta il valore della proprietà codFlex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodFlex(String value) {
        this.codFlex = value;
    }

    /**
     * Recupera il valore della proprietà codFrazionamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodFrazionamento() {
        return codFrazionamento;
    }

    /**
     * Imposta il valore della proprietà codFrazionamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodFrazionamento(String value) {
        this.codFrazionamento = value;
    }

    /**
     * Recupera il valore della proprietà codOperazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOperazione() {
        return codOperazione;
    }

    /**
     * Imposta il valore della proprietà codOperazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOperazione(String value) {
        this.codOperazione = value;
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
     * Recupera il valore della proprietà codiceVersione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceVersione() {
        return codiceVersione;
    }

    /**
     * Imposta il valore della proprietà codiceVersione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceVersione(String value) {
        this.codiceVersione = value;
    }

    /**
     * Gets the value of the convenzionis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the convenzionis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConvenzionis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsConvenzione }
     * 
     * 
     */
    public List<WsConvenzione> getConvenzionis() {
        if (convenzionis == null) {
            convenzionis = new ArrayList<WsConvenzione>();
        }
        return this.convenzionis;
    }

    /**
     * Recupera il valore della proprietà dataApertura.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getDataApertura() {
        return dataApertura;
    }

    /**
     * Imposta il valore della proprietà dataApertura.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setDataApertura(TypeData value) {
        this.dataApertura = value;
    }

    /**
     * Recupera il valore della proprietà dataFineVersione.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getDataFineVersione() {
        return dataFineVersione;
    }

    /**
     * Imposta il valore della proprietà dataFineVersione.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setDataFineVersione(TypeData value) {
        this.dataFineVersione = value;
    }

    /**
     * Recupera il valore della proprietà dataFlex.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getDataFlex() {
        return dataFlex;
    }

    /**
     * Imposta il valore della proprietà dataFlex.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setDataFlex(TypeData value) {
        this.dataFlex = value;
    }

    /**
     * Recupera il valore della proprietà dataImposta.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getDataImposta() {
        return dataImposta;
    }

    /**
     * Imposta il valore della proprietà dataImposta.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setDataImposta(TypeData value) {
        this.dataImposta = value;
    }

    /**
     * Recupera il valore della proprietà dataInizioVersione.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getDataInizioVersione() {
        return dataInizioVersione;
    }

    /**
     * Imposta il valore della proprietà dataInizioVersione.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setDataInizioVersione(TypeData value) {
        this.dataInizioVersione = value;
    }

    /**
     * Recupera il valore della proprietà defAnniPolizza.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getDefAnniPolizza() {
        return defAnniPolizza;
    }

    /**
     * Imposta il valore della proprietà defAnniPolizza.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setDefAnniPolizza(TypeInt32 value) {
        this.defAnniPolizza = value;
    }

    /**
     * Recupera il valore della proprietà defGiorniPolizza.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getDefGiorniPolizza() {
        return defGiorniPolizza;
    }

    /**
     * Imposta il valore della proprietà defGiorniPolizza.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setDefGiorniPolizza(TypeInt32 value) {
        this.defGiorniPolizza = value;
    }

    /**
     * Recupera il valore della proprietà defMesiPolizza.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getDefMesiPolizza() {
        return defMesiPolizza;
    }

    /**
     * Imposta il valore della proprietà defMesiPolizza.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setDefMesiPolizza(TypeInt32 value) {
        this.defMesiPolizza = value;
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
     * Gets the value of the divises property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the divises property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDivises().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsDivisa }
     * 
     * 
     */
    public List<WsDivisa> getDivises() {
        if (divises == null) {
            divises = new ArrayList<WsDivisa>();
        }
        return this.divises;
    }

    /**
     * Recupera il valore della proprietà durataAnno.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getDurataAnno() {
        return durataAnno;
    }

    /**
     * Imposta il valore della proprietà durataAnno.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setDurataAnno(TypeInt32 value) {
        this.durataAnno = value;
    }

    /**
     * Recupera il valore della proprietà durataPolizza.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getDurataPolizza() {
        return durataPolizza;
    }

    /**
     * Imposta il valore della proprietà durataPolizza.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setDurataPolizza(TypeInt32 value) {
        this.durataPolizza = value;
    }

    /**
     * Recupera il valore della proprietà durataRata.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getDurataRata() {
        return durataRata;
    }

    /**
     * Imposta il valore della proprietà durataRata.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setDurataRata(TypeInt32 value) {
        this.durataRata = value;
    }

    /**
     * Recupera il valore della proprietà esenteImposta.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getEsenteImposta() {
        return esenteImposta;
    }

    /**
     * Imposta il valore della proprietà esenteImposta.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setEsenteImposta(TypeBooleano value) {
        this.esenteImposta = value;
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
     * Gets the value of the frazionamentis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frazionamentis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrazionamentis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsFrazionamento }
     * 
     * 
     */
    public List<WsFrazionamento> getFrazionamentis() {
        if (frazionamentis == null) {
            frazionamentis = new ArrayList<WsFrazionamento>();
        }
        return this.frazionamentis;
    }

    /**
     * Recupera il valore della proprietà ggValiditaPreventivo.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getGGValiditaPreventivo() {
        return ggValiditaPreventivo;
    }

    /**
     * Imposta il valore della proprietà ggValiditaPreventivo.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setGGValiditaPreventivo(TypeInt32 value) {
        this.ggValiditaPreventivo = value;
    }

    /**
     * Recupera il valore della proprietà gestAppCert.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getGestAppCert() {
        return gestAppCert;
    }

    /**
     * Imposta il valore della proprietà gestAppCert.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setGestAppCert(TypeBooleano value) {
        this.gestAppCert = value;
    }

    /**
     * Recupera il valore della proprietà impostaAgevolataAmmessa.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getImpostaAgevolataAmmessa() {
        return impostaAgevolataAmmessa;
    }

    /**
     * Imposta il valore della proprietà impostaAgevolataAmmessa.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setImpostaAgevolataAmmessa(TypeInt32 value) {
        this.impostaAgevolataAmmessa = value;
    }

    /**
     * Recupera il valore della proprietà indicizzazione.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getIndicizzazione() {
        return indicizzazione;
    }

    /**
     * Imposta il valore della proprietà indicizzazione.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setIndicizzazione(TypeInt32 value) {
        this.indicizzazione = value;
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
     * Recupera il valore della proprietà livelloOperazione.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getLivelloOperazione() {
        return livelloOperazione;
    }

    /**
     * Imposta il valore della proprietà livelloOperazione.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setLivelloOperazione(TypeInt32 value) {
        this.livelloOperazione = value;
    }

    /**
     * Recupera il valore della proprietà livelloUtente.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getLivelloUtente() {
        return livelloUtente;
    }

    /**
     * Imposta il valore della proprietà livelloUtente.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setLivelloUtente(TypeInt32 value) {
        this.livelloUtente = value;
    }

    /**
     * Recupera il valore della proprietà maxAnniPolizza.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMaxAnniPolizza() {
        return maxAnniPolizza;
    }

    /**
     * Imposta il valore della proprietà maxAnniPolizza.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMaxAnniPolizza(TypeInt32 value) {
        this.maxAnniPolizza = value;
    }

    /**
     * Recupera il valore della proprietà maxGiorniPolizza.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMaxGiorniPolizza() {
        return maxGiorniPolizza;
    }

    /**
     * Imposta il valore della proprietà maxGiorniPolizza.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMaxGiorniPolizza(TypeInt32 value) {
        this.maxGiorniPolizza = value;
    }

    /**
     * Recupera il valore della proprietà maxMesiPolizza.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMaxMesiPolizza() {
        return maxMesiPolizza;
    }

    /**
     * Imposta il valore della proprietà maxMesiPolizza.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMaxMesiPolizza(TypeInt32 value) {
        this.maxMesiPolizza = value;
    }

    /**
     * Gets the value of the messaggis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messaggis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessaggis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsMessaggio }
     * 
     * 
     */
    public List<WsMessaggio> getMessaggis() {
        if (messaggis == null) {
            messaggis = new ArrayList<WsMessaggio>();
        }
        return this.messaggis;
    }

    /**
     * Gets the value of the messaggiLivellis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messaggiLivellis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessaggiLivellis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsLivelloAzione }
     * 
     * 
     */
    public List<WsLivelloAzione> getMessaggiLivellis() {
        if (messaggiLivellis == null) {
            messaggiLivellis = new ArrayList<WsLivelloAzione>();
        }
        return this.messaggiLivellis;
    }

    /**
     * Recupera il valore della proprietà minAnniPolizza.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMinAnniPolizza() {
        return minAnniPolizza;
    }

    /**
     * Imposta il valore della proprietà minAnniPolizza.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMinAnniPolizza(TypeInt32 value) {
        this.minAnniPolizza = value;
    }

    /**
     * Recupera il valore della proprietà minGiorniPolizza.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMinGiorniPolizza() {
        return minGiorniPolizza;
    }

    /**
     * Imposta il valore della proprietà minGiorniPolizza.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMinGiorniPolizza(TypeInt32 value) {
        this.minGiorniPolizza = value;
    }

    /**
     * Recupera il valore della proprietà minMesiPolizza.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMinMesiPolizza() {
        return minMesiPolizza;
    }

    /**
     * Imposta il valore della proprietà minMesiPolizza.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMinMesiPolizza(TypeInt32 value) {
        this.minMesiPolizza = value;
    }

    /**
     * Recupera il valore della proprietà modoCalcoloImposte.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getModoCalcoloImposte() {
        return modoCalcoloImposte;
    }

    /**
     * Imposta il valore della proprietà modoCalcoloImposte.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setModoCalcoloImposte(TypeInt32 value) {
        this.modoCalcoloImposte = value;
    }

    /**
     * Recupera il valore della proprietà modoPremioMinimo.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getModoPremioMinimo() {
        return modoPremioMinimo;
    }

    /**
     * Imposta il valore della proprietà modoPremioMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setModoPremioMinimo(TypeInt32 value) {
        this.modoPremioMinimo = value;
    }

    /**
     * Recupera il valore della proprietà multibene.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getMultibene() {
        return multibene;
    }

    /**
     * Imposta il valore della proprietà multibene.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setMultibene(TypeBooleano value) {
        this.multibene = value;
    }

    /**
     * Recupera il valore della proprietà pacchettoAttivita.
     * 
     * @return
     *     possible object is
     *     {@link WsPacchettoAttivita }
     *     
     */
    public WsPacchettoAttivita getPacchettoAttivita() {
        return pacchettoAttivita;
    }

    /**
     * Imposta il valore della proprietà pacchettoAttivita.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPacchettoAttivita }
     *     
     */
    public void setPacchettoAttivita(WsPacchettoAttivita value) {
        this.pacchettoAttivita = value;
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
     * Recupera il valore della proprietà premioMinimo.
     * 
     */
    public double getPremioMinimo() {
        return premioMinimo;
    }

    /**
     * Imposta il valore della proprietà premioMinimo.
     * 
     */
    public void setPremioMinimo(double value) {
        this.premioMinimo = value;
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
     * Recupera il valore della proprietà quickquotation.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getQuickquotation() {
        return quickquotation;
    }

    /**
     * Imposta il valore della proprietà quickquotation.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setQuickquotation(TypeBooleano value) {
        this.quickquotation = value;
    }

    /**
     * Recupera il valore della proprietà regolazionePremio.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getRegolazionePremio() {
        return regolazionePremio;
    }

    /**
     * Imposta il valore della proprietà regolazionePremio.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setRegolazionePremio(TypeInt32 value) {
        this.regolazionePremio = value;
    }

    /**
     * Recupera il valore della proprietà secondoRischio.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getSecondoRischio() {
        return secondoRischio;
    }

    /**
     * Imposta il valore della proprietà secondoRischio.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setSecondoRischio(TypeInt32 value) {
        this.secondoRischio = value;
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
     * Recupera il valore della proprietà tipo.
     * 
     * @return
     *     possible object is
     *     {@link WsTipo }
     *     
     */
    public WsTipo getTipo() {
        return tipo;
    }

    /**
     * Imposta il valore della proprietà tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link WsTipo }
     *     
     */
    public void setTipo(WsTipo value) {
        this.tipo = value;
    }

    /**
     * Recupera il valore della proprietà usoImpostaAgevolata.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getUsoImpostaAgevolata() {
        return usoImpostaAgevolata;
    }

    /**
     * Imposta il valore della proprietà usoImpostaAgevolata.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setUsoImpostaAgevolata(TypeBooleano value) {
        this.usoImpostaAgevolata = value;
    }

    /**
     * Recupera il valore della proprietà vincolo.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getVincolo() {
        return vincolo;
    }

    /**
     * Imposta il valore della proprietà vincolo.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setVincolo(TypeInt32 value) {
        this.vincolo = value;
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
