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
 * <p>Classe Java per wsFactor complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsFactor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicationFactor" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="children" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="claims" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="compulsory" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="configurable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="convertedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customProperties" type="{http://rgi.it/WSPassPro}wsProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="defaultVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dependent" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="derogationLevelValuesList" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dynamic" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="dynamicVisibility" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="dynamicVisibilityOnQuote" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="extendedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extraValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="factorClass" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="fields" type="{http://rgi.it/WSPassPro}wsStructureField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="formatter" type="{http://rgi.it/WSPassPro}passProFactorFormat" minOccurs="0"/&gt;
 *         &lt;element name="helpFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indexation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="iterator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="life" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="manuallySet" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="modifiable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="order" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="parameterType" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="parents" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="persistent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="retrieveDependencies" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="retrieveDependents" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="SQL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="transcoderCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transcoderCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="values" type="{http://rgi.it/WSPassPro}wsListValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vector" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="vectorDimension" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="vectorValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="visibilityLevel" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="visible" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="visibleOnConsultation" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
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
@XmlType(name = "wsFactor", propOrder = {
    "applicationFactor",
    "childrens",
    "claims",
    "code",
    "compulsory",
    "configurable",
    "convertedValue",
    "customProperties",
    "defaultVal",
    "dependent",
    "derogationLevelValuesList",
    "description",
    "dynamic",
    "dynamicVisibility",
    "dynamicVisibilityOnQuote",
    "extendedDescription",
    "extraValue",
    "factorClass",
    "fields",
    "format",
    "formatter",
    "helpFile",
    "indexation",
    "iterator",
    "life",
    "manuallySet",
    "modifiable",
    "order",
    "parameterType",
    "parents",
    "persistent",
    "retrieveDependencies",
    "retrieveDependents",
    "sql",
    "transcoderCode1",
    "transcoderCode2",
    "type",
    "value",
    "values",
    "vector",
    "vectorDimension",
    "vectorValues",
    "visibilityLevel",
    "visible",
    "visibleOnConsultation",
    "visibleOnQuote"
})
public class WsFactor {

    protected boolean applicationFactor;
    @XmlElement(name = "children", nillable = true)
    protected List<String> childrens;
    protected TypeBooleano claims;
    protected String code;
    protected boolean compulsory;
    protected boolean configurable;
    protected String convertedValue;
    @XmlElement(nillable = true)
    protected List<WsProperty> customProperties;
    protected String defaultVal;
    protected TypeBooleano dependent;
    protected TypeInt32 derogationLevelValuesList;
    protected String description;
    protected TypeBooleano dynamic;
    protected boolean dynamicVisibility;
    protected boolean dynamicVisibilityOnQuote;
    protected String extendedDescription;
    protected String extraValue;
    protected TypeInt32 factorClass;
    @XmlElement(nillable = true)
    protected List<WsStructureField> fields;
    protected String format;
    protected PassProFactorFormat formatter;
    protected String helpFile;
    protected boolean indexation;
    protected boolean iterator;
    protected boolean life;
    protected TypeBooleano manuallySet;
    protected boolean modifiable;
    protected TypeInt32 order;
    protected TypeInt32 parameterType;
    @XmlElement(nillable = true)
    protected List<String> parents;
    protected boolean persistent;
    protected TypeInt32 retrieveDependencies;
    protected TypeInt32 retrieveDependents;
    @XmlElement(name = "SQL")
    protected boolean sql;
    protected String transcoderCode1;
    protected String transcoderCode2;
    protected TypeInt32 type;
    protected String value;
    @XmlElement(nillable = true)
    protected List<WsListValue> values;
    protected boolean vector;
    protected TypeInt32 vectorDimension;
    @XmlElement(nillable = true)
    protected List<String> vectorValues;
    protected TypeInt32 visibilityLevel;
    protected TypeBooleano visible;
    protected TypeBooleano visibleOnConsultation;
    protected TypeBooleano visibleOnQuote;

    /**
     * Recupera il valore della proprietà applicationFactor.
     * 
     */
    public boolean isApplicationFactor() {
        return applicationFactor;
    }

    /**
     * Imposta il valore della proprietà applicationFactor.
     * 
     */
    public void setApplicationFactor(boolean value) {
        this.applicationFactor = value;
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
     * Recupera il valore della proprietà claims.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getClaims() {
        return claims;
    }

    /**
     * Imposta il valore della proprietà claims.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setClaims(TypeBooleano value) {
        this.claims = value;
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
     * Recupera il valore della proprietà compulsory.
     * 
     */
    public boolean isCompulsory() {
        return compulsory;
    }

    /**
     * Imposta il valore della proprietà compulsory.
     * 
     */
    public void setCompulsory(boolean value) {
        this.compulsory = value;
    }

    /**
     * Recupera il valore della proprietà configurable.
     * 
     */
    public boolean isConfigurable() {
        return configurable;
    }

    /**
     * Imposta il valore della proprietà configurable.
     * 
     */
    public void setConfigurable(boolean value) {
        this.configurable = value;
    }

    /**
     * Recupera il valore della proprietà convertedValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvertedValue() {
        return convertedValue;
    }

    /**
     * Imposta il valore della proprietà convertedValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvertedValue(String value) {
        this.convertedValue = value;
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
     * Recupera il valore della proprietà defaultVal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultVal() {
        return defaultVal;
    }

    /**
     * Imposta il valore della proprietà defaultVal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultVal(String value) {
        this.defaultVal = value;
    }

    /**
     * Recupera il valore della proprietà dependent.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getDependent() {
        return dependent;
    }

    /**
     * Imposta il valore della proprietà dependent.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setDependent(TypeBooleano value) {
        this.dependent = value;
    }

    /**
     * Recupera il valore della proprietà derogationLevelValuesList.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getDerogationLevelValuesList() {
        return derogationLevelValuesList;
    }

    /**
     * Imposta il valore della proprietà derogationLevelValuesList.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setDerogationLevelValuesList(TypeInt32 value) {
        this.derogationLevelValuesList = value;
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
     * Recupera il valore della proprietà dynamic.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getDynamic() {
        return dynamic;
    }

    /**
     * Imposta il valore della proprietà dynamic.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setDynamic(TypeBooleano value) {
        this.dynamic = value;
    }

    /**
     * Recupera il valore della proprietà dynamicVisibility.
     * 
     */
    public boolean isDynamicVisibility() {
        return dynamicVisibility;
    }

    /**
     * Imposta il valore della proprietà dynamicVisibility.
     * 
     */
    public void setDynamicVisibility(boolean value) {
        this.dynamicVisibility = value;
    }

    /**
     * Recupera il valore della proprietà dynamicVisibilityOnQuote.
     * 
     */
    public boolean isDynamicVisibilityOnQuote() {
        return dynamicVisibilityOnQuote;
    }

    /**
     * Imposta il valore della proprietà dynamicVisibilityOnQuote.
     * 
     */
    public void setDynamicVisibilityOnQuote(boolean value) {
        this.dynamicVisibilityOnQuote = value;
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
     * Recupera il valore della proprietà extraValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraValue() {
        return extraValue;
    }

    /**
     * Imposta il valore della proprietà extraValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraValue(String value) {
        this.extraValue = value;
    }

    /**
     * Recupera il valore della proprietà factorClass.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getFactorClass() {
        return factorClass;
    }

    /**
     * Imposta il valore della proprietà factorClass.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setFactorClass(TypeInt32 value) {
        this.factorClass = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsStructureField }
     * 
     * 
     */
    public List<WsStructureField> getFields() {
        if (fields == null) {
            fields = new ArrayList<WsStructureField>();
        }
        return this.fields;
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
     * Recupera il valore della proprietà formatter.
     * 
     * @return
     *     possible object is
     *     {@link PassProFactorFormat }
     *     
     */
    public PassProFactorFormat getFormatter() {
        return formatter;
    }

    /**
     * Imposta il valore della proprietà formatter.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProFactorFormat }
     *     
     */
    public void setFormatter(PassProFactorFormat value) {
        this.formatter = value;
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
     * Recupera il valore della proprietà indexation.
     * 
     */
    public boolean isIndexation() {
        return indexation;
    }

    /**
     * Imposta il valore della proprietà indexation.
     * 
     */
    public void setIndexation(boolean value) {
        this.indexation = value;
    }

    /**
     * Recupera il valore della proprietà iterator.
     * 
     */
    public boolean isIterator() {
        return iterator;
    }

    /**
     * Imposta il valore della proprietà iterator.
     * 
     */
    public void setIterator(boolean value) {
        this.iterator = value;
    }

    /**
     * Recupera il valore della proprietà life.
     * 
     */
    public boolean isLife() {
        return life;
    }

    /**
     * Imposta il valore della proprietà life.
     * 
     */
    public void setLife(boolean value) {
        this.life = value;
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
     * Recupera il valore della proprietà modifiable.
     * 
     */
    public boolean isModifiable() {
        return modifiable;
    }

    /**
     * Imposta il valore della proprietà modifiable.
     * 
     */
    public void setModifiable(boolean value) {
        this.modifiable = value;
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
     * Recupera il valore della proprietà parameterType.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getParameterType() {
        return parameterType;
    }

    /**
     * Imposta il valore della proprietà parameterType.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setParameterType(TypeInt32 value) {
        this.parameterType = value;
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
     * Recupera il valore della proprietà persistent.
     * 
     */
    public boolean isPersistent() {
        return persistent;
    }

    /**
     * Imposta il valore della proprietà persistent.
     * 
     */
    public void setPersistent(boolean value) {
        this.persistent = value;
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
     * Recupera il valore della proprietà sql.
     * 
     */
    public boolean isSQL() {
        return sql;
    }

    /**
     * Imposta il valore della proprietà sql.
     * 
     */
    public void setSQL(boolean value) {
        this.sql = value;
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
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setType(TypeInt32 value) {
        this.type = value;
    }

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsListValue }
     * 
     * 
     */
    public List<WsListValue> getValues() {
        if (values == null) {
            values = new ArrayList<WsListValue>();
        }
        return this.values;
    }

    /**
     * Recupera il valore della proprietà vector.
     * 
     */
    public boolean isVector() {
        return vector;
    }

    /**
     * Imposta il valore della proprietà vector.
     * 
     */
    public void setVector(boolean value) {
        this.vector = value;
    }

    /**
     * Recupera il valore della proprietà vectorDimension.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getVectorDimension() {
        return vectorDimension;
    }

    /**
     * Imposta il valore della proprietà vectorDimension.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setVectorDimension(TypeInt32 value) {
        this.vectorDimension = value;
    }

    /**
     * Gets the value of the vectorValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vectorValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVectorValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVectorValues() {
        if (vectorValues == null) {
            vectorValues = new ArrayList<String>();
        }
        return this.vectorValues;
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
     * Recupera il valore della proprietà visibleOnConsultation.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getVisibleOnConsultation() {
        return visibleOnConsultation;
    }

    /**
     * Imposta il valore della proprietà visibleOnConsultation.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setVisibleOnConsultation(TypeBooleano value) {
        this.visibleOnConsultation = value;
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
