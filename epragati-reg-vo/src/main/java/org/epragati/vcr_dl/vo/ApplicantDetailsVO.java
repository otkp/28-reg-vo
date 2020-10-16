package org.epragati.vcr_dl.vo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.constants.GenderEnum;
import org.epragati.constants.NationalityEnum;
import org.epragati.master.vo.ActionDetailsVO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ApplicantDetailsVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String applicantNo;
	private String aadharNo;
	private String passportNo;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate visaValidity;
	private Boolean isAadhaarValidated;
	private String aadhaarName;
	private String displayName;
	private String firstName;
	private String middleName;
	private String lastName;
	private String fatherName;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dob;
	private GenderEnum gender;
	private Boolean isDifferentlyAbled;
	private List<String> identificationMarks;

	private String mobile;
	private String alternateMobile;
	private String emailId;
	private String status;
	private Boolean isMinor;

	private Boolean sameAsAadhaarAddress;
	private AddressVO permanentAddress;
	private AddressVO presentAddress;
	private NationalityEnum nationality;
	private String serviceType;
	private String profileImageUrl;

	private Boolean examRequired;

	private String villageOther;
	private List<ActionDetailsVO> actionsDetails;
	private List<ClassOfVehiclesVO> classVehicles;

	private String lockedBy;
	private LocalDateTime lockedDate;
	private String serviceDesc;

	public String getApplicantNo() {
		return applicantNo;
	}

	public void setApplicantNo(String applicantNo) {
		this.applicantNo = applicantNo;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public LocalDate getVisaValidity() {
		return visaValidity;
	}

	public void setVisaValidity(LocalDate visaValidity) {
		this.visaValidity = visaValidity;
	}

	public Boolean getIsAadhaarValidated() {
		return isAadhaarValidated;
	}

	public void setIsAadhaarValidated(Boolean isAadhaarValidated) {
		this.isAadhaarValidated = isAadhaarValidated;
	}

	public String getAadhaarName() {
		return aadhaarName;
	}

	public void setAadhaarName(String aadhaarName) {
		this.aadhaarName = aadhaarName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public GenderEnum getGender() {
		return gender;
	}

	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}

	public Boolean getIsDifferentlyAbled() {
		return isDifferentlyAbled;
	}

	public void setIsDifferentlyAbled(Boolean isDifferentlyAbled) {
		this.isDifferentlyAbled = isDifferentlyAbled;
	}

	public List<String> getIdentificationMarks() {
		return identificationMarks;
	}

	public void setIdentificationMarks(List<String> identificationMarks) {
		this.identificationMarks = identificationMarks;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAlternateMobile() {
		return alternateMobile;
	}

	public void setAlternateMobile(String alternateMobile) {
		this.alternateMobile = alternateMobile;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getIsMinor() {
		return isMinor;
	}

	public void setIsMinor(Boolean isMinor) {
		this.isMinor = isMinor;
	}

	public Boolean getSameAsAadhaarAddress() {
		return sameAsAadhaarAddress;
	}

	public void setSameAsAadhaarAddress(Boolean sameAsAadhaarAddress) {
		this.sameAsAadhaarAddress = sameAsAadhaarAddress;
	}

	public AddressVO getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(AddressVO permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public AddressVO getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(AddressVO presentAddress) {
		this.presentAddress = presentAddress;
	}

	public NationalityEnum getNationality() {
		return nationality;
	}

	public void setNationality(NationalityEnum nationality) {
		this.nationality = nationality;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	public Boolean getExamRequired() {
		return examRequired;
	}

	public void setExamRequired(Boolean examRequired) {
		this.examRequired = examRequired;
	}

	public String getVillageOther() {
		return villageOther;
	}

	public void setVillageOther(String villageOther) {
		this.villageOther = villageOther;
	}

	public List<ActionDetailsVO> getActionsDetails() {
		return actionsDetails;
	}

	public void setActionsDetails(List<ActionDetailsVO> actionsDetails) {
		this.actionsDetails = actionsDetails;
	}

	public List<ClassOfVehiclesVO> getClassVehicles() {
		return classVehicles;
	}

	public void setClassVehicles(List<ClassOfVehiclesVO> classVehicles) {
		this.classVehicles = classVehicles;
	}

	public String getLockedBy() {
		return lockedBy;
	}

	public void setLockedBy(String lockedBy) {
		this.lockedBy = lockedBy;
	}

	public LocalDateTime getLockedDate() {
		return lockedDate;
	}

	public void setLockedDate(LocalDateTime lockedDate) {
		this.lockedDate = lockedDate;
	}

	public String getServiceDesc() {
		return serviceDesc;
	}

	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}

	@Override
	public String toString() {
		return "ApplicantDetailsVO [applicantNo=" + applicantNo + ", aadharNo=" + aadharNo + ", passportNo="
				+ passportNo + ", visaValidity=" + visaValidity + ", isAadhaarValidated=" + isAadhaarValidated
				+ ", aadhaarName=" + aadhaarName + ", displayName=" + displayName + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", fatherName=" + fatherName + ", dob="
				+ dob + ", gender=" + gender + ", isDifferentlyAbled=" + isDifferentlyAbled + ", identificationMarks="
				+ identificationMarks + ", mobile=" + mobile + ", alternateMobile=" + alternateMobile + ", emailId="
				+ emailId + ", status=" + status + ", isMinor=" + isMinor + ", sameAsAadhaarAddress="
				+ sameAsAadhaarAddress + ", permanentAddress=" + permanentAddress + ", presentAddress=" + presentAddress
				+ ", nationality=" + nationality + ", serviceType=" + serviceType + ", profileImageUrl="
				+ profileImageUrl + ", examRequired=" + examRequired + ", villageOther=" + villageOther
				+ ", actionsDetails=" + actionsDetails + ", classVehicles=" + classVehicles + ", lockedBy=" + lockedBy
				+ ", lockedDate=" + lockedDate + ", serviceDesc=" + serviceDesc + "]";
	}

}
