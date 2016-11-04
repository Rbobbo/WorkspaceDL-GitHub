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
 * <p>Classe Java per wsIstanzaUnit complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsIstanzaUnit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clausole" type="{http://rgi.it/WSPassPro}wsClausola" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="codEccezione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codiceVerTariffa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errori" type="{http://rgi.it/WSPassPro}wsMessaggio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fattori" type="{http://rgi.it/WSPassPro}wsFattore" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://rgi.it/WSPassPro}typeInt64" minOccurs="0"/&gt;
 *         &lt;element name="idVerTariffa" type="{http://rgi.it/WSPassPro}typeInt64" minOccurs="0"/&gt;
 *         &lt;element name="premio" type="{http://rgi.it/WSPassPro}wsGruppoPremi" minOccurs="0"/&gt;
 *         &lt;element name="premioAdeguatoAlMinimo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="premioCalcolatoInferioreAlMinimo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="premioScontato" type="{http://rgi.it/WSPassPro}wsGruppoPremi" minOccurs="0"/&gt;
 *         &lt;element name="premioScontatoAdeguatoAlMinimo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="premioScontatoCalcolatoInferioreAlMinimo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="premiotariffa" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="scontoFlex" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="tipoPremioTariffa" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsIstanzaUnit", propOrder = {
    "clausoles",
    "codEccezione",
    "codiceVerTariffa",
    "erroris",
    "fattoris",
    "id",
    "idVerTariffa",
    "premio",
    "premioAdeguatoAlMinimo",
    "premioCalcolatoInferioreAlMinimo",
    "premioScontato",
    "premioScontatoAdeguatoAlMinimo",
    "premioScontatoCalcolatoInferioreAlMinimo",
    "premiotariffa",
    "scontoFlex",
    "tipoPremioTariffa"
})
public class WsIstanzaUnit {

    @XmlElement(name = "clausole", nillable = true)
    protected List<WsClausola> clausoles;
    protected String codEccezione;
    protected String codiceVerTariffa;
    @XmlElement(name = "errori", nillable = true)
    protected List<WsMessaggio> erroris;
    @XmlElement(name = "fattori", nillable = true)
    protected List<WsFattore> fattoris;
    @XmlElement(name = "ID")
    protected TypeInt64 id;
    protected TypeInt64 idVerTariffa;
    protected WsGruppoPremi premio;
    protected TypeBooleano premioAdeguatoAlMinimo;
    protected TypeBooleano premioCalcolatoInferioreAlMinimo;
    protected WsGruppoPremi premioScontato;
    protected TypeBooleano premioScontatoAdeguatoAlMinimo;
    protected TypeBooleano premioScontatoCalcolatoInferioreAlMinimo;
    protected TypeReal premiotariffa;
    protected TypeReal scontoFlex;
    protected TypeInt32 tipoPremioTariffa;

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
     * Recupera il valore della proprietà codEccezione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEccezione() {
        return codEccezione;
    }

    /**
     * Imposta il valore della proprietà codEccezione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEccezione(String value) {
        this.codEccezione = value;
    }

    /**
     * Recupera il valore della proprietà codiceVerTariffa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceVerTariffa() {
        return codiceVerTariffa;
    }

    /**
     * Imposta il valore della proprietà codiceVerTariffa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceVerTariffa(String value) {
        this.codiceVerTariffa = value;
    }

    /**
     * Gets the value of the erroris property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the erroris property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErroris().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsMessaggio }
     * 
     * 
     */
    public List<WsMessaggio> getErroris() {
        if (erroris == null) {
            erroris = new ArrayList<WsMessaggio>();
        }
        return this.erroris;
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
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt64 }
     *     
     */
    public TypeInt64 getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt64 }
     *     
     */
    public void setID(TypeInt64 value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà idVerTariffa.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt64 }
     *     
     */
    public TypeInt64 getIdVerTariffa() {
        return idVerTariffa;
    }

    /**
     * Imposta il valore della proprietà idVerTariffa.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt64 }
     *     
     */
    public void setIdVerTariffa(TypeInt64 value) {
        this.idVerTariffa = value;
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
     * Recupera il valore della proprietà premiotariffa.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getPremiotariffa() {
        return premiotariffa;
    }

    /**
     * Imposta il valore della proprietà premiotariffa.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setPremiotariffa(TypeReal value) {
        this.premiotariffa = value;
    }

    /**
     * Recupera il valore della proprietà scontoFlex.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getScontoFlex() {
        return scontoFlex;
    }

    /**
     * Imposta il valore della proprietà scontoFlex.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setScontoFlex(TypeReal value) {
        this.scontoFlex = value;
    }

    /**
     * Recupera il valore della proprietà tipoPremioTariffa.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getTipoPremioTariffa() {
        return tipoPremioTariffa;
    }

    /**
     * Imposta il valore della proprietà tipoPremioTariffa.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setTipoPremioTariffa(TypeInt32 value) {
        this.tipoPremioTariffa = value;
    }

}
