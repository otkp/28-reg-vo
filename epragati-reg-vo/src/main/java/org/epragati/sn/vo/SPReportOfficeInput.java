package org.epragati.sn.vo;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SPReportOfficeInput {

	@NotNull(message = "Office code is required.")
	private String officeCode;

	@NotNull(message = "From date is required.")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fromDate;

	@NotNull(message = "To date is required.")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate toDate;

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode
	 *            the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	/**
	 * @return the fromDate
	 */
	public LocalDate getFromDate() {
		return fromDate;
	}

	/**
	 * @param fromDate
	 *            the fromDate to set
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
	 * @param toDate
	 *            the toDate to set
	 */
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SPReportOfficeInput [" + (officeCode != null ? "officeCode=" + officeCode + ", " : "")
				+ (fromDate != null ? "fromDate=" + fromDate + ", " : "") + (toDate != null ? "toDate=" + toDate : "")
				+ "]";
	}

}
