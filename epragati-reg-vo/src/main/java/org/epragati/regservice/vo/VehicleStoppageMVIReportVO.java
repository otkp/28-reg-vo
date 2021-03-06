package org.epragati.regservice.vo;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.epragati.images.vo.InputVO;
import org.epragati.master.vo.MasterStoppageQuationsVO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class VehicleStoppageMVIReportVO {

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate quarterStartDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate quarterEndDate;
	private int quarterNumber;
	private String userId;
	private String remarks;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate approvedDate;
	private boolean autoApproved;
	//Other state mvi details
	private String otherStateMVIname;
	private String otherStateDesignation;
	private String otherStateMviWorkingPlace;
	private String otherStateMVIRemarks;

	private List<MasterStoppageQuationsVO> stoppageQuations;
	private  List<InputVO>   imageUrls;
	
	
	public LocalDate getQuarterStartDate() {
		return quarterStartDate;
	}
	public void setQuarterStartDate(LocalDate quarterStartDate) {
		this.quarterStartDate = quarterStartDate;
	}
	public LocalDate getQuarterEndDate() {
		return quarterEndDate;
	}
	public void setQuarterEndDate(LocalDate quarterEndDate) {
		this.quarterEndDate = quarterEndDate;
	}
	public int getQuarterNumber() {
		return quarterNumber;
	}
	public void setQuarterNumber(int quarterNumber) {
		this.quarterNumber = quarterNumber;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getOtherStateMVIname() {
		return otherStateMVIname;
	}
	public void setOtherStateMVIname(String otherStateMVIname) {
		this.otherStateMVIname = otherStateMVIname;
	}
	public String getOtherStateDesignation() {
		return otherStateDesignation;
	}
	public void setOtherStateDesignation(String otherStateDesignation) {
		this.otherStateDesignation = otherStateDesignation;
	}
	public String getOtherStateMviWorkingPlace() {
		return otherStateMviWorkingPlace;
	}
	public void setOtherStateMviWorkingPlace(String otherStateMviWorkingPlace) {
		this.otherStateMviWorkingPlace = otherStateMviWorkingPlace;
	}
	public String getOtherStateMVIRemarks() {
		return otherStateMVIRemarks;
	}
	public void setOtherStateMVIRemarks(String otherStateMVIRemarks) {
		this.otherStateMVIRemarks = otherStateMVIRemarks;
	}
	public LocalDate getApprovedDate() {
		return approvedDate;
	}
	public void setApprovedDate(LocalDate approvedDate) {
		this.approvedDate = approvedDate;
	}
	public boolean isAutoApproved() {
		return autoApproved;
	}
	public void setAutoApproved(boolean autoApproved) {
		this.autoApproved = autoApproved;
	}
	public List<MasterStoppageQuationsVO> getStoppageQuations() {
		return stoppageQuations;
	}
	public void setStoppageQuations(List<MasterStoppageQuationsVO> stoppageQuations) {
		this.stoppageQuations = stoppageQuations;
	}
	public List<InputVO>  getImageUrls() {
		return imageUrls;
	}
	public void setImageUrls(List<InputVO>  imageUrls) {
		this.imageUrls = imageUrls;
	}

	
	
	
}
