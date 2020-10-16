package org.epragati.payment.report.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class RCCancellationVO {

	private String prNo;

	private String cov;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate taxValidity;

	private String ownerName;

	private String ownerAddress;

	private String mandalName;

	private String financerName;

	private String financerAddress;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fcValidity;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate permitValidity;

	private String reasonForCancellation;

	private Boolean isVehicleCondemmed;

	private Boolean isCancelledByCitizen;

	private Integer noOfTimesNoticeGiven;
	
	private String aoRemarks;
	
	private String mviRemarks;

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

	public String getMandalName() {
		return mandalName;
	}

	public void setMandalName(String mandalName) {
		this.mandalName = mandalName;
	}

	public String getFinancerName() {
		return financerName;
	}

	public void setFinancerName(String financerName) {
		this.financerName = financerName;
	}

	public String getFinancerAddress() {
		return financerAddress;
	}

	public void setFinancerAddress(String financerAddress) {
		this.financerAddress = financerAddress;
	}

	public LocalDate getFcValidity() {
		return fcValidity;
	}

	public void setFcValidity(LocalDate fcValidity) {
		this.fcValidity = fcValidity;
	}

	public LocalDate getPermitValidity() {
		return permitValidity;
	}

	public void setPermitValidity(LocalDate permitValidity) {
		this.permitValidity = permitValidity;
	}

	public String getReasonForCancellation() {
		return reasonForCancellation;
	}

	public void setReasonForCancellation(String reasonForCancellation) {
		this.reasonForCancellation = reasonForCancellation;
	}

	public Boolean getIsVehicleCondemmed() {
		return isVehicleCondemmed;
	}

	public void setIsVehicleCondemmed(Boolean isVehicleCondemmed) {
		this.isVehicleCondemmed = isVehicleCondemmed;
	}

	public Boolean getIsCancelledByCitizen() {
		return isCancelledByCitizen;
	}

	public void setIsCancelledByCitizen(Boolean isCancelledByCitizen) {
		this.isCancelledByCitizen = isCancelledByCitizen;
	}

	public Integer getNoOfTimesNoticeGiven() {
		return noOfTimesNoticeGiven;
	}

	public void setNoOfTimesNoticeGiven(Integer noOfTimesNoticeGiven) {
		this.noOfTimesNoticeGiven = noOfTimesNoticeGiven;
	}

	public String getAoRemarks() {
		return aoRemarks;
	}

	public void setAoRemarks(String aoRemarks) {
		this.aoRemarks = aoRemarks;
	}

	public String getMviRemarks() {
		return mviRemarks;
	}

	public void setMviRemarks(String mviRemarks) {
		this.mviRemarks = mviRemarks;
	}
	
	
	

}
