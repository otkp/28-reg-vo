package org.epragati.permits.vo;

import java.time.LocalDateTime;

import org.epragati.util.PermitsEnum.RouteType;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PermitUtilizationVO {

	private String mviId;
	private String mviName;
	private String mviOfficeCode;
	private String mviOfficeName;
	private String place;
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime utilizationDate;
	private RouteType routeType;
	private String remarks;
	
	
	
	//input details
	private String prNo;
	private String tpno;
	
	public String getMviId() {
		return mviId;
	}
	public void setMviId(String mviId) {
		this.mviId = mviId;
	}
	public String getMviName() {
		return mviName;
	}
	public void setMviName(String mviName) {
		this.mviName = mviName;
	}
	public String getMviOfficeCode() {
		return mviOfficeCode;
	}
	public void setMviOfficeCode(String mviOfficeCode) {
		this.mviOfficeCode = mviOfficeCode;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public LocalDateTime getUtilizationDate() {
		return utilizationDate;
	}
	public void setUtilizationDate(LocalDateTime utilizationDate) {
		this.utilizationDate = utilizationDate;
	}
	public RouteType getRouteType() {
		return routeType;
	}
	public void setRouteType(RouteType routeType) {
		this.routeType = routeType;
	}
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	public String getTpno() {
		return tpno;
	}
	public void setTpno(String tpno) {
		this.tpno = tpno;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getMviOfficeName() {
		return mviOfficeName;
	}
	public void setMviOfficeName(String mviOfficeName) {
		this.mviOfficeName = mviOfficeName;
	}
	
	

	
}
