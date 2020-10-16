package org.epragati.payments.vo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.common.vo.PractitionerDetails;
import org.epragati.constants.EnclosureType;
import org.epragati.constants.GenderEnum;
import org.epragati.constants.NationalityEnum;
import org.epragati.master.vo.BloodGroupVO;
import org.epragati.master.vo.QualificationVO;
import org.epragati.service.enclosure.vo.EnclosuresVOLog;
import org.epragati.service.enclosure.vo.ImageVO;
import org.epragati.util.document.KeyValue;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ApplicantDetailsVO implements Serializable {

	/**
	 * 
	 */
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
	private PractitionerDetails practitionerDetails;
	private String mobile;
	private String alternateMobile;
	private String emailId;
	private String status;
	private QualificationVO qualification;
	private BloodGroupVO bloodGrp;
	private Boolean isMinor;
	//private GuardianVO guardian;
	private Boolean sameAsAadhaarAddress;
	//private AddressVO permanentAddress;
	//private AddressVO presentAddress;
	//private ForeignerAddressVO foreignerAddress;
	//private AadharUserDetailsResponseVO aadharResponse;
	private NationalityEnum nationality;
	private String serviceType;
	private String profileImageUrl;

	private Boolean examRequired;

	private List<KeyValue<EnclosureType, List<ImageVO>>> enclosures;
	private List<EnclosuresVOLog> enclosuresVOLog;
	private String villageOther;
	//private List<ActionDetailsVO> actionsDetails;
	private List<ClassOfVehiclesVO> classVehicles;

	private String lockedBy;
	private LocalDateTime lockedDate;
	private String serviceDesc;

	/**
	 * @return the applicantNo
	 */
	public String getApplicantNo() {
		return applicantNo;
	}

	/**
	 * @param applicantNo
	 *            the applicantNo to set
	 */
	public void setApplicantNo(String applicantNo) {
		this.applicantNo = applicantNo;
	}

	/**
	 * @return the aadharNo
	 */
	public String getAadharNo() {
		return aadharNo;
	}

	/**
	 * @param aadharNo
	 *            the aadharNo to set
	 */
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	/**
	 * @return the passportNo
	 */
	public String getPassportNo() {
		return passportNo;
	}

	/**
	 * @param passportNo
	 *            the passportNo to set
	 */
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	/**
	 * @return the visaValidity
	 */
	public LocalDate getVisaValidity() {
		return visaValidity;
	}

	/**
	 * @param visaValidity
	 *            the visaValidity to set
	 */
	public void setVisaValidity(LocalDate visaValidity) {
		this.visaValidity = visaValidity;
	}

	/**
	 * @return the isAadhaarValidated
	 */
	public Boolean getIsAadhaarValidated() {
		return isAadhaarValidated;
	}

	/**
	 * @param isAadhaarValidated
	 *            the isAadhaarValidated to set
	 */
	public void setIsAadhaarValidated(Boolean isAadhaarValidated) {
		this.isAadhaarValidated = isAadhaarValidated;
	}

	/**
	 * @return the aadhaarName
	 */
	public String getAadhaarName() {
		return aadhaarName;
	}

	/**
	 * @param aadhaarName
	 *            the aadhaarName to set
	 */
	public void setAadhaarName(String aadhaarName) {
		this.aadhaarName = aadhaarName;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param displayName
	 *            the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName
	 *            the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}

	/**
	 * @param fatherName
	 *            the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	/**
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}

	/**
	 * @param dob
	 *            the dob to set
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	/**
	 * @return the gender
	 */
	public GenderEnum getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}

	/**
	 * @return the isDifferentlyAbled
	 */
	public Boolean getIsDifferentlyAbled() {
		return isDifferentlyAbled;
	}

	/**
	 * @param isDifferentlyAbled
	 *            the isDifferentlyAbled to set
	 */
	public void setIsDifferentlyAbled(Boolean isDifferentlyAbled) {
		this.isDifferentlyAbled = isDifferentlyAbled;
	}

	/**
	 * @return the identificationMarks
	 */
	public List<String> getIdentificationMarks() {
		return identificationMarks;
	}

	/**
	 * @param identificationMarks
	 *            the identificationMarks to set
	 */
	public void setIdentificationMarks(List<String> identificationMarks) {
		this.identificationMarks = identificationMarks;
	}

	/**
	 * @return the practitionerDetails
	 */
	public PractitionerDetails getPractitionerDetails() {
		return practitionerDetails;
	}

	/**
	 * @param practitionerDetails
	 *            the practitionerDetails to set
	 */
	public void setPractitionerDetails(PractitionerDetails practitionerDetails) {
		this.practitionerDetails = practitionerDetails;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the alternateMobile
	 */
	public String getAlternateMobile() {
		return alternateMobile;
	}

	/**
	 * @param alternateMobile
	 *            the alternateMobile to set
	 */
	public void setAlternateMobile(String alternateMobile) {
		this.alternateMobile = alternateMobile;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId
	 *            the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the qualification
	 */
	public QualificationVO getQualification() {
		return qualification;
	}

	/**
	 * @param qualification
	 *            the qualification to set
	 */
	public void setQualification(QualificationVO qualification) {
		this.qualification = qualification;
	}

	/**
	 * @return the bloodGrp
	 */
	public BloodGroupVO getBloodGrp() {
		return bloodGrp;
	}

	/**
	 * @param bloodGrp
	 *            the bloodGrp to set
	 */
	public void setBloodGrp(BloodGroupVO bloodGrp) {
		this.bloodGrp = bloodGrp;
	}

	/**
	 * @return the isMinor
	 */
	public Boolean getIsMinor() {
		return isMinor;
	}

	/**
	 * @param isMinor
	 *            the isMinor to set
	 */
	public void setIsMinor(Boolean isMinor) {
		this.isMinor = isMinor;
	}

	/**
	 * @return the guardian
	 */
	/*public GuardianVO getGuardian() {
		return guardian;
	}

	*//**
	 * @param guardian
	 *            the guardian to set
	 *//*
	public void setGuardian(GuardianVO guardian) {
		this.guardian = guardian;
	}*/

	/**
	 * @return the sameAsAadhaarAddress
	 */
	public Boolean getSameAsAadhaarAddress() {
		return sameAsAadhaarAddress;
	}

	/**
	 * @param sameAsAadhaarAddress
	 *            the sameAsAadhaarAddress to set
	 */
	public void setSameAsAadhaarAddress(Boolean sameAsAadhaarAddress) {
		this.sameAsAadhaarAddress = sameAsAadhaarAddress;
	}

	/**
	 * @return the permanentAddress
	 */
	/*public AddressVO getPermanentAddress() {
		return permanentAddress;
	}

	*//**
	 * @param permanentAddress
	 *            the permanentAddress to set
	 *//*
	public void setPermanentAddress(AddressVO permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	*//**
	 * @return the presentAddress
	 *//*
	public AddressVO getPresentAddress() {
		return presentAddress;
	}

	*//**
	 * @param presentAddress
	 *            the presentAddress to set
	 *//*
	public void setPresentAddress(AddressVO presentAddress) {
		this.presentAddress = presentAddress;
	}

	*//**
	 * @return the foreignerAddress
	 *//*
	public ForeignerAddressVO getForeignerAddress() {
		return foreignerAddress;
	}

	*//**
	 * @param foreignerAddress
	 *            the foreignerAddress to set
	 *//*
	public void setForeignerAddress(ForeignerAddressVO foreignerAddress) {
		this.foreignerAddress = foreignerAddress;
	}*/

	/**
	 * @return the aadharResponse
	 */
	/*public AadharUserDetailsResponseVO getAadharResponse() {
		return aadharResponse;
	}

	*//**
	 * @param aadharResponse
	 *            the aadharResponse to set
	 *//*
	public void setAadharResponse(AadharUserDetailsResponseVO aadharResponse) {
		this.aadharResponse = aadharResponse;
	}*/

	/**
	 * @return the nationality
	 */
	public NationalityEnum getNationality() {
		return nationality;
	}

	/**
	 * @param nationality
	 *            the nationality to set
	 */
	public void setNationality(NationalityEnum nationality) {
		this.nationality = nationality;
	}

	/**
	 * @return the serviceType
	 */
	public String getServiceType() {
		return serviceType;
	}

	/**
	 * @param serviceType
	 *            the serviceType to set
	 */
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * @return the profileImageUrl
	 */
	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	/**
	 * @param profileImageUrl
	 *            the profileImageUrl to set
	 */
	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	/**
	 * @return the examRequired
	 */
	public Boolean getExamRequired() {
		return examRequired;
	}

	/**
	 * @param examRequired
	 *            the examRequired to set
	 */
	public void setExamRequired(Boolean examRequired) {
		this.examRequired = examRequired;
	}

	/**
	 * @return the enclosures
	 */
	public List<KeyValue<EnclosureType, List<ImageVO>>> getEnclosures() {
		return enclosures;
	}

	/**
	 * @param enclosures
	 *            the enclosures to set
	 */
	public void setEnclosures(List<KeyValue<EnclosureType, List<ImageVO>>> enclosures) {
		this.enclosures = enclosures;
	}

	public List<EnclosuresVOLog> getEnclosuresVOLog() {
		return enclosuresVOLog;
	}

	public void setEnclosuresVOLog(List<EnclosuresVOLog> enclosuresVOLog) {
		this.enclosuresVOLog = enclosuresVOLog;
	}

	/**
	 * @return the villageOther
	 */
	public String getVillageOther() {
		return villageOther;
	}

	/**
	 * @param villageOther
	 *            the villageOther to set
	 */
	public void setVillageOther(String villageOther) {
		this.villageOther = villageOther;
	}

	/**
	 * @return the actionsDetails
	 */
	/*public List<ActionDetailsVO> getActionsDetails() {
		return actionsDetails;
	}

	*//**
	 * @param actionsDetails
	 *            the actionsDetails to set
	 *//*
	public void setActionsDetails(List<ActionDetailsVO> actionsDetails) {
		this.actionsDetails = actionsDetails;
	}*/

	/**
	 * @return the classVehicles
	 */
	public List<ClassOfVehiclesVO> getClassVehicles() {
		return classVehicles;
	}

	/**
	 * @param classVehicles
	 *            the classVehicles to set
	 */
	public void setClassVehicles(List<ClassOfVehiclesVO> classVehicles) {
		this.classVehicles = classVehicles;
	}

	/**
	 * @return the lockedBy
	 */
	public String getLockedBy() {
		return lockedBy;
	}

	/**
	 * @param lockedBy
	 *            the lockedBy to set
	 */
	public void setLockedBy(String lockedBy) {
		this.lockedBy = lockedBy;
	}

	/**
	 * @return the lockedDate
	 */
	public LocalDateTime getLockedDate() {
		return lockedDate;
	}

	/**
	 * @param lockedDate
	 *            the lockedDate to set
	 */
	public void setLockedDate(LocalDateTime lockedDate) {
		this.lockedDate = lockedDate;
	}

	/**
	 * @return the serviceDesc
	 */
	public String getServiceDesc() {
		return serviceDesc;
	}

	/**
	 * @param serviceDesc
	 *            the serviceDesc to set
	 */
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ApplicantDetailsVO [" + (applicantNo != null ? "applicantNo=" + applicantNo + ", " : "")
				+ (aadharNo != null ? "aadharNo=" + aadharNo + ", " : "")
				+ (passportNo != null ? "passportNo=" + passportNo + ", " : "")
				+ (visaValidity != null ? "visaValidity=" + visaValidity + ", " : "")
				+ (isAadhaarValidated != null ? "isAadhaarValidated=" + isAadhaarValidated + ", " : "")
				+ (aadhaarName != null ? "aadhaarName=" + aadhaarName + ", " : "")
				+ (displayName != null ? "displayName=" + displayName + ", " : "")
				+ (firstName != null ? "firstName=" + firstName + ", " : "")
				+ (middleName != null ? "middleName=" + middleName + ", " : "")
				+ (lastName != null ? "lastName=" + lastName + ", " : "")
				+ (fatherName != null ? "fatherName=" + fatherName + ", " : "")
				+ (dob != null ? "dob=" + dob + ", " : "") + (gender != null ? "gender=" + gender + ", " : "")
				+ (isDifferentlyAbled != null ? "isDifferentlyAbled=" + isDifferentlyAbled + ", " : "")
				+ (identificationMarks != null ? "identificationMarks=" + identificationMarks + ", " : "")
				+ (practitionerDetails != null ? "practitionerDetails=" + practitionerDetails + ", " : "")
				+ (mobile != null ? "mobile=" + mobile + ", " : "")
				+ (alternateMobile != null ? "alternateMobile=" + alternateMobile + ", " : "")
				+ (emailId != null ? "emailId=" + emailId + ", " : "")
				+ (status != null ? "Status=" + status + ", " : "")
				+ (qualification != null ? "qualification=" + qualification + ", " : "")
				+ (bloodGrp != null ? "bloodGrp=" + bloodGrp + ", " : "")
				+ (isMinor != null ? "isMinor=" + isMinor + ", " : "")
				/*+ (guardian != null ? "guardian=" + guardian + ", " : "")*/
				+ (sameAsAadhaarAddress != null ? "sameAsAadhaarAddress=" + sameAsAadhaarAddress + ", " : "")
				/*+ (permanentAddress != null ? "permanentAddress=" + permanentAddress + ", " : "")
				+ (presentAddress != null ? "presentAddress=" + presentAddress + ", " : "")
				+ (foreignerAddress != null ? "foreignerAddress=" + foreignerAddress + ", " : "")
				+ (aadharResponse != null ? "aadharResponse=" + aadharResponse + ", " : "")*/
				+ (nationality != null ? "nationality=" + nationality + ", " : "")
				+ (serviceType != null ? "serviceType=" + serviceType + ", " : "")
				+ (profileImageUrl != null ? "profileImageUrl=" + profileImageUrl + ", " : "")
				+ (examRequired != null ? "examRequired=" + examRequired + ", " : "")
				+ (enclosures != null ? "enclosures=" + enclosures + ", " : "")
				+ (enclosuresVOLog != null ? "enclosuresVOLog=" + enclosuresVOLog + ", " : "")
				+ (villageOther != null ? "villageOther=" + villageOther + ", " : "")
				/*+ (actionsDetails != null ? "actionsDetails=" + actionsDetails + ", " : "")*/
				+ (classVehicles != null ? "classVehicles=" + classVehicles + ", " : "")
				+ (lockedBy != null ? "lockedBy=" + lockedBy + ", " : "")
				+ (lockedDate != null ? "lockedDate=" + lockedDate : "") + "]";
	}

}
