/**
 * 
 */
package org.epragati.master.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author saroj.sahoo
 *
 */
public class InvoiceDetailsVO {
	
	private String invoiceNo;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate invoiceDate;
	
	private Double invoiceValue;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate invoiceDateForOther;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate purchaseDateForOther;

	public LocalDate getInvoiceDateForOther() {
		return invoiceDateForOther;
	}

	public void setInvoiceDateForOther(LocalDate invoiceDateForOther) {
		this.invoiceDateForOther = invoiceDateForOther;
	}

	public LocalDate getPurchaseDateForOther() {
		return purchaseDateForOther;
	}

	public void setPurchaseDateForOther(LocalDate purchaseDateForOther) {
		this.purchaseDateForOther = purchaseDateForOther;
	}

	/**
	 * @return the invoiceNo
	 */
	public String getInvoiceNo() {
		return invoiceNo;
	}

	/**
	 * @param invoiceNo the invoiceNo to set
	 */
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	/**
	 * @return the invoiceDate
	 */
	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * @param invoiceDate the invoiceDate to set
	 */
	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	/**
	 * @return the invoiceValue
	 */
	public Double getInvoiceValue() {
		return invoiceValue;
	}

	/**
	 * @param invoiceValue the invoiceValue to set
	 */
	public void setInvoiceValue(Double invoiceValue) {
		this.invoiceValue = invoiceValue;
	}
	
}
