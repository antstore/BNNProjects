
package commonservices.group.singtel.com.au.v1_0.ilpmservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.BaseDto;
import au.com.singtel.group.cdm.v2_0_0.service.ServiceOrder;


/**
 * <p>Java class for ilpmRetrieveBillingPackageIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ilpmRetrieveBillingPackageIdResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BaseDto">
 *       &lt;sequence>
 *         &lt;element name="serviceOrder" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ServiceOrder" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ilpmRetrieveBillingPackageIdResponse", propOrder = {
    "rest"
})
public class IlpmRetrieveBillingPackageIdResponse
    extends BaseDto
{

    @XmlElementRefs({
        @XmlElementRef(name = "status", namespace = "http://au.com.singtel.group.commonservices/v1_0/ILPMService", type = JAXBElement.class),
        @XmlElementRef(name = "serviceOrder", namespace = "http://au.com.singtel.group.commonservices/v1_0/ILPMService", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Status" is used by two different parts of a schema. See: 
     * line 35 of file:/home/optus/git/nbn/nbn_app/nbn_app_service/src/main/resources/schemas/ILPMService_1_0.xsd
     * line 3235 of file:/home/optus/git/nbn/nbn_app/nbn_app_service/src/main/resources/schemas/common.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
