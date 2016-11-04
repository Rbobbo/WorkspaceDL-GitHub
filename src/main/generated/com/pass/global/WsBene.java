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
 * <p>Classe Java per wsBene complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsBene"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attivitaMax" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="attivitaMin" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="codTipoVeicoloANIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="condInAnagrafeGen" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="conducentiMax" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="conducentiMin" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ereditaIstanze" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="istanze" type="{http://rgi.it/WSPassPro}wsIstanzaBene" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="maxIstanze" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="minIstanze" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="modoPrimoIndirizzo" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="modoPrimoSoggetto" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="pacchettoAttivita" type="{http://rgi.it/WSPassPro}wsPacchettoAttivita" minOccurs="0"/&gt;
 *         &lt;element name="preventivabile" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="prioritaRecupero" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="propInAnagrafeGen" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="proprietariMax" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="proprietariMin" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="soggettiMax" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="soggettiMin" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="tipo" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="ubicazioniMax" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="ubicazioniMin" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsBene", propOrder = {
    "attivitaMax",
    "attivitaMin",
    "codTipoVeicoloANIA",
    "codice",
    "condInAnagrafeGen",
    "conducentiMax",
    "conducentiMin",
    "descrizione",
    "ereditaIstanze",
    "istanzes",
    "maxIstanze",
    "minIstanze",
    "modoPrimoIndirizzo",
    "modoPrimoSoggetto",
    "pacchettoAttivita",
    "preventivabile",
    "prioritaRecupero",
    "propInAnagrafeGen",
    "proprietariMax",
    "proprietariMin",
    "soggettiMax",
    "soggettiMin",
    "tipo",
    "ubicazioniMax",
    "ubicazioniMin"
})
public class WsBene {

    protected TypeInt32 attivitaMax;
    protected TypeInt32 attivitaMin;
    protected String codTipoVeicoloANIA;
    protected String codice;
    protected TypeBooleano condInAnagrafeGen;
    protected TypeInt32 conducentiMax;
    protected TypeInt32 conducentiMin;
    protected String descrizione;
    protected TypeInt32 ereditaIstanze;
    @XmlElement(name = "istanze", nillable = true)
    protected List<WsIstanzaBene> istanzes;
    protected TypeInt32 maxIstanze;
    protected TypeInt32 minIstanze;
    protected TypeInt32 modoPrimoIndirizzo;
    protected TypeInt32 modoPrimoSoggetto;
    protected WsPacchettoAttivita pacchettoAttivita;
    protected TypeBooleano preventivabile;
    protected TypeInt32 prioritaRecupero;
    protected TypeBooleano propInAnagrafeGen;
    protected TypeInt32 proprietariMax;
    protected TypeInt32 proprietariMin;
    protected TypeInt32 soggettiMax;
    protected TypeInt32 soggettiMin;
    protected TypeInt32 tipo;
    protected TypeInt32 ubicazioniMax;
    protected TypeInt32 ubicazioniMin;

