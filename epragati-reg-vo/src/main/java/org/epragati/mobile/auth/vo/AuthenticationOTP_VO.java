package org.epragati.mobile.auth.vo;

import java.time.LocalDateTime;

public class AuthenticationOTP_VO {
	/**
	 * Properties of OTP
	 */

	private String aadharNumber;
	private String mobileNumber;
	private String displayName;
	private Integer otp;
	private LocalDateTime timeStamp;

	/**
	 * 
	 * 
	 * @return
	 */

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public Integer getOtp() {
		return otp;
	}

	public void setOtp(Integer otp) {
		this.otp = otp;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	
	/**
	 * 
	 * 
	 */
	
	@Override
	public String toString() {
		return "AuthenticationOTP_VO [aadharNumber=" + aadharNumber + ", mobileNumber=" + mobileNumber
				+ ", displayName=" + displayName + ", otp=" + otp + ", timeStamp=" + timeStamp + "]";
	}

	

}
