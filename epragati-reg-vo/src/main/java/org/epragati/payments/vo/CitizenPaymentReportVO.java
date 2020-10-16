package org.epragati.payments.vo;

import java.io.Serializable;

import org.epragati.util.payment.PayStatusEnum;

/**
 * 
 * @author sairam.cheruku
 *
 */
public class CitizenPaymentReportVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String transactionNumber;

	private String gateWayType;

	private PayStatusEnum status;

	private String applicationNumber;

	/**
	 * @return the transactionNumber
	 */
	public String getTransactionNumber() {
		return transactionNumber;
	}

	/**
	 * @param transactionNumber
	 *            the transactionNumber to set
	 */
	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	/**
	 * @return the gateWayType
	 */
	public String getGateWayType() {
		return gateWayType;
	}

	/**
	 * @param gateWayType
	 *            the gateWayType to set
	 */
	public void setGateWayType(String gateWayType) {
		this.gateWayType = gateWayType;
	}

	/**
	 * @return the status
	 */
	public PayStatusEnum getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(PayStatusEnum status) {
		this.status = status;
	}

	/**
	 * @return the applicationNumber
	 */
	public String getApplicationNumber() {
		return applicationNumber;
	}

	/**
	 * @param applicationNumber
	 *            the applicationNumber to set
	 */
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

}
