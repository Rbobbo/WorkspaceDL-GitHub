//
// Questo file Ŕ stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrÓ persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.11.03 alle 09:31:48 AM CET 
//


package com.pass.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per passProCommission complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="passProCommission"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activeCommListCurtailmentDisc" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="collAccPre" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="collAccRec" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="collAccTemp" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="collFirstAnnualPre" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="collFirstAnnualRec" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="collNetPre" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="collNetRec" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="collNetRenewalPre" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="collNetTemp" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentIACQR" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentIAIPR" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentICOFI" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentICOGE" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentIINCR" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentIRCPA" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPADIR" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPAIFR" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPAIMO" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPAIPR" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPAIRI" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPAPRN" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPASPA" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPASPP" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPASPS" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPASPT" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPCOFI" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPCOGE" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPIDIR" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPIIFR" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPIIMO" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPIIPR" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPIIRI" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPIPRN" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPISPA" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPISPP" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPISPS" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="componentPISPT" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="derogationLevel" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://rgi.it/WSPassPro}typeInt64" minOccurs="0"/&gt;
 *         &lt;element name="maxYearCalcPre" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="overCollAccRec" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="overCollNetRec" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="overPurcAccRec" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="overPurcNetRec" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="purcAccPre" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="purcAccRec" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="purcIndexLinked" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="purcInstalments" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="purcNetPre" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="purcNetRec" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="purcNetRenewalPre" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="purcRenewal" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="regPrAcc" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *         &lt;element name="regPrNet" type="{http://rgi.it/WSPassPro}typeReal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passProCommission", propOrder = {
    "activeCommListCurtailmentDisc",
    "code",
    "collAccPre",
    "collAccRec",
    "collAccTemp",
    "collFirstAnnualPre",
    "collFirstAnnualRec",
    "collNetPre",
    "collNetRec",
    "collNetRenewalPre",
    "collNetTemp",
    "componentIACQR",
    "componentIAIPR",
    "componentICOFI",
    "componentICOGE",
    "componentIINCR",
    "componentIRCPA",
    "componentPADIR",
    "componentPAIFR",
    "componentPAIMO",
    "componentPAIPR",
    "componentPAIRI",
    "componentPAPRN",
    "componentPASPA",
    "componentPASPP",
    "componentPASPS",
    "componentPASPT",
    "componentPCOFI",
    "componentPCOGE",
    "componentPIDIR",
    "componentPIIFR",
    "componentPIIMO",
    "componentPIIPR",
    "componentPIIRI",
    "componentPIPRN",
    "componentPISPA",
    "componentPISPP",
    "componentPISPS",
    "componentPISPT",
    "derogationLevel",
    "id",
    "maxYearCalcPre",
    "overCollAccRec",
    "overCollNetRec",
    "overPurcAccRec",
    "overPurcNetRec",
    "purcAccPre",
    "purcAccRec",
    "purcIndexLinked",
    "purcInstalments",
    "purcNetPre",
    "purcNetRec",
    "purcNetRenewalPre",
    "purcRenewal",
    "regPrAcc",
    "regPrNet"
})
public class PassProCommission {

