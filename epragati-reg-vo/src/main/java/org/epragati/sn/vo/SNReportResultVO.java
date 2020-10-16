package org.epragati.sn.vo;
/**
 * 
 * @author naga.pulaparthi
 *
 */
public class SNReportResultVO {
	
	private double numberRegisterAmount;
	private double numberRefundAmount;
	private double bidAmount;
	private double bidRefundAmount;
	private double totalAmount;
	private String covDesc;
	private String covCode;
	private String series;
	private Integer noOfBidders=0;
	private String  officeName; 
	private String officeCode;
	private Integer serviceFee=0;
	private Integer feeAmomuntforSN=0;
	private boolean eBiddingReportExcel;

	
	public Integer getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(Integer serviceFee) {
		this.serviceFee = serviceFee;
	}
	/**
	 * @return the numberRegisterAmount
	 */
	public double getNumberRegisterAmount() {
		return numberRegisterAmount;
	}

	/**
	 * @param numberRegisterAmount the numberRegisterAmount to set
	 */
	public void setNumberRegisterAmount(double numberRegisterAmount) {
		this.numberRegisterAmount = numberRegisterAmount;
	}

	public Integer getFeeAmomuntforSN() {
		return feeAmomuntforSN;
	}

	public void setFeeAmomuntforSN(Integer feeAmomuntforSN) {
		this.feeAmomuntforSN = feeAmomuntforSN;
	}

	/**
	 * @return the numberRefundAmount
	 */
	public double getNumberRefundAmount() {
		return numberRefundAmount;
	}

	/**
	 * @param numberRefundAmount the numberRefundAmount to set
	 */
	public void setNumberRefundAmount(double numberRefundAmount) {
		this.numberRefundAmount = numberRefundAmount;
	}

	/**
	 * @return the bidAmount
	 */
	public double getBidAmount() {
		return bidAmount;
	}

	/**
	 * @param bidAmount the bidAmount to set
	 */
	public void setBidAmount(double bidAmount) {
		this.bidAmount = bidAmount;
	}

	/**
	 * @return the bidRefundAmount
	 */
	public double getBidRefundAmount() {
		return bidRefundAmount;
	}

	/**
	 * @param bidRefundAmount the bidRefundAmount to set
	 */
	public void setBidRefundAmount(double bidRefundAmount) {
		this.bidRefundAmount = bidRefundAmount;
	}

	/**
	 * @return the totalAmount
	 */
	public double getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * @return the covDesc
	 */
	public String getCovDesc() {
		return covDesc;
	}

	/**
	 * @param covDesc the covDesc to set
	 */
	public void setCovDesc(String covDesc) {
		this.covDesc = covDesc;
	}

	/**
	 * @return the covCode
	 */
	public String getCovCode() {
		return covCode;
	}

	/**
	 * @param covCode the covCode to set
	 */
	public void setCovCode(String covCode) {
		this.covCode = covCode;
	}

	/**
	 * @return the series
	 */
	public String getSeries() {
		return series;
	}

	/**
	 * @param series the series to set
	 */
	public void setSeries(String series) {
		this.series = series;
	}

	/**
	 * @return the noOfBidders
	 */
	public Integer getNoOfBidders() {
		return noOfBidders;
	}

	/**
	 * @param noOfBidders the noOfBidders to set
	 */
	public void setNoOfBidders(Integer noOfBidders) {
		this.noOfBidders = noOfBidders;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public boolean iseBiddingReportExcel() {
		return eBiddingReportExcel;
	}

	public void seteBiddingReportExcel(boolean eBiddingReportExcel) {
		this.eBiddingReportExcel = eBiddingReportExcel;
	}
	
}
