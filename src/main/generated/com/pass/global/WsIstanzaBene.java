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
 * <p>Classe Java per wsIstanzaBene complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsIstanzaBene"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attivita" type="{http://rgi.it/WSPassPro}wsAttivita" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="clausole" type="{http://rgi.it/WSPassPro}wsClausola" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="codiceBene" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fattori" type="{http://rgi.it/WSPassPro}wsFattore" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://rgi.it/WSPassPro}typeInt64" minOccurs="0"/&gt;
 *         &lt;element name="messaggi" type="{http://rgi.it/WSPassPro}wsMessaggio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="messaggiLivelli" type="{http://rgi.it/WSPassPro}wsLivelloAzione" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rischi" type="{http://rgi.it/WSPassPro}wsRischio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sezioni" type="{http://rgi.it/WSPassPro}wsSezioneBene" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsIstanzaBene", propOrder = {
    "attivitas",
    "clausoles",
    "codiceBene",
    "fattoris",
    "id",
    "messaggis",
    "messaggiLivellis",
    "rischis",
    "sezionis"
})
public class WsIstanzaBene {

    @XmlElement(name = "attivita", nillable = true)
    protected List<WsAttivita> attivitas;
    @XmlElement(name = "clausole", nillable = true)
    protected List<WsClausola> clausoles;
    protected String codiceBene;
    @XmlElement(name = "fattori", nillable = true)
    protected List<WsFattore> fattoris;
    @XmlElement(name = "ID")
    protected TypeInt64 id;
    @XmlElement(name = "messaggi", nillable = true)
    protected List<WsMessaggio> messaggis;
    @XmlElement(name = "messaggiLivelli", nillable = true)
    protected List<WsLivelloAzione> messaggiLivellis;
    @XmlElement(name = "rischi", nillable = true)
    protected List<WsRischio> rischis;
    @XmlElement(name = "sezioni", nillable = true)
    protected List<WsSezioneBene> sezionis;

    /**
     * Gets the value of the attivitas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attivitas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttivitas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsAttivita }
     * 
     * 
     */
    public List<WsAttivita> getAttivitas() {
        if (attivitas == null) {
            attivitas = new ArrayList<WsAttivita>();
        }
        return this.attivitas;
    }

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
     * Recupera il valore della proprietà codiceBene.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceBene() {
        return codiceBene;
    }

    /**
     * Imposta il valore della proprietà codiceBene.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceBene(String value) {
        this.codiceBene = value;
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
     * Gets the value of the messaggis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messaggis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessaggis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsMessaggio }
     * 
     * 
     */
    public List<WsMessaggio> getMessaggis() {
        if (messaggis == null) {
            messaggis = new ArrayList<WsMessaggio>();
        }
        return this.messaggis;
    }

    /**
     * Gets the value of the messaggiLivellis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messaggiLivellis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessaggiLivellis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsLivelloAzione }
     * 
     * 
     */
    public List<WsLivelloAzione> getMessaggiLivellis() {
        if (messaggiLivellis == null) {
            messaggiLivellis = new ArrayList<WsLivelloAzione>();
        }
        return this.messaggiLivellis;
    }

    /**
     * Gets the value of the rischis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rischis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRischis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsRischio }
     * 
     * 
     */
    public List<WsRischio> getRischis() {
        if (rischis == null) {
            rischis = new ArrayList<WsRischio>();
        }
        return this.rischis;
    }

    /**
     * Gets the value of the sezionis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sezionis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSezionis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsSezioneBene }
     * 
     * 
     */
    public List<WsSezioneBene> getSezionis() {
        if (sezionis == null) {
            sezionis = new ArrayList<WsSezioneBene>();
        }
        return this.sezionis;
    }

}
