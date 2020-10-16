package org.epragati.dealer.vo;
/**
 * 
 * @author Krishnarjun Pampana
 *
 */

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TrIssuedVO {

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate trDate;
	private String trNumber;
	private String applicantName;
	private String classOfVehicle; 
	private String modelDesc;
	private String chassisNumber;
	private String engineNumber; 
	private String monthYear;
	private String invoiceNumber;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate invoiceDate;
	private Double invoiceValue;
	private String taxType;
	private Long taxValue;
	private String registredOffice;
	private String dealerName;

	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public LocalDate getTrDate() {
		return trDate;
	}
	public void setTrDate(LocalDate trDate) {
		this.trDate = trDate;
	}
	public String getTrNumber() {
		return trNumber;
	}
	public void setTrNumber(String trNumber) {
		this.trNumber = trNumber;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getClassOfVehicle() {
		return classOfVehicle;
	}
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}
	public String getModelDesc() {
		return modelDesc;
	}
	public void setModelDesc(String modelDesc) {
		this.modelDesc = modelDesc;
	}
	public String getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getMonthYear() {
		return monthYear;
	}
	public void setMonthYear(String monthYear) {
		this.monthYear = monthYear;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public Double getInvoiceValue() {
		return invoiceValue;
	}
	public void setInvoiceValue(Double invoiceValue) {
		this.invoiceValue = invoiceValue;
	}
	public String getTaxType() {
		return taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	public Long getTaxValue() {
		return taxValue;
	}
	public void setTaxValue(Long taxValue) {
		this.taxValue = taxValue;
	}
	public String getRegistredOffice() {
		return registredOffice;
	}
	public void setRegistredOffice(String registredOffice) {
		this.registredOffice = registredOffice;
	} 

}
