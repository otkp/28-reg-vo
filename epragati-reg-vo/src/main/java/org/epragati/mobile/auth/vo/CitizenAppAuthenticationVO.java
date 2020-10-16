package org.epragati.mobile.auth.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author roshan.jugalkishor
 *
 */
public class CitizenAppAuthenticationVO {

	/**
	 * 
	 * Properties
	 */

	private String aadharNo;
	private String firstName;
	private String lastName;
	private String fatherName;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dob;
	private String dlNo;
	private Integer noOfVehicals;
	private String mobileNo;
	private String password;
	private AuthenticationOTP_VO otpDetails;
	private String deviceNo;
	private String status;
	private Boolean isdeactivate = Boolean.FALSE;
	private LocalDateTime isdeactivateDate;
	private Boolean isdeviceDifferent = Boolean.FALSE;
	private String errormsg;
	/**
	 * 
	 * Getter Setter Method
	 * 
	 * @return
	 */

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFatherName() {
		return fatherName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getDlNo() {
		return dlNo;
	}

	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}

	public Integer getNoOfVehicals() {
		return noOfVehicals;
	}

	public void setNoOfVehicals(Integer noOfVehicals) {
		this.noOfVehicals = noOfVehicals;
	}

	public AuthenticationOTP_VO getOtpDetails() {
		return otpDetails;
	}

	public void setOtpDetails(AuthenticationOTP_VO otpDetails) {
		this.otpDetails = otpDetails;
	}

	public String getDeviceNo() {
		return deviceNo;
	}

	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getIsdeactivate() {
		return isdeactivate;
	}

	public void setIsdeactivate(Boolean isdeactivate) {
		this.isdeactivate = isdeactivate;
	}

	/**
	 * @return the isdeactivateDate
	 */
	public LocalDateTime getIsdeactivateDate() {
		return isdeactivateDate;
	}

	/**
	 * @param isdeactivateDate the isdeactivateDate to set
	 */
	public void setIsdeactivateDate(LocalDateTime isdeactivateDate) {
		this.isdeactivateDate = isdeactivateDate;
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
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * @return the isdeviceDifferent
	 */
	public Boolean getIsdeviceDifferent() {
		return isdeviceDifferent;
	}

	/**
	 * @param isdeviceDifferent the isdeviceDifferent to set
	 */
	public void setIsdeviceDifferent(Boolean isdeviceDifferent) {
		this.isdeviceDifferent = isdeviceDifferent;
	}

	/**
	 * @return the errormsg
	 */
	public String getErrormsg() {
		return errormsg;
	}

	/**
	 * @param errormsg the errormsg to set
	 */
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}

	/***
	 * 
	 * toString() method of properties.....
	 * 
	 */

	@Override
	public String toString() {
		return "CitizenAppAuthenticationVO [aadharNo=" + aadharNo + ", firstName=" + firstName + ", lastName="
				+ lastName + ", fatherName=" + fatherName + ", dob=" + dob + ", dlNo=" + dlNo + ", noOfVehicals="
				+ noOfVehicals + ", mobileNo=" + mobileNo + ", password=" + password + ", otpDetails=" + otpDetails
				+ ",status=" + status + ",deviceNo=" + deviceNo + ",isdeactivate=" + isdeactivate + ",isdeactivateDate="
				+ isdeactivateDate + ",isdeviceDifferent="+isdeviceDifferent+",errormsg="+errormsg+"]";
	}

}
