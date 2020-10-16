package org.epragati.payment.report.vo;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class InvoiceDetailsReportVo implements Serializable, Comparable<InvoiceDetailsReportVo> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String dealername;
	private String trNumber;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate trDate;
	private String classOfVehicle;
	private String makername;
	private String makerclass;
	private double invoiceAmount = 0.0;
	// @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate invoiceDate;
	private double taxAmount = 0.0;
	private double total = 0.0;
	private String taxType;

	public String getDealername() {
		return dealername;
	}

	public void setDealername(String dealername) {
		this.dealername = dealername;
	}

	public String getTrNumber() {
		return trNumber;
	}

	public void setTrNumber(String trNumber) {
		this.trNumber = trNumber;
	}

	public LocalDate getTrDate() {
		return trDate;
	}

	public void setTrDate(LocalDate trDate) {
		this.trDate = trDate;
	}

	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	public String getMakername() {
		return makername;
	}

	public void setMakername(String makername) {
		this.makername = makername;
	}

	public String getMakerclass() {
		return makerclass;
	}

	public void setMakerclass(String makerclass) {
		this.makerclass = makerclass;
	}

	public double getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	@Override
	public int compareTo(InvoiceDetailsReportVo o) {
		return dealername.compareTo(o.getDealername());
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
}
