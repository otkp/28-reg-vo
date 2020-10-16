package org.epragati.aadhaar;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class VcrHistoryVO {

	private String prNo;
	private String vcrNumber;
	private String bookedMVIName;
	private String officeName;
	private String compoundingFee;
	private String tax;
	private String penalty;
	private String taxArrears;
	private String penaltyArrears;
	private String enteredBy;
	private String status;
	private String payType;
	private String vcrType;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate paidDate;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate bookedDate;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate entryDate;
	
	public String getTaxArrears() {
		return taxArrears;
	}

	public void setTaxArrears(String taxArrears) {
		this.taxArrears = taxArrears;
	}

	public String getPenaltyArrears() {
		return penaltyArrears;
	}

	public void setPenaltyArrears(String penaltyArrears) {
		this.penaltyArrears = penaltyArrears;
	}

	public LocalDate getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(LocalDate paidDate) {
		this.paidDate = paidDate;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getVcrType() {
		return vcrType;
	}

	public void setVcrType(String vcrType) {
		this.vcrType = vcrType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEnteredBy() {
		return enteredBy;
	}

	public void setEnteredBy(String enteredBy) {
		this.enteredBy = enteredBy;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getVcrNumber() {
		return vcrNumber;
	}

	public void setVcrNumber(String vcrNumber) {
		this.vcrNumber = vcrNumber;
	}

	public String getBookedMVIName() {
		return bookedMVIName;
	}

	public void setBookedMVIName(String bookedMVIName) {
		this.bookedMVIName = bookedMVIName;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getCompoundingFee() {
		return compoundingFee;
	}

	public void setCompoundingFee(String compoundingFee) {
		this.compoundingFee = compoundingFee;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getPenalty() {
		return penalty;
	}

	public void setPenalty(String penalty) {
		this.penalty = penalty;
	}

	public LocalDate getBookedDate() {
		return bookedDate;
	}

	public void setBookedDate(LocalDate bookedDate) {
		this.bookedDate = bookedDate;
	}

	public LocalDate getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(LocalDate entryDate) {
		this.entryDate = entryDate;
	}

	@Override
	public String toString() {
		return "VcrHistoryVO [prNo=" + prNo + ", vcrNumber=" + vcrNumber + ", bookedMVIName=" + bookedMVIName
				+ ", officeName=" + officeName + ", compoundingFee=" + compoundingFee + ", tax=" + tax + ", penalty="
				+ penalty + ", enteredBy=" + enteredBy + ", status=" + status + ", paidDate=" + paidDate + ", payType="
				+ payType + ", vcrType=" + vcrType + ", bookedDate=" + bookedDate + ", entryDate=" + entryDate + "]";
	}

}
