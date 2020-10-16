package org.epragati.aadhaarseeding.vo;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AadhaarSeededVO {
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate date;
	
	private Integer totalAttemptToSeed;
	private List<String> totalAttemptDl;
	
	private Integer totalAutoApproved;
	private List<String> totalAutoApprovedDl;
    private boolean isMobileUploaded;
	


	public boolean isMobileUploaded() {
		return isMobileUploaded;
	}

	public void setMobileUploaded(boolean isMobileUploaded) {
		this.isMobileUploaded = isMobileUploaded;
	}
	
	/**
	 * @return the totalAutoApproved
	 */
	public Integer getTotalAutoApproved() {
		return totalAutoApproved;
	}
	/**
	 * @return the totalAutoApprovedDl
	 */
	public List<String> getTotalAutoApprovedDl() {
		return totalAutoApprovedDl;
	}
	/**
	 * @param totalAutoApproved the totalAutoApproved to set
	 */
	public void setTotalAutoApproved(Integer totalAutoApproved) {
		this.totalAutoApproved = totalAutoApproved;
	}
	/**
	 * @param totalAutoApprovedDl the totalAutoApprovedDl to set
	 */
	public void setTotalAutoApprovedDl(List<String> totalAutoApprovedDl) {
		this.totalAutoApprovedDl = totalAutoApprovedDl;
	}
	private Integer totalAutoRejected;
	private List<String> totalAutoRejectedDl;
	
	private Integer totalCCOApproved;
	private List<String> totalCCOApprovedDl;
	
	private Integer totalCCORejected;
	private List<String> totalCCORejectedDl;
	
	private Integer totalCCONeedToApprove;
	private List<String> totalCCONeedTOApproveDl;
	
	private Integer citizenVerification;
	private List<String> citizenVerificationDL;
	
	
	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}
	/**
	 * @return the totalAttemptToSeed
	 */
	public Integer getTotalAttemptToSeed() {
		return totalAttemptToSeed;
	}
	/**
	 * @return the totalAttemptDl
	 */
	public List<String> getTotalAttemptDl() {
		return totalAttemptDl;
	}
	
	/**
	 * @return the totalAutoRejected
	 */
	public Integer getTotalAutoRejected() {
		return totalAutoRejected;
	}
	/**
	 * @return the totalAutoRejectedDl
	 */
	public List<String> getTotalAutoRejectedDl() {
		return totalAutoRejectedDl;
	}
	/**
	 * @return the totalCCOApproved
	 */
	public Integer getTotalCCOApproved() {
		return totalCCOApproved;
	}
	/**
	 * @return the totalCCOApprovedDl
	 */
	public List<String> getTotalCCOApprovedDl() {
		return totalCCOApprovedDl;
	}
	/**
	 * @return the totalCCORejected
	 */
	public Integer getTotalCCORejected() {
		return totalCCORejected;
	}
	/**
	 * @return the totalCCORejectedDl
	 */
	public List<String> getTotalCCORejectedDl() {
		return totalCCORejectedDl;
	}
	/**
	 * @return the totalCCONeedToApprove
	 */
	public Integer getTotalCCONeedToApprove() {
		return totalCCONeedToApprove;
	}
	/**
	 * @return the totalCCONeedTOApproveDl
	 */
	public List<String> getTotalCCONeedTOApproveDl() {
		return totalCCONeedTOApproveDl;
	}
	/**
	 * @return the citizenVerification
	 */
	public Integer getCitizenVerification() {
		return citizenVerification;
	}
	/**
	 * @return the citizenVerificationDL
	 */
	public List<String> getCitizenVerificationDL() {
		return citizenVerificationDL;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}
	/**
	 * @param totalAttemptToSeed the totalAttemptToSeed to set
	 */
	public void setTotalAttemptToSeed(Integer totalAttemptToSeed) {
		this.totalAttemptToSeed = totalAttemptToSeed;
	}
	/**
	 * @param totalAttemptDl the totalAttemptDl to set
	 */
	public void setTotalAttemptDl(List<String> totalAttemptDl) {
		this.totalAttemptDl = totalAttemptDl;
	}
	/**
	 * @param totalAutoRejected the totalAutoRejected to set
	 */
	public void setTotalAutoRejected(Integer totalAutoRejected) {
		this.totalAutoRejected = totalAutoRejected;
	}
	/**
	 * @param totalAutoRejectedDl the totalAutoRejectedDl to set
	 */
	public void setTotalAutoRejectedDl(List<String> totalAutoRejectedDl) {
		this.totalAutoRejectedDl = totalAutoRejectedDl;
	}
	/**
	 * @param totalCCOApproved the totalCCOApproved to set
	 */
	public void setTotalCCOApproved(Integer totalCCOApproved) {
		this.totalCCOApproved = totalCCOApproved;
	}
	/**
	 * @param totalCCOApprovedDl the totalCCOApprovedDl to set
	 */
	public void setTotalCCOApprovedDl(List<String> totalCCOApprovedDl) {
		this.totalCCOApprovedDl = totalCCOApprovedDl;
	}
	/**
	 * @param totalCCORejected the totalCCORejected to set
	 */
	public void setTotalCCORejected(Integer totalCCORejected) {
		this.totalCCORejected = totalCCORejected;
	}
	/**
	 * @param totalCCORejectedDl the totalCCORejectedDl to set
	 */
	public void setTotalCCORejectedDl(List<String> totalCCORejectedDl) {
		this.totalCCORejectedDl = totalCCORejectedDl;
	}
	/**
	 * @param totalCCONeedToApprove the totalCCONeedToApprove to set
	 */
	public void setTotalCCONeedToApprove(Integer totalCCONeedToApprove) {
		this.totalCCONeedToApprove = totalCCONeedToApprove;
	}
	/**
	 * @param totalCCONeedTOApproveDl the totalCCONeedTOApproveDl to set
	 */
	public void setTotalCCONeedTOApproveDl(List<String> totalCCONeedTOApproveDl) {
		this.totalCCONeedTOApproveDl = totalCCONeedTOApproveDl;
	}
	/**
	 * @param citizenVerification the citizenVerification to set
	 */
	public void setCitizenVerification(Integer citizenVerification) {
		this.citizenVerification = citizenVerification;
	}
	/**
	 * @param citizenVerificationDL the citizenVerificationDL to set
	 */
	public void setCitizenVerificationDL(List<String> citizenVerificationDL) {
		this.citizenVerificationDL = citizenVerificationDL;
	}
	
	

}
