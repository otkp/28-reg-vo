package org.epragati.rta.reports.vo;

import java.time.LocalDate;
import java.util.List;

import org.epragati.util.payment.ServiceEnum;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author manikanta guptha
 *
 */

public class CitizenEnclosuresVO {

	private String prNo;
	private String applicationNo;
	private String chassisNo;
	private String cov;
	private List<ServiceEnum> serviceType;
	private String enclosure;
	private String enclosureName;
	private String enclosureUrl;
	private String applStatus;
	private String ccouserId;
	private String mviUserId;
	private String aoUserId;
	private String rtouserId;
	private String engineNo;
	private String applicantName;
	private String trNo;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate ccoApprovedDate;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate mviApprovedDate;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate aoApprovedDate;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate rtoApprovedDate;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate appliedDate;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate approvedDate;

	public LocalDate getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(LocalDate approvedDate) {
		this.approvedDate = approvedDate;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	public String getCov() {
		return cov;
	}

	public void setCov(String cov) {
		this.cov = cov;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getCcouserId() {
		return ccouserId;
	}

	public void setCcouserId(String ccouserId) {
		this.ccouserId = ccouserId;
	}

	public String getMviUserId() {
		return mviUserId;
	}

	public void setMviUserId(String mviUserId) {
		this.mviUserId = mviUserId;
	}

	public String getAoUserId() {
		return aoUserId;
	}

	public void setAoUserId(String aoUserId) {
		this.aoUserId = aoUserId;
	}

	public String getRtouserId() {
		return rtouserId;
	}

	public void setRtouserId(String rtouserId) {
		this.rtouserId = rtouserId;
	}

	public LocalDate getCcoApprovedDate() {
		return ccoApprovedDate;
	}

	public void setCcoApprovedDate(LocalDate ccoApprovedDate) {
		this.ccoApprovedDate = ccoApprovedDate;
	}

	public LocalDate getMviApprovedDate() {
		return mviApprovedDate;
	}

	public void setMviApprovedDate(LocalDate mviApprovedDate) {
		this.mviApprovedDate = mviApprovedDate;
	}

	public LocalDate getAoApprovedDate() {
		return aoApprovedDate;
	}

	public void setAoApprovedDate(LocalDate aoApprovedDate) {
		this.aoApprovedDate = aoApprovedDate;
	}

	public LocalDate getRtoApprovedDate() {
		return rtoApprovedDate;
	}

	public void setRtoApprovedDate(LocalDate rtoApprovedDate) {
		this.rtoApprovedDate = rtoApprovedDate;
	}

	public LocalDate getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(LocalDate appliedDate) {
		this.appliedDate = appliedDate;
	}

	public String getApplStatus() {
		return applStatus;
	}

	public void setApplStatus(String applStatus) {
		this.applStatus = applStatus;
	}

	public String getEnclosureUrl() {
		return enclosureUrl;
	}

	public void setEnclosureUrl(String enclosureUrl) {
		this.enclosureUrl = enclosureUrl;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public List<ServiceEnum> getServiceType() {
		return serviceType;
	}

	public void setServiceType(List<ServiceEnum> serviceType) {
		this.serviceType = serviceType;
	}

	public String getEnclosure() {
		return enclosure;
	}

	public void setEnclosure(String enclosure) {
		this.enclosure = enclosure;
	}

	public String getEnclosureName() {
		return enclosureName;
	}

	public void setEnclosureName(String enclosureName) {
		this.enclosureName = enclosureName;
	}
}
