package org.epragati.payment.report.vo;

public class MviPerformanceVO {

	
	private String mviName;
	private String mviUserId;
	public String getMviUserId() {
		return mviUserId;
	}
	public void setMviUserId(String mviUserId) {
		this.mviUserId = mviUserId;
	}
	public String getMviName() {
		return mviName;
	}
	public void setMviName(String mviName) {
		this.mviName = mviName;
	}
	private Integer toatalBookedvcrCount;
	
	private Integer toatalPaidVcrCount;
	
	private Long penaltyCollected;
	
	private Long penaltyArrearsCollected;
	
	private	Double taxCollected;
	private Double taxArrearsCollected;
	public Double getTaxArrearsCollected() {
		return taxArrearsCollected;
	}
	public void setTaxArrearsCollected(Double taxArrearsCollected) {
		this.taxArrearsCollected = taxArrearsCollected;
	}
	private Integer cfCollected;
	private Long grandTotalAmount;
	public Integer getToatalBookedvcrCount() {
		return toatalBookedvcrCount;
	}
	public void setToatalBookedvcrCount(Integer toatalBookedvcrCount) {
		this.toatalBookedvcrCount = toatalBookedvcrCount;
	}
	public Integer getToatalPaidVcrCount() {
		return toatalPaidVcrCount;
	}
	public void setToatalPaidVcrCount(Integer toatalPaidVcrCount) {
		this.toatalPaidVcrCount = toatalPaidVcrCount;
	}
	public Long getPenaltyCollected() {
		return penaltyCollected;
	}
	public void setPenaltyCollected(Long penaltyCollected) {
		this.penaltyCollected = penaltyCollected;
	}
	public Long getPenaltyArrearsCollected() {
		return penaltyArrearsCollected;
	}
	public void setPenaltyArrearsCollected(Long penaltyArrearsCollected) {
		this.penaltyArrearsCollected = penaltyArrearsCollected;
	}
	public Double getTaxCollected() {
		return taxCollected;
	}
	public void setTaxCollected(Double taxCollected) {
		this.taxCollected = taxCollected;
	}
	public Integer getCfCollected() {
		return cfCollected;
	}
	public void setCfCollected(Integer cfCollected) {
		this.cfCollected = cfCollected;
	}
	public Long getGrandTotalAmount() {
		return grandTotalAmount;
	}
	public void setGrandTotalAmount(Long grandTotalAmount) {
		this.grandTotalAmount = grandTotalAmount;
	}
	
	
}
