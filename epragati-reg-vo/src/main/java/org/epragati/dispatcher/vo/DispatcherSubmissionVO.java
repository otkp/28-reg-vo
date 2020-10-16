package org.epragati.dispatcher.vo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import org.epragati.constants.DispatchEnum;

import com.fasterxml.jackson.annotation.JsonFormat;




public class DispatcherSubmissionVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String applicationNo;
	
	private String prNo;
	
	private String userName;
	
	private String emsNumber;



	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime postedDate;
	
	private LocalDateTime lUpdate;

	
	private String remarks;

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	private String officeCode;
	private String dispatchedBy;
	private String mobileNo;
	private String pincode;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate returnDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate deliveryDate;
	private DispatchEnum dispatch;
	private Boolean isDateEdit;

	/**
	 * @return the isDateEdit
	 */
	public Boolean getIsDateEdit() {
		return isDateEdit;
	}

	/**
	 * @param isDateEdit the isDateEdit to set
	 */
	public void setIsDateEdit(Boolean isDateEdit) {
		this.isDateEdit = isDateEdit;
	}

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fromDate;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate toDate;

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public DispatchEnum getDispatch() {
		return dispatch;
	}

	public void setDispatch(DispatchEnum dispatch) {
		this.dispatch = dispatch;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	public String getReturnReason() {
		return returnReason;
	}

	public void setReturnReason(String returnReason) {
		this.returnReason = returnReason;
	}

	private String returnReason;

	@NotNull
	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	@NotNull
	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	@NotNull
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@NotNull
	public String getEmsNumber() {
		return emsNumber;
	}

	public void setEmsNumber(String emsNumber) {
		this.emsNumber = emsNumber;
	}

	@NotNull
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public LocalDateTime getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(LocalDateTime postedDate) {
		this.postedDate = postedDate;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getDispatchedBy() {
		return dispatchedBy;
	}

	public void setDispatchedBy(String dispatchedBy) {
		this.dispatchedBy = dispatchedBy;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public LocalDateTime getlUpdate() {
		return lUpdate;
	}

	public void setlUpdate(LocalDateTime lUpdate) {
		this.lUpdate = lUpdate;
	}

	@Override
	public String toString() {
		return "DispatcherSubmissionVO [applicationNo=" + applicationNo + ", prNo=" + prNo + ", userName=" + userName
				+ ", emsNumber=" + emsNumber + ", postedDate=" + postedDate + ", lUpdate=" + lUpdate + ", remarks="
				+ remarks + ", officeCode=" + officeCode + ", dispatchedBy=" + dispatchedBy + ", mobileNo=" + mobileNo
				+ ", pincode=" + pincode + ", returnDate=" + returnDate + ", deliveryDate=" + deliveryDate
				+ ", dispatch=" + dispatch + ", isDateEdit=" + isDateEdit + ", fromDate=" + fromDate + ", toDate="
				+ toDate + ", returnReason=" + returnReason + "]";
	}

	

}
