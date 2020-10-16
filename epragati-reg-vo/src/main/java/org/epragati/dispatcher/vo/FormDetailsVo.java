package org.epragati.dispatcher.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FormDetailsVo {

	private String registrationType;
	private String applicationNo;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private String fromDate;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private String toDate;
	public String getRegistrationType() {
		return registrationType;
	}
	public void setRegistrationType(String registrationType) {
		this.registrationType = registrationType;
	}
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
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
	
	
}
