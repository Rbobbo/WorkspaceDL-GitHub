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
 * <p>Classe Java per msgRequestHeader complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="msgRequestHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="checkString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="context" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="executionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hostAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idPuntoVendita" type="{http://rgi.it/WSPassPro}typeInt64" minOccurs="0"/&gt;
 *         &lt;element name="livelloLog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="properties" type="{http://rgi.it/WSPassPro}typeProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rilanciaErrori" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "msgRequestHeader", propOrder = {
    "checkString",
    "context",
    "executionId",
    "hostAddress",
    "idPuntoVendita",
    "livelloLog",
    "locale",
    "properties",
    "rilanciaErrori",
    "timestamp",
    "username"
})
public class MsgRequestHeader {

    protected String checkString;
    protected String context;
    protected String executionId;
    protected String hostAddress;
    protected TypeInt64 idPuntoVendita;
    protected String livelloLog;
    protected String locale;
    @XmlElement(nillable = true)
    protected List<TypeProperty> properties;
    protected boolean rilanciaErrori;
    protected String timestamp;
    protected String username;

    /**
     * Recupera il valore della proprietà checkString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckString() {
        return checkString;
    }

    /**
     * Imposta il valore della proprietà checkString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckString(String value) {
        this.checkString = value;
    }

    /**
     * Recupera il valore della proprietà context.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Imposta il valore della proprietà context.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * Recupera il valore della proprietà executionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionId() {
        return executionId;
    }

    /**
     * Imposta il valore della proprietà executionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionId(String value) {
        this.executionId = value;
    }

    /**
     * Recupera il valore della proprietà hostAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostAddress() {
        return hostAddress;
    }

    /**
     * Imposta il valore della proprietà hostAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostAddress(String value) {
        this.hostAddress = value;
    }

    /**
     * Recupera il valore della proprietà idPuntoVendita.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt64 }
     *     
     */
    public TypeInt64 getIdPuntoVendita() {
        return idPuntoVendita;
    }

    /**
     * Imposta il valore della proprietà idPuntoVendita.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt64 }
     *     
     */
    public void setIdPuntoVendita(TypeInt64 value) {
        this.idPuntoVendita = value;
    }

    /**
     * Recupera il valore della proprietà livelloLog.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLivelloLog() {
        return livelloLog;
    }

    /**
     * Imposta il valore della proprietà livelloLog.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivelloLog(String value) {
        this.livelloLog = value;
    }

    /**
     * Recupera il valore della proprietà locale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Imposta il valore della proprietà locale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the properties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeProperty }
     * 
     * 
     */
    public List<TypeProperty> getProperties() {
        if (properties == null) {
            properties = new ArrayList<TypeProperty>();
        }
        return this.properties;
    }

    /**
     * Recupera il valore della proprietà rilanciaErrori.
     * 
     */
    public boolean isRilanciaErrori() {
        return rilanciaErrori;
    }

    /**
     * Imposta il valore della proprietà rilanciaErrori.
     * 
     */
    public void setRilanciaErrori(boolean value) {
        this.rilanciaErrori = value;
    }

    /**
     * Recupera il valore della proprietà timestamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Imposta il valore della proprietà timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Recupera il valore della proprietà username.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Imposta il valore della proprietà username.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}
