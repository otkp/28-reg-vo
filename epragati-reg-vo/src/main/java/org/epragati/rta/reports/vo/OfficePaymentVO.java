package org.epragati.rta.reports.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@JsonInclude(Include.NON_NULL)
public class OfficePaymentVO {
	
	private String paymentMode;
	
	private Integer gatewayId;
	
	private Double quarterlyTax;
	
	private Double lifeTax;
	
	private Double fee;
	
	private Double serviceFee;
	
	private Double compundingFee;
	
	private Double total;
	
	private String officeCode;
	
	 public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	private ReportTotalsVo grandTotals;
	
	public ReportTotalsVo getGrandTotals() {
		return grandTotals;
	}

	public void setGrandTotals(ReportTotalsVo grandTotals) {
		this.grandTotals = grandTotals;
	}

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate date;

	private String applicationNo;
	
	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Double getQuarterlyTax() {
		return quarterlyTax;
	}

	public void setQuarterlyTax(Double quarterlyTax) {
		this.quarterlyTax = quarterlyTax;
	}

	public Double getLifeTax() {
		return lifeTax;
	}

	public void setLifeTax(Double lifeTax) {
		this.lifeTax = lifeTax;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public Double getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(Double serviceFee) {
		this.serviceFee = serviceFee;
	}

	public Double getCompundingFee() {
		return compundingFee;
	}

	public void setCompundingFee(Double compundingFee) {
		this.compundingFee = compundingFee;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	public Integer getGatewayId() {
		return gatewayId;
	}

	public void setGatewayId(Integer gatewayId) {
		this.gatewayId = gatewayId;
	}
}
