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
 * <p>Classe Java per msgEseguiAzioniResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="msgEseguiAzioniResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clausoleBene" type="{http://rgi.it/WSPassPro}wsClausola" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="clausoleProdotto" type="{http://rgi.it/WSPassPro}wsClausola" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="istanzeBene" type="{http://rgi.it/WSPassPro}wsIstanzaBene" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "msgEseguiAzioniResponse", propOrder = {
    "clausoleBenes",
    "clausoleProdottos",
    "istanzeBenes",
    "serviceInfo"
})
public class MsgEseguiAzioniResponse {

    @XmlElement(name = "clausoleBene", nillable = true)
    protected List<WsClausola> clausoleBenes;
    @XmlElement(name = "clausoleProdotto", nillable = true)
    protected List<WsClausola> clausoleProdottos;
    @XmlElement(name = "istanzeBene", nillable = true)
    protected List<WsIstanzaBene> istanzeBenes;
    protected MsgResponseHeader serviceInfo;

    /**
     * Gets the value of the clausoleBenes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clausoleBenes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClausoleBenes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsClausola }
     * 
     * 
     */
    public List<WsClausola> getClausoleBenes() {
        if (clausoleBenes == null) {
            clausoleBenes = new ArrayList<WsClausola>();
        }
        return this.clausoleBenes;
    }

    /**
     * Gets the value of the clausoleProdottos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clausoleProdottos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClausoleProdottos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsClausola }
     * 
     * 
     */
    public List<WsClausola> getClausoleProdottos() {
        if (clausoleProdottos == null) {
            clausoleProdottos = new ArrayList<WsClausola>();
        }
        return this.clausoleProdottos;
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
