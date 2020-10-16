package org.epragati.dispatcher.vo;

public class ExcelGenerationDispatchVO {

	private String applicationNo;
	private String prNo;
	private String name;
	private String emsNumber;
	private String dispatchedBy;
	private String officeCode;

	private String postedDate;

	private String remarks;

	public String getDispatchedBy() {
		return dispatchedBy;
	}

	public void setDispatchedBy(String dispatchedBy) {
		this.dispatchedBy = dispatchedBy;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmsNumber() {
		return emsNumber;
	}

	public void setEmsNumber(String emsNumber) {
		this.emsNumber = emsNumber;
	}

	public String getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(String postedDate) {
		this.postedDate = postedDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "DispatcherFormSubmissionDTO [applicationNo=" + applicationNo + ", prNo=" + prNo + ", name=" + name
				+ ", emsNumber=" + emsNumber + ", postedDate=" + postedDate + ", remarks=" + remarks + "]";
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

}
