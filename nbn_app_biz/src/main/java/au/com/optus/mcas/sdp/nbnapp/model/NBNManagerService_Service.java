
package au.com.optus.mcas.sdp.nbnapp.model;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "NBNManagerService", targetNamespace = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService", wsdlLocation = "file:/home/optus/NBNwork/nbn_app_service/src/main/resources/wsdl/NBNManagerService.wsdl")
public class NBNManagerService_Service
    extends Service
{

    private final static URL NBNMANAGERSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(au.com.optus.mcas.sdp.nbnapp.model.NBNManagerService_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = au.com.optus.mcas.sdp.nbnapp.model.NBNManagerService_Service.class.getResource(".");
            url = new URL(baseUrl, "file:/home/optus/NBNwork/nbn_app_service/src/main/resources/wsdl/NBNManagerService.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/home/optus/NBNwork/nbn_app_service/src/main/resources/wsdl/NBNManagerService.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        NBNMANAGERSERVICE_WSDL_LOCATION = url;
    }

    public NBNManagerService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NBNManagerService_Service() {
        super(NBNMANAGERSERVICE_WSDL_LOCATION, new QName("http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService", "NBNManagerService"));
    }

    /**
     * 
     * @return
     *     returns NBNManagerService
     */
    @WebEndpoint(name = "NBNManagerServicePort")
    public NBNManagerService getNBNManagerServicePort() {
        return super.getPort(new QName("http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService", "NBNManagerServicePort"), NBNManagerService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NBNManagerService
     */
    @WebEndpoint(name = "NBNManagerServicePort")
    public NBNManagerService getNBNManagerServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService", "NBNManagerServicePort"), NBNManagerService.class, features);
    }

}