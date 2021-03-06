
package au.com.nbnco.cim.common.exception.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The following fields convey error information: Exception\ID - contains the error code for
 *                 the exception as defined in the List of Values spreadsheet. Exception\description - contains the
 *                 associated text which provides the consumer with information about the error which occurred. Refer to
 *                 the List of Values spreadsheet for the descriptions returned with specific error codes.
 *             
 * 
 * <p>Java class for RecordNotFoundException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordNotFoundException">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nbnco.com.au/cim/common/exception/v3}MessageException">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordNotFoundException")
public class RecordNotFoundException
    extends MessageException
{


}
