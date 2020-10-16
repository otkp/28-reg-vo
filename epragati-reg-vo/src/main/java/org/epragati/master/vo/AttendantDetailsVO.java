package org.epragati.master.vo;

import java.time.LocalDate;

import org.epragati.aadhaar.AadhaarDetailsRequestVO;
import org.epragati.aadhaar.AadharDetailsResponseVO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AttendantDetailsVO {

	private String attendantName;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfBirth;
	private String careOf;
	private String gender;
	private ApplicantAddressVO presentAddress;
	private String mobile; 
	private String aadharNo;
	
	private String prNo;
	private String dlNo;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate driverDob;
	private String officeCode;
	private String route;
	private Boolean isEditDetails;
	public AadharDetailsResponseVO driveraadhAarDetailsResponse;
	public AadharDetailsResponseVO attendantAadharResponse;
	
	
	public String getAttendantName() {
		return attendantName;
	}
	public void setAttendantName(String attendantName) {
		this.attendantName = attendantName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCareOf() {
		return careOf;
	}
	public void setCareOf(String careOf) {
		this.careOf = careOf;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public ApplicantAddressVO getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(ApplicantAddressVO presentAddress) {
		this.presentAddress = presentAddress;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
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
	 * @return the driverDob
	 */
	public LocalDate getDriverDob() {
		return driverDob;
	}
	/**
	 * @param driverDob the driverDob to set
	 */
	public void setDriverDob(LocalDate driverDob) {
		this.driverDob = driverDob;
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
	 * @return the route
	 */
	public String getRoute() {
		return route;
	}
	/**
	 * @param route the route to set
	 */
	public void setRoute(String route) {
		this.route = route;
	}
	public Boolean getIsEditDetails() {
		return isEditDetails;
	}
	public void setIsEditDetails(Boolean isEditDetails) {
		this.isEditDetails = isEditDetails;
	}
	public AadharDetailsResponseVO getDriveraadhAarDetailsResponse() {
		return driveraadhAarDetailsResponse;
	}
	public void setDriveraadhAarDetailsResponse(AadharDetailsResponseVO driveraadhAarDetailsResponse) {
		this.driveraadhAarDetailsResponse = driveraadhAarDetailsResponse;
	}
	public AadharDetailsResponseVO getAttendantAadharResponse() {
		return attendantAadharResponse;
	}
	public void setAttendantAadharResponse(AadharDetailsResponseVO attendantAadharResponse) {
		this.attendantAadharResponse = attendantAadharResponse;
	}

	
	

	
	
}
