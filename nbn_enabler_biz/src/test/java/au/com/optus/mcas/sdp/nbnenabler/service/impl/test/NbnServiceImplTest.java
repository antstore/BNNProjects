package au.com.optus.mcas.sdp.nbnenabler.service.impl.test;

import au.com.optus.mcas.sdp.nbnenabler.exception.NbnServiceException;
import au.com.optus.mcas.sdp.nbnenabler.model.CheckAvailableAppointmentRequestModel;
import au.com.optus.mcas.sdp.nbnenabler.model.CreateAppointmentRequestModel;
import au.com.optus.mcas.sdp.nbnenabler.model.CreateServiceOrderRequestModel;
import au.com.optus.mcas.sdp.nbnenabler.service.impl.NbnServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring/test-nbn-enabler-biz-context.xml" })
public class NbnServiceImplTest {

    @Autowired
    private NbnServiceImpl nbnImpl;

    @Test
    @Ignore
    public void createServiceOrder() throws NbnServiceException {

        CreateServiceOrderRequestModel createServiceOrder = new CreateServiceOrderRequestModel();
        nbnImpl.createServiceOrder(createServiceOrder);
    }

    @Test
    @Ignore
    public void checkAvailableAppointment() throws NbnServiceException {

        CheckAvailableAppointmentRequestModel checkAvailableAppointment = new CheckAvailableAppointmentRequestModel();
        nbnImpl.checkAvailableAppointment(checkAvailableAppointment);

    }

    @Test
    @Ignore
    public void createAppointment() throws NbnServiceException {

        CreateAppointmentRequestModel createAppointment = new CreateAppointmentRequestModel();
        nbnImpl.createAppointment(createAppointment);

    }

}
