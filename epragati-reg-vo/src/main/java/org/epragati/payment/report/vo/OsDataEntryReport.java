package org.epragati.payment.report.vo;


import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class OsDataEntryReport implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7549974299932305395L;
	
	private String applicationNo;
	private String prNo;
	private String classOfVehicle;
	private String vehicleType;
	private String ownerName;
	private String mviName;
	private Double taxAmount;
	private Long mviAmount;
	private String taxType;
	private String paymentDate;
	private String nocIssuedDate;
	private String stateEntryDate;
	private String stateName;
	private Map<String,List<String>> roles;
	private String vcrNo;
	private String applicationStatus;
	private Map<String,String> throughMvi;
	private Map<String,String> throughOnline;
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getMviName() {
		return mviName;
	}
	public void setMviName(String mviName) {
		this.mviName = mviName;
	}
	public Double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public String getTaxType() {
		return taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Map<String, String> getThroughMvi() {
		return throughMvi;
	}
	public void setThroughMvi(Map<String, String> throughMvi) {
		this.throughMvi = throughMvi;
	}
	public Map<String, String> getThroughOnline() {
		return throughOnline;
	}
	public void setThroughOnline(Map<String, String> throughOnline) {
		this.throughOnline = throughOnline;
	}
	
	public String getClassOfVehicle() {
		return classOfVehicle;
	}
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public Long getMviAmount() {
		return mviAmount;
	}
	public void setMviAmount(Long mviAmount) {
		this.mviAmount = mviAmount;
	}
	
	public Map<String, List<String>> getRoles() {
		return roles;
	}
	public void setRoles(Map<String, List<String>> roles) {
		this.roles = roles;
	}
	
	public String getNocIssuedDate() {
		return nocIssuedDate;
	}
	public void setNocIssuedDate(String nocIssuedDate) {
		this.nocIssuedDate = nocIssuedDate;
	}
	public String getStateEntryDate() {
		return stateEntryDate;
	}
	public void setStateEntryDate(String stateEntryDate) {
		this.stateEntryDate = stateEntryDate;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	public String getVcrNo() {
		return vcrNo;
	}
	public void setVcrNo(String vcrNo) {
		this.vcrNo = vcrNo;
	}
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	@Override
	public String toString() {
		return "OsDataEntryReport [applicationNo=" + applicationNo + ", prNo=" + prNo + ", classOfVehicle="
				+ classOfVehicle + ", vehicleType=" + vehicleType + ", ownerName=" + ownerName + ", mviName=" + mviName
				+ ", taxAmount=" + taxAmount + ", mviAmount=" + mviAmount + ", taxType=" + taxType + ", paymentDate="
				+ paymentDate + ", nocIssuedDate=" + nocIssuedDate + ", stateEntryDate=" + stateEntryDate
				+ ", stateName=" + stateName + ", roles=" + roles + ", vcrNo=" + vcrNo + ", applicationStatus="
				+ applicationStatus + ", throughMvi=" + throughMvi + ", throughOnline=" + throughOnline + "]";
	}
	
	
	
	
	
	
	

}

