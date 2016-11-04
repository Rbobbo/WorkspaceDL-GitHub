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
 * <p>Classe Java per msgGetLogicaSelezioneGaranzieJSProdottoResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="msgGetLogicaSelezioneGaranzieJSProdottoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="htmlTestPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jscontainer" type="{http://rgi.it/WSPassPro}wsJsContainer" minOccurs="0"/&gt;
 *         &lt;element name="serviceInfo" type="{http://rgi.it/WSPassPro}msgResponseHeader" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "msgGetLogicaSelezioneGaranzieJSProdottoResponse", propOrder = {
    "htmlTestPage",
    "jscontainer",
    "serviceInfo"
})
public class MsgGetLogicaSelezioneGaranzieJSProdottoResponse {

    protected String htmlTestPage;
    protected WsJsContainer jscontainer;
    protected MsgResponseHeader serviceInfo;

    /**
     * Recupera il valore della proprietà htmlTestPage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlTestPage() {
        return htmlTestPage;
    }

    /**
     * Imposta il valore della proprietà htmlTestPage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlTestPage(String value) {
        this.htmlTestPage = value;
    }

    /**
     * Recupera il valore della proprietà jscontainer.
     * 
     * @return
     *     possible object is
     *     {@link WsJsContainer }
     *     
     */
    public WsJsContainer getJscontainer() {
        return jscontainer;
    }

    /**
     * Imposta il valore della proprietà jscontainer.
     * 
     * @param value
     *     allowed object is
     *     {@link WsJsContainer }
     *     
     */
    public void setJscontainer(WsJsContainer value) {
        this.jscontainer = value;
    }

    /**
     * Recupera il valore della proprietà serviceInfo.
     * 
     * @return
     *     possible object is
     *     {@link MsgResponseHeader }
     *     
     */
    public MsgResponseHeader getServiceInfo() {
        return serviceInfo;
    }

    /**
     * Imposta il valore della proprietà serviceInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgResponseHeader }
     *     
     */
    public void setServiceInfo(MsgResponseHeader value) {
        this.serviceInfo = value;
    }

}
