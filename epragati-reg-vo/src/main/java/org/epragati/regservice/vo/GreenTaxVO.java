package org.epragati.regservice.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class GreenTaxVO {
	
	private String challanNo;
	
	private Long taxAmount;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate paymentDate;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validUpto;
	private String greenTaxAmount;

	public String getChallanNo() {
		return challanNo;
	}

	public void setChallanNo(String challanNo) {
		this.challanNo = challanNo;
	}

	public Long getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Long taxAmount) {
		this.taxAmount = taxAmount;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public LocalDate getValidUpto() {
		return validUpto;
	}

	public void setValidUpto(LocalDate validUpto) {
		this.validUpto = validUpto;
	}

	public String getGreenTaxAmount() {
		return greenTaxAmount;
	}

	public void setGreenTaxAmount(String greenTaxAmount) {
		this.greenTaxAmount = greenTaxAmount;
	}

}
