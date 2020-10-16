package org.epragati.regservice.vo;


import java.time.LocalDate;
import java.time.LocalDateTime;

import org.epragati.util.payment.ServiceEnum;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
@JsonInclude(Include.NON_NULL)
public class SlotDetailsVO {
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate testSlotDate;
	private String slotTime;
	@JsonFormat(pattern = "dd-MM-yyyy HH:MM:SS")
	private LocalDateTime slotCreatedDate;
	private String status;
	private String statusComment;
	private ServiceEnum serviceType;
	/**
	 * @return the testSlotDate
	 */
	public LocalDate getTestSlotDate() {
		return testSlotDate;
	}
	/**
	 * @param testSlotDate the testSlotDate to set
	 */
	public void setTestSlotDate(LocalDate testSlotDate) {
		this.testSlotDate = testSlotDate;
	}
	/**
	 * @return the slotTime
	 */
	public String getSlotTime() {
		return slotTime;
	}
	/**
	 * @param slotTime the slotTime to set
	 */
	public void setSlotTime(String slotTime) {
		this.slotTime = slotTime;
	}
	/**
	 * @return the slotCreatedDate
	 */
	public LocalDateTime getSlotCreatedDate() {
		return slotCreatedDate;
	}
	/**
	 * @param slotCreatedDate the slotCreatedDate to set
	 */
	public void setSlotCreatedDate(LocalDateTime slotCreatedDate) {
		this.slotCreatedDate = slotCreatedDate;
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
	 * @return the statusComment
	 */
	public String getStatusComment() {
		return statusComment;
	}
	/**
	 * @param statusComment the statusComment to set
	 */
	public void setStatusComment(String statusComment) {
		this.statusComment = statusComment;
	}
	/**
	 * @return the serviceType
	 */
	public ServiceEnum getServiceType() {
		return serviceType;
	}
	/**
	 * @param serviceType the serviceType to set
	 */
	public void setServiceType(ServiceEnum serviceType) {
		this.serviceType = serviceType;
	}

}

