package org.epragati.master.vo;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author saroj.sahoo
 *
 */

public class UserRegistrationApplicationsVO {
	
	private Integer uraId;
	private String applicationNo;
	private Integer serviceId;
	private String variationType;
	private Integer status;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.mmm")
	private LocalDateTime createdDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.mmm")
	private LocalDateTime lUpdate;
	/**
	 * @return the uraId
	 */
	public Integer getUraId() {
		return uraId;
	}
	/**
	 * @param uraId the uraId to set
	 */
	public void setUraId(Integer uraId) {
		this.uraId = uraId;
	}
	/**
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}
	/**
	 * @param applicationNo the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	/**
	 * @return the serviceId
	 */
	public Integer getServiceId() {
		return serviceId;
	}
	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	/**
	 * @return the variationType
	 */
	public String getVariationType() {
		return variationType;
	}
	/**
	 * @param variationType the variationType to set
	 */
	public void setVariationType(String variationType) {
		this.variationType = variationType;
	}
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
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
	 * @return the lUpdate
	 */
	public LocalDateTime getlUpdate() {
		return lUpdate;
	}
	/**
	 * @param lUpdate the lUpdate to set
	 */
	public void setlUpdate(LocalDateTime lUpdate) {
		this.lUpdate = lUpdate;
	}
	
}
