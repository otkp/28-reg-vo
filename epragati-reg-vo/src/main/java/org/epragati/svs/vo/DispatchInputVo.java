package org.epragati.svs.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DispatchInputVo {
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private String fromDate;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private String toDate;
	
	private String officeCode;

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	
}
