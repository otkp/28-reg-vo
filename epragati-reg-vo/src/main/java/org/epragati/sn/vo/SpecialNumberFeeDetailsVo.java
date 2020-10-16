package org.epragati.sn.vo;

import java.io.Serializable;

public class SpecialNumberFeeDetailsVo implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private BidFeeMasterVO bidFeeMaster;

	private String paymentId;

	private String refundId;

	private Double totalAmount;
	
	private Double applicationAmount;

	public BidFeeMasterVO getBidFeeMaster() {
		return bidFeeMaster;
	}

	public void setBidFeeMaster(BidFeeMasterVO bidFeeMaster) {
		this.bidFeeMaster = bidFeeMaster;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getRefundId() {
		return refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getApplicationAmount() {
		return applicationAmount;
	}

	public void setApplicationAmount(Double applicationAmount) {
		this.applicationAmount = applicationAmount;
	}
	

}
