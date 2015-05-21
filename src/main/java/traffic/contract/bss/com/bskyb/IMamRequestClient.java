package traffic.contract.bss.com.bskyb;

import org.mule.modules.mamrequest.MamRequestSimpleGetResponse;

import traffic.contract.bss.com.bskyb.request.Get;
import traffic.wcf.bss.com.bskyb.mamrequest.IRequestGetBusinessExceptionFaultFaultMessage;

public interface IMamRequestClient {
	
	MamRequestSimpleGetResponse get(Integer mamRequestId) throws IRequestGetBusinessExceptionFaultFaultMessage;

}
