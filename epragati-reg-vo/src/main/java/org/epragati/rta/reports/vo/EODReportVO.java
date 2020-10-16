package org.epragati.rta.reports.vo;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import org.epragati.common.vo.BaseVO;
import org.epragati.util.payment.ServiceEnum;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class EODReportVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String applicationNo;
	private String prNo;
	private String trNo;
	private Set<Integer> serviceIds;
	private Integer iterationCount;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate fromDate;
	private String userId;
	private String officeCode;
	private Integer approved;
	private Integer rejected;
	private Integer totalcount;
	private List<String> list;
	private String role;
	private String name;
	private String roleName;
	private String serviceName;
	private List<String> statusList;
	private List<String> roles;
	private String selectedRole;
	private Boolean serviceTotal = Boolean.FALSE;
	private String userName;
	private Integer districtId;
	private boolean eodCountExcel;
	private boolean eodDataExcel;
	private boolean eodSingleCountExcel;
	private boolean eodSingleDataExcel;
	private boolean eodDistCountExcel;
	private boolean eodDistRoleCountExcel;
	private boolean eodDistRoleListExcel;
	
	public boolean isEodDistRoleListExcel() {
		return eodDistRoleListExcel;
	}

	public void setEodDistRoleListExcel(boolean eodDistRoleListExcel) {
		this.eodDistRoleListExcel = eodDistRoleListExcel;
	}
	
	public boolean isEodDistRoleCountExcel() {
		return eodDistRoleCountExcel;
	}

	public void setEodDistRoleCountExcel(boolean eodDistRoleCountExcel) {
		this.eodDistRoleCountExcel = eodDistRoleCountExcel;
	}

	public boolean isEodDistCountExcel() {
		return eodDistCountExcel;
	}

	public void setEodDistCountExcel(boolean eodDistCountExcel) {
		this.eodDistCountExcel = eodDistCountExcel;
	}

	public boolean isEodSingleDataExcel() {
		return eodSingleDataExcel;
	}

	public void setEodSingleDataExcel(boolean eodSingleDataExcel) {
		this.eodSingleDataExcel = eodSingleDataExcel;
	}

	public boolean isEodSingleCountExcel() {
		return eodSingleCountExcel;
	}

	public void setEodSingleCountExcel(boolean eodSingleCountExcel) {
		this.eodSingleCountExcel = eodSingleCountExcel;
	}

	public boolean isEodDataExcel() {
		return eodDataExcel;
	}

	public void setEodDataExcel(boolean eodDataExcel) {
		this.eodDataExcel = eodDataExcel;
	}

	public boolean isEodCountExcel() {
		return eodCountExcel;
	}

	public void setEodCountExcel(boolean eodCountExcel) {
		this.eodCountExcel = eodCountExcel;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Boolean getServiceTotal() {
		return serviceTotal;
	}

	public void setServiceTotal(Boolean serviceTotal) {
		this.serviceTotal = serviceTotal;
	}

	public String getSelectedRole() {
		return selectedRole;
	}

	public void setSelectedRole(String selectedRole) {
		this.selectedRole = selectedRole;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getApproved() {
		return approved;
	}

	public void setApproved(Integer approved) {
		this.approved = approved;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Integer getRejected() {
		return rejected;
	}

	public void setRejected(Integer rejected) {
		this.rejected = rejected;
	}

	public Integer getTotalcount() {
		return totalcount;
	}

	public void setTotalcount(Integer totalcount) {
		this.totalcount = totalcount;
	}

	public String getUserId() {
		return userId;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate toDate;

	private String status;
	private List<ServiceEnum> serviceTypes;

	public List<ServiceEnum> getServiceTypes() {
		return serviceTypes;
	}

	public void setServiceTypes(List<ServiceEnum> serviceTypes) {
		this.serviceTypes = serviceTypes;
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

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	public Set<Integer> getServiceIds() {
		return serviceIds;
	}

	public void setServiceIds(Set<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}

	public Integer getIterationCount() {
		return iterationCount;
	}

	public void setIterationCount(Integer iterationCount) {
		this.iterationCount = iterationCount;
	}

	public List<String> getStatusList() {
		return statusList;
	}

	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

}