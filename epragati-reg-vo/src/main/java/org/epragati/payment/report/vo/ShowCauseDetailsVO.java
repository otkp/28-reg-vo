package org.epragati.payment.report.vo;

import java.time.LocalDate;


import java.time.LocalDateTime;

import org.epragati.master.vo.RegistrationDetailsVO;
import org.epragati.regservice.vo.TaxDetailsVO;

import com.fasterxml.jackson.annotation.JsonFormat;

import ch.qos.logback.core.status.Status;

public class ShowCauseDetailsVO {
		
	private String  prNo;
	
	private String scNo;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime scIssuedDate;
	
	private String scIssuedBy;
	
	private String scPurpose;
		
	private String status;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate ackDate;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate expDate;
	
	private String expRemark;
	
	private String mviName;
	
	private String approvedBy; 
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime approvedDate;
	
	private LocalDateTime lastUpdatedDate;
	
	private String lastUpdatedUser;
	
	private String scStatus;
	
	private String satisfied;
	
	private String officeCode;
	
	private ShowCauseSectionVO scType;
	
	private String demendNo;
	
	private LocalDate printDate;
	
	private LocalDate rePrintDate;
	
	private Integer printCount;
	
	private Integer rePrintCount;
	
	private Integer penality;
	
	private String penalityArrears;
	
	private String taxArrears;
	
	private Integer totalAmount;
	
	private String cov;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate taxValidity;

	private String ownerName;

	private String ownerAddress;
	
	private String financerName;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fcValidity;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate quarterEndDate;
	
	private Integer pendingQuarters;
	
	private String fatherName;
	
	private String mobileNo;
	
	
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}

	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getScNo() {
		return scNo;
	}

	public void setScNo(String scNo) {
		this.scNo = scNo;
	}

	public LocalDateTime getScIssuedDate() {
		return scIssuedDate;
	}

	public void setScIssuedDate(LocalDateTime scIssuedDate) {
		this.scIssuedDate = scIssuedDate;
	}

	public String getScIssuedBy() {
		return scIssuedBy;
	}

	public void setScIssuedBy(String scIssuedBy) {
		this.scIssuedBy = scIssuedBy;
	}

	public String getScPurpose() {
		return scPurpose;
	}

	public void setScPurpose(String scPurpose) {
		this.scPurpose = scPurpose;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getAckDate() {
		return ackDate;
	}

	public void setAckDate(LocalDate ackDate) {
		this.ackDate = ackDate;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

	public String getExpRemark() {
		return expRemark;
	}

	public void setExpRemark(String expRemark) {
		this.expRemark = expRemark;
	}

	public String getMviName() {
		return mviName;
	}

	public void setMviName(String mviName) {
		this.mviName = mviName;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public LocalDateTime getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(LocalDateTime approvedDate) {
		this.approvedDate = approvedDate;
	}

	public LocalDateTime getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getLastUpdatedUser() {
		return lastUpdatedUser;
	}

	public void setLastUpdatedUser(String lastUpdatedUser) {
		this.lastUpdatedUser = lastUpdatedUser;
	}

	public String getScStatus() {
		return scStatus;
	}

	public void setScStatus(String scStatus) {
		this.scStatus = scStatus;
	}

	public String getSatisfied() {
		return satisfied;
	}

	public void setSatisfied(String satisfied) {
		this.satisfied = satisfied;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public ShowCauseSectionVO getScType() {
		return scType;
	}

	public void setScType(ShowCauseSectionVO scType) {
		this.scType = scType;
	}

	public String getDemendNo() {
		return demendNo;
	}

	public void setDemendNo(String demendNo) {
		this.demendNo = demendNo;
	}

	public LocalDate getPrintDate() {
		return printDate;
	}

	public void setPrintDate(LocalDate printDate) {
		this.printDate = printDate;
	}

	public LocalDate getRePrintDate() {
		return rePrintDate;
	}

	public void setRePrintDate(LocalDate rePrintDate) {
		this.rePrintDate = rePrintDate;
	}

	public Integer getPrintCount() {
		return printCount;
	}

	public void setPrintCount(Integer printCount) {
		this.printCount = printCount;
	}

	public Integer getRePrintCount() {
		return rePrintCount;
	}

	public void setRePrintCount(Integer rePrintCount) {
		this.rePrintCount = rePrintCount;
	}

	public Integer getPenality() {
		return penality;
	}

	public void setPenality(Integer penality) {
		this.penality = penality;
	}

	public String getPenalityArrears() {
		return penalityArrears;
	}

	public void setPenalityArrears(String penalityArrears) {
		this.penalityArrears = penalityArrears;
	}

	public String getTaxArrears() {
		return taxArrears;
	}

	public void setTaxArrears(String taxArrears) {
		this.taxArrears = taxArrears;
	}

	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getCov() {
		return cov;
	}

	public void setCov(String cov) {
		this.cov = cov;
	}

	public LocalDate getTaxValidity() {
		return taxValidity;
	}

	public void setTaxValidity(LocalDate taxValidity) {
		this.taxValidity = taxValidity;
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

	public String getFinancerName() {
		return financerName;
	}

	public void setFinancerName(String financerName) {
		this.financerName = financerName;
	}

	public LocalDate getFcValidity() {
		return fcValidity;
	}

	public void setFcValidity(LocalDate fcValidity) {
		this.fcValidity = fcValidity;
	}

	public LocalDate getQuarterEndDate() {
		return quarterEndDate;
	}

	public void setQuarterEndDate(LocalDate quarterEndDate) {
		this.quarterEndDate = quarterEndDate;
	}

	public Integer getPendingQuarters() {
		return pendingQuarters;
	}

	public void setPendingQuarters(Integer pendingQuarters) {
		this.pendingQuarters = pendingQuarters;
	}
	
	



}