    protected TypeBooleano activeCommListCurtailmentDisc;
    protected String code;
    protected TypeReal collAccPre;
    protected TypeReal collAccRec;
    protected TypeReal collAccTemp;
    protected TypeBooleano collFirstAnnualPre;
    protected TypeBooleano collFirstAnnualRec;
    protected TypeReal collNetPre;
    protected TypeReal collNetRec;
    protected TypeReal collNetRenewalPre;
    protected TypeReal collNetTemp;
    protected TypeReal componentIACQR;
    protected TypeReal componentIAIPR;
    protected TypeReal componentICOFI;
    protected TypeReal componentICOGE;
    protected TypeReal componentIINCR;
    protected TypeReal componentIRCPA;
    protected TypeReal componentPADIR;
    protected TypeReal componentPAIFR;
    protected TypeReal componentPAIMO;
    protected TypeReal componentPAIPR;
    protected TypeReal componentPAIRI;
    protected TypeReal componentPAPRN;
    protected TypeReal componentPASPA;
    protected TypeReal componentPASPP;
    protected TypeReal componentPASPS;
    protected TypeReal componentPASPT;
    protected TypeReal componentPCOFI;
    protected TypeReal componentPCOGE;
    protected TypeReal componentPIDIR;
    protected TypeReal componentPIIFR;
    protected TypeReal componentPIIMO;
    protected TypeReal componentPIIPR;
    protected TypeReal componentPIIRI;
    protected TypeReal componentPIPRN;
    protected TypeReal componentPISPA;
    protected TypeReal componentPISPP;
    protected TypeReal componentPISPS;
    protected TypeReal componentPISPT;
    protected TypeInt32 derogationLevel;
    @XmlElement(name = "ID")
    protected TypeInt64 id;
    protected TypeInt32 maxYearCalcPre;
    protected TypeReal overCollAccRec;
    protected TypeReal overCollNetRec;
    protected TypeReal overPurcAccRec;
    protected TypeReal overPurcNetRec;
    protected TypeReal purcAccPre;
    protected TypeReal purcAccRec;
    protected TypeBooleano purcIndexLinked;
    protected TypeBooleano purcInstalments;
    protected TypeReal purcNetPre;
    protected TypeReal purcNetRec;
    protected TypeReal purcNetRenewalPre;
    protected TypeBooleano purcRenewal;
    protected TypeReal regPrAcc;
    protected TypeReal regPrNet;

