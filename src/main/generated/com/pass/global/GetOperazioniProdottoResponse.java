//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.11.03 alle 09:31:48 AM CET 
//


package com.pass.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getOperazioniProdottoResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getOperazioniProdottoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://rgi.it/WSPassPro}msgGetOperazioniProdottoResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOperazioniProdottoResponse", propOrder = {
    "_return"
})
@XmlRootElement(name = "getOperazioniProdottoResponse")
public class GetOperazioniProdottoResponse {

    @XmlElement(name = "return")
    protected MsgGetOperazioniProdottoResponse _return;

    /**
     * Recupera il valore della propriet� return.
     * 
     * @return
     *     possible object is
     *     {@link MsgGetOperazioniProdottoResponse }
     *     
     */
    public MsgGetOperazioniProdottoResponse getReturn() {
        return _return;
    }

    /**
     * Imposta il valore della propriet� return.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgGetOperazioniProdottoResponse }
     *     
     */
    public void setReturn(MsgGetOperazioniProdottoResponse value) {
        this._return = value;
    }

}
