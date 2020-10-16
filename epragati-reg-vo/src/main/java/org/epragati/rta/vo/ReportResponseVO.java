package org.epragati.rta.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author krishnarjun.pampana
 *
 */
@JsonInclude(Include.NON_NULL)
public class ReportResponseVO {

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate date;

	private String applicationNo;

	private String applicantName;

	private String trNo;

	private String prNo;

	private String spRegRefId;

	private String bidAmountRefId;

	private String regPaymentStatus;

	private String bidPaymentStatus;

	private Double spRegAmount;

	private Double bidAmount;

	private String finalStatus;

	private Double amount;

	private String mobileNo;
	
	private String spRefStatus;
	
	private String bidRefStatus;
	
	private String selectedPRSeries;
	
	private String numberType;
	
	private String paymentId;
	
	
	public String getSpRefStatus() {
		return spRefStatus;
	}

	public void setSpRefStatus(String spRefStatus) {
		this.spRefStatus = spRefStatus;
	}

	public String getBidRefStatus() {
		return bidRefStatus;
	}

	public void setBidRefStatus(String bidRefStatus) {
		this.bidRefStatus = bidRefStatus;
	}

	public Double getSpRegAmount() {
		return spRegAmount;
	}

	public void setSpRegAmount(Double spRegAmount) {
		this.spRegAmount = spRegAmount;
	}

	public Double getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(Double bidAmount) {
		this.bidAmount = bidAmount;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getSpRegRefId() {
		return spRegRefId;
	}

	public void setSpRegRefId(String spRegRefId) {
		this.spRegRefId = spRegRefId;
	}

	public String getBidAmountRefId() {
		return bidAmountRefId;
	}

	public void setBidAmountRefId(String bidAmountRefId) {
		this.bidAmountRefId = bidAmountRefId;
	}

	public String getRegPaymentStatus() {
		return regPaymentStatus;
	}

	public void setRegPaymentStatus(String regPaymentStatus) {
		this.regPaymentStatus = regPaymentStatus;
	}

	public String getBidPaymentStatus() {
		return bidPaymentStatus;
	}

	public void setBidPaymentStatus(String bidPaymentStatus) {
		this.bidPaymentStatus = bidPaymentStatus;
	}

	public String getFinalStatus() {
		return finalStatus;
	}

	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @return the selectedPRSeries
	 */
	public String getSelectedPRSeries() {
		return selectedPRSeries;
	}

	/**
	 * @param selectedPRSeries the selectedPRSeries to set
	 */
	public void setSelectedPRSeries(String selectedPRSeries) {
		this.selectedPRSeries = selectedPRSeries;
	}

	/**
	 * @return the numberType
	 */
	public String getNumberType() {
		return numberType;
	}

	/**
	 * @param numberType the numberType to set
	 */
	public void setNumberType(String numberType) {
		this.numberType = numberType;
	}

	/**
	 * @return the paymentId
	 */
	public String getPaymentId() {
		return paymentId;
	}

	/**
	 * @param paymentId the paymentId to set
	 */
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	

}
