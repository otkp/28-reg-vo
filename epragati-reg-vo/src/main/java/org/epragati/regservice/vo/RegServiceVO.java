
package org.epragati.regservice.vo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.epragati.aadhaar.AadharDetailsResponseVO;
import org.epragati.cfstVcr.vo.VcrDetailsVO;
import org.epragati.common.vo.BaseVO;
import org.epragati.constants.EnclosureType;
import org.epragati.constants.FcValidityTypesEnum;
import org.epragati.constants.TransferType;
import org.epragati.flow.vo.FlowVO;
import org.epragati.images.vo.ImageInput;
import org.epragati.master.vo.ActionDetailsVO;
import org.epragati.master.vo.ApplicantAddressVO;
import org.epragati.master.vo.ApplicantDetailsVO;
import org.epragati.master.vo.ContactVO;
import org.epragati.master.vo.FcDetailsVO;
import org.epragati.master.vo.FinanceDetailsVO;
import org.epragati.master.vo.InsuranceDetailsVO;
import org.epragati.master.vo.MasterFcQuestionVO;
import org.epragati.master.vo.MasterRcCancellationQuestionsVO;
import org.epragati.master.vo.MotorDrivingSchoolVO;
import org.epragati.master.vo.OfficeVO;
import org.epragati.master.vo.RegistrationDetailsVO;
import org.epragati.payment.report.vo.RCCancellationVO;
import org.epragati.payments.vo.BreakPaymentsSaveVO;
import org.epragati.payments.vo.FeeDetailsVO;
import org.epragati.permits.vo.OtherStateTemporaryPermitDetailsVO;
import org.epragati.permits.vo.PermitDetailsVO;
import org.epragati.service.enclosure.vo.ImageVO;
import org.epragati.tax.vo.TaxTypeEnum;
import org.epragati.util.StatusRegistration;
import org.epragati.util.custom.validation.Conditional;
import org.epragati.util.custom.validation.ValidatorConstants;
import org.epragati.util.document.KeyValue;
import org.epragati.util.payment.ServiceEnum;
import org.epragati.vcr.vo.VoluntaryTaxVO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@JsonInclude(Include.NON_NULL)
public class RegServiceVO extends BaseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String applicationNo;

	private AadharDetailsResponseVO aadhaarResponse;

	private Boolean isSameAsAadhaar;

	@Valid
	private ApplicantAddressVO presentAddress;

	private OfficeVO officeDetails;

	private FlowVO FlowDetails;

	private SlotDetailsVO slotDetails;

	private FeeDetailsVO feeDetails;

	private String officeCode;

	@Valid
	private TheftVehicleDetailsVO theftDetails;

	private String financierUserId;

	private String freshRcFinanceToken;

	/**
	 * basicRCdetails:
	 * 
	 */
	// services :[]
	private List<ServiceEnum> serviceType;
	private Set<Integer> serviceIds;

	@Valid
	private ApplicantDetailsVO basicApplicantDetails;

	private LocalDateTime createdDate;

	private StatusRegistration applicationStatus;

	private LockedDetailsVO lockedDetail;

	private ActionDetailsVO actionDetails;

	@Conditional(selected = "prNo", message = ValidatorConstants.INVALID_PRNO, values = {})
	@Size(max = ValidatorConstants.PR_NO_SIZE, message = ValidatorConstants.INVALID_PRNO)
	private String prNo;

	@Size(max = ValidatorConstants.AADHAR_SIZE, message = ValidatorConstants.IVALID_AADHAAR_NO)
	private String aadhaarNo;

	private List<ImageInput> imageInput;

	private List<KeyValue<EnclosureType, List<ImageVO>>> enclosures;

	private String status;

	@Conditional(selected = "trNo", message = ValidatorConstants.INVALID_TRNO, values = {})
	@Size(max = ValidatorConstants.TR_NO_SIZE)
	private String trNo;

	private String gatewayType;

	private BreakPaymentsSaveVO breakPaymentsVo;

	private AlterationVO alterationVO;
	@Valid
	private PermitDetailsVO permitDetailsVO;

	private List<PermitDetailsVO> permitDetailsListVO;

	private DuplicateDetailsVO duplicateDetailsVO;

	private RegistrationDetailsVO registrationDetails;

	@Valid
	private TowVO towDetails;

	private FcDetailsVO fcDetails;

	private NOCDetailsVO nOCDetails;

	private PUCDetailsVO pucDetails;

	private TaxDetailsVO taxDetails;

	private GreenTaxVO greenTaxDetails;

	private Long taxAmount;
	private LocalDate taxvalidity;
	private Long cesFee;
	private LocalDate cesValidity;
	private Long penalty;
	private String taxType;
	private Long greenTaxAmount;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate greenTaxvalidity;
	private Long taxArrears;
	private Long penaltyArrears;
	private TaxTypeEnum.TaxPayType payTaxType;
	private String permitCode;
	private Long quaterTaxForNewGo;

	private ApplicantDetailsVO applicantDetails;
	private Boolean isRequiredPayment;

	private boolean isSpecialNoRequired;
	private boolean isFinancerRequired;

	@Valid
	private InsuranceDetailsVO insuranceDetailsVo;

	private Integer toEnclouserStatus;

	private String paymentTransactionNo;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDateTime approvedDate;

	private String mviOfficeCode;

	private OfficeVO mviOfficeDetails;
	private OfficeVO oldMviOfficeDetails;
	private String previousPrNo;
	private boolean previousPrNoExist = Boolean.FALSE;

	private List<ActionDetailsVO> ActionDetailsVO;

	private FinanceDetailsVO financeDetails;

	private String token;

	private boolean isFinancierDoneByOnline;

	private ContactVO contactDetails;
	private String reasonForChangeOffice;
	private OfficeVO newOfficeDetails;

	private Boolean isFor2Years = Boolean.FALSE;
	private Boolean isFor1Years = Boolean.FALSE;
	private Boolean isFor6Months = Boolean.FALSE;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate reInspectionDate;
	private List<MasterFcQuestionVO> fcQstList;
	private String reasonForRejection;
	private Integer fcValidityValue = 0;
	private List<ImageInput> images;
	private Boolean fitnessOtherStation = Boolean.FALSE;
	private String authToken;
	private String userId;
	private boolean isToPayLatepenalityForFC;
	private boolean isPaidPyamentsForFC;
	private String selectedRole;
	private FcValidityTypesEnum fcType;

	private TransferType.permitTranfer sellerPermitStatus;

	private TransferType.permitTranfer coaPermitSameOfficeStatus;
	private Boolean taxExcemption = Boolean.FALSE;

	private boolean isPaidPyamentsForRenewal;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate osDateofentry;

	private Integer isContinueFinancier;

	private Integer financierType;

	private Boolean citizenPayAcceptance;

	private Boolean otherStateFianContinue = Boolean.FALSE;

	private Boolean isTSApplication = Boolean.FALSE;

	private BileteralTaxVO bileteralTaxDetails;

	private VcrDetailsVO vcrDetailsVO;
	private Boolean osSecondVechicleFoundRTO;
	private Boolean isPRNoRequiredosSVRejected;

	private String represnatativeAadhaar;
	private List<String> vcrNosList;

	private OtherStateTemporaryPermitDetailsVO otherStateTemporaryPermit;

	private RCCancellationVO rcCancellation;

	private LocalDate dateOfCompletion;
	private VoluntaryTaxVO voluntaryTaxDetails;
	private String fitnessforMVI;
	private FreshRcVO freshRc;
	private Boolean mobileUploadedFrc;
	private TransferType.permitTranfer coaRecommendationLetterSameOfficeStatus;

	private TransferType.permitTranfer sellerRecommendationLetterStatus;

	private boolean recommendationLetterbuyerStatus;

	private List<String> recommendationLetterStatesList;

	private MotorDrivingSchoolVO motorDrivingSchoolVO;

	private LocalDate lastTaxPaidUpTo;

	private Boolean isOtherState = Boolean.FALSE;
	private String dtcOfficeCode;

	private List<MasterRcCancellationQuestionsVO> rcQuesList;

	private boolean getOtherStateDataFromVahanService;

	private String permitVehiclePrNo;

	private String recordStatus;
	private Boolean deductionMode;
	private Boolean offLineFinancier = Boolean.FALSE;

	private LocalDateTime cancelledDate;

	private String cancelledIpAddress;

	private String cancelledBy;

	private String cancellationRemarks;

	private Double stoppageTax = 0d;
	private OtherVoluntaryTaxVO voluntaryTaxVO;
	private boolean allowFcImagesInApp;

	private String ps_encrypted_data;
	private String ps_iv;

	private String stageCarriageType;
	
	private String stageCarriageServiceType;

	private String remarks;
	
	private String reqSerAuthType;
	
	private Boolean isFcReupload;
	
	private Boolean specificVcrPayment=Boolean.FALSE;
	
	private String transactionType;
	
	

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getPs_encrypted_data() {
		return ps_encrypted_data;
	}

	public void setPs_encrypted_data(String ps_encrypted_data) {
		this.ps_encrypted_data = ps_encrypted_data;
	}

	public String getPs_iv() {
		return ps_iv;
	}

	public void setPs_iv(String ps_iv) {
		this.ps_iv = ps_iv;
	}

	public LocalDateTime getCancelledDate() {
		return cancelledDate;
	}

	public void setCancelledDate(LocalDateTime cancelledDate) {
		this.cancelledDate = cancelledDate;
	}

	public String getCancelledIpAddress() {
		return cancelledIpAddress;
	}

	public void setCancelledIpAddress(String cancelledIpAddress) {
		this.cancelledIpAddress = cancelledIpAddress;
	}

	public String getCancelledBy() {
		return cancelledBy;
	}

	public void setCancelledBy(String cancelledBy) {
		this.cancelledBy = cancelledBy;
	}

	public String getCancellationRemarks() {
		return cancellationRemarks;
	}

	public void setCancellationRemarks(String cancellationRemarks) {
		this.cancellationRemarks = cancellationRemarks;
	}

	public Boolean getOffLineFinancier() {
		return offLineFinancier;
	}

	public void setOffLineFinancier(Boolean offLineFinancier) {
		this.offLineFinancier = offLineFinancier;
	}

	/**
	 * @return the recordStatus
	 */
	public String getRecordStatus() {
		return recordStatus;
	}

	/**
	 * @param recordStatus the recordStatus to set
	 */
	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	/**
	 * @return the getOtherStateDataFromVahanService
	 */
	public boolean isGetOtherStateDataFromVahanService() {
		return getOtherStateDataFromVahanService;
	}

	/**
	 * @param getOtherStateDataFromVahanService the
	 *                                          getOtherStateDataFromVahanService to
	 *                                          set
	 */
	public void setGetOtherStateDataFromVahanService(boolean getOtherStateDataFromVahanService) {
		this.getOtherStateDataFromVahanService = getOtherStateDataFromVahanService;
	}

	public MotorDrivingSchoolVO getMotorDrivingSchoolVO() {
		return motorDrivingSchoolVO;
	}

	public void setMotorDrivingSchoolVO(MotorDrivingSchoolVO motorDrivingSchoolVO) {
		this.motorDrivingSchoolVO = motorDrivingSchoolVO;
	}

	/**
	 * @return the fitnessforMVI
	 */
	public String getFitnessforMVI() {
		return fitnessforMVI;
	}

	/**
	 * @param fitnessforMVI the fitnessforMVI to set
	 */
	public void setFitnessforMVI(String fitnessforMVI) {
		this.fitnessforMVI = fitnessforMVI;
	}

	public String getRepresnatativeAadhaar() {
		return represnatativeAadhaar;
	}

	public void setRepresnatativeAadhaar(String represnatativeAadhaar) {
		this.represnatativeAadhaar = represnatativeAadhaar;
	}

	public VcrDetailsVO getVcrDetailsVO() {
		return vcrDetailsVO;
	}

	public void setVcrDetailsVO(VcrDetailsVO vcrDetailsVO) {
		this.vcrDetailsVO = vcrDetailsVO;
	}

	public Boolean getIsTSApplication() {
		return isTSApplication;
	}

	public void setIsTSApplication(Boolean isTSApplication) {
		this.isTSApplication = isTSApplication;
	}

	public Boolean getOtherStateFianContinue() {
		return otherStateFianContinue;
	}

	public void setOtherStateFianContinue(Boolean otherStateFianContinue) {
		this.otherStateFianContinue = otherStateFianContinue;
	}

	private boolean mviDone;

	private boolean weightAlt;

	private Integer gvw;

	public Boolean getCitizenPayAcceptance() {
		return citizenPayAcceptance;
	}

	public void setCitizenPayAcceptance(Boolean citizenPayAcceptance) {
		this.citizenPayAcceptance = citizenPayAcceptance;
	}

	/**
	 * @return the coaPermitSameOfficeStatus
	 */
	public TransferType.permitTranfer getCoaPermitSameOfficeStatus() {
		return coaPermitSameOfficeStatus;
	}

	/**
	 * @param coaPermitSameOfficeStatus the coaPermitSameOfficeStatus to set
	 */
	public void setCoaPermitSameOfficeStatus(TransferType.permitTranfer coaPermitSameOfficeStatus) {
		this.coaPermitSameOfficeStatus = coaPermitSameOfficeStatus;
	}

	private boolean buyerPermitStatus;

	private VehicleStoppageDetailsVO vehicleStoppageDetailsVO;

	/**
	 * @return the buyerPermitStatus
	 */
	public boolean isBuyerPermitStatus() {
		return buyerPermitStatus;
	}

	/**
	 * @param buyerPermitStatus the buyerPermitStatus to set
	 */
	public void setBuyerPermitStatus(boolean buyerPermitStatus) {
		this.buyerPermitStatus = buyerPermitStatus;
	}

	/**
	 * @return the sellerPermitStatus
	 */
	public TransferType.permitTranfer getSellerPermitStatus() {
		return sellerPermitStatus;
	}

	/**
	 * @param sellerPermitStatus the sellerPermitStatus to set
	 */
	public void setSellerPermitStatus(TransferType.permitTranfer sellerPermitStatus) {
		this.sellerPermitStatus = sellerPermitStatus;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public Boolean getFitnessOtherStation() {
		return fitnessOtherStation;
	}

	public void setFitnessOtherStation(Boolean fitnessOtherStation) {
		this.fitnessOtherStation = fitnessOtherStation;
	}

	public List<ImageInput> getImages() {
		return images;
	}

	public void setImages(List<ImageInput> images) {
		this.images = images;
	}

	public Integer getFcValidityValue() {
		return fcValidityValue;
	}

	public void setFcValidityValue(Integer fcValidityValue) {
		this.fcValidityValue = fcValidityValue;
	}

	public String getReasonForRejection() {
		return reasonForRejection;
	}

	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}

	public List<MasterFcQuestionVO> getFcQstList() {
		return fcQstList;
	}

	public void setFcQstList(List<MasterFcQuestionVO> fcQstList) {
		this.fcQstList = fcQstList;
	}

	public LocalDate getReInspectionDate() {
		return reInspectionDate;
	}

	public void setReInspectionDate(LocalDate reInspectionDate) {
		this.reInspectionDate = reInspectionDate;
	}

	public Boolean getIsFor2Years() {
		return isFor2Years;
	}

	public void setIsFor2Years(Boolean isFor2Years) {
		this.isFor2Years = isFor2Years;
	}

	public Boolean getIsFor1Years() {
		return isFor1Years;
	}

	public void setIsFor1Years(Boolean isFor1Years) {
		this.isFor1Years = isFor1Years;
	}

	public Boolean getIsFor6Months() {
		return isFor6Months;
	}

	public void setIsFor6Months(Boolean isFor6Months) {
		this.isFor6Months = isFor6Months;
	}

	public OfficeVO getNewOfficeDetails() {
		return newOfficeDetails;
	}

	public void setNewOfficeDetails(OfficeVO newOfficeDetails) {
		this.newOfficeDetails = newOfficeDetails;
	}

	public String getReasonForChangeOffice() {
		return reasonForChangeOffice;
	}

	public void setReasonForChangeOffice(String reasonForChangeOffice) {
		this.reasonForChangeOffice = reasonForChangeOffice;
	}

	public boolean isFinancierDoneByOnline() {
		return isFinancierDoneByOnline;
	}

	public void setFinancierDoneByOnline(boolean isFinancierDoneByOnline) {
		this.isFinancierDoneByOnline = isFinancierDoneByOnline;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public FinanceDetailsVO getFinanceDetails() {
		return financeDetails;
	}

	public void setFinanceDetails(FinanceDetailsVO financeDetails) {
		this.financeDetails = financeDetails;
	}

	public String getPreviousPrNo() {
		return previousPrNo;
	}

	public void setPreviousPrNo(String previousPrNo) {
		this.previousPrNo = previousPrNo;
	}

	public boolean isPreviousPrNoExist() {
		return previousPrNoExist;
	}

	public void setPreviousPrNoExist(boolean previousPrNoExist) {
		this.previousPrNoExist = previousPrNoExist;
	}

	public Integer getToEnclouserStatus() {
		return toEnclouserStatus;
	}

	public void setToEnclouserStatus(Integer toEnclouserStatus) {
		this.toEnclouserStatus = toEnclouserStatus;
	}

	public boolean isSpecialNoRequired() {
		return isSpecialNoRequired;
	}

	public void setSpecialNoRequired(boolean isSpecialNoRequired) {
		this.isSpecialNoRequired = isSpecialNoRequired;
	}

	public void setIsSpecialNoRequired(boolean isSpecialNoRequired) {
		this.isSpecialNoRequired = isSpecialNoRequired;
	}

	public boolean isFinancerRequired() {
		return isFinancerRequired;
	}

	public void setFinancerRequired(boolean isFinancerRequired) {
		this.isFinancerRequired = isFinancerRequired;
	}

	private Integer iterationCount;

	private Integer currentIndex;

	public ApplicantDetailsVO getApplicantDetails() {
		return applicantDetails;
	}

	public void setApplicantDetails(ApplicantDetailsVO applicantDetails) {
		this.applicantDetails = applicantDetails;
	}

	public FcDetailsVO getFcDetails() {
		return fcDetails;
	}

	public void setFcDetails(FcDetailsVO fcDetails) {
		this.fcDetails = fcDetails;
	}

	public NOCDetailsVO getnOCDetails() {
		return nOCDetails;
	}

	public void setnOCDetails(NOCDetailsVO nOCDetails) {
		this.nOCDetails = nOCDetails;
	}

	public PUCDetailsVO getPucDetails() {
		return pucDetails;
	}

	public void setPucDetails(PUCDetailsVO pucDetails) {
		this.pucDetails = pucDetails;
	}

	public TaxDetailsVO getTaxDetails() {
		return taxDetails;
	}

	public void setTaxDetails(TaxDetailsVO taxDetails) {
		this.taxDetails = taxDetails;
	}

	public GreenTaxVO getGreenTaxDetails() {
		return greenTaxDetails;
	}

	public void setGreenTaxDetails(GreenTaxVO greenTaxDetails) {
		this.greenTaxDetails = greenTaxDetails;
	}

	/**
	 * @return the towDetails
	 */
	public TowVO getTowDetails() {
		return towDetails;
	}

	/**
	 * @param towDetails the towDetails to set
	 */
	public void setTowDetails(TowVO towDetails) {
		this.towDetails = towDetails;
	}

	public RegistrationDetailsVO getRegistrationDetails() {
		return registrationDetails;
	}

	public void setRegistrationDetails(RegistrationDetailsVO registrationDetails) {
		this.registrationDetails = registrationDetails;
	}

	/**
	 * @return the duplicateDetailsVO
	 */
	public DuplicateDetailsVO getDuplicateDetailsVO() {
		return duplicateDetailsVO;
	}

	/**
	 * @param duplicateDetailsVO the duplicateDetailsVO to set
	 */
	public void setDuplicateDetailsVO(DuplicateDetailsVO duplicateDetailsVO) {
		this.duplicateDetailsVO = duplicateDetailsVO;
	}

	/**
	 * @return the permitDetailsVO
	 */
	public PermitDetailsVO getPermitDetailsVO() {
		return permitDetailsVO;
	}

	/**
	 * @param permitDetailsVO the permitDetailsVO to set
	 */
	public void setPermitDetailsVO(PermitDetailsVO permitDetailsVO) {
		this.permitDetailsVO = permitDetailsVO;
	}

	/**
	 * @return the alterationVO
	 */
	public AlterationVO getAlterationVO() {
		return alterationVO;
	}

	/**
	 * @param alterationVO the alterationVO to set
	 */
	public void setAlterationVO(AlterationVO alterationVO) {
		this.alterationVO = alterationVO;
	}

	/**
	 * @return the breakPaymentsVo
	 */
	public BreakPaymentsSaveVO getBreakPaymentsVo() {
		return breakPaymentsVo;
	}

	/**
	 * @param breakPaymentsVo the breakPaymentsVo to set
	 */
	public void setBreakPaymentsVo(BreakPaymentsSaveVO breakPaymentsVo) {
		this.breakPaymentsVo = breakPaymentsVo;
	}

	/**
	 * @return the serviceIds
	 */
	public Set<Integer> getServiceIds() {
		return serviceIds;
	}

	/**
	 * @param serviceIds the serviceIds to set
	 */
	public void setServiceIds(Set<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}

	/**
	 * @return the gatewayType
	 */
	public String getGatewayType() {
		return gatewayType;
	}

	/**
	 * @param gatewayType the gatewayType to set
	 */
	public void setGatewayType(String gatewayType) {
		this.gatewayType = gatewayType;
	}

	/**
	 * @return the imageInput
	 */
	public List<ImageInput> getImageInput() {
		return imageInput;
	}

	/**
	 * @param imageInput the imageInput to set
	 */
	public void setImageInput(List<ImageInput> imageInput) {
		this.imageInput = imageInput;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the aadhaarNo
	 */
	public String getAadhaarNo() {
		return aadhaarNo;
	}

	/**
	 * @param aadhaarNo the aadhaarNo to set
	 */
	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
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
	 * @return the aadhaarResponse
	 */
	public AadharDetailsResponseVO getAadhaarResponse() {
		return aadhaarResponse;
	}

	/**
	 * @param aadhaarResponse the aadhaarResponse to set
	 */
	public void setAadhaarResponse(AadharDetailsResponseVO aadhaarResponse) {
		this.aadhaarResponse = aadhaarResponse;
	}

	/**
	 * @return the isSameAsAadhaar
	 */
	public Boolean getIsSameAsAadhaar() {
		return isSameAsAadhaar;
	}

	/**
	 * @param isSameAsAadhaar the isSameAsAadhaar to set
	 */
	public void setIsSameAsAadhaar(Boolean isSameAsAadhaar) {
		this.isSameAsAadhaar = isSameAsAadhaar;
	}

	/**
	 * @return the officeDetails
	 */
	public OfficeVO getOfficeDetails() {
		return officeDetails;
	}

	/**
	 * @param officeDetails the officeDetails to set
	 */
	public void setOfficeDetails(OfficeVO officeDetails) {
		this.officeDetails = officeDetails;
	}

	/**
	 * @return the flowDetails
	 */
	public FlowVO getFlowDetails() {
		return FlowDetails;
	}

	/**
	 * @param flowDetails the flowDetails to set
	 */
	public void setFlowDetails(FlowVO flowDetails) {
		FlowDetails = flowDetails;
	}

	/**
	 * @return the slotDetails
	 */
	public SlotDetailsVO getSlotDetails() {
		return slotDetails;
	}

	/**
	 * @param slotDetails the slotDetails to set
	 */
	public void setSlotDetails(SlotDetailsVO slotDetails) {
		this.slotDetails = slotDetails;
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
	 * @return the basicApplicantDetails
	 */
	public ApplicantDetailsVO getBasicApplicantDetails() {
		return basicApplicantDetails;
	}

	/**
	 * @param basicApplicantDetails the basicApplicantDetails to set
	 */
	public void setBasicApplicantDetails(ApplicantDetailsVO basicApplicantDetails) {
		this.basicApplicantDetails = basicApplicantDetails;
	}

	/**
	 * @return the createdDate
	 */
	@Override
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	@Override
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the applicationStatus
	 */

	/**
	 * @return the lockedDetail
	 */
	public LockedDetailsVO getLockedDetail() {
		return lockedDetail;
	}

	/**
	 * @param lockedDetail the lockedDetail to set
	 */
	public void setLockedDetail(LockedDetailsVO lockedDetail) {
		this.lockedDetail = lockedDetail;
	}

	/**
	 * @return the actionDetails
	 */
	public ActionDetailsVO getActionDetails() {
		return actionDetails;
	}

	/**
	 * @param actionDetails the actionDetails to set
	 */
	public void setActionDetails(ActionDetailsVO actionDetails) {
		this.actionDetails = actionDetails;
	}

	/**
	 * @return the enclosures
	 */
	public List<KeyValue<EnclosureType, List<ImageVO>>> getEnclosures() {
		return enclosures;
	}

	/**
	 * @param enclosures the enclosures to set
	 */
	public void setEnclosures(List<KeyValue<EnclosureType, List<ImageVO>>> enclosures) {
		this.enclosures = enclosures;
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
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}

	/**
	 * @param applicationNo the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	/**
	 * @return the status
	 */

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
	 * @return the taxAmount
	 */
	public Long getTaxAmount() {
		return taxAmount;
	}

	/**
	 * @param taxAmount the taxAmount to set
	 */
	public void setTaxAmount(Long taxAmount) {
		this.taxAmount = taxAmount;
	}

	/**
	 * @return the taxvalidity
	 */
	public LocalDate getTaxvalidity() {
		return taxvalidity;
	}

	/**
	 * @param taxvalidity the taxvalidity to set
	 */
	public void setTaxvalidity(LocalDate taxvalidity) {
		this.taxvalidity = taxvalidity;
	}

	/**
	 * @return the cesFee
	 */
	public Long getCesFee() {
		return cesFee;
	}

	/**
	 * @param cesFee the cesFee to set
	 */
	public void setCesFee(Long cesFee) {
		this.cesFee = cesFee;
	}

	/**
	 * @return the cesValidity
	 */
	public LocalDate getCesValidity() {
		return cesValidity;
	}

	/**
	 * @param cesValidity the cesValidity to set
	 */
	public void setCesValidity(LocalDate cesValidity) {
		this.cesValidity = cesValidity;
	}

	/**
	 * @return the penalty
	 */
	public Long getPenalty() {
		return penalty;
	}

	/**
	 * @param penalty the penalty to set
	 */
	public void setPenalty(Long penalty) {
		this.penalty = penalty;
	}

	/**
	 * @return the taxType
	 */
	public String getTaxType() {
		return taxType;
	}

	/**
	 * @param taxType the taxType to set
	 */
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	/**
	 * @return the greenTaxAmount
	 */
	public Long getGreenTaxAmount() {
		return greenTaxAmount;
	}

	/**
	 * @param greenTaxAmount the greenTaxAmount to set
	 */
	public void setGreenTaxAmount(Long greenTaxAmount) {
		this.greenTaxAmount = greenTaxAmount;
	}

	/**
	 * @return the greenTaxvalidity
	 */
	public LocalDate getGreenTaxvalidity() {
		return greenTaxvalidity;
	}

	/**
	 * @param greenTaxvalidity the greenTaxvalidity to set
	 */
	public void setGreenTaxvalidity(LocalDate greenTaxvalidity) {
		this.greenTaxvalidity = greenTaxvalidity;
	}

	/**
	 * @return the actionDetailsVO
	 */

	public List<ActionDetailsVO> getActionDetailsVO() {
		return ActionDetailsVO;
	}

	/**
	 * @param actionDetailsVO the actionDetailsVO to set
	 */
	public void setActionDetailsVO(List<ActionDetailsVO> actionDetailsVO) {
		ActionDetailsVO = actionDetailsVO;
	}

	/**
	 * @return the iterationCount
	 */
	public Integer getIterationCount() {
		return iterationCount;
	}

	/**
	 * @param iterationCount the iterationCount to set
	 */
	public void setIterationCount(Integer iterationCount) {
		this.iterationCount = iterationCount;
	}

	/**
	 * @return the currentIndex
	 */
	public Integer getCurrentIndex() {
		return currentIndex;
	}

	/**
	 * @param currentIndex the currentIndex to set
	 */
	public void setCurrentIndex(Integer currentIndex) {
		this.currentIndex = currentIndex;
	}

	/**
	 * @return the isRequiredPayment
	 */
	public Boolean getIsRequiredPayment() {
		return isRequiredPayment;
	}

	/**
	 * @param isRequiredPayment the isRequiredPayment to set
	 */
	public void setIsRequiredPayment(Boolean isRequiredPayment) {
		this.isRequiredPayment = isRequiredPayment;
	}

	/**
	 * @return the insuranceDetailsVo
	 */
	public InsuranceDetailsVO getInsuranceDetailsVo() {
		return insuranceDetailsVo;
	}

	/**
	 * @param insuranceDetailsVo the insuranceDetailsVo to set
	 */
	public void setInsuranceDetailsVo(InsuranceDetailsVO insuranceDetailsVo) {
		this.insuranceDetailsVo = insuranceDetailsVo;
	}

	/**
	 * @return the approvedDate
	 */
	public LocalDateTime getApprovedDate() {
		return approvedDate;
	}

	/**
	 * @param approvedDate the approvedDate to set
	 */
	public void setApprovedDate(LocalDateTime approvedDate) {
		this.approvedDate = approvedDate;
	}

	/**
	 * @return the mviOfficeCode
	 */
	public String getMviOfficeCode() {
		return mviOfficeCode;
	}

	/**
	 * @param mviOfficeCode the mviOfficeCode to set
	 */
	public void setMviOfficeCode(String mviOfficeCode) {
		this.mviOfficeCode = mviOfficeCode;
	}

	/**
	 * @return the mviOfficeDetails
	 */
	public OfficeVO getMviOfficeDetails() {
		return mviOfficeDetails;
	}

	/**
	 * @param mviOfficeDetails the mviOfficeDetails to set
	 */
	public void setMviOfficeDetails(OfficeVO mviOfficeDetails) {
		this.mviOfficeDetails = mviOfficeDetails;
	}

	/**
	 * @return the paymentTransactionNo
	 */
	public String getPaymentTransactionNo() {
		return paymentTransactionNo;
	}

	/**
	 * @param paymentTransactionNo the paymentTransactionNo to set
	 */
	public void setPaymentTransactionNo(String paymentTransactionNo) {
		this.paymentTransactionNo = paymentTransactionNo;
	}

	/**
	 * @return the theftDetails
	 */
	public TheftVehicleDetailsVO getTheftDetails() {
		return theftDetails;
	}

	/**
	 * @param theftDetails the theftDetails to set
	 */
	public void setTheftDetails(TheftVehicleDetailsVO theftDetails) {
		this.theftDetails = theftDetails;
	}

	/**
	 * @return the taxArrears
	 */
	public Long getTaxArrears() {
		return taxArrears;
	}

	/**
	 * @param taxArrears the taxArrears to set
	 */
	public void setTaxArrears(Long taxArrears) {
		this.taxArrears = taxArrears;
	}

	/**
	 * @return the penaltyArrears
	 */
	public Long getPenaltyArrears() {
		return penaltyArrears;
	}

	/**
	 * @param penaltyArrears the penaltyArrears to set
	 */
	public void setPenaltyArrears(Long penaltyArrears) {
		this.penaltyArrears = penaltyArrears;
	}

	/**
	 * @return the contactDetails
	 */
	public ContactVO getContactDetails() {
		return contactDetails;
	}

	/**
	 * @param contactDetails the contactDetails to set
	 */
	public void setContactDetails(ContactVO contactDetails) {
		this.contactDetails = contactDetails;
	}

	/**
	 * @return the isToPayLatepenalityForFC
	 */
	public boolean isToPayLatepenalityForFC() {
		return isToPayLatepenalityForFC;
	}

	/**
	 * @param isToPayLatepenalityForFC the isToPayLatepenalityForFC to set
	 */
	public void setToPayLatepenalityForFC(boolean isToPayLatepenalityForFC) {
		this.isToPayLatepenalityForFC = isToPayLatepenalityForFC;
	}

	/**
	 * @return the permitDetailsListVO
	 */
	public List<PermitDetailsVO> getPermitDetailsListVO() {
		return permitDetailsListVO;
	}

	/**
	 * @param permitDetailsListVO the permitDetailsListVO to set
	 */
	public void setPermitDetailsListVO(List<PermitDetailsVO> permitDetailsListVO) {
		this.permitDetailsListVO = permitDetailsListVO;
	}

	/**
	 * @return the isPaidPyamentsForFC
	 */
	public boolean isPaidPyamentsForFC() {
		return isPaidPyamentsForFC;
	}

	/**
	 * @param isPaidPyamentsForFC the isPaidPyamentsForFC to set
	 */
	public void setPaidPyamentsForFC(boolean isPaidPyamentsForFC) {
		this.isPaidPyamentsForFC = isPaidPyamentsForFC;
	}

	/**
	 * @return the selectedRole
	 */
	public String getSelectedRole() {
		return selectedRole;
	}

	/**
	 * @param selectedRole the selectedRole to set
	 */
	public void setSelectedRole(String selectedRole) {
		this.selectedRole = selectedRole;
	}

	/**
	 * @return the fcType
	 */
	public FcValidityTypesEnum getFcType() {
		return fcType;
	}

	/**
	 * @param fcType the fcType to set
	 */
	public void setFcType(FcValidityTypesEnum fcType) {
		this.fcType = fcType;
	}

	/**
	 * @return the payTaxType
	 */
	public TaxTypeEnum.TaxPayType getPayTaxType() {
		return payTaxType;
	}

	/**
	 * @param payTaxType the payTaxType to set
	 */
	public void setPayTaxType(TaxTypeEnum.TaxPayType payTaxType) {
		this.payTaxType = payTaxType;
	}

	/**
	 * @return the vehicleStoppageDetailsVO
	 */
	public VehicleStoppageDetailsVO getVehicleStoppageDetailsVO() {
		return vehicleStoppageDetailsVO;
	}

	/**
	 * @param vehicleStoppageDetailsVO the vehicleStoppageDetailsVO to set
	 */
	public void setVehicleStoppageDetailsVO(VehicleStoppageDetailsVO vehicleStoppageDetailsVO) {
		this.vehicleStoppageDetailsVO = vehicleStoppageDetailsVO;
	}

	/**
	 * @return the taxExcemption
	 */
	public Boolean getTaxExcemption() {
		return taxExcemption;
	}

	/**
	 * @param taxExcemption the taxExcemption to set
	 */
	public void setTaxExcemption(Boolean taxExcemption) {
		this.taxExcemption = taxExcemption;
	}

	/**
	 * @return the permitCode
	 */
	public String getPermitCode() {
		return permitCode;
	}

	/**
	 * @param permitCode the permitCode to set
	 */
	public void setPermitCode(String permitCode) {
		this.permitCode = permitCode;
	}

	/**
	 * @return the quaterTaxForNewGo
	 */
	public Long getQuaterTaxForNewGo() {
		return quaterTaxForNewGo;
	}

	/**
	 * @param quaterTaxForNewGo the quaterTaxForNewGo to set
	 */
	public void setQuaterTaxForNewGo(Long quaterTaxForNewGo) {
		this.quaterTaxForNewGo = quaterTaxForNewGo;
	}

	public boolean isPaidPyamentsForRenewal() {
		return isPaidPyamentsForRenewal;
	}

	public void setPaidPyamentsForRenewal(boolean isPaidPyamentsForRenewal) {
		this.isPaidPyamentsForRenewal = isPaidPyamentsForRenewal;
	}

	public String getFinancierUserId() {
		return financierUserId;
	}

	public void setFinancierUserId(String financierUserId) {
		this.financierUserId = financierUserId;
	}

	public String getFreshRcFinanceToken() {
		return freshRcFinanceToken;
	}

	public void setFreshRcFinanceToken(String freshRcFinanceToken) {
		this.freshRcFinanceToken = freshRcFinanceToken;
	}

	public LocalDate getOsDateofentry() {
		return osDateofentry;
	}

	public void setOsDateofentry(LocalDate osDateofentry) {
		this.osDateofentry = osDateofentry;
	}

	public Integer getIsContinueFinancier() {
		return isContinueFinancier;
	}

	public void setIsContinueFinancier(Integer isContinueFinancier) {
		this.isContinueFinancier = isContinueFinancier;
	}

	public Integer getFinancierType() {
		return financierType;
	}

	public void setFinancierType(Integer financierType) {
		this.financierType = financierType;
	}

	public boolean isMviDone() {
		return mviDone;
	}

	public void setMviDone(boolean mviDone) {
		this.mviDone = mviDone;
	}

	public boolean isWeightAlt() {
		return weightAlt;
	}

	public void setWeightAlt(boolean weightAlt) {
		this.weightAlt = weightAlt;
	}

	public Integer getGvw() {
		return gvw;
	}

	public void setGvw(Integer gvw) {
		this.gvw = gvw;
	}

	public BileteralTaxVO getBileteralTaxDetails() {
		return bileteralTaxDetails;
	}

	public void setBileteralTaxDetails(BileteralTaxVO bileteralTaxDetails) {
		this.bileteralTaxDetails = bileteralTaxDetails;
	}

	public OfficeVO getOldMviOfficeDetails() {
		return oldMviOfficeDetails;
	}

	public void setOldMviOfficeDetails(OfficeVO oldMviOfficeDetails) {
		this.oldMviOfficeDetails = oldMviOfficeDetails;
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

	public List<String> getVcrNosList() {
		return vcrNosList;
	}

	public void setVcrNosList(List<String> vcrNosList) {
		this.vcrNosList = vcrNosList;
	}

	/**
	 * @return the otherStateTemporaryPermit
	 */
	public OtherStateTemporaryPermitDetailsVO getOtherStateTemporaryPermit() {
		return otherStateTemporaryPermit;
	}

	/**
	 * @param otherStateTemporaryPermit the otherStateTemporaryPermit to set
	 */
	public void setOtherStateTemporaryPermit(OtherStateTemporaryPermitDetailsVO otherStateTemporaryPermit) {
		this.otherStateTemporaryPermit = otherStateTemporaryPermit;
	}

	public RCCancellationVO getRcCancellation() {
		return rcCancellation;
	}

	public void setRcCancellation(RCCancellationVO rcCancellation) {
		this.rcCancellation = rcCancellation;
	}

	public LocalDate getDateOfCompletion() {
		return dateOfCompletion;
	}

	public void setDateOfCompletion(LocalDate dateOfCompletion) {
		this.dateOfCompletion = dateOfCompletion;
	}

	public VoluntaryTaxVO getVoluntaryTaxDetails() {
		return voluntaryTaxDetails;
	}

	public void setVoluntaryTaxDetails(VoluntaryTaxVO voluntaryTaxDetails) {
		this.voluntaryTaxDetails = voluntaryTaxDetails;
	}

	/**
	 * @return the coaRecommendationLetterSameOfficeStatus
	 */
	public TransferType.permitTranfer getCoaRecommendationLetterSameOfficeStatus() {
		return coaRecommendationLetterSameOfficeStatus;
	}

	/**
	 * @param coaRecommendationLetterSameOfficeStatus the
	 *                                                coaRecommendationLetterSameOfficeStatus
	 *                                                to set
	 */
	public void setCoaRecommendationLetterSameOfficeStatus(
			TransferType.permitTranfer coaRecommendationLetterSameOfficeStatus) {
		this.coaRecommendationLetterSameOfficeStatus = coaRecommendationLetterSameOfficeStatus;
	}

	/**
	 * @return the sellerRecommendationLetterStatus
	 */
	public TransferType.permitTranfer getSellerRecommendationLetterStatus() {
		return sellerRecommendationLetterStatus;
	}

	/**
	 * @param sellerRecommendationLetterStatus the sellerRecommendationLetterStatus
	 *                                         to set
	 */
	public void setSellerRecommendationLetterStatus(TransferType.permitTranfer sellerRecommendationLetterStatus) {
		this.sellerRecommendationLetterStatus = sellerRecommendationLetterStatus;
	}

	/**
	 * @return the recommendationLetterbuyerStatus
	 */
	public boolean isRecommendationLetterbuyerStatus() {
		return recommendationLetterbuyerStatus;
	}

	/**
	 * @param recommendationLetterbuyerStatus the recommendationLetterbuyerStatus to
	 *                                        set
	 */
	public void setRecommendationLetterbuyerStatus(boolean recommendationLetterbuyerStatus) {
		this.recommendationLetterbuyerStatus = recommendationLetterbuyerStatus;
	}

	/**
	 * @return the recommendationLetterStatesList
	 */
	public List<String> getRecommendationLetterStatesList() {
		return recommendationLetterStatesList;
	}

	/**
	 * @param recommendationLetterStatesList the recommendationLetterStatesList to
	 *                                       set
	 */
	public void setRecommendationLetterStatesList(List<String> recommendationLetterStatesList) {
		this.recommendationLetterStatesList = recommendationLetterStatesList;
	}

	public FreshRcVO getFreshRc() {
		return freshRc;
	}

	public void setFreshRc(FreshRcVO freshRc) {
		this.freshRc = freshRc;
	}

	public Boolean getMobileUploadedFrc() {
		return mobileUploadedFrc;
	}

	public void setMobileUploadedFrc(Boolean mobileUploadedFrc) {
		this.mobileUploadedFrc = mobileUploadedFrc;
	}

	public LocalDate getLastTaxPaidUpTo() {
		return lastTaxPaidUpTo;
	}

	public void setLastTaxPaidUpTo(LocalDate lastTaxPaidUpTo) {
		this.lastTaxPaidUpTo = lastTaxPaidUpTo;
	}

	public List<MasterRcCancellationQuestionsVO> getRcQuesList() {
		return rcQuesList;
	}

	public void setRcQuesList(List<MasterRcCancellationQuestionsVO> rcQuesList) {
		this.rcQuesList = rcQuesList;
	}

	public Boolean getIsOtherState() {
		return isOtherState;
	}

	public void setIsOtherState(Boolean isOtherState) {
		this.isOtherState = isOtherState;
	}

	public String getDtcOfficeCode() {
		return dtcOfficeCode;
	}

	public void setDtcOfficeCode(String dtcOfficeCode) {
		this.dtcOfficeCode = dtcOfficeCode;
	}

	public String getPermitVehiclePrNo() {
		return permitVehiclePrNo;
	}

	public void setPermitVehiclePrNo(String permitVehiclePrNo) {
		this.permitVehiclePrNo = permitVehiclePrNo;
	}

	public Boolean getDeductionMode() {
		return deductionMode;
	}

	public void setDeductionMode(Boolean deductionMode) {
		this.deductionMode = deductionMode;
	}

	public Double getStoppageTax() {
		return stoppageTax;
	}

	public void setStoppageTax(Double stoppageTax) {
		this.stoppageTax = stoppageTax;
	}

	public OtherVoluntaryTaxVO getVoluntaryTaxVO() {
		return voluntaryTaxVO;
	}

	public void setVoluntaryTaxVO(OtherVoluntaryTaxVO voluntaryTaxVO) {
		this.voluntaryTaxVO = voluntaryTaxVO;
	}

	public boolean isAllowFcImagesInApp() {
		return allowFcImagesInApp;
	}

	public void setAllowFcImagesInApp(boolean allowFcImagesInApp) {
		this.allowFcImagesInApp = allowFcImagesInApp;
	}

	/**
	 * @return the stageCarriageType
	 */
	public String getStageCarriageType() {
		return stageCarriageType;
	}

	/**
	 * @param stageCarriageType the stageCarriageType to set
	 */
	public void setStageCarriageType(String stageCarriageType) {
		this.stageCarriageType = stageCarriageType;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the stageCarriageServiceType
	 */
	public String getStageCarriageServiceType() {
		return stageCarriageServiceType;
	}

	/**
	 * @param stageCarriageServiceType the stageCarriageServiceType to set
	 */
	public void setStageCarriageServiceType(String stageCarriageServiceType) {
		this.stageCarriageServiceType = stageCarriageServiceType;
	}

	public Boolean getIsFcReupload() {
		return isFcReupload;
	}

	public void setIsFcReupload(Boolean isFcReupload) {
		this.isFcReupload = isFcReupload;
	}

	public String getReqSerAuthType() {
		return reqSerAuthType;
	}

	public void setReqSerAuthType(String reqSerAuthType) {
		this.reqSerAuthType = reqSerAuthType;
	}

	public Boolean getSpecificVcrPayment() {
		return specificVcrPayment;
	}

	public void setSpecificVcrPayment(Boolean specificVcrPayment) {
		this.specificVcrPayment = specificVcrPayment;
	}
	
	
}
