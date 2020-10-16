package org.epragati.rta.reports.vo;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Size;

import org.epragati.aadhaar.AadhaarDetailsRequestVO;
import org.epragati.constants.DisposalType;
import org.epragati.constants.EnclosureType;
import org.epragati.images.vo.ImageInput;
import org.epragati.master.vo.ApplicantDetailsVO;
import org.epragati.regservice.vo.ActionDetailVO;
import org.epragati.regservice.vo.RegServiceVO;
import org.epragati.service.enclosure.vo.ImageVO;
import org.epragati.util.StatusRegistration;
import org.epragati.util.custom.validation.Conditional;
import org.epragati.util.custom.validation.ValidatorConstants;
import org.epragati.util.document.KeyValue;
import org.epragati.util.payment.ModuleEnum;
import org.epragati.util.payment.ServiceEnum;
import org.epragati.vcr.vo.VcrFinalServiceVO;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author sai.naganaboyena
 *
 */
public class CitizenSearchReportVO {

	private String applicationNumber;

	private String applicantName;

	@Conditional(selected = "prNo",message = ValidatorConstants.INVALID_PRNO,values = {""})
	@Size(max = ValidatorConstants.PR_NO_SIZE,message=ValidatorConstants.INVALID_PRNO)
	private String prNo;

	@Conditional(selected = "trNo",message = ValidatorConstants.INVALID_TRNO,values = {""})
	@Size(max = ValidatorConstants.TR_NO_SIZE,message=ValidatorConstants.INVALID_TRNO)
	private String trNo;
	
	private StatusRegistration applicationStatus;

	private String fatherName;

	private List<ServiceEnum> serviceType;
	
	private ModuleEnum module;
	
	private String financierStatus;
	
	private String token;
	
	private String regApplicationNo;
	
	private boolean tokenCancelRequired;
	
	private ApplicantDetailsVO applicantDetailsVO;
	
	private String covDes;
	
	private List<ActionDetailVO> actionDetailsList;
	
	private List<KeyValue<EnclosureType,List<ImageVO>>> imageList;
	
	private boolean isFeedBackFormsubmited = Boolean.FALSE;
	
	private String transactionNumber;
	private boolean otherSateCOVTOIsdone;
	private boolean nocVerificationDone;
    private StatusRegistration otherStateNOCStatus;
    private boolean osPaymentStatus;
    private LocalDate reInspectionDate;
    private Boolean osSecondVechicleFoundRTO;
    private Boolean isPRNoRequiredosSVRejected ;
    private boolean isNeedToEnableSecondButton;
    private String secondButtonName;
    private List<VcrFinalServiceVO> vcrList;
    private Integer total;
	private DisposalType disposalType;
	private String type;
	//private boolean partialDisposal;
	//private boolean finalDisposal;
	private String orderNo;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate orderDate;
	private String courtName;
	private String caseNo;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate collectedDate;
	private Integer fineCollected;
	private String permitNo;
	private String proceedingNo;
	private String licenseNo;
	private String registrationNo;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate proceedingDate;
	private AadhaarDetailsRequestVO aadhaarDetailsRequestVO;
	private String selectedRole;
	private List<ImageInput> files;
	private boolean uploadTrCopy;
	private boolean isDemandNoticeverified = Boolean.FALSE;
	
	private RegServiceVO nonPermitVehicle;
	private RegServiceVO permitVehicle;
	
	public LocalDate getReInspectionDate() {
		return reInspectionDate;
	}

	public void setReInspectionDate(LocalDate reInspectionDate) {
		this.reInspectionDate = reInspectionDate;
	}

	public StatusRegistration getOtherStateNOCStatus() {
		return otherStateNOCStatus;
	}

	public void setOtherStateNOCStatus(StatusRegistration otherStateNOCStatus) {
		this.otherStateNOCStatus = otherStateNOCStatus;
	}
	
	/**
	 * @return the tokenCancelRequired
	 */
	public boolean getTokenCancelRequired() {
		return tokenCancelRequired;
	}

	/**
	 * @param tokenCancelRequired the tokenCancelRequired to set
	 */
	public void setTokenCancelRequired(Boolean tokenCancelRequired) {
		this.tokenCancelRequired = tokenCancelRequired;
	}

