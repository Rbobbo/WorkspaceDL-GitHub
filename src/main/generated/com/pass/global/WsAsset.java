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
 * <p>Classe Java per wsAsset complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsAsset"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ANIAVehicleTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activityPacket" type="{http://rgi.it/WSPassPro}wsActivityPacket" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customProperties" type="{http://rgi.it/WSPassPro}wsProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dataDownloadFromANIA" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="dataDownloadPriority" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountedPremium" type="{http://rgi.it/WSPassPro}wsPremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="driversInMasterRepository" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="extendedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extensions" type="{http://rgi.it/WSPassPro}wsAssetExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="firstAddressMode" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="firstPartyMode" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="inheritSettingsInstances" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="instances" type="{http://rgi.it/WSPassPro}wsAssetInstance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lifePremium" type="{http://rgi.it/WSPassPro}passProLifePremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="maxActivities" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="maxDrivers" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="maxInstance" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="maxLocations" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="maxOwners" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="maxParties" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="maxTenants" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="minActivities" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="minDrivers" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="minInstance" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="minLocations" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="minOwners" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="minParties" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="minTenants" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="ownersInMasterRepository" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="partyInMasterRepository" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="premium" type="{http://rgi.it/WSPassPro}wsPremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="quotable" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="tenantsInMasterRepository" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="usedJournal" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="vehicles" type="{http://rgi.it/WSPassPro}wsVehicle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsAsset", propOrder = {
    "aniaVehicleTypeCode",
    "activityPacket",
    "code",
    "customProperties",
    "dataDownloadFromANIA",
    "dataDownloadPriority",
    "description",
    "discountedPremium",
    "driversInMasterRepository",
    "extendedDescription",
    "extensions",
    "firstAddressMode",
    "firstPartyMode",
    "inheritSettingsInstances",
    "instances",
    "lifePremium",
    "maxActivities",
    "maxDrivers",
    "maxInstance",
    "maxLocations",
    "maxOwners",
    "maxParties",
    "maxTenants",
    "minActivities",
    "minDrivers",
    "minInstance",
    "minLocations",
    "minOwners",
    "minParties",
    "minTenants",
    "ownersInMasterRepository",
    "partyInMasterRepository",
    "premium",
    "quotable",
    "tenantsInMasterRepository",
    "type",
    "usedJournal",
    "vehicles"
})
public class WsAsset {

    @XmlElement(name = "ANIAVehicleTypeCode")
    protected String aniaVehicleTypeCode;
    protected WsActivityPacket activityPacket;
    protected String code;
    @XmlElement(nillable = true)
    protected List<WsProperty> customProperties;
    protected TypeInt32 dataDownloadFromANIA;
    protected TypeInt32 dataDownloadPriority;
    protected String description;
    protected WsPremiumGroup discountedPremium;
    protected TypeBooleano driversInMasterRepository;
    protected String extendedDescription;
    @XmlElement(nillable = true)
    protected List<WsAssetExtension> extensions;
    protected TypeInt32 firstAddressMode;
    protected TypeInt32 firstPartyMode;
    protected TypeInt32 inheritSettingsInstances;
    @XmlElement(nillable = true)
    protected List<WsAssetInstance> instances;
    protected PassProLifePremiumGroup lifePremium;
    protected TypeInt32 maxActivities;
    protected TypeInt32 maxDrivers;
    protected TypeInt32 maxInstance;
    protected TypeInt32 maxLocations;
    protected TypeInt32 maxOwners;
    protected TypeInt32 maxParties;
    protected TypeInt32 maxTenants;
    protected TypeInt32 minActivities;
    protected TypeInt32 minDrivers;
    protected TypeInt32 minInstance;
    protected TypeInt32 minLocations;
    protected TypeInt32 minOwners;
    protected TypeInt32 minParties;
    protected TypeInt32 minTenants;
    protected TypeBooleano ownersInMasterRepository;
    protected TypeBooleano partyInMasterRepository;
    protected WsPremiumGroup premium;
    protected TypeBooleano quotable;
    protected TypeBooleano tenantsInMasterRepository;
    protected TypeInt32 type;
    protected TypeInt32 usedJournal;
    @XmlElement(nillable = true)
    protected List<WsVehicle> vehicles;

