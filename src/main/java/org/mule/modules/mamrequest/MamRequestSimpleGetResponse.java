package org.mule.modules.mamrequest;

import traffic.contract.bss.com.bskyb.request.GetResponse;

public class MamRequestSimpleGetResponse {
	
	private Integer purchaseId;
	
	public static MamRequestSimpleGetResponse fromGetResponse(final GetResponse response){
		
		MamRequestSimpleGetResponse mamRequestSimpleGetResponse = new MamRequestSimpleGetResponse();
		mamRequestSimpleGetResponse.setPurchaseId(response.getGetResult().getMAMRequest().get(0).getGenericID().getValue());
		return mamRequestSimpleGetResponse;	
	}

	private void setPurchaseId(final Integer purchaseId) {
		this.purchaseId = purchaseId;		
	}
	
	public Integer getPurchaseId(){
		return this.purchaseId;
	}

	private MamRequestSimpleGetResponse(){
		
	}

}
