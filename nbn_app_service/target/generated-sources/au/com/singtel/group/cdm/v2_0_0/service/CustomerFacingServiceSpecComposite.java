
package au.com.singtel.group.cdm.v2_0_0.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerFacingServiceSpecComposite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerFacingServiceSpecComposite">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/service}CustomerFacingServiceSpec">
 *       &lt;sequence>
 *         &lt;element name="customerFacingServiceSpecs" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}CustomerFacingServiceSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerFacingServiceSpecComposite", propOrder = {
    "customerFacingServiceSpecs"
})
public class CustomerFacingServiceSpecComposite
    extends CustomerFacingServiceSpec
{

    protected List<CustomerFacingServiceSpec> customerFacingServiceSpecs;

    /**
     * Gets the value of the customerFacingServiceSpecs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerFacingServiceSpecs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerFacingServiceSpecs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerFacingServiceSpec }
     * 
     * 
     */
    public List<CustomerFacingServiceSpec> getCustomerFacingServiceSpecs() {
        if (customerFacingServiceSpecs == null) {
            customerFacingServiceSpecs = new ArrayList<CustomerFacingServiceSpec>();
        }
        return this.customerFacingServiceSpecs;
    }

}
