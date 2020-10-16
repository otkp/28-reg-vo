package org.epragati.master.vo;

import java.io.Serializable;

public class OffenceCategoryVO implements  Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String offenceCategeory;
	private String status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOffenceCategeory() {
		return offenceCategeory;
	}
	public void setOffenceCategeory(String offenceCategeory) {
		this.offenceCategeory = offenceCategeory;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "OffenceCategoryVO [id=" + id + ", offenceCategeory=" + offenceCategeory + ", status=" + status + "]";
	}
	

}
