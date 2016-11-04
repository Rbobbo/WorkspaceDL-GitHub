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
 * <p>Classe Java per msgGetFattoriRischiBeneResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="msgGetFattoriRischiBeneResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fattoriBene" type="{http://rgi.it/WSPassPro}wsFattore" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fattoriProdotto" type="{http://rgi.it/WSPassPro}wsFattore" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="istanzeBene" type="{http://rgi.it/WSPassPro}wsIstanzaBene" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rischi" type="{http://rgi.it/WSPassPro}wsRischio" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "msgGetFattoriRischiBeneResponse", propOrder = {
    "fattoriBenes",
    "fattoriProdottos",
    "istanzeBenes",
    "rischis",
    "serviceInfo"
})
public class MsgGetFattoriRischiBeneResponse {

    @XmlElement(name = "fattoriBene", nillable = true)
    protected List<WsFattore> fattoriBenes;
    @XmlElement(name = "fattoriProdotto", nillable = true)
    protected List<WsFattore> fattoriProdottos;
    @XmlElement(name = "istanzeBene", nillable = true)
    protected List<WsIstanzaBene> istanzeBenes;
    @XmlElement(name = "rischi", nillable = true)
    protected List<WsRischio> rischis;
    protected MsgResponseHeader serviceInfo;

    /**
     * Gets the value of the fattoriBenes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fattoriBenes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFattoriBenes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsFattore }
     * 
     * 
     */
    public List<WsFattore> getFattoriBenes() {
        if (fattoriBenes == null) {
            fattoriBenes = new ArrayList<WsFattore>();
        }
        return this.fattoriBenes;
    }

    /**
     * Gets the value of the fattoriProdottos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fattoriProdottos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFattoriProdottos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsFattore }
     * 
     * 
     */
    public List<WsFattore> getFattoriProdottos() {
        if (fattoriProdottos == null) {
            fattoriProdottos = new ArrayList<WsFattore>();
        }
        return this.fattoriProdottos;
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
