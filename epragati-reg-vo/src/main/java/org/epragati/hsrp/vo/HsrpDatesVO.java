package org.epragati.hsrp.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HsrpDatesVO {
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private String fromDate;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private String toDate;
	
	private String authrefNo;

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

	public String getAuthrefNo() {
		return authrefNo;
	}

	public void setAuthrefNo(String authrefNo) {
		this.authrefNo = authrefNo;
	}
	
	

}
