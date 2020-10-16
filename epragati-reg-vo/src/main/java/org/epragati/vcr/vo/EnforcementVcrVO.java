package org.epragati.vcr.vo;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EnforcementVcrVO {

	private String officeName;

	private String officeCode;

	private long vcrsClosed;

	private long vcrsOpened;

	private double cfAmount;

	private double taxAmount;

	private double penality;

	private double total;

	private String vcrNo;

	private String regNo;

	private String mviName;

	private long totalVcrs;

	private long seatingCapacity;

	private double prosecutionAmount;

	public long getTotalVcrs() {
		return totalVcrs;
	}

	public void setTotalVcrs(long totalVcrs) {
		this.totalVcrs = totalVcrs;
	}

	public long getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(long seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public double getProsecutionAmount() {
		return prosecutionAmount;
	}

	public void setProsecutionAmount(double prosecutionAmount) {
		this.prosecutionAmount = prosecutionAmount;
	}

	public String getMviName() {
		return mviName;
	}

	public void setMviName(String mviName) {
		this.mviName = mviName;
	}

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate bookedDate;

	private String status;

	private List<String> offence;

	public LocalDate getBookedDate() {
		return bookedDate;
	}

	public void setBookedDate(LocalDate bookedDate) {
		this.bookedDate = bookedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getOffence() {
		return offence;
	}

	public void setOffence(List<String> offence) {
		this.offence = offence;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getVcrNo() {
		return vcrNo;
	}

	public void setVcrNo(String vcrNo) {
		this.vcrNo = vcrNo;
	}

	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	private String classOfVehicle;

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public long getVcrsClosed() {
		return vcrsClosed;
	}

	public void setVcrsClosed(long vcrsClosed) {
		this.vcrsClosed = vcrsClosed;
	}

	public long getVcrsOpened() {
		return vcrsOpened;
	}

	public void setVcrsOpened(long vcrsOpened) {
		this.vcrsOpened = vcrsOpened;
	}

	public double getCfAmount() {
		return cfAmount;
	}

	public void setCfAmount(double cfAmount) {
		this.cfAmount = cfAmount;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public double getPenality() {
		return penality;
	}

	public void setPenality(double penality) {
		this.penality = penality;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

}
