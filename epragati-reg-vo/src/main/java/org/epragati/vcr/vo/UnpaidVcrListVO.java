package org.epragati.vcr.vo;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UnpaidVcrListVO {
	private String prNo;
	private String trNo;
	private String fullName;
	private String address;
	
	private String contactNo;
	private String vcrNo;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDateTime bookedDate;
	private String officeName;
	private String classOfVehicle;
	private String bookedMviName;
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	
	public String getClassOfVehicle() {
		return classOfVehicle;
	}
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getVcrNo() {
		return vcrNo;
	}
	public void setVcrNo(String vcrNo) {
		this.vcrNo = vcrNo;
	}
	public LocalDateTime getBookedDate() {
		return bookedDate;
	}
	public void setBookedDate(LocalDateTime bookedDate) {
		this.bookedDate = bookedDate;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public String getBookedMviName() {
		return bookedMviName;
	}
	public void setBookedMviName(String bookedMviName) {
		this.bookedMviName = bookedMviName;
	}
	public String getTrNo() {
		return trNo;
	}
	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}
	
}
