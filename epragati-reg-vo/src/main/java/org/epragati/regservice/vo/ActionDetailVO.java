package org.epragati.regservice.vo;

import java.util.List;

import org.epragati.service.enclosure.vo.ImageVO;
import org.epragati.util.document.KeyValue;

public class ActionDetailVO {
	private String role;
	private String userId;
	private String applicationNo;
	private String module;
	private Integer index;
	private Integer currentItegeration;
	private Boolean isDoneProcess;
	private String status;
	private String approvedDate;
	private List<KeyValue<String, List<ImageVO>>> enclosures;
	private String aadharNo;
	private String fromMvi;
	private String toMvi;
	private String from;
	private String to;
	
	public ActionDetailVO(String role, String userId, String applicationNo, String module, Integer index,
			Integer currentItegeration, Boolean isDoneProcess, String status,
			List<KeyValue<String, List<ImageVO>>> enclosures) {
		super();
		this.role = role;
		this.userId = userId;
		this.applicationNo = applicationNo;
		this.module = module;
		this.index = index;
		this.currentItegeration = currentItegeration;
		this.isDoneProcess = isDoneProcess;
		this.status = status;
		this.enclosures = enclosures;
	}


	public ActionDetailVO() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
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
	/**
	 * @return the index
	 */
	public Integer getIndex() {
		return index;
	}
	/**
	 * @param index the index to set
	 */
	public void setIndex(Integer index) {
		this.index = index;
	}
	/**
	 * @return the currentItegeration
	 */
	public Integer getCurrentItegeration() {
		return currentItegeration;
	}
	/**
	 * @param currentItegeration the currentItegeration to set
	 */
	public void setCurrentItegeration(Integer currentItegeration) {
		this.currentItegeration = currentItegeration;
	}
	/**
	 * @return the isDoneProcess
	 */
	public Boolean getIsDoneProcess() {
		return isDoneProcess;
	}
	/**
	 * @param isDoneProcess the isDoneProcess to set
	 */
	public void setIsDoneProcess(Boolean isDoneProcess) {
		this.isDoneProcess = isDoneProcess;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}


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
	 * @return the enclosures
	 */
	public List<KeyValue<String, List<ImageVO>>> getEnclosures() {
		return enclosures;
	}


	/**
	 * @param enclosures the enclosures to set
	 */
	public void setEnclosures(List<KeyValue<String, List<ImageVO>>> enclosures) {
		this.enclosures = enclosures;
	}


	public String getApprovedDate() {
		return approvedDate;
	}


	public void setApprovedDate(String approvedDate) {
		this.approvedDate = approvedDate;
	}


	public String getAadharNo() {
		return aadharNo;
	}


	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}


	public String getFromMvi() {
		return fromMvi;
	}


	public void setFromMvi(String fromMvi) {
		this.fromMvi = fromMvi;
	}


	public String getToMvi() {
		return toMvi;
	}


	public void setToMvi(String toMvi) {
		this.toMvi = toMvi;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}





	
}
