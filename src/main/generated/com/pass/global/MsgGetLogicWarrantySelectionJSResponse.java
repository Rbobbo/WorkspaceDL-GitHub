//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.11.03 alle 09:31:48 AM CET 
//


package com.pass.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per msgGetLogicWarrantySelectionJSResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="msgGetLogicWarrantySelectionJSResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="output" type="{http://rgi.it/WSPassPro}wsGetLogicWarrantySelectionJSOutput" minOccurs="0"/&gt;
 *         &lt;element name="serviceInfo" type="{http://rgi.it/WSPassPro}msgResponseHeader" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "msgGetLogicWarrantySelectionJSResponse", propOrder = {
    "output",
    "serviceInfo"
})
public class MsgGetLogicWarrantySelectionJSResponse {

    protected WsGetLogicWarrantySelectionJSOutput output;
    protected MsgResponseHeader serviceInfo;

    /**
     * Recupera il valore della propriet� output.
     * 
     * @return
     *     possible object is
     *     {@link WsGetLogicWarrantySelectionJSOutput }
     *     
     */
    public WsGetLogicWarrantySelectionJSOutput getOutput() {
        return output;
    }

    /**
     * Imposta il valore della propriet� output.
     * 
     * @param value
     *     allowed object is
     *     {@link WsGetLogicWarrantySelectionJSOutput }
     *     
     */
    public void setOutput(WsGetLogicWarrantySelectionJSOutput value) {
        this.output = value;
    }

    /**
     * Recupera il valore della propriet� serviceInfo.
     * 
     * @return
     *     possible object is
     *     {@link MsgResponseHeader }
     *     
     */
    public MsgResponseHeader getServiceInfo() {
        return serviceInfo;
    }

    /**
     * Imposta il valore della propriet� serviceInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgResponseHeader }
     *     
     */
    public void setServiceInfo(MsgResponseHeader value) {
        this.serviceInfo = value;
    }

}
