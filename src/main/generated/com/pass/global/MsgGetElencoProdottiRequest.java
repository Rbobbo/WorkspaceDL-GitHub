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
 * <p>Classe Java per msgGetElencoProdottiRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="msgGetElencoProdottiRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codBene" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codCompagnia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codConvenzione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codGaranzia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codListino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataValidita" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
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
@XmlType(name = "msgGetElencoProdottiRequest", propOrder = {
    "codBene",
    "codCompagnia",
    "codConvenzione",
    "codGaranzia",
    "codListino",
    "codTarget",
    "dataValidita",
    "serviceInfo"
})
public class MsgGetElencoProdottiRequest {

    protected String codBene;
    protected String codCompagnia;
    protected String codConvenzione;
    protected String codGaranzia;
    protected String codListino;
    protected String codTarget;
    protected TypeData dataValidita;
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
     * Recupera il valore della proprietà codCompagnia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCompagnia() {
        return codCompagnia;
    }

    /**
     * Imposta il valore della proprietà codCompagnia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCompagnia(String value) {
        this.codCompagnia = value;
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
     * Recupera il valore della proprietà codGaranzia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodGaranzia() {
        return codGaranzia;
    }

    /**
     * Imposta il valore della proprietà codGaranzia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodGaranzia(String value) {
        this.codGaranzia = value;
    }

    /**
     * Recupera il valore della proprietà codListino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodListino() {
        return codListino;
    }

    /**
     * Imposta il valore della proprietà codListino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodListino(String value) {
        this.codListino = value;
    }

    /**
     * Recupera il valore della proprietà codTarget.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTarget() {
        return codTarget;
    }

    /**
     * Imposta il valore della proprietà codTarget.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTarget(String value) {
        this.codTarget = value;
    }

    /**
     * Recupera il valore della proprietà dataValidita.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getDataValidita() {
        return dataValidita;
    }

    /**
     * Imposta il valore della proprietà dataValidita.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setDataValidita(TypeData value) {
        this.dataValidita = value;
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
