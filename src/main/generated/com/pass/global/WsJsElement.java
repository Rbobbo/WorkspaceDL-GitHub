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
 * <p>Classe Java per wsJsElement complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsJsElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codBene" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codRischio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codSezioneBene" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codUnitBene" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="html" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsJsElement", propOrder = {
    "codBene",
    "codRischio",
    "codSezioneBene",
    "codUnitBene",
    "html"
})
public class WsJsElement {

    protected String codBene;
    protected String codRischio;
    protected String codSezioneBene;
    protected String codUnitBene;
    protected String html;

    /**
     * Recupera il valore della proprietà codBene.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodBene() {
        return codBene;
    }

    /**
     * Imposta il valore della proprietà codBene.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodBene(String value) {
        this.codBene = value;
    }

    /**
     * Recupera il valore della proprietà codRischio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRischio() {
        return codRischio;
    }

    /**
     * Imposta il valore della proprietà codRischio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRischio(String value) {
        this.codRischio = value;
    }

    /**
     * Recupera il valore della proprietà codSezioneBene.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodSezioneBene() {
        return codSezioneBene;
    }

    /**
     * Imposta il valore della proprietà codSezioneBene.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodSezioneBene(String value) {
        this.codSezioneBene = value;
    }

    /**
     * Recupera il valore della proprietà codUnitBene.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUnitBene() {
        return codUnitBene;
    }

    /**
     * Imposta il valore della proprietà codUnitBene.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUnitBene(String value) {
        this.codUnitBene = value;
    }

    /**
     * Recupera il valore della proprietà html.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtml() {
        return html;
    }

    /**
     * Imposta il valore della proprietà html.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtml(String value) {
        this.html = value;
    }

}
