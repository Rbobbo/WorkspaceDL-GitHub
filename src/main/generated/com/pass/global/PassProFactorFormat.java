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
 * <p>Classe Java per passProFactorFormat complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="passProFactorFormat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alignment" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grouping" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="html" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="maxLen" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maxRowLen" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="multiline" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="pad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="precision" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passProFactorFormat", propOrder = {
    "alignment",
    "format",
    "grouping",
    "html",
    "maxLen",
    "maxRowLen",
    "multiline",
    "pad",
    "precision"
})
public class PassProFactorFormat {

    protected int alignment;
    protected String format;
    protected boolean grouping;
    protected boolean html;
    protected int maxLen;
    protected int maxRowLen;
    protected boolean multiline;
    protected int pad;
    protected int precision;

    /**
     * Recupera il valore della proprietà alignment.
     * 
     */
    public int getAlignment() {
        return alignment;
    }

    /**
     * Imposta il valore della proprietà alignment.
     * 
     */
    public void setAlignment(int value) {
        this.alignment = value;
    }

    /**
     * Recupera il valore della proprietà format.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Imposta il valore della proprietà format.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Recupera il valore della proprietà grouping.
     * 
     */
    public boolean isGrouping() {
        return grouping;
    }

    /**
     * Imposta il valore della proprietà grouping.
     * 
     */
    public void setGrouping(boolean value) {
        this.grouping = value;
    }

    /**
     * Recupera il valore della proprietà html.
     * 
     */
    public boolean isHtml() {
        return html;
    }

    /**
     * Imposta il valore della proprietà html.
     * 
     */
    public void setHtml(boolean value) {
        this.html = value;
    }

    /**
     * Recupera il valore della proprietà maxLen.
     * 
     */
    public int getMaxLen() {
        return maxLen;
    }

    /**
     * Imposta il valore della proprietà maxLen.
     * 
     */
    public void setMaxLen(int value) {
        this.maxLen = value;
    }

    /**
     * Recupera il valore della proprietà maxRowLen.
     * 
     */
    public int getMaxRowLen() {
        return maxRowLen;
    }

    /**
     * Imposta il valore della proprietà maxRowLen.
     * 
     */
    public void setMaxRowLen(int value) {
        this.maxRowLen = value;
    }

    /**
     * Recupera il valore della proprietà multiline.
     * 
     */
    public boolean isMultiline() {
        return multiline;
    }

    /**
     * Imposta il valore della proprietà multiline.
     * 
     */
    public void setMultiline(boolean value) {
        this.multiline = value;
    }

    /**
     * Recupera il valore della proprietà pad.
     * 
     */
    public int getPad() {
        return pad;
    }

    /**
     * Imposta il valore della proprietà pad.
     * 
     */
    public void setPad(int value) {
        this.pad = value;
    }

    /**
     * Recupera il valore della proprietà precision.
     * 
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * Imposta il valore della proprietà precision.
     * 
     */
    public void setPrecision(int value) {
        this.precision = value;
    }

}
