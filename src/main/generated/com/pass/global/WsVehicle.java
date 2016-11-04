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
 * <p>Classe Java per wsVehicle complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsVehicle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ANIACode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adminExceptions" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="assetExtension" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classes" type="{http://rgi.it/WSPassPro}wsVehicleClass" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sectorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sectorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="technicalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="useCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="useDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usedJournal" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="uses" type="{http://rgi.it/WSPassPro}wsVehicleUse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsVehicle", propOrder = {
    "aniaCode",
    "adminExceptions",
    "assetExtension",
    "category",
    "classCode",
    "classDescription",
    "classes",
    "code",
    "description",
    "sectorCode",
    "sectorDescription",
    "technicalData",
    "useCode",
    "useDescription",
    "usedJournal",
    "uses"
})
public class WsVehicle {

    @XmlElement(name = "ANIACode")
    protected String aniaCode;
    protected boolean adminExceptions;
    protected boolean assetExtension;
    protected String category;
    protected String classCode;
    protected String classDescription;
    @XmlElement(nillable = true)
    protected List<WsVehicleClass> classes;
    protected String code;
    protected String description;
    protected String sectorCode;
    protected String sectorDescription;
    protected String technicalData;
    protected String useCode;
    protected String useDescription;
    protected TypeInt32 usedJournal;
    @XmlElement(nillable = true)
    protected List<WsVehicleUse> uses;

    /**
     * Recupera il valore della proprietà aniaCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANIACode() {
        return aniaCode;
    }

    /**
     * Imposta il valore della proprietà aniaCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANIACode(String value) {
        this.aniaCode = value;
    }

    /**
     * Recupera il valore della proprietà adminExceptions.
     * 
     */
    public boolean isAdminExceptions() {
        return adminExceptions;
    }

    /**
     * Imposta il valore della proprietà adminExceptions.
     * 
     */
    public void setAdminExceptions(boolean value) {
        this.adminExceptions = value;
    }

    /**
     * Recupera il valore della proprietà assetExtension.
     * 
     */
    public boolean isAssetExtension() {
        return assetExtension;
    }

    /**
     * Imposta il valore della proprietà assetExtension.
     * 
     */
    public void setAssetExtension(boolean value) {
        this.assetExtension = value;
    }

    /**
     * Recupera il valore della proprietà category.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Imposta il valore della proprietà category.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Recupera il valore della proprietà classCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * Imposta il valore della proprietà classCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassCode(String value) {
        this.classCode = value;
    }

    /**
     * Recupera il valore della proprietà classDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassDescription() {
        return classDescription;
    }

    /**
     * Imposta il valore della proprietà classDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassDescription(String value) {
        this.classDescription = value;
    }

    /**
     * Gets the value of the classes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsVehicleClass }
     * 
     * 
     */
    public List<WsVehicleClass> getClasses() {
        if (classes == null) {
            classes = new ArrayList<WsVehicleClass>();
        }
        return this.classes;
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
     * Recupera il valore della proprietà sectorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectorCode() {
        return sectorCode;
    }

    /**
     * Imposta il valore della proprietà sectorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectorCode(String value) {
        this.sectorCode = value;
    }

    /**
     * Recupera il valore della proprietà sectorDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectorDescription() {
        return sectorDescription;
    }

    /**
     * Imposta il valore della proprietà sectorDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectorDescription(String value) {
        this.sectorDescription = value;
    }

    /**
     * Recupera il valore della proprietà technicalData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalData() {
        return technicalData;
    }

    /**
     * Imposta il valore della proprietà technicalData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalData(String value) {
        this.technicalData = value;
    }

    /**
     * Recupera il valore della proprietà useCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseCode() {
        return useCode;
    }

    /**
     * Imposta il valore della proprietà useCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseCode(String value) {
        this.useCode = value;
    }

    /**
     * Recupera il valore della proprietà useDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDescription() {
        return useDescription;
    }

    /**
     * Imposta il valore della proprietà useDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDescription(String value) {
        this.useDescription = value;
    }

    /**
     * Recupera il valore della proprietà usedJournal.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getUsedJournal() {
        return usedJournal;
    }

    /**
     * Imposta il valore della proprietà usedJournal.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setUsedJournal(TypeInt32 value) {
        this.usedJournal = value;
    }

    /**
     * Gets the value of the uses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsVehicleUse }
     * 
     * 
     */
    public List<WsVehicleUse> getUses() {
        if (uses == null) {
            uses = new ArrayList<WsVehicleUse>();
        }
        return this.uses;
    }

}
