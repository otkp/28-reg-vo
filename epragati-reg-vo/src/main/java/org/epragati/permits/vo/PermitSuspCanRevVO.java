package org.epragati.permits.vo;

import java.util.List;

import org.epragati.master.vo.RegistrationDetailsVO;
import org.epragati.util.Status;


public class PermitSuspCanRevVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4686188706667082966L;
	
	private String prNo;
	private RegistrationDetailsVO rcDetailsVO;
	private Status.permitSuspCanRevStatus actionStatus;
	private PermitActionVO permitActionVO;
	private List<PermitDetailsVO> permitDetailsVO; 
	private List<String> permitNums;
	private List<String> appliedCov;
	private String officeCode;
	private String selectedRole;
	
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	public RegistrationDetailsVO getRcDetailsVO() {
		return rcDetailsVO;
	}
	public void setRcDetailsVO(RegistrationDetailsVO rcDetailsVO) {
		this.rcDetailsVO = rcDetailsVO;
	}
	public Status.permitSuspCanRevStatus getActionStatus() {
		return actionStatus;
	}
	public void setActionStatus(Status.permitSuspCanRevStatus actionStatus) {
		this.actionStatus = actionStatus;
	}
	public PermitActionVO getPermitActionVO() {
		return permitActionVO;
	}
	public void setPermitActionVO(PermitActionVO permitActionVO) {
		this.permitActionVO = permitActionVO;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public String getSelectedRole() {
		return selectedRole;
	}
	public void setSelectedRole(String selectedRole) {
		this.selectedRole = selectedRole;
	}
	
	public List<PermitDetailsVO> getPermitDetailsVO() {
		return permitDetailsVO;
	}
	public void setPermitDetailsVO(List<PermitDetailsVO> permitDetailsVO) {
		this.permitDetailsVO = permitDetailsVO;
	}
	public List<String> getPermitNums() {
		return permitNums;
	}
	public void setPermitNums(List<String> permitNums) {
		this.permitNums = permitNums;
	}
	public List<String> getAppliedCov() {
		return appliedCov;
	}
	public void setAppliedCov(List<String> appliedCov) {
		this.appliedCov = appliedCov;
	}
		
}
