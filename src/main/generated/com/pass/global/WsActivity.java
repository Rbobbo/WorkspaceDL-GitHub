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
 * <p>Classe Java per wsActivity complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsActivity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalDescriptionMode" type="{http://rgi.it/WSPassPro}typeInt32" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="level1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="level1Values" type="{http://rgi.it/WSPassPro}wsActivityEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="level2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="level2Values" type="{http://rgi.it/WSPassPro}wsActivityEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="level3Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="level3Values" type="{http://rgi.it/WSPassPro}wsActivityEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="level4Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="level4Values" type="{http://rgi.it/WSPassPro}wsActivityEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsActivity", propOrder = {
    "additionalDescriptionMode",
    "code",
    "description",
    "level1Code",
    "level1Values",
    "level2Code",
    "level2Values",
    "level3Code",
    "level3Values",
    "level4Code",
    "level4Values",
    "note",
    "packetCode"
})
public class WsActivity {

    protected TypeInt32 additionalDescriptionMode;
    protected String code;
    protected String description;
    protected String level1Code;
    @XmlElement(nillable = true)
    protected List<WsActivityEntity> level1Values;
    protected String level2Code;
    @XmlElement(nillable = true)
    protected List<WsActivityEntity> level2Values;
    protected String level3Code;
    @XmlElement(nillable = true)
    protected List<WsActivityEntity> level3Values;
    protected String level4Code;
    @XmlElement(nillable = true)
    protected List<WsActivityEntity> level4Values;
    protected String note;
    protected String packetCode;

    /**
     * Recupera il valore della proprietà additionalDescriptionMode.
     * 
     * @return
     *     possible object is
     *     {@link TypeInt32 }
     *     
     */
    public TypeInt32 getAdditionalDescriptionMode() {
        return additionalDescriptionMode;
    }

    /**
     * Imposta il valore della proprietà additionalDescriptionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInt32 }
     *     
     */
    public void setAdditionalDescriptionMode(TypeInt32 value) {
        this.additionalDescriptionMode = value;
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
     * Recupera il valore della proprietà level1Code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel1Code() {
        return level1Code;
    }

    /**
     * Imposta il valore della proprietà level1Code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel1Code(String value) {
        this.level1Code = value;
    }

    /**
     * Gets the value of the level1Values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the level1Values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevel1Values().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsActivityEntity }
     * 
     * 
     */
    public List<WsActivityEntity> getLevel1Values() {
        if (level1Values == null) {
            level1Values = new ArrayList<WsActivityEntity>();
        }
        return this.level1Values;
    }

    /**
     * Recupera il valore della proprietà level2Code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel2Code() {
        return level2Code;
    }

    /**
     * Imposta il valore della proprietà level2Code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel2Code(String value) {
        this.level2Code = value;
    }

    /**
     * Gets the value of the level2Values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the level2Values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevel2Values().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsActivityEntity }
     * 
     * 
     */
    public List<WsActivityEntity> getLevel2Values() {
        if (level2Values == null) {
            level2Values = new ArrayList<WsActivityEntity>();
        }
        return this.level2Values;
    }

    /**
     * Recupera il valore della proprietà level3Code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel3Code() {
        return level3Code;
    }

    /**
     * Imposta il valore della proprietà level3Code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel3Code(String value) {
        this.level3Code = value;
    }

    /**
     * Gets the value of the level3Values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the level3Values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevel3Values().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsActivityEntity }
     * 
     * 
     */
    public List<WsActivityEntity> getLevel3Values() {
        if (level3Values == null) {
            level3Values = new ArrayList<WsActivityEntity>();
        }
        return this.level3Values;
    }

    /**
     * Recupera il valore della proprietà level4Code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel4Code() {
        return level4Code;
    }

    /**
     * Imposta il valore della proprietà level4Code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel4Code(String value) {
        this.level4Code = value;
    }

    /**
     * Gets the value of the level4Values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the level4Values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevel4Values().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsActivityEntity }
     * 
     * 
     */
    public List<WsActivityEntity> getLevel4Values() {
        if (level4Values == null) {
            level4Values = new ArrayList<WsActivityEntity>();
        }
        return this.level4Values;
    }

    /**
     * Recupera il valore della proprietà note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Imposta il valore della proprietà note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Recupera il valore della proprietà packetCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacketCode() {
        return packetCode;
    }

    /**
     * Imposta il valore della proprietà packetCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacketCode(String value) {
        this.packetCode = value;
    }

}
