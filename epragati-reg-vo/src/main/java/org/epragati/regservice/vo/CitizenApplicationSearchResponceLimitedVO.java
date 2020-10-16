package org.epragati.regservice.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CitizenApplicationSearchResponceLimitedVO {

	private String registraionNumber;
	private String ownerName;
	private String classOfVehicle;
	private String makerName;
	private String makerClass;
	private String monthAndYear;
	private String chassisnumber;
	private String engineNumber;
	private String color;
	private String fuelType;
	private Integer rlw;
	private String taxAmount;
	private String nocTo;
	private String status;
	private String bodyType;
	private String registrationAuthority;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate taxPaidDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate taxValidUpto;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate registrationValidUpto;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate nocDate;
	public String getRegistraionNumber() {
		return registraionNumber;
	}
	public void setRegistraionNumber(String registraionNumber) {
		this.registraionNumber = registraionNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
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
	public String getMakerClass() {
		return makerClass;
	}
	public void setMakerClass(String makerClass) {
		this.makerClass = makerClass;
	}
	public String getMonthAndYear() {
		return monthAndYear;
	}
	public void setMonthAndYear(String monthAndYear) {
		this.monthAndYear = monthAndYear;
	}
	public String getChassisnumber() {
		return chassisnumber;
	}
	public void setChassisnumber(String chassisnumber) {
		this.chassisnumber = chassisnumber;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public Integer getRlw() {
		return rlw;
	}
	public void setRlw(Integer rlw) {
		this.rlw = rlw;
	}
	public String getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}
	public String getNocTo() {
		return nocTo;
	}
	public void setNocTo(String nocTo) {
		this.nocTo = nocTo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	public LocalDate getTaxPaidDate() {
		return taxPaidDate;
	}
	public void setTaxPaidDate(LocalDate taxPaidDate) {
		this.taxPaidDate = taxPaidDate;
	}
	public LocalDate getTaxValidUpto() {
		return taxValidUpto;
	}
	public void setTaxValidUpto(LocalDate taxValidUpto) {
		this.taxValidUpto = taxValidUpto;
	}
	public LocalDate getRegistrationValidUpto() {
		return registrationValidUpto;
	}
	public void setRegistrationValidUpto(LocalDate registrationValidUpto) {
		this.registrationValidUpto = registrationValidUpto;
	}
	public LocalDate getNocDate() {
		return nocDate;
	}
	public void setNocDate(LocalDate nocDate) {
		this.nocDate = nocDate;
	}
	public String getRegistrationAuthority() {
		return registrationAuthority;
	}
	public void setRegistrationAuthority(String registrationAuthority) {
		this.registrationAuthority = registrationAuthority;
	}

}
