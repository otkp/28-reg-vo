package org.epragati.rta.reports.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author manikanta guptha
 *
 */

public class FitnessReportVO {

	private String prNo;
	private String classOfVehicle;
	private String ownerName;
	private String chassisNo;
	private String approvedBy;
	private String fcNumber;
	private String status;
	private String officeName;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fcValidUpto;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fcValidFrom;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate approvedDate;
	
	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getFcValidFrom() {
		return fcValidFrom;
	}

	public void setFcValidFrom(LocalDate fcValidFrom) {
		this.fcValidFrom = fcValidFrom;
	}

	public String getFcNumber() {
		return fcNumber;
	}

	public void setFcNumber(String fcNumber) {
		this.fcNumber = fcNumber;
	}

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

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public LocalDate getFcValidUpto() {
		return fcValidUpto;
	}

	public void setFcValidUpto(LocalDate fcValidUpto) {
		this.fcValidUpto = fcValidUpto;
	}

	public LocalDate getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(LocalDate approvedDate) {
		this.approvedDate = approvedDate;
	}

}
