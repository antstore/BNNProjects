
package au.com.singtel.group.cdm.v2_0_0.resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagedHardware complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedHardware">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}Hardware">
 *       &lt;sequence>
 *         &lt;element name="additionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="administrativeState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="physicalAlarmReportingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="physicalAlarmStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="coolingRequirements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hardwarePurpose" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedHardware", propOrder = {
    "additionalInfo",
    "administrativeState",
    "physicalAlarmReportingEnabled",
    "physicalAlarmStatus",
    "coolingRequirements",
    "hardwarePurpose"
})
public class ManagedHardware
    extends Hardware
{

    protected String additionalInfo;
    protected Integer administrativeState;
    protected Boolean physicalAlarmReportingEnabled;
    protected Integer physicalAlarmStatus;
    protected String coolingRequirements;
    protected Integer hardwarePurpose;

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the administrativeState property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdministrativeState() {
        return administrativeState;
    }

    /**
     * Sets the value of the administrativeState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdministrativeState(Integer value) {
        this.administrativeState = value;
    }

    /**
     * Gets the value of the physicalAlarmReportingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhysicalAlarmReportingEnabled() {
        return physicalAlarmReportingEnabled;
    }

    /**
     * Sets the value of the physicalAlarmReportingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhysicalAlarmReportingEnabled(Boolean value) {
        this.physicalAlarmReportingEnabled = value;
    }

    /**
     * Gets the value of the physicalAlarmStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhysicalAlarmStatus() {
        return physicalAlarmStatus;
    }

    /**
     * Sets the value of the physicalAlarmStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhysicalAlarmStatus(Integer value) {
        this.physicalAlarmStatus = value;
    }

    /**
     * Gets the value of the coolingRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoolingRequirements() {
        return coolingRequirements;
    }

    /**
     * Sets the value of the coolingRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoolingRequirements(String value) {
        this.coolingRequirements = value;
    }

    /**
     * Gets the value of the hardwarePurpose property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHardwarePurpose() {
        return hardwarePurpose;
    }

    /**
     * Sets the value of the hardwarePurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHardwarePurpose(Integer value) {
        this.hardwarePurpose = value;
    }

}
