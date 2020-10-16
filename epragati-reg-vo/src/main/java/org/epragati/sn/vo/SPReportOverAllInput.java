package org.epragati.sn.vo;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SPReportOverAllInput {

	@NotNull(message = "From date is required.")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fromDate;

	@NotNull(message = "To date is required.")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate toDate;

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

}
