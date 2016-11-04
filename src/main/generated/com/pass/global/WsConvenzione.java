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
 * <p>Classe Java per wsConvenzione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsConvenzione"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codListinoFlessibilita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codListinoFlessibilita2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codListinoProvvigioni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coeffSconto" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="comportamentoRinnovo" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="dataRiferimentoTariffa" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descrizioneEstesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="premioMinimo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsConvenzione", propOrder = {
    "codListinoFlessibilita",
    "codListinoFlessibilita2",
    "codListinoProvvigioni",
    "codice",
    "coeffSconto",
    "comportamentoRinnovo",
    "dataRiferimentoTariffa",
    "descrizione",
    "descrizioneEstesa",
    "premioMinimo"
})
public class WsConvenzione {

    protected String codListinoFlessibilita;
    protected String codListinoFlessibilita2;
    protected String codListinoProvvigioni;
    protected String codice;
    protected double coeffSconto;
    protected TypeInt32 comportamentoRinnovo;
    protected TypeData dataRiferimentoTariffa;
    protected String descrizione;
    protected String descrizioneEstesa;
    protected double premioMinimo;

    /**
     * Recupera il valore della proprietà codListinoFlessibilita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodListinoFlessibilita() {
        return codListinoFlessibilita;
    }

    /**
     * Imposta il valore della proprietà codListinoFlessibilita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodListinoFlessibilita(String value) {
        this.codListinoFlessibilita = value;
    }

    /**
     * Recupera il valore della proprietà codListinoFlessibilita2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodListinoFlessibilita2() {
        return codListinoFlessibilita2;
    }

    /**
     * Imposta il valore della proprietà codListinoFlessibilita2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodListinoFlessibilita2(String value) {
        this.codListinoFlessibilita2 = value;
    }

    /**
     * Recupera il valore della proprietà codListinoProvvigioni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodListinoProvvigioni() {
        return codListinoProvvigioni;
    }

    /**
     * Imposta il valore della proprietà codListinoProvvigioni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodListinoProvvigioni(String value) {
        this.codListinoProvvigioni = value;
    }

    /**
     * Recupera il valore della proprietà codice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodice() {
        return codice;
    }

    /**
     * Imposta il valore della proprietà codice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodice(String value) {
        this.codice = value;
    }

    /**
     * Recupera il valore della proprietà coeffSconto.
     * 
     */
    public double getCoeffSconto() {
        return coeffSconto;
    }

    /**
     * Imposta il valore della proprietà coeffSconto.
     * 
     */
    public void setCoeffSconto(double value) {
        this.coeffSconto = value;
    }

    /**
     * Recupera il valore della proprietà comportamentoRinnovo.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getComportamentoRinnovo() {
        return comportamentoRinnovo;
    }

    /**
     * Imposta il valore della proprietà comportamentoRinnovo.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setComportamentoRinnovo(TypeInt32 value) {
        this.comportamentoRinnovo = value;
    }

    /**
     * Recupera il valore della proprietà dataRiferimentoTariffa.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getDataRiferimentoTariffa() {
        return dataRiferimentoTariffa;
    }

    /**
     * Imposta il valore della proprietà dataRiferimentoTariffa.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setDataRiferimentoTariffa(TypeData value) {
        this.dataRiferimentoTariffa = value;
    }

    /**
     * Recupera il valore della proprietà descrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Imposta il valore della proprietà descrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneEstesa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneEstesa() {
        return descrizioneEstesa;
    }

    /**
     * Imposta il valore della proprietà descrizioneEstesa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneEstesa(String value) {
        this.descrizioneEstesa = value;
    }

    /**
     * Recupera il valore della proprietà premioMinimo.
     * 
     */
    public double getPremioMinimo() {
        return premioMinimo;
    }

    /**
     * Imposta il valore della proprietà premioMinimo.
     * 
     */
    public void setPremioMinimo(double value) {
        this.premioMinimo = value;
    }

}
