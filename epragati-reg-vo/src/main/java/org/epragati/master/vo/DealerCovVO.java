package org.epragati.master.vo;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
public class DealerCovVO {

	private Integer dcId;
	private Integer rId;
	
	private Boolean status;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.mm")
	private LocalDateTime createdDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.mm")
	private LocalDateTime lUpdate;
	private String refNo;
	private String covId;
	

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public Integer getDcId() {
		return dcId;
	}

	public LocalDateTime getlUpdate() {
		return lUpdate;
	}

	public String getRefNo() {
 		return refNo;
	}

	public Integer getrId() {
		return rId;
	}

	public Boolean getStatus() {
		return status;
	}

	

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public void setDcId(Integer dcId) {
		this.dcId = dcId;
	}

	public void setlUpdate(LocalDateTime lUpdate) {
		this.lUpdate = lUpdate;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public void setrId(Integer rId) {
		this.rId = rId;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getCovId() {
		return covId;
	}

	public void setCovId(String covId) {
		this.covId = covId;
	}

}
