package org.epragati.regservice.vo;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.epragati.images.vo.InputVO;
import org.epragati.master.vo.ApplicantAddressVO;
import org.epragati.master.vo.MasterStoppageQuationsVO;
import org.epragati.master.vo.MasterStoppageRevocationQuationsVO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class VehicleStoppageDetailsVO {

	private String prNo;
	private String applicationNo;
	private ApplicantAddressVO vehicleAddressDetails;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate stoppageDate;
	private String reasonForStoppage;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate stoppageRevpkationDate;
	private List<MasterStoppageQuationsVO> stoppageQuations;
	private List<MasterStoppageRevocationQuationsVO>  stoppageRevocationQuations;	
	
	private Map<String , Map> stoppageMapQuations;
	private List<ActionDetailVO> actions;
	private List<VehicleStoppageMVIReportVO> mviReport;
	private String officeCode;//vehicle office code
	private String userId;//current MVI user id
	private String rtoUserId;//rto user id
	private String dtcUserId;//rto user id
	private Boolean otherState;
	private String mviOfficeCode;//MVI office code
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate aoOrRtostoppageDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate aoOrRtostoppageRevpkationDate;
	private List<VehicleStoppageMVIReportVO> pendingReports;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate inspectionUpto;
	private Long daysLeftForAutoApprove;
	private long taxExemMonths;
	private boolean pendingcurrentQuarter;
	private String mviNumber;
	private String dtcNumber;
	private String rejectionComments;
	private boolean qrCodeRequired;
	private List<InputVO>  currentQuarterImageUrls;
	private String stoppageApplicationNo;
	
	public Long getDaysLeftForAutoApprove() {
		return daysLeftForAutoApprove;
	}
	public void setDaysLeftForAutoApprove(Long daysLeftForAutoApprove) {
		this.daysLeftForAutoApprove = daysLeftForAutoApprove;
	}
	/**
	 * @return the vehicleAddressDetails
	 */
	public ApplicantAddressVO getVehicleAddressDetails() {
		return vehicleAddressDetails;
	}
	/**
	 * @param vehicleAddressDetails the vehicleAddressDetails to set
	 */
	public void setVehicleAddressDetails(ApplicantAddressVO vehicleAddressDetails) {
		this.vehicleAddressDetails = vehicleAddressDetails;
	}
	/**
	 * @return the stoppageDate
	 */
	public LocalDate getStoppageDate() {
		return stoppageDate;
	}
	/**
	 * @param stoppageDate the stoppageDate to set
	 */
	public void setStoppageDate(LocalDate stoppageDate) {
		this.stoppageDate = stoppageDate;
	}
	/**
	 * @return the reasonForStoppage
	 */
	public String getReasonForStoppage() {
		return reasonForStoppage;
	}
	/**
	 * @param reasonForStoppage the reasonForStoppage to set
	 */
	public void setReasonForStoppage(String reasonForStoppage) {
		this.reasonForStoppage = reasonForStoppage;
	}
	/**
	 * @return the stoppageRevpkationDate
	 */
	public LocalDate getStoppageRevpkationDate() {
		return stoppageRevpkationDate;
	}
	/**
	 * @param stoppageRevpkationDate the stoppageRevpkationDate to set
	 */
	public void setStoppageRevpkationDate(LocalDate stoppageRevpkationDate) {
		this.stoppageRevpkationDate = stoppageRevpkationDate;
	}
	/**
	 * @return the stoppageQuations
	 */
	public List<MasterStoppageQuationsVO> getStoppageQuations() {
		return stoppageQuations;
	}
	/**
	 * @param stoppageQuations the stoppageQuations to set
	 */
	public void setStoppageQuations(List<MasterStoppageQuationsVO> stoppageQuations) {
		this.stoppageQuations = stoppageQuations;
	}
	/**
	 * @return the stoppageRevocationQuations
	 */
	public List<MasterStoppageRevocationQuationsVO> getStoppageRevocationQuations() {
		return stoppageRevocationQuations;
	}
	/**
	 * @param stoppageRevocationQuations the stoppageRevocationQuations to set
	 */
	public void setStoppageRevocationQuations(List<MasterStoppageRevocationQuationsVO> stoppageRevocationQuations) {
		this.stoppageRevocationQuations = stoppageRevocationQuations;
	}
	
	/**
	 * @return the stoppageMapQuations
	 */
	public Map<String, Map> getStoppageMapQuations() {
		return stoppageMapQuations;
	}
	/**
	 * @param stoppageMapQuations the stoppageMapQuations to set
	 */
	public void setStoppageMapQuations(Map<String, Map> stoppageMapQuations) {
		this.stoppageMapQuations = stoppageMapQuations;
	}
	public List<ActionDetailVO> getActions() {
		return actions;
	}
	public void setActions(List<ActionDetailVO> actions) {
		this.actions = actions;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRtoUserId() {
		return rtoUserId;
	}
	public void setRtoUserId(String rtoUserId) {
		this.rtoUserId = rtoUserId;
	}
	public Boolean getOtherState() {
		return otherState;
	}
	public void setOtherState(Boolean otherState) {
		this.otherState = otherState;
	}
	public List<VehicleStoppageMVIReportVO> getMviReport() {
		return mviReport;
	}
	public void setMviReport(List<VehicleStoppageMVIReportVO> mviReport) {
		this.mviReport = mviReport;
	}
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getDtcUserId() {
		return dtcUserId;
	}
	public void setDtcUserId(String dtcUserId) {
		this.dtcUserId = dtcUserId;
	}
	public String getMviOfficeCode() {
		return mviOfficeCode;
	}
	public void setMviOfficeCode(String mviOfficeCode) {
		this.mviOfficeCode = mviOfficeCode;
	}
	public LocalDate getAoOrRtostoppageDate() {
		return aoOrRtostoppageDate;
	}
	public void setAoOrRtostoppageDate(LocalDate aoOrRtostoppageDate) {
		this.aoOrRtostoppageDate = aoOrRtostoppageDate;
	}
	public LocalDate getAoOrRtostoppageRevpkationDate() {
		return aoOrRtostoppageRevpkationDate;
	}
	public void setAoOrRtostoppageRevpkationDate(LocalDate aoOrRtostoppageRevpkationDate) {
		this.aoOrRtostoppageRevpkationDate = aoOrRtostoppageRevpkationDate;
	}
	public List<VehicleStoppageMVIReportVO> getPendingReports() {
		return pendingReports;
	}
	public void setPendingReports(List<VehicleStoppageMVIReportVO> pendingReports) {
		this.pendingReports = pendingReports;
	}
	public LocalDate getInspectionUpto() {
		return inspectionUpto;
	}
	public void setInspectionUpto(LocalDate inspectionUpto) {
		this.inspectionUpto = inspectionUpto;
	}
	public long getTaxExemMonths() {
		return taxExemMonths;
	}
	public void setTaxExemMonths(long taxExemMonths) {
		this.taxExemMonths = taxExemMonths;
	}
	public boolean isPendingcurrentQuarter() {
		return pendingcurrentQuarter;
	}
	public void setPendingcurrentQuarter(boolean pendingcurrentQuarter) {
		this.pendingcurrentQuarter = pendingcurrentQuarter;
	}
	public String getMviNumber() {
		return mviNumber;
	}
	public void setMviNumber(String mviNumber) {
		this.mviNumber = mviNumber;
	}
	public String getDtcNumber() {
		return dtcNumber;
	}
	public void setDtcNumber(String dtcNumber) {
		this.dtcNumber = dtcNumber;
	}
	public String getRejectionComments() {
		return rejectionComments;
	}
	public void setRejectionComments(String rejectionComments) {
		this.rejectionComments = rejectionComments;
	}
	public boolean isQrCodeRequired() {
		return qrCodeRequired;
	}
	public void setQrCodeRequired(boolean qrCodeRequired) {
		this.qrCodeRequired = qrCodeRequired;
	}
	public List<InputVO> getCurrentQuarterImageUrls() {
		return currentQuarterImageUrls;
	}
	public void setCurrentQuarterImageUrls(List<InputVO> currentQuarterImageUrls) {
		this.currentQuarterImageUrls = currentQuarterImageUrls;
	}
	public String getStoppageApplicationNo() {
		return stoppageApplicationNo;
	}
	public void setStoppageApplicationNo(String stoppageApplicationNo) {
		this.stoppageApplicationNo = stoppageApplicationNo;
	}
	
	 
	
}
