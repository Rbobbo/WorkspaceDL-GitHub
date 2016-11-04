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
 * <p>Classe Java per wsClause complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsClause"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicationClause" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="children" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="compulsoryText" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="customProperties" type="{http://rgi.it/WSPassPro}wsProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="derogationLevel" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enabled" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="extendedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasFactor" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="helpFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="manuallySet" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="order" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="parents" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="retrieveDependencies" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="retrieveDependents" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="selected" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="textFormat" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="textType" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="transcoderCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transcoderCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://rgi.it/WSPassPro}passProClauseType" minOccurs="0"/&gt;
 *         &lt;element name="visibilityLevel" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="visible" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="visibleOnQuote" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsClause", propOrder = {
    "applicationClause",
    "childrens",
    "code",
    "compulsoryText",
    "customProperties",
    "derogationLevel",
    "description",
    "enabled",
    "endDate",
    "extendedDescription",
    "format",
    "hasFactor",
    "helpFile",
    "manuallySet",
    "order",
    "parents",
    "retrieveDependencies",
    "retrieveDependents",
    "selected",
    "startDate",
    "text",
    "textFormat",
    "textType",
    "transcoderCode1",
    "transcoderCode2",
    "type",
    "visibilityLevel",
    "visible",
    "visibleOnQuote"
})
public class WsClause {

    protected TypeBooleano applicationClause;
    @XmlElement(name = "children", nillable = true)
    protected List<String> childrens;
    protected String code;
    protected boolean compulsoryText;
    @XmlElement(nillable = true)
    protected List<WsProperty> customProperties;
    protected TypeInt32 derogationLevel;
    protected String description;
    protected TypeBooleano enabled;
    protected TypeData endDate;
    protected String extendedDescription;
    protected String format;
    protected TypeBooleano hasFactor;
    protected String helpFile;
    protected TypeBooleano manuallySet;
    protected TypeInt32 order;
    @XmlElement(nillable = true)
    protected List<String> parents;
    protected TypeInt32 retrieveDependencies;
    protected TypeInt32 retrieveDependents;
    protected TypeBooleano selected;
    protected TypeData startDate;
    protected String text;
    protected TypeInt32 textFormat;
    protected TypeInt32 textType;
    protected String transcoderCode1;
    protected String transcoderCode2;
    protected PassProClauseType type;
    protected TypeInt32 visibilityLevel;
    protected TypeBooleano visible;
    protected TypeBooleano visibleOnQuote;

    /**
     * Recupera il valore della proprietà applicationClause.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getApplicationClause() {
        return applicationClause;
    }

    /**
     * Imposta il valore della proprietà applicationClause.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setApplicationClause(TypeBooleano value) {
        this.applicationClause = value;
    }

    /**
     * Gets the value of the childrens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childrens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildrens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChildrens() {
        if (childrens == null) {
            childrens = new ArrayList<String>();
        }
        return this.childrens;
    }

    /**
     * Recupera il valore della proprietà code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Imposta il valore della proprietà code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Recupera il valore della proprietà compulsoryText.
     * 
     */
    public boolean isCompulsoryText() {
        return compulsoryText;
    }

    /**
     * Imposta il valore della proprietà compulsoryText.
     * 
     */
    public void setCompulsoryText(boolean value) {
        this.compulsoryText = value;
    }

    /**
     * Gets the value of the customProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsProperty }
     * 
     * 
     */
    public List<WsProperty> getCustomProperties() {
        if (customProperties == null) {
            customProperties = new ArrayList<WsProperty>();
        }
        return this.customProperties;
    }

