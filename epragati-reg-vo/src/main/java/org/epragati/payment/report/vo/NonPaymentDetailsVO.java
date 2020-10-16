package org.epragati.payment.report.vo;

import java.time.LocalDate;
import java.util.List;

import org.epragati.rta.reports.vo.ReportVO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class NonPaymentDetailsVO {
	
private String  prNo;
	
    private String cov;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate taxValidity;

	private String ownerName;

	private String ownerAddress;
	
	private String mandalName;
	
	private String financerName;
	
	private String financerAddress;
	
	private List<ReportVO> covReport;
	
	private String officeCode;
	
	private String scNo;
	
	private String sectionCode;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fcValidity;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate permitValidity;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate scNoIssuedOn;
	
	private String mviName;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate fromDate;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate toDate;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate quarterEndDate;
	
	private Integer pendingQuarters;
	
	private String fatherName;
	
	private String mobileNo;
	
	private Integer gvw;
	
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}

	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
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

	public LocalDate getTaxValidity() {
		return taxValidity;
	}

	public void setTaxValidity(LocalDate taxValidity) {
		this.taxValidity = taxValidity;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getFinancerName() {
		return financerName;
	}

	public void setFinancerName(String financerName) {
		this.financerName = financerName;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public LocalDate getFcValidity() {
		return fcValidity;
	}

	public void setFcValidity(LocalDate fcValidity) {
		this.fcValidity = fcValidity;
	}

	public LocalDate getPermitValidity() {
		return permitValidity;
	}

	public void setPermitValidity(LocalDate permitValidity) {
		this.permitValidity = permitValidity;
	}

	public String getFinancerAddress() {
		return financerAddress;
	}

	public void setFinancerAddress(String financerAddress) {
		this.financerAddress = financerAddress;
	}

	public List<ReportVO> getCovReport() {
		return covReport;
	}

	public void setCovReport(List<ReportVO> covReport) {
		this.covReport = covReport;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	public String getMandalName() {
		return mandalName;
	}

	public void setMandalName(String mandalName) {
		this.mandalName = mandalName;
	}

	public String getScNo() {
		return scNo;
	}

	public void setScNo(String scNo) {
		this.scNo = scNo;
	}

	public String getSectionCode() {
		return sectionCode;
	}

	public void setSectionCode(String sectionCode) {
		this.sectionCode = sectionCode;
	}

	public LocalDate getScNoIssuedOn() {
		return scNoIssuedOn;
	}

	public void setScNoIssuedOn(LocalDate scNoIssuedOn) {
		this.scNoIssuedOn = scNoIssuedOn;
	}

	public String getMviName() {
		return mviName;
	}

	public void setMviName(String mviName) {
		this.mviName = mviName;
	}
	
	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public LocalDate getQuarterEndDate() {
		return quarterEndDate;
	}

	public void setQuarterEndDate(LocalDate quarterEndDate) {
		this.quarterEndDate = quarterEndDate;
	}

	public Integer getPendingQuarters() {
		return pendingQuarters;
	}

	public void setPendingQuarters(Integer pendingQuarters) {
		this.pendingQuarters = pendingQuarters;
	}

	public Integer getGvw() {
		return gvw;
	}

	public void setGvw(Integer gvw) {
		this.gvw = gvw;
	}

	
	

	
	
	

}
