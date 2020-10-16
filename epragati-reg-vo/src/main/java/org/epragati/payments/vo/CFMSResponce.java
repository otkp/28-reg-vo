package org.epragati.payments.vo;

public class CFMSResponce {
	
	private String status;
	
	private String cfms_transid;
	
	private String amount;
	
	private String bankTransactionId;
	
	private String dtid;
	
	private String otherAmount;
	
	private String bankTimeStamp;
	
	private String totalAmount;
	
	private String paymentMode;
	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the cfms_transid
	 */
	public String getCfms_transid() {
		return cfms_transid;
	}

	/**
	 * @param cfms_transid the cfms_transid to set
	 */
	public void setCfms_transid(String cfms_transid) {
		this.cfms_transid = cfms_transid;
	}

	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * @return the bankTransactionId
	 */
	public String getBankTransactionId() {
		return bankTransactionId;
	}

	/**
	 * @param bankTransactionId the bankTransactionId to set
	 */
	public void setBankTransactionId(String bankTransactionId) {
		this.bankTransactionId = bankTransactionId;
	}

	/**
	 * @return the dtid
	 */
	public String getDtid() {
		return dtid;
	}

	/**
	 * @param dtid the dtid to set
	 */
	public void setDtid(String dtid) {
		this.dtid = dtid;
	}

	/**
	 * @return the otherAmount
	 */
	public String getOtherAmount() {
		return otherAmount;
	}

	/**
	 * @param otherAmount the otherAmount to set
	 */
	public void setOtherAmount(String otherAmount) {
		this.otherAmount = otherAmount;
	}

	/**
	 * @return the bankTimeStamp
	 */
	public String getBankTimeStamp() {
		return bankTimeStamp;
	}

	/**
	 * @param bankTimeStamp the bankTimeStamp to set
	 */
	public void setBankTimeStamp(String bankTimeStamp) {
		this.bankTimeStamp = bankTimeStamp;
	}

	/**
	 * @return the totalAmount
	 */
	public String getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * @return the paymentMode
	 */
	public String getPaymentMode() {
		return paymentMode;
	}

	/**
	 * @param paymentMode the paymentMode to set
	 */
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
}
