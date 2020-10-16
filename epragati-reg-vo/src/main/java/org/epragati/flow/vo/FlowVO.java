package org.epragati.flow.vo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.epragati.master.vo.RoleActionVO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author pbattula
 *
 */
@JsonInclude(Include.NON_NULL)
public class FlowVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String processId;
	private String type;
	private String userName;
	private String password;
	private String flowName;
	private String action;
	private String userTaskId;
	private Map<String, Object> actionDetails = new HashMap<String, Object>();
	private String flowId;
	private boolean status;
	private Map<Integer, List<RoleActionVO>> flowDetails;

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @return the flowName
	 */
	public String getFlowName() {
		return flowName;
	}

	/**
	 * @param flowName the flowName to set
	 */
	public void setFlowName(String flowName) {
		this.flowName = flowName;
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
	 * @return the actionDetails
	 */
	public Map<String, Object> getActionDetails() {
		return actionDetails;
	}

	/**
	 * @param actionDetails the actionDetails to set
	 */
	public void setActionDetails(Map<String, Object> actionDetails) {
		this.actionDetails = actionDetails;
	}

	/**
	 * @return the processId
	 */
	public String getProcessId() {
		return processId;
	}

	/**
	 * @param processId
	 *            the processId to set
	 */
	public void setProcessId(String processId) {
		this.processId = processId;
	}
	
	public String getUserTaskId() {
		return userTaskId;
	}

	public void setUserTaskId(String userTaskId) {
		this.userTaskId = userTaskId;
	}

	/**
	 * @return the flowId
	 */
	public String getFlowId() {
		return flowId;
	}

	/**
	 * @param flowId the flowId to set
	 */
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the flowDetails
	 */
	public Map<Integer, List<RoleActionVO>> getFlowDetails() {
		return flowDetails;
	}

	/**
	 * @param flowDetails the flowDetails to set
	 */
	public void setFlowDetails(Map<Integer, List<RoleActionVO>> flowDetails) {
		this.flowDetails = flowDetails;
	}
}
