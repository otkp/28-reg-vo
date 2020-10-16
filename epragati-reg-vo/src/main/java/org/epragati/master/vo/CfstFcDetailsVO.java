package org.epragati.master.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class CfstFcDetailsVO {
	
	private String fcNumber;

	private LocalDateTime fcIssuedDate;

	private String officeCode;

	private String vehicleNumber;


	private LocalDate fcValidUpto;

	private String inspectedMviName;

	private String OfficeName;

	private String chassisNo;

	private String engineNo;

	private String classOfVehicle;
	
	private String mfgDate;
	
	private String applicationNo;
	
	private String trNo;
	
	private String prNo;
	
	
	private LocalDateTime inspectedDate;
	
	
	private LocalDate issuedDate;
	
	private String issueState;
	
	public LocalDate getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}

	public String getIssueState() {
		return issueState;
	}

	public void setIssueState(String issueState) {
		this.issueState = issueState;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	/**
	 * @return the fcNumber
	 */
	public String getFcNumber() {
		return fcNumber;
	}

	/**
	 * @param fcNumber the fcNumber to set
	 */
	public void setFcNumber(String fcNumber) {
		this.fcNumber = fcNumber;
	}

	/**
	 * @return the fcIssuedDate
	 */
	public LocalDateTime getFcIssuedDate() {
		return fcIssuedDate;
	}

	/**
	 * @param fcIssuedDate the fcIssuedDate to set
	 */
	public void setFcIssuedDate(LocalDateTime fcIssuedDate) {
		this.fcIssuedDate = fcIssuedDate;
	}

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	/**
	 * @return the vehicleNumber
	 */
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	/**
	 * @param vehicleNumber the vehicleNumber to set
	 */
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	/**
	 * @return the fcValidUpto
	 */
	public LocalDate getFcValidUpto() {
		return fcValidUpto;
	}

	/**
	 * @param fcValidUpto the fcValidUpto to set
	 */
	public void setFcValidUpto(LocalDate fcValidUpto) {
		this.fcValidUpto = fcValidUpto;
	}

	/**
	 * @return the inspectedMviName
	 */
	public String getInspectedMviName() {
		return inspectedMviName;
	}

	/**
	 * @param inspectedMviName the inspectedMviName to set
	 */
	public void setInspectedMviName(String inspectedMviName) {
		this.inspectedMviName = inspectedMviName;
	}

	/**
	 * @return the officeName
	 */
	public String getOfficeName() {
		return OfficeName;
	}

	/**
	 * @param officeName the officeName to set
	 */
	public void setOfficeName(String officeName) {
		OfficeName = officeName;
	}

	/**
	 * @return the chassisNo
	 */
	public String getChassisNo() {
		return chassisNo;
	}

	/**
	 * @param chassisNo the chassisNo to set
	 */
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	/**
	 * @return the engineNo
	 */
	public String getEngineNo() {
		return engineNo;
	}

	/**
	 * @param engineNo the engineNo to set
	 */
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	/**
	 * @return the classOfVehicle
	 */
	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	/**
	 * @param classOfVehicle the classOfVehicle to set
	 */
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	public String getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}

	/**
	 * @return the trNo
	 */
	public String getTrNo() {
		return trNo;
	}

	/**
	 * @param trNo the trNo to set
	 */
	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the inspectedDate
	 */
	public LocalDateTime getInspectedDate() {
		return inspectedDate;
	}

	/**
	 * @param inspectedDate the inspectedDate to set
	 */
	public void setInspectedDate(LocalDateTime inspectedDate) {
		this.inspectedDate = inspectedDate;
	}
	
}
