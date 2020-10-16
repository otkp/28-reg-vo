package org.epragati.master.vo;

import java.time.LocalDate;
import java.util.List;

import org.epragati.service.enclosure.vo.EnclosureRejectedVO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EductaionInstituteVehicleDetailsVO {

	private String userId;
	private String aadharNo;
	private String prNo;
	private String applicationNo;
	private String ownerName;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate registrationDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate taxValidity;
	private String fcNumber;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fcValidity;
	private String permitNumber;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate permitValidity;
	private DriverDetailsVO driverDetails;
	private AttendantDetailsVO attendantDetails;
	private String route;
	private List<StudentDetailsVO> studentDetails;
	List<EnclosureRejectedVO> imageDetailsList;
	
	
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the aadharNo
	 */
	public String getAadharNo() {
		return aadharNo;
	}
	/**
	 * @param aadharNo the aadharNo to set
	 */
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}
	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	/**
	 * @return the driverDetails
	 */
	public DriverDetailsVO getDriverDetails() {
		return driverDetails;
	}
	/**
	 * @param driverDetails the driverDetails to set
	 */
	public void setDriverDetails(DriverDetailsVO driverDetails) {
		this.driverDetails = driverDetails;
	}
	/**
	 * @return the attendantDetails
	 */
	public AttendantDetailsVO getAttendantDetails() {
		return attendantDetails;
	}
	/**
	 * @param attendantDetails the attendantDetails to set
	 */
	public void setAttendantDetails(AttendantDetailsVO attendantDetails) {
		this.attendantDetails = attendantDetails;
	}
	/**
	 * @return the route
	 */
	public String getRoute() {
		return route;
	}
	/**
	 * @param route the route to set
	 */
	public void setRoute(String route) {
		this.route = route;
	}

	/**
	 * @return the studentDetails
	 */
	public List<StudentDetailsVO> getStudentDetails() {
		return studentDetails;
	}
	/**
	 * @param studentDetails the studentDetails to set
	 */
	public void setStudentDetails(List<StudentDetailsVO> studentDetails) {
		this.studentDetails = studentDetails;
	}
	/**
	 * @return the imageDetailsList
	 */
	public List<EnclosureRejectedVO> getImageDetailsList() {
		return imageDetailsList;
	}
	/**
	 * @param imageDetailsList the imageDetailsList to set
	 */
	public void setImageDetailsList(List<EnclosureRejectedVO> imageDetailsList) {
		this.imageDetailsList = imageDetailsList;
	}
	/**
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}
	/**
	 * @param applicationNo the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}
	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	/**
	 * @return the registrationDate
	 */
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	/**
	 * @param registrationDate the registrationDate to set
	 */
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	/**
	 * @return the taxValidity
	 */
	public LocalDate getTaxValidity() {
		return taxValidity;
	}
	/**
	 * @param taxValidity the taxValidity to set
	 */
	public void setTaxValidity(LocalDate taxValidity) {
		this.taxValidity = taxValidity;
	}
	/**
	 * @return the fcNumber
	 */
	public String getFcNumber() {
		return fcNumber;
	}
	/**
	 * @param fcNumber the fcNumber to set
	 */
	public void setFcNumber(String fcNumber) {
		this.fcNumber = fcNumber;
	}
	/**
	 * @return the fcValidity
	 */
	public LocalDate getFcValidity() {
		return fcValidity;
	}
	/**
	 * @param fcValidity the fcValidity to set
	 */
	public void setFcValidity(LocalDate fcValidity) {
		this.fcValidity = fcValidity;
	}
	/**
	 * @return the permitNumber
	 */
	public String getPermitNumber() {
		return permitNumber;
	}
	/**
	 * @param permitNumber the permitNumber to set
	 */
	public void setPermitNumber(String permitNumber) {
		this.permitNumber = permitNumber;
	}
	/**
	 * @return the permitValidity
	 */
	public LocalDate getPermitValidity() {
		return permitValidity;
	}
	/**
	 * @param permitValidity the permitValidity to set
	 */
	public void setPermitValidity(LocalDate permitValidity) {
		this.permitValidity = permitValidity;
	}
	
	
}
