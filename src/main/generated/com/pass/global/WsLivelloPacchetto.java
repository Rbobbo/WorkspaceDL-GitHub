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
 * <p>Classe Java per wsLivelloPacchetto complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsLivelloPacchetto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codLivello" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="elencoAttivita" type="{http://rgi.it/WSPassPro}wsEntitaAttivita" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="entita" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsLivelloPacchetto", propOrder = {
    "codLivello",
    "descrizione",
    "elencoAttivitas",
    "entita",
    "id"
})
public class WsLivelloPacchetto {

    protected String codLivello;
    protected String descrizione;
    @XmlElement(name = "elencoAttivita", nillable = true)
    protected List<WsEntitaAttivita> elencoAttivitas;
    protected TypeInt32 entita;
    @XmlElement(name = "ID")
    protected TypeInt32 id;

    /**
     * Recupera il valore della proprietà codLivello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLivello() {
        return codLivello;
    }

    /**
     * Imposta il valore della proprietà codLivello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLivello(String value) {
        this.codLivello = value;
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
     * Gets the value of the elencoAttivitas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elencoAttivitas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElencoAttivitas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsEntitaAttivita }
     * 
     * 
     */
    public List<WsEntitaAttivita> getElencoAttivitas() {
        if (elencoAttivitas == null) {
            elencoAttivitas = new ArrayList<WsEntitaAttivita>();
        }
        return this.elencoAttivitas;
    }

    /**
     * Recupera il valore della proprietà entita.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getEntita() {
        return entita;
    }

    /**
     * Imposta il valore della proprietà entita.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setEntita(TypeInt32 value) {
        this.entita = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setID(TypeInt32 value) {
        this.id = value;
    }

}
