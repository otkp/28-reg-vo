package org.epragati.regservice.vo;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import org.epragati.flow.vo.FlowVO;
import org.epragati.master.vo.ActionDetailsVO;
import org.epragati.master.vo.DistrictVO;
import org.epragati.master.vo.StagingRegistrationDetailsVO;
import org.epragati.util.payment.ServiceEnum;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StagingRegServiceAutoApprovalsVO {
private StagingRegistrationDetailsVO stagingReg;
	
	private DistrictVO district;
	
	private String officeCode;
	
	private String trNo;
	
	private Integer districtId;
	
	private String districtName;
	
	private Set<String> roleType;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate autoApprovalsDate;
	
	private String applicationNo;
	
	private RegServiceVO regService;
	
	private String prNo;
	
	private List<ServiceEnum> serviceName;
	private Set<String> serviceNameDesc;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate createdDate;
	private String applicationStatus;
	private List<FlowVO> flowDetailsLog;
	private List<ActionDetailsVO> actionDetails;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate autoApprovalInitiatedDate;
	/**
	 * @return the stagingReg
	 */
	public StagingRegistrationDetailsVO getStagingReg() {
		return stagingReg;
	}

	/**
	 * @param stagingReg the stagingReg to set
	 */
	public void setStagingReg(StagingRegistrationDetailsVO stagingReg) {
		this.stagingReg = stagingReg;
	}

	/**
	 * @return the district
	 */
	public DistrictVO getDistrict() {
		return district;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(DistrictVO district) {
		this.district = district;
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
	 * @return the trNo
	 */
	public String getTrNo() {
		return trNo;
	}

	/**
	 * @param trNo the trNo to set
	 */
	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	/**
	 * @return the districtId
	 */
	public Integer getDistrictId() {
		return districtId;
	}

	/**
	 * @param districtId the districtId to set
	 */
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	/**
	 * @return the districtName
	 */
	public String getDistrictName() {
		return districtName;
	}

	/**
	 * @param districtName the districtName to set
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	/**
	 * @return the roleType
	 */
	public Set<String> getRoleType() {
		return roleType;
	}

	/**
	 * @param roleType the roleType to set
	 */
	public void setRoleType(Set<String> roleType) {
		this.roleType = roleType;
	}

	/**
	 * @return the autoApprovalsDate
	 */
	public LocalDate getAutoApprovalsDate() {
		return autoApprovalsDate;
	}

	/**
	 * @param autoApprovalsDate the autoApprovalsDate to set
	 */
	public void setAutoApprovalsDate(LocalDate autoApprovalsDate) {
		this.autoApprovalsDate = autoApprovalsDate;
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
	 * @return the regService
	 */
	public RegServiceVO getRegService() {
		return regService;
	}

	/**
	 * @param regService the regService to set
	 */
	public void setRegService(RegServiceVO regService) {
		this.regService = regService;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the serviceName
	 */
	public List<ServiceEnum> getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName the serviceName to set
	 */
	public void setServiceName(List<ServiceEnum> serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * @return the createdDate
	 */
	public LocalDate getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public Set<String> getServiceNameDesc() {
		return serviceNameDesc;
	}

	public void setServiceNameDesc(Set<String> serviceNameDesc) {
		this.serviceNameDesc = serviceNameDesc;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public List<FlowVO> getFlowDetailsLog() {
		return flowDetailsLog;
	}

	public void setFlowDetailsLog(List<FlowVO> flowDetailsLog) {
		this.flowDetailsLog = flowDetailsLog;
	}

	public List<ActionDetailsVO> getActionDetails() {
		return actionDetails;
	}

	public void setActionDetails(List<ActionDetailsVO> actionDetails) {
		this.actionDetails = actionDetails;
	}

	public LocalDate getAutoApprovalInitiatedDate() {
		return autoApprovalInitiatedDate;
	}

	public void setAutoApprovalInitiatedDate(LocalDate autoApprovalInitiatedDate) {
		this.autoApprovalInitiatedDate = autoApprovalInitiatedDate;
	}
}
