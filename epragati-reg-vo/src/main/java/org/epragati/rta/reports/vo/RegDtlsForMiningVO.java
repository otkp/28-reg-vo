package org.epragati.rta.reports.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RegDtlsForMiningVO {

	private String prNo;
	private String fuel;
	private String ownerName;
	private String FatherName;
	private String address;
	private String mobileNo;
	private String vehicleClass;
	private String vehicleType;
	private String makersClass;
	private String makersName;
	private String makeYear;
	private String engineNo;
	private String chassisNo;
	private String gvw;
	private String ulw;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate registrationDate;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fcValidUpto;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate permitValidUpto;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate taxValidUpto;

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public LocalDate getFcValidUpto() {
		return fcValidUpto;
	}

	public void setFcValidUpto(LocalDate fcValidUpto) {
		this.fcValidUpto = fcValidUpto;
	}

	public LocalDate getPermitValidUpto() {
		return permitValidUpto;
	}

	public void setPermitValidUpto(LocalDate permitValidUpto) {
		this.permitValidUpto = permitValidUpto;
	}

	public LocalDate getTaxValidUpto() {
		return taxValidUpto;
	}

	public void setTaxValidUpto(LocalDate taxValidUpto) {
		this.taxValidUpto = taxValidUpto;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getFatherName() {
		return FatherName;
	}

	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getMakersClass() {
		return makersClass;
	}

	public void setMakersClass(String makersClass) {
		this.makersClass = makersClass;
	}

	public String getMakersName() {
		return makersName;
	}

	public void setMakersName(String makersName) {
		this.makersName = makersName;
	}

	public String getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(String makeYear) {
		this.makeYear = makeYear;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String getGvw() {
		return gvw;
	}

	public void setGvw(String gvw) {
		this.gvw = gvw;
	}

	public String getUlw() {
		return ulw;
	}

	public void setUlw(String ulw) {
		this.ulw = ulw;
	}

}
