package org.epragati.master.vo;

import java.time.LocalDateTime;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class RoleActionVO {
	
	private String role;
	private String action;
	private LocalDateTime actionTime;
	private String applicatioNo;
	private String module;
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}
	/**
	 * @param action the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}
	/**
	 * @return the actionTime
	 */
	public LocalDateTime getActionTime() {
		return actionTime;
	}
	/**
	 * @param actionTime the actionTime to set
	 */
	public void setActionTime(LocalDateTime actionTime) {
		this.actionTime = actionTime;
	}
	/**
	 * @return the applicatioNo
	 */
	public String getApplicatioNo() {
		return applicatioNo;
	}
	/**
	 * @param applicatioNo the applicatioNo to set
	 */
	public void setApplicatioNo(String applicatioNo) {
		this.applicatioNo = applicatioNo;
	}
	/**
	 * @return the module
	 */
	public String getModule() {
		return module;
	}
	/**
	 * @param module the module to set
	 */
	public void setModule(String module) {
		this.module = module;
	}
}