    /**
     * Recupera il valore della proprietÓ activeCommListCurtailmentDisc.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getActiveCommListCurtailmentDisc() {
        return activeCommListCurtailmentDisc;
    }

    /**
     * Imposta il valore della proprietÓ activeCommListCurtailmentDisc.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setActiveCommListCurtailmentDisc(TypeBooleano value) {
        this.activeCommListCurtailmentDisc = value;
    }

    /**
     * Recupera il valore della proprietÓ code.
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
     * Imposta il valore della proprietÓ code.
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
     * Recupera il valore della proprietÓ collAccPre.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getCollAccPre() {
        return collAccPre;
    }

    /**
     * Imposta il valore della proprietÓ collAccPre.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setCollAccPre(TypeReal value) {
        this.collAccPre = value;
    }

    /**
     * Recupera il valore della proprietÓ collAccRec.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getCollAccRec() {
        return collAccRec;
    }

    /**
     * Imposta il valore della proprietÓ collAccRec.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setCollAccRec(TypeReal value) {
        this.collAccRec = value;
    }

    /**
     * Recupera il valore della proprietÓ collAccTemp.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getCollAccTemp() {
        return collAccTemp;
    }

    /**
     * Imposta il valore della proprietÓ collAccTemp.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setCollAccTemp(TypeReal value) {
        this.collAccTemp = value;
    }

    /**
     * Recupera il valore della proprietÓ collFirstAnnualPre.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getCollFirstAnnualPre() {
        return collFirstAnnualPre;
    }

    /**
     * Imposta il valore della proprietÓ collFirstAnnualPre.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setCollFirstAnnualPre(TypeBooleano value) {
        this.collFirstAnnualPre = value;
    }

    /**
     * Recupera il valore della proprietÓ collFirstAnnualRec.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getCollFirstAnnualRec() {
        return collFirstAnnualRec;
    }

    /**
     * Imposta il valore della proprietÓ collFirstAnnualRec.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setCollFirstAnnualRec(TypeBooleano value) {
        this.collFirstAnnualRec = value;
    }

    /**
     * Recupera il valore della proprietÓ collNetPre.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getCollNetPre() {
        return collNetPre;
    }

    /**
     * Imposta il valore della proprietÓ collNetPre.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setCollNetPre(TypeReal value) {
        this.collNetPre = value;
    }

    /**
     * Recupera il valore della proprietÓ collNetRec.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getCollNetRec() {
        return collNetRec;
    }

    /**
     * Imposta il valore della proprietÓ collNetRec.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setCollNetRec(TypeReal value) {
        this.collNetRec = value;
    }

    /**
     * Recupera il valore della proprietÓ collNetRenewalPre.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getCollNetRenewalPre() {
        return collNetRenewalPre;
    }

    /**
     * Imposta il valore della proprietÓ collNetRenewalPre.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setCollNetRenewalPre(TypeReal value) {
        this.collNetRenewalPre = value;
    }

    /**
     * Recupera il valore della proprietÓ collNetTemp.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getCollNetTemp() {
        return collNetTemp;
    }

    /**
     * Imposta il valore della proprietÓ collNetTemp.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setCollNetTemp(TypeReal value) {
        this.collNetTemp = value;
    }

    /**
     * Recupera il valore della proprietÓ componentIACQR.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentIACQR() {
        return componentIACQR;
    }

    /**
     * Imposta il valore della proprietÓ componentIACQR.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentIACQR(TypeReal value) {
        this.componentIACQR = value;
    }

    /**
     * Recupera il valore della proprietÓ componentIAIPR.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentIAIPR() {
        return componentIAIPR;
    }

    /**
     * Imposta il valore della proprietÓ componentIAIPR.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentIAIPR(TypeReal value) {
        this.componentIAIPR = value;
    }

    /**
     * Recupera il valore della proprietÓ componentICOFI.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentICOFI() {
        return componentICOFI;
    }

    /**
     * Imposta il valore della proprietÓ componentICOFI.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentICOFI(TypeReal value) {
        this.componentICOFI = value;
    }

    /**
     * Recupera il valore della proprietÓ componentICOGE.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentICOGE() {
        return componentICOGE;
    }

    /**
     * Imposta il valore della proprietÓ componentICOGE.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentICOGE(TypeReal value) {
        this.componentICOGE = value;
    }

    /**
     * Recupera il valore della proprietÓ componentIINCR.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentIINCR() {
        return componentIINCR;
    }

    /**
     * Imposta il valore della proprietÓ componentIINCR.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentIINCR(TypeReal value) {
        this.componentIINCR = value;
    }

    /**
     * Recupera il valore della proprietÓ componentIRCPA.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentIRCPA() {
        return componentIRCPA;
    }

    /**
     * Imposta il valore della proprietÓ componentIRCPA.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentIRCPA(TypeReal value) {
        this.componentIRCPA = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPADIR.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPADIR() {
        return componentPADIR;
    }

    /**
     * Imposta il valore della proprietÓ componentPADIR.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPADIR(TypeReal value) {
        this.componentPADIR = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPAIFR.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPAIFR() {
        return componentPAIFR;
    }

    /**
     * Imposta il valore della proprietÓ componentPAIFR.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPAIFR(TypeReal value) {
        this.componentPAIFR = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPAIMO.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPAIMO() {
        return componentPAIMO;
    }

    /**
     * Imposta il valore della proprietÓ componentPAIMO.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPAIMO(TypeReal value) {
        this.componentPAIMO = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPAIPR.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPAIPR() {
        return componentPAIPR;
    }

    /**
     * Imposta il valore della proprietÓ componentPAIPR.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPAIPR(TypeReal value) {
        this.componentPAIPR = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPAIRI.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPAIRI() {
        return componentPAIRI;
    }

    /**
     * Imposta il valore della proprietÓ componentPAIRI.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPAIRI(TypeReal value) {
        this.componentPAIRI = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPAPRN.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPAPRN() {
        return componentPAPRN;
    }

    /**
     * Imposta il valore della proprietÓ componentPAPRN.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPAPRN(TypeReal value) {
        this.componentPAPRN = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPASPA.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPASPA() {
        return componentPASPA;
    }

    /**
     * Imposta il valore della proprietÓ componentPASPA.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPASPA(TypeReal value) {
        this.componentPASPA = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPASPP.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPASPP() {
        return componentPASPP;
    }

    /**
     * Imposta il valore della proprietÓ componentPASPP.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPASPP(TypeReal value) {
        this.componentPASPP = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPASPS.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPASPS() {
        return componentPASPS;
    }

    /**
     * Imposta il valore della proprietÓ componentPASPS.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPASPS(TypeReal value) {
        this.componentPASPS = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPASPT.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPASPT() {
        return componentPASPT;
    }

    /**
     * Imposta il valore della proprietÓ componentPASPT.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPASPT(TypeReal value) {
        this.componentPASPT = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPCOFI.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPCOFI() {
        return componentPCOFI;
    }

    /**
     * Imposta il valore della proprietÓ componentPCOFI.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPCOFI(TypeReal value) {
        this.componentPCOFI = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPCOGE.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPCOGE() {
        return componentPCOGE;
    }

    /**
     * Imposta il valore della proprietÓ componentPCOGE.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPCOGE(TypeReal value) {
        this.componentPCOGE = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPIDIR.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPIDIR() {
        return componentPIDIR;
    }

    /**
     * Imposta il valore della proprietÓ componentPIDIR.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPIDIR(TypeReal value) {
        this.componentPIDIR = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPIIFR.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPIIFR() {
        return componentPIIFR;
    }

    /**
     * Imposta il valore della proprietÓ componentPIIFR.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPIIFR(TypeReal value) {
        this.componentPIIFR = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPIIMO.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPIIMO() {
        return componentPIIMO;
    }

    /**
     * Imposta il valore della proprietÓ componentPIIMO.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPIIMO(TypeReal value) {
        this.componentPIIMO = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPIIPR.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPIIPR() {
        return componentPIIPR;
    }

    /**
     * Imposta il valore della proprietÓ componentPIIPR.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPIIPR(TypeReal value) {
        this.componentPIIPR = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPIIRI.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPIIRI() {
        return componentPIIRI;
    }

    /**
     * Imposta il valore della proprietÓ componentPIIRI.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPIIRI(TypeReal value) {
        this.componentPIIRI = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPIPRN.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPIPRN() {
        return componentPIPRN;
    }

    /**
     * Imposta il valore della proprietÓ componentPIPRN.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPIPRN(TypeReal value) {
        this.componentPIPRN = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPISPA.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPISPA() {
        return componentPISPA;
    }

    /**
     * Imposta il valore della proprietÓ componentPISPA.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPISPA(TypeReal value) {
        this.componentPISPA = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPISPP.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPISPP() {
        return componentPISPP;
    }

    /**
     * Imposta il valore della proprietÓ componentPISPP.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPISPP(TypeReal value) {
        this.componentPISPP = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPISPS.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPISPS() {
        return componentPISPS;
    }

    /**
     * Imposta il valore della proprietÓ componentPISPS.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPISPS(TypeReal value) {
        this.componentPISPS = value;
    }

    /**
     * Recupera il valore della proprietÓ componentPISPT.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getComponentPISPT() {
        return componentPISPT;
    }

    /**
     * Imposta il valore della proprietÓ componentPISPT.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setComponentPISPT(TypeReal value) {
        this.componentPISPT = value;
    }

    /**
     * Recupera il valore della proprietÓ derogationLevel.
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
     * Imposta il valore della proprietÓ derogationLevel.
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
     * Recupera il valore della proprietÓ id.
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
     * Imposta il valore della proprietÓ id.
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
     * Recupera il valore della proprietÓ maxYearCalcPre.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getMaxYearCalcPre() {
        return maxYearCalcPre;
    }

    /**
     * Imposta il valore della proprietÓ maxYearCalcPre.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setMaxYearCalcPre(TypeInt32 value) {
        this.maxYearCalcPre = value;
    }

    /**
     * Recupera il valore della proprietÓ overCollAccRec.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getOverCollAccRec() {
        return overCollAccRec;
    }

    /**
     * Imposta il valore della proprietÓ overCollAccRec.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setOverCollAccRec(TypeReal value) {
        this.overCollAccRec = value;
    }

    /**
     * Recupera il valore della proprietÓ overCollNetRec.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getOverCollNetRec() {
        return overCollNetRec;
    }

    /**
     * Imposta il valore della proprietÓ overCollNetRec.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setOverCollNetRec(TypeReal value) {
        this.overCollNetRec = value;
    }

    /**
     * Recupera il valore della proprietÓ overPurcAccRec.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getOverPurcAccRec() {
        return overPurcAccRec;
    }

    /**
     * Imposta il valore della proprietÓ overPurcAccRec.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setOverPurcAccRec(TypeReal value) {
        this.overPurcAccRec = value;
    }

    /**
     * Recupera il valore della proprietÓ overPurcNetRec.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getOverPurcNetRec() {
        return overPurcNetRec;
    }

    /**
     * Imposta il valore della proprietÓ overPurcNetRec.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setOverPurcNetRec(TypeReal value) {
        this.overPurcNetRec = value;
    }

    /**
     * Recupera il valore della proprietÓ purcAccPre.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getPurcAccPre() {
        return purcAccPre;
    }

    /**
     * Imposta il valore della proprietÓ purcAccPre.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setPurcAccPre(TypeReal value) {
        this.purcAccPre = value;
    }

    /**
     * Recupera il valore della proprietÓ purcAccRec.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getPurcAccRec() {
        return purcAccRec;
    }

    /**
     * Imposta il valore della proprietÓ purcAccRec.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setPurcAccRec(TypeReal value) {
        this.purcAccRec = value;
    }

    /**
     * Recupera il valore della proprietÓ purcIndexLinked.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getPurcIndexLinked() {
        return purcIndexLinked;
    }

    /**
     * Imposta il valore della proprietÓ purcIndexLinked.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setPurcIndexLinked(TypeBooleano value) {
        this.purcIndexLinked = value;
    }

    /**
     * Recupera il valore della proprietÓ purcInstalments.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getPurcInstalments() {
        return purcInstalments;
    }

    /**
     * Imposta il valore della proprietÓ purcInstalments.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setPurcInstalments(TypeBooleano value) {
        this.purcInstalments = value;
    }

    /**
     * Recupera il valore della proprietÓ purcNetPre.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getPurcNetPre() {
        return purcNetPre;
    }

    /**
     * Imposta il valore della proprietÓ purcNetPre.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setPurcNetPre(TypeReal value) {
        this.purcNetPre = value;
    }

    /**
     * Recupera il valore della proprietÓ purcNetRec.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getPurcNetRec() {
        return purcNetRec;
    }

    /**
     * Imposta il valore della proprietÓ purcNetRec.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setPurcNetRec(TypeReal value) {
        this.purcNetRec = value;
    }

    /**
     * Recupera il valore della proprietÓ purcNetRenewalPre.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getPurcNetRenewalPre() {
        return purcNetRenewalPre;
    }

    /**
     * Imposta il valore della proprietÓ purcNetRenewalPre.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setPurcNetRenewalPre(TypeReal value) {
        this.purcNetRenewalPre = value;
    }

    /**
     * Recupera il valore della proprietÓ purcRenewal.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getPurcRenewal() {
        return purcRenewal;
    }

    /**
     * Imposta il valore della proprietÓ purcRenewal.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setPurcRenewal(TypeBooleano value) {
        this.purcRenewal = value;
    }

    /**
     * Recupera il valore della proprietÓ regPrAcc.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getRegPrAcc() {
        return regPrAcc;
    }

    /**
     * Imposta il valore della proprietÓ regPrAcc.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setRegPrAcc(TypeReal value) {
        this.regPrAcc = value;
    }

    /**
     * Recupera il valore della proprietÓ regPrNet.
     * 
     * @return
     *     possible object is
     *     {@link TypeReal }
     *     
     */
    public TypeReal getRegPrNet() {
        return regPrNet;
    }

    /**
     * Imposta il valore della proprietÓ regPrNet.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReal }
     *     
     */
    public void setRegPrNet(TypeReal value) {
        this.regPrNet = value;
    }

}
