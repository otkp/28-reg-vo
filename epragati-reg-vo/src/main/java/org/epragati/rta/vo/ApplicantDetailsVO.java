package org.epragati.rta.vo;
import java.time.LocalDate;

import org.epragati.master.vo.ApplicantAddressVO;
import org.epragati.master.vo.ApplicationTypeVO;
import org.epragati.master.vo.BloodGroupVO;
import org.epragati.master.vo.ContactVO;
import org.epragati.master.vo.QualificationVO;


public class ApplicantDetailsVO  {

	private static final long serialVersionUID = 1L;

	private String applicantNo;

	private String displayName;

	private String firstName;

	private String lastName;

	private String middleName;

	private String fatherName;

	private ContactVO contact;

	private Boolean isDifferentlyAbled;

	private ApplicantAddressVO presentAddress;

	//private AadhaarDetailsResponseVO aadharResponse;

	private Boolean isAadhaarValidated;

	private ApplicationTypeVO applicantionType;

	private String status;

	private QualificationVO qualification;

	private BloodGroupVO bloodGrp;

	private String nationality;

	private Boolean sameAsAadhar;


	private String aadharNo;

	private String gender;

	
	private LocalDate dateOfBirth;


	/**
	 * @return the applicantNo
	 */
	public String getApplicantNo() {
		return applicantNo;
	}


	/**
	 * @param applicantNo the applicantNo to set
	 */
	public void setApplicantNo(String applicantNo) {
		this.applicantNo = applicantNo;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}


	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
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
	 * @return the contact
	 */
	public ContactVO getContact() {
		return contact;
	}


	/**
	 * @param contact the contact to set
	 */
	public void setContact(ContactVO contact) {
		this.contact = contact;
	}


	/**
	 * @return the isDifferentlyAbled
	 */
	public Boolean getIsDifferentlyAbled() {
		return isDifferentlyAbled;
	}


	/**
	 * @param isDifferentlyAbled the isDifferentlyAbled to set
	 */
	public void setIsDifferentlyAbled(Boolean isDifferentlyAbled) {
		this.isDifferentlyAbled = isDifferentlyAbled;
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
	 * @return the isAadhaarValidated
	 */
	public Boolean getIsAadhaarValidated() {
		return isAadhaarValidated;
	}


	/**
	 * @param isAadhaarValidated the isAadhaarValidated to set
	 */
	public void setIsAadhaarValidated(Boolean isAadhaarValidated) {
		this.isAadhaarValidated = isAadhaarValidated;
	}


	/**
	 * @return the applicantionType
	 */
	public ApplicationTypeVO getApplicantionType() {
		return applicantionType;
	}


	/**
	 * @param applicantionType the applicantionType to set
	 */
	public void setApplicantionType(ApplicationTypeVO applicantionType) {
		this.applicantionType = applicantionType;
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
	 * @return the qualification
	 */
	public QualificationVO getQualification() {
		return qualification;
	}


	/**
	 * @param qualification the qualification to set
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
	 * @param bloodGrp the bloodGrp to set
	 */
	public void setBloodGrp(BloodGroupVO bloodGrp) {
		this.bloodGrp = bloodGrp;
	}


	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}


	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	/**
	 * @return the sameAsAadhar
	 */
	public Boolean getSameAsAadhar() {
		return sameAsAadhar;
	}


	/**
	 * @param sameAsAadhar the sameAsAadhar to set
	 */
	public void setSameAsAadhar(Boolean sameAsAadhar) {
		this.sameAsAadhar = sameAsAadhar;
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
	 * @return the dateOfBirth
	 */
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}