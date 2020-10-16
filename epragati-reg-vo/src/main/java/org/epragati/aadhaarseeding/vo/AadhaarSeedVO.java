package org.epragati.aadhaarseeding.vo;


/**
 * @author krishnarjun.pampana
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.aadhaar.AadhaarDetailsRequestVO;
import org.epragati.aadhaar.AadharDetailsResponseVO;
import org.epragati.constants.EnclosureType;
import org.epragati.constants.OwnerTypeEnum;
import org.epragati.master.vo.ActionDetailsVO;
import org.epragati.master.vo.RegistrationDetailsVO;
import org.epragati.service.enclosure.vo.ImageVO;
import org.epragati.util.Status;
import org.epragati.util.document.KeyValue;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AadhaarSeedVO {

	private String id;
	private String issuedOfficeCode;
	private Status.AadhaarSeedStatus status;
	private String statusDescription;
	private String prNo;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	private String mobileNo;
	private String email;
	private String aadharNo;
	private AadharDetailsResponseVO aadharResponse;
	private String aadharNoRTO;
	private AadharDetailsResponseVO aadharResponseRTO;
	private String aadharNoAO;
	private AadharDetailsResponseVO aadharResponseAO;
	private List<ActionDetailsVO> actionDetails;
	private ActionDetailsVO lockedDetails;
	private List<ActionDetailsVO> lockedDetailsLog;
	private List<KeyValue<EnclosureType, List<ImageVO>>> enclosures;
	private String matchCode;
	private String approvalStage;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDateTime createdDate;
	private String action = "aadhaarseed";
	private String comment;
	
	private RegistrationDetailsVO registrationDetailsVO;
	
	private OwnerTypeEnum ownerShipType;
	
	public AadhaarDetailsRequestVO aadhaarDetailsRequestVO;
	@JsonFormat(pattern = "dd-MM-yyyy")
	public  LocalDateTime AadharApprovedDate;
	
	public AadharDetailsResponseVO getAadharResponse() {
		return aadharResponse;
	}

	public void setAadharResponse(AadharDetailsResponseVO aadharResponse) {
		this.aadharResponse = aadharResponse;
	}
	
	public AadhaarDetailsRequestVO getAadhaarDetailsRequestVO() {
		return aadhaarDetailsRequestVO;
	}

	public void setAadhaarDetailsRequestVO(AadhaarDetailsRequestVO aadhaarDetailsRequestVO) {
		this.aadhaarDetailsRequestVO = aadhaarDetailsRequestVO;
	}

	/**
	 * @return the ownerShipType
	 */
	public OwnerTypeEnum getOwnerShipType() {
		return ownerShipType;
	}

	/**
	 * @param ownerShipType the ownerShipType to set
	 */
	public void setOwnerShipType(OwnerTypeEnum ownerShipType) {
		this.ownerShipType = ownerShipType;
	}

	List<AahaarSeedMatchVO> aahaarSeedMatchlist;


	public RegistrationDetailsVO getRegistrationDetailsVO() {
		return registrationDetailsVO;
	}

	public void setRegistrationDetailsVO(RegistrationDetailsVO registrationDetailsVO) {
		this.registrationDetailsVO = registrationDetailsVO;
	}

	public List<AahaarSeedMatchVO> getAahaarSeedMatchlist() {
		return aahaarSeedMatchlist;
	}

	public void setAahaarSeedMatchlist(List<AahaarSeedMatchVO> aahaarSeedMatchlist) {
		this.aahaarSeedMatchlist = aahaarSeedMatchlist;
	}

	/**
	 * 
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            to set id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @return the issuedOfficeCode
	 */
	public String getIssuedOfficeCode() {
		return issuedOfficeCode;
	}

	/**
	 * 
	 * @param issuedOfficeCode
	 *            to set issuedOfficeCode
	 */
	public void setIssuedOfficeCode(String issuedOfficeCode) {
		this.issuedOfficeCode = issuedOfficeCode;
	}

	
	/**
	 * @return the aadharNoAO
	 */
	public String getAadharNoAO() {
		return aadharNoAO;
	}

	/**
	 * @param aadharNoAO the aadharNoAO to set
	 */
	public void setAadharNoAO(String aadharNoAO) {
		this.aadharNoAO = aadharNoAO;
	}

	/**
	 * @return the aadharResponseAO
	 */
	public AadharDetailsResponseVO getAadharResponseAO() {
		return aadharResponseAO;
	}

	/**
	 * @param aadharResponseAO the aadharResponseAO to set
	 */
	public void setAadharResponseAO(AadharDetailsResponseVO aadharResponseAO) {
		this.aadharResponseAO = aadharResponseAO;
	}

	public String getPrNo() {
		return prNo;
	}

	/**
	 * @return the aadharNoRTO
	 */
	public String getAadharNoRTO() {
		return aadharNoRTO;
	}

	/**
	 * @param aadharNoRTO the aadharNoRTO to set
	 */
	public void setAadharNoRTO(String aadharNoRTO) {
		this.aadharNoRTO = aadharNoRTO;
	}

	/**
	 * @return the aadharResponseRTO
	 */
	public AadharDetailsResponseVO getAadharResponseRTO() {
		return aadharResponseRTO;
	}

	/**
	 * @param aadharResponseRTO the aadharResponseRTO to set
	 */
	public void setAadharResponseRTO(AadharDetailsResponseVO aadharResponseRTO) {
		this.aadharResponseRTO = aadharResponseRTO;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public LocalDate getDob() {
		return dob;
	}

	/**
	 * 
	 * @param dob
	 *            to set dob
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	/**
	 * 
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * 
	 * @param mobileNo
	 *            to set mobileNo
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param email
	 *            to set email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @return the aadharNo
	 */
	public String getAadharNo() {
		return aadharNo;
	}

	/**
	 * 
	 * @param aadharNo
	 *            to set aadharNo
	 */
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}


	public List<ActionDetailsVO> getActionDetails() {
		return actionDetails;
	}

	public void setActionDetails(List<ActionDetailsVO> actionDetails) {
		this.actionDetails = actionDetails;
	}

	public ActionDetailsVO getLockedDetails() {
		return lockedDetails;
	}

	public void setLockedDetails(ActionDetailsVO lockedDetails) {
		this.lockedDetails = lockedDetails;
	}

	public List<ActionDetailsVO> getLockedDetailsLog() {
		return lockedDetailsLog;
	}

	public void setLockedDetailsLog(List<ActionDetailsVO> lockedDetailsLog) {
		this.lockedDetailsLog = lockedDetailsLog;
	}

	public String getMatchCode() {
		return matchCode;
	}

	public void setMatchCode(String matchCode) {
		this.matchCode = matchCode;
	}

	public String getApprovalStage() {
		return approvalStage;
	}

	public void setApprovalStage(String approvalStage) {
		this.approvalStage = approvalStage;
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

	/**
	 * @return the createdDate
	 */
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	/**
	 * @return the status
	 */
	public Status.AadhaarSeedStatus getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Status.AadhaarSeedStatus status) {
		this.status = status;
	}

	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * @param action
	 *            the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	
	/**
	 * @return the statusDescription
	 */
	public String getStatusDescription() {
		return statusDescription;
	}

	/**
	 * @param statusDescription the statusDescription to set
	 */
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public LocalDateTime getAadharApprovedDate() {
		return AadharApprovedDate;
	}

	public void setAadharApprovedDate(LocalDateTime aadharApprovedDate) {
		AadharApprovedDate = aadharApprovedDate;
	}

	
}
