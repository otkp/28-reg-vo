
package org.epragati.master.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.aadhaar.AadharDetailsResponseVO;
import org.epragati.cfstVcr.vo.VcrBookingData;
import org.epragati.common.vo.BaseVO;
import org.epragati.constants.OwnerTypeEnum;
import org.epragati.flow.vo.FlowVO;
import org.epragati.payments.vo.FeeDetailsVO;
import org.epragati.permits.vo.PermitDetailsVO;
import org.epragati.regservice.vo.AlterationVO;
import org.epragati.regservice.vo.NOCDetailsVO;
import org.epragati.regservice.vo.PUCDetailsVO;
import org.epragati.regservice.vo.TheftVehicleDetailsVO;
import org.epragati.service.enclosure.vo.EnclosureRejectedVO;
import org.epragati.util.payment.ServiceEnum;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class CfstSyncRegstrationVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1363029773916646309L;

	private String applicationNo;

	private ApplicantDetailsVO applicantDetails;

	private String applicationStatus;

	// private String applicantNo;

	private VahanDetailsVO vahanDetails;

	private PanDetailsVO panDetails;

	private Boolean isFirstVehicle = true;

	/**
	 * @return the financeDetails
	 */
	public CfstFinanceDetailsVO getFinanceDetails() {
		return financeDetails;
	}

	/**
	 * @param financeDetails the financeDetails to set
	 */
	public void setFinanceDetails(CfstFinanceDetailsVO financeDetails) {
		this.financeDetails = financeDetails;
	}

	/**
	 * @return the registrationValidity
	 */
	public CfstRegistrationValidityVO getRegistrationValidity() {
		return registrationValidity;
	}

	/**
	 * @param registrationValidity the registrationValidity to set
	 */
	public void setRegistrationValidity(CfstRegistrationValidityVO registrationValidity) {
		this.registrationValidity = registrationValidity;
	}

	/**
	 * @return the fcDetailsVO
	 */
	public CfstFcDetailsVO getFcDetailsVO() {
		return fcDetailsVO;
	}

	/**
	 * @param fcDetailsVO the fcDetailsVO to set
	 */
	public void setFcDetailsVO(CfstFcDetailsVO fcDetailsVO) {
		this.fcDetailsVO = fcDetailsVO;
	}

	private CfstFinanceDetailsVO financeDetails;

	private InsuranceDetailsVO insuranceDetails;


	private Boolean insuranceType = false;

	private String trNo;

	private String financierToken;

	private String prNo;

	private Integer stageNo;

	private Integer iteration;

	private ActionDetailsVO actionDetails;

	// added extra fields

	private Boolean isTrailer = false;

	private String vehicleType;

	private OwnerTypeEnum ownerType;

	private String aadharNo;

	// private String chassisNumber;

	// private String engineNumber;

	private String classOfVehicle;
	private String classOfVehicleDesc;


	private String taxType;

	private String color;

	private List<ActionDetailsVO> actionDetailsList;

	private FlowVO flowDetails;

	private List<FlowVO> flowDetailsLog;

	// private String bodyType;

	// private String manufacturedMonthYear;

	private Integer seatingCapacity;

	private Integer rlw;

	private Integer ulw;

	private InvoiceDetailsVO invoiceDetails;

	private OfficeVO officeDetails;

	private String updatedTime;

	private AlterationVO alterationVO;

	private Boolean isPanRequired = false;

	private Boolean isSecondVehicleDisplayCheck;

	private RejectionHistoryVO rejectionHistory;

	private List<RejectionHistoryVO> rejectionHistoryLog;

	private boolean secondVehicleTaxPaid;

	private CfstRegistrationValidityVO registrationValidity;

	//private PermitDetailsVO permitDetails;

	private VehicleDetailsVO vehicleDetails;

	private UserVO dealerVO;

	private UserVO financierVO;

	private LocalDateTime taxDemandDate;

	private boolean isCentralGovernamentOrDefenceEmployee;
	private String lastName;

	private String approvalStage;

	private boolean isBodyBuilding;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate prIssueDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate prValidUpto;

	private String prIssuingAuthority;


	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate trIssueDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate trValidUpto;

	private String trIssuingAuthority;
	private boolean isRegVehicleWithPR=false;
	private boolean isRegVehicleWithTR=false;
	private boolean isTaxPaidByVcr=false;
	private List<Integer> toFinanceStatus;

	private PUCDetailsVO pucDetailsVO;

	private LocalDateTime prGeneratedDate;

	private boolean isFinance=false;

	private List<VcrBookingData> vcrDetails;

	private AadharDetailsResponseVO buyerAadhaarResponse;

	private List<PrBackUpDetailsVO> prBackUpDetailsList;

	private boolean isAllowForOtherServiceByDataEntry;

	private NOCDetailsVO nocDetails;

	private List<ServiceEnum> serviceType;

	private List<Integer> serviceIds;

	private TheftVehicleDetailsVO theftDetails;

	private String vehicleAge;

	private PermitDetailsVO permitVO;

	private String taxPaymentPeriod;
	private Double taxDemandAmount;
	private Long taxPenaltyAmount;
	private Double taxCollectedAmount;
	private LocalDate taxQuarterStartDate;
	private LocalDate taxValidUpto;


	/**
	 * @return the taxPaymentPeriod
	 */
	public String getTaxPaymentPeriod() {
		return taxPaymentPeriod;
	}

	/**
	 * @param taxPaymentPeriod the taxPaymentPeriod to set
	 */
	public void setTaxPaymentPeriod(String taxPaymentPeriod) {
		this.taxPaymentPeriod = taxPaymentPeriod;
	}



	/**
	 * @return the permitVO
	 */
	public PermitDetailsVO getPermitVO() {
		return permitVO;
	}

	/**
	 * @param permitVO the permitVO to set
	 */
	public void setPermitVO(PermitDetailsVO permitVO) {
		this.permitVO = permitVO;
	}

	public List<ServiceEnum> getServiceType() {
		return serviceType;
	}

	public void setServiceType(List<ServiceEnum> serviceType) {
		this.serviceType = serviceType;
	}

	public List<Integer> getServiceIds() {
		return serviceIds;
	}

	public void setServiceIds(List<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}

	public TheftVehicleDetailsVO getTheftDetails() {
		return theftDetails;
	}

	public void setTheftDetails(TheftVehicleDetailsVO theftDetails) {
		this.theftDetails = theftDetails;
	}

	public List<PrBackUpDetailsVO> getPrBackUpDetailsList() {
		return prBackUpDetailsList;
	}

	public void setPrBackUpDetailsList(List<PrBackUpDetailsVO> prBackUpDetailsList) {
		this.prBackUpDetailsList = prBackUpDetailsList;
	}

	public AadharDetailsResponseVO getBuyerAadhaarResponse() {
		return buyerAadhaarResponse;
	}

	public void setBuyerAadhaarResponse(AadharDetailsResponseVO buyerAadhaarResponse) {
		this.buyerAadhaarResponse = buyerAadhaarResponse;
	}

	public List<VcrBookingData> getVcrDetails() {
		return vcrDetails;
	}

	public void setVcrDetails(List<VcrBookingData> list) {
		this.vcrDetails = list;
	}

	public boolean isFinance() {
		return isFinance;
	}

	public void setFinance(boolean isFinance) {
		this.isFinance = isFinance;
	}

	public List<Integer> getToFinanceStatus() {
		return toFinanceStatus;
	}

	public void setToFinanceStatus(List<Integer> toFinanceStatus) {
		this.toFinanceStatus = toFinanceStatus;
	}

	public boolean isTaxPaidByVcr() {
		return isTaxPaidByVcr;
	}

	public void setTaxPaidByVcr(boolean isTaxPaidByVcr) {
		this.isTaxPaidByVcr = isTaxPaidByVcr;
	}

	public boolean isRegVehicleWithPR() {
		return isRegVehicleWithPR;
	}

	public void setRegVehicleWithPR(boolean isRegVehicleWithPR) {
		this.isRegVehicleWithPR = isRegVehicleWithPR;
	}

	public boolean isRegVehicleWithTR() {
		return isRegVehicleWithTR;
	}

	public void setRegVehicleWithTR(boolean isRegVehicleWithTR) {
		this.isRegVehicleWithTR = isRegVehicleWithTR;
	}

	public LocalDate getTrIssueDate() {
		return trIssueDate;
	}

	public void setTrIssueDate(LocalDate trIssueDate) {
		this.trIssueDate = trIssueDate;
	}

	public LocalDate getTrValidUpto() {
		return trValidUpto;
	}

	public void setTrValidUpto(LocalDate trValidUpto) {
		this.trValidUpto = trValidUpto;
	}

	public String getTrIssuingAuthority() {
		return trIssuingAuthority;
	}

	public void setTrIssuingAuthority(String trIssuingAuthority) {
		this.trIssuingAuthority = trIssuingAuthority;
	}

	public LocalDate getPrIssueDate() {
		return prIssueDate;
	}

	public void setPrIssueDate(LocalDate prIssueDate) {
		this.prIssueDate = prIssueDate;
	}

	public LocalDate getPrValidUpto() {
		return prValidUpto;
	}

	public void setPrValidUpto(LocalDate prValidUpto) {
		this.prValidUpto = prValidUpto;
	}

	public String getPrIssuingAuthority() {
		return prIssuingAuthority;
	}

	public void setPrIssuingAuthority(String prIssuingAuthority) {
		this.prIssuingAuthority = prIssuingAuthority;
	}

	public boolean isBodyBuilding() {
		return isBodyBuilding;
	}

	public void setBodyBuilding(boolean isBodyBuilding) {
		this.isBodyBuilding = isBodyBuilding;
	}

	public String getApprovalStage() {
		return approvalStage;
	}

	public void setApprovalStage(String approvalStage) {
		this.approvalStage = approvalStage;
	}

	public boolean isCentralGovernamentOrDefenceEmployee() {
		return isCentralGovernamentOrDefenceEmployee;
	}

	public void setCentralGovernamentOrDefenceEmployee(boolean isCentralGovernamentOrDefenceEmployee) {
		this.isCentralGovernamentOrDefenceEmployee = isCentralGovernamentOrDefenceEmployee;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDateTime getTaxDemandDate() {
		return taxDemandDate;
	}

	public void setTaxDemandDate(LocalDateTime taxDemandDate) {
		this.taxDemandDate = taxDemandDate;
	}

	public UserVO getDealerVO() {
		return dealerVO;
	}

	public void setDealerVO(UserVO dealerVO) {
		this.dealerVO = dealerVO;
	}

	public UserVO getFinancierVO() {
		return financierVO;
	}

	public void setFinancierVO(UserVO financierVO) {
		this.financierVO = financierVO;
	}

	/**
	 * @return the vehicleDetails
	 */
	public VehicleDetailsVO getVehicleDetails() {
		return vehicleDetails;
	}

	/**
	 * @param vehicleDetails the vehicleDetails to set
	 */
	public void setVehicleDetails(VehicleDetailsVO vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	/**
	 * @return the permitDetails
	 *//*
	public PermitDetailsVO getPermitDetails() {
		return permitDetails;
	}

	  *//**
	  * @param permitDetails the permitDetails to set
	  *//*
	public void setPermitDetails(PermitDetailsVO permitDetails) {
		this.permitDetails = permitDetails;
	}*/



	/**
	 * @return the secondVehicleTaxPaid
	 */
	public boolean isSecondVehicleTaxPaid() {
		return secondVehicleTaxPaid;
	}

	/**
	 * @param secondVehicleTaxPaid the secondVehicleTaxPaid to set
	 */
	public void setSecondVehicleTaxPaid(boolean secondVehicleTaxPaid) {
		this.secondVehicleTaxPaid = secondVehicleTaxPaid;
	}

	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	/**
	 * @return the specialNumberRequired
	 */
	public Boolean getSpecialNumberRequired() {
		return specialNumberRequired;
	}

	/**
	 * @param specialNumberRequired the specialNumberRequired to set
	 */
	public void setSpecialNumberRequired(Boolean specialNumberRequired) {
		this.specialNumberRequired = specialNumberRequired;
	}

	private DealerDetailsVO dealerDetails;

	private Long taxAmount;

	private FeeDetailsVO feeDetailsVO;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate taxvalidity;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate taxPaidDate;

	private Long cesFee;

	private LocalDate cesValidity;

	private Boolean specialNumberRequired = false;

	private Boolean isFinancier = false;

	private String dealerOfficeCode;

	List<EnclosureRejectedVO> imageDetailsList;

	private Boolean isAvailablePresentAddrsProof = false;

	private String presentAddrsProofBelongsTo;

	private String nameOfPresentAddrsProofBelongsTo;

	private CfstFcDetailsVO fcDetailsVO;

	private boolean isCardPrinted;

	private boolean isDuplicate;

	private boolean isTOWSlotRequried;

	/**
	 * @return the isTOWSlotRequried
	 */
	public boolean isTOWSlotRequried() {
		return isTOWSlotRequried;
	}

	/**
	 * @param isTOWSlotRequried the isTOWSlotRequried to set
	 */
	public void setTOWSlotRequried(boolean isTOWSlotRequried) {
		this.isTOWSlotRequried = isTOWSlotRequried;
	}

	/**
	 * @return the isFinancier
	 */
	public Boolean getIsFinancier() {
		return isFinancier;
	}

	/**
	 * @param isFinancier
	 *            the isFinancier to set
	 */
	public void setIsFinancier(Boolean isFinancier) {
		this.isFinancier = isFinancier;
	}

	/**
	 * @return the cesFee
	 */
	public Long getCesFee() {
		return cesFee;
	}

	/**
	 * @param cesFee
	 *            the cesFee to set
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
	 * @param cesValidity
	 *            the cesValidity to set
	 */
	public void setCesValidity(LocalDate cesValidity) {
		this.cesValidity = cesValidity;
	}

	/**
	 * @return the taxvalidity
	 */
	public LocalDate getTaxvalidity() {
		return taxvalidity;
	}

	/**
	 * @param taxvalidity
	 *            the taxvalidity to set
	 */
	public void setTaxvalidity(LocalDate taxvalidity) {
		this.taxvalidity = taxvalidity;
	}

	/**
	 * @return the taxAmount
	 */
	public Long getTaxAmount() {
		return taxAmount;
	}

	/**
	 * @param taxAmount
	 *            the taxAmount to set
	 */
	public void setTaxAmount(Long taxAmount) {
		this.taxAmount = taxAmount;
	}

	/**
	 * @return the isTrailer
	 */
	public Boolean getIsTrailer() {
		return isTrailer;
	}

	/**
	 * @param isTrailer
	 *            the isTrailer to set
	 */
	public void setIsTrailer(Boolean isTrailer) {
		this.isTrailer = isTrailer;
	}

	/**
	 * @return the vehicleType
	 */
	public String getVehicleType() {
		return vehicleType;
	}

	/**
	 * @param vehicleType
	 *            the vehicleType to set
	 */
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	/**
	 * @return the ownerType
	 */
	public OwnerTypeEnum getOwnerType() {
		return ownerType;
	}

	/**
	 * @param ownerType
	 *            the ownerType to set
	 */
	public void setOwnerType(OwnerTypeEnum ownerType) {
		this.ownerType = ownerType;
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
	 * @return the chassisNumber
	 */
	/*
	 * public String getChassisNumber() { return chassisNumber; }
	 */

	/**
	 * @param chassisNumber
	 *            the chassisNumber to set
	 */
	/*
	 * public void setChassisNumber(String chassisNumber) { this.chassisNumber =
	 * chassisNumber; }
	 */

	/**
	 * @return the engineNumber
	 */
	/*
	 * public String getEngineNumber() { return engineNumber; }
	 */

	/**
	 * @param engineNumber
	 *            the engineNumber to set
	 */
	/*
	 * public void setEngineNumber(String engineNumber) { this.engineNumber =
	 * engineNumber; }
	 */

	/**
	 * @return the classOfVehicle
	 */
	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	/**
	 * @param classOfVehicle
	 *            the classOfVehicle to set
	 */
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	/**
	 * @return the taxType
	 */
	public String getTaxType() {
		return taxType;
	}

	/**
	 * @param taxType
	 *            the taxType to set
	 */
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the bodyType
	 */
	/*
	 * public String getBodyType() { return bodyType; }
	 */

	/**
	 * @param bodyType
	 *            the bodyType to set
	 */
	/*
	 * public void setBodyType(String bodyType) { this.bodyType = bodyType; }
	 */

	/**
	 * @return the manufacturedMonthYear
	 */
	/*
	 * public String getManufacturedMonthYear() { return manufacturedMonthYear; }
	 */

	/**
	 * @param manufacturedMonthYear
	 *            the manufacturedMonthYear to set
	 */
	/*
	 * public void setManufacturedMonthYear(String manufacturedMonthYear) {
	 * this.manufacturedMonthYear = manufacturedMonthYear; }
	 */

	/**
	 * @return the seatingCapacity
	 */
	public Integer getSeatingCapacity() {
		return seatingCapacity;
	}

	/**
	 * @param seatingCapacity
	 *            the seatingCapacity to set
	 */
	public void setSeatingCapacity(Integer seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	/**
	 * @return the rlw
	 */
	public Integer getRlw() {
		return rlw;
	}

	/**
	 * @param rlw
	 *            the rlw to set
	 */
	public void setRlw(Integer rlw) {
		this.rlw = rlw;
	}

	/**
	 * @return the ulw
	 */
	public Integer getUlw() {
		return ulw;
	}

	/**
	 * @param ulw
	 *            the ulw to set
	 */
	public void setUlw(Integer ulw) {
		this.ulw = ulw;
	}

	public List<ActionDetailsVO> getActionDetailsList() {
		return actionDetailsList;
	}

	public void setActionDetailsList(List<ActionDetailsVO> actionDetailsList) {
		this.actionDetailsList = actionDetailsList;
	}

	public FlowVO getFlowDetails() {
		return flowDetails;
	}

	public void setFlowDetails(FlowVO flowDetails) {
		this.flowDetails = flowDetails;
	}

	/**
	 * @return the invoiceDetails
	 */
	public InvoiceDetailsVO getInvoiceDetails() {
		return invoiceDetails;
	}

	/**
	 * @param invoiceDetails
	 *            the invoiceDetails to set
	 */
	public void setInvoiceDetails(InvoiceDetailsVO invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}

	/**
	 * @return the officeDetails
	 */
	public OfficeVO getOfficeDetails() {
		return officeDetails;
	}

	/**
	 * @param officeDetails
	 *            the officeDetails to set
	 */
	public void setOfficeDetails(OfficeVO officeDetails) {
		this.officeDetails = officeDetails;
	}

	/**
	 * @return the dealerDetails
	 */
	public DealerDetailsVO getDealerDetails() {
		return dealerDetails;
	}

	/**
	 * @param dealerDetails
	 *            the dealerDetails to set
	 */
	public void setDealerDetails(DealerDetailsVO dealerDetails) {
		this.dealerDetails = dealerDetails;
	}

	public ApplicantDetailsVO getApplicantDetails() {
		return applicantDetails;
	}

	public void setApplicantDetails(ApplicantDetailsVO applicantDetails) {
		this.applicantDetails = applicantDetails;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public VahanDetailsVO getVahanDetails() {
		return vahanDetails;
	}

	public void setVahanDetails(VahanDetailsVO vahanDetails) {
		this.vahanDetails = vahanDetails;
	}

	public Boolean getIsFirstVehicle() {
		return isFirstVehicle;
	}

	public void setIsFirstVehicle(Boolean isFirstVehicle) {
		this.isFirstVehicle = isFirstVehicle;
	}



	public InsuranceDetailsVO getInsuranceDetails() {
		return insuranceDetails;
	}

	public void setInsuranceDetails(InsuranceDetailsVO insuranceDetails) {
		this.insuranceDetails = insuranceDetails;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public Integer getStageNo() {
		return stageNo;
	}

	public void setStageNo(Integer stageNo) {
		this.stageNo = stageNo;
	}

	public PanDetailsVO getPanDetails() {
		return panDetails;
	}

	public void setPanDetails(PanDetailsVO panDetails) {
		this.panDetails = panDetails;
	}

	public Integer getIteration() {
		return iteration;
	}

	public void setIteration(Integer iteration) {
		this.iteration = iteration;
	}

	public ActionDetailsVO getActionDetails() {
		return actionDetails;
	}

	public void setActionDetails(ActionDetailsVO actionDetails) {
		this.actionDetails = actionDetails;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getFinancierToken() {
		return financierToken;
	}

	public void setFinancierToken(String financierToken) {
		this.financierToken = financierToken;
	}

	public FeeDetailsVO getFeeDetailsVO() {
		return feeDetailsVO;
	}

	public void setFeeDetailsVO(FeeDetailsVO feeDetailsVO) {
		this.feeDetailsVO = feeDetailsVO;
	}


	/**
	 * @return the dealerOfficeCode
	 */
	public String getDealerOfficeCode() {
		return dealerOfficeCode;
	}

	/**
	 * @param dealerOfficeCode the dealerOfficeCode to set
	 */
	public void setDealerOfficeCode(String dealerOfficeCode) {
		this.dealerOfficeCode = dealerOfficeCode;
	}

	/**
	 * @return the imageDetailsList
	 */
	public List<EnclosureRejectedVO> getImageDetailsList() {
		return imageDetailsList;
	}

	/**
	 * @param imageDetailsList the imageDetailsList to set
	 */
	public void setImageDetailsList(List<EnclosureRejectedVO> imageDetailsList) {
		this.imageDetailsList = imageDetailsList;
	}

	/**
	 * @return the isAvailablePresentAddrsProof
	 */
	public Boolean getIsAvailablePresentAddrsProof() {
		return isAvailablePresentAddrsProof;
	}

	/**
	 * @param isAvailablePresentAddrsProof the isAvailablePresentAddrsProof to set
	 */
	public void setIsAvailablePresentAddrsProof(Boolean isAvailablePresentAddrsProof) {
		this.isAvailablePresentAddrsProof = isAvailablePresentAddrsProof;
	}

	/**
	 * @return the presentAddrsProofBelongsTo
	 */
	public String getPresentAddrsProofBelongsTo() {
		return presentAddrsProofBelongsTo;
	}

	/**
	 * @param presentAddrsProofBelongsTo the presentAddrsProofBelongsTo to set
	 */
	public void setPresentAddrsProofBelongsTo(String presentAddrsProofBelongsTo) {
		this.presentAddrsProofBelongsTo = presentAddrsProofBelongsTo;
	}

	/**
	 * @return the nameOfPresentAddrsProofBelongsTo
	 */
	public String getNameOfPresentAddrsProofBelongsTo() {
		return nameOfPresentAddrsProofBelongsTo;
	}

	/**
	 * @param nameOfPresentAddrsProofBelongsTo the nameOfPresentAddrsProofBelongsTo to set
	 */
	public void setNameOfPresentAddrsProofBelongsTo(String nameOfPresentAddrsProofBelongsTo) {
		this.nameOfPresentAddrsProofBelongsTo = nameOfPresentAddrsProofBelongsTo;
	}

	/**
	 * @return the flowDetailsLog
	 */
	public List<FlowVO> getFlowDetailsLog() {
		return flowDetailsLog;
	}

	/**
	 * @param flowDetailsLog the flowDetailsLog to set
	 */
	public void setFlowDetailsLog(List<FlowVO> flowDetailsLog) {
		this.flowDetailsLog = flowDetailsLog;
	}

	public Boolean getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(Boolean insuranceType) {
		this.insuranceType = insuranceType;
	}

	public Boolean getIsPanRequired() {
		return isPanRequired;
	}

	public void setIsPanRequired(Boolean isPanRequired) {
		this.isPanRequired = isPanRequired;
	}

	/**
	 * @return the classOfVehicleDesc
	 */
	public String getClassOfVehicleDesc() {
		return classOfVehicleDesc;
	}

	/**
	 * @param classOfVehicleDesc the classOfVehicleDesc to set
	 */
	public void setClassOfVehicleDesc(String classOfVehicleDesc) {
		this.classOfVehicleDesc = classOfVehicleDesc;
	}

	public Boolean getIsSecondVehicleDisplayCheck() {
		return isSecondVehicleDisplayCheck;
	}

	public void setIsSecondVehicleDisplayCheck(Boolean isSecondVehicleDisplayCheck) {
		this.isSecondVehicleDisplayCheck = isSecondVehicleDisplayCheck;
	}

	/**
	 * @return the rejectionHistory
	 */
	public RejectionHistoryVO getRejectionHistory() {
		return rejectionHistory;
	}

	/**
	 * @param rejectionHistory the rejectionHistory to set
	 */
	public void setRejectionHistory(RejectionHistoryVO rejectionHistory) {
		this.rejectionHistory = rejectionHistory;
	}

	/**
	 * @return the rejectionHistoryLog
	 */
	public List<RejectionHistoryVO> getRejectionHistoryLog() {
		return rejectionHistoryLog;
	}

	/**
	 * @param rejectionHistoryLog the rejectionHistoryLog to set
	 */
	public void setRejectionHistoryLog(List<RejectionHistoryVO> rejectionHistoryLog) {
		this.rejectionHistoryLog = rejectionHistoryLog;
	}



	public boolean isCardPrinted() {
		return isCardPrinted;
	}

	public void setCardPrinted(boolean isCardPrinted) {
		this.isCardPrinted = isCardPrinted;
	}

	/**
	 * @return the isDuplicate
	 */
	public boolean isDuplicate() {
		return isDuplicate;
	}

	/**
	 * @param isDuplicate the isDuplicate to set
	 */
	public void setDuplicate(boolean isDuplicate) {
		this.isDuplicate = isDuplicate;
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
	 * @return the pucDetailsVO
	 */
	public PUCDetailsVO getPucDetailsVO() {
		return pucDetailsVO;
	}

	/**
	 * @param pucDetailsVO the pucDetailsVO to set
	 */
	public void setPucDetailsVO(PUCDetailsVO pucDetailsVO) {
		this.pucDetailsVO = pucDetailsVO;
	}

	/**
	 * @return the prGeneratedDate
	 */
	public LocalDateTime getPrGeneratedDate() {
		return prGeneratedDate;
	}

	/**
	 * @param prGeneratedDate the prGeneratedDate to set
	 */
	public void setPrGeneratedDate(LocalDateTime prGeneratedDate) {
		this.prGeneratedDate = prGeneratedDate;
	}

	/**
	 * @return the isAllowForOtherServiceByDataEntry
	 */
	public boolean isAllowForOtherServiceByDataEntry() {
		return isAllowForOtherServiceByDataEntry;
	}

	/**
	 * @param isAllowForOtherServiceByDataEntry the isAllowForOtherServiceByDataEntry to set
	 */
	public void setAllowForOtherServiceByDataEntry(boolean isAllowForOtherServiceByDataEntry) {
		this.isAllowForOtherServiceByDataEntry = isAllowForOtherServiceByDataEntry;
	}

	public NOCDetailsVO getNocDetails() {
		return nocDetails;
	}

	public void setNocDetails(NOCDetailsVO nocDetails) {
		this.nocDetails = nocDetails;
	}


	/**
	 * @return the theftDetailsVO
	 *//*
	public TheftVehicleDetailsVO getTheftDetailsVO() {
		return theftDetailsVO;
	}

	  *//**
	  * @param theftDetailsVO the theftDetailsVO to set
	  *//*
	public void setTheftDetailsVO(TheftVehicleDetailsVO theftDetailsVO) {
		this.theftDetailsVO = theftDetailsVO;
	}*/

	public String getVehicleAge() {
		return vehicleAge;
	}

	public void setVehicleAge(String vehicleAge) {
		this.vehicleAge = vehicleAge;
	}

	/**
	 * @return the taxDemandAmount
	 */
	public Double getTaxDemandAmount() {
		return taxDemandAmount;
	}

	/**
	 * @param taxDemandAmount the taxDemandAmount to set
	 */
	public void setTaxDemandAmount(Double taxDemandAmount) {
		this.taxDemandAmount = taxDemandAmount;
	}

	/**
	 * @return the taxPenaltyAmount
	 */
	public Long getTaxPenaltyAmount() {
		return taxPenaltyAmount;
	}

	/**
	 * @param taxPenaltyAmount the taxPenaltyAmount to set
	 */
	public void setTaxPenaltyAmount(Long taxPenaltyAmount) {
		this.taxPenaltyAmount = taxPenaltyAmount;
	}

	/**
	 * @return the taxCollectedAmount
	 */
	public Double getTaxCollectedAmount() {
		return taxCollectedAmount;
	}

	/**
	 * @param taxCollectedAmount the taxCollectedAmount to set
	 */
	public void setTaxCollectedAmount(Double taxCollectedAmount) {
		this.taxCollectedAmount = taxCollectedAmount;
	}

	/**
	 * @return the taxQuarterStartDate
	 */
	public LocalDate getTaxQuarterStartDate() {
		return taxQuarterStartDate;
	}

	/**
	 * @param taxQuarterStartDate the taxQuarterStartDate to set
	 */
	public void setTaxQuarterStartDate(LocalDate taxQuarterStartDate) {
		this.taxQuarterStartDate = taxQuarterStartDate;
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


}
