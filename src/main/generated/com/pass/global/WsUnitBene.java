//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
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
 * <p>Classe Java per wsUnitBene complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsUnitBene"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abilitazione" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="codgaranzia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codiceRischio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datatariffa" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descrizioneEst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="istanze" type="{http://rgi.it/WSPassPro}wsIstanzaUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="livelloDeroga" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="livelloVisibilita" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="maxIstanze" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="minIstanze" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="ordine" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="proprietaPersonalizzate" type="{http://rgi.it/WSPassPro}wsProprieta" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="selezione" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="tacitoRinnovo" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="unitInConvenzione" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="vita" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsUnitBene", propOrder = {
    "abilitazione",
    "codgaranzia",
    "codice",
    "codiceRischio",
    "datatariffa",
    "descrizione",
    "descrizioneEst",
    "istanzes",
    "livelloDeroga",
    "livelloVisibilita",
    "maxIstanze",
    "minIstanze",
    "ordine",
    "proprietaPersonalizzates",
    "selezione",
    "tacitoRinnovo",
    "unitInConvenzione",
    "vita"
})
public class WsUnitBene {

    protected TypeBooleano abilitazione;
    protected String codgaranzia;
    protected String codice;
    protected String codiceRischio;
    protected TypeData datatariffa;
    protected String descrizione;
    protected String descrizioneEst;
    @XmlElement(name = "istanze", nillable = true)
    protected List<WsIstanzaUnit> istanzes;
    protected TypeInt32 livelloDeroga;
    protected TypeInt32 livelloVisibilita;
    protected TypeInt32 maxIstanze;
    protected TypeInt32 minIstanze;
    protected TypeInt32 ordine;
    @XmlElement(name = "proprietaPersonalizzate", nillable = true)
    protected List<WsProprieta> proprietaPersonalizzates;
    protected TypeBooleano selezione;
    protected TypeInt32 tacitoRinnovo;
    protected TypeBooleano unitInConvenzione;
    protected TypeBooleano vita;

    /**
     * Recupera il valore della propriet� abilitazione.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getAbilitazione() {
        return abilitazione;
    }

    /**
     * Imposta il valore della propriet� abilitazione.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setAbilitazione(TypeBooleano value) {
        this.abilitazione = value;
    }

    /**
     * Recupera il valore della propriet� codgaranzia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodgaranzia() {
        return codgaranzia;
    }

    /**
     * Imposta il valore della propriet� codgaranzia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodgaranzia(String value) {
        this.codgaranzia = value;
    }

    /**
     * Recupera il valore della propriet� codice.
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
     * Imposta il valore della propriet� codice.
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
     * Recupera il valore della propriet� codiceRischio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceRischio() {
        return codiceRischio;
    }

    /**
     * Imposta il valore della propriet� codiceRischio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceRischio(String value) {
        this.codiceRischio = value;
    }

    /**
     * Recupera il valore della propriet� datatariffa.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getDatatariffa() {
        return datatariffa;
    }

    /**
     * Imposta il valore della propriet� datatariffa.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setDatatariffa(TypeData value) {
        this.datatariffa = value;
    }

    /**
     * Recupera il valore della propriet� descrizione.
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
     * Imposta il valore della propriet� descrizione.
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
     * Recupera il valore della propriet� descrizioneEst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneEst() {
        return descrizioneEst;
    }

    /**
     * Imposta il valore della propriet� descrizioneEst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneEst(String value) {
        this.descrizioneEst = value;
    }

    /**
     * Gets the value of the istanzes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the istanzes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIstanzes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsIstanzaUnit }
     * 
     * 
     */
    public List<WsIstanzaUnit> getIstanzes() {
        if (istanzes == null) {
            istanzes = new ArrayList<WsIstanzaUnit>();
        }
        return this.istanzes;
    }

    /**
     * Recupera il valore della propriet� livelloDeroga.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getLivelloDeroga() {
        return livelloDeroga;
    }

    /**
     * Imposta il valore della propriet� livelloDeroga.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setLivelloDeroga(TypeInt32 value) {
        this.livelloDeroga = value;
    }

    /**
     * Recupera il valore della propriet� livelloVisibilita.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getLivelloVisibilita() {
        return livelloVisibilita;
    }

    /**
     * Imposta il valore della propriet� livelloVisibilita.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setLivelloVisibilita(TypeInt32 value) {
        this.livelloVisibilita = value;
    }

    /**
     * Recupera il valore della propriet� maxIstanze.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMaxIstanze() {
        return maxIstanze;
    }

    /**
     * Imposta il valore della propriet� maxIstanze.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMaxIstanze(TypeInt32 value) {
        this.maxIstanze = value;
    }

    /**
     * Recupera il valore della propriet� minIstanze.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMinIstanze() {
        return minIstanze;
    }

    /**
     * Imposta il valore della propriet� minIstanze.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMinIstanze(TypeInt32 value) {
        this.minIstanze = value;
    }

    /**
     * Recupera il valore della propriet� ordine.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getOrdine() {
        return ordine;
    }

    /**
     * Imposta il valore della propriet� ordine.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setOrdine(TypeInt32 value) {
        this.ordine = value;
    }

    /**
     * Gets the value of the proprietaPersonalizzates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proprietaPersonalizzates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProprietaPersonalizzates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsProprieta }
     * 
     * 
     */
    public List<WsProprieta> getProprietaPersonalizzates() {
        if (proprietaPersonalizzates == null) {
            proprietaPersonalizzates = new ArrayList<WsProprieta>();
        }
        return this.proprietaPersonalizzates;
    }

    /**
     * Recupera il valore della propriet� selezione.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getSelezione() {
        return selezione;
    }

    /**
     * Imposta il valore della propriet� selezione.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setSelezione(TypeBooleano value) {
        this.selezione = value;
    }

    /**
     * Recupera il valore della propriet� tacitoRinnovo.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getTacitoRinnovo() {
        return tacitoRinnovo;
    }

    /**
     * Imposta il valore della propriet� tacitoRinnovo.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setTacitoRinnovo(TypeInt32 value) {
        this.tacitoRinnovo = value;
    }

    /**
     * Recupera il valore della propriet� unitInConvenzione.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getUnitInConvenzione() {
        return unitInConvenzione;
    }

    /**
     * Imposta il valore della propriet� unitInConvenzione.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setUnitInConvenzione(TypeBooleano value) {
        this.unitInConvenzione = value;
    }

    /**
     * Recupera il valore della propriet� vita.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getVita() {
        return vita;
    }

    /**
     * Imposta il valore della propriet� vita.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setVita(TypeBooleano value) {
        this.vita = value;
    }

}
