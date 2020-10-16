package org.epragati.master.vo;

public class DashBoardCountVO {
	private String status;

	private Integer draftCount;
	private Integer paymentPendingCount;
	private Integer aadhaarPendingCount;
	private Integer trGeneratedCount;
	private Integer paymentDoneCount;
	private Integer rejectedCount;
	private Integer snCount;
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
	 * @return the draftCount
	 */
	public Integer getDraftCount() {
		return draftCount;
	}
	/**
	 * @param draftCount the draftCount to set
	 */
	public void setDraftCount(Integer draftCount) {
		this.draftCount = draftCount;
	}
	/**
	 * @return the paymentPendingCount
	 */
	public Integer getPaymentPendingCount() {
		return paymentPendingCount;
	}
	/**
	 * @param paymentPendingCount the paymentPendingCount to set
	 */
	public void setPaymentPendingCount(Integer paymentPendingCount) {
		this.paymentPendingCount = paymentPendingCount;
	}
	/**
	 * @return the aadhaarPendingCount
	 */
	public Integer getAadhaarPendingCount() {
		return aadhaarPendingCount;
	}
	/**
	 * @param aadhaarPendingCount the aadhaarPendingCount to set
	 */
	public void setAadhaarPendingCount(Integer aadhaarPendingCount) {
		this.aadhaarPendingCount = aadhaarPendingCount;
	}
	
	/**
	 * @return the trGeneratedCount
	 */
	public Integer getTrGeneratedCount() {
		return trGeneratedCount;
	}
	/**
	 * @param trGeneratedCount the trGeneratedCount to set
	 */
	public void setTrGeneratedCount(Integer trGeneratedCount) {
		this.trGeneratedCount = trGeneratedCount;
	}
	/**
	 * @return the paymentDoneCount
	 */
	public Integer getPaymentDoneCount() {
		return paymentDoneCount;
	}
	/**
	 * @param paymentDoneCount the paymentDoneCount to set
	 */
	public void setPaymentDoneCount(Integer paymentDoneCount) {
		this.paymentDoneCount = paymentDoneCount;
	}
	
	/**
	 * @return the rejectedCount
	 */
	public Integer getRejectedCount() {
		return rejectedCount;
	}
	/**
	 * @param rejectedCount the rejectedCount to set
	 */
	public void setRejectedCount(Integer rejectedCount) {
		this.rejectedCount = rejectedCount;
	}
	public Integer getSnCount() {
		return snCount;
	}
	public void setSnCount(Integer snCount) {
		this.snCount = snCount;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DashBoardCountVO [status=" + status + ", draftCount=" + draftCount + ", paymentPendingCount="
				+ paymentPendingCount + ", aadhaarPendingCount=" + aadhaarPendingCount + "]";
	}
}
