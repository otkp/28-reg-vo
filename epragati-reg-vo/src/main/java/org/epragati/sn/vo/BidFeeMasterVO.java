package org.epragati.sn.vo;

public class BidFeeMasterVO {

	private String bidFeeId;

	private Double bidMinIncrementAmount;

	private Long covCategoryGroupId;

	private Double specialNumFee;

	private Double rtaBidFee;

	private Long bidCloseNotifyTime;

	private Boolean bidFeeStatus;

	private String remarks;

	public String getBidFeeId() {
		return bidFeeId;
	}

	public void setBidFeeId(String bidFeeId) {
		this.bidFeeId = bidFeeId;
	}

	public Double getBidMinIncrementAmount() {
		return bidMinIncrementAmount;
	}

	public void setBidMinIncrementAmount(Double bidMinIncrementAmount) {
		this.bidMinIncrementAmount = bidMinIncrementAmount;
	}

	public Long getCovCategoryGroupId() {
		return covCategoryGroupId;
	}

	public void setCovCategoryGroupId(Long covCategoryGroupId) {
		this.covCategoryGroupId = covCategoryGroupId;
	}

	public Double getSpecialNumFee() {
		return specialNumFee;
	}

	public void setSpecialNumFee(Double specialNumFee) {
		this.specialNumFee = specialNumFee;
	}

	public Double getRtaBidFee() {
		return rtaBidFee;
	}

	public void setRtaBidFee(Double rtaBidFee) {
		this.rtaBidFee = rtaBidFee;
	}

	public Long getBidCloseNotifyTime() {
		return bidCloseNotifyTime;
	}

	public void setBidCloseNotifyTime(Long bidCloseNotifyTime) {
		this.bidCloseNotifyTime = bidCloseNotifyTime;
	}

	public Boolean getBidFeeStatus() {
		return bidFeeStatus;
	}

	public void setBidFeeStatus(Boolean bidFeeStatus) {
		this.bidFeeStatus = bidFeeStatus;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
