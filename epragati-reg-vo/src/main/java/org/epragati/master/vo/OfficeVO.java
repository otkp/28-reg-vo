package org.epragati.master.vo;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author sairam.cheruku
 *
 */
@JsonInclude(Include.NON_NULL)
public class OfficeVO {

	private Integer officeId;

	private String officeCode;

	private String officeName;

	private String officeAddress1;

	private String officeAddress2;

	private String officeCity;

	private Integer officeVillage;

	private String  officeMandal;

	private Integer officeDist;

	private String officeType;

	private String office;

	private String officeDdo;

	private String officeGeocode;

	private String longitude;

	private String latitude;

	private Integer status;

	//private LocalDateTime createdDate;
	private String reportingoffice;
	private LocalDateTime lupdate;
	private String hsrpOffice;
	
	private String officeNumberSeries;
	private String policeNumberSeries;
    private Integer district;
	

	public Integer getDistrict() {
	return district;
}

public void setDistrict(Integer district) {
	this.district = district;
}

	/**
	 * @return the policeNumberSeries
	 */
	public String getPoliceNumberSeries() {
		return policeNumberSeries;
	}

	/**
	 * @param policeNumberSeries the policeNumberSeries to set
	 */
	public void setPoliceNumberSeries(String policeNumberSeries) {
		this.policeNumberSeries = policeNumberSeries;
	}

	/**
	 * @return the officeId
	 */
	public Integer getOfficeId() {
		return officeId;
	}

	/**
	 * @param officeId the officeId to set
	 */
	public void setOfficeId(Integer officeId) {
		this.officeId = officeId;
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

	/**
	 * @return the officeName
	 */
	public String getOfficeName() {
		return officeName;
	}

	/**
	 * @param officeName the officeName to set
	 */
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	/**
	 * @return the officeAddress1
	 */
	public String getOfficeAddress1() {
		return officeAddress1;
	}

	/**
	 * @param officeAddress1 the officeAddress1 to set
	 */
	public void setOfficeAddress1(String officeAddress1) {
		this.officeAddress1 = officeAddress1;
	}

	/**
	 * @return the officeAddress2
	 */
	public String getOfficeAddress2() {
		return officeAddress2;
	}

	/**
	 * @param officeAddress2 the officeAddress2 to set
	 */
	public void setOfficeAddress2(String officeAddress2) {
		this.officeAddress2 = officeAddress2;
	}

	/**
	 * @return the officeCity
	 */
	public String getOfficeCity() {
		return officeCity;
	}

	/**
	 * @param officeCity the officeCity to set
	 */
	public void setOfficeCity(String officeCity) {
		this.officeCity = officeCity;
	}

	/**
	 * @return the officeVillage
	 */
	public Integer getOfficeVillage() {
		return officeVillage;
	}

	/**
	 * @param officeVillage the officeVillage to set
	 */
	public void setOfficeVillage(Integer officeVillage) {
		this.officeVillage = officeVillage;
	}

	/**
	 * @return the officeMandal
	 */
	public String getOfficeMandal() {
		return officeMandal;
	}

	/**
	 * @param officeMandal the officeMandal to set
	 */
	public void setOfficeMandal(String officeMandal) {
		this.officeMandal = officeMandal;
	}

	/**
	 * @return the officeDist
	 */
	public Integer getOfficeDist() {
		return officeDist;
	}

	/**
	 * @param officeDist the officeDist to set
	 */
	public void setOfficeDist(Integer officeDist) {
		this.officeDist = officeDist;
	}

	/**
	 * @return the officeType
	 */
	public String getOfficeType() {
		return officeType;
	}

	/**
	 * @param officeType the officeType to set
	 */
	public void setOfficeType(String officeType) {
		this.officeType = officeType;
	}

	/**
	 * @return the office
	 */
	public String getOffice() {
		return office;
	}

	/**
	 * @param office the office to set
	 */
	public void setOffice(String office) {
		this.office = office;
	}

	/**
	 * @return the officeDdo
	 */
	public String getOfficeDdo() {
		return officeDdo;
	}

	/**
	 * @param officeDdo the officeDdo to set
	 */
	public void setOfficeDdo(String officeDdo) {
		this.officeDdo = officeDdo;
	}

	/**
	 * @return the officeGeocode
	 */
	public String getOfficeGeocode() {
		return officeGeocode;
	}

	/**
	 * @param officeGeocode the officeGeocode to set
	 */
	public void setOfficeGeocode(String officeGeocode) {
		this.officeGeocode = officeGeocode;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the createDdate
	 *//*
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	*//**
	 * @param createDdate the createDdate to set
	 *//*
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}*/

	/**
	 * @return the lupdate
	 */
	public LocalDateTime getLupdate() {
		return lupdate;
	}

	/**
	 * @param lupdate the lupdate to set
	 */
	public void setLupdate(LocalDateTime lupdate) {
		this.lupdate = lupdate;
	}
	/**
	 * @return the hsrpOffice
	 */
	public String getHsrpOffice() {
		return hsrpOffice;
	}

	/**
	 * @param hsrpOffice the hsrpOffice to set
	 */
	public void setHsrpOffice(String hsrpOffice) {
		this.hsrpOffice = hsrpOffice;
	}

	public String getOfficeNumberSeries() {
		return officeNumberSeries;
	}

	public void setOfficeNumberSeries(String officeNumberSeries) {
		this.officeNumberSeries = officeNumberSeries;
	}

	public String getReportingoffice() {
		return reportingoffice;
	}

	public void setReportingoffice(String reportingoffice) {
		this.reportingoffice = reportingoffice;
	}
	
}
