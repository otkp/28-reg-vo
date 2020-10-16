package org.epragati.regservice.vo;

import java.time.LocalDate;

import org.epragati.common.vo.BaseVO;
import org.epragati.constants.OwnerTypeEnum;
import org.epragati.master.vo.ApplicantAddressVO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PoliceDepartmentSearchResponceVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String registraionNumber;
	private String ownerName;
	private String classOfVehicle;
	private String makerName;
	private String makerClass;
	private String mnfMonthAndYear;
	private String chassisnumber;
	private String engineNumber;
	private String color;
	private String financierName;
	private Integer gvw;
	private Integer ulw;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fcValidUpto;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate permitValidUpto;
	private String pemitNumber;
	private String permitType;
	private String registrationAuthority;
	private String status;
	private String nocTo;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate nocDate;
	private String fuelType;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfRegistration;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate taxValidUpto;
	private String fcNumber;
	private String vehicleType;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate registrationValidUpto;
	private String bodyType;
	private String seatingCapacity;
	private String permitRoute;
	private ApplicantAddressVO presentAddress;
	private String mobile;
	private OwnerTypeEnum ownerType;
	private String classOfVehicleCode;
	private String officeCode;
	private String officeName;
	private String displayName;
	private String fatherName;
	private String cubicCapacity;
	private Integer wheelbase;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate insurenceValidUpto;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate pucValidUpto;
	private String trNo;

	/**
	 * @return the registraionNumber
	 */
	public String getRegistraionNumber() {
		return registraionNumber;
	}

	/**
	 * @param registraionNumber the registraionNumber to set
	 */
	public void setRegistraionNumber(String registraionNumber) {
		this.registraionNumber = registraionNumber;
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
	 * @return the classOfVehicle
	 */
	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	/**
	 * @param classOfVehicle the classOfVehicle to set
	 */
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	/**
	 * @return the makerName
	 */
	public String getMakerName() {
		return makerName;
	}

	/**
	 * @param makerName the makerName to set
	 */
	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}

	/**
	 * @return the makerClass
	 */
	public String getMakerClass() {
		return makerClass;
	}

	/**
	 * @param makerClass the makerClass to set
	 */
	public void setMakerClass(String makerClass) {
		this.makerClass = makerClass;
	}

	/**
	 * @return the mnfMonthAndYear
	 */
	public String getMnfMonthAndYear() {
		return mnfMonthAndYear;
	}

	/**
	 * @param mnfMonthAndYear the mnfMonthAndYear to set
	 */
	public void setMnfMonthAndYear(String mnfMonthAndYear) {
		this.mnfMonthAndYear = mnfMonthAndYear;
	}

	/**
	 * @return the chassisnumber
	 */
	public String getChassisnumber() {
		return chassisnumber;
	}

	/**
	 * @param chassisnumber the chassisnumber to set
	 */
	public void setChassisnumber(String chassisnumber) {
		this.chassisnumber = chassisnumber;
	}

	/**
	 * @return the engineNumber
	 */
	public String getEngineNumber() {
		return engineNumber;
	}

	/**
	 * @param engineNumber the engineNumber to set
	 */
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the financierName
	 */
	public String getFinancierName() {
		return financierName;
	}

	/**
	 * @param financierName the financierName to set
	 */
	public void setFinancierName(String financierName) {
		this.financierName = financierName;
	}

	/**
	 * @return the gvw
	 */
	public Integer getGvw() {
		return gvw;
	}

	/**
	 * @param gvw the gvw to set
	 */
	public void setGvw(Integer gvw) {
		this.gvw = gvw;
	}

	/**
	 * @return the ulw
	 */
	public Integer getUlw() {
		return ulw;
	}

	/**
	 * @param ulw the ulw to set
	 */
	public void setUlw(Integer ulw) {
		this.ulw = ulw;
	}

	/**
	 * @return the fcValidUpto
	 */
	public LocalDate getFcValidUpto() {
		return fcValidUpto;
	}

	/**
	 * @param fcValidUpto the fcValidUpto to set
	 */
	public void setFcValidUpto(LocalDate fcValidUpto) {
		this.fcValidUpto = fcValidUpto;
	}

	/**
	 * @return the permitValidUpto
	 */
	public LocalDate getPermitValidUpto() {
		return permitValidUpto;
	}

	/**
	 * @param permitValidUpto the permitValidUpto to set
	 */
	public void setPermitValidUpto(LocalDate permitValidUpto) {
		this.permitValidUpto = permitValidUpto;
	}

	/**
	 * @return the pemitNumber
	 */
	public String getPemitNumber() {
		return pemitNumber;
	}

	/**
	 * @param pemitNumber the pemitNumber to set
	 */
	public void setPemitNumber(String pemitNumber) {
		this.pemitNumber = pemitNumber;
	}

	/**
	 * @return the permitType
	 */
	public String getPermitType() {
		return permitType;
	}

	/**
	 * @param permitType the permitType to set
	 */
	public void setPermitType(String permitType) {
		this.permitType = permitType;
	}

	/**
	 * @return the registrationAuthority
	 */
	public String getRegistrationAuthority() {
		return registrationAuthority;
	}

	/**
	 * @param registrationAuthority the registrationAuthority to set
	 */
	public void setRegistrationAuthority(String registrationAuthority) {
		this.registrationAuthority = registrationAuthority;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the nocTo
	 */
	public String getNocTo() {
		return nocTo;
	}

	/**
	 * @param nocTo the nocTo to set
	 */
	public void setNocTo(String nocTo) {
		this.nocTo = nocTo;
	}

	/**
	 * @return the nocDate
	 */
	public LocalDate getNocDate() {
		return nocDate;
	}

	/**
	 * @param nocDate the nocDate to set
	 */
	public void setNocDate(LocalDate nocDate) {
		this.nocDate = nocDate;
	}

	/**
	 * @return the fuelType
	 */
	public String getFuelType() {
		return fuelType;
	}

	/**
	 * @param fuelType the fuelType to set
	 */
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	/**
	 * @return the dateOfRegistration
	 */
	public LocalDate getDateOfRegistration() {
		return dateOfRegistration;
	}

	/**
	 * @param dateOfRegistration the dateOfRegistration to set
	 */
	public void setDateOfRegistration(LocalDate dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	/**
	 * @return the taxValidUpto
	 */
	public LocalDate getTaxValidUpto() {
		return taxValidUpto;
	}

	/**
	 * @param taxValidUpto the taxValidUpto to set
	 */
	public void setTaxValidUpto(LocalDate taxValidUpto) {
		this.taxValidUpto = taxValidUpto;
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
	 * @return the vehicleType
	 */
	public String getVehicleType() {
		return vehicleType;
	}

	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	/**
	 * @return the registrationValidUpto
	 */
	public LocalDate getRegistrationValidUpto() {
		return registrationValidUpto;
	}

	/**
	 * @param registrationValidUpto the registrationValidUpto to set
	 */
	public void setRegistrationValidUpto(LocalDate registrationValidUpto) {
		this.registrationValidUpto = registrationValidUpto;
	}

	/**
	 * @return the bodyType
	 */
	public String getBodyType() {
		return bodyType;
	}

	/**
	 * @param bodyType the bodyType to set
	 */
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	/**
	 * @return the seatingCapacity
	 */
	public String getSeatingCapacity() {
		return seatingCapacity;
	}

	/**
	 * @param seatingCapacity the seatingCapacity to set
	 */
	public void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	/**
	 * @return the permitRoute
	 */
	public String getPermitRoute() {
		return permitRoute;
	}

	/**
	 * @param permitRoute the permitRoute to set
	 */
	public void setPermitRoute(String permitRoute) {
		this.permitRoute = permitRoute;
	}

	/**
	 * @return the presentAddress
	 */
	public ApplicantAddressVO getPresentAddress() {
		return presentAddress;
	}

	/**
	 * @param presentAddress the presentAddress to set
	 */
	public void setPresentAddress(ApplicantAddressVO presentAddress) {
		this.presentAddress = presentAddress;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the ownerType
	 */
	public OwnerTypeEnum getOwnerType() {
		return ownerType;
	}

	/**
	 * @param ownerType the ownerType to set
	 */
	public void setOwnerType(OwnerTypeEnum ownerType) {
		this.ownerType = ownerType;
	}

	/**
	 * @return the classOfVehicleCode
	 */
	public String getClassOfVehicleCode() {
		return classOfVehicleCode;
	}

	/**
	 * @param classOfVehicleCode the classOfVehicleCode to set
	 */
	public void setClassOfVehicleCode(String classOfVehicleCode) {
		this.classOfVehicleCode = classOfVehicleCode;
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
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}

	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	/**
	 * @return the cubicCapacity
	 */
	public String getCubicCapacity() {
		return cubicCapacity;
	}

	/**
	 * @param cubicCapacity the cubicCapacity to set
	 */
	public void setCubicCapacity(String cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}

	/**
	 * @return the wheelbase
	 */
	public Integer getWheelbase() {
		return wheelbase;
	}

	/**
	 * @param wheelbase the wheelbase to set
	 */
	public void setWheelbase(Integer wheelbase) {
		this.wheelbase = wheelbase;
	}

	/**
	 * @return the insurenceValidUpto
	 */
	public LocalDate getInsurenceValidUpto() {
		return insurenceValidUpto;
	}

	/**
	 * @param insurenceValidUpto the insurenceValidUpto to set
	 */
	public void setInsurenceValidUpto(LocalDate insurenceValidUpto) {
		this.insurenceValidUpto = insurenceValidUpto;
	}

	/**
	 * @return the pucValidUpto
	 */
	public LocalDate getPucValidUpto() {
		return pucValidUpto;
	}

	/**
	 * @param pucValidUpto the pucValidUpto to set
	 */
	public void setPucValidUpto(LocalDate pucValidUpto) {
		this.pucValidUpto = pucValidUpto;
	}

	/**
	 * @return the trNo
	 */
	public String getTrNo() {
		return trNo;
	}

	/**
	 * @param trNo the trNo to set
	 */
	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

}
