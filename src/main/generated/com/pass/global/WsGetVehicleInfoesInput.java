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
 * <p>Classe Java per wsGetVehicleInfoesInput complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="wsGetVehicleInfoesInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loadOnlyLastLevelList" type="{http://rgi.it/WSPassPro}typeBooleano" minOccurs="0"/&gt;
 *         &lt;element name="vehicleInfoes" type="{http://rgi.it/WSPassPro}passProVehicleInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsGetVehicleInfoesInput", propOrder = {
    "codLang",
    "loadOnlyLastLevelList",
    "vehicleInfoes"
})
public class WsGetVehicleInfoesInput {

    protected String codLang;
    protected TypeBooleano loadOnlyLastLevelList;
    @XmlElement(nillable = true)
    protected List<PassProVehicleInfo> vehicleInfoes;

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
     * Recupera il valore della proprietà loadOnlyLastLevelList.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleano }
     *     
     */
    public TypeBooleano getLoadOnlyLastLevelList() {
        return loadOnlyLastLevelList;
    }

    /**
     * Imposta il valore della proprietà loadOnlyLastLevelList.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleano }
     *     
     */
    public void setLoadOnlyLastLevelList(TypeBooleano value) {
        this.loadOnlyLastLevelList = value;
    }

    /**
     * Gets the value of the vehicleInfoes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleInfoes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleInfoes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassProVehicleInfo }
     * 
     * 
     */
    public List<PassProVehicleInfo> getVehicleInfoes() {
        if (vehicleInfoes == null) {
            vehicleInfoes = new ArrayList<PassProVehicleInfo>();
        }
        return this.vehicleInfoes;
    }

}
