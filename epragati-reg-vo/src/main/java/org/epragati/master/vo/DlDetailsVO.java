package org.epragati.master.vo;

import java.time.LocalDate;
import java.util.List;

import org.epragati.payments.vo.ClassOfVehiclesVO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DlDetailsVO {

	private ApplicantDetailsVO applicantDetails;
	private String applicationNo;
	private String dlNo;
	private String dlStatus;
	private String officeCode;
	private String firstIssueOfficeCode;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate firstIssueDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate nonTransportValidTo;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate transportValidTo;
	private String badgeNo;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate badgeNoIssueDate;

	private List<ClassOfVehiclesVO> approvedCovs;
	private String base64;

	/**
	 * @return the applicantDetails
	 */
	public ApplicantDetailsVO getApplicantDetails() {
		return applicantDetails;
	}

	/**
	 * @param applicantDetails the applicantDetails to set
	 */
	public void setApplicantDetails(ApplicantDetailsVO applicantDetails) {
		this.applicantDetails = applicantDetails;
	}

	/**
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}

	/**
	 * @param applicationNo the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	/**
	 * @return the dlNo
	 */
	public String getDlNo() {
		return dlNo;
	}

	/**
	 * @param dlNo the dlNo to set
	 */
	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}

	/**
	 * @return the dlStatus
	 */
	public String getDlStatus() {
		return dlStatus;
	}

	/**
	 * @param dlStatus the dlStatus to set
	 */
	public void setDlStatus(String dlStatus) {
		this.dlStatus = dlStatus;
	}

	

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	/**
	 * @return the firstIssueOfficeCode
	 */
	public String getFirstIssueOfficeCode() {
		return firstIssueOfficeCode;
	}

	/**
	 * @param firstIssueOfficeCode the firstIssueOfficeCode to set
	 */
	public void setFirstIssueOfficeCode(String firstIssueOfficeCode) {
		this.firstIssueOfficeCode = firstIssueOfficeCode;
	}

	/**
	 * @return the firstIssueDate
	 */
	public LocalDate getFirstIssueDate() {
		return firstIssueDate;
	}

	/**
	 * @param firstIssueDate the firstIssueDate to set
	 */
	public void setFirstIssueDate(LocalDate firstIssueDate) {
		this.firstIssueDate = firstIssueDate;
	}

	

	/**
	 * @return the badgeNo
	 */
	public String getBadgeNo() {
		return badgeNo;
	}

	/**
	 * @param badgeNo the badgeNo to set
	 */
	public void setBadgeNo(String badgeNo) {
		this.badgeNo = badgeNo;
	}

	/**
	 * @return the nonTransportValidTo
	 */
	public LocalDate getNonTransportValidTo() {
		return nonTransportValidTo;
	}

	/**
	 * @param nonTransportValidTo the nonTransportValidTo to set
	 */
	public void setNonTransportValidTo(LocalDate nonTransportValidTo) {
		this.nonTransportValidTo = nonTransportValidTo;
	}

	/**
	 * @return the transportValidTo
	 */
	public LocalDate getTransportValidTo() {
		return transportValidTo;
	}

	/**
	 * @param transportValidTo the transportValidTo to set
	 */
	public void setTransportValidTo(LocalDate transportValidTo) {
		this.transportValidTo = transportValidTo;
	}

	

	/**
	 * @return the approvedCovs
	 */
	public List<ClassOfVehiclesVO> getApprovedCovs() {
		return approvedCovs;
	}

	/**
	 * @param approvedCovs the approvedCovs to set
	 */
	public void setApprovedCovs(List<ClassOfVehiclesVO> approvedCovs) {
		this.approvedCovs = approvedCovs;
	}

	/**
	 * @return the badgeNoIssueDate
	 */
	public LocalDate getBadgeNoIssueDate() {
		return badgeNoIssueDate;
	}

	/**
	 * @param badgeNoIssueDate the badgeNoIssueDate to set
	 */
	public void setBadgeNoIssueDate(LocalDate badgeNoIssueDate) {
		this.badgeNoIssueDate = badgeNoIssueDate;
	}

	public String getBase64() {
		return base64;
	}

	public void setBase64(String base64) {
		this.base64 = base64;
	}

	

	
	
	
}
