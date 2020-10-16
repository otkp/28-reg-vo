package org.epragati.rta.reports.vo;

import java.time.LocalDate;
import java.util.List;

public class VehicleStrengthVO {

	private String officeName;

	private List<ReportVO> covReport;

	private String officeCode;

	private String mandalName;

	private Integer mandalId;

	private String villageName;

    private List<String> vehicleTypes;
	
	private Integer districtId;
	
	private List<String> officeNames;
	
	private LocalDate toDate;
	
	private Integer urlNumber;
	
	
	public List<String> getVehicleTypes() {
		return vehicleTypes;
	}

	public void setVehicleTypes(List<String> vehicleTypes) {
		this.vehicleTypes = vehicleTypes;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public List<String> getOfficeNames() {
		return officeNames;
	}

	public void setOfficeNames(List<String> officeNames) {
		this.officeNames = officeNames;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public Integer getUrlNumber() {
		return urlNumber;
	}

	public void setUrlNumber(Integer urlNumber) {
		this.urlNumber = urlNumber;
	}

	/**
	 * @return the officeName
	 */
	public String getOfficeName() {
		return officeName;
	}

	/**
	 * @param officeName
	 *            the officeName to set
	 */
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	/**
	 * @return the covReport
	 */
	public List<ReportVO> getCovReport() {
		return covReport;
	}

	/**
	 * @param covReport
	 *            the covReport to set
	 */
	public void setCovReport(List<ReportVO> covReport) {
		this.covReport = covReport;
	}

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode
	 *            the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	/**
	 * @return the mandalName
	 */
	public String getMandalName() {
		return mandalName;
	}

	/**
	 * @param mandalName
	 *            the mandalName to set
	 */
	public void setMandalName(String mandalName) {
		this.mandalName = mandalName;
	}

	/**
	 * @return the mandalId
	 */
	public Integer getMandalId() {
		return mandalId;
	}

	/**
	 * @param mandalId
	 *            the mandalId to set
	 */
	public void setMandalId(Integer mandalId) {
		this.mandalId = mandalId;
	}

	/**
	 * @return the villageName
	 */
	public String getVillageName() {
		return villageName;
	}

	/**
	 * @param villageName
	 *            the villageName to set
	 */
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

}
