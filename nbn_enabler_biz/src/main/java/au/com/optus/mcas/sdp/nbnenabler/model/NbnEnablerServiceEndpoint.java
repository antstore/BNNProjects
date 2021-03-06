
package au.com.optus.mcas.sdp.nbnenabler.model;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "NbnEnablerServiceEndpoint", targetNamespace = "http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    au.com.singtel.group.cdm.v1_0_0.exception.ObjectFactory.class,
    au.com.singtel.group.optus.oss.enabler.nbnenablerservice.v4_0_0.nbnenablerservice.ObjectFactory.class,
    au.com.singtel.group.cdm.v4_0_0.cdm.ObjectFactory.class
})
public interface NbnEnablerServiceEndpoint {


    /**
     * 
     * @param createServiceOrder
     * @return
     *     returns au.com.singtel.group.optus.oss.enabler.nbnenablerservice.v4_0_0.nbnenablerservice.CreateServiceOrderResponse
     * @throws ServiceException
     * @throws BusinessException
     */
    @WebMethod
    @WebResult(name = "createServiceOrderResponse", targetNamespace = "http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", partName = "createServiceOrderResponse")
    public CreateServiceOrderResponseModel createServiceOrder(
        @WebParam(name = "createServiceOrder", targetNamespace = "http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", partName = "createServiceOrder")
        CreateServiceOrderRequestModel createServiceOrder)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param checkAvailableAppointment
     * @return
     *     returns au.com.singtel.group.optus.oss.enabler.nbnenablerservice.v4_0_0.nbnenablerservice.CheckAvailableAppointmentResponse
     * @throws ServiceException
     * @throws BusinessException
     */
    @WebMethod
    @WebResult(name = "checkAvailableAppointmentResponse", targetNamespace = "http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", partName = "checkAvailableAppointmentResponse")
    public CheckAvailableAppointmentResponseModel checkAvailableAppointment(
        @WebParam(name = "checkAvailableAppointment", targetNamespace = "http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", partName = "checkAvailableAppointment")
        CheckAvailableAppointmentRequestModel checkAvailableAppointment)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param createAppointment
     * @return
     *     returns au.com.singtel.group.optus.oss.enabler.nbnenablerservice.v4_0_0.nbnenablerservice.CreateAppointmentResponse
     * @throws ServiceException
     * @throws BusinessException
     */
    @WebMethod
    @WebResult(name = "createAppointmentResponse", targetNamespace = "http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", partName = "createAppointmentResponse")
    public CreateAppointmentResponseModel createAppointment(
        @WebParam(name = "createAppointment", targetNamespace = "http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", partName = "createAppointment")
        CreateAppointmentRequestModel createAppointment)
        throws BusinessException, ServiceException
    ;

}
