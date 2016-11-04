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
 * <p>Classe Java per msgCalcolaPremioResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="msgCalcolaPremioResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="istanzeBene" type="{http://rgi.it/WSPassPro}wsIstanzaBene" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="premio" type="{http://rgi.it/WSPassPro}wsGruppoPremi" minOccurs="0"/&gt;
 *         &lt;element name="premioAdeguatoAlMinimo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="premioCalcolatoInferioreAlMinimo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="premioScontato" type="{http://rgi.it/WSPassPro}wsGruppoPremi" minOccurs="0"/&gt;
 *         &lt;element name="premioScontatoAdeguatoAlMinimo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="premioScontatoCalcolatoInferioreAlMinimo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
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
@XmlType(name = "msgCalcolaPremioResponse", propOrder = {
    "istanzeBenes",
    "premio",
    "premioAdeguatoAlMinimo",
    "premioCalcolatoInferioreAlMinimo",
    "premioScontato",
    "premioScontatoAdeguatoAlMinimo",
    "premioScontatoCalcolatoInferioreAlMinimo",
    "serviceInfo"
})
public class MsgCalcolaPremioResponse {

    @XmlElement(name = "istanzeBene", nillable = true)
    protected List<WsIstanzaBene> istanzeBenes;
    protected WsGruppoPremi premio;
    protected TypeBooleano premioAdeguatoAlMinimo;
    protected TypeBooleano premioCalcolatoInferioreAlMinimo;
    protected WsGruppoPremi premioScontato;
    protected TypeBooleano premioScontatoAdeguatoAlMinimo;
    protected TypeBooleano premioScontatoCalcolatoInferioreAlMinimo;
    protected MsgResponseHeader serviceInfo;

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
