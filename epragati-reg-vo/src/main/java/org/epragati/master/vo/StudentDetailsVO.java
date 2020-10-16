package org.epragati.master.vo;

import java.time.LocalDate;


import com.fasterxml.jackson.annotation.JsonFormat;

public class StudentDetailsVO {

	private Double slNo;
	private String studenttName;
	private String fatherName;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfBirth;
	private String mobile;
	private String gender;
	private BloodGroupVO bloodGrp;
	private String emergencyContactNo;
	private String email;
	private String studying;
	private String prNo;
	
	public String getStudenttName() {
		return studenttName;
	}
	public void setStudenttName(String studenttName) {
		this.studenttName = studenttName;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public BloodGroupVO getBloodGrp() {
		return bloodGrp;
	}
	public void setBloodGrp(BloodGroupVO bloodGrp) {
		this.bloodGrp = bloodGrp;
	}
	public String getEmergencyContactNo() {
		return emergencyContactNo;
	}
	public void setEmergencyContactNo(String emergencyContactNo) {
		this.emergencyContactNo = emergencyContactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStudying() {
		return studying;
	}
	public void setStudying(String studying) {
		this.studying = studying;
	}
	/**
	 * @return the slNo
	 */
	public Double getSlNo() {
		return slNo;
	}
	/**
	 * @param slNo the slNo to set
	 */
	public void setSlNo(Double slNo) {
		this.slNo = slNo;
	}
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	
	
}
