//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.11.03 alle 09:31:48 AM CET 
//


package com.pass.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per wsGetQuestionnaireInput complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsGetQuestionnaireInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extensionData" type="{http://rgi.it/WSPassPro}passProExtensionData" minOccurs="0"/&gt;
 *         &lt;element name="questionnaire" type="{http://rgi.it/WSPassPro}wsQuestionnaire" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsGetQuestionnaireInput", propOrder = {
    "codLang",
    "extensionData",
    "questionnaire"
})
public class WsGetQuestionnaireInput {

    protected String codLang;
    protected PassProExtensionData extensionData;
    protected WsQuestionnaire questionnaire;

    /**
     * Recupera il valore della proprietà codLang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLang() {
        return codLang;
    }

    /**
     * Imposta il valore della proprietà codLang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLang(String value) {
        this.codLang = value;
    }

    /**
     * Recupera il valore della proprietà extensionData.
     * 
     * @return
     *     possible object is
     *     {@link PassProExtensionData }
     *     
     */
    public PassProExtensionData getExtensionData() {
        return extensionData;
    }

    /**
     * Imposta il valore della proprietà extensionData.
     * 
     * @param value
     *     allowed object is
     *     {@link PassProExtensionData }
     *     
     */
    public void setExtensionData(PassProExtensionData value) {
        this.extensionData = value;
    }

    /**
     * Recupera il valore della proprietà questionnaire.
     * 
     * @return
     *     possible object is
     *     {@link WsQuestionnaire }
     *     
     */
    public WsQuestionnaire getQuestionnaire() {
        return questionnaire;
    }

    /**
     * Imposta il valore della proprietà questionnaire.
     * 
     * @param value
     *     allowed object is
     *     {@link WsQuestionnaire }
     *     
     */
    public void setQuestionnaire(WsQuestionnaire value) {
        this.questionnaire = value;
    }

}
