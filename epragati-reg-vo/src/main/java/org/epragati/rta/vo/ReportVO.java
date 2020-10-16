package org.epragati.rta.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class ReportVO {
	
	private String officeCode;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fromDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate toDate;
	
	private String reportType;
	
	private String prNo;
	
	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
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



}
