package org.epragati.master.vo;

import java.time.LocalDateTime;


public class StatusVO {

	private Integer sId;
	private String description;
	private Integer status;
	private LocalDateTime createdDate;
	private LocalDateTime lUpdate;
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public String getDescription() {
		return description;
	}
	public LocalDateTime getlUpdate() {
		return lUpdate;
	}
	public Integer getsId() {
		return sId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setlUpdate(LocalDateTime lUpdate) {
		this.lUpdate = lUpdate;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}





}
