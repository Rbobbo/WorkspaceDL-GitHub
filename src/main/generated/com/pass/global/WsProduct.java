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
 * <p>Classe Java per wsProduct complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsProduct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activityPacket" type="{http://rgi.it/WSPassPro}wsActivityPacket" minOccurs="0"/&gt;
 *         &lt;element name="agreementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agreements" type="{http://rgi.it/WSPassPro}wsAgreement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="agreementsDate" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="applicationCertificateManagement" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="assetManagementMode" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="assets" type="{http://rgi.it/WSPassPro}wsAsset" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="beneficiaries" type="{http://rgi.it/WSPassPro}passProBeneficiary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="clauses" type="{http://rgi.it/WSPassPro}wsClause" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="coHolders" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="coInsurance" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="commonRisk" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="companies" type="{http://rgi.it/WSPassPro}wsCompany" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="companyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="couponDiscount" type="{http://rgi.it/WSPassPro}passProExtDiscount" minOccurs="0"/&gt;
 *         &lt;element name="currencies" type="{http://rgi.it/WSPassPro}wsCurrency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customProperties" type="{http://rgi.it/WSPassPro}wsProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dependenceBetweenRights" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="derogationLevel" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountApplicationPremiumType" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="discountedPremium" type="{http://rgi.it/WSPassPro}wsPremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="discountedPremiumAdjustedMin" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="discountedPremiumBelowMin" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="enoughDataForQuotation" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="exceptionListCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="facilitatedTaxAllowed" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="facilitatedTaxUse" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="factors" type="{http://rgi.it/WSPassPro}wsFactor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="flex" type="{http://rgi.it/WSPassPro}passProFlex" minOccurs="0"/&gt;
 *         &lt;element name="flex1Discount" type="{http://rgi.it/WSPassPro}passProExtDiscount" minOccurs="0"/&gt;
 *         &lt;element name="flex2" type="{http://rgi.it/WSPassPro}passProFlex" minOccurs="0"/&gt;
 *         &lt;element name="flex2Discount" type="{http://rgi.it/WSPassPro}passProExtDiscount" minOccurs="0"/&gt;
 *         &lt;element name="flexCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flexDate" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="holderType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="indexType" type="{http://rgi.it/WSPassPro}passProIndexType" minOccurs="0"/&gt;
 *         &lt;element name="indexTypes" type="{http://rgi.it/WSPassPro}passProIndexType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="indexation" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="indirectCoInsurance" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="instalmentDuration" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="insuredAsPolicyholder" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="levelMessagges" type="{http://rgi.it/WSPassPro}wsActionLevel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="life" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="lifePremium" type="{http://rgi.it/WSPassPro}passProLifePremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="linkedPolicies" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="maximumActualQuotedMinimumPremiumPerc" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="maximumScore" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="messages" type="{http://rgi.it/WSPassPro}wsMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="minimumActualQuotedMinimumPremiumPerc" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="minimumPremium" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="minimumPremiumActualQuotedPerc" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="minimumPremiumMode" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="minimumScore" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="multiAsset" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="obtainIndexTypes" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="openDate" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="operationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operationLevel" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="packetUnitSelectionMode" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="paymentFrequencies" type="{http://rgi.it/WSPassPro}wsPaymentFrequency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentFrequencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentMethodLifePremium" type="{http://rgi.it/WSPassPro}passProPaymentMethodLifePremium" minOccurs="0"/&gt;
 *         &lt;element name="paymentMethods" type="{http://rgi.it/WSPassPro}passProPaymentMethod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="plusDiscount" type="{http://rgi.it/WSPassPro}passProExtDiscount" minOccurs="0"/&gt;
 *         &lt;element name="policyDefDays" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="policyDefMonths" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="policyDefYears" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="policyDuration" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="policyMaxDays" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="policyMaxMonths" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="policyMaxYears" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="policyMinDays" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="policyMinMonths" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="policyMinYears" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="premium" type="{http://rgi.it/WSPassPro}wsPremiumGroup" minOccurs="0"/&gt;
 *         &lt;element name="premiumAdjustedMin" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="premiumAdjustment" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="premiumBelowMin" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="premiumRegulationTypes" type="{http://rgi.it/WSPassPro}passProPremiumRegulationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="questionnaires" type="{http://rgi.it/WSPassPro}wsQuestionnaire" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quotable" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="quoteValidityDays" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="rescindability" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="rescindabilityDate" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="rescindabilityDuration" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="restriction" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="retrieveDependencies" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="retrieveDependents" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="rights" type="{http://rgi.it/WSPassPro}passProRightsGroup" minOccurs="0"/&gt;
 *         &lt;element name="rightsAllowed" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="rightsAmountType" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="secondRisk" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="supplementaryPolicy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tacitRenewal" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="targetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="targets" type="{http://rgi.it/WSPassPro}passProTarget" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="taxDate" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="taxFree" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="taxTypes" type="{http://rgi.it/WSPassPro}passProTaxType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="taxesCalculationMode" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="technicalDivisionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transcoderCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transcoderCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://rgi.it/WSPassPro}wsType" minOccurs="0"/&gt;
 *         &lt;element name="userLevel" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="versionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="versionEndDate" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="versionStartDate" type="{http://rgi.it/WSPassPro}typeData" minOccurs="0"/&gt;
 *         &lt;element name="warranties" type="{http://rgi.it/WSPassPro}passProWarranty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="yearDuration" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsProduct", propOrder = {
    "activityPacket",
    "agreementCode",
    "agreements",
    "agreementsDate",
    "applicationCertificateManagement",
    "assetManagementMode",
    "assets",
    "beneficiaries",
    "clauses",
    "coHolders",
    "coInsurance",
    "code",
    "commonRisk",
    "companies",
    "companyCode",
    "couponDiscount",
    "currencies",
    "currencyCode",
    "customProperties",
    "dependenceBetweenRights",
    "derogationLevel",
    "description",
    "discountApplicationPremiumType",
    "discountedPremium",
    "discountedPremiumAdjustedMin",
    "discountedPremiumBelowMin",
    "enoughDataForQuotation",
    "exceptionListCode",
    "extendedDescription",
    "facilitatedTaxAllowed",
    "facilitatedTaxUse",
    "factors",
    "flex",
    "flex1Discount",
    "flex2",
    "flex2Discount",
    "flexCode",
    "flexDate",
    "holderType",
    "indexType",
    "indexTypes",
    "indexation",
    "indirectCoInsurance",
    "instalmentDuration",
    "insuredAsPolicyholder",
    "levelMessagges",
    "life",
    "lifePremium",
    "linkedPolicies",
    "maximumActualQuotedMinimumPremiumPerc",
    "maximumScore",
    "messages",
    "minimumActualQuotedMinimumPremiumPerc",
    "minimumPremium",
    "minimumPremiumActualQuotedPerc",
    "minimumPremiumMode",
    "minimumScore",
    "multiAsset",
    "obtainIndexTypes",
    "openDate",
    "operationCode",
    "operationLevel",
    "packetUnitSelectionMode",
    "paymentFrequencies",
    "paymentFrequencyCode",
    "paymentMethodCode",
    "paymentMethodLifePremium",
    "paymentMethods",
    "plusDiscount",
    "policyDefDays",
    "policyDefMonths",
    "policyDefYears",
    "policyDuration",
    "policyMaxDays",
    "policyMaxMonths",
    "policyMaxYears",
    "policyMinDays",
    "policyMinMonths",
    "policyMinYears",
    "premium",
    "premiumAdjustedMin",
    "premiumAdjustment",
    "premiumBelowMin",
    "premiumRegulationTypes",
    "questionnaires",
    "quotable",
    "quoteValidityDays",
    "rescindability",
    "rescindabilityDate",
    "rescindabilityDuration",
    "restriction",
    "retrieveDependencies",
    "retrieveDependents",
    "rights",
    "rightsAllowed",
    "rightsAmountType",
    "secondRisk",
    "supplementaryPolicy",
    "tacitRenewal",
    "targetCode",
    "targets",
    "taxDate",
    "taxFree",
    "taxTypes",
    "taxesCalculationMode",
    "technicalDivisionCode",
    "transcoderCode1",
    "transcoderCode2",
    "type",
    "userLevel",
    "versionCode",
    "versionEndDate",
    "versionStartDate",
    "warranties",
    "yearDuration"
})
public class WsProduct {

    protected WsActivityPacket activityPacket;
    protected String agreementCode;
    @XmlElement(nillable = true)
    protected List<WsAgreement> agreements;
    protected TypeData agreementsDate;
    protected TypeBooleano applicationCertificateManagement;
    protected TypeInt32 assetManagementMode;
    @XmlElement(nillable = true)
    protected List<WsAsset> assets;
    @XmlElement(nillable = true)
    protected List<PassProBeneficiary> beneficiaries;
    @XmlElement(nillable = true)
    protected List<WsClause> clauses;
    protected boolean coHolders;
    protected int coInsurance;
    protected String code;
    protected int commonRisk;
    @XmlElement(nillable = true)
    protected List<WsCompany> companies;
    protected String companyCode;
    protected PassProExtDiscount couponDiscount;
    @XmlElement(nillable = true)
    protected List<WsCurrency> currencies;
    protected String currencyCode;
    @XmlElement(nillable = true)
    protected List<WsProperty> customProperties;
    protected TypeInt32 dependenceBetweenRights;
    protected TypeInt32 derogationLevel;
    protected String description;
    protected TypeInt32 discountApplicationPremiumType;
    protected WsPremiumGroup discountedPremium;
    protected TypeBooleano discountedPremiumAdjustedMin;
    protected TypeBooleano discountedPremiumBelowMin;
    protected TypeBooleano enoughDataForQuotation;
    protected String exceptionListCode;
    protected String extendedDescription;
    protected TypeInt32 facilitatedTaxAllowed;
    protected TypeBooleano facilitatedTaxUse;
    @XmlElement(nillable = true)
    protected List<WsFactor> factors;
    protected PassProFlex flex;
    protected PassProExtDiscount flex1Discount;
    protected PassProFlex flex2;
    protected PassProExtDiscount flex2Discount;
    protected String flexCode;
    protected TypeData flexDate;
    protected int holderType;
    protected PassProIndexType indexType;
    @XmlElement(nillable = true)
    protected List<PassProIndexType> indexTypes;
    protected TypeInt32 indexation;
    protected int indirectCoInsurance;
    protected TypeInt32 instalmentDuration;
    protected TypeInt32 insuredAsPolicyholder;
    @XmlElement(nillable = true)
    protected List<WsActionLevel> levelMessagges;
    protected TypeBooleano life;
    protected PassProLifePremiumGroup lifePremium;
    protected TypeInt32 linkedPolicies;
    protected TypeReal maximumActualQuotedMinimumPremiumPerc;
    protected TypeInt32 maximumScore;
    @XmlElement(nillable = true)
    protected List<WsMessage> messages;
    protected TypeReal minimumActualQuotedMinimumPremiumPerc;
    protected double minimumPremium;
    protected TypeReal minimumPremiumActualQuotedPerc;
    protected TypeInt32 minimumPremiumMode;
    protected TypeInt32 minimumScore;
    protected TypeBooleano multiAsset;
    protected TypeBooleano obtainIndexTypes;
    protected TypeData openDate;
    protected String operationCode;
    protected TypeInt32 operationLevel;
    protected TypeInt32 packetUnitSelectionMode;
    @XmlElement(nillable = true)
    protected List<WsPaymentFrequency> paymentFrequencies;
    protected String paymentFrequencyCode;
    protected String paymentMethodCode;
    protected PassProPaymentMethodLifePremium paymentMethodLifePremium;
    @XmlElement(nillable = true)
    protected List<PassProPaymentMethod> paymentMethods;
    protected PassProExtDiscount plusDiscount;
    protected TypeInt32 policyDefDays;
    protected TypeInt32 policyDefMonths;
    protected TypeInt32 policyDefYears;
    protected TypeInt32 policyDuration;
    protected TypeInt32 policyMaxDays;
    protected TypeInt32 policyMaxMonths;
    protected TypeInt32 policyMaxYears;
    protected TypeInt32 policyMinDays;
    protected TypeInt32 policyMinMonths;
    protected TypeInt32 policyMinYears;
    protected WsPremiumGroup premium;
    protected TypeBooleano premiumAdjustedMin;
    protected TypeInt32 premiumAdjustment;
    protected TypeBooleano premiumBelowMin;
    @XmlElement(nillable = true)
    protected List<PassProPremiumRegulationType> premiumRegulationTypes;
    @XmlElement(nillable = true)
    protected List<WsQuestionnaire> questionnaires;
    protected TypeBooleano quotable;
    protected TypeInt32 quoteValidityDays;
    protected short rescindability;
    protected TypeData rescindabilityDate;
    protected int rescindabilityDuration;
    protected TypeInt32 restriction;
    protected TypeInt32 retrieveDependencies;
    protected TypeInt32 retrieveDependents;
    protected PassProRightsGroup rights;
    protected TypeInt32 rightsAllowed;
    protected TypeInt32 rightsAmountType;
    protected TypeInt32 secondRisk;
    protected int supplementaryPolicy;
    protected TypeInt32 tacitRenewal;
    protected String targetCode;
    @XmlElement(nillable = true)
    protected List<PassProTarget> targets;
    protected TypeData taxDate;
    protected TypeBooleano taxFree;
    @XmlElement(nillable = true)
    protected List<PassProTaxType> taxTypes;
    protected TypeInt32 taxesCalculationMode;
    protected String technicalDivisionCode;
    protected String transcoderCode1;
    protected String transcoderCode2;
    protected WsType type;
    protected TypeInt32 userLevel;
    protected String versionCode;
    protected TypeData versionEndDate;
    protected TypeData versionStartDate;
    @XmlElement(nillable = true)
    protected List<PassProWarranty> warranties;
    protected TypeInt32 yearDuration;

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
     * Recupera il valore della proprietà agreementCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementCode() {
        return agreementCode;
    }

    /**
     * Imposta il valore della proprietà agreementCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementCode(String value) {
        this.agreementCode = value;
    }

    /**
     * Gets the value of the agreements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgreements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsAgreement }
     * 
     * 
     */
    public List<WsAgreement> getAgreements() {
        if (agreements == null) {
            agreements = new ArrayList<WsAgreement>();
        }
        return this.agreements;
    }

    /**
     * Recupera il valore della proprietà agreementsDate.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getAgreementsDate() {
        return agreementsDate;
    }

    /**
     * Imposta il valore della proprietà agreementsDate.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setAgreementsDate(TypeData value) {
        this.agreementsDate = value;
    }

    /**
     * Recupera il valore della proprietà applicationCertificateManagement.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getApplicationCertificateManagement() {
        return applicationCertificateManagement;
    }

    /**
     * Imposta il valore della proprietà applicationCertificateManagement.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setApplicationCertificateManagement(TypeBooleano value) {
        this.applicationCertificateManagement = value;
    }

    /**
     * Recupera il valore della proprietà assetManagementMode.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getAssetManagementMode() {
        return assetManagementMode;
    }

    /**
     * Imposta il valore della proprietà assetManagementMode.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setAssetManagementMode(TypeInt32 value) {
        this.assetManagementMode = value;
    }

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
     * Recupera il valore della proprietà coHolders.
     * 
     */
    public boolean isCoHolders() {
        return coHolders;
    }

    /**
     * Imposta il valore della proprietà coHolders.
     * 
     */
    public void setCoHolders(boolean value) {
        this.coHolders = value;
    }

    /**
     * Recupera il valore della proprietà coInsurance.
     * 
     */
    public int getCoInsurance() {
        return coInsurance;
    }

    /**
     * Imposta il valore della proprietà coInsurance.
     * 
     */
    public void setCoInsurance(int value) {
        this.coInsurance = value;
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
     * Recupera il valore della proprietà commonRisk.
     * 
     */
    public int getCommonRisk() {
        return commonRisk;
    }

    /**
     * Imposta il valore della proprietà commonRisk.
     * 
     */
    public void setCommonRisk(int value) {
        this.commonRisk = value;
    }

    /**
     * Gets the value of the companies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsCompany }
     * 
     * 
     */
    public List<WsCompany> getCompanies() {
        if (companies == null) {
            companies = new ArrayList<WsCompany>();
        }
        return this.companies;
    }

    /**
     * Recupera il valore della proprietà companyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Imposta il valore della proprietà companyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
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
     * Gets the value of the currencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsCurrency }
     * 
     * 
     */
    public List<WsCurrency> getCurrencies() {
        if (currencies == null) {
            currencies = new ArrayList<WsCurrency>();
        }
        return this.currencies;
    }

    /**
     * Recupera il valore della proprietà currencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Imposta il valore della proprietà currencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
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
     * Recupera il valore della proprietà dependenceBetweenRights.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getDependenceBetweenRights() {
        return dependenceBetweenRights;
    }

    /**
     * Imposta il valore della proprietà dependenceBetweenRights.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setDependenceBetweenRights(TypeInt32 value) {
        this.dependenceBetweenRights = value;
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
     * Recupera il valore della proprietà discountApplicationPremiumType.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getDiscountApplicationPremiumType() {
        return discountApplicationPremiumType;
    }

    /**
     * Imposta il valore della proprietà discountApplicationPremiumType.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setDiscountApplicationPremiumType(TypeInt32 value) {
        this.discountApplicationPremiumType = value;
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
     * Recupera il valore della proprietà exceptionListCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionListCode() {
        return exceptionListCode;
    }

    /**
     * Imposta il valore della proprietà exceptionListCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionListCode(String value) {
        this.exceptionListCode = value;
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
     * Recupera il valore della proprietà facilitatedTaxAllowed.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getFacilitatedTaxAllowed() {
        return facilitatedTaxAllowed;
    }

    /**
     * Imposta il valore della proprietà facilitatedTaxAllowed.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setFacilitatedTaxAllowed(TypeInt32 value) {
        this.facilitatedTaxAllowed = value;
    }

    /**
     * Recupera il valore della proprietà facilitatedTaxUse.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getFacilitatedTaxUse() {
        return facilitatedTaxUse;
    }

    /**
     * Imposta il valore della proprietà facilitatedTaxUse.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setFacilitatedTaxUse(TypeBooleano value) {
        this.facilitatedTaxUse = value;
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
     * Recupera il valore della proprietà flexCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexCode() {
        return flexCode;
    }

    /**
     * Imposta il valore della proprietà flexCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexCode(String value) {
        this.flexCode = value;
    }

    /**
     * Recupera il valore della proprietà flexDate.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getFlexDate() {
        return flexDate;
    }

    /**
     * Imposta il valore della proprietà flexDate.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setFlexDate(TypeData value) {
        this.flexDate = value;
    }

    /**
     * Recupera il valore della proprietà holderType.
     * 
     */
    public int getHolderType() {
        return holderType;
    }

    /**
     * Imposta il valore della proprietà holderType.
     * 
     */
    public void setHolderType(int value) {
        this.holderType = value;
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
     * Gets the value of the indexTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indexTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndexTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassProIndexType }
     * 
     * 
     */
    public List<PassProIndexType> getIndexTypes() {
        if (indexTypes == null) {
            indexTypes = new ArrayList<PassProIndexType>();
        }
        return this.indexTypes;
    }

    /**
     * Recupera il valore della proprietà indexation.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getIndexation() {
        return indexation;
    }

    /**
     * Imposta il valore della proprietà indexation.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setIndexation(TypeInt32 value) {
        this.indexation = value;
    }

    /**
     * Recupera il valore della proprietà indirectCoInsurance.
     * 
     */
    public int getIndirectCoInsurance() {
        return indirectCoInsurance;
    }

    /**
     * Imposta il valore della proprietà indirectCoInsurance.
     * 
     */
    public void setIndirectCoInsurance(int value) {
        this.indirectCoInsurance = value;
    }

    /**
     * Recupera il valore della proprietà instalmentDuration.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getInstalmentDuration() {
        return instalmentDuration;
    }

    /**
     * Imposta il valore della proprietà instalmentDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setInstalmentDuration(TypeInt32 value) {
        this.instalmentDuration = value;
    }

    /**
     * Recupera il valore della proprietà insuredAsPolicyholder.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getInsuredAsPolicyholder() {
        return insuredAsPolicyholder;
    }

    /**
     * Imposta il valore della proprietà insuredAsPolicyholder.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setInsuredAsPolicyholder(TypeInt32 value) {
        this.insuredAsPolicyholder = value;
    }

    /**
     * Gets the value of the levelMessagges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the levelMessagges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevelMessagges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsActionLevel }
     * 
     * 
     */
    public List<WsActionLevel> getLevelMessagges() {
        if (levelMessagges == null) {
            levelMessagges = new ArrayList<WsActionLevel>();
        }
        return this.levelMessagges;
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
     * Recupera il valore della proprietà linkedPolicies.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getLinkedPolicies() {
        return linkedPolicies;
    }

    /**
     * Imposta il valore della proprietà linkedPolicies.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setLinkedPolicies(TypeInt32 value) {
        this.linkedPolicies = value;
    }

    /**
     * Recupera il valore della proprietà maximumActualQuotedMinimumPremiumPerc.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getMaximumActualQuotedMinimumPremiumPerc() {
        return maximumActualQuotedMinimumPremiumPerc;
    }

    /**
     * Imposta il valore della proprietà maximumActualQuotedMinimumPremiumPerc.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setMaximumActualQuotedMinimumPremiumPerc(TypeReal value) {
        this.maximumActualQuotedMinimumPremiumPerc = value;
    }

    /**
     * Recupera il valore della proprietà maximumScore.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMaximumScore() {
        return maximumScore;
    }

    /**
     * Imposta il valore della proprietà maximumScore.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMaximumScore(TypeInt32 value) {
        this.maximumScore = value;
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
     * Recupera il valore della proprietà minimumActualQuotedMinimumPremiumPerc.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getMinimumActualQuotedMinimumPremiumPerc() {
        return minimumActualQuotedMinimumPremiumPerc;
    }

    /**
     * Imposta il valore della proprietà minimumActualQuotedMinimumPremiumPerc.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setMinimumActualQuotedMinimumPremiumPerc(TypeReal value) {
        this.minimumActualQuotedMinimumPremiumPerc = value;
    }

    /**
     * Recupera il valore della proprietà minimumPremium.
     * 
     */
    public double getMinimumPremium() {
        return minimumPremium;
    }

    /**
     * Imposta il valore della proprietà minimumPremium.
     * 
     */
    public void setMinimumPremium(double value) {
        this.minimumPremium = value;
    }

    /**
     * Recupera il valore della proprietà minimumPremiumActualQuotedPerc.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getMinimumPremiumActualQuotedPerc() {
        return minimumPremiumActualQuotedPerc;
    }

    /**
     * Imposta il valore della proprietà minimumPremiumActualQuotedPerc.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setMinimumPremiumActualQuotedPerc(TypeReal value) {
        this.minimumPremiumActualQuotedPerc = value;
    }

    /**
     * Recupera il valore della proprietà minimumPremiumMode.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMinimumPremiumMode() {
        return minimumPremiumMode;
    }

    /**
     * Imposta il valore della proprietà minimumPremiumMode.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMinimumPremiumMode(TypeInt32 value) {
        this.minimumPremiumMode = value;
    }

    /**
     * Recupera il valore della proprietà minimumScore.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMinimumScore() {
        return minimumScore;
    }

    /**
     * Imposta il valore della proprietà minimumScore.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMinimumScore(TypeInt32 value) {
        this.minimumScore = value;
    }

    /**
     * Recupera il valore della proprietà multiAsset.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getMultiAsset() {
        return multiAsset;
    }

    /**
     * Imposta il valore della proprietà multiAsset.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setMultiAsset(TypeBooleano value) {
        this.multiAsset = value;
    }

    /**
     * Recupera il valore della proprietà obtainIndexTypes.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getObtainIndexTypes() {
        return obtainIndexTypes;
    }

    /**
     * Imposta il valore della proprietà obtainIndexTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setObtainIndexTypes(TypeBooleano value) {
        this.obtainIndexTypes = value;
    }

    /**
     * Recupera il valore della proprietà openDate.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getOpenDate() {
        return openDate;
    }

    /**
     * Imposta il valore della proprietà openDate.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setOpenDate(TypeData value) {
        this.openDate = value;
    }

    /**
     * Recupera il valore della proprietà operationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * Imposta il valore della proprietà operationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationCode(String value) {
        this.operationCode = value;
    }

    /**
     * Recupera il valore della proprietà operationLevel.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getOperationLevel() {
        return operationLevel;
    }

    /**
     * Imposta il valore della proprietà operationLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setOperationLevel(TypeInt32 value) {
        this.operationLevel = value;
    }

    /**
     * Recupera il valore della proprietà packetUnitSelectionMode.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getPacketUnitSelectionMode() {
        return packetUnitSelectionMode;
    }

    /**
     * Imposta il valore della proprietà packetUnitSelectionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setPacketUnitSelectionMode(TypeInt32 value) {
        this.packetUnitSelectionMode = value;
    }

    /**
     * Gets the value of the paymentFrequencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentFrequencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentFrequencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsPaymentFrequency }
     * 
     * 
     */
    public List<WsPaymentFrequency> getPaymentFrequencies() {
        if (paymentFrequencies == null) {
            paymentFrequencies = new ArrayList<WsPaymentFrequency>();
        }
        return this.paymentFrequencies;
    }

    /**
     * Recupera il valore della proprietà paymentFrequencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentFrequencyCode() {
        return paymentFrequencyCode;
    }

    /**
     * Imposta il valore della proprietà paymentFrequencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentFrequencyCode(String value) {
        this.paymentFrequencyCode = value;
    }

    /**
     * Recupera il valore della proprietà paymentMethodCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodCode() {
        return paymentMethodCode;
    }

    /**
     * Imposta il valore della proprietà paymentMethodCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodCode(String value) {
        this.paymentMethodCode = value;
    }

    /**
     * Recupera il valore della proprietà paymentMethodLifePremium.
     * 
     * @return
     *     possible object is
     *     {@link PassProPaymentMethodLifePremium }
     *     
     */
    public PassProPaymentMethodLifePremium getPaymentMethodLifePremium() {
        return paymentMethodLifePremium;
    }

    /**
     * Imposta il valore della proprietà paymentMethodLifePremium.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProPaymentMethodLifePremium }
     *     
     */
    public void setPaymentMethodLifePremium(PassProPaymentMethodLifePremium value) {
        this.paymentMethodLifePremium = value;
    }

    /**
     * Gets the value of the paymentMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassProPaymentMethod }
     * 
     * 
     */
    public List<PassProPaymentMethod> getPaymentMethods() {
        if (paymentMethods == null) {
            paymentMethods = new ArrayList<PassProPaymentMethod>();
        }
        return this.paymentMethods;
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
     * Recupera il valore della proprietà policyDefDays.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getPolicyDefDays() {
        return policyDefDays;
    }

    /**
     * Imposta il valore della proprietà policyDefDays.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setPolicyDefDays(TypeInt32 value) {
        this.policyDefDays = value;
    }

    /**
     * Recupera il valore della proprietà policyDefMonths.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getPolicyDefMonths() {
        return policyDefMonths;
    }

    /**
     * Imposta il valore della proprietà policyDefMonths.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setPolicyDefMonths(TypeInt32 value) {
        this.policyDefMonths = value;
    }

    /**
     * Recupera il valore della proprietà policyDefYears.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getPolicyDefYears() {
        return policyDefYears;
    }

    /**
     * Imposta il valore della proprietà policyDefYears.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setPolicyDefYears(TypeInt32 value) {
        this.policyDefYears = value;
    }

    /**
     * Recupera il valore della proprietà policyDuration.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getPolicyDuration() {
        return policyDuration;
    }

    /**
     * Imposta il valore della proprietà policyDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setPolicyDuration(TypeInt32 value) {
        this.policyDuration = value;
    }

    /**
     * Recupera il valore della proprietà policyMaxDays.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getPolicyMaxDays() {
        return policyMaxDays;
    }

    /**
     * Imposta il valore della proprietà policyMaxDays.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setPolicyMaxDays(TypeInt32 value) {
        this.policyMaxDays = value;
    }

    /**
     * Recupera il valore della proprietà policyMaxMonths.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getPolicyMaxMonths() {
        return policyMaxMonths;
    }

    /**
     * Imposta il valore della proprietà policyMaxMonths.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setPolicyMaxMonths(TypeInt32 value) {
        this.policyMaxMonths = value;
    }

    /**
     * Recupera il valore della proprietà policyMaxYears.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getPolicyMaxYears() {
        return policyMaxYears;
    }

    /**
     * Imposta il valore della proprietà policyMaxYears.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setPolicyMaxYears(TypeInt32 value) {
        this.policyMaxYears = value;
    }

    /**
     * Recupera il valore della proprietà policyMinDays.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getPolicyMinDays() {
        return policyMinDays;
    }

    /**
     * Imposta il valore della proprietà policyMinDays.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setPolicyMinDays(TypeInt32 value) {
        this.policyMinDays = value;
    }

    /**
     * Recupera il valore della proprietà policyMinMonths.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getPolicyMinMonths() {
        return policyMinMonths;
    }

    /**
     * Imposta il valore della proprietà policyMinMonths.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setPolicyMinMonths(TypeInt32 value) {
        this.policyMinMonths = value;
    }

    /**
     * Recupera il valore della proprietà policyMinYears.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getPolicyMinYears() {
        return policyMinYears;
    }

    /**
     * Imposta il valore della proprietà policyMinYears.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setPolicyMinYears(TypeInt32 value) {
        this.policyMinYears = value;
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
     * Recupera il valore della proprietà premiumAdjustment.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getPremiumAdjustment() {
        return premiumAdjustment;
    }

    /**
     * Imposta il valore della proprietà premiumAdjustment.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setPremiumAdjustment(TypeInt32 value) {
        this.premiumAdjustment = value;
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
     * Gets the value of the premiumRegulationTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premiumRegulationTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremiumRegulationTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassProPremiumRegulationType }
     * 
     * 
     */
    public List<PassProPremiumRegulationType> getPremiumRegulationTypes() {
        if (premiumRegulationTypes == null) {
            premiumRegulationTypes = new ArrayList<PassProPremiumRegulationType>();
        }
        return this.premiumRegulationTypes;
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
     * Recupera il valore della proprietà quoteValidityDays.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getQuoteValidityDays() {
        return quoteValidityDays;
    }

    /**
     * Imposta il valore della proprietà quoteValidityDays.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setQuoteValidityDays(TypeInt32 value) {
        this.quoteValidityDays = value;
    }

    /**
     * Recupera il valore della proprietà rescindability.
     * 
     */
    public short getRescindability() {
        return rescindability;
    }

    /**
     * Imposta il valore della proprietà rescindability.
     * 
     */
    public void setRescindability(short value) {
        this.rescindability = value;
    }

    /**
     * Recupera il valore della proprietà rescindabilityDate.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getRescindabilityDate() {
        return rescindabilityDate;
    }

    /**
     * Imposta il valore della proprietà rescindabilityDate.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setRescindabilityDate(TypeData value) {
        this.rescindabilityDate = value;
    }

    /**
     * Recupera il valore della proprietà rescindabilityDuration.
     * 
     */
    public int getRescindabilityDuration() {
        return rescindabilityDuration;
    }

    /**
     * Imposta il valore della proprietà rescindabilityDuration.
     * 
     */
    public void setRescindabilityDuration(int value) {
        this.rescindabilityDuration = value;
    }

    /**
     * Recupera il valore della proprietà restriction.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getRestriction() {
        return restriction;
    }

    /**
     * Imposta il valore della proprietà restriction.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setRestriction(TypeInt32 value) {
        this.restriction = value;
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
     * Recupera il valore della proprietà rights.
     * 
     * @return
     *     possible object is
     *     {@link PassProRightsGroup }
     *     
     */
    public PassProRightsGroup getRights() {
        return rights;
    }

    /**
     * Imposta il valore della proprietà rights.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProRightsGroup }
     *     
     */
    public void setRights(PassProRightsGroup value) {
        this.rights = value;
    }

    /**
     * Recupera il valore della proprietà rightsAllowed.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getRightsAllowed() {
        return rightsAllowed;
    }

    /**
     * Imposta il valore della proprietà rightsAllowed.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setRightsAllowed(TypeInt32 value) {
        this.rightsAllowed = value;
    }

    /**
     * Recupera il valore della proprietà rightsAmountType.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getRightsAmountType() {
        return rightsAmountType;
    }

    /**
     * Imposta il valore della proprietà rightsAmountType.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setRightsAmountType(TypeInt32 value) {
        this.rightsAmountType = value;
    }

    /**
     * Recupera il valore della proprietà secondRisk.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getSecondRisk() {
        return secondRisk;
    }

    /**
     * Imposta il valore della proprietà secondRisk.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setSecondRisk(TypeInt32 value) {
        this.secondRisk = value;
    }

    /**
     * Recupera il valore della proprietà supplementaryPolicy.
     * 
     */
    public int getSupplementaryPolicy() {
        return supplementaryPolicy;
    }

    /**
     * Imposta il valore della proprietà supplementaryPolicy.
     * 
     */
    public void setSupplementaryPolicy(int value) {
        this.supplementaryPolicy = value;
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
     * Recupera il valore della proprietà targetCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCode() {
        return targetCode;
    }

    /**
     * Imposta il valore della proprietà targetCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCode(String value) {
        this.targetCode = value;
    }

    /**
     * Gets the value of the targets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassProTarget }
     * 
     * 
     */
    public List<PassProTarget> getTargets() {
        if (targets == null) {
            targets = new ArrayList<PassProTarget>();
        }
        return this.targets;
    }

    /**
     * Recupera il valore della proprietà taxDate.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getTaxDate() {
        return taxDate;
    }

    /**
     * Imposta il valore della proprietà taxDate.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setTaxDate(TypeData value) {
        this.taxDate = value;
    }

    /**
     * Recupera il valore della proprietà taxFree.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getTaxFree() {
        return taxFree;
    }

    /**
     * Imposta il valore della proprietà taxFree.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setTaxFree(TypeBooleano value) {
        this.taxFree = value;
    }

    /**
     * Gets the value of the taxTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassProTaxType }
     * 
     * 
     */
    public List<PassProTaxType> getTaxTypes() {
        if (taxTypes == null) {
            taxTypes = new ArrayList<PassProTaxType>();
        }
        return this.taxTypes;
    }

    /**
     * Recupera il valore della proprietà taxesCalculationMode.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getTaxesCalculationMode() {
        return taxesCalculationMode;
    }

    /**
     * Imposta il valore della proprietà taxesCalculationMode.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setTaxesCalculationMode(TypeInt32 value) {
        this.taxesCalculationMode = value;
    }

    /**
     * Recupera il valore della proprietà technicalDivisionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalDivisionCode() {
        return technicalDivisionCode;
    }

    /**
     * Imposta il valore della proprietà technicalDivisionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalDivisionCode(String value) {
        this.technicalDivisionCode = value;
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
     *     {@link WsType }
     *     
     */
    public WsType getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link WsType }
     *     
     */
    public void setType(WsType value) {
        this.type = value;
    }

    /**
     * Recupera il valore della proprietà userLevel.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getUserLevel() {
        return userLevel;
    }

    /**
     * Imposta il valore della proprietà userLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setUserLevel(TypeInt32 value) {
        this.userLevel = value;
    }

    /**
     * Recupera il valore della proprietà versionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionCode() {
        return versionCode;
    }

    /**
     * Imposta il valore della proprietà versionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionCode(String value) {
        this.versionCode = value;
    }

    /**
     * Recupera il valore della proprietà versionEndDate.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getVersionEndDate() {
        return versionEndDate;
    }

    /**
     * Imposta il valore della proprietà versionEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setVersionEndDate(TypeData value) {
        this.versionEndDate = value;
    }

    /**
     * Recupera il valore della proprietà versionStartDate.
     * 
     * @return
     *     possible object is
     *     {@link TypeData }
     *     
     */
    public TypeData getVersionStartDate() {
        return versionStartDate;
    }

    /**
     * Imposta il valore della proprietà versionStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeData }
     *     
     */
    public void setVersionStartDate(TypeData value) {
        this.versionStartDate = value;
    }

    /**
     * Gets the value of the warranties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warranties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarranties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassProWarranty }
     * 
     * 
     */
    public List<PassProWarranty> getWarranties() {
        if (warranties == null) {
            warranties = new ArrayList<PassProWarranty>();
        }
        return this.warranties;
    }

    /**
     * Recupera il valore della proprietà yearDuration.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getYearDuration() {
        return yearDuration;
    }

    /**
     * Imposta il valore della proprietà yearDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setYearDuration(TypeInt32 value) {
        this.yearDuration = value;
    }

}
