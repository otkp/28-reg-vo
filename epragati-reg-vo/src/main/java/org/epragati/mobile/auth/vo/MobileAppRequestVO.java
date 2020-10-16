package org.epragati.mobile.auth.vo;

import java.util.List;

import org.epragati.images.vo.ImageInput;

public class MobileAppRequestVO {

	private String aadharNo;
	private String mobileNo;
	private String password;
	private String otp;
	private String deviceNo;
	private List<ImageInput> imageInput;
	

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}
	

	public String getDeviceNo() {
		return deviceNo;
	}

	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
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
	 * @return the imageInput
	 */
	public List<ImageInput> getImageInput() {
		return imageInput;
	}

	/**
	 * @param imageInput the imageInput to set
	 */
	public void setImageInput(List<ImageInput> imageInput) {
		this.imageInput = imageInput;
	}

	@Override
	public String toString() {
		return "MobileAppRequestVO [aadharNo=" + aadharNo + ", mobileNo=" + mobileNo + ", password="
				+ password + ", otp=" + otp +",deviceNo=" +deviceNo+ "]";
	}

}
