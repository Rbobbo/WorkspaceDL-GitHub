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
 * <p>Classe Java per passProQuoteDevelopment complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="passProQuoteDevelopment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="quoteColums" type="{http://rgi.it/WSPassPro}passProQuoteDevelopmentColumn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quoteRows" type="{http://rgi.it/WSPassPro}passProQuoteDevelopmentRow" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passProQuoteDevelopment", propOrder = {
    "quoteColums",
    "quoteRows",
    "rateDescription"
})
public class PassProQuoteDevelopment {

    @XmlElement(nillable = true)
    protected List<PassProQuoteDevelopmentColumn> quoteColums;
    @XmlElement(nillable = true)
    protected List<PassProQuoteDevelopmentRow> quoteRows;
    protected String rateDescription;

    /**
     * Gets the value of the quoteColums property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteColums property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteColums().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassProQuoteDevelopmentColumn }
     * 
     * 
     */
    public List<PassProQuoteDevelopmentColumn> getQuoteColums() {
        if (quoteColums == null) {
            quoteColums = new ArrayList<PassProQuoteDevelopmentColumn>();
        }
        return this.quoteColums;
    }

    /**
     * Gets the value of the quoteRows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteRows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteRows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassProQuoteDevelopmentRow }
     * 
     * 
     */
    public List<PassProQuoteDevelopmentRow> getQuoteRows() {
        if (quoteRows == null) {
            quoteRows = new ArrayList<PassProQuoteDevelopmentRow>();
        }
        return this.quoteRows;
    }

    /**
     * Recupera il valore della proprietà rateDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateDescription() {
        return rateDescription;
    }

    /**
     * Imposta il valore della proprietà rateDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateDescription(String value) {
        this.rateDescription = value;
    }

}
