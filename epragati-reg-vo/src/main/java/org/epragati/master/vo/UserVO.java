package org.epragati.master.vo;

import java.time.LocalDate;
import java.util.List;

import org.epragati.aadhaar.AadhaarDetailsRequestVO;
import org.epragati.common.vo.UserStatusEnum;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class UserVO {

	private List<RolesVO> additionalRoles;

	private MandalVO mandalDTO;

	private String confirmpassword;
	private String newpassword;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate validFrom;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate validTo;
	private List<ActionVO> actionItems;

	private String id;

	private String appNo;

	private String userId;

	private String firstName;

	private String middleName;

	private String lastName;

	private String parentId;

	private String email;

	private String mobile;

	private String faxNo;

	private String landmark;

	private String signatureImageUrl;

	private String profileImageUrl;

	private String qualification;

	private String message;

	private String empCode;

	private String userName;

	private String phoneNo;

	private OfficeVO office;

	private String password;

	private boolean status;
	
	private Boolean financierStatus;

	private DesignationVO designation;

	private String userDesignation;

	private String userDepartment;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dob;

	private RolesVO primaryRole;

	private Integer rid;

	private String aadharNo;

	private String rocNo;

	private List<ActionsVO> userAction;

	private String financierPanNo;

	private String panNo;

	private String representativeEmail;

	private String doorNo;

	private StateVO state;

	private MandalVO mandal;

	private PostOfficeVO pincode;

	private String officeContactNo;

	private String institutionName;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate registrationFirmDate;

	private String userRelation;

	private String companyType;

	private String representativeName;

	private String representativeMobileNo;

	private String streetName;

	private DistrictVO district;

	private String city;

	private String officeMail;

	private String stateName;

	private String mandalName;

	private String districtName;

	private String regdNumber;
	private VillageVO village;
	private String websiteAddress;
	private Integer userLevel;

	private LocalDate startDate;
	private LocalDate endDate;
	private boolean isPwdChangeRequired;

	private String uidToken;
	
	private String fatherName;
	
	private boolean isForUpdate;
	
	private Boolean isAccountNonLocked;
	
	private AadhaarDetailsRequestVO aadhaarDetails;
	
	private String remarks;
	
	private List<String> classOfVehicles;
	
	 private UserStatusEnum userStatus;
	 
	 private Boolean isCardDispatchUser;

	 private List<String> actionNames;
	 private PostOfficeVO postOffice;
	 private Boolean isParent;
	 
	 
	public Boolean getIsParent() {
		return isParent;
	}

	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}

	/**
	 * @return the isCardDispatchUser
	 */
	public Boolean getIsCardDispatchUser() {
		return isCardDispatchUser;
	}

	/**
	 * @param isCardDispatchUser the isCardDispatchUser to set
	 */
	public void setIsCardDispatchUser(Boolean isCardDispatchUser) {
		this.isCardDispatchUser = isCardDispatchUser;
	}

	/**
	 * @return the actionItems
	 */
	public List<ActionVO> getActionItems() {
		return actionItems;
	}

	/**
	 * @param actionItems the actionItems to set
	 */
	public void setActionItems(List<ActionVO> actionItems) {
		this.actionItems = actionItems;
	}

	/**
	 * @return the validFrom
	 */
	public LocalDate getValidFrom() {
		return validFrom;
	}

	/**
	 * @param validFrom the validFrom to set
	 */
	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}

	/**
	 * @return the validTo
	 */
	public LocalDate getValidTo() {
		return validTo;
	}

	/**
	 * @param validTo the validTo to set
	 */
	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}

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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the faxNo
	 */
	public String getFaxNo() {
		return faxNo;
	}

	/**
	 * @param faxNo the faxNo to set
	 */
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	/**
	 * @return the doorNo
	 */
	public String getDoorNo() {
		return doorNo;
	}

	/**
	 * @param doorNo the doorNo to set
	 */
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * @return the landmark
	 */
	public String getLandmark() {
		return landmark;
	}

	/**
	 * @param landmark the landmark to set
	 */
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	/**
	 * @return the signatureImageUrl
	 */
	public String getSignatureImageUrl() {
		return signatureImageUrl;
	}

	/**
	 * @param signatureImageUrl the signatureImageUrl to set
	 */
	public void setSignatureImageUrl(String signatureImageUrl) {
		this.signatureImageUrl = signatureImageUrl;
	}

	/**
	 * @return the profileImageUrl
	 */
	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	/**
	 * @param profileImageUrl the profileImageUrl to set
	 */
	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}

	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the empCode
	 */
	public String getEmpCode() {
		return empCode;
	}

	/**
	 * @param empCode the empCode to set
	 */
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * @return the office
	 */
	public OfficeVO getOffice() {
		return office;
	}

	/**
	 * @param office the office to set
	 */
	public void setOffice(OfficeVO office) {
		this.office = office;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the designation
	 */
	public DesignationVO getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(DesignationVO designation) {
		this.designation = designation;
	}

	/**
	 * @return the primaryRole
	 */
	public RolesVO getPrimaryRole() {
		return primaryRole;
	}

	/**
	 * @param primaryRole the primaryRole to set
	 */
	public void setPrimaryRole(RolesVO primaryRole) {
		this.primaryRole = primaryRole;
	}

	/**
	 * @return the additionalRoles
	 */
	public List<RolesVO> getAdditionalRoles() {
		return additionalRoles;
	}

	/**
	 * @param additionalRoles the additionalRoles to set
	 */
	public void setAdditionalRoles(List<RolesVO> additionalRoles) {
		this.additionalRoles = additionalRoles;
	}

	/**
	 * @return the state
	 */
	public StateVO getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(StateVO state) {
		this.state = state;
	}

	/**
	 * @return the district
	 */
	public DistrictVO getDistrict() {
		return district;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(DistrictVO district) {
		this.district = district;
	}

	/**
	 * @return the mandalDTO
	 */
	public MandalVO getMandalDTO() {
		return mandalDTO;
	}

	/**
	 * @param mandalDTO the mandalDTO to set
	 */
	public void setMandalDTO(MandalVO mandalDTO) {
		this.mandalDTO = mandalDTO;
	}

	/**
	 * @return the pincode
	 */
	public PostOfficeVO getPincode() {
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(PostOfficeVO pincode) {
		this.pincode = pincode;
	}

	/**
	 * @return the confirmpassword
	 */
	public String getConfirmpassword() {
		return confirmpassword;
	}

	/**
	 * @param confirmpassword the confirmpassword to set
	 */
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	/**
	 * @return the newpassword
	 */
	public String getNewpassword() {
		return newpassword;
	}

	/**
	 * @param newpassword the newpassword to set
	 */
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}

	/**
	 * @return the firstname
	 */

	/**
	 * @return the rid
	 */
	public Integer getRid() {
		return rid;
	}

	/**
	 * @param rid the rid to set
	 */
	public void setRid(Integer rid) {
		this.rid = rid;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the rocNo
	 */
	public String getRocNo() {
		return rocNo;
	}

	/**
	 * @param rocNo the rocNo to set
	 */
	public void setRocNo(String rocNo) {
		this.rocNo = rocNo;
	}

	/**
	 * @return the userAction
	 */

	/**
	 * @return the financierPanNo
	 */
	public String getFinancierPanNo() {
		return financierPanNo;
	}

	/**
	 * @param financierPanNo the financierPanNo to set
	 */
	public void setFinancierPanNo(String financierPanNo) {
		this.financierPanNo = financierPanNo;
	}

	/**
	 * @return the panNo
	 */
	public String getPanNo() {
		return panNo;
	}

	/**
	 * @param panNo the panNo to set
	 */
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	/**
	 * @return the representativeEmail
	 */

	/**
	 * @return the mandal
	 */
	public MandalVO getMandal() {
		return mandal;
	}

	/**
	 * @param mandal the mandal to set
	 */
	public void setMandal(MandalVO mandal) {
		this.mandal = mandal;
	}

	/**
	 * @return the officeContactNo
	 */

	/**
	 * @return the institutionName
	 */
	public String getInstitutionName() {
		return institutionName;
	}

	/**
	 * @param institutionName the institutionName to set
	 */
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	/**
	 * @return the registrationFirmDate
	 */
	public LocalDate getRegistrationFirmDate() {
		return registrationFirmDate;
	}

	/**
	 * @param registrationFirmDate the registrationFirmDate to set
	 */
	public void setRegistrationFirmDate(LocalDate registrationFirmDate) {
		this.registrationFirmDate = registrationFirmDate;
	}

	/**
	 * @return the userRelation
	 */
	public String getUserRelation() {
		return userRelation;
	}

	/**
	 * @param userRelation the userRelation to set
	 */
	public void setUserRelation(String userRelation) {
		this.userRelation = userRelation;
	}

	/**
	 * @return the companyType
	 */
	public String getCompanyType() {
		return companyType;
	}

	/**
	 * @param companyType the companyType to set
	 */
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	/**
	 * @return the representativeName
	 */
	public String getRepresentativeName() {
		return representativeName;
	}

	/**
	 * @param representativeName the representativeName to set
	 */
	public void setRepresentativeName(String representativeName) {
		this.representativeName = representativeName;
	}

	/**
	 * @return the representativeMobileNo
	 */
	public String getRepresentativeMobileNo() {
		return representativeMobileNo;
	}

	/**
	 * @param representativeMobileNo the representativeMobileNo to set
	 */
	public void setRepresentativeMobileNo(String representativeMobileNo) {
		this.representativeMobileNo = representativeMobileNo;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the officeMail
	 */
	public String getOfficeMail() {
		return officeMail;
	}

	/**
	 * @param officeMail the officeMail to set
	 */
	public void setOfficeMail(String officeMail) {
		this.officeMail = officeMail;
	}

	/**
	 * @return the officeContactNo
	 */
	public String getOfficeContactNo() {
		return officeContactNo;
	}

	/**
	 * @param officeContactNo the officeContactNo to set
	 */
	public void setOfficeContactNo(String officeContactNo) {
		this.officeContactNo = officeContactNo;
	}

	/**
	 * @return the representativeEmail
	 */
	public String getRepresentativeEmail() {
		return representativeEmail;
	}

	/**
	 * @param representativeEmail the representativeEmail to set
	 */
	public void setRepresentativeEmail(String representativeEmail) {
		this.representativeEmail = representativeEmail;
	}

	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	/**
	 * @return the mandalName
	 */
	public String getMandalName() {
		return mandalName;
	}

	/**
	 * @param mandalName the mandalName to set
	 */
	public void setMandalName(String mandalName) {
		this.mandalName = mandalName;
	}

	/**
	 * @return the districtName
	 */
	public String getDistrictName() {
		return districtName;
	}

	/**
	 * @param districtName the districtName to set
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	/**
	 * @return the appNo
	 */
	public String getAppNo() {
		return appNo;
	}

	/**
	 * @param appNo the appNo to set
	 */
	public void setAppNo(String appNo) {
		this.appNo = appNo;
	}

	/**
	 * @return the parentId
	 */
	public String getParentId() {
		return parentId;
	}

	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	/**
	 * @return the userAction
	 */
	public List<ActionsVO> getUserAction() {
		return userAction;
	}

	/**
	 * @param userAction the userAction to set
	 */
	public void setUserAction(List<ActionsVO> userAction) {
		this.userAction = userAction;
	}

	/**
	 * @return the regdNumber
	 */
	public String getRegdNumber() {
		return regdNumber;
	}

	/**
	 * @param regdNumber the regdNumber to set
	 */
	public void setRegdNumber(String regdNumber) {
		this.regdNumber = regdNumber;
	}

	/**
	 * @return the village
	 */
	public VillageVO getVillage() {
		return village;
	}

	/**
	 * @param village the village to set
	 */
	public void setVillage(VillageVO village) {
		this.village = village;
	}

	/**
	 * @return the websiteAddress
	 */
	public String getWebsiteAddress() {
		return websiteAddress;
	}

	/**
	 * @param websiteAddress the websiteAddress to set
	 */
	public void setWebsiteAddress(String websiteAddress) {
		this.websiteAddress = websiteAddress;
	}

	/**
	 * @return the userLevel
	 */
	public Integer getUserLevel() {
		return userLevel;
	}

	/**
	 * @param userLevel the userLevel to set
	 */
	public void setUserLevel(Integer userLevel) {
		this.userLevel = userLevel;
	}

	/**
	 * @return the startDate
	 */
	public LocalDate getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public LocalDate getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the isPwdChangeRequired
	 */
	public boolean isPwdChangeRequired() {
		return isPwdChangeRequired;
	}

	/**
	 * @param isPwdChangeRequired the isPwdChangeRequired to set
	 */
	public void setPwdChangeRequired(boolean isPwdChangeRequired) {
		this.isPwdChangeRequired = isPwdChangeRequired;
	}

	public String getUidToken() {
		return uidToken;
	}

	public void setUidToken(String uidToken) {
		this.uidToken = uidToken;
	}

	/**
	 * @return the userDesignation
	 */
	public String getUserDesignation() {
		return userDesignation;
	}

	/**
	 * @param userDesignation the userDesignation to set
	 */
	public void setUserDesignation(String userDesignation) {
		this.userDesignation = userDesignation;
	}

	/**
	 * @return the userDepartment
	 */
	public String getUserDepartment() {
		return userDepartment;
	}

	/**
	 * @param userDepartment the userDepartment to set
	 */
	public void setUserDepartment(String userDepartment) {
		this.userDepartment = userDepartment;
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

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public boolean isForUpdate() {
		return isForUpdate;
	}

	public void setForUpdate(boolean isForUpdate) {
		this.isForUpdate = isForUpdate;
	}

	public Boolean getIsAccountNonLocked() {
		return isAccountNonLocked;
	}

	public void setIsAccountNonLocked(Boolean isAccountNonLocked) {
		this.isAccountNonLocked = isAccountNonLocked;
	}

	public AadhaarDetailsRequestVO getAadhaarDetails() {
		return aadhaarDetails;
	}

	public void setAadhaarDetails(AadhaarDetailsRequestVO aadhaarDetails) {
		this.aadhaarDetails = aadhaarDetails;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the classOfVehicles
	 */
	public List<String> getClassOfVehicles() {
		return classOfVehicles;
	}

	/**
	 * @param classOfVehicles the classOfVehicles to set
	 */
	public void setClassOfVehicles(List<String> classOfVehicles) {
		this.classOfVehicles = classOfVehicles;
	}

	public UserStatusEnum getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(UserStatusEnum userStatus) {
		this.userStatus = userStatus;
	}

	public Boolean getFinancierStatus() {
		return financierStatus;
	}

	public void setFinancierStatus(Boolean financierStatus) {
		this.financierStatus = financierStatus;
	}

	public List<String> getActionNames() {
		return actionNames;
	}

	public void setActionNames(List<String> actionNames) {
		this.actionNames = actionNames;
	}

	public PostOfficeVO getPostOffice() {
		return postOffice;
	}

	public void setPostOffice(PostOfficeVO postOffice) {
		this.postOffice = postOffice;
	}

}