	/**
	 * @return the tokenNo
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param tokenNo the tokenNo to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	public String getFinancierStatus() {
		return financierStatus;
	}

	public void setFinancierStatus(String financierStatus) {
		this.financierStatus = financierStatus;
	}

	/**
	 * @return the applicationNumber
	 */
	public String getApplicationNumber() {
		return applicationNumber;
	}

	/**
	 * @param applicationNumber
	 *            the applicationNumber to set
	 */
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	/**
	 * @return the applicantName
	 */
	public String getApplicantName() {
		return applicantName;
	}

	/**
	 * @param applicantName
	 *            the applicantName to set
	 */
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo
	 *            the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the trNo
	 */
	public String getTrNo() {
		return trNo;
	}

	/**
	 * @param trNo
	 *            the trNo to set
	 */
	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	/**
	 * @return the applicationStatus
	 */
	public StatusRegistration getApplicationStatus() {
		return applicationStatus;
	}

	/**
	 * @param applicationStatus the applicationStatus to set
	 */
	public void setApplicationStatus(StatusRegistration applicationStatus) {
		this.applicationStatus = applicationStatus;
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
	 * @return the serviceType
	 */
	public List<ServiceEnum> getServiceType() {
		return serviceType;
	}

	/**
	 * @param serviceType the serviceType to set
	 */
	public void setServiceType(List<ServiceEnum> serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * @return the module
	 */
	public ModuleEnum getModule() {
		return module;
	}

	/**
	 * @param module the module to set
	 */
	public void setModule(ModuleEnum module) {
		this.module = module;
	}
	/**
	 * 
	 * @return
	 */
	public String getRegApplicationNo() {
		return regApplicationNo;
	}
	/**
	 * 
	 * @param regApplicationNo
	 */
	public void setRegApplicationNo(String regApplicationNo) {
		this.regApplicationNo = regApplicationNo;
	}

	public ApplicantDetailsVO getApplicantDetailsVO() {
		return applicantDetailsVO;
	}

	public void setApplicantDetailsVO(org.epragati.master.vo.ApplicantDetailsVO applicantDetailsVO2) {
		this.applicantDetailsVO = applicantDetailsVO2;
	}

	public String getCovDes() {
		return covDes;
	}

	public void setCovDes(String covDes) {
		this.covDes = covDes;
	}

	public List<ActionDetailVO> getActionDetailsList() {
		return actionDetailsList;
	}

	public void setActionDetailsList(List<ActionDetailVO> actionDetailsList) {
		this.actionDetailsList = actionDetailsList;
	}

	public boolean isFeedBackFormsubmited() {
		return isFeedBackFormsubmited;
	}

	public void setFeedBackFormsubmited(boolean isFeedBackFormsubmited) {
		this.isFeedBackFormsubmited = isFeedBackFormsubmited;
	}

	public List<KeyValue<EnclosureType, List<ImageVO>>> getImageList() {
		return imageList;
	}

	public void setImageList(List<org.epragati.util.document.KeyValue<EnclosureType,List<ImageVO>>> enclosuresInputList) {
		this.imageList = enclosuresInputList;
	}

	/**
	 * @return the transactionNumber
	 */
	public String getTransactionNumber() {
		return transactionNumber;
	}

	/**
	 * @param transactionNumber the transactionNumber to set
	 */
	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public boolean isOtherSateCOVTOIsdone() {
		return otherSateCOVTOIsdone;
	}

	public boolean isNocVerificationDone() {
		return nocVerificationDone;
	}

	public void setNocVerificationDone(boolean nocVerificationDone) {
		this.nocVerificationDone = nocVerificationDone;
	}

	public void setOtherSateCOVTOIsdone(boolean otherSateCOVTOIsdone) {
		this.otherSateCOVTOIsdone = otherSateCOVTOIsdone;
	}

	/**
	 * @return the osPaymentStatus
	 */
	public boolean isOsPaymentStatus() {
		return osPaymentStatus;
	}

	/**
	 * @param osPaymentStatus the osPaymentStatus to set
	 */
	public void setOsPaymentStatus(boolean osPaymentStatus) {
		this.osPaymentStatus = osPaymentStatus;
	}

	/**
	 * @return the osSecondVechicleFoundRTO
	 */
	public Boolean getOsSecondVechicleFoundRTO() {
		return osSecondVechicleFoundRTO;
	}

	/**
	 * @param osSecondVechicleFoundRTO the osSecondVechicleFoundRTO to set
	 */
	public void setOsSecondVechicleFoundRTO(Boolean osSecondVechicleFoundRTO) {
		this.osSecondVechicleFoundRTO = osSecondVechicleFoundRTO;
	}

	/**
	 * @return the isPRNoRequiredosSVRejected
	 */
	public Boolean getIsPRNoRequiredosSVRejected() {
		return isPRNoRequiredosSVRejected;
	}

	/**
	 * @param isPRNoRequiredosSVRejected the isPRNoRequiredosSVRejected to set
	 */
	public void setIsPRNoRequiredosSVRejected(Boolean isPRNoRequiredosSVRejected) {
		this.isPRNoRequiredosSVRejected = isPRNoRequiredosSVRejected;
	}

	public boolean isNeedToEnableSecondButton() {
		return isNeedToEnableSecondButton;
	}

	public void setNeedToEnableSecondButton(boolean isNeedToEnableSecondButton) {
		this.isNeedToEnableSecondButton = isNeedToEnableSecondButton;
	}

	public String getSecondButtonName() {
		return secondButtonName;
	}

	public void setSecondButtonName(String secondButtonName) {
		this.secondButtonName = secondButtonName;
	}

	public List<VcrFinalServiceVO> getVcrList() {
		return vcrList;
	}

	public void setVcrList(List<VcrFinalServiceVO> vcrList) {
		this.vcrList = vcrList;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public DisposalType getDisposalType() {
		return disposalType;
	}

	public void setDisposalType(DisposalType disposalType) {
		this.disposalType = disposalType;
	}


	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getCourtName() {
		return courtName;
	}

	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public LocalDate getCollectedDate() {
		return collectedDate;
	}

	public void setCollectedDate(LocalDate collectedDate) {
		this.collectedDate = collectedDate;
	}

	public Integer getFineCollected() {
		return fineCollected;
	}

	public void setFineCollected(Integer fineCollected) {
		this.fineCollected = fineCollected;
	}

	public String getPermitNo() {
		return permitNo;
	}

	public void setPermitNo(String permitNo) {
		this.permitNo = permitNo;
	}

	public String getProceedingNo() {
		return proceedingNo;
	}

	public void setProceedingNo(String proceedingNo) {
		this.proceedingNo = proceedingNo;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public LocalDate getProceedingDate() {
		return proceedingDate;
	}

	public void setProceedingDate(LocalDate proceedingDate) {
		this.proceedingDate = proceedingDate;
	}

	public void setTokenCancelRequired(boolean tokenCancelRequired) {
		this.tokenCancelRequired = tokenCancelRequired;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AadhaarDetailsRequestVO getAadhaarDetailsRequestVO() {
		return aadhaarDetailsRequestVO;
	}

	public void setAadhaarDetailsRequestVO(AadhaarDetailsRequestVO aadhaarDetailsRequestVO) {
		this.aadhaarDetailsRequestVO = aadhaarDetailsRequestVO;
	}

	public String getSelectedRole() {
		return selectedRole;
	}

	public void setSelectedRole(String selectedRole) {
		this.selectedRole = selectedRole;
	}

	public List<ImageInput> getFiles() {
		return files;
	}

	public void setFiles(List<ImageInput> files) {
		this.files = files;
	}

	public boolean isUploadTrCopy() {
		return uploadTrCopy;
	}

	public void setUploadTrCopy(boolean uploadTrCopy) {
		this.uploadTrCopy = uploadTrCopy;
	}

	public RegServiceVO getNonPermitVehicle() {
		return nonPermitVehicle;
	}

	public void setNonPermitVehicle(RegServiceVO nonPermitVehicle) {
		this.nonPermitVehicle = nonPermitVehicle;
	}

	public RegServiceVO getPermitVehicle() {
		return permitVehicle;
	}

	public void setPermitVehicle(RegServiceVO permitVehicle) {
		this.permitVehicle = permitVehicle;
	}

	/**
	 * @return the isDemandNoticeverified
	 */
	public boolean isDemandNoticeverified() {
		return isDemandNoticeverified;
	}

	/**
	 * @param isDemandNoticeverified the isDemandNoticeverified to set
	 */
	public void setDemandNoticeverified(boolean isDemandNoticeverified) {
		this.isDemandNoticeverified = isDemandNoticeverified;
	}
	
	
	
}
