package org.epragati.master.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RegistrationValidityVO {
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDateTime registrationValidity;
	private LocalDateTime QuarterlyTaxValidity;
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate taxValidity;
	private LocalDateTime greenTaxValidity;
	private LocalDate cessValidity;

	private LocalDateTime trValidity;
	private LocalDate financeAgreementDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate prGeneratedDate;
	private LocalDate trGeneratedDate;
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate fcValidity;

	public LocalDateTime getTrValidity() {
		return trValidity;
	}

	public void setTrValidity(LocalDateTime trValidity) {
		this.trValidity = trValidity;
	}

	public LocalDate getFinanceAgreementDate() {
		return financeAgreementDate;
	}

	public void setFinanceAgreementDate(LocalDate financeAgreementDate) {
		this.financeAgreementDate = financeAgreementDate;
	}

	public LocalDate getPrGeneratedDate() {
		return prGeneratedDate;
	}

	public void setPrGeneratedDate(LocalDate prGeneratedDate) {
		this.prGeneratedDate = prGeneratedDate;
	}

	public LocalDate getTrGeneratedDate() {
		return trGeneratedDate;
	}

	public void setTrGeneratedDate(LocalDate trGeneratedDate) {
		this.trGeneratedDate = trGeneratedDate;
	}

	public LocalDate getFcValidity() {
		return fcValidity;
	}

	public void setFcValidity(LocalDate fcValidity) {
		this.fcValidity = fcValidity;
	}

	/**
	 * @return the registrationValidity
	 */
	public LocalDateTime getRegistrationValidity() {
		return registrationValidity;
	}

	/**
	 * @param registrationValidity
	 *            the registrationValidity to set
	 */
	public void setRegistrationValidity(LocalDateTime registrationValidity) {
		this.registrationValidity = registrationValidity;
	}

	/**
	 * @return the quarterlyTaxValidity
	 */
	public LocalDateTime getQuarterlyTaxValidity() {
		return QuarterlyTaxValidity;
	}

	/**
	 * @param quarterlyTaxValidity
	 *            the quarterlyTaxValidity to set
	 */
	public void setQuarterlyTaxValidity(LocalDateTime quarterlyTaxValidity) {
		QuarterlyTaxValidity = quarterlyTaxValidity;
	}

	/**
	 * @return the taxValidity
	 */
	public LocalDate getTaxValidity() {
		return taxValidity;
	}

	/**
	 * @param taxValidity
	 *            the taxValidity to set
	 */
	public void setTaxValidity(LocalDate taxValidity) {
		this.taxValidity = taxValidity;
	}

	/**
	 * @return the greenTaxValidity
	 */
	public LocalDateTime getGreenTaxValidity() {
		return greenTaxValidity;
	}

	/**
	 * @param greenTaxValidity
	 *            the greenTaxValidity to set
	 */
	public void setGreenTaxValidity(LocalDateTime greenTaxValidity) {
		this.greenTaxValidity = greenTaxValidity;
	}

	/**
	 * @return the cessValidity
	 */
	public LocalDate getCessValidity() {
		return cessValidity;
	}

	/**
	 * @param cessValidity
	 *            the cessValidity to set
	 */
	public void setCessValidity(LocalDate cessValidity) {
		this.cessValidity = cessValidity;
	}

}
