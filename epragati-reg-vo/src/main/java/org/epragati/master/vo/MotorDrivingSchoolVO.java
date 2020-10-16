package org.epragati.master.vo;

import java.time.LocalDate;
import java.util.List;

import org.epragati.aadhaar.AadharDetailsResponseVO;
import org.epragati.images.vo.ImageInput;
import org.epragati.regservice.vo.LockedDetailsVO;
import org.epragati.regservice.vo.PUCDetailsVO;
import org.epragati.service.enclosure.vo.EnclosureRejectedVO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)

public class MotorDrivingSchoolVO {

	private String userId;
	private String schoolId;
	private String aadharNo;
	private String schoolName;
	private String schoolRegNumber;
	private String username;
	private String mobile;
	private String landLine;
	private String totalAreaOfSchool;
	private ApplicantAddressVO schoolAddress;
	private String email;
	private String website;
	private String schoolType;
	private String applicationStatus;
	private String officeCode;
	private List<ActionDetailsVO> actionDetails;
	private List<ActionDetailsVO> actionDetailsList;
	private List<RepresentativeDetailsVO> representativeDetails;
	private String applicationNo;
	private String ownerName;
	private List<DriverDetailsVO> driverDetails;
	private List<MotorDrivingSchoolStudentDetailsVO> studentDetails;
	private List<LockedDetailsVO> lockedDetails;
	private List<ImageInput> images;
	private String permitType;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fitnessValidity;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate taxValidity;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate permitValidity;
	private StaffDetailsVO staffDetails;
	private PUCDetailsVO pucDetails;
	private InsuranceDetailsVO insuranceDetails;
	private String panNumber;
	private String gstiNumber;
	private Boolean dualControllerFacility;
	private List<StaffDetailsVO> instructorDetails;
	private String primaryRole;
	private String additionalRole;
	private String Password;
	private String comments;
	private RegistrationDetailsVO registrationDetails;
	private String reportingOfficeCode;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validFrom;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validTo;
	

	
	public LocalDate getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}
	public LocalDate getValidTo() {
		return validTo;
	}
	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}
	public String getReportingOfficeCode() {
		return reportingOfficeCode;
	}
	public void setReportingOfficeCode(String reportingOfficeCode) {
		this.reportingOfficeCode = reportingOfficeCode;
	}
	public String getPrimaryRole() {
		return primaryRole;
	}
	public void setPrimaryRole(String primaryRole) {
		this.primaryRole = primaryRole;
	}
	public String getAdditionalRole() {
		return additionalRole;
	}
	public void setAdditionalRole(String additionalRole) {
		this.additionalRole = additionalRole;
	}
	
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getGstiNumber() {
		return gstiNumber;
	}
	public void setGstiNumber(String gstiNumber) {
		this.gstiNumber = gstiNumber;
	}
	public Boolean getDualControllerFacility() {
		return dualControllerFacility;
	}
	public void setDualControllerFacility(Boolean dualControllerFacility) {
		this.dualControllerFacility = dualControllerFacility;
	}
	public InsuranceDetailsVO getInsuranceDetails() {
		return insuranceDetails;
	}
	public void setInsuranceDetails(InsuranceDetailsVO insuranceDetails) {
		this.insuranceDetails = insuranceDetails;
	}
	public StaffDetailsVO getStaffDetails() {
		return staffDetails;
	}
	public void setStaffDetails(StaffDetailsVO staffDetails) {
		this.staffDetails = staffDetails;
	}
	public List<ImageInput> getImages() {
		return images;
	}
	public void setImages(List<ImageInput> images) {
		this.images = images;
	}
	public List<LockedDetailsVO> getLockedDetails() {
		return lockedDetails;
	}
	public void setLockedDetails(List<LockedDetailsVO> lockedDetails) {
		this.lockedDetails = lockedDetails;
	}
	
	public PUCDetailsVO getPucDetails() {
		return pucDetails;
	}
	public void setPucDetails(PUCDetailsVO pucDetails) {
		this.pucDetails = pucDetails;
	}

	public AadharDetailsResponseVO ownerAadharResponse;
	List<EnclosureRejectedVO> imageDetailsList;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public String getSchoolRegNumber() {
		return schoolRegNumber;
	}
	public void setSchoolRegNumber(String schoolRegNumber) {
		this.schoolRegNumber = schoolRegNumber;
	}
	public String getPermitType() {
		return permitType;
	}
	public void setPermitType(String permitType) {
		this.permitType = permitType;
	}
	
	public LocalDate getFitnessValidity() {
		return fitnessValidity;
	}
	public void setFitnessValidity(LocalDate fitnessValidity) {
		this.fitnessValidity = fitnessValidity;
	}
	
	public LocalDate getTaxValidity() {
		return taxValidity;
	}
	public void setTaxValidity(LocalDate taxValidity) {
		this.taxValidity = taxValidity;
	}
	public LocalDate getPermitValidity() {
		return permitValidity;
	}
	public void setPermitValidity(LocalDate permitValidity) {
		this.permitValidity = permitValidity;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getLandLine() {
		return landLine;
	}
	public void setLandLine(String landLine) {
		this.landLine = landLine;
	}
	public String getTotalAreaOfSchool() {
		return totalAreaOfSchool;
	}
	public void setTotalAreaOfSchool(String totalAreaOfSchool) {
		this.totalAreaOfSchool = totalAreaOfSchool;
	}
	public ApplicantAddressVO getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(ApplicantAddressVO schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getSchoolType() {
		return schoolType;
	}
	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	
	public List<ActionDetailsVO> getActionDetails() {
		return actionDetails;
	}
	public void setActionDetails(List<ActionDetailsVO> actionDetails) {
		this.actionDetails = actionDetails;
	}
	public List<ActionDetailsVO> getActionDetailsList() {
		return actionDetailsList;
	}
	public void setActionDetailsList(List<ActionDetailsVO> actionDetailsList) {
		this.actionDetailsList = actionDetailsList;
	}
	
	public List<RepresentativeDetailsVO> getRepresentativeDetails() {
		return representativeDetails;
	}
	public void setRepresentativeDetails(List<RepresentativeDetailsVO> representativeDetails) {
		this.representativeDetails = representativeDetails;
	}
	
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public List<DriverDetailsVO> getDriverDetails() {
		return driverDetails;
	}
	public void setDriverDetails(List<DriverDetailsVO> driverDetails) {
		this.driverDetails = driverDetails;
	}
	public List<MotorDrivingSchoolStudentDetailsVO> getStudentDetails() {
		return studentDetails;
	}
	public void setStudentDetails(List<MotorDrivingSchoolStudentDetailsVO> studentDetails) {
		this.studentDetails = studentDetails;
	}
	public AadharDetailsResponseVO getOwnerAadharResponse() {
		return ownerAadharResponse;
	}
	public void setOwnerAadharResponse(AadharDetailsResponseVO ownerAadharResponse) {
		this.ownerAadharResponse = ownerAadharResponse;
	}
	public List<EnclosureRejectedVO> getImageDetailsList() {
		return imageDetailsList;
	}
	public void setImageDetailsList(List<EnclosureRejectedVO> imageDetailsList) {
		this.imageDetailsList = imageDetailsList;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public List<StaffDetailsVO> getInstructorDetails() {
		return instructorDetails;
	}
	public void setInstructorDetails(List<StaffDetailsVO> instructorDetails) {
		this.instructorDetails = instructorDetails;
	}
	public RegistrationDetailsVO getRegistrationDetails() {
		return registrationDetails;
	}
	public void setRegistrationDetails(RegistrationDetailsVO registrationDetails) {
		this.registrationDetails = registrationDetails;
	}

	

}
