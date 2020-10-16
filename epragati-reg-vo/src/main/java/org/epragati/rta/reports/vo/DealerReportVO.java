package org.epragati.rta.reports.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DealerReportVO {

	private String trNo;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime trGeneratedDate;

	private String applicantName;

	private String classOfVehicle;

	private String makersModel;

	private String chassisNumber;

	private String engineNumber;

	private String hypothecatedBy;

	private Double invoiceAmt;

	private String taxType;

	private Long taxAmt;
	
	private String prNo;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate fromDate;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate toDate;
	

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the fromDate
	 */
	public LocalDate getFromDate() {
		return fromDate;
	}

	/**
	 * @param fromDate the fromDate to set
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
	 * @param toDate the toDate to set
	 */
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	/**
	 * @return the trNo
	 */
	public String getTrNo() {
		return trNo;
	}

	/**
	 * @param trNo
	 *            the trNo to set
	 */
	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	/**
	 * @return the trGeneratedDate
	 */
	public LocalDateTime getTrGeneratedDate() {
		return trGeneratedDate;
	}

	/**
	 * @param trGeneratedDate
	 *            the trGeneratedDate to set
	 */
	public void setTrGeneratedDate(LocalDateTime trGeneratedDate) {
		this.trGeneratedDate = trGeneratedDate;
	}

	/**
	 * @return the applicantName
	 */
	public String getApplicantName() {
		return applicantName;
	}

	/**
	 * @param applicantName
	 *            the applicantName to set
	 */
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	/**
	 * @return the classOfVehicle
	 */
	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	/**
	 * @param classOfVehicle
	 *            the classOfVehicle to set
	 */
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	/**
	 * @return the makersModel
	 */
	public String getMakersModel() {
		return makersModel;
	}

	/**
	 * @param makersModel
	 *            the makersModel to set
	 */
	public void setMakersModel(String makersModel) {
		this.makersModel = makersModel;
	}

	/**
	 * @return the chassisNumber
	 */
	public String getChassisNumber() {
		return chassisNumber;
	}

	/**
	 * @param chassisNumber
	 *            the chassisNumber to set
	 */
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	/**
	 * @return the engineNumber
	 */
	public String getEngineNumber() {
		return engineNumber;
	}

	/**
	 * @param engineNumber
	 *            the engineNumber to set
	 */
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	/**
	 * @return the hypothecatedBy
	 */
	public String getHypothecatedBy() {
		return hypothecatedBy;
	}

	/**
	 * @param hypothecatedBy
	 *            the hypothecatedBy to set
	 */
	public void setHypothecatedBy(String hypothecatedBy) {
		this.hypothecatedBy = hypothecatedBy;
	}

	/**
	 * @return the invoiceAmt
	 */
	public Double getInvoiceAmt() {
		return invoiceAmt;
	}

	/**
	 * @param invoiceAmt
	 *            the invoiceAmt to set
	 */
	public void setInvoiceAmt(Double invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}

	/**
	 * @return the taxType
	 */
	public String getTaxType() {
		return taxType;
	}

	/**
	 * @param taxType
	 *            the taxType to set
	 */
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	/**
	 * @return the taxAmt
	 */
	public Long getTaxAmt() {
		return taxAmt;
	}

	/**
	 * @param taxAmt
	 *            the taxAmt to set
	 */
	public void setTaxAmt(Long taxAmt) {
		this.taxAmt = taxAmt;
	}

}
