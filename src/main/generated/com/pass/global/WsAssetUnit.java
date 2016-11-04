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
 * <p>Classe Java per wsAssetUnit complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsAssetUnit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessory" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="admittedPremium" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="annuityPaymentFrequencies" type="{http://rgi.it/WSPassPro}wsPaymentFrequency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="annuityPaymentFrequencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="baseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beneficiaries" type="{http://rgi.it/WSPassPro}passProBeneficiary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="children" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="clauses" type="{http://rgi.it/WSPassPro}wsClause" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="complementary" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="couponDiscount" type="{http://rgi.it/WSPassPro}passProExtDiscount" minOccurs="0"/&gt;
 *         &lt;element name="customProperties" type="{http://rgi.it/WSPassPro}wsProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="decreasePaymentFrequencies" type="{http://rgi.it/WSPassPro}wsPaymentFrequency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="decreasePaymentFrequencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="derogationLevel" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountable" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="discountedPremium" type="{http://rgi.it/WSPassPro}wsPremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="editablePremium" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="editablePremiumIfZero" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="enable" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="extendedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="factors" type="{http://rgi.it/WSPassPro}wsFactor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="flex1Discount" type="{http://rgi.it/WSPassPro}passProExtDiscount" minOccurs="0"/&gt;
 *         &lt;element name="flex2Discount" type="{http://rgi.it/WSPassPro}passProExtDiscount" minOccurs="0"/&gt;
 *         &lt;element name="indexType" type="{http://rgi.it/WSPassPro}passProIndexType" minOccurs="0"/&gt;
 *         &lt;element name="inputPremiumType" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="instances" type="{http://rgi.it/WSPassPro}wsUnitInstance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="life" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="lifePremium" type="{http://rgi.it/WSPassPro}passProLifePremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="loanInterestsPaymentFrequencies" type="{http://rgi.it/WSPassPro}wsPaymentFrequency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="loanInterestsPaymentFrequencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="manuallySet" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="maxInstances" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="minInstances" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="order" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="parents" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentMethod" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="plusDiscount" type="{http://rgi.it/WSPassPro}passProExtDiscount" minOccurs="0"/&gt;
 *         &lt;element name="premium" type="{http://rgi.it/WSPassPro}wsPremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="retrieveDependencies" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="retrieveDependents" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="riskCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="selection" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="tacitRenewal" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="tariffDate" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="transcoderCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transcoderCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitInAgreement" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="visibilityLevel" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="visible" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="warrantyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantyUnitShares" type="{http://rgi.it/WSPassPro}passProWarrantyUnitShare" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="withdrawalAccessory" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsAssetUnit", propOrder = {
    "accessory",
    "admittedPremium",
    "annuityPaymentFrequencies",
    "annuityPaymentFrequencyCode",
    "base",
    "baseCode",
    "beneficiaries",
    "childrens",
    "clauses",
    "code",
    "complementary",
    "couponDiscount",
    "customProperties",
    "decreasePaymentFrequencies",
    "decreasePaymentFrequencyCode",
    "derogationLevel",
    "description",
    "discountable",
    "discountedPremium",
    "editablePremium",
    "editablePremiumIfZero",
    "enable",
    "extendedDescription",
    "factors",
    "flex1Discount",
    "flex2Discount",
    "indexType",
    "inputPremiumType",
    "instances",
    "life",
    "lifePremium",
    "loanInterestsPaymentFrequencies",
    "loanInterestsPaymentFrequencyCode",
    "manuallySet",
    "maxInstances",
    "minInstances",
    "order",
    "parents",
    "paymentMethod",
    "plusDiscount",
    "premium",
    "retrieveDependencies",
    "retrieveDependents",
    "riskCode",
    "selection",
    "tacitRenewal",
    "tariffDate",
    "transcoderCode1",
    "transcoderCode2",
    "unitInAgreement",
    "visibilityLevel",
    "visible",
    "warrantyCode",
    "warrantyUnitShares",
    "withdrawalAccessory"
})
public class WsAssetUnit {

    protected TypeBooleano accessory;
    protected TypeBooleano admittedPremium;
    @XmlElement(nillable = true)
    protected List<WsPaymentFrequency> annuityPaymentFrequencies;
    protected String annuityPaymentFrequencyCode;
    protected TypeBooleano base;
    protected String baseCode;
    @XmlElement(nillable = true)
    protected List<PassProBeneficiary> beneficiaries;
    @XmlElement(name = "children", nillable = true)
    protected List<String> childrens;
    @XmlElement(nillable = true)
    protected List<WsClause> clauses;
    protected String code;
    protected TypeBooleano complementary;
    protected PassProExtDiscount couponDiscount;
    @XmlElement(nillable = true)
    protected List<WsProperty> customProperties;
    @XmlElement(nillable = true)
    protected List<WsPaymentFrequency> decreasePaymentFrequencies;
    protected String decreasePaymentFrequencyCode;
    protected TypeInt32 derogationLevel;
    protected String description;
    protected TypeBooleano discountable;
    protected WsPremiumGroup discountedPremium;
    protected TypeBooleano editablePremium;
    protected TypeBooleano editablePremiumIfZero;
    protected TypeBooleano enable;
    protected String extendedDescription;
    @XmlElement(nillable = true)
    protected List<WsFactor> factors;
    protected PassProExtDiscount flex1Discount;
    protected PassProExtDiscount flex2Discount;
    protected PassProIndexType indexType;
    protected TypeInt32 inputPremiumType;
    @XmlElement(nillable = true)
    protected List<WsUnitInstance> instances;
    protected TypeBooleano life;
    protected PassProLifePremiumGroup lifePremium;
    @XmlElement(nillable = true)
    protected List<WsPaymentFrequency> loanInterestsPaymentFrequencies;
    protected String loanInterestsPaymentFrequencyCode;
    protected TypeBooleano manuallySet;
    protected TypeInt32 maxInstances;
    protected TypeInt32 minInstances;
    protected TypeInt32 order;
    @XmlElement(nillable = true)
    protected List<String> parents;
    protected TypeInt32 paymentMethod;
    protected PassProExtDiscount plusDiscount;
    protected WsPremiumGroup premium;
    protected TypeInt32 retrieveDependencies;
    protected TypeInt32 retrieveDependents;
    protected String riskCode;
    protected TypeBooleano selection;
    protected TypeInt32 tacitRenewal;
    protected TypeData tariffDate;
    protected String transcoderCode1;
    protected String transcoderCode2;
    protected TypeBooleano unitInAgreement;
    protected TypeInt32 visibilityLevel;
    protected TypeBooleano visible;
    protected String warrantyCode;
    @XmlElement(nillable = true)
    protected List<PassProWarrantyUnitShare> warrantyUnitShares;
    protected TypeBooleano withdrawalAccessory;

    /**
     * Recupera il valore della proprietà accessory.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getAccessory() {
        return accessory;
    }

    /**
     * Imposta il valore della proprietà accessory.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setAccessory(TypeBooleano value) {
        this.accessory = value;
    }

    /**
     * Recupera il valore della proprietà admittedPremium.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getAdmittedPremium() {
        return admittedPremium;
    }

    /**
     * Imposta il valore della proprietà admittedPremium.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setAdmittedPremium(TypeBooleano value) {
        this.admittedPremium = value;
    }

    /**
     * Gets the value of the annuityPaymentFrequencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annuityPaymentFrequencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnuityPaymentFrequencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsPaymentFrequency }
     * 
     * 
     */
    public List<WsPaymentFrequency> getAnnuityPaymentFrequencies() {
        if (annuityPaymentFrequencies == null) {
            annuityPaymentFrequencies = new ArrayList<WsPaymentFrequency>();
        }
        return this.annuityPaymentFrequencies;
    }

    /**
     * Recupera il valore della proprietà annuityPaymentFrequencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnuityPaymentFrequencyCode() {
        return annuityPaymentFrequencyCode;
    }

    /**
     * Imposta il valore della proprietà annuityPaymentFrequencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnuityPaymentFrequencyCode(String value) {
        this.annuityPaymentFrequencyCode = value;
    }

    /**
     * Recupera il valore della proprietà base.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getBase() {
        return base;
    }

    /**
     * Imposta il valore della proprietà base.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setBase(TypeBooleano value) {
        this.base = value;
    }

    /**
     * Recupera il valore della proprietà baseCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCode() {
        return baseCode;
    }

    /**
     * Imposta il valore della proprietà baseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCode(String value) {
        this.baseCode = value;
    }

    /**
     * Gets the value of the beneficiaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beneficiaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeneficiaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassProBeneficiary }
     * 
     * 
     */
    public List<PassProBeneficiary> getBeneficiaries() {
        if (beneficiaries == null) {
            beneficiaries = new ArrayList<PassProBeneficiary>();
        }
        return this.beneficiaries;
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
     * Recupera il valore della proprietà complementary.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getComplementary() {
        return complementary;
    }

    /**
     * Imposta il valore della proprietà complementary.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setComplementary(TypeBooleano value) {
        this.complementary = value;
    }

    /**
     * Recupera il valore della proprietà couponDiscount.
     * 
     * @return
     *     possible object is
     *     {@link PassProExtDiscount }
     *     
     */
    public PassProExtDiscount getCouponDiscount() {
        return couponDiscount;
    }

    /**
     * Imposta il valore della proprietà couponDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProExtDiscount }
     *     
     */
    public void setCouponDiscount(PassProExtDiscount value) {
        this.couponDiscount = value;
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
     * Gets the value of the decreasePaymentFrequencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decreasePaymentFrequencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecreasePaymentFrequencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsPaymentFrequency }
     * 
     * 
     */
    public List<WsPaymentFrequency> getDecreasePaymentFrequencies() {
        if (decreasePaymentFrequencies == null) {
            decreasePaymentFrequencies = new ArrayList<WsPaymentFrequency>();
        }
        return this.decreasePaymentFrequencies;
    }

    /**
     * Recupera il valore della proprietà decreasePaymentFrequencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecreasePaymentFrequencyCode() {
        return decreasePaymentFrequencyCode;
    }

    /**
     * Imposta il valore della proprietà decreasePaymentFrequencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecreasePaymentFrequencyCode(String value) {
        this.decreasePaymentFrequencyCode = value;
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
     * Recupera il valore della proprietà discountable.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getDiscountable() {
        return discountable;
    }

    /**
     * Imposta il valore della proprietà discountable.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setDiscountable(TypeBooleano value) {
        this.discountable = value;
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
     * Recupera il valore della proprietà editablePremium.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getEditablePremium() {
        return editablePremium;
    }

    /**
     * Imposta il valore della proprietà editablePremium.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setEditablePremium(TypeBooleano value) {
        this.editablePremium = value;
    }

    /**
     * Recupera il valore della proprietà editablePremiumIfZero.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getEditablePremiumIfZero() {
        return editablePremiumIfZero;
    }

    /**
     * Imposta il valore della proprietà editablePremiumIfZero.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setEditablePremiumIfZero(TypeBooleano value) {
        this.editablePremiumIfZero = value;
    }

    /**
     * Recupera il valore della proprietà enable.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getEnable() {
        return enable;
    }

    /**
     * Imposta il valore della proprietà enable.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setEnable(TypeBooleano value) {
        this.enable = value;
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
     * Recupera il valore della proprietà flex1Discount.
     * 
     * @return
     *     possible object is
     *     {@link PassProExtDiscount }
     *     
     */
    public PassProExtDiscount getFlex1Discount() {
        return flex1Discount;
    }

    /**
     * Imposta il valore della proprietà flex1Discount.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProExtDiscount }
     *     
     */
    public void setFlex1Discount(PassProExtDiscount value) {
        this.flex1Discount = value;
    }

    /**
     * Recupera il valore della proprietà flex2Discount.
     * 
     * @return
     *     possible object is
     *     {@link PassProExtDiscount }
     *     
     */
    public PassProExtDiscount getFlex2Discount() {
        return flex2Discount;
    }

    /**
     * Imposta il valore della proprietà flex2Discount.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProExtDiscount }
     *     
     */
    public void setFlex2Discount(PassProExtDiscount value) {
        this.flex2Discount = value;
    }

    /**
     * Recupera il valore della proprietà indexType.
     * 
     * @return
     *     possible object is
     *     {@link PassProIndexType }
     *     
     */
    public PassProIndexType getIndexType() {
        return indexType;
    }

    /**
     * Imposta il valore della proprietà indexType.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProIndexType }
     *     
     */
    public void setIndexType(PassProIndexType value) {
        this.indexType = value;
    }

    /**
     * Recupera il valore della proprietà inputPremiumType.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getInputPremiumType() {
        return inputPremiumType;
    }

    /**
     * Imposta il valore della proprietà inputPremiumType.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setInputPremiumType(TypeInt32 value) {
        this.inputPremiumType = value;
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
     * {@link WsUnitInstance }
     * 
     * 
     */
    public List<WsUnitInstance> getInstances() {
        if (instances == null) {
            instances = new ArrayList<WsUnitInstance>();
        }
        return this.instances;
    }

    /**
     * Recupera il valore della proprietà life.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getLife() {
        return life;
    }

    /**
     * Imposta il valore della proprietà life.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setLife(TypeBooleano value) {
        this.life = value;
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
     * Gets the value of the loanInterestsPaymentFrequencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanInterestsPaymentFrequencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanInterestsPaymentFrequencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsPaymentFrequency }
     * 
     * 
     */
    public List<WsPaymentFrequency> getLoanInterestsPaymentFrequencies() {
        if (loanInterestsPaymentFrequencies == null) {
            loanInterestsPaymentFrequencies = new ArrayList<WsPaymentFrequency>();
        }
        return this.loanInterestsPaymentFrequencies;
    }

    /**
     * Recupera il valore della proprietà loanInterestsPaymentFrequencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanInterestsPaymentFrequencyCode() {
        return loanInterestsPaymentFrequencyCode;
    }

    /**
     * Imposta il valore della proprietà loanInterestsPaymentFrequencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanInterestsPaymentFrequencyCode(String value) {
        this.loanInterestsPaymentFrequencyCode = value;
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
     * Recupera il valore della proprietà maxInstances.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMaxInstances() {
        return maxInstances;
    }

    /**
     * Imposta il valore della proprietà maxInstances.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMaxInstances(TypeInt32 value) {
        this.maxInstances = value;
    }

    /**
     * Recupera il valore della proprietà minInstances.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMinInstances() {
        return minInstances;
    }

    /**
     * Imposta il valore della proprietà minInstances.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMinInstances(TypeInt32 value) {
        this.minInstances = value;
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
     * Recupera il valore della proprietà paymentMethod.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Imposta il valore della proprietà paymentMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setPaymentMethod(TypeInt32 value) {
        this.paymentMethod = value;
    }

    /**
     * Recupera il valore della proprietà plusDiscount.
     * 
     * @return
     *     possible object is
     *     {@link PassProExtDiscount }
     *     
     */
    public PassProExtDiscount getPlusDiscount() {
        return plusDiscount;
    }

    /**
     * Imposta il valore della proprietà plusDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProExtDiscount }
     *     
     */
    public void setPlusDiscount(PassProExtDiscount value) {
        this.plusDiscount = value;
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
     * Recupera il valore della proprietà riskCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskCode() {
        return riskCode;
    }

    /**
     * Imposta il valore della proprietà riskCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskCode(String value) {
        this.riskCode = value;
    }

    /**
     * Recupera il valore della proprietà selection.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getSelection() {
        return selection;
    }

    /**
     * Imposta il valore della proprietà selection.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setSelection(TypeBooleano value) {
        this.selection = value;
    }

    /**
     * Recupera il valore della proprietà tacitRenewal.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getTacitRenewal() {
        return tacitRenewal;
    }

    /**
     * Imposta il valore della proprietà tacitRenewal.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setTacitRenewal(TypeInt32 value) {
        this.tacitRenewal = value;
    }

    /**
     * Recupera il valore della proprietà tariffDate.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getTariffDate() {
        return tariffDate;
    }

    /**
     * Imposta il valore della proprietà tariffDate.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setTariffDate(TypeData value) {
        this.tariffDate = value;
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
     * Recupera il valore della proprietà unitInAgreement.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getUnitInAgreement() {
        return unitInAgreement;
    }

    /**
     * Imposta il valore della proprietà unitInAgreement.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setUnitInAgreement(TypeBooleano value) {
        this.unitInAgreement = value;
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
     * Recupera il valore della proprietà warrantyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyCode() {
        return warrantyCode;
    }

    /**
     * Imposta il valore della proprietà warrantyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyCode(String value) {
        this.warrantyCode = value;
    }

    /**
     * Gets the value of the warrantyUnitShares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warrantyUnitShares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarrantyUnitShares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassProWarrantyUnitShare }
     * 
     * 
     */
    public List<PassProWarrantyUnitShare> getWarrantyUnitShares() {
        if (warrantyUnitShares == null) {
            warrantyUnitShares = new ArrayList<PassProWarrantyUnitShare>();
        }
        return this.warrantyUnitShares;
    }

    /**
     * Recupera il valore della proprietà withdrawalAccessory.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getWithdrawalAccessory() {
        return withdrawalAccessory;
    }

    /**
     * Imposta il valore della proprietà withdrawalAccessory.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setWithdrawalAccessory(TypeBooleano value) {
        this.withdrawalAccessory = value;
    }

}
