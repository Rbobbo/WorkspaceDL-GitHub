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
 * <p>Classe Java per wsUnitInstance complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsUnitInstance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calculatedPremium" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="clauses" type="{http://rgi.it/WSPassPro}wsClause" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="commission" type="{http://rgi.it/WSPassPro}passProCommission" minOccurs="0"/&gt;
 *         &lt;element name="couponDiscount" type="{http://rgi.it/WSPassPro}passProExtDiscount" minOccurs="0"/&gt;
 *         &lt;element name="discountedPremium" type="{http://rgi.it/WSPassPro}wsPremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="discountedPremiumAdjustedMin" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="discountedPremiumBelowMin" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="enableTariffFormulaLog" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="enoughDataForQuotation" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="errors" type="{http://rgi.it/WSPassPro}wsMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="evaluationFormulasMode" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="exceptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extraDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="factors" type="{http://rgi.it/WSPassPro}wsFactor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="flex" type="{http://rgi.it/WSPassPro}passProFlex" minOccurs="0"/&gt;
 *         &lt;element name="flex1Discount" type="{http://rgi.it/WSPassPro}passProExtDiscount" minOccurs="0"/&gt;
 *         &lt;element name="flex2" type="{http://rgi.it/WSPassPro}passProFlex" minOccurs="0"/&gt;
 *         &lt;element name="flex2Discount" type="{http://rgi.it/WSPassPro}passProExtDiscount" minOccurs="0"/&gt;
 *         &lt;element name="flexDiscount" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="formulas" type="{http://rgi.it/WSPassPro}wsFormula" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="generationDevelopmentsMode" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://rgi.it/WSPassPro}typeInt64" minOccurs="0"/&gt;
 *         &lt;element name="lifePremium" type="{http://rgi.it/WSPassPro}passProLifePremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plusDiscount" type="{http://rgi.it/WSPassPro}passProExtDiscount" minOccurs="0"/&gt;
 *         &lt;element name="premium" type="{http://rgi.it/WSPassPro}wsPremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="premiumAdjustedMin" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="premiumBelowMin" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="questionnaires" type="{http://rgi.it/WSPassPro}wsQuestionnaire" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quotes" type="{http://rgi.it/WSPassPro}passProQuote" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="settedPremium" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="tariffFormulaLog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tariffPremium" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="tariffPremiumType" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="tariffVersionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tariffVersionId" type="{http://rgi.it/WSPassPro}typeInt64" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsUnitInstance", propOrder = {
    "calculatedPremium",
    "clauses",
    "commission",
    "couponDiscount",
    "discountedPremium",
    "discountedPremiumAdjustedMin",
    "discountedPremiumBelowMin",
    "enableTariffFormulaLog",
    "enoughDataForQuotation",
    "errors",
    "evaluationFormulasMode",
    "exceptionCode",
    "extraDescription",
    "factors",
    "flex",
    "flex1Discount",
    "flex2",
    "flex2Discount",
    "flexDiscount",
    "formulas",
    "generationDevelopmentsMode",
    "id",
    "lifePremium",
    "name",
    "plusDiscount",
    "premium",
    "premiumAdjustedMin",
    "premiumBelowMin",
    "questionnaires",
    "quotes",
    "settedPremium",
    "tariffFormulaLog",
    "tariffPremium",
    "tariffPremiumType",
    "tariffVersionCode",
    "tariffVersionId"
})
public class WsUnitInstance {

    protected boolean calculatedPremium;
    @XmlElement(nillable = true)
    protected List<WsClause> clauses;
    protected PassProCommission commission;
    protected PassProExtDiscount couponDiscount;
    protected WsPremiumGroup discountedPremium;
    protected TypeBooleano discountedPremiumAdjustedMin;
    protected TypeBooleano discountedPremiumBelowMin;
    protected TypeBooleano enableTariffFormulaLog;
    protected TypeBooleano enoughDataForQuotation;
    @XmlElement(nillable = true)
    protected List<WsMessage> errors;
    protected TypeInt32 evaluationFormulasMode;
    protected String exceptionCode;
    protected String extraDescription;
    @XmlElement(nillable = true)
    protected List<WsFactor> factors;
    protected PassProFlex flex;
    protected PassProExtDiscount flex1Discount;
    protected PassProFlex flex2;
    protected PassProExtDiscount flex2Discount;
    protected TypeReal flexDiscount;
    @XmlElement(nillable = true)
    protected List<WsFormula> formulas;
    protected TypeInt32 generationDevelopmentsMode;
    @XmlElement(name = "ID")
    protected TypeInt64 id;
    protected PassProLifePremiumGroup lifePremium;
    protected String name;
    protected PassProExtDiscount plusDiscount;
    protected WsPremiumGroup premium;
    protected TypeBooleano premiumAdjustedMin;
    protected TypeBooleano premiumBelowMin;
    @XmlElement(nillable = true)
    protected List<WsQuestionnaire> questionnaires;
    @XmlElement(nillable = true)
    protected List<PassProQuote> quotes;
    protected boolean settedPremium;
    protected String tariffFormulaLog;
    protected TypeReal tariffPremium;
    protected TypeInt32 tariffPremiumType;
    protected String tariffVersionCode;
    protected TypeInt64 tariffVersionId;

    /**
     * Recupera il valore della proprietà calculatedPremium.
     * 
     */
    public boolean isCalculatedPremium() {
        return calculatedPremium;
    }

    /**
     * Imposta il valore della proprietà calculatedPremium.
     * 
     */
    public void setCalculatedPremium(boolean value) {
        this.calculatedPremium = value;
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
     * Recupera il valore della proprietà commission.
     * 
     * @return
     *     possible object is
     *     {@link PassProCommission }
     *     
     */
    public PassProCommission getCommission() {
        return commission;
    }

    /**
     * Imposta il valore della proprietà commission.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProCommission }
     *     
     */
    public void setCommission(PassProCommission value) {
        this.commission = value;
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
     * Recupera il valore della proprietà discountedPremiumAdjustedMin.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getDiscountedPremiumAdjustedMin() {
        return discountedPremiumAdjustedMin;
    }

    /**
     * Imposta il valore della proprietà discountedPremiumAdjustedMin.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setDiscountedPremiumAdjustedMin(TypeBooleano value) {
        this.discountedPremiumAdjustedMin = value;
    }

    /**
     * Recupera il valore della proprietà discountedPremiumBelowMin.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getDiscountedPremiumBelowMin() {
        return discountedPremiumBelowMin;
    }

    /**
     * Imposta il valore della proprietà discountedPremiumBelowMin.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setDiscountedPremiumBelowMin(TypeBooleano value) {
        this.discountedPremiumBelowMin = value;
    }

    /**
     * Recupera il valore della proprietà enableTariffFormulaLog.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getEnableTariffFormulaLog() {
        return enableTariffFormulaLog;
    }

    /**
     * Imposta il valore della proprietà enableTariffFormulaLog.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setEnableTariffFormulaLog(TypeBooleano value) {
        this.enableTariffFormulaLog = value;
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
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsMessage }
     * 
     * 
     */
    public List<WsMessage> getErrors() {
        if (errors == null) {
            errors = new ArrayList<WsMessage>();
        }
        return this.errors;
    }

    /**
     * Recupera il valore della proprietà evaluationFormulasMode.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getEvaluationFormulasMode() {
        return evaluationFormulasMode;
    }

    /**
     * Imposta il valore della proprietà evaluationFormulasMode.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setEvaluationFormulasMode(TypeInt32 value) {
        this.evaluationFormulasMode = value;
    }

    /**
     * Recupera il valore della proprietà exceptionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionCode() {
        return exceptionCode;
    }

    /**
     * Imposta il valore della proprietà exceptionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionCode(String value) {
        this.exceptionCode = value;
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
     * Recupera il valore della proprietà flex.
     * 
     * @return
     *     possible object is
     *     {@link PassProFlex }
     *     
     */
    public PassProFlex getFlex() {
        return flex;
    }

    /**
     * Imposta il valore della proprietà flex.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProFlex }
     *     
     */
    public void setFlex(PassProFlex value) {
        this.flex = value;
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
     * Recupera il valore della proprietà flex2.
     * 
     * @return
     *     possible object is
     *     {@link PassProFlex }
     *     
     */
    public PassProFlex getFlex2() {
        return flex2;
    }

    /**
     * Imposta il valore della proprietà flex2.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProFlex }
     *     
     */
    public void setFlex2(PassProFlex value) {
        this.flex2 = value;
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
     * Recupera il valore della proprietà flexDiscount.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getFlexDiscount() {
        return flexDiscount;
    }

    /**
     * Imposta il valore della proprietà flexDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setFlexDiscount(TypeReal value) {
        this.flexDiscount = value;
    }

    /**
     * Gets the value of the formulas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formulas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormulas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsFormula }
     * 
     * 
     */
    public List<WsFormula> getFormulas() {
        if (formulas == null) {
            formulas = new ArrayList<WsFormula>();
        }
        return this.formulas;
    }

    /**
     * Recupera il valore della proprietà generationDevelopmentsMode.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getGenerationDevelopmentsMode() {
        return generationDevelopmentsMode;
    }

    /**
     * Imposta il valore della proprietà generationDevelopmentsMode.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setGenerationDevelopmentsMode(TypeInt32 value) {
        this.generationDevelopmentsMode = value;
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
     * Recupera il valore della proprietà premiumAdjustedMin.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getPremiumAdjustedMin() {
        return premiumAdjustedMin;
    }

    /**
     * Imposta il valore della proprietà premiumAdjustedMin.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setPremiumAdjustedMin(TypeBooleano value) {
        this.premiumAdjustedMin = value;
    }

    /**
     * Recupera il valore della proprietà premiumBelowMin.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getPremiumBelowMin() {
        return premiumBelowMin;
    }

    /**
     * Imposta il valore della proprietà premiumBelowMin.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setPremiumBelowMin(TypeBooleano value) {
        this.premiumBelowMin = value;
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
     * Gets the value of the quotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassProQuote }
     * 
     * 
     */
    public List<PassProQuote> getQuotes() {
        if (quotes == null) {
            quotes = new ArrayList<PassProQuote>();
        }
        return this.quotes;
    }

    /**
     * Recupera il valore della proprietà settedPremium.
     * 
     */
    public boolean isSettedPremium() {
        return settedPremium;
    }

    /**
     * Imposta il valore della proprietà settedPremium.
     * 
     */
    public void setSettedPremium(boolean value) {
        this.settedPremium = value;
    }

    /**
     * Recupera il valore della proprietà tariffFormulaLog.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffFormulaLog() {
        return tariffFormulaLog;
    }

    /**
     * Imposta il valore della proprietà tariffFormulaLog.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffFormulaLog(String value) {
        this.tariffFormulaLog = value;
    }

    /**
     * Recupera il valore della proprietà tariffPremium.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getTariffPremium() {
        return tariffPremium;
    }

    /**
     * Imposta il valore della proprietà tariffPremium.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setTariffPremium(TypeReal value) {
        this.tariffPremium = value;
    }

    /**
     * Recupera il valore della proprietà tariffPremiumType.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getTariffPremiumType() {
        return tariffPremiumType;
    }

    /**
     * Imposta il valore della proprietà tariffPremiumType.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setTariffPremiumType(TypeInt32 value) {
        this.tariffPremiumType = value;
    }

    /**
     * Recupera il valore della proprietà tariffVersionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffVersionCode() {
        return tariffVersionCode;
    }

    /**
     * Imposta il valore della proprietà tariffVersionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffVersionCode(String value) {
        this.tariffVersionCode = value;
    }

    /**
     * Recupera il valore della proprietà tariffVersionId.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt64 }
     *     
     */
    public TypeInt64 getTariffVersionId() {
        return tariffVersionId;
    }

    /**
     * Imposta il valore della proprietà tariffVersionId.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt64 }
     *     
     */
    public void setTariffVersionId(TypeInt64 value) {
        this.tariffVersionId = value;
    }

}
