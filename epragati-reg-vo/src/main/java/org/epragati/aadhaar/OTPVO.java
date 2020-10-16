package org.epragati.aadhaar;

import java.time.LocalDateTime;

import org.hibernate.validator.constraints.NotEmpty;

public class OTPVO {

	@NotEmpty(message = "OTP is required.")
	private String otp;
	
	private String mobileNumber;
	
	private LocalDateTime ExpiryTime;

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public LocalDateTime getExpiryTime() {
		return ExpiryTime;
	}

	public void setExpiryTime(LocalDateTime expiryTime) {
		ExpiryTime = expiryTime;
	}
	
	

}
