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
 * <p>Classe Java per wsAttivita complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsAttivita"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codLivello1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codLivello2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codLivello3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codLivello4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codPacchetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsAttivita", propOrder = {
    "codLivello1",
    "codLivello2",
    "codLivello3",
    "codLivello4",
    "codPacchetto"
})
public class WsAttivita {

    protected String codLivello1;
    protected String codLivello2;
    protected String codLivello3;
    protected String codLivello4;
    protected String codPacchetto;

    /**
     * Recupera il valore della proprietà codLivello1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLivello1() {
        return codLivello1;
    }

    /**
     * Imposta il valore della proprietà codLivello1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLivello1(String value) {
        this.codLivello1 = value;
    }

    /**
     * Recupera il valore della proprietà codLivello2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLivello2() {
        return codLivello2;
    }

    /**
     * Imposta il valore della proprietà codLivello2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLivello2(String value) {
        this.codLivello2 = value;
    }

    /**
     * Recupera il valore della proprietà codLivello3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLivello3() {
        return codLivello3;
    }

    /**
     * Imposta il valore della proprietà codLivello3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLivello3(String value) {
        this.codLivello3 = value;
    }

    /**
     * Recupera il valore della proprietà codLivello4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLivello4() {
        return codLivello4;
    }

    /**
     * Imposta il valore della proprietà codLivello4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLivello4(String value) {
        this.codLivello4 = value;
    }

    /**
     * Recupera il valore della proprietà codPacchetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPacchetto() {
        return codPacchetto;
    }

    /**
     * Imposta il valore della proprietà codPacchetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPacchetto(String value) {
        this.codPacchetto = value;
    }

}
