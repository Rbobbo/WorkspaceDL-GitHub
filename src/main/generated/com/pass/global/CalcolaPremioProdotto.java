//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.11.03 alle 09:31:48 AM CET 
//


package com.pass.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per calcolaPremioProdotto complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="calcolaPremioProdotto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://rgi.it/WSPassPro}msgCalcolaPremioProdottoRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcolaPremioProdotto", propOrder = {
    "arg0"
})
@XmlRootElement(name = "calcolaPremioProdotto")
public class CalcolaPremioProdotto {

    protected MsgCalcolaPremioProdottoRequest arg0;

    /**
     * Recupera il valore della propriet� arg0.
     * 
     * @return
     *     possible object is
     *     {@link MsgCalcolaPremioProdottoRequest }
     *     
     */
    public MsgCalcolaPremioProdottoRequest getArg0() {
        return arg0;
    }

    /**
     * Imposta il valore della propriet� arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgCalcolaPremioProdottoRequest }
     *     
     */
    public void setArg0(MsgCalcolaPremioProdottoRequest value) {
        this.arg0 = value;
    }

}
