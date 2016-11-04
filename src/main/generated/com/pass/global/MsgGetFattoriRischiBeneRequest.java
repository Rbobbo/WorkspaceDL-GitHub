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
 * <p>Classe Java per msgGetFattoriRischiBeneRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="msgGetFattoriRischiBeneRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attivita" type="{http://rgi.it/WSPassPro}wsAttivita" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="clausole" type="{http://rgi.it/WSPassPro}wsClausola" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="codBene" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codConvenzione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codDivisa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codFrazionamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codLingua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codOperazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fattori" type="{http://rgi.it/WSPassPro}wsFattore" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="istanzeBene" type="{http://rgi.it/WSPassPro}wsIstanzaBene" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="livelloOperazione" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="livelloUtente" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="modalitaPreventivo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="prodottoIn" type="{http://rgi.it/WSPassPro}wsProdottoIn" minOccurs="0"/&gt;
 *         &lt;element name="rischi" type="{http://rgi.it/WSPassPro}wsRischio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="serviceInfo" type="{http://rgi.it/WSPassPro}msgRequestHeader" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "msgGetFattoriRischiBeneRequest", propOrder = {
    "attivitas",
    "clausoles",
    "codBene",
    "codConvenzione",
    "codDivisa",
    "codFrazionamento",
    "codLingua",
    "codOperazione",
    "fattoris",
    "istanzeBenes",
    "livelloOperazione",
    "livelloUtente",
    "modalitaPreventivo",
    "prodottoIn",
    "rischis",
    "serviceInfo"
})
public class MsgGetFattoriRischiBeneRequest {

    @XmlElement(name = "attivita", nillable = true)
    protected List<WsAttivita> attivitas;
    @XmlElement(name = "clausole", nillable = true)
    protected List<WsClausola> clausoles;
    protected String codBene;
    protected String codConvenzione;
    protected String codDivisa;
    protected String codFrazionamento;
    protected String codLingua;
    protected String codOperazione;
    @XmlElement(name = "fattori", nillable = true)
    protected List<WsFattore> fattoris;
    @XmlElement(name = "istanzeBene", nillable = true)
    protected List<WsIstanzaBene> istanzeBenes;
    protected TypeInt32 livelloOperazione;
    protected TypeInt32 livelloUtente;
    protected TypeBooleano modalitaPreventivo;
    protected WsProdottoIn prodottoIn;
    @XmlElement(name = "rischi", nillable = true)
    protected List<WsRischio> rischis;
    protected MsgRequestHeader serviceInfo;

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

}
