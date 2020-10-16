package org.epragati.tracking.vo;

import java.time.LocalDate;

import org.epragati.common.vo.BaseVO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Trackingvo extends BaseVO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8617626333323709860L;
	private String financierStatus;
	private String status;
	
	private String dispatchedStatus;
	private String emsNo;
	@JsonFormat(pattern = "dd-MM-yyyy ")
	private LocalDate postedDate;
	public String departmentStatus;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate printedDate;
	private String remarks;
	private String returnRemarks;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate returnedDate;
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getReturnedDate() {
		return returnedDate;
	}
	public void setReturnedDate(LocalDate returnedDate) {
		this.returnedDate = returnedDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getReturnRemarks() {
		return returnRemarks;
	}
	public void setReturnRemarks(String returnRemarks) {
		this.returnRemarks = returnRemarks;
	}
	public LocalDate getPrintedDate() {
		return printedDate;
	}
	public void setPrintedDate(LocalDate printedDate) {
		this.printedDate = printedDate;
	}
	public String getFinancierStatus() {
		return financierStatus;
	}
	public void setFinancierStatus(String financierStatus) {
		this.financierStatus = financierStatus;
	}
	public String getDepartmentStatus() {
		return departmentStatus;
	}
	public void setDepartmentStatus(String departmentStatus) {
		this.departmentStatus = departmentStatus;
	}
	public String getDispatchedStatus() {
		return dispatchedStatus;
	}
	public void setDispatchedStatus(String dispatchedStatus) {
		this.dispatchedStatus = dispatchedStatus;
	}
	public String getEmsNo() {
		return emsNo;
	}
	public void setEmsNo(String emsNo) {
		this.emsNo = emsNo;
	}
	public LocalDate getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(LocalDate localDate) {
		this.postedDate = localDate;
	}
	
	
	
}
