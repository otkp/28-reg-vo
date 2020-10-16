package org.epragati.rta.reports.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ReportInputVO {
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fromDate;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate toDate;
	
	private String dateCategory;
	
	private String officeCode;
	
	private String role;

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the fromDate
	 */
	public LocalDate getFromDate() {
		return fromDate;
	}

	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * @return the toDate
	 */
	public LocalDate getToDate() {
		return toDate;
	}

	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	/**
	 * @return the dateCategory
	 */
	public String getDateCategory() {
		return dateCategory;
	}

	/**
	 * @param dateCategory the dateCategory to set
	 */
	public void setDateCategory(String dateCategory) {
		this.dateCategory = dateCategory;
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
}
