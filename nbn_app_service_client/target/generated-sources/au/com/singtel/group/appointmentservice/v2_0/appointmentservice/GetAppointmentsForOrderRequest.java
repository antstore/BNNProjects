
package au.com.singtel.group.appointmentservice.v2_0.appointmentservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.BaseDto;


/**
 * <p>Java class for getAppointmentsForOrderRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAppointmentsForOrderRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BaseDto">
 *       &lt;sequence>
 *         &lt;element name="purchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAppointmentsForOrderRequest", propOrder = {
    "purchaseOrderNumber"
})
public class GetAppointmentsForOrderRequest
    extends BaseDto
{

    @XmlElement(required = true)
    protected String purchaseOrderNumber;

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Sets the value of the purchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderNumber(String value) {
        this.purchaseOrderNumber = value;
    }

}
