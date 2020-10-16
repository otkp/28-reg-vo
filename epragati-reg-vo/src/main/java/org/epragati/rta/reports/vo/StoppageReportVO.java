package org.epragati.rta.reports.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StoppageReportVO {
	
	private String vehicleNo;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate vehicleStoppageDate;
	private String officeName;
	private String stoppageCov;
	private Boolean isWithinState=Boolean.TRUE;
	private String stoppageReason;
	private String StoppageAddress;
	private String StoppageMviName;
	
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public LocalDate getVehicleStoppageDate() {
		return vehicleStoppageDate;
	}
	public void setVehicleStoppageDate(LocalDate vehicleStoppageDate) {
		this.vehicleStoppageDate = vehicleStoppageDate;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public String getStoppageCov() {
		return stoppageCov;
	}
	public void setStoppageCov(String stoppageCov) {
		this.stoppageCov = stoppageCov;
	}
	public Boolean getIsWithinState() {
		return isWithinState;
	}
	public void setIsWithinState(Boolean isWithinState) {
		this.isWithinState = isWithinState;
	}
	public String getStoppageReason() {
		return stoppageReason;
	}
	public void setStoppageReason(String stoppageReason) {
		this.stoppageReason = stoppageReason;
	}
	public String getStoppageAddress() {
		return StoppageAddress;
	}
	public void setStoppageAddress(String stoppageAddress) {
		StoppageAddress = stoppageAddress;
	}
	public String getStoppageMviName() {
		return StoppageMviName;
	}
	public void setStoppageMviName(String stoppageMviName) {
		StoppageMviName = stoppageMviName;
	}
	
	

}
