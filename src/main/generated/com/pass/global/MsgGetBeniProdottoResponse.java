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
 * <p>Classe Java per msgGetBeniProdottoResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="msgGetBeniProdottoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="elencoBeniProdotto" type="{http://rgi.it/WSPassPro}wsBeneProdotto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="multibene" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
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
@XmlType(name = "msgGetBeniProdottoResponse", propOrder = {
    "elencoBeniProdottos",
    "multibene",
    "serviceInfo"
})
public class MsgGetBeniProdottoResponse {

    @XmlElement(name = "elencoBeniProdotto", nillable = true)
    protected List<WsBeneProdotto> elencoBeniProdottos;
    protected TypeBooleano multibene;
    protected MsgResponseHeader serviceInfo;

    /**
     * Gets the value of the elencoBeniProdottos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elencoBeniProdottos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElencoBeniProdottos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsBeneProdotto }
     * 
     * 
     */
    public List<WsBeneProdotto> getElencoBeniProdottos() {
        if (elencoBeniProdottos == null) {
            elencoBeniProdottos = new ArrayList<WsBeneProdotto>();
        }
        return this.elencoBeniProdottos;
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
