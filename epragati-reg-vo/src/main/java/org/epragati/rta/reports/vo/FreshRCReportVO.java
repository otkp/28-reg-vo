package org.epragati.rta.reports.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.epragati.master.vo.ApplicantAddressVO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FreshRCReportVO {

	
	
	private String vehicleNo;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime approvedDtae;
	private String officeName;
	private String cov;
	private String financierReason;
	private ApplicantAddressVO yardAddress;
	private String mviName;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime createdDate;
	private String rtoName;
	private String aoName;
	private String status;
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the rtoName
	 */
	public String getRtoName() {
		return rtoName;
	}
	/**
	 * @param rtoName the rtoName to set
	 */
	public void setRtoName(String rtoName) {
		this.rtoName = rtoName;
	}
	/**
	 * @return the aoName
	 */
	public String getAoName() {
		return aoName;
	}
	/**
	 * @param aoName the aoName to set
	 */
	public void setAoName(String aoName) {
		this.aoName = aoName;
	}
	/**
	 * @return the vehicleNo
	 */
	public String getVehicleNo() {
		return vehicleNo;
	}
	/**
	 * @return the approvedDtae
	 */
	public LocalDateTime getApprovedDtae() {
		return approvedDtae;
	}
	/**
	 * @return the createdDate
	 */
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @param approvedDtae the approvedDtae to set
	 */
	public void setApprovedDtae(LocalDateTime approvedDtae) {
		this.approvedDtae = approvedDtae;
	}
	/**
	 * @param vehicleNo the vehicleNo to set
	 */
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	
	/**
	 * @return the officeName
	 */
	public String getOfficeName() {
		return officeName;
	}
	/**
	 * @param officeName the officeName to set
	 */
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	/**
	 * @return the cov
	 */
	public String getCov() {
		return cov;
	}
	/**
	 * @param cov the cov to set
	 */
	public void setCov(String cov) {
		this.cov = cov;
	}
	/**
	 * @return the financierReason
	 */
	public String getFinancierReason() {
		return financierReason;
	}
	/**
	 * @param financierReason the financierReason to set
	 */
	public void setFinancierReason(String financierReason) {
		this.financierReason = financierReason;
	}
	
	/**
	 * @return the yardAddress
	 */
	public ApplicantAddressVO getYardAddress() {
		return yardAddress;
	}
	/**
	 * @param yardAddress the yardAddress to set
	 */
	public void setYardAddress(ApplicantAddressVO yardAddress) {
		this.yardAddress = yardAddress;
	}
	/**
	 * @return the mviName
	 */
	public String getMviName() {
		return mviName;
	}
	/**
	 * @param mviName the mviName to set
	 */
	public void setMviName(String mviName) {
		this.mviName = mviName;
	}
	
}
