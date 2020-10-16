package org.epragati.cfstSync.vo;

import java.time.LocalDate;

import org.hibernate.validator.constraints.NotEmpty;

public class ElasticSecondVehicleVO {

	@NotEmpty(message = "First Name is required.")
	private String firstName;
	

	private String lastName;
	

	private String fatherName; 
	
	@NotEmpty(message = "DOB Name is required.")
	private LocalDate dob;
	
	
	private String displayName;
	private String address1;
	private String address2;
	private String address3;
	private String mandal;
	private String district;
	private String classOfVehicle;
	private String officeCode;
	private String officeAddress;
	
	@NotEmpty(message = "PR Number is required.")
	private String prNumber;
	 
	private Boolean isAadhaarValidate=false;
	
	private String aadhaarNo;
	
	private Boolean synchStatus;

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

	public String getFatherName() {
		return fatherName;
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

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
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

	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getPrNumber() {
		return prNumber;
	}

	public void setPrNumber(String prNumber) {
		this.prNumber = prNumber;
	}

	public Boolean getIsAadhaarValidate() {
		return isAadhaarValidate;
	}

	public void setIsAadhaarValidate(Boolean isAadhaarValidate) {
		this.isAadhaarValidate = isAadhaarValidate;
	}

	public String getAadhaarNo() {
		return aadhaarNo;
	}

	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}

	/**
	 * @return the synchStatus
	 */
	public Boolean getSynchStatus() {
		return synchStatus;
	}

	/**
	 * @param synchStatus the synchStatus to set
	 */
	public void setSynchStatus(Boolean synchStatus) {
		this.synchStatus = synchStatus;
	}

	
}