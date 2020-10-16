package org.epragati.regservice.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.epragati.common.vo.BaseVO;
import org.epragati.constants.OwnerTypeEnum;
import org.epragati.master.vo.ApplicantAddressVO;
import org.epragati.master.vo.InsuranceDetailsVO;
import org.epragati.payments.vo.FeeDetailsVO;
import org.epragati.rta.reports.vo.CitizenSearchReportVO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CitizenApplicationSearchResponceVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String registraionNumber;
	private String ownerName;
	private String classOfVehicle;
	private String makerName;
	private String makerClass;
	private String monthAndYear;
	private String chassisnumber;
	private String engineNumber;
	private String color;
	private String financierName;
	private Integer rlw;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate taxPaidDate;
	private String taxAmount;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fcIssuedDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fcValidUpto;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate permitIssueDate;
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
	private FeeCorrectionVO feeCorrectionVO;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate registrationValidUpto;
	private String bodyType;
	private String appChassiNumber;
	private String appEngineNumber;
	private Integer ulw;
	private String seatingCapacity;
	private String permitRoute;
	private InsuranceDetailsVO insurenceVO;
	private boolean isVehicleStoppaged = Boolean.FALSE;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate stoppageDate;

	/////////////////////////

	private String trNo;
	private String gender;
	private ApplicantAddressVO presentAddress;
	private String mobile;
	private OwnerTypeEnum ownerType;
	private String classOfVehicleCode;
	private String officeCode;
	private String officeName;
	private String displayName;
	private FeeDetailsVO feeDetails;
	private Boolean isAadharValidated = false;
	private CitizenSearchReportVO citizenSearchReportVO;

	////////////////////////

	private String permitNo;
	@JsonFormat(pattern = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime fcValidFrom;
	private double count;
	private String routeCode;

	/**
	 * @return the permitNo
	 */
	public String getPermitNo() {
		return permitNo;
	}

	/**
	 * @param permitNo the permitNo to set
	 */
	public void setPermitNo(String permitNo) {
		this.permitNo = permitNo;
	}

	/**
	 * @return the fcValidFrom
	 */
	public LocalDateTime getFcValidFrom() {
		return fcValidFrom;
	}

	/**
	 * @param fcValidFrom the fcValidFrom to set
	 */
	public void setFcValidFrom(LocalDateTime fcValidFrom) {
		this.fcValidFrom = fcValidFrom;
	}

	/**
	 * @return the citizenSearchReportVO
	 */
	public CitizenSearchReportVO getCitizenSearchReportVO() {
		return citizenSearchReportVO;
	}

	/**
	 * @param citizenSearchReportVO the citizenSearchReportVO to set
	 */
	public void setCitizenSearchReportVO(CitizenSearchReportVO citizenSearchReportVO) {
		this.citizenSearchReportVO = citizenSearchReportVO;
	}

	private String fatherName;

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	/**
	 * @return the isAadharValidated
	 */
	public Boolean getIsAadharValidated() {
		return isAadharValidated;
	}

	/**
	 * @param isAadharValidated the isAadharValidated to set
	 */
	public void setIsAadharValidated(Boolean isAadharValidated) {
		this.isAadharValidated = isAadharValidated;
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

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
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
	 * @return the monthAndYear
	 */
	public String getMonthAndYear() {
		return monthAndYear;
	}

	/**
	 * @param monthAndYear the monthAndYear to set
	 */
	public void setMonthAndYear(String monthAndYear) {
		this.monthAndYear = monthAndYear;
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
	 * @return the rlw
	 */
	public Integer getRlw() {
		return rlw;
	}

	/**
	 * @param rlw the rlw to set
	 */
	public void setRlw(Integer rlw) {
		this.rlw = rlw;
	}

	/**
	 * @return the taxPaidDate
	 */
	public LocalDate getTaxPaidDate() {
		return taxPaidDate;
	}

	/**
	 * @param taxPaidDate the taxPaidDate to set
	 */
	public void setTaxPaidDate(LocalDate taxPaidDate) {
		this.taxPaidDate = taxPaidDate;
	}

	/**
	 * @return the taxAmount
	 */
	public String getTaxAmount() {
		return taxAmount;
	}

	/**
	 * @param taxAmount the taxAmount to set
	 */
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	/**
	 * @return the fcIssuedDate
	 */
	public LocalDate getFcIssuedDate() {
		return fcIssuedDate;
	}

	/**
	 * @param fcIssuedDate the fcIssuedDate to set
	 */
	public void setFcIssuedDate(LocalDate fcIssuedDate) {
		this.fcIssuedDate = fcIssuedDate;
	}

	/**
	 * @return the permitIssueDate
	 */
	public LocalDate getPermitIssueDate() {
		return permitIssueDate;
	}

	/**
	 * @param permitIssueDate the permitIssueDate to set
	 */
	public void setPermitIssueDate(LocalDate permitIssueDate) {
		this.permitIssueDate = permitIssueDate;
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

	public FeeCorrectionVO getFeeCorrectionVO() {
		return feeCorrectionVO;
	}

	public void setFeeCorrectionVO(FeeCorrectionVO feeCorrectionVO) {
		this.feeCorrectionVO = feeCorrectionVO;
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
	 * @return the appChassiNumber
	 */
	public String getAppChassiNumber() {
		return appChassiNumber;
	}

	/**
	 * @param appChassiNumber the appChassiNumber to set
	 */
	public void setAppChassiNumber(String appChassiNumber) {
		this.appChassiNumber = appChassiNumber;
	}

	/**
	 * @return the appEngineNumber
	 */
	public String getAppEngineNumber() {
		return appEngineNumber;
	}

	/**
	 * @param appEngineNumber the appEngineNumber to set
	 */
	public void setAppEngineNumber(String appEngineNumber) {
		this.appEngineNumber = appEngineNumber;
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
	 * @return the insurenceVO
	 */
	public InsuranceDetailsVO getInsurenceVO() {
		return insurenceVO;
	}

	/**
	 * @param insurenceVO the insurenceVO to set
	 */
	public void setInsurenceVO(InsuranceDetailsVO insurenceVO) {
		this.insurenceVO = insurenceVO;
	}

	/**
	 * @return the isVehicleStoppaged
	 */
	public boolean isVehicleStoppaged() {
		return isVehicleStoppaged;
	}

	/**
	 * @param isVehicleStoppaged the isVehicleStoppaged to set
	 */
	public void setVehicleStoppaged(boolean isVehicleStoppaged) {
		this.isVehicleStoppaged = isVehicleStoppaged;
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
	 * @return the feeDetails
	 */
	public FeeDetailsVO getFeeDetails() {
		return feeDetails;
	}

	/**
	 * @param feeDetails the feeDetails to set
	 */
	public void setFeeDetails(FeeDetailsVO feeDetails) {
		this.feeDetails = feeDetails;
	}

	/**
	 * @return the count
	 */
	public double getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(double count) {
		this.count = count;
	}

	/**
	 * @return the routeCode
	 */
	public String getRouteCode() {
		return routeCode;
	}

	/**
	 * @param routeCode the routeCode to set
	 */
	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}
	
	
	
}
