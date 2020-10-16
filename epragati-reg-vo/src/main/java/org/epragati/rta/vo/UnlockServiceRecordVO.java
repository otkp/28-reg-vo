package org.epragati.rta.vo;

public class UnlockServiceRecordVO {
	
	private String selectedRole;
	private String actionUserId;
	private String requestIP;
	private String forUserRole;
	private String forUserId;
	private Integer serviceId;
	private String officeCode;
	private String applicationNo;
	
	/**
	 * @return the selectedRole
	 */
	public String getSelectedRole() {
		return selectedRole;
	}
	/**
	 * @param selectedRole the selectedRole to set
	 */
	public void setSelectedRole(String selectedRole) {
		this.selectedRole = selectedRole;
	}
	
	/**
	 * @return the forUserRole
	 */
	public String getForUserRole() {
		return forUserRole;
	}
	/**
	 * @param forUserRole the forUserRole to set
	 */
	public void setForUserRole(String forUserRole) {
		this.forUserRole = forUserRole;
	}
	/**
	 * @return the forUser
	 */
	public String getForUserId() {
		return forUserId;
	}
	/**
	 * @param forUser the forUser to set
	 */
	public void setForUserId(String forUserId) {
		this.forUserId = forUserId;
	}
	/**
	 * @return the serviceId
	 */
	public Integer getServiceId() {
		return serviceId;
	}
	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
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
	 * @return the actionUserId
	 */
	public String getActionUserId() {
		return actionUserId;
	}
	/**
	 * @param actionUserId the actionUserId to set
	 */
	public void setActionUserId(String actionUserId) {
		this.actionUserId = actionUserId;
	}
	/**
	 * @return the requestIP
	 */
	public String getRequestIP() {
		return requestIP;
	}
	/**
	 * @param requestIP the requestIP to set
	 */
	public void setRequestIP(String requestIP) {
		this.requestIP = requestIP;
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

}
