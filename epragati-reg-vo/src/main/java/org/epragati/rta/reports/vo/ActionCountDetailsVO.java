package org.epragati.rta.reports.vo;

import java.util.List;

import org.epragati.regservice.vo.RegServiceVO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ActionCountDetailsVO {
	
	private String userID;
	private String userName;
	private String role;
	private Long approvedCount;
	private Long rejectedCount;
	private Long totalCount;
	private String serviceType;
	private String serviceDesc;
	private List<RegServiceReportVO> regSerList; 
	
	private RegServiceVO regSerVO;
	
     private String officeName;
	
	private String officeCode;
	
	private List<ActionCountDetailsVO> rolesBasedReport;
	
	
	
	public List<ActionCountDetailsVO> getRolesBasedReport() {
		return rolesBasedReport;
	}

	public void setRolesBasedReport(List<ActionCountDetailsVO> rolesBasedReport) {
		this.rolesBasedReport = rolesBasedReport;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	private List<RoleBasedCounts> usersBasedCounts;
	
	public List<RoleBasedCounts> getUsersBasedCounts() {
		return usersBasedCounts;
	}
	public void setUsersBasedCounts(List<RoleBasedCounts> usersBasedCounts) {
		this.usersBasedCounts = usersBasedCounts;
	}
	public RegServiceVO getRegSerVO() {
		return regSerVO;
	}
	public void setRegSerVO(RegServiceVO regSerVO) {
		this.regSerVO = regSerVO;
	}
	public String getServiceDesc() {
		return serviceDesc;
	}
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Long getApprovedCount() {
		return approvedCount;
	}
	public void setApprovedCount(Long approvedCount) {
		this.approvedCount = approvedCount;
	}
	public Long getRejectedCount() {
		return rejectedCount;
	}
	public void setRejectedCount(Long rejectedCount) {
		this.rejectedCount = rejectedCount;
	}
	public Long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	/**
	 * @return the regSerList
	 */
	public List<RegServiceReportVO> getRegSerList() {
		return regSerList;
	}
	/**
	 * @param regSerList the regSerList to set
	 */
	public void setRegSerList(List<RegServiceReportVO> regSerList) {
		this.regSerList = regSerList;
	}
    
}