    /**
     * Recupera il valore della propriet� attivitaMax.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getAttivitaMax() {
        return attivitaMax;
    }

    /**
     * Imposta il valore della propriet� attivitaMax.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setAttivitaMax(TypeInt32 value) {
        this.attivitaMax = value;
    }

    /**
     * Recupera il valore della propriet� attivitaMin.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getAttivitaMin() {
        return attivitaMin;
    }

    /**
     * Imposta il valore della propriet� attivitaMin.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setAttivitaMin(TypeInt32 value) {
        this.attivitaMin = value;
    }

    /**
     * Recupera il valore della propriet� codTipoVeicoloANIA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoVeicoloANIA() {
        return codTipoVeicoloANIA;
    }

    /**
     * Imposta il valore della propriet� codTipoVeicoloANIA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoVeicoloANIA(String value) {
        this.codTipoVeicoloANIA = value;
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
     * Recupera il valore della propriet� condInAnagrafeGen.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getCondInAnagrafeGen() {
        return condInAnagrafeGen;
    }

    /**
     * Imposta il valore della propriet� condInAnagrafeGen.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setCondInAnagrafeGen(TypeBooleano value) {
        this.condInAnagrafeGen = value;
    }

    /**
     * Recupera il valore della propriet� conducentiMax.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getConducentiMax() {
        return conducentiMax;
    }

    /**
     * Imposta il valore della propriet� conducentiMax.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setConducentiMax(TypeInt32 value) {
        this.conducentiMax = value;
    }

    /**
     * Recupera il valore della propriet� conducentiMin.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getConducentiMin() {
        return conducentiMin;
    }

    /**
     * Imposta il valore della propriet� conducentiMin.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setConducentiMin(TypeInt32 value) {
        this.conducentiMin = value;
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
     * Recupera il valore della propriet� ereditaIstanze.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getEreditaIstanze() {
        return ereditaIstanze;
    }

    /**
     * Imposta il valore della propriet� ereditaIstanze.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setEreditaIstanze(TypeInt32 value) {
        this.ereditaIstanze = value;
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
     * {@link WsIstanzaBene }
     * 
     * 
     */
    public List<WsIstanzaBene> getIstanzes() {
        if (istanzes == null) {
            istanzes = new ArrayList<WsIstanzaBene>();
        }
        return this.istanzes;
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
     * Recupera il valore della propriet� modoPrimoIndirizzo.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getModoPrimoIndirizzo() {
        return modoPrimoIndirizzo;
    }

    /**
     * Imposta il valore della propriet� modoPrimoIndirizzo.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setModoPrimoIndirizzo(TypeInt32 value) {
        this.modoPrimoIndirizzo = value;
    }

    /**
     * Recupera il valore della propriet� modoPrimoSoggetto.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getModoPrimoSoggetto() {
        return modoPrimoSoggetto;
    }

    /**
     * Imposta il valore della propriet� modoPrimoSoggetto.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setModoPrimoSoggetto(TypeInt32 value) {
        this.modoPrimoSoggetto = value;
    }

    /**
     * Recupera il valore della propriet� pacchettoAttivita.
     * 
     * @return
     *     possible object is
     *     {@link WsPacchettoAttivita }
     *     
     */
    public WsPacchettoAttivita getPacchettoAttivita() {
        return pacchettoAttivita;
    }

    /**
     * Imposta il valore della propriet� pacchettoAttivita.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPacchettoAttivita }
     *     
     */
    public void setPacchettoAttivita(WsPacchettoAttivita value) {
        this.pacchettoAttivita = value;
    }

    /**
     * Recupera il valore della propriet� preventivabile.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getPreventivabile() {
        return preventivabile;
    }

    /**
     * Imposta il valore della propriet� preventivabile.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setPreventivabile(TypeBooleano value) {
        this.preventivabile = value;
    }

    /**
     * Recupera il valore della propriet� prioritaRecupero.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getPrioritaRecupero() {
        return prioritaRecupero;
    }

    /**
     * Imposta il valore della propriet� prioritaRecupero.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setPrioritaRecupero(TypeInt32 value) {
        this.prioritaRecupero = value;
    }

    /**
     * Recupera il valore della propriet� propInAnagrafeGen.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getPropInAnagrafeGen() {
        return propInAnagrafeGen;
    }

    /**
     * Imposta il valore della propriet� propInAnagrafeGen.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setPropInAnagrafeGen(TypeBooleano value) {
        this.propInAnagrafeGen = value;
    }

    /**
     * Recupera il valore della propriet� proprietariMax.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getProprietariMax() {
        return proprietariMax;
    }

    /**
     * Imposta il valore della propriet� proprietariMax.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setProprietariMax(TypeInt32 value) {
        this.proprietariMax = value;
    }

    /**
     * Recupera il valore della propriet� proprietariMin.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getProprietariMin() {
        return proprietariMin;
    }

    /**
     * Imposta il valore della propriet� proprietariMin.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setProprietariMin(TypeInt32 value) {
        this.proprietariMin = value;
    }

    /**
     * Recupera il valore della propriet� soggettiMax.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getSoggettiMax() {
        return soggettiMax;
    }

    /**
     * Imposta il valore della propriet� soggettiMax.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setSoggettiMax(TypeInt32 value) {
        this.soggettiMax = value;
    }

    /**
     * Recupera il valore della propriet� soggettiMin.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getSoggettiMin() {
        return soggettiMin;
    }

    /**
     * Imposta il valore della propriet� soggettiMin.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setSoggettiMin(TypeInt32 value) {
        this.soggettiMin = value;
    }

    /**
     * Recupera il valore della propriet� tipo.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getTipo() {
        return tipo;
    }

    /**
     * Imposta il valore della propriet� tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setTipo(TypeInt32 value) {
        this.tipo = value;
    }

    /**
     * Recupera il valore della propriet� ubicazioniMax.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getUbicazioniMax() {
        return ubicazioniMax;
    }

    /**
     * Imposta il valore della propriet� ubicazioniMax.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setUbicazioniMax(TypeInt32 value) {
        this.ubicazioniMax = value;
    }

    /**
     * Recupera il valore della propriet� ubicazioniMin.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getUbicazioniMin() {
        return ubicazioniMin;
    }

    /**
     * Imposta il valore della propriet� ubicazioniMin.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setUbicazioniMin(TypeInt32 value) {
        this.ubicazioniMin = value;
    }

}
