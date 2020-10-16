package org.epragati.vcr_dl.vo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DlDetailsVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ApplicantDetailsVO applicantDetails;
	private String applicationNo;
	private String dlNo;
	private String dlStatus;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate nonTransportValidFrom;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate nonTransportValidTo;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate transportValidFrom;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate transportValidTo;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate hazardousValidFrom;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate hazardousValidTo;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate idpValidFrom;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate idpValidTo;
	private String idpNo;
	private String officeCode;
	private String firstIssueOfficeCode;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate firstIssueDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate issuedDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate transportEligibilityFrom;
	private Integer noOfIterations;
	// TODO
	/* private DLOriginVO dlOrigin; */
	private String badgeNo;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate badgeNoIssueDate;
	private String referenceNo;
	private List<ClassOfVehiclesVO> approvedCovs;
	/*
	 *
	 * llrDetails; private List<LlrBasicDetailsVO> llrDetailsLog; private
	 * DlSlotDetailsVO slotDetails; private List<DlSlotDetailsVO> slotDetailsLog;
	 * private FeeDetailsVO feeDetails; private List<FeeDetailsVO> feeDetailsLog;
	 * private List<ActionDetailsVO> approveDetails; private List<RenewalVO>
	 * renewalLog;
	 */
	private String isCardDelivered;
	/*
	 * private CardDispatchedState cardDispatchedState; private
	 * List<CardDispatchDetailsVO> cardDispatchDetails;
	 */
	private boolean isTodayTestDate;
	private String partialPassedDLGenerated;
	/*
	 * private List<FeeDetailsVO> feeDetailsVOList; private List<DLCardRefNumberVO>
	 * dlCardRefNumbers;
	 */
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate creationDate;

	public ApplicantDetailsVO getApplicantDetails() {
		return applicantDetails;
	}

	public void setApplicantDetails(ApplicantDetailsVO applicantDetails) {
		this.applicantDetails = applicantDetails;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getDlNo() {
		return dlNo;
	}

	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}

	public String getDlStatus() {
		return dlStatus;
	}

	public void setDlStatus(String dlStatus) {
		this.dlStatus = dlStatus;
	}

	public LocalDate getNonTransportValidFrom() {
		return nonTransportValidFrom;
	}

	public void setNonTransportValidFrom(LocalDate nonTransportValidFrom) {
		this.nonTransportValidFrom = nonTransportValidFrom;
	}

	public LocalDate getNonTransportValidTo() {
		return nonTransportValidTo;
	}

	public void setNonTransportValidTo(LocalDate nonTransportValidTo) {
		this.nonTransportValidTo = nonTransportValidTo;
	}

	public LocalDate getTransportValidFrom() {
		return transportValidFrom;
	}

	public void setTransportValidFrom(LocalDate transportValidFrom) {
		this.transportValidFrom = transportValidFrom;
	}

	public LocalDate getTransportValidTo() {
		return transportValidTo;
	}

	public void setTransportValidTo(LocalDate transportValidTo) {
		this.transportValidTo = transportValidTo;
	}

	public LocalDate getHazardousValidFrom() {
		return hazardousValidFrom;
	}

	public void setHazardousValidFrom(LocalDate hazardousValidFrom) {
		this.hazardousValidFrom = hazardousValidFrom;
	}

	public LocalDate getHazardousValidTo() {
		return hazardousValidTo;
	}

	public void setHazardousValidTo(LocalDate hazardousValidTo) {
		this.hazardousValidTo = hazardousValidTo;
	}

	public LocalDate getIdpValidFrom() {
		return idpValidFrom;
	}

	public void setIdpValidFrom(LocalDate idpValidFrom) {
		this.idpValidFrom = idpValidFrom;
	}

	public LocalDate getIdpValidTo() {
		return idpValidTo;
	}

	public void setIdpValidTo(LocalDate idpValidTo) {
		this.idpValidTo = idpValidTo;
	}

	public String getIdpNo() {
		return idpNo;
	}

	public void setIdpNo(String idpNo) {
		this.idpNo = idpNo;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getFirstIssueOfficeCode() {
		return firstIssueOfficeCode;
	}

	public void setFirstIssueOfficeCode(String firstIssueOfficeCode) {
		this.firstIssueOfficeCode = firstIssueOfficeCode;
	}

	public LocalDate getFirstIssueDate() {
		return firstIssueDate;
	}

	public void setFirstIssueDate(LocalDate firstIssueDate) {
		this.firstIssueDate = firstIssueDate;
	}

	public LocalDate getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}

	public LocalDate getTransportEligibilityFrom() {
		return transportEligibilityFrom;
	}

	public void setTransportEligibilityFrom(LocalDate transportEligibilityFrom) {
		this.transportEligibilityFrom = transportEligibilityFrom;
	}

	public Integer getNoOfIterations() {
		return noOfIterations;
	}

	public void setNoOfIterations(Integer noOfIterations) {
		this.noOfIterations = noOfIterations;
	}

	public String getBadgeNo() {
		return badgeNo;
	}

	public void setBadgeNo(String badgeNo) {
		this.badgeNo = badgeNo;
	}

	public LocalDate getBadgeNoIssueDate() {
		return badgeNoIssueDate;
	}

	public void setBadgeNoIssueDate(LocalDate badgeNoIssueDate) {
		this.badgeNoIssueDate = badgeNoIssueDate;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public String getIsCardDelivered() {
		return isCardDelivered;
	}

	public void setIsCardDelivered(String isCardDelivered) {
		this.isCardDelivered = isCardDelivered;
	}

	public boolean isTodayTestDate() {
		return isTodayTestDate;
	}

	public void setTodayTestDate(boolean isTodayTestDate) {
		this.isTodayTestDate = isTodayTestDate;
	}

	public String getPartialPassedDLGenerated() {
		return partialPassedDLGenerated;
	}

	public void setPartialPassedDLGenerated(String partialPassedDLGenerated) {
		this.partialPassedDLGenerated = partialPassedDLGenerated;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
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

	@Override
	public String toString() {
		return "DlDetailsVO [applicantDetails=" + applicantDetails + ", applicationNo=" + applicationNo + ", dlNo="
				+ dlNo + ", dlStatus=" + dlStatus + ", nonTransportValidFrom=" + nonTransportValidFrom
				+ ", nonTransportValidTo=" + nonTransportValidTo + ", transportValidFrom=" + transportValidFrom
				+ ", transportValidTo=" + transportValidTo + ", hazardousValidFrom=" + hazardousValidFrom
				+ ", hazardousValidTo=" + hazardousValidTo + ", idpValidFrom=" + idpValidFrom + ", idpValidTo="
				+ idpValidTo + ", idpNo=" + idpNo + ", officeCode=" + officeCode + ", firstIssueOfficeCode="
				+ firstIssueOfficeCode + ", firstIssueDate=" + firstIssueDate + ", issuedDate=" + issuedDate
				+ ", transportEligibilityFrom=" + transportEligibilityFrom + ", noOfIterations=" + noOfIterations
				+ ", badgeNo=" + badgeNo + ", badgeNoIssueDate=" + badgeNoIssueDate + ", referenceNo=" + referenceNo
				+ ", isCardDelivered=" + isCardDelivered + ", isTodayTestDate=" + isTodayTestDate
				+ ", partialPassedDLGenerated=" + partialPassedDLGenerated + ", creationDate=" + creationDate + "]";
	}

}
