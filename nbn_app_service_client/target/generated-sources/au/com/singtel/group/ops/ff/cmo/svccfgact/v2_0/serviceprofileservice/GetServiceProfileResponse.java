
package au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.BaseDto;
import au.com.singtel.group.cdm.v2_0_0.service.Service;


/**
 * <p>Java class for getServiceProfileResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getServiceProfileResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BaseDto">
 *       &lt;sequence>
 *         &lt;element name="service" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}Service" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServiceProfileResponse", propOrder = {
    "service"
})
public class GetServiceProfileResponse
    extends BaseDto
{

    protected Service service;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link Service }
     *     
     */
    public Service getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link Service }
     *     
     */
    public void setService(Service value) {
        this.service = value;
    }

}
