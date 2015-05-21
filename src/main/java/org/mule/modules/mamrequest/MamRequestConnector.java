/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under the terms of the CPAL v1.0 license,
 * a copy of which has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.mamrequest;

import org.mule.api.annotations.ConnectionStrategy;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.display.FriendlyName;
import org.mule.api.annotations.display.Placement;
import org.mule.api.annotations.lifecycle.Start;
import org.mule.modules.mamrequest.strategy.ConnectorConnectionStrategy;

import traffic.contract.bss.com.bskyb.IMamRequestClient;
import traffic.contract.bss.com.bskyb.MamRequestClient;
import traffic.wcf.bss.com.bskyb.mamrequest.IRequestGetBusinessExceptionFaultFaultMessage;

import com.fasterxml.jackson.annotation.JsonValue;
//import traffic.contract.bss.com.bskyb.ObjectFactory;

/**
 * Anypoint Connector
 *
 * @author MuleSoft, Inc.
 */
@Connector(name="mamrequest", friendlyName="MAMRequest Service")
public class MamRequestConnector {
    
    /**
     * Configurable
     */
//    @Configurable
//    @Default("Hello")
//    private String greeting;

	private IMamRequestClient mamRequestClient;
	

    @ConnectionStrategy
    ConnectorConnectionStrategy connectionStrategy;
    
    @Start
    public void init(){
    	this.mamRequestClient = new MamRequestClient(connectionStrategy.getAddress());
    }


    

    public static interface JAXBElementMixin {
        @JsonValue
        Object getValue();    
    }
    
	
    /**
     * Custom processor that gets a MAM Request from BSS
     *
     * {@sample.xml ../../../doc/mamrequest-connector.xml.sample mamrequest:getMamRequestFromId}
     *
     * @param mamRequestId ID of the BSS requeest
     * @return returns purchaseId
     */
	@Processor(friendlyName = "Get BSS MAMRequest")
	public MamRequestSimpleGetResponse getMamRequestFromId(
			@Placement(group = "Parameters") @FriendlyName("The MAM Request ID from BSS") Integer mamRequestId) {
		try {

			return mamRequestClient.get(mamRequestId);
			
		} catch ( IRequestGetBusinessExceptionFaultFaultMessage e) {
			e.printStackTrace();
		} 
		return null;
	}

    public ConnectorConnectionStrategy getConnectionStrategy() {
        return connectionStrategy;
    }

    public void setConnectionStrategy(ConnectorConnectionStrategy connectionStrategy) {
        this.connectionStrategy = connectionStrategy;
    }

}