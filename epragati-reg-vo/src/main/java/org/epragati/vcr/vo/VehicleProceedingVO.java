package org.epragati.vcr.vo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class VehicleProceedingVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//@NotNull(message="From for vehicle proceeding is required")
	private FromVcrVo from;
	private ToVcrVO to;
	private String remarks;
	public FromVcrVo getFrom() {
		return from;
	}
	public void setFrom(FromVcrVo from) {
		this.from = from;
	}
	public ToVcrVO getTo() {
		return to;
	}
	public void setTo(ToVcrVO to) {
		this.to = to;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	

}
