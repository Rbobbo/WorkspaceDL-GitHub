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
 * <p>Classe Java per wsAssetInstance complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsAssetInstance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activities" type="{http://rgi.it/WSPassPro}wsActivity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="activityPacket" type="{http://rgi.it/WSPassPro}wsActivityPacket" minOccurs="0"/&gt;
 *         &lt;element name="assetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clauses" type="{http://rgi.it/WSPassPro}wsClause" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="discountedPremium" type="{http://rgi.it/WSPassPro}wsPremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="enoughDataForQuotation" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="extensionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extensions" type="{http://rgi.it/WSPassPro}wsAssetExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="extraDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="factors" type="{http://rgi.it/WSPassPro}wsFactor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://rgi.it/WSPassPro}typeInt64" minOccurs="0"/&gt;
 *         &lt;element name="lifePremium" type="{http://rgi.it/WSPassPro}passProLifePremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="messageLevels" type="{http://rgi.it/WSPassPro}wsActionLevel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="messages" type="{http://rgi.it/WSPassPro}wsMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packetUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packets" type="{http://rgi.it/WSPassPro}passProPacket" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="premium" type="{http://rgi.it/WSPassPro}wsPremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="questionnaires" type="{http://rgi.it/WSPassPro}wsQuestionnaire" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="secondaryActivityPacket" type="{http://rgi.it/WSPassPro}wsActivityPacket" minOccurs="0"/&gt;
 *         &lt;element name="sections" type="{http://rgi.it/WSPassPro}wsAssetSection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vehicle" type="{http://rgi.it/WSPassPro}wsVehicle" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsAssetInstance", propOrder = {
    "activities",
    "activityPacket",
    "assetCode",
    "clauses",
    "discountedPremium",
    "enoughDataForQuotation",
    "extensionCode",
    "extensions",
    "extraDescription",
    "factors",
    "id",
    "lifePremium",
    "messageLevels",
    "messages",
    "name",
    "packetUnitCode",
    "packets",
    "premium",
    "questionnaires",
    "secondaryActivityPacket",
    "sections",
    "vehicle"
})
public class WsAssetInstance {

    @XmlElement(nillable = true)
    protected List<WsActivity> activities;
    protected WsActivityPacket activityPacket;
    protected String assetCode;
    @XmlElement(nillable = true)
    protected List<WsClause> clauses;
    protected WsPremiumGroup discountedPremium;
    protected TypeBooleano enoughDataForQuotation;
    protected String extensionCode;
    @XmlElement(nillable = true)
    protected List<WsAssetExtension> extensions;
    protected String extraDescription;
    @XmlElement(nillable = true)
    protected List<WsFactor> factors;
    @XmlElement(name = "ID")
    protected TypeInt64 id;
    protected PassProLifePremiumGroup lifePremium;
    @XmlElement(nillable = true)
    protected List<WsActionLevel> messageLevels;
    @XmlElement(nillable = true)
    protected List<WsMessage> messages;
    protected String name;
    protected String packetUnitCode;
    @XmlElement(nillable = true)
    protected List<PassProPacket> packets;
    protected WsPremiumGroup premium;
    @XmlElement(nillable = true)
    protected List<WsQuestionnaire> questionnaires;
    protected WsActivityPacket secondaryActivityPacket;
    @XmlElement(nillable = true)
    protected List<WsAssetSection> sections;
    protected WsVehicle vehicle;

    /**
     * Gets the value of the activities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsActivity }
     * 
     * 
     */
    public List<WsActivity> getActivities() {
        if (activities == null) {
            activities = new ArrayList<WsActivity>();
        }
        return this.activities;
    }

    /**
     * Recupera il valore della proprietà activityPacket.
     * 
     * @return
     *     possible object is
     *     {@link WsActivityPacket }
     *     
     */
    public WsActivityPacket getActivityPacket() {
        return activityPacket;
    }

    /**
     * Imposta il valore della proprietà activityPacket.
     * 
     * @param value
     *     allowed object is
     *     {@link WsActivityPacket }
     *     
     */
    public void setActivityPacket(WsActivityPacket value) {
        this.activityPacket = value;
    }

    /**
     * Recupera il valore della proprietà assetCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetCode() {
        return assetCode;
    }

    /**
     * Imposta il valore della proprietà assetCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetCode(String value) {
        this.assetCode = value;
    }

    /**
     * Gets the value of the clauses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clauses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClauses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsClause }
     * 
     * 
     */
    public List<WsClause> getClauses() {
        if (clauses == null) {
            clauses = new ArrayList<WsClause>();
        }
        return this.clauses;
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
     * Recupera il valore della proprietà extensionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionCode() {
        return extensionCode;
    }

    /**
     * Imposta il valore della proprietà extensionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionCode(String value) {
        this.extensionCode = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsAssetExtension }
     * 
     * 
     */
    public List<WsAssetExtension> getExtensions() {
        if (extensions == null) {
            extensions = new ArrayList<WsAssetExtension>();
        }
        return this.extensions;
    }

    /**
     * Recupera il valore della proprietà extraDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraDescription() {
        return extraDescription;
    }

    /**
     * Imposta il valore della proprietà extraDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraDescription(String value) {
        this.extraDescription = value;
    }

    /**
     * Gets the value of the factors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the factors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFactors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsFactor }
     * 
     * 
     */
    public List<WsFactor> getFactors() {
        if (factors == null) {
            factors = new ArrayList<WsFactor>();
        }
        return this.factors;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt64 }
     *     
     */
    public TypeInt64 getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt64 }
     *     
     */
    public void setID(TypeInt64 value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà lifePremium.
     * 
     * @return
     *     possible object is
     *     {@link PassProLifePremiumGroup }
     *     
     */
    public PassProLifePremiumGroup getLifePremium() {
        return lifePremium;
    }

    /**
     * Imposta il valore della proprietà lifePremium.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProLifePremiumGroup }
     *     
     */
    public void setLifePremium(PassProLifePremiumGroup value) {
        this.lifePremium = value;
    }

    /**
     * Gets the value of the messageLevels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageLevels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageLevels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsActionLevel }
     * 
     * 
     */
    public List<WsActionLevel> getMessageLevels() {
        if (messageLevels == null) {
            messageLevels = new ArrayList<WsActionLevel>();
        }
        return this.messageLevels;
    }

    /**
     * Gets the value of the messages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsMessage }
     * 
     * 
     */
    public List<WsMessage> getMessages() {
        if (messages == null) {
            messages = new ArrayList<WsMessage>();
        }
        return this.messages;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà packetUnitCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacketUnitCode() {
        return packetUnitCode;
    }

    /**
     * Imposta il valore della proprietà packetUnitCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacketUnitCode(String value) {
        this.packetUnitCode = value;
    }

    /**
     * Gets the value of the packets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassProPacket }
     * 
     * 
     */
    public List<PassProPacket> getPackets() {
        if (packets == null) {
            packets = new ArrayList<PassProPacket>();
        }
        return this.packets;
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
     * Gets the value of the questionnaires property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionnaires property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionnaires().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsQuestionnaire }
     * 
     * 
     */
    public List<WsQuestionnaire> getQuestionnaires() {
        if (questionnaires == null) {
            questionnaires = new ArrayList<WsQuestionnaire>();
        }
        return this.questionnaires;
    }

    /**
     * Recupera il valore della proprietà secondaryActivityPacket.
     * 
     * @return
     *     possible object is
     *     {@link WsActivityPacket }
     *     
     */
    public WsActivityPacket getSecondaryActivityPacket() {
        return secondaryActivityPacket;
    }

    /**
     * Imposta il valore della proprietà secondaryActivityPacket.
     * 
     * @param value
     *     allowed object is
     *     {@link WsActivityPacket }
     *     
     */
    public void setSecondaryActivityPacket(WsActivityPacket value) {
        this.secondaryActivityPacket = value;
    }

    /**
     * Gets the value of the sections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsAssetSection }
     * 
     * 
     */
    public List<WsAssetSection> getSections() {
        if (sections == null) {
            sections = new ArrayList<WsAssetSection>();
        }
        return this.sections;
    }

    /**
     * Recupera il valore della proprietà vehicle.
     * 
     * @return
     *     possible object is
     *     {@link WsVehicle }
     *     
     */
    public WsVehicle getVehicle() {
        return vehicle;
    }

    /**
     * Imposta il valore della proprietà vehicle.
     * 
     * @param value
     *     allowed object is
     *     {@link WsVehicle }
     *     
     */
    public void setVehicle(WsVehicle value) {
        this.vehicle = value;
    }

}
