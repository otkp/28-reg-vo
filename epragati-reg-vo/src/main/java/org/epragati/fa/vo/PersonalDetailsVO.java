package org.epragati.fa.vo;

import java.time.LocalDate;

import org.epragati.master.vo.ApplicantAddressVO;
import org.epragati.master.vo.ApplicantDetailsVO;


public class PersonalDetailsVO {
private String applicantName;

private String fatherName;

private LocalDate dateOfBirth;

private String gender;

private String  maritalStatus;

private String mobileNo;

private String emailId;

private AddressVO address;

private ApplicantAddressVO  presentAddress;

private String vehicleNo;

private String classofVehicle;

private String familyMemberName;

private String relationWithApplicant;

private String aadharNo;

public String getApplicantName() {
	return applicantName;
}

public void setApplicantName(String applicantName) {
	this.applicantName = applicantName;
}

public String getFatherName() {
	return fatherName;
}

public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}

public LocalDate getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
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

public String getMaritalStatus() {
	return maritalStatus;
}

public void setMaritalStatus(String maritalStatus) {
	this.maritalStatus = maritalStatus;
}

public String getMobileNo() {
	return mobileNo;
}

public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public AddressVO getAddress() {
	return address;
}

public void setAddress(AddressVO address) {
	this.address = address;
}

public String getVehicleNo() {
	return vehicleNo;
}

public void setVehicleNo(String vehicleNo) {
	this.vehicleNo = vehicleNo;
}

public String getClassofVehicle() {
	return classofVehicle;
}

public void setClassofVehicle(String classofVehicle) {
	this.classofVehicle = classofVehicle;
}

public String getFamilyMemberName() {
	return familyMemberName;
}

public void setFamilyMemberName(String familyMemberName) {
	this.familyMemberName = familyMemberName;
}

public String getRelationWithApplicant() {
	return relationWithApplicant;
}

public void setRelationWithApplicant(String relationWithApplicant) {
	this.relationWithApplicant = relationWithApplicant;
}

public String getAadharNo() {
	return aadharNo;
}

public void setAadharNo(String aadharNo) {
	this.aadharNo = aadharNo;
}




}
