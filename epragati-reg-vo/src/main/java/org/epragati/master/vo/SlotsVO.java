package org.epragati.master.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * @author sairam.cheruku
 *
 */
public class SlotsVO {
	
private List<String> service;
	
	private String module;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;
	
	private String officeCode;
	
	private Integer availableSlots;
	private Integer booked;
	
	private Integer totalSlots;
	
	private Boolean holiday;
	
	private Boolean isFastFilling;
	
	private String status;
	
	private Integer lockedSlots;
	
	private LocalDateTime createdDate;
	
	private LocalDateTime updatedDate;
	

	/**
	 * @return the booked
	 */
	public Integer getBooked() {
		return booked;
	}

	/**
	 * @param booked the booked to set
	 */
	public void setBooked(Integer booked) {
		this.booked = booked;
	}

	public Boolean getHoliday() {
		return holiday;
	}

	public void setHoliday(Boolean holiday) {
		this.holiday = holiday;
	}

	/**
	 * @return the service
	 */
	public List<String> getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(List<String> service) {
		this.service = service;
	}

	/**
	 * @return the module
	 */
	public String getModule() {
		return module;
	}

	/**
	 * @param module the module to set
	 */
	public void setModule(String module) {
		this.module = module;
	}

	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	/**
	 * @return the availableSlots
	 */
	public Integer getAvailableSlots() {
		return availableSlots;
	}

	/**
	 * @param availableSlots the availableSlots to set
	 */
	public void setAvailableSlots(Integer availableSlots) {
		this.availableSlots = availableSlots;
	}

	/**
	 * @return the totalSlots
	 */
	public Integer getTotalSlots() {
		return totalSlots;
	}

	/**
	 * @param totalSlots the totalSlots to set
	 */
	public void setTotalSlots(Integer totalSlots) {
		this.totalSlots = totalSlots;
	}

	/**
	 * @return the isFastFilling
	 */
	public Boolean getIsFastFilling() {
		return isFastFilling;
	}

	/**
	 * @param isFastFilling the isFastFilling to set
	 */
	public void setIsFastFilling(Boolean isFastFilling) {
		this.isFastFilling = isFastFilling;
	}

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
	 * @return the lockedSlots
	 */
	public Integer getLockedSlots() {
		return lockedSlots;
	}

	/**
	 * @param lockedSlots the lockedSlots to set
	 */
	public void setLockedSlots(Integer lockedSlots) {
		this.lockedSlots = lockedSlots;
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
	 * @return the updatedDate
	 */
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	/**
	 * @return the createdDate
	 */
	
	/**
	 * @return the updatedDate
	 */
	
}
