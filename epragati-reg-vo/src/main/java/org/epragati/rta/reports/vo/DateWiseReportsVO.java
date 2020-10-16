package org.epragati.rta.reports.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DateWiseReportsVO {
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate date;
	private Double quarterlyTax;
	private Double lifeTax;
	private Double fee;
	private Double detection;
	private Double serviceFee;

	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * @return the quarterlyTax
	 */
	public Double getQuarterlyTax() {
		return quarterlyTax;
	}

	/**
	 * @param quarterlyTax
	 *            the quarterlyTax to set
	 */
	public void setQuarterlyTax(Double quarterlyTax) {
		this.quarterlyTax = quarterlyTax;
	}

	/**
	 * @return the lifeTax
	 */
	public Double getLifeTax() {
		return lifeTax;
	}

	/**
	 * @param lifeTax
	 *            the lifeTax to set
	 */
	public void setLifeTax(Double lifeTax) {
		this.lifeTax = lifeTax;
	}

	/**
	 * @return the fee
	 */
	public Double getFee() {
		return fee;
	}

	/**
	 * @param fee
	 *            the fee to set
	 */
	public void setFee(Double fee) {
		this.fee = fee;
	}

	/**
	 * @return the detection
	 */
	public Double getDetection() {
		return detection;
	}

	/**
	 * @param detection
	 *            the detection to set
	 */
	public void setDetection(Double detection) {
		this.detection = detection;
	}

	/**
	 * @return the serviceFee
	 */
	public Double getServiceFee() {
		return serviceFee;
	}

	/**
	 * @param serviceFee
	 *            the serviceFee to set
	 */
	public void setServiceFee(Double serviceFee) {
		this.serviceFee = serviceFee;
	}

}
