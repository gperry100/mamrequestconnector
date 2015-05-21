package traffic.contract.bss.com.bskyb;

import javax.xml.ws.BindingProvider;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.mule.modules.mamrequest.MamRequestSimpleGetResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import traffic.contract.bss.com.bskyb.request.Get;
import traffic.contract.bss.com.bskyb.request.GetResponse;
import traffic.contract.bss.com.bskyb.request.ObjectFactory;
import traffic.wcf.bss.com.bskyb.mamrequest.IRequest;
import traffic.wcf.bss.com.bskyb.mamrequest.IRequestGetBusinessExceptionFaultFaultMessage;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;

public class MamRequestClient implements IMamRequestClient {

	private static final Logger logger = LoggerFactory.getLogger(MamRequestClient.class);
	private IRequest port;
	ObjectFactory factory;
	
	
	public MamRequestClient(final String address){
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
    	factory.setServiceClass(IRequest.class);
    	
    	this.factory = new ObjectFactory();
    	this.port = (IRequest) factory.create();
    
    	((BindingProvider) port).getRequestContext().put(
              (BindingProvider.ENDPOINT_ADDRESS_PROPERTY), address);	
	}
	
	@Override
	public MamRequestSimpleGetResponse get(Integer mamRequestId) throws IRequestGetBusinessExceptionFaultFaultMessage {
		
		ArrayOfint arrayOfint = new com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory().createArrayOfint();
		arrayOfint.getInt().add(mamRequestId);
		
    	Get get = factory.createGet();
    	get.setMAMRequestID(arrayOfint);
    	
    	GetResponse response = port.get(get);
    	return MamRequestSimpleGetResponse.fromGetResponse(response);
	}

}
