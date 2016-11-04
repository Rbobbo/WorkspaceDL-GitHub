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
 * <p>Classe Java per msgGetRischiBeneRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="msgGetRischiBeneRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codBene" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codConvenzione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codLingua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="livelloOperazione" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="livelloUtente" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="prodottoIn" type="{http://rgi.it/WSPassPro}wsProdottoIn" minOccurs="0"/&gt;
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
@XmlType(name = "msgGetRischiBeneRequest", propOrder = {
    "codBene",
    "codConvenzione",
    "codLingua",
    "livelloOperazione",
    "livelloUtente",
    "prodottoIn",
    "serviceInfo"
})
public class MsgGetRischiBeneRequest {

    protected String codBene;
    protected String codConvenzione;
    protected String codLingua;
    protected TypeInt32 livelloOperazione;
    protected TypeInt32 livelloUtente;
    protected WsProdottoIn prodottoIn;
    protected MsgRequestHeader serviceInfo;

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
