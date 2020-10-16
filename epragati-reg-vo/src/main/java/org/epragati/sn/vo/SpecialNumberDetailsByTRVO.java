package org.epragati.sn.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SpecialNumberDetailsByTRVO {
	
	private String specialNumber;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate date;
	
	private String status;
	
	private String id;


	/**
	 * @return the specialNumber
	 */
	public String getSpecialNumber() {
		return specialNumber;
	}

	/**
	 * @param specialNumber the specialNumber to set
	 */
	public void setSpecialNumber(String specialNumber) {
		this.specialNumber = specialNumber;
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
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	

}
