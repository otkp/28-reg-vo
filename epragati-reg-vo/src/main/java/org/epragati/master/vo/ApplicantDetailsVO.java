package org.epragati.master.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.epragati.aadhaar.AadharDetailsResponseVO;
import org.epragati.service.enclosure.vo.ImageVO;
import org.epragati.util.custom.validation.Conditional;
import org.epragati.util.custom.validation.ValidatorConstants;
import org.epragati.util.document.KeyValue;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class ApplicantDetailsVO {

	public ApplicantDetailsVO() {
		presentAddress= new ApplicantAddressVO();
		contact=new ContactVO();
		applicantionType=new ApplicationTypeVO();
		qualification=new QualificationVO();
		aadharResponse= new AadharDetailsResponseVO(); 
		bloodGrp=new BloodGroupVO();
	}

	private String applicantNo;

	@Conditional(selected = "displayName",message = ValidatorConstants.INVALID_DISPLAY_NAME, values = { "" })
	private String displayName;

	@Conditional(selected = "firstName",message = ValidatorConstants.INVALID_FIRST_NAME, values = { "" })
	private String firstName;

	
	private String lastName;

	private String middleName;
	@Conditional(selected = "firstName",message = ValidatorConstants.INVALID_FATHER_NAME, values = { "" })
	private String fatherName;

	@Valid
	private ContactVO contact;

	private Boolean isDifferentlyAbled;

	private ApplicantAddressVO presentAddress;
	private ApplicantAddressVO permanantAddress;
	private AadharDetailsResponseVO aadharResponse;

	private Boolean isAadhaarValidated;

	private ApplicationTypeVO applicantionType;

	private String status;

	private QualificationVO qualification;

	private BloodGroupVO bloodGrp;

	private String nationality;

	private Boolean sameAsAadhar = false;

	private String aadharNo;

	private String gender;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfBirth;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dob;

	private String documentId;

	private List<KeyValue<String, List<ImageVO>>> enclosures;

	private Boolean isAvailablePresentAddrsProof = false;

	private String presentAddrsProofBelongsTo;
	
	private String nameOfPresentAddrsProofBelongsTo;

	//@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.mm")
	//private LocalDateTime createdDate;
	
	private String entityName;
	private String representativeName;
	private String mobile;

	private String presentAddressFrom;
	
	private ContactVO ownerContact;

	public String getPresentAddressFrom() {
		return presentAddressFrom;
	}

	public void setPresentAddressFrom(String presentAddressFrom) {
		this.presentAddressFrom = presentAddressFrom;
	}



	public String getApplicantNo() {
		return applicantNo;
	}

	public void setApplicantNo(String applicantNo) {
		this.applicantNo = applicantNo;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public ContactVO getContact() {
		return contact;
	}

	public void setContact(ContactVO contact) {
		this.contact = contact;
	}

	public Boolean getIsDifferentlyAbled() {
		return isDifferentlyAbled;
	}

	public void setIsDifferentlyAbled(Boolean isDifferentlyAbled) {
		this.isDifferentlyAbled = isDifferentlyAbled;
	}

	public ApplicantAddressVO getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(ApplicantAddressVO presentAddress) {
		this.presentAddress = presentAddress;
	}

	public AadharDetailsResponseVO getAadharResponse() {
		return aadharResponse;
	}

	public void setAadharResponse(AadharDetailsResponseVO aadharResponse) {
		this.aadharResponse = aadharResponse;
	}

	public Boolean getIsAadhaarValidated() {
		return isAadhaarValidated;
	}

	public void setIsAadhaarValidated(Boolean isAadhaarValidated) {
		this.isAadhaarValidated = isAadhaarValidated;
	}

	public ApplicationTypeVO getApplicantionType() {
		return applicantionType;
	}

	public void setApplicantionType(ApplicationTypeVO applicantionType) {
		this.applicantionType = applicantionType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public QualificationVO getQualification() {
		return qualification;
	}

	public void setQualification(QualificationVO qualification) {
		this.qualification = qualification;
	}

	public BloodGroupVO getBloodGrp() {
		return bloodGrp;
	}

	public void setBloodGrp(BloodGroupVO bloodGrp) {
		this.bloodGrp = bloodGrp;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Boolean getSameAsAadhar() {
		return sameAsAadhar;
	}

	public void setSameAsAadhar(Boolean sameAsAadhar) {
		this.sameAsAadhar = sameAsAadhar;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public List<KeyValue<String, List<ImageVO>>> getEnclosures() {
		return enclosures;
	}

	public void setEnclosures(List<KeyValue<String, List<ImageVO>>> enclosures) {
		this.enclosures = enclosures;
	}

	public Boolean getIsAvailablePresentAddrsProof() {
		return isAvailablePresentAddrsProof;
	}

	public void setIsAvailablePresentAddrsProof(Boolean isAvailablePresentAddrsProof) {
		this.isAvailablePresentAddrsProof = isAvailablePresentAddrsProof;
	}

	public String getPresentAddrsProofBelongsTo() {
		return presentAddrsProofBelongsTo;
	}

	public void setPresentAddrsProofBelongsTo(String presentAddrsProofBelongsTo) {
		this.presentAddrsProofBelongsTo = presentAddrsProofBelongsTo;
	}

	public String getNameOfPresentAddrsProofBelongsTo() {
		return nameOfPresentAddrsProofBelongsTo;
	}

	public void setNameOfPresentAddrsProofBelongsTo(String nameOfPresentAddrsProofBelongsTo) {
		this.nameOfPresentAddrsProofBelongsTo = nameOfPresentAddrsProofBelongsTo;
	}

	/*public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}*/

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getRepresentativeName() {
		return representativeName;
	}

	public void setRepresentativeName(String representativeName) {
		this.representativeName = representativeName;
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
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public ApplicantAddressVO getPermanantAddress() {
		return permanantAddress;
	}

	public void setPermanantAddress(ApplicantAddressVO permanantAddress) {
		this.permanantAddress = permanantAddress;
	}

	/**
	 * @return the ownerContact
	 */
	public ContactVO getOwnerContact() {
		return ownerContact;
	}

	/**
	 * @param ownerContact the ownerContact to set
	 */
	public void setOwnerContact(ContactVO ownerContact) {
		this.ownerContact = ownerContact;
	}
	
	
}
