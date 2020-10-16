package org.epragati.flow.vo;

import java.io.Serializable;

public class FlowTaskDetailsVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String taskId;
	private String taskDefKey;
	private String taskName;
	private String processDefId;
	private String processName;
	private String processInstanceId;
	private Long startDate;
	private Long endDate;
	
	public FlowTaskDetailsVO(String taskId, String taskDefKey, String taskName) {
		this.taskId = taskId;
		this.taskDefKey = taskDefKey;
		this.taskName = taskName;
	}

	public FlowTaskDetailsVO(String taskId, String taskDefKey, String taskName, String processDefId, String processName,
			String processInstanceId) {
		this.taskId = taskId;
		this.taskDefKey = taskDefKey;
		this.taskName = taskName;
		this.processDefId = processDefId;
		this.processName = processName;
		this.processInstanceId = processInstanceId;
	}
	
	/**
	 * @return the taskId
	 */
	public String getTaskId() {
		return taskId;
	}
	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	/**
	 * @return the taskDefKey
	 */
	public String getTaskDefKey() {
		return taskDefKey;
	}
	/**
	 * @param taskDefKey the taskDefKey to set
	 */
	public void setTaskDefKey(String taskDefKey) {
		this.taskDefKey = taskDefKey;
	}
	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}
	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	/**
	 * @return the processDefId
	 */
	public String getProcessDefId() {
		return processDefId;
	}
	/**
	 * @param processDefId the processDefId to set
	 */
	public void setProcessDefId(String processDefId) {
		this.processDefId = processDefId;
	}
	/**
	 * @return the processName
	 */
	public String getProcessName() {
		return processName;
	}
	/**
	 * @param processName the processName to set
	 */
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	/**
	 * @return the processInstanceId
	 */
	public String getProcessInstanceId() {
		return processInstanceId;
	}
	/**
	 * @param processInstanceId the processInstanceId to set
	 */
	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}
	/**
	 * @return the startDate
	 */
	public Long getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Long startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the endDate
	 */
	public Long getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Long endDate) {
		this.endDate = endDate;
	}

}
