package org.epragati.master.vo;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BloodGroupVO {

	private String id;

	private String slNo;

	private String bloodGrpName;
	
	private Boolean active;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.mm") private LocalDateTime createdOn;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSlNo() {
		return slNo;
	}

	public void setSlNo(String slNo) {
		this.slNo = slNo;
	}

	public String getBloodGrpName() {
		return bloodGrpName;
	}

	public void setBloodGrpName(String bloodGrpName) {
		this.bloodGrpName = bloodGrpName;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}