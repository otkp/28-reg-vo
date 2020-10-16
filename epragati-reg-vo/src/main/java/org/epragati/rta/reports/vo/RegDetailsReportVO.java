package org.epragati.rta.reports.vo;

import java.time.LocalDateTime;

import org.epragati.common.vo.BaseVO;

public class RegDetailsReportVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String trNo;

	private String prNo;

	private String cov;

	private String dealerName;

	private String makersModel;

	private String makersDesc;

	private Double invoiceAmount;

	private String officeCode;

	private String taxType;

	private Long taxAmount;

	private String applicantName;

	private String officeName;

	private LocalDateTime taxValidity;

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public LocalDateTime getTaxValidity() {
		return taxValidity;
	}

	public void setTaxValidity(LocalDateTime taxValidity) {
		this.taxValidity = taxValidity;
	}

	public Double getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(Double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getCov() {
		return cov;
	}

	public void setCov(String cov) {
		this.cov = cov;
	}

	public String getDealerName() {
		return dealerName;
	}

	public String getMakersModel() {
		return makersModel;
	}

	public void setMakersModel(String makersModel) {
		this.makersModel = makersModel;
	}

	public String getMakersDesc() {
		return makersDesc;
	}

	public void setMakersDesc(String makersDesc) {
		this.makersDesc = makersDesc;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
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

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

}