    /**
     * Recupera il valore della proprietà aniaVehicleTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANIAVehicleTypeCode() {
        return aniaVehicleTypeCode;
    }

    /**
     * Imposta il valore della proprietà aniaVehicleTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANIAVehicleTypeCode(String value) {
        this.aniaVehicleTypeCode = value;
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
     * Recupera il valore della proprietà dataDownloadFromANIA.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getDataDownloadFromANIA() {
        return dataDownloadFromANIA;
    }

    /**
     * Imposta il valore della proprietà dataDownloadFromANIA.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setDataDownloadFromANIA(TypeInt32 value) {
        this.dataDownloadFromANIA = value;
    }

    /**
     * Recupera il valore della proprietà dataDownloadPriority.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getDataDownloadPriority() {
        return dataDownloadPriority;
    }

    /**
     * Imposta il valore della proprietà dataDownloadPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setDataDownloadPriority(TypeInt32 value) {
        this.dataDownloadPriority = value;
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
     * Recupera il valore della proprietà driversInMasterRepository.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getDriversInMasterRepository() {
        return driversInMasterRepository;
    }

    /**
     * Imposta il valore della proprietà driversInMasterRepository.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setDriversInMasterRepository(TypeBooleano value) {
        this.driversInMasterRepository = value;
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
     * Recupera il valore della proprietà firstAddressMode.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getFirstAddressMode() {
        return firstAddressMode;
    }

    /**
     * Imposta il valore della proprietà firstAddressMode.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setFirstAddressMode(TypeInt32 value) {
        this.firstAddressMode = value;
    }

    /**
     * Recupera il valore della proprietà firstPartyMode.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getFirstPartyMode() {
        return firstPartyMode;
    }

    /**
     * Imposta il valore della proprietà firstPartyMode.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setFirstPartyMode(TypeInt32 value) {
        this.firstPartyMode = value;
    }

    /**
     * Recupera il valore della proprietà inheritSettingsInstances.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getInheritSettingsInstances() {
        return inheritSettingsInstances;
    }

    /**
     * Imposta il valore della proprietà inheritSettingsInstances.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setInheritSettingsInstances(TypeInt32 value) {
        this.inheritSettingsInstances = value;
    }

    /**
     * Gets the value of the instances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsAssetInstance }
     * 
     * 
     */
    public List<WsAssetInstance> getInstances() {
        if (instances == null) {
            instances = new ArrayList<WsAssetInstance>();
        }
        return this.instances;
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
     * Recupera il valore della proprietà maxActivities.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMaxActivities() {
        return maxActivities;
    }

    /**
     * Imposta il valore della proprietà maxActivities.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMaxActivities(TypeInt32 value) {
        this.maxActivities = value;
    }

    /**
     * Recupera il valore della proprietà maxDrivers.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMaxDrivers() {
        return maxDrivers;
    }

    /**
     * Imposta il valore della proprietà maxDrivers.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMaxDrivers(TypeInt32 value) {
        this.maxDrivers = value;
    }

    /**
     * Recupera il valore della proprietà maxInstance.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMaxInstance() {
        return maxInstance;
    }

    /**
     * Imposta il valore della proprietà maxInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMaxInstance(TypeInt32 value) {
        this.maxInstance = value;
    }

    /**
     * Recupera il valore della proprietà maxLocations.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMaxLocations() {
        return maxLocations;
    }

    /**
     * Imposta il valore della proprietà maxLocations.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMaxLocations(TypeInt32 value) {
        this.maxLocations = value;
    }

    /**
     * Recupera il valore della proprietà maxOwners.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMaxOwners() {
        return maxOwners;
    }

    /**
     * Imposta il valore della proprietà maxOwners.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMaxOwners(TypeInt32 value) {
        this.maxOwners = value;
    }

    /**
     * Recupera il valore della proprietà maxParties.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMaxParties() {
        return maxParties;
    }

    /**
     * Imposta il valore della proprietà maxParties.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMaxParties(TypeInt32 value) {
        this.maxParties = value;
    }

    /**
     * Recupera il valore della proprietà maxTenants.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMaxTenants() {
        return maxTenants;
    }

    /**
     * Imposta il valore della proprietà maxTenants.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMaxTenants(TypeInt32 value) {
        this.maxTenants = value;
    }

    /**
     * Recupera il valore della proprietà minActivities.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMinActivities() {
        return minActivities;
    }

    /**
     * Imposta il valore della proprietà minActivities.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMinActivities(TypeInt32 value) {
        this.minActivities = value;
    }

    /**
     * Recupera il valore della proprietà minDrivers.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMinDrivers() {
        return minDrivers;
    }

    /**
     * Imposta il valore della proprietà minDrivers.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMinDrivers(TypeInt32 value) {
        this.minDrivers = value;
    }

    /**
     * Recupera il valore della proprietà minInstance.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMinInstance() {
        return minInstance;
    }

    /**
     * Imposta il valore della proprietà minInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMinInstance(TypeInt32 value) {
        this.minInstance = value;
    }

    /**
     * Recupera il valore della proprietà minLocations.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMinLocations() {
        return minLocations;
    }

    /**
     * Imposta il valore della proprietà minLocations.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMinLocations(TypeInt32 value) {
        this.minLocations = value;
    }

    /**
     * Recupera il valore della proprietà minOwners.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMinOwners() {
        return minOwners;
    }

    /**
     * Imposta il valore della proprietà minOwners.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMinOwners(TypeInt32 value) {
        this.minOwners = value;
    }

    /**
     * Recupera il valore della proprietà minParties.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMinParties() {
        return minParties;
    }

    /**
     * Imposta il valore della proprietà minParties.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMinParties(TypeInt32 value) {
        this.minParties = value;
    }

    /**
     * Recupera il valore della proprietà minTenants.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMinTenants() {
        return minTenants;
    }

    /**
     * Imposta il valore della proprietà minTenants.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMinTenants(TypeInt32 value) {
        this.minTenants = value;
    }

    /**
     * Recupera il valore della proprietà ownersInMasterRepository.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getOwnersInMasterRepository() {
        return ownersInMasterRepository;
    }

    /**
     * Imposta il valore della proprietà ownersInMasterRepository.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setOwnersInMasterRepository(TypeBooleano value) {
        this.ownersInMasterRepository = value;
    }

    /**
     * Recupera il valore della proprietà partyInMasterRepository.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getPartyInMasterRepository() {
        return partyInMasterRepository;
    }

    /**
     * Imposta il valore della proprietà partyInMasterRepository.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setPartyInMasterRepository(TypeBooleano value) {
        this.partyInMasterRepository = value;
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
     * Recupera il valore della proprietà quotable.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getQuotable() {
        return quotable;
    }

    /**
     * Imposta il valore della proprietà quotable.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setQuotable(TypeBooleano value) {
        this.quotable = value;
    }

    /**
     * Recupera il valore della proprietà tenantsInMasterRepository.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getTenantsInMasterRepository() {
        return tenantsInMasterRepository;
    }

    /**
     * Imposta il valore della proprietà tenantsInMasterRepository.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setTenantsInMasterRepository(TypeBooleano value) {
        this.tenantsInMasterRepository = value;
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
     * Gets the value of the vehicles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsVehicle }
     * 
     * 
     */
    public List<WsVehicle> getVehicles() {
        if (vehicles == null) {
            vehicles = new ArrayList<WsVehicle>();
        }
        return this.vehicles;
    }

}
