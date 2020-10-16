package org.epragati.regservice.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.epragati.master.vo.ApplicantAddressVO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BileteralTaxVO {

	private String applicationNo;
	private String purpose;
	private String prNo;
	private String classOfVehicle;
	private Integer gvw;
	private String ownerName;
	private String contactNo;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate homeTaxValidTo;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate icValidTo;
	private String permitNo;
	private String permitIssuedBy;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate permitValidFrom;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate permitValidTo;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fcValidFrom;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fcValidTo;
	private String recommendationLetterNo;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate recommendationLatterDate;
	private String rlIssuedBy;
	private String paymentperoid;
	private String paymentType;
	private String cspPuNo;
	private String ownerAddress;
	private String chassisNumber;
	private String district;
	private boolean status;
	private Double applicationFee;
	private Double serviceFee;
	private Double tax;
	private Double penality;
	private String approvedBy;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime approvedDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validityTo;
	private String officeCode;
	private String covCode;
	private String newOwner;
	private String newOwnerAddress;
	private String newPrNo;
	
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	public String getClassOfVehicle() {
		return classOfVehicle;
	}
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}
	public Integer getGvw() {
		return gvw;
	}
	public void setGvw(Integer gvw) {
		this.gvw = gvw;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public LocalDate getHomeTaxValidTo() {
		return homeTaxValidTo;
	}
	public void setHomeTaxValidTo(LocalDate homeTaxValidTo) {
		this.homeTaxValidTo = homeTaxValidTo;
	}
	public LocalDate getIcValidTo() {
		return icValidTo;
	}
	public void setIcValidTo(LocalDate icValidTo) {
		this.icValidTo = icValidTo;
	}
	public String getPermitNo() {
		return permitNo;
	}
	public void setPermitNo(String permitNo) {
		this.permitNo = permitNo;
	}
	public String getPermitIssuedBy() {
		return permitIssuedBy;
	}
	public void setPermitIssuedBy(String permitIssuedBy) {
		this.permitIssuedBy = permitIssuedBy;
	}
	public LocalDate getPermitValidFrom() {
		return permitValidFrom;
	}
	public void setPermitValidFrom(LocalDate permitValidFrom) {
		this.permitValidFrom = permitValidFrom;
	}
	public LocalDate getPermitValidTo() {
		return permitValidTo;
	}
	public void setPermitValidTo(LocalDate permitValidTo) {
		this.permitValidTo = permitValidTo;
	}
	public LocalDate getFcValidFrom() {
		return fcValidFrom;
	}
	public void setFcValidFrom(LocalDate fcValidFrom) {
		this.fcValidFrom = fcValidFrom;
	}
	public LocalDate getFcValidTo() {
		return fcValidTo;
	}
	public void setFcValidTo(LocalDate fcValidTo) {
		this.fcValidTo = fcValidTo;
	}
	public String getRecommendationLetterNo() {
		return recommendationLetterNo;
	}
	public void setRecommendationLetterNo(String recommendationLetterNo) {
		this.recommendationLetterNo = recommendationLetterNo;
	}
	public LocalDate getRecommendationLatterDate() {
		return recommendationLatterDate;
	}
	public void setRecommendationLatterDate(LocalDate recommendationLatterDate) {
		this.recommendationLatterDate = recommendationLatterDate;
	}
	public String getRlIssuedBy() {
		return rlIssuedBy;
	}
	public void setRlIssuedBy(String rlIssuedBy) {
		this.rlIssuedBy = rlIssuedBy;
	}
	public String getPaymentperoid() {
		return paymentperoid;
	}
	public void setPaymentperoid(String paymentperoid) {
		this.paymentperoid = paymentperoid;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	

	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	public String getCspPuNo() {
		return cspPuNo;
	}
	public void setCspPuNo(String cspPuNo) {
		this.cspPuNo = cspPuNo;
	}
	public String getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Double getApplicationFee() {
		return applicationFee;
	}
	public void setApplicationFee(Double applicationFee) {
		this.applicationFee = applicationFee;
	}
	public Double getServiceFee() {
		return serviceFee;
	}
	public void setServiceFee(Double serviceFee) {
		this.serviceFee = serviceFee;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	public Double getPenality() {
		return penality;
	}
	public void setPenality(Double penality) {
		this.penality = penality;
	}
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
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
	public LocalDate getValidityTo() {
		return validityTo;
	}
	public void setValidityTo(LocalDate validityTo) {
		this.validityTo = validityTo;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public String getCovCode() {
		return covCode;
	}
	public void setCovCode(String covCode) {
		this.covCode = covCode;
	}
	public String getNewOwner() {
		return newOwner;
	}
	public void setNewOwner(String newOwner) {
		this.newOwner = newOwner;
	}
	public String getNewPrNo() {
		return newPrNo;
	}
	public void setNewPrNo(String newPrNo) {
		this.newPrNo = newPrNo;
	}
	public String getNewOwnerAddress() {
		return newOwnerAddress;
	}
	public void setNewOwnerAddress(String newOwnerAddress) {
		this.newOwnerAddress = newOwnerAddress;
	}
	
	
}
