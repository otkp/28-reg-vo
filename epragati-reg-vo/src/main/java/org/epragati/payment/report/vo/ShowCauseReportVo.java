package org.epragati.payment.report.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ShowCauseReportVo {
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate fromDate;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate toDate;
	
	private Boolean isExcel;
	
	private String cov;
	
	private String covDescription;
	
	private long nonPaymentCount;
	
	private long underSection55;
	
	private long underSection7;
	
	private long moreThan5Quarters; 
	
	private long underRule12A;
	
	private long underRule6;
	
	
	private long showCauseIssued;
	
	private long regCancelled;
	
	private long vehiclesPaidTaxAfterScIssued;
	
	private long totalAmountCollected;
	
	

	public Boolean getIsExcel() {
		return isExcel;
	}

	public void setIsExcel(Boolean isExcel) {
		this.isExcel = isExcel;
	}

	public String getCov() {
		return cov;
	}

	public void setCov(String cov) {
		this.cov = cov;
	}

	public long getNonPaymentCount() {
		return nonPaymentCount;
	}

	public void setNonPaymentCount(long nonPaymentCount) {
		this.nonPaymentCount = nonPaymentCount;
	}

	

	public long getUnderSection55() {
		return underSection55;
	}

	public void setUnderSection55(long underSection55) {
		this.underSection55 = underSection55;
	}

	public long getMoreThan5Quarters() {
		return moreThan5Quarters;
	}

	public void setMoreThan5Quarters(long moreThan5Quarters) {
		this.moreThan5Quarters = moreThan5Quarters;
	}

	public long getUnderRule12A() {
		return underRule12A;
	}

	public void setUnderRule12A(long underRule12A) {
		this.underRule12A = underRule12A;
	}

	public long getUnderRule6() {
		return underRule6;
	}

	public void setUnderRule6(long underRule6) {
		this.underRule6 = underRule6;
	}

	

	public long getShowCauseIssued() {
		return showCauseIssued;
	}

	public void setShowCauseIssued(long showCauseIssued) {
		this.showCauseIssued = showCauseIssued;
	}

	public long getRegCancelled() {
		return regCancelled;
	}

	public void setRegCancelled(long regCancelled) {
		this.regCancelled = regCancelled;
	}

	public long getVehiclesPaidTaxAfterScIssued() {
		return vehiclesPaidTaxAfterScIssued;
	}

	public void setVehiclesPaidTaxAfterScIssued(long vehiclesPaidTaxAfterScIssued) {
		this.vehiclesPaidTaxAfterScIssued = vehiclesPaidTaxAfterScIssued;
	}

	public long getTotalAmountCollected() {
		return totalAmountCollected;
	}

	public void setTotalAmountCollected(long totalAmountCollected) {
		this.totalAmountCollected = totalAmountCollected;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public long getUnderSection7() {
		return underSection7;
	}

	public void setUnderSection7(long underSection7) {
		this.underSection7 = underSection7;
	}

	public String getCovDescription() {
		return covDescription;
	}

	public void setCovDescription(String covDescription) {
		this.covDescription = covDescription;
	}
	

	
	
}
