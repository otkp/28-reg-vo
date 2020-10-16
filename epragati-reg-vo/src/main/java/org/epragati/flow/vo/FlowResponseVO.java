package org.epragati.flow.vo;

import java.io.Serializable;
import java.util.List;

public class FlowResponseVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> processId;
	private Long pendingCount;
	private String userTaskId;

	/**
	 * @return the processId
	 */
	public List<String> getProcessId() {
		return processId;
	}
	/**
	 * @param processId the processId to set
	 */
	public void setProcessId(List<String> processId) {
		this.processId = processId;
	}
	/**
	 * @return the pendingCount
	 */
	public Long getPendingCount() {
		return pendingCount;
	}
	/**
	 * @param pendingCount the pendingCount to set
	 */
	public void setPendingCount(Long pendingCount) {
		this.pendingCount = pendingCount;
	} 
	
	public String getUserTaskId() {
		return userTaskId;
	}
	public void setUserTaskId(String userTaskId) {
		this.userTaskId = userTaskId;
	}
}
