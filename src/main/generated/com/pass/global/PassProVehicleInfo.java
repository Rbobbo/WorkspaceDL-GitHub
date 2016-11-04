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
 * <p>Classe Java per passProVehicleInfo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="passProVehicleInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assets" type="{http://rgi.it/WSPassPro}wsAsset" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classes" type="{http://rgi.it/WSPassPro}wsVehicleClass" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sectorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sectors" type="{http://rgi.it/WSPassPro}passProVehicleSector" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="useCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "passProVehicleInfo", propOrder = {
    "assets",
    "classCode",
    "classes",
    "productCode",
    "sectorCode",
    "sectors",
    "useCode",
    "uses"
})
public class PassProVehicleInfo {

    @XmlElement(nillable = true)
    protected List<WsAsset> assets;
    protected String classCode;
    @XmlElement(nillable = true)
    protected List<WsVehicleClass> classes;
    protected String productCode;
    protected String sectorCode;
    @XmlElement(nillable = true)
    protected List<PassProVehicleSector> sectors;
    protected String useCode;
    @XmlElement(nillable = true)
    protected List<WsVehicleUse> uses;

    /**
     * Gets the value of the assets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsAsset }
     * 
     * 
     */
    public List<WsAsset> getAssets() {
        if (assets == null) {
            assets = new ArrayList<WsAsset>();
        }
        return this.assets;
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
     * Recupera il valore della proprietà productCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Imposta il valore della proprietà productCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
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
     * Gets the value of the sectors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sectors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSectors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassProVehicleSector }
     * 
     * 
     */
    public List<PassProVehicleSector> getSectors() {
        if (sectors == null) {
            sectors = new ArrayList<PassProVehicleSector>();
        }
        return this.sectors;
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
