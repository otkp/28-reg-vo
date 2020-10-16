package org.epragati.rta.reports.vo;

import java.time.LocalDateTime;
import java.util.List;

import org.epragati.util.payment.ServiceEnum;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RegServiceReportVO {

	private String applicationNumber;
	
	private List<ServiceEnum> citizenServicesNames;
	
	private String applicationCurrentStatus;
	
	private Integer applicationIteration;
	
	private String vehicleType;
	
	private String ownerType;
	
	private String classOfVehicle;
	
	private String actionRoleName;
	
	private String actionUserName;
	
	
	
	

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
//	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDateTime actionTime;
	
	private String actionStatus;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDateTime createdDate;
	
	private LocalDateTime lastUpdatedDate;
	
	private String officeCode;
	
	private String officeName;
	
	private Integer districtId;
	
	private String applicantName;
	
	private String applicantFatherName;
	
	private String aadhaarNumber;
	
	private String prNumber;
	
	private String chassisNumber;
	
	private String engineNumber;
	
    private String trNumber;
    
    private String ipAddress;
    
    private String vcrNumber;
    
    private String permitNumber;
    
    private String fitnessNumber;
    
    private String appSource;

	public String getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public List<ServiceEnum> getCitizenServicesNames() {
		return citizenServicesNames;
	}

	public void setCitizenServicesNames(List<ServiceEnum> citizenServicesNames) {
		this.citizenServicesNames = citizenServicesNames;
	}

	public String getApplicationCurrentStatus() {
		return applicationCurrentStatus;
	}

	public void setApplicationCurrentStatus(String applicationCurrentStatus) {
		this.applicationCurrentStatus = applicationCurrentStatus;
	}

	public Integer getApplicationIteration() {
		return applicationIteration;
	}

	public void setApplicationIteration(Integer applicationIteration) {
		this.applicationIteration = applicationIteration;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	public String getActionRoleName() {
		return actionRoleName;
	}

	public void setActionRoleName(String actionRoleName) {
		this.actionRoleName = actionRoleName;
	}

	public String getActionUserName() {
		return actionUserName;
	}

	public void setActionUserName(String actionUserName) {
		this.actionUserName = actionUserName;
	}

	public LocalDateTime getActionTime() {
		return actionTime;
	}

	public void setActionTime(LocalDateTime actionTime) {
		this.actionTime = actionTime;
	}

	public String getActionStatus() {
		return actionStatus;
	}

	public void setActionStatus(String actionStatus) {
		this.actionStatus = actionStatus;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantFatherName() {
		return applicantFatherName;
	}

	public void setApplicantFatherName(String applicantFatherName) {
		this.applicantFatherName = applicantFatherName;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public String getPrNumber() {
		return prNumber;
	}

	public void setPrNumber(String prNumber) {
		this.prNumber = prNumber;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getTrNumber() {
		return trNumber;
	}

	public void setTrNumber(String trNumber) {
		this.trNumber = trNumber;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getVcrNumber() {
		return vcrNumber;
	}

	public void setVcrNumber(String vcrNumber) {
		this.vcrNumber = vcrNumber;
	}

	public String getPermitNumber() {
		return permitNumber;
	}

	public void setPermitNumber(String permitNumber) {
		this.permitNumber = permitNumber;
	}

	public String getFitnessNumber() {
		return fitnessNumber;
	}

	public void setFitnessNumber(String fitnessNumber) {
		this.fitnessNumber = fitnessNumber;
	}

	public String getAppSource() {
		return appSource;
	}

	public void setAppSource(String appSource) {
		this.appSource = appSource;
	} 
    
	
}
