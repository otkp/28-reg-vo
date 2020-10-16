package org.epragati.regservice.vo;

import java.util.List;
import java.util.Set;

import org.epragati.master.vo.ActionDetailsVO;
import org.epragati.payments.vo.FeeDetailsVO;

public class FeeCorrectionVO {

	private String id;
	private String applicationNo;
	private String trNo;
	private String prNo;
	private String chassisNo;
	
	private List<FeeDetailsVO> feeDetails;
	
	private Double applicationFee;
	private Double card;
	
	private Double permitApplicationFee;
	
	private Long quarterlyTax;
	private Long cessFee;
	private Long greenTax;
	
	private Long lifeTax;
	
	private Double serviceFee;
	private Double postal;
	
	private String officeCode;
	private String role;
	private List<ActionDetailsVO> actiondetails;
	private String remarks;
	private LockedDetailsVO lockedDetails;
	private Set<String> currentRoles;
	private boolean status;
	private boolean approved;
	private String applicationType;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
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
	public String getChassisNo() {
		return chassisNo;
	}
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}
	public List<FeeDetailsVO> getFeeDetails() {
		return feeDetails;
	}
	public void setFeeDetails(List<FeeDetailsVO> feeDetails) {
		this.feeDetails = feeDetails;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<ActionDetailsVO> getActiondetails() {
		return actiondetails;
	}
	public void setActiondetails(List<ActionDetailsVO> actiondetails) {
		this.actiondetails = actiondetails;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
	public Double getCard() {
		return card;
	}
	public void setCard(Double card) {
		this.card = card;
	}
	public Double getPermitApplicationFee() {
		return permitApplicationFee;
	}
	public void setPermitApplicationFee(Double permitApplicationFee) {
		this.permitApplicationFee = permitApplicationFee;
	}
	public Long getQuarterlyTax() {
		return quarterlyTax;
	}
	public void setQuarterlyTax(Long quarterlyTax) {
		this.quarterlyTax = quarterlyTax;
	}
	public Long getCessFee() {
		return cessFee;
	}
	public void setCessFee(Long cessFee) {
		this.cessFee = cessFee;
	}
	public Long getGreenTax() {
		return greenTax;
	}
	public void setGreenTax(Long greenTax) {
		this.greenTax = greenTax;
	}
	public Long getLifeTax() {
		return lifeTax;
	}
	public void setLifeTax(Long lifeTax) {
		this.lifeTax = lifeTax;
	}
	public Double getServiceFee() {
		return serviceFee;
	}
	public void setServiceFee(Double serviceFee) {
		this.serviceFee = serviceFee;
	}
	public Double getPostal() {
		return postal;
	}
	public void setPostal(Double postal) {
		this.postal = postal;
	}

	public Set<String> getCurrentRoles() {
		return currentRoles;
	}
	public void setCurrentRoles(Set<String> currentRoles) {
		this.currentRoles = currentRoles;
	}
	public LockedDetailsVO getLockedDetails() {
		return lockedDetails;
	}
	public void setLockedDetails(LockedDetailsVO lockedDetails) {
		this.lockedDetails = lockedDetails;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	/**
	 * @return the applicationType
	 */
	public String getApplicationType() {
		return applicationType;
	}
	/**
	 * @param applicationType the applicationType to set
	 */
	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}
	
	
	
	
	
	}
