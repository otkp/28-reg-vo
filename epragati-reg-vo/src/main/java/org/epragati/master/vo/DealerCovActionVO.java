package org.epragati.master.vo;

public class DealerCovActionVO {

	private Integer dcaId;
	private String dcId;
	private Integer action;
	private String actionBy;
	private String actionDate;
	private Integer role;
	private String remarks;

	
	
	public Integer getDcaId() {
		return dcaId;
	}

	public void setDcaId(Integer dcaId) {
		this.dcaId = dcaId;
	}

	public String getDcId() {
		return dcId;
	}

	public void setDcId(String dcId) {
		this.dcId = dcId;
	}

	public Integer getAction() {
		return action;
	}

	public void setAction(Integer action) {
		this.action = action;
	}

	public String getActionBy() {
		return actionBy;
	}

	public void setActionBy(String actionBy) {
		this.actionBy = actionBy;
	}

	public String getActionDate() {
		return actionDate;
	}

	public void setActionDate(String actionDate) {
		this.actionDate = actionDate;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
