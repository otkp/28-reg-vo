package org.epragati.payments.vo;

public class PaymentFailureResultVO {
	
	private String gateWay;
	
	private String failueDescription;

	
	/**
	 * @return the gateWay
	 */
	public String getGateWay() {
		return gateWay;
	}

	/**
	 * @param gateWay the gateWay to set
	 */
	public void setGateWay(String gateWay) {
		this.gateWay = gateWay;
	}

	/**
	 * @return the failueDescription
	 */
	public String getFailueDescription() {
		return failueDescription;
	}

	/**
	 * @param failueDescription the failueDescription to set
	 */
	public void setFailueDescription(String failueDescription) {
		this.failueDescription = failueDescription;
	}
	
	

}
