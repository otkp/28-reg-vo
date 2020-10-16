package org.epragati.rta.reports.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author manikanta guptha
 *
 */
public class StagingRejectedListVO {

	private String trNo;
	private String name;
	private String cov;
	private String invoiceAmount;
	private String applicantAddress;
	private String mobileNo;
	private String dealerName;
	private String dealerAddress;
	private String secondVehNo;
	private String status;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate rejectedDate;

	public LocalDate getRejectedDate() {
		return rejectedDate;
	}

	public void setRejectedDate(LocalDate rejectedDate) {
		this.rejectedDate = rejectedDate;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCov() {
		return cov;
	}

	public void setCov(String cov) {
		this.cov = cov;
	}

	public String getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getApplicantAddress() {
		return applicantAddress;
	}

	public void setApplicantAddress(String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getDealerAddress() {
		return dealerAddress;
	}

	public void setDealerAddress(String dealerAddress) {
		this.dealerAddress = dealerAddress;
	}

	public String getSecondVehNo() {
		return secondVehNo;
	}

	public void setSecondVehNo(String secondVehNo) {
		this.secondVehNo = secondVehNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
