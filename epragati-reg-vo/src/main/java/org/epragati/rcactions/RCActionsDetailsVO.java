package org.epragati.rcactions;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)

public class RCActionsDetailsVO {
	
	private String officeMemoNumber;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate memoDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fromDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate toDate;
	private String source;
	private String referenceNumber;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate referenceDate;
	private String sectionOrRule;
	private boolean punishment;
	private String punishmentComments;
	private boolean showCauseIssued;
	private String showCauseIssuedComments;
	private String orderNumber;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate orderDate;
	private String mviName;
	private String remarks;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate revocationDate;
	private String reason;
	private String actionBy;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate actionDate;
	private String mviInspection;
	private String mviInspectioncomments;
	private String referenceBy;
	private String finalStatus;
	private String reasonForAo;
	private String ownerName;
	private String classOfVehicle;
	private String suspendedBy;
	private String revokedBy;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime regValidity;
	
	
	public LocalDateTime getRegValidity() {
		return regValidity;
	}
	public void setRegValidity(LocalDateTime regValidity) {
		this.regValidity = regValidity;
	}
	/**
	 * @return the suspendedBy
	 */
	public String getSuspendedBy() {
		return suspendedBy;
	}
	/**
	 * @param suspendedBy the suspendedBy to set
	 */
	public void setSuspendedBy(String suspendedBy) {
		this.suspendedBy = suspendedBy;
	}
	/**
	 * @return the revokedBy
	 */
	public String getRevokedBy() {
		return revokedBy;
	}
	/**
	 * @param revokedBy the revokedBy to set
	 */
	public void setRevokedBy(String revokedBy) {
		this.revokedBy = revokedBy;
	}
	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}
	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	/**
	 * @return the classOfVehicle
	 */
	public String getClassOfVehicle() {
		return classOfVehicle;
	}
	/**
	 * @param classOfVehicle the classOfVehicle to set
	 */
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}
	public String getOfficeMemoNumber() {
		return officeMemoNumber;
	}
	public void setOfficeMemoNumber(String officeMemoNumber) {
		this.officeMemoNumber = officeMemoNumber;
	}
	public LocalDate getMemoDate() {
		return memoDate;
	}
	public void setMemoDate(LocalDate memoDate) {
		this.memoDate = memoDate;
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
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	public LocalDate getReferenceDate() {
		return referenceDate;
	}
	public void setReferenceDate(LocalDate referenceDate) {
		this.referenceDate = referenceDate;
	}
	public String getSectionOrRule() {
		return sectionOrRule;
	}
	public void setSectionOrRule(String sectionOrRule) {
		this.sectionOrRule = sectionOrRule;
	}
	public boolean isPunishment() {
		return punishment;
	}
	public void setPunishment(boolean punishment) {
		this.punishment = punishment;
	}
	public String getPunishmentComments() {
		return punishmentComments;
	}
	public void setPunishmentComments(String punishmentComments) {
		this.punishmentComments = punishmentComments;
	}
	public boolean isShowCauseIssued() {
		return showCauseIssued;
	}
	public void setShowCauseIssued(boolean showCauseIssued) {
		this.showCauseIssued = showCauseIssued;
	}
	public String getShowCauseIssuedComments() {
		return showCauseIssuedComments;
	}
	public void setShowCauseIssuedComments(String showCauseIssuedComments) {
		this.showCauseIssuedComments = showCauseIssuedComments;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public String getMviName() {
		return mviName;
	}
	public void setMviName(String mviName) {
		this.mviName = mviName;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public LocalDate getRevocationDate() {
		return revocationDate;
	}
	public void setRevocationDate(LocalDate revocationDate) {
		this.revocationDate = revocationDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getActionBy() {
		return actionBy;
	}
	public void setActionBy(String actionBy) {
		this.actionBy = actionBy;
	}
	public LocalDate getActionDate() {
		return actionDate;
	}
	public void setActionDate(LocalDate actionDate) {
		this.actionDate = actionDate;
	}
	public String getMviInspection() {
		return mviInspection;
	}
	public void setMviInspection(String mviInspection) {
		this.mviInspection = mviInspection;
	}
	public String getMviInspectioncomments() {
		return mviInspectioncomments;
	}
	public void setMviInspectioncomments(String mviInspectioncomments) {
		this.mviInspectioncomments = mviInspectioncomments;
	}
	public String getReferenceBy() {
		return referenceBy;
	}
	public void setReferenceBy(String referenceBy) {
		this.referenceBy = referenceBy;
	}
	public String getFinalStatus() {
		return finalStatus;
	}
	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
	}
	public String getReasonForAo() {
		return reasonForAo;
	}
	public void setReasonForAo(String reasonForAo) {
		this.reasonForAo = reasonForAo;
	}
	
}
