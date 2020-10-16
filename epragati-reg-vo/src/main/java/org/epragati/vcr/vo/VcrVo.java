package org.epragati.vcr.vo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class VcrVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dateOfCheck;
	@NotNull(message = "placeOfCheck are required.")
	private String placeOfCheck;
	private String vcrNumber;
	private String place;
	private String type;
	private String districtName;
	private Integer districtId;
	private String officeCode;
	private String latitude;
	private String longitude;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate fromDate;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate toDate;
	private boolean vcrPaidDataReportsExcelList;
	private String mviName;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime paidDate;
	private List<EnforcementVcrVO> enforcementReport;
	private String classOfVehicle;
	private String role;
	private long pageNo;
	private long totalPage;

	private boolean forExcel;
	private boolean mviExcelList;
	private boolean offenceEnforcementReportExcel;
	private boolean vcrPaidDataReportsVehicleDetailsExcelList;
	private boolean vcrPaymentReportExcelList;
	private boolean vcrPaymentReportOfficeDataExcelList;
	private boolean roadSafetyExcelMviCount;
	public boolean isVcrPaidDataReportsVehicleDetailsExcelList() {
		return vcrPaidDataReportsVehicleDetailsExcelList;
	}

	public void setVcrPaidDataReportsVehicleDetailsExcelList(boolean vcrPaidDataReportsVehicleDetailsExcelList) {
		this.vcrPaidDataReportsVehicleDetailsExcelList = vcrPaidDataReportsVehicleDetailsExcelList;
	}

	private boolean roadSafetyExcelVcrCount;
    private boolean roadSafetyVcrDistrictCountExcel;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate checkedDate;
	

	public LocalDate getCheckedDate() {
		return checkedDate;
	}

	public void setCheckedDate(LocalDate checkedDate) {
		this.checkedDate = checkedDate;
	}

	public boolean isRoadSafetyVcrDistrictCountExcel() {
		return roadSafetyVcrDistrictCountExcel;
	}

	public void setRoadSafetyVcrDistrictCountExcel(boolean roadSafetyVcrDistrictCountExcel) {
		this.roadSafetyVcrDistrictCountExcel = roadSafetyVcrDistrictCountExcel;
	}

	public String getVcrStatus() {
		return vcrStatus;
	}

	public void setVcrStatus(String vcrStatus) {
		this.vcrStatus = vcrStatus;
	}

	private String vcrStatus;

	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	public List<EnforcementVcrVO> getEnforcementReport() {
		return enforcementReport;
	}

	public void setEnforcementReport(List<EnforcementVcrVO> enforcementReport) {
		this.enforcementReport = enforcementReport;
	}

	/**
	 * @return the paidDate
	 */
	public LocalDateTime getPaidDate() {
		return paidDate;
	}

	/**
	 * @param paidDate the paidDate to set
	 */
	public void setPaidDate(LocalDateTime paidDate) {
		this.paidDate = paidDate;
	}

	/**
	 * @return the fromDate
	 */
	public LocalDate getFromDate() {
		return fromDate;
	}

	/**
	 * @return the mviName
	 */
	public String getMviName() {
		return mviName;
	}

	/**
	 * @param mviName the mviName to set
	 */
	public void setMviName(String mviName) {
		this.mviName = mviName;
	}

	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * @return the toDate
	 */
	public LocalDate getToDate() {
		return toDate;
	}

	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public LocalDateTime getDateOfCheck() {
		return dateOfCheck;
	}

	public void setDateOfCheck(LocalDateTime dateOfCheck) {
		this.dateOfCheck = dateOfCheck;
	}

	public String getPlaceOfCheck() {
		return placeOfCheck;
	}

	public void setPlaceOfCheck(String placeOfCheck) {
		this.placeOfCheck = placeOfCheck;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getVcrNumber() {
		return vcrNumber;
	}

	public void setVcrNumber(String vcrNumber) {
		this.vcrNumber = vcrNumber;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the districtName
	 */
	public String getDistrictName() {
		return districtName;
	}

	/**
	 * @param districtName the districtName to set
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	/**
	 * @return the districtId
	 */
	public Integer getDistrictId() {
		return districtId;
	}

	/**
	 * @param districtId the districtId to set
	 */
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public long getPageNo() {
		return pageNo;
	}

	public void setPageNo(long pageNo) {
		this.pageNo = pageNo;
	}

	public long getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}

	public boolean isForExcel() {
		return forExcel;
	}

	public void setForExcel(boolean forExcel) {
		this.forExcel = forExcel;
	}

	public boolean isMviExcelList() {
		return mviExcelList;
	}

	public void setMviExcelList(boolean mviExcelList) {
		this.mviExcelList = mviExcelList;
	}

	public boolean isOffenceEnforcementReportExcel() {
		return offenceEnforcementReportExcel;
	}

	public void setOffenceEnforcementReportExcel(boolean offenceEnforcementReportExcel) {
		this.offenceEnforcementReportExcel = offenceEnforcementReportExcel;
	}

	public boolean isVcrPaymentReportExcelList() {
		return vcrPaymentReportExcelList;
	}

	public void setVcrPaymentReportExcelList(boolean vcrPaymentReportExcelList) {
		this.vcrPaymentReportExcelList = vcrPaymentReportExcelList;
	}

	public boolean isVcrPaymentReportOfficeDataExcelList() {
		return vcrPaymentReportOfficeDataExcelList;
	}

	public void setVcrPaymentReportOfficeDataExcelList(boolean vcrPaymentReportOfficeDataExcelList) {
		this.vcrPaymentReportOfficeDataExcelList = vcrPaymentReportOfficeDataExcelList;
	}

	public boolean isRoadSafetyExcelMviCount() {
		return roadSafetyExcelMviCount;
	}

	public void setRoadSafetyExcelMviCount(boolean roadSafetyExcelMviCount) {
		this.roadSafetyExcelMviCount = roadSafetyExcelMviCount;
	}

	public boolean isRoadSafetyExcelVcrCount() {
		return roadSafetyExcelVcrCount;
	}

	public void setRoadSafetyExcelVcrCount(boolean roadSafetyExcelVcrCount) {
		this.roadSafetyExcelVcrCount = roadSafetyExcelVcrCount;
	}

	public boolean isVcrPaidDataReportsExcelList() {
		return vcrPaidDataReportsExcelList;
	}

	public void setVcrPaidDataReportsExcelList(boolean vcrPaidDataReportsExcelList) {
		this.vcrPaidDataReportsExcelList = vcrPaidDataReportsExcelList;
	}
	
}