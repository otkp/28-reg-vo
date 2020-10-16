package org.epragati.payment.report.vo;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class VCRNonPaymentDetailsVO {

	private String prNo;
	
	private String cov;
	
	private String ownerName;

	private String ownerAddress;
	
	private String officeCode;
	
	private LocalDateTime createdDate;
	
	private String vcrNo;
	
	private String trNo;
	
	private String regApplicationNo;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dateOfCheck;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private String placeOfCheck;
	
	private String vcrIssuedBy;
	
	private String paymentStatus;
	
	private Integer offencetotal;
	
	private String isScNoVcr;
	
	private String isScNoVcrIssuedBy; 
	
	

	public String getIsScNoVcrIssuedBy() {
		return isScNoVcrIssuedBy;
	}

	public void setIsScNoVcrIssuedBy(String isScNoVcrIssuedBy) {
		this.isScNoVcrIssuedBy = isScNoVcrIssuedBy;
	}

	public String getIsScNoVcr() {
		return isScNoVcr;
	}

	public void setIsScNoVcr(String isScNoVcr) {
		this.isScNoVcr = isScNoVcr;
	}

	public Integer getOffencetotal() {
		return offencetotal;
	}

	public void setOffencetotal(Integer offencetotal) {
		this.offencetotal = offencetotal;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getVcrIssuedBy() {
		return vcrIssuedBy;
	}

	public void setVcrIssuedBy(String vcrIssuedBy) {
		this.vcrIssuedBy = vcrIssuedBy;
	}

	public LocalDateTime getDateOfCheck() {
		return dateOfCheck;
	}

	public void setDateOfCheck(LocalDateTime dateOfCheck) {
		this.dateOfCheck = dateOfCheck;
	}

	public String getPlaceOfCheck() {
		return placeOfCheck;
	}

	public void setPlaceOfCheck(String placeOfCheck) {
		this.placeOfCheck = placeOfCheck;
	}

	public String getRegApplicationNo() {
		return regApplicationNo;
	}

	public void setRegApplicationNo(String regApplicationNo) {
		this.regApplicationNo = regApplicationNo;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getCov() {
		return cov;
	}

	public void setCov(String cov) {
		this.cov = cov;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getVcrNo() {
		return vcrNo;
	}

	public void setVcrNo(String vcrNo) {
		this.vcrNo = vcrNo;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}
	
	
	
}
