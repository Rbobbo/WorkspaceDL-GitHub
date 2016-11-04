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
 * <p>Classe Java per msgGetDatiTecniciRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="msgGetDatiTecniciRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codLingua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prodotto" type="{http://rgi.it/WSPassPro}wsProdotto" minOccurs="0"/&gt;
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
@XmlType(name = "msgGetDatiTecniciRequest", propOrder = {
    "codLingua",
    "prodotto",
    "serviceInfo"
})
public class MsgGetDatiTecniciRequest {

    protected String codLingua;
    protected WsProdotto prodotto;
    protected MsgRequestHeader serviceInfo;

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
     * Recupera il valore della proprietà prodotto.
     * 
     * @return
     *     possible object is
     *     {@link WsProdotto }
     *     
     */
    public WsProdotto getProdotto() {
        return prodotto;
    }

    /**
     * Imposta il valore della proprietà prodotto.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProdotto }
     *     
     */
    public void setProdotto(WsProdotto value) {
        this.prodotto = value;
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
