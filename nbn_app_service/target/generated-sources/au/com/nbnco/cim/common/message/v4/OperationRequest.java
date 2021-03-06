
package au.com.nbnco.cim.common.message.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The act of asking that something be done that typically involves a Response. Request is a
 *                 type of Business Interaction
 * 
 * <p>Java class for OperationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nbnco.com.au/cim/common/message/v4}MessageSpecification">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationRequest")
public class OperationRequest
    extends MessageSpecification
{


}
