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
 * <p>Classe Java per wsJavaScriptContainer complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsJavaScriptContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="definitions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htmlElements" type="{http://rgi.it/WSPassPro}wsJavaScriptElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsJavaScriptContainer", propOrder = {
    "definitions",
    "htmlElements"
})
public class WsJavaScriptContainer {

    protected String definitions;
    @XmlElement(nillable = true)
    protected List<WsJavaScriptElement> htmlElements;

    /**
     * Recupera il valore della proprietà definitions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinitions() {
        return definitions;
    }

    /**
     * Imposta il valore della proprietà definitions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinitions(String value) {
        this.definitions = value;
    }

    /**
     * Gets the value of the htmlElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the htmlElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHtmlElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsJavaScriptElement }
     * 
     * 
     */
    public List<WsJavaScriptElement> getHtmlElements() {
        if (htmlElements == null) {
            htmlElements = new ArrayList<WsJavaScriptElement>();
        }
        return this.htmlElements;
    }

}
