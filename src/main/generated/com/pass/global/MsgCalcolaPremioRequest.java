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
 * <p>Classe Java per msgCalcolaPremioRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="msgCalcolaPremioRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adeguaAPremioMinimo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="applicaSconti" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="attivita" type="{http://rgi.it/WSPassPro}wsAttivita" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="clausole" type="{http://rgi.it/WSPassPro}wsClausola" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="codBene" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codConvenzione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codDivisa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codFlex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codFrazionamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codLingua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codOperazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataFlex" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="dataImposta" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="durataAnno" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="durataPolizza" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="durataRata" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="esenteImposta" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="fattori" type="{http://rgi.it/WSPassPro}wsFattore" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="istanzeBene" type="{http://rgi.it/WSPassPro}wsIstanzaBene" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="livelloOperazione" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="livelloUtente" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="modalitaPreventivo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="modoCalcoloImposte" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="numistanzebene" type="{http://rgi.it/WSPassPro}typeInt64" minOccurs="0"/&gt;
 *         &lt;element name="prodottoIn" type="{http://rgi.it/WSPassPro}wsProdottoIn" minOccurs="0"/&gt;
 *         &lt;element name="rischi" type="{http://rgi.it/WSPassPro}wsRischio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="serviceInfo" type="{http://rgi.it/WSPassPro}msgRequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="usaImpostaAgevolata" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "msgCalcolaPremioRequest", propOrder = {
    "adeguaAPremioMinimo",
    "applicaSconti",
    "attivitas",
    "clausoles",
    "codBene",
    "codConvenzione",
    "codDivisa",
    "codFlex",
    "codFrazionamento",
    "codLingua",
    "codOperazione",
    "dataFlex",
    "dataImposta",
    "durataAnno",
    "durataPolizza",
    "durataRata",
    "esenteImposta",
    "fattoris",
    "istanzeBenes",
    "livelloOperazione",
    "livelloUtente",
    "modalitaPreventivo",
    "modoCalcoloImposte",
    "numistanzebene",
    "prodottoIn",
    "rischis",
    "serviceInfo",
    "usaImpostaAgevolata"
})
public class MsgCalcolaPremioRequest {

    protected TypeBooleano adeguaAPremioMinimo;
    protected TypeBooleano applicaSconti;
    @XmlElement(name = "attivita", nillable = true)
    protected List<WsAttivita> attivitas;
    @XmlElement(name = "clausole", nillable = true)
    protected List<WsClausola> clausoles;
    protected String codBene;
    protected String codConvenzione;
    protected String codDivisa;
    protected String codFlex;
    protected String codFrazionamento;
    protected String codLingua;
    protected String codOperazione;
    protected TypeData dataFlex;
    protected TypeData dataImposta;
    protected TypeInt32 durataAnno;
    protected TypeInt32 durataPolizza;
    protected TypeInt32 durataRata;
    protected TypeBooleano esenteImposta;
    @XmlElement(name = "fattori", nillable = true)
    protected List<WsFattore> fattoris;
    @XmlElement(name = "istanzeBene", nillable = true)
    protected List<WsIstanzaBene> istanzeBenes;
    protected TypeInt32 livelloOperazione;
    protected TypeInt32 livelloUtente;
    protected TypeBooleano modalitaPreventivo;
    protected TypeInt32 modoCalcoloImposte;
    protected TypeInt64 numistanzebene;
    protected WsProdottoIn prodottoIn;
    @XmlElement(name = "rischi", nillable = true)
    protected List<WsRischio> rischis;
    protected MsgRequestHeader serviceInfo;
    protected TypeBooleano usaImpostaAgevolata;

    /**
     * Recupera il valore della proprietà adeguaAPremioMinimo.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getAdeguaAPremioMinimo() {
        return adeguaAPremioMinimo;
    }

    /**
     * Imposta il valore della proprietà adeguaAPremioMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setAdeguaAPremioMinimo(TypeBooleano value) {
        this.adeguaAPremioMinimo = value;
    }

    /**
     * Recupera il valore della proprietà applicaSconti.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getApplicaSconti() {
        return applicaSconti;
    }

    /**
     * Imposta il valore della proprietà applicaSconti.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setApplicaSconti(TypeBooleano value) {
        this.applicaSconti = value;
    }

    /**
     * Gets the value of the attivitas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attivitas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttivitas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsAttivita }
     * 
     * 
     */
    public List<WsAttivita> getAttivitas() {
        if (attivitas == null) {
            attivitas = new ArrayList<WsAttivita>();
        }
        return this.attivitas;
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
     * Recupera il valore della proprietà codBene.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodBene() {
        return codBene;
    }

    /**
     * Imposta il valore della proprietà codBene.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodBene(String value) {
        this.codBene = value;
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
     * Recupera il valore della proprietà codLingua.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLingua() {
        return codLingua;
    }

    /**
     * Imposta il valore della proprietà codLingua.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLingua(String value) {
        this.codLingua = value;
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
     * Gets the value of the istanzeBenes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the istanzeBenes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIstanzeBenes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsIstanzaBene }
     * 
     * 
     */
    public List<WsIstanzaBene> getIstanzeBenes() {
        if (istanzeBenes == null) {
            istanzeBenes = new ArrayList<WsIstanzaBene>();
        }
        return this.istanzeBenes;
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
     * Recupera il valore della proprietà modalitaPreventivo.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getModalitaPreventivo() {
        return modalitaPreventivo;
    }

    /**
     * Imposta il valore della proprietà modalitaPreventivo.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setModalitaPreventivo(TypeBooleano value) {
        this.modalitaPreventivo = value;
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
     * Recupera il valore della proprietà numistanzebene.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt64 }
     *     
     */
    public TypeInt64 getNumistanzebene() {
        return numistanzebene;
    }

    /**
     * Imposta il valore della proprietà numistanzebene.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt64 }
     *     
     */
    public void setNumistanzebene(TypeInt64 value) {
        this.numistanzebene = value;
    }

    /**
     * Recupera il valore della proprietà prodottoIn.
     * 
     * @return
     *     possible object is
     *     {@link WsProdottoIn }
     *     
     */
    public WsProdottoIn getProdottoIn() {
        return prodottoIn;
    }

    /**
     * Imposta il valore della proprietà prodottoIn.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProdottoIn }
     *     
     */
    public void setProdottoIn(WsProdottoIn value) {
        this.prodottoIn = value;
    }

    /**
     * Gets the value of the rischis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rischis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRischis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsRischio }
     * 
     * 
     */
    public List<WsRischio> getRischis() {
        if (rischis == null) {
            rischis = new ArrayList<WsRischio>();
        }
        return this.rischis;
    }

    /**
     * Recupera il valore della proprietà serviceInfo.
     * 
     * @return
     *     possible object is
     *     {@link MsgRequestHeader }
     *     
     */
    public MsgRequestHeader getServiceInfo() {
        return serviceInfo;
    }

    /**
     * Imposta il valore della proprietà serviceInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRequestHeader }
     *     
     */
    public void setServiceInfo(MsgRequestHeader value) {
        this.serviceInfo = value;
    }

    /**
     * Recupera il valore della proprietà usaImpostaAgevolata.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getUsaImpostaAgevolata() {
        return usaImpostaAgevolata;
    }

    /**
     * Imposta il valore della proprietà usaImpostaAgevolata.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setUsaImpostaAgevolata(TypeBooleano value) {
        this.usaImpostaAgevolata = value;
    }

}
