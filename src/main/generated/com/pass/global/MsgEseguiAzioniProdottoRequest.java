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
 * <p>Classe Java per msgEseguiAzioniProdottoRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="msgEseguiAzioniProdottoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adeguaAPremioMinimo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="applicaSconti" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="codLingua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codLivelloAzioni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="livelliAzioni" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="modalitaPreventivo" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="prodotto" type="{http://rgi.it/WSPassPro}wsProdotto" minOccurs="0"/&gt;
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
@XmlType(name = "msgEseguiAzioniProdottoRequest", propOrder = {
    "adeguaAPremioMinimo",
    "applicaSconti",
    "codLingua",
    "codLivelloAzioni",
    "livelliAzionis",
    "modalitaPreventivo",
    "prodotto",
    "serviceInfo"
})
public class MsgEseguiAzioniProdottoRequest {

    protected TypeBooleano adeguaAPremioMinimo;
    protected TypeBooleano applicaSconti;
    protected String codLingua;
    protected String codLivelloAzioni;
    @XmlElement(name = "livelliAzioni", nillable = true)
    protected List<String> livelliAzionis;
    protected TypeBooleano modalitaPreventivo;
    protected WsProdotto prodotto;
    protected MsgRequestHeader serviceInfo;

    /**
     * Recupera il valore della proprietà adeguaAPremioMinimo.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getAdeguaAPremioMinimo() {
        return adeguaAPremioMinimo;
    }

    /**
     * Imposta il valore della proprietà adeguaAPremioMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setAdeguaAPremioMinimo(TypeBooleano value) {
        this.adeguaAPremioMinimo = value;
    }

    /**
     * Recupera il valore della proprietà applicaSconti.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getApplicaSconti() {
        return applicaSconti;
    }

    /**
     * Imposta il valore della proprietà applicaSconti.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setApplicaSconti(TypeBooleano value) {
        this.applicaSconti = value;
    }

    /**
     * Recupera il valore della proprietà codLingua.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLingua() {
        return codLingua;
    }

    /**
     * Imposta il valore della proprietà codLingua.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLingua(String value) {
        this.codLingua = value;
    }

    /**
     * Recupera il valore della proprietà codLivelloAzioni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLivelloAzioni() {
        return codLivelloAzioni;
    }

    /**
     * Imposta il valore della proprietà codLivelloAzioni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLivelloAzioni(String value) {
        this.codLivelloAzioni = value;
    }

    /**
     * Gets the value of the livelliAzionis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the livelliAzionis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLivelliAzionis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLivelliAzionis() {
        if (livelliAzionis == null) {
            livelliAzionis = new ArrayList<String>();
        }
        return this.livelliAzionis;
    }

    /**
     * Recupera il valore della proprietà modalitaPreventivo.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getModalitaPreventivo() {
        return modalitaPreventivo;
    }

    /**
     * Imposta il valore della proprietà modalitaPreventivo.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setModalitaPreventivo(TypeBooleano value) {
        this.modalitaPreventivo = value;
    }

    /**
     * Recupera il valore della proprietà prodotto.
     * 
     * @return
     *     possible object is
     *     {@link WsProdotto }
     *     
     */
    public WsProdotto getProdotto() {
        return prodotto;
    }

    /**
     * Imposta il valore della proprietà prodotto.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProdotto }
     *     
     */
    public void setProdotto(WsProdotto value) {
        this.prodotto = value;
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
