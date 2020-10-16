package org.epragati.regservice.vo;


import java.time.LocalDate;
import java.util.List;

import org.epragati.rta.reports.vo.ReportVO;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class NOCDetailsVO {
	
	private String state;
	
	private String rtaOffice;
	
	
	private String district;
	
	private String periodOfStay;
	
	private PoliceClearanceCertificateVO policeClearanceDetails;
	
	private IssuingAuthorityDetailsVO issueAuthorityDetails;	
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfEnter;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate issueDate;
	
	private String nOCIssuedRtaOffice;
	
	private boolean isNocIssued;
	
	private String cancellationReason;
	
	private String officeCode;
	
	private List<ReportVO> covReport;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRtaOffice() {
		return rtaOffice;
	}

	public void setRtaOffice(String rtaOffice) {
		this.rtaOffice = rtaOffice;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPeriodOfStay() {
		return periodOfStay;
	}

	public void setPeriodOfStay(String periodOfStay) {
		this.periodOfStay = periodOfStay;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	
	public LocalDate getDateOfEnter() {
		return dateOfEnter;
	}

	public void setDateOfEnter(LocalDate dateOfEnter) {
		this.dateOfEnter = dateOfEnter;
	}

	public String getnOCIssuedRtaOffice() {
		return nOCIssuedRtaOffice;
	}

	public void setnOCIssuedRtaOffice(String nOCIssuedRtaOffice) {
		this.nOCIssuedRtaOffice = nOCIssuedRtaOffice;
	}

	/**
	 * @return the policeClearanceDetails
	 */
	public PoliceClearanceCertificateVO getPoliceClearanceDetails() {
		return policeClearanceDetails;
	}

	/**
	 * @param policeClearanceDetails the policeClearanceDetails to set
	 */
	public void setPoliceClearanceDetails(PoliceClearanceCertificateVO policeClearanceDetails) {
		this.policeClearanceDetails = policeClearanceDetails;
	}

	/**
	 * @return the issueAuthorityDetails
	 */
	public IssuingAuthorityDetailsVO getIssueAuthorityDetails() {
		return issueAuthorityDetails;
	}

	/**
	 * @param issueAuthorityDetails the issueAuthorityDetails to set
	 */
	public void setIssueAuthorityDetails(IssuingAuthorityDetailsVO issueAuthorityDetails) {
		this.issueAuthorityDetails = issueAuthorityDetails;
	}

	public String getCancellationReason() {
		return cancellationReason;
	}

	public void setCancellationReason(String cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	public boolean isNocIssued() {
		return isNocIssued;
	}

	public void setNocIssued(boolean isNocIssued) {
		this.isNocIssued = isNocIssued;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public List<ReportVO> getCovReport() {
		return covReport;
	}

	public void setCovReport(List<ReportVO> covReport) {
		this.covReport = covReport;
	}


}
