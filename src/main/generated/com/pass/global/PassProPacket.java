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
 * <p>Classe Java per passProPacket complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="passProPacket"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="children" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountedPremium" type="{http://rgi.it/WSPassPro}wsPremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="enabled" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="enoughDataForQuotation" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="extendedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="initialState" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="order" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="parents" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="premium" type="{http://rgi.it/WSPassPro}wsPremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="retrieveDependencies" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="retrieveDependents" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="selected" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="units" type="{http://rgi.it/WSPassPro}passProPacketUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passProPacket", propOrder = {
    "childrens",
    "code",
    "description",
    "discountedPremium",
    "enabled",
    "enoughDataForQuotation",
    "extendedDescription",
    "initialState",
    "order",
    "parents",
    "premium",
    "retrieveDependencies",
    "retrieveDependents",
    "selected",
    "units"
})
public class PassProPacket {

    @XmlElement(name = "children", nillable = true)
    protected List<String> childrens;
    protected String code;
    protected String description;
    protected WsPremiumGroup discountedPremium;
    protected TypeBooleano enabled;
    protected TypeBooleano enoughDataForQuotation;
    protected String extendedDescription;
    protected TypeInt32 initialState;
    protected TypeInt32 order;
    @XmlElement(nillable = true)
    protected List<String> parents;
    protected WsPremiumGroup premium;
    protected TypeInt32 retrieveDependencies;
    protected TypeInt32 retrieveDependents;
    protected TypeBooleano selected;
    @XmlElement(nillable = true)
    protected List<PassProPacketUnit> units;

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
     * Recupera il valore della proprietà discountedPremium.
     * 
     * @return
     *     possible object is
     *     {@link WsPremiumGroup }
     *     
     */
    public WsPremiumGroup getDiscountedPremium() {
        return discountedPremium;
    }

    /**
     * Imposta il valore della proprietà discountedPremium.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPremiumGroup }
     *     
     */
    public void setDiscountedPremium(WsPremiumGroup value) {
        this.discountedPremium = value;
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
     * Recupera il valore della proprietà enoughDataForQuotation.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getEnoughDataForQuotation() {
        return enoughDataForQuotation;
    }

    /**
     * Imposta il valore della proprietà enoughDataForQuotation.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setEnoughDataForQuotation(TypeBooleano value) {
        this.enoughDataForQuotation = value;
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
     * Recupera il valore della proprietà initialState.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getInitialState() {
        return initialState;
    }

    /**
     * Imposta il valore della proprietà initialState.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setInitialState(TypeInt32 value) {
        this.initialState = value;
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
     * Recupera il valore della proprietà premium.
     * 
     * @return
     *     possible object is
     *     {@link WsPremiumGroup }
     *     
     */
    public WsPremiumGroup getPremium() {
        return premium;
    }

    /**
     * Imposta il valore della proprietà premium.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPremiumGroup }
     *     
     */
    public void setPremium(WsPremiumGroup value) {
        this.premium = value;
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
     * Gets the value of the units property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the units property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassProPacketUnit }
     * 
     * 
     */
    public List<PassProPacketUnit> getUnits() {
        if (units == null) {
            units = new ArrayList<PassProPacketUnit>();
        }
        return this.units;
    }

}
