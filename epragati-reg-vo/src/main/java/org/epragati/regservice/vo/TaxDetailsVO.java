package org.epragati.regservice.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class TaxDetailsVO {
	
	
	private String cov;
	

	public String getCov() {
		return cov;
	}

	public void setCov(String cov) {
		this.cov = cov;
	}

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validfrom;

	public LocalDate getValidfrom() {
		return validfrom;
	}

	public void setValidfrom(LocalDate validfrom) {
		this.validfrom = validfrom;
	}

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDateTime taxPaymentDAte;

	public LocalDateTime getTaxPaymentDAte() {
		return taxPaymentDAte;
	}

	public void setTaxPaymentDAte(LocalDateTime taxPaymentDAte) {
		this.taxPaymentDAte = taxPaymentDAte;
	}

	private String taxType;

	private Double amount;

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	private Long taxAmount;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate paymentDAte;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validUpto;

	private String vcrno;
	private String mvi;
	private Long collectedAmount;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate date;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate vcrTaxvalidUpto;

	public Long getCollectedAmount() {
		return collectedAmount;
	}

	public void setCollectedAmount(Long collectedAmount) {
		this.collectedAmount = collectedAmount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getVcrno() {
		return vcrno;
	}

	public void setVcrno(String vcrno) {
		this.vcrno = vcrno;
	}

	public String getMvi() {
		return mvi;
	}

	public void setMvi(String mvi) {
		this.mvi = mvi;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public Long getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Long taxAmount) {
		this.taxAmount = taxAmount;
	}

	public LocalDate getPaymentDAte() {
		return paymentDAte;
	}

	public void setPaymentDAte(LocalDate paymentDAte) {
		this.paymentDAte = paymentDAte;
	}

	public LocalDate getValidUpto() {
		return validUpto;
	}

	public void setValidUpto(LocalDate validUpto) {
		this.validUpto = validUpto;
	}

	/**
	 * @return the vcrTaxvalidUpto
	 */
	public LocalDate getVcrTaxvalidUpto() {
		return vcrTaxvalidUpto;
	}

	/**
	 * @param vcrTaxvalidUpto
	 *            the vcrTaxvalidUpto to set
	 */
	public void setVcrTaxvalidUpto(LocalDate vcrTaxvalidUpto) {
		this.vcrTaxvalidUpto = vcrTaxvalidUpto;
	}



}
