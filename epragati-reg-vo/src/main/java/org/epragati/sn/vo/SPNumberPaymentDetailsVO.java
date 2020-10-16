package org.epragati.sn.vo;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SPNumberPaymentDetailsVO {
	
	@JsonFormat(pattern = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime paymentDate;
	
	private String transactioNo;
	
	private String status;
	
	private String gateWayType;
	
	@JsonFormat(pattern = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime responceDate;
	
	private String bankRefNumber;

	/**
	 * @return the paymentDate
	 */
	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	/**
	 * @param paymentDate the paymentDate to set
	 */
	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	/**
	 * @return the transactioNo
	 */
	public String getTransactioNo() {
		return transactioNo;
	}

	/**
	 * @param transactioNo the transactioNo to set
	 */
	public void setTransactioNo(String transactioNo) {
		this.transactioNo = transactioNo;
	}

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
	 * @return the gateWayType
	 */
	public String getGateWayType() {
		return gateWayType;
	}

	/**
	 * @param gateWayType the gateWayType to set
	 */
	public void setGateWayType(String gateWayType) {
		this.gateWayType = gateWayType;
	}

	/**
	 * @return the responceDate
	 */
	public LocalDateTime getResponceDate() {
		return responceDate;
	}

	/**
	 * @param responceDate the responceDate to set
	 */
	public void setResponceDate(LocalDateTime responceDate) {
		this.responceDate = responceDate;
	}

	/**
	 * @return the bankRefNumber
	 */
	public String getBankRefNumber() {
		return bankRefNumber;
	}

	/**
	 * @param bankRefNumber the bankRefNumber to set
	 */
	public void setBankRefNumber(String bankRefNumber) {
		this.bankRefNumber = bankRefNumber;
	}
	

}
