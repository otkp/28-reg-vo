package org.epragati.rcactions;

import org.epragati.master.vo.RegistrationDetailsVO;
import org.epragati.util.Status;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class RCActionsVO {
	
	private RegistrationDetailsVO rcDetailsVO;
	private String prNo;
	private Status.RCActionStatus actionStatus;
	private RCActionsDetailsVO suspensionDetailsVO;
	private String officeCode;
	private String selectedRole;

	public RegistrationDetailsVO getRcDetailsVO() {
		return rcDetailsVO;
	}
	public void setRcDetailsVO(RegistrationDetailsVO rcDetailsVO) {
		this.rcDetailsVO = rcDetailsVO;
	}
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	public Status.RCActionStatus getActionStatus() {
		return actionStatus;
	}
	public void setActionStatus(Status.RCActionStatus actionStatus) {
		this.actionStatus = actionStatus;
	}
	public RCActionsDetailsVO getSuspensionDetailsVO() {
		return suspensionDetailsVO;
	}
	public void setSuspensionDetailsVO(RCActionsDetailsVO suspensionDetailsVO) {
		this.suspensionDetailsVO = suspensionDetailsVO;
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
	
}
