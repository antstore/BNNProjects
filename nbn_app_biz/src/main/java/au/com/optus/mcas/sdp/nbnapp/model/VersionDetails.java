
package au.com.optus.mcas.sdp.nbnapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VersionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VersionDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RootEntityVersion" type="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}RootEntityVersion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionDetails", propOrder = {
    "rootEntityVersion"
})
public class VersionDetails {

    @XmlElement(name = "RootEntityVersion")
    protected RootEntityVersion rootEntityVersion;

    /**
     * Gets the value of the rootEntityVersion property.
     * 
     * @return
     *     possible object is
     *     {@link RootEntityVersion }
     *     
     */
    public RootEntityVersion getRootEntityVersion() {
        return rootEntityVersion;
    }

    /**
     * Sets the value of the rootEntityVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link RootEntityVersion }
     *     
     */
    public void setRootEntityVersion(RootEntityVersion value) {
        this.rootEntityVersion = value;
    }

}
