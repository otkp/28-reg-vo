package org.epragati.payments.vo;

import java.util.Map;

public class PaymentVerifyRequest {
	
	private Map<String,String> payUReqParameters;

	public Map<String, String> getPayUReqParameters() {
		return payUReqParameters;
	}

	public void setPayUReqParameters(Map<String, String> payUReqParameters) {
		this.payUReqParameters = payUReqParameters;
	}

}