    /**
     * Recupera il valore della proprietà derogationLevel.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getDerogationLevel() {
        return derogationLevel;
    }

    /**
     * Imposta il valore della proprietà derogationLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setDerogationLevel(TypeInt32 value) {
        this.derogationLevel = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Recupera il valore della proprietà enabled.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getEnabled() {
        return enabled;
    }

    /**
     * Imposta il valore della proprietà enabled.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setEnabled(TypeBooleano value) {
        this.enabled = value;
    }

    /**
     * Recupera il valore della proprietà endDate.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getEndDate() {
        return endDate;
    }

    /**
     * Imposta il valore della proprietà endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setEndDate(TypeData value) {
        this.endDate = value;
    }

    /**
     * Recupera il valore della proprietà extendedDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedDescription() {
        return extendedDescription;
    }

    /**
     * Imposta il valore della proprietà extendedDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedDescription(String value) {
        this.extendedDescription = value;
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
     * Recupera il valore della proprietà hasFactor.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getHasFactor() {
        return hasFactor;
    }

    /**
     * Imposta il valore della proprietà hasFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setHasFactor(TypeBooleano value) {
        this.hasFactor = value;
    }

    /**
     * Recupera il valore della proprietà helpFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpFile() {
        return helpFile;
    }

    /**
     * Imposta il valore della proprietà helpFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpFile(String value) {
        this.helpFile = value;
    }

    /**
     * Recupera il valore della proprietà manuallySet.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getManuallySet() {
        return manuallySet;
    }

    /**
     * Imposta il valore della proprietà manuallySet.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setManuallySet(TypeBooleano value) {
        this.manuallySet = value;
    }

    /**
     * Recupera il valore della proprietà order.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getOrder() {
        return order;
    }

    /**
     * Imposta il valore della proprietà order.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setOrder(TypeInt32 value) {
        this.order = value;
    }

    /**
     * Gets the value of the parents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParents() {
        if (parents == null) {
            parents = new ArrayList<String>();
        }
        return this.parents;
    }

    /**
     * Recupera il valore della proprietà retrieveDependencies.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getRetrieveDependencies() {
        return retrieveDependencies;
    }

    /**
     * Imposta il valore della proprietà retrieveDependencies.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setRetrieveDependencies(TypeInt32 value) {
        this.retrieveDependencies = value;
    }

    /**
     * Recupera il valore della proprietà retrieveDependents.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getRetrieveDependents() {
        return retrieveDependents;
    }

    /**
     * Imposta il valore della proprietà retrieveDependents.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setRetrieveDependents(TypeInt32 value) {
        this.retrieveDependents = value;
    }

    /**
     * Recupera il valore della proprietà selected.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getSelected() {
        return selected;
    }

    /**
     * Imposta il valore della proprietà selected.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setSelected(TypeBooleano value) {
        this.selected = value;
    }

    /**
     * Recupera il valore della proprietà startDate.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getStartDate() {
        return startDate;
    }

    /**
     * Imposta il valore della proprietà startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setStartDate(TypeData value) {
        this.startDate = value;
    }

    /**
     * Recupera il valore della proprietà text.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Imposta il valore della proprietà text.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Recupera il valore della proprietà textFormat.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getTextFormat() {
        return textFormat;
    }

    /**
     * Imposta il valore della proprietà textFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setTextFormat(TypeInt32 value) {
        this.textFormat = value;
    }

    /**
     * Recupera il valore della proprietà textType.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getTextType() {
        return textType;
    }

    /**
     * Imposta il valore della proprietà textType.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setTextType(TypeInt32 value) {
        this.textType = value;
    }

    /**
     * Recupera il valore della proprietà transcoderCode1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranscoderCode1() {
        return transcoderCode1;
    }

    /**
     * Imposta il valore della proprietà transcoderCode1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranscoderCode1(String value) {
        this.transcoderCode1 = value;
    }

    /**
     * Recupera il valore della proprietà transcoderCode2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranscoderCode2() {
        return transcoderCode2;
    }

    /**
     * Imposta il valore della proprietà transcoderCode2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranscoderCode2(String value) {
        this.transcoderCode2 = value;
    }

    /**
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link PassProClauseType }
     *     
     */
    public PassProClauseType getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProClauseType }
     *     
     */
    public void setType(PassProClauseType value) {
        this.type = value;
    }

    /**
     * Recupera il valore della proprietà visibilityLevel.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getVisibilityLevel() {
        return visibilityLevel;
    }

    /**
     * Imposta il valore della proprietà visibilityLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setVisibilityLevel(TypeInt32 value) {
        this.visibilityLevel = value;
    }

    /**
     * Recupera il valore della proprietà visible.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getVisible() {
        return visible;
    }

    /**
     * Imposta il valore della proprietà visible.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setVisible(TypeBooleano value) {
        this.visible = value;
    }

    /**
     * Recupera il valore della proprietà visibleOnQuote.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getVisibleOnQuote() {
        return visibleOnQuote;
    }

    /**
     * Imposta il valore della proprietà visibleOnQuote.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setVisibleOnQuote(TypeBooleano value) {
        this.visibleOnQuote = value;
    }

}
