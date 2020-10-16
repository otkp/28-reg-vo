package org.epragati.sn.vo;

import java.io.Serializable;

public class BidFinalDetailsVo implements Serializable {

	private static final long serialVersionUID = 5408988583197129623L;

	private String paymentId;

	private String refundId;

	private Double bidAmount;

	private Double rtaAmount;

	private Double totalAmount;

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

	public Double getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(Double bidAmount) {
		this.bidAmount = bidAmount;
	}

	public Double getRtaAmount() {
		return rtaAmount;
	}

	public void setRtaAmount(Double rtaAmount) {
		this.rtaAmount = rtaAmount;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
