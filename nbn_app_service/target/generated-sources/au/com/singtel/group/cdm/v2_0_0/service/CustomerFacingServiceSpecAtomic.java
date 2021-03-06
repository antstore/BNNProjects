
package au.com.singtel.group.cdm.v2_0_0.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerFacingServiceSpecAtomic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerFacingServiceSpecAtomic">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/service}CustomerFacingServiceSpec">
 *       &lt;sequence>
 *         &lt;element name="customerFacingServiceSpecAtomic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerFacingServiceSpecAtomic", propOrder = {
    "customerFacingServiceSpecAtomic"
})
public class CustomerFacingServiceSpecAtomic
    extends CustomerFacingServiceSpec
{

    protected String customerFacingServiceSpecAtomic;

    /**
     * Gets the value of the customerFacingServiceSpecAtomic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFacingServiceSpecAtomic() {
        return customerFacingServiceSpecAtomic;
    }

    /**
     * Sets the value of the customerFacingServiceSpecAtomic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFacingServiceSpecAtomic(String value) {
        this.customerFacingServiceSpecAtomic = value;
    }

}
