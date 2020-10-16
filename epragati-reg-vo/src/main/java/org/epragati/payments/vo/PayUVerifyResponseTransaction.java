package org.epragati.payments.vo;

public class PayUVerifyResponseTransaction {

	private String merchantTransactionId;
	private PayUResponse postBackParam;
	private SBIResponce sbiPostBackParam;
	
	private CFMSResponce responce;
	
	public String getMerchantTransactionId() {
		return merchantTransactionId;
	}
	public void setMerchantTransactionId(String merchantTransactionId) {
		this.merchantTransactionId = merchantTransactionId;
	}
	public PayUResponse getPostBackParam() {
		return postBackParam;
	}
	public void setPostBackParam(PayUResponse postBackParam) {
		this.postBackParam = postBackParam;
	}
	
	/**
	 * @return the sbiPostBackParam
	 */
	public SBIResponce getSbiPostBackParam() {
		return sbiPostBackParam;
	}
	/**
	 * @param sbiPostBackParam the sbiPostBackParam to set
	 */
	public void setSbiPostBackParam(SBIResponce sbiPostBackParam) {
		this.sbiPostBackParam = sbiPostBackParam;
	}
	
	
	/**
	 * @return the responce
	 */
	public CFMSResponce getResponce() {
		return responce;
	}
	/**
	 * @param responce the responce to set
	 */
	public void setResponce(CFMSResponce responce) {
		this.responce = responce;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PayUVerifyResponseTransaction [merchantTransactionId=" + merchantTransactionId + ", postBackParam="
				+ postBackParam + ", sbiPostBackParam=" + sbiPostBackParam + "]";
	}
	

	
}
