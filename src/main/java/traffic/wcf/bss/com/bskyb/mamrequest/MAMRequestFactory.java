package traffic.wcf.bss.com.bskyb.mamrequest;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.mule.modules.mamrequest.strategy.ConnectorConnectionStrategy;

public class MAMRequestFactory {
	
	
	private final ConnectorConnectionStrategy connectionStrategy;

	public MAMRequestFactory(final ConnectorConnectionStrategy connectionStrategy ) {
		this.connectionStrategy = connectionStrategy;
	}

	
	public IRequest createMAMRequest() throws MalformedURLException{
		MAMRequest mamRequest = new MAMRequest(connectionStrategy.getWsdlLocation() != null ? 
				new URL(connectionStrategy.getWsdlLocation()) : 
				MAMRequest.WSDL_LOCATION, MAMRequest.SERVICE);
		
			
		
		IRequest req = mamRequest.getBasicHttpBindingIRequest();
		
		
		if(connectionStrategy.getAddress() != null){
			BindingProvider provider = (BindingProvider) req;
			provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, connectionStrategy.getAddress());
		}
		
		return req;
	
	}

}
