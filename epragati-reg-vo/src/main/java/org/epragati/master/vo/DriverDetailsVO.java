package org.epragati.master.vo;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;



public class DriverDetailsVO {

	private String dlNo;
	private String firstIssueOfficeName;
	private String firstIssueOfficeCode;
	private String driverName;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dob;
	private String careOf;
	private String gender;
	private ApplicantAddressVO presentAddress;
	private String mobile; 
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dlIssueDate;
	private String badgeNo;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate nonTransportValidity;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate transportValidity;
	private String aadharNo;
	private Double driverExperience;
	private List<String> nonTransportCovs;
	private List<String> trasportCovs;
	private String dlStatus;
	private String officeName;
	private String officeCode;
	private String base64;
	private boolean enableDriverThumb;
	/**
	 * @return the dlNo
	 */
	public String getDlNo() {
		return dlNo;
	}
	/**
	 * @param dlNo the dlNo to set
	 */
	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}
	/**
	 * @return the firstIssueOfficeName
	 */
	public String getFirstIssueOfficeName() {
		return firstIssueOfficeName;
	}
	/**
	 * @param firstIssueOfficeName the firstIssueOfficeName to set
	 */
	public void setFirstIssueOfficeName(String firstIssueOfficeName) {
		this.firstIssueOfficeName = firstIssueOfficeName;
	}
	/**
	 * @return the firstIssueOfficeCode
	 */
	public String getFirstIssueOfficeCode() {
		return firstIssueOfficeCode;
	}
	/**
	 * @param firstIssueOfficeCode the firstIssueOfficeCode to set
	 */
	public void setFirstIssueOfficeCode(String firstIssueOfficeCode) {
		this.firstIssueOfficeCode = firstIssueOfficeCode;
	}
	/**
	 * @return the driverName
	 */
	public String getDriverName() {
		return driverName;
	}
	/**
	 * @param driverName the driverName to set
	 */
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	/**
	 * @return the careOf
	 */
	public String getCareOf() {
		return careOf;
	}
	/**
	 * @param careOf the careOf to set
	 */
	public void setCareOf(String careOf) {
		this.careOf = careOf;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the presentAddress
	 */
	public ApplicantAddressVO getPresentAddress() {
		return presentAddress;
	}
	/**
	 * @param presentAddress the presentAddress to set
	 */
	public void setPresentAddress(ApplicantAddressVO presentAddress) {
		this.presentAddress = presentAddress;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the dlIssueDate
	 */
	public LocalDate getDlIssueDate() {
		return dlIssueDate;
	}
	/**
	 * @param dlIssueDate the dlIssueDate to set
	 */
	public void setDlIssueDate(LocalDate dlIssueDate) {
		this.dlIssueDate = dlIssueDate;
	}
	/**
	 * @return the badgeNo
	 */
	public String getBadgeNo() {
		return badgeNo;
	}
	/**
	 * @param badgeNo the badgeNo to set
	 */
	public void setBadgeNo(String badgeNo) {
		this.badgeNo = badgeNo;
	}
	/**
	 * @return the nonTransportValidity
	 */
	public LocalDate getNonTransportValidity() {
		return nonTransportValidity;
	}
	/**
	 * @param nonTransportValidity the nonTransportValidity to set
	 */
	public void setNonTransportValidity(LocalDate nonTransportValidity) {
		this.nonTransportValidity = nonTransportValidity;
	}
	/**
	 * @return the transportValidity
	 */
	public LocalDate getTransportValidity() {
		return transportValidity;
	}
	/**
	 * @param transportValidity the transportValidity to set
	 */
	public void setTransportValidity(LocalDate transportValidity) {
		this.transportValidity = transportValidity;
	}
	/**
	 * @return the aadharNo
	 */
	public String getAadharNo() {
		return aadharNo;
	}
	/**
	 * @param aadharNo the aadharNo to set
	 */
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	/**
	 * @return the driverExperience
	 */
	public Double getDriverExperience() {
		return driverExperience;
	}
	/**
	 * @param driverExperience the driverExperience to set
	 */
	public void setDriverExperience(Double driverExperience) {
		this.driverExperience = driverExperience;
	}
	/**
	 * @return the nonTransportCovs
	 */
	public List<String> getNonTransportCovs() {
		return nonTransportCovs;
	}
	/**
	 * @param nonTransportCovs the nonTransportCovs to set
	 */
	public void setNonTransportCovs(List<String> nonTransportCovs) {
		this.nonTransportCovs = nonTransportCovs;
	}
	/**
	 * @return the trasportCovs
	 */
	public List<String> getTrasportCovs() {
		return trasportCovs;
	}
	/**
	 * @param trasportCovs the trasportCovs to set
	 */
	public void setTrasportCovs(List<String> trasportCovs) {
		this.trasportCovs = trasportCovs;
	}
	/**
	 * @return the dlStatus
	 */
	public String getDlStatus() {
		return dlStatus;
	}
	/**
	 * @param dlStatus the dlStatus to set
	 */
	public void setDlStatus(String dlStatus) {
		this.dlStatus = dlStatus;
	}
	/**
	 * @return the officeName
	 */
	public String getOfficeName() {
		return officeName;
	}
	/**
	 * @param officeName the officeName to set
	 */
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	/**
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getBase64() {
		return base64;
	}
	public void setBase64(String base64) {
		this.base64 = base64;
	}
	public boolean isEnableDriverThumb() {
		return enableDriverThumb;
	}
	public void setEnableDriverThumb(boolean enableDriverThumb) {
		this.enableDriverThumb = enableDriverThumb;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	
	
}
