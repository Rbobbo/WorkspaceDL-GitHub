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
 * <p>Classe Java per msgResponseHeader complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="msgResponseHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codiceErroreOccorso" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="descrizioneErroreOccorso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dettagliSullErroreOccorso" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eccezioneOccorsaSerializzata" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="erroreOccorso" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="executionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="logs" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="tipoErroreOccorso" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "msgResponseHeader", propOrder = {
    "codiceErroreOccorso",
    "descrizioneErroreOccorso",
    "dettagliSullErroreOccorsos",
    "eccezioneOccorsaSerializzata",
    "erroreOccorso",
    "executionId",
    "logs",
    "tipoErroreOccorso"
})
public class MsgResponseHeader {

    protected short codiceErroreOccorso;
    protected String descrizioneErroreOccorso;
    @XmlElement(name = "dettagliSullErroreOccorso", nillable = true)
    protected List<String> dettagliSullErroreOccorsos;
    protected byte[] eccezioneOccorsaSerializzata;
    protected boolean erroreOccorso;
    protected String executionId;
    protected byte[] logs;
    protected short tipoErroreOccorso;

    /**
     * Recupera il valore della proprietà codiceErroreOccorso.
     * 
     */
    public short getCodiceErroreOccorso() {
        return codiceErroreOccorso;
    }

    /**
     * Imposta il valore della proprietà codiceErroreOccorso.
     * 
     */
    public void setCodiceErroreOccorso(short value) {
        this.codiceErroreOccorso = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneErroreOccorso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneErroreOccorso() {
        return descrizioneErroreOccorso;
    }

    /**
     * Imposta il valore della proprietà descrizioneErroreOccorso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneErroreOccorso(String value) {
        this.descrizioneErroreOccorso = value;
    }

    /**
     * Gets the value of the dettagliSullErroreOccorsos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dettagliSullErroreOccorsos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDettagliSullErroreOccorsos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDettagliSullErroreOccorsos() {
        if (dettagliSullErroreOccorsos == null) {
            dettagliSullErroreOccorsos = new ArrayList<String>();
        }
        return this.dettagliSullErroreOccorsos;
    }

    /**
     * Recupera il valore della proprietà eccezioneOccorsaSerializzata.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEccezioneOccorsaSerializzata() {
        return eccezioneOccorsaSerializzata;
    }

    /**
     * Imposta il valore della proprietà eccezioneOccorsaSerializzata.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEccezioneOccorsaSerializzata(byte[] value) {
        this.eccezioneOccorsaSerializzata = value;
    }

    /**
     * Recupera il valore della proprietà erroreOccorso.
     * 
     */
    public boolean isErroreOccorso() {
        return erroreOccorso;
    }

    /**
     * Imposta il valore della proprietà erroreOccorso.
     * 
     */
    public void setErroreOccorso(boolean value) {
        this.erroreOccorso = value;
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
     * Recupera il valore della proprietà logs.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLogs() {
        return logs;
    }

    /**
     * Imposta il valore della proprietà logs.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLogs(byte[] value) {
        this.logs = value;
    }

    /**
     * Recupera il valore della proprietà tipoErroreOccorso.
     * 
     */
    public short getTipoErroreOccorso() {
        return tipoErroreOccorso;
    }

    /**
     * Imposta il valore della proprietà tipoErroreOccorso.
     * 
     */
    public void setTipoErroreOccorso(short value) {
        this.tipoErroreOccorso = value;
    }

}
