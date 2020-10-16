package org.epragati.elastic.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class RtaDetails {
	
	private String fullName;
	private String firstName;
	private String fatherName;
	private String gender;
	private String city;
	private String address1;
	private String address2;
	private String address3;
	private String aadharNo;
	private String dob;
	private String classOfVehicle;
	private boolean isAadhaarValidate;
	private String makerName;
	private String officeCode;
	private String registrationNo;
	private String vehicleSearchId;
	private String mandalId;
	private String districtId;
	private String address;
	private boolean isSynchStatus;
	private String officeAddress;
	private Integer priority;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	public String getMakerName() {
		return makerName;
	}

	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getVehicleSearchId() {
		return vehicleSearchId;
	}

	public void setVehicleSearchId(String vehicleSearchId) {
		this.vehicleSearchId = vehicleSearchId;
	}

	public String getMandalId() {
		return mandalId;
	}

	public void setMandalId(String mandalId) {
		this.mandalId = mandalId;
	}

	public String getDistrictId() {
		return districtId;
	}

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the isSynchStatus
	 */

	/**
	 * @return the officeAddress
	 */
	public String getOfficeAddress() {
		return officeAddress;
	}

	/**
	 * @param officeAddress
	 *            the officeAddress to set
	 */
	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	
	public boolean isSynchStatus() {
		return isSynchStatus;
	}

	/**
	 * @param isSynchStatus the isSynchStatus to set
	 */
	public void setSynchStatus(boolean isSynchStatus) {
		this.isSynchStatus = isSynchStatus;
	}

	/**
	 * @return the isAadhaarValidate
	 */
	public boolean isAadhaarValidate() {
		return isAadhaarValidate;
	}

	/**
	 * @param isAadhaarValidate the isAadhaarValidate to set
	 */
	public void setAadhaarValidate(boolean isAadhaarValidate) {
		this.isAadhaarValidate = isAadhaarValidate;
	}

	/**
	 * @return the priority
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
}
