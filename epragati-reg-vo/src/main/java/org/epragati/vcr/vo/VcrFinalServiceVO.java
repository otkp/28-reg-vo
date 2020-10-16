package org.epragati.vcr.vo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.constants.DisposalType;
import org.epragati.images.vo.ImageInput;
import org.epragati.master.vo.OfficeVO;
import org.epragati.payments.vo.ChalanaDetailsVO;
import org.epragati.regservice.vo.ActionDetailVO;
import org.epragati.regservice.vo.SpeedGunVO;
import org.epragati.rta.reports.vo.UserWiseEODCount;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class VcrFinalServiceVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private VcrVo vcr;
	private RegistrationVcrVo registration;
	private ValidityDetailsVo validityDetails;
	private OwnerDetailsVo ownerDetails;
	private DriverDetailsVcrVo driver;
	private VehicleProceedingVO vehicleProceeding;
	private OffenceVcrVO offence;
	private SeizedAndDocumentImpoundedVO seizedAndDocumentImpounded;
	private List<ImageInput> imageInput;
	private String issuedBy;
	private String mviOfficeCode;
	private List<OtherSectionVO> otherSections;

	private DisposalType disposalType;
	private boolean partialDisposal;
	private boolean finalDisposal;
	private String orderNo;
	private LocalDate orderDate;
	private String courtName;
	private String caseNo;
	private LocalDate collectedDate;
	private Integer fineCollected;
	private String permitNo;
	private String proceedingNo;
	private String licenseNo;
	private String registrationNo;
	private LocalDate proceedingDate;
	private Boolean partiallyClosed;
	private String pilledCov;
	private String pilledPermit;
	private String pilledRouteCode;
	private Integer pilledSeatings;
	private List<ActionDetailVO> actions;
	private String officeCode;
	private List<String> imagesUrls;
	private String username;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime paidDate;
	private String paidDateForReport;
	public String getPaidDateForReport() {
		return paidDateForReport;
	}

	public void setPaidDateForReport(String paidDateForReport) {
		this.paidDateForReport = paidDateForReport;
	}

	private Integer compoundFee;
	private String status;
	private Long serviceFee;
	private Double tax;
	private Long penalty;
	private Double taxArrears;
	private Long penaltyArrears;
	private List<IllicitPlaceDetailsVO> illicitPlaceDetails;
	private String pilledMeasurements;
	private String pilledGoods;
	private OfficeVO officeDetails;
	private Integer offencetotal;
	private String MviName;
	private Boolean cfxIssued;
	private boolean vehicleHaveAitp;
	private String paymentType;
	private List<String> challanNo;
	private boolean deleteVcrConfirmation;
	private Boolean paymentDone;
	private String vcrStatus;
	private List<UserWiseEODCount> mviCounts;
	private String errorMsg;
	private Boolean isRoadSafety;
	private Boolean isWebVcr;
	private String senderMobileNo;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate senderDate;
	private Integer pageNumber;
	private Integer totalPageSize;
	private boolean eVcrPrinted;
	private String qrImage;
	private SpeedGunVO speedGunVO;
	private Boolean isSpeedGun;
	private String imageId;
	private String officerId;
	private boolean speedGunVcrPrinted;
	private String speedGunImage;
	
	private List<ChalanaDetailsVO> chalanaDetailsVO;
	
	public boolean isSpeedGunVcrPrinted() {
		return speedGunVcrPrinted;
	}

	public void setSpeedGunVcrPrinted(boolean speedGunVcrPrinted) {
		this.speedGunVcrPrinted = speedGunVcrPrinted;
	}

	public String getSpeedGunImage() {
		return speedGunImage;
	}

	public void setSpeedGunImage(String speedGunImage) {
		this.speedGunImage = speedGunImage;
	}

	public SpeedGunVO getSpeedGunVO() {
		return speedGunVO;
	}

	public void setSpeedGunVO(SpeedGunVO speedGunVO) {
		this.speedGunVO = speedGunVO;
	}

	public Boolean getIsSpeedGun() {
		return isSpeedGun;
	}

	public void setIsSpeedGun(Boolean isSpeedGun) {
		this.isSpeedGun = isSpeedGun;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getOfficerId() {
		return officerId;
	}

	public void setOfficerId(String officerId) {
		this.officerId = officerId;
	}

	public String getQrImage() {
		return qrImage;
	}

	public void setQrImage(String qrImage) {
		this.qrImage = qrImage;
	}

	public boolean iseVcrPrinted() {
		return eVcrPrinted;
	}

	public void seteVcrPrinted(boolean eVcrPrinted) {
		this.eVcrPrinted = eVcrPrinted;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalPageSize() {
		return totalPageSize;
	}

	public void setTotalPageSize(Integer totalPageSize) {
		this.totalPageSize = totalPageSize;
	}

	public LocalDate getSenderDate() {
		return senderDate;
	}

	public void setSenderDate(LocalDate senderDate) {
		this.senderDate = senderDate;
	}

	public String getSenderMobileNo() {
		return senderMobileNo;
	}

	public void setSenderMobileNo(String senderMobileNo) {
		this.senderMobileNo = senderMobileNo;
	}

	public Boolean getIsWebVcr() {
		return isWebVcr;
	}

	public void setIsWebVcr(Boolean isWebVcr) {
		this.isWebVcr = isWebVcr;
	}

	
	public List<UserWiseEODCount> getMviCounts() {
		return mviCounts;
	}

	public void setMviCounts(List<UserWiseEODCount> mviCounts) {
		this.mviCounts = mviCounts;
	}

	public List<String> getChallanNo() {
		return challanNo;
	}

	public void setChallanNo(List<String> challanNo) {
		this.challanNo = challanNo;
	}

	private String recieptNo;
	private String tresuryName;
	private String tresuryAmount;
	private LocalDate challanDate;
	private Boolean saveDoc;
	private boolean isAnnualTax;
	private boolean consolidateUpdated;
	private String designation;
	private String createdBy;
	private String officeName;
	private Boolean vehicleSeized;
	private double total;
	private Double releaseOrderFee;
	private Double greenTax;

	private Double cess;
	private LocalDate taxValidityForTaxPaid;
	private LocalDate greentaxValidityForTaxPaid;
	private boolean shouldNotAllowForPayCash;
	private Boolean deductionMode;
	private Boolean voluntaryMode;
	private boolean uploadTrCopy;
	private String actionTaken;
	
	

	public Boolean getDeductionMode() {
		return deductionMode;
	}

	public void setDeductionMode(Boolean deductionMode) {
		this.deductionMode = deductionMode;
	}

	public Boolean getVoluntaryMode() {
		return voluntaryMode;
	}

	public void setVoluntaryMode(Boolean voluntaryMode) {
		this.voluntaryMode = voluntaryMode;
	}

	public Double getReleaseOrderFee() {
		return releaseOrderFee;
	}

	public void setReleaseOrderFee(Double releaseOrderFee) {
		this.releaseOrderFee = releaseOrderFee;
	}

	public Double getGreenTax() {
		return greenTax;
	}

	public void setGreenTax(Double greenTax) {
		this.greenTax = greenTax;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public boolean isConsolidateUpdated() {
		return consolidateUpdated;
	}

	public void setConsolidateUpdated(boolean consolidateUpdated) {
		this.consolidateUpdated = consolidateUpdated;
	}

	public String getTresuryName() {
		return tresuryName;
	}

	public void setTresuryName(String tresuryName) {
		this.tresuryName = tresuryName;
	}

	public String getTresuryAmount() {
		return tresuryAmount;
	}

	public void setTresuryAmount(String tresuryAmount) {
		this.tresuryAmount = tresuryAmount;
	}

	public LocalDate getChallanDate() {
		return challanDate;
	}

	public void setChallanDate(LocalDate challanDate) {
		this.challanDate = challanDate;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getRecieptNo() {
		return recieptNo;
	}

	public void setRecieptNo(String recieptNo) {
		this.recieptNo = recieptNo;
	}

	/**
	 * @return the compoundFee
	 */
	public Integer getCompoundFee() {
		return compoundFee;
	}

	/**
	 * @param compoundFee the compoundFee to set
	 */
	public void setCompoundFee(Integer compoundFee) {
		this.compoundFee = compoundFee;
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

	private boolean paymentIntiated;

	private Boolean isVcrClosed;

	public Boolean getIsVcrClosed() {
		return isVcrClosed;
	}

	public void setIsVcrClosed(Boolean isVcrClosed) {
		this.isVcrClosed = isVcrClosed;
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

	public VcrVo getVcr() {
		return vcr;
	}

	public void setVcr(VcrVo vcr) {
		this.vcr = vcr;
	}

	public RegistrationVcrVo getRegistration() {
		return registration;
	}

	public void setRegistration(RegistrationVcrVo registration) {
		this.registration = registration;
	}

	public OwnerDetailsVo getOwnerDetails() {
		return ownerDetails;
	}

	public void setOwnerDetails(OwnerDetailsVo ownerDetails) {
		this.ownerDetails = ownerDetails;
	}

	public DriverDetailsVcrVo getDriver() {
		return driver;
	}

	public void setDriver(DriverDetailsVcrVo driver) {
		this.driver = driver;
	}

	public VehicleProceedingVO getVehicleProceeding() {
		return vehicleProceeding;
	}

	public void setVehicleProceeding(VehicleProceedingVO vehicleProceeding) {
		this.vehicleProceeding = vehicleProceeding;
	}

	public OffenceVcrVO getOffence() {
		return offence;
	}

	public void setOffence(OffenceVcrVO offence) {
		this.offence = offence;
	}

	public SeizedAndDocumentImpoundedVO getSeizedAndDocumentImpounded() {
		return seizedAndDocumentImpounded;
	}

	public void setSeizedAndDocumentImpounded(SeizedAndDocumentImpoundedVO seizedAndDocumentImpounded) {
		this.seizedAndDocumentImpounded = seizedAndDocumentImpounded;
	}

	public List<ImageInput> getImageInput() {
		return imageInput;
	}

	public void setImageInput(List<ImageInput> imageInput) {
		this.imageInput = imageInput;
	}

	public ValidityDetailsVo getValidityDetailsVo() {
		return validityDetails;
	}

	public void setValidityDetailsVo(ValidityDetailsVo validityDetailsVo) {
		this.validityDetails = validityDetailsVo;
	}

	public ValidityDetailsVo getValidityDetails() {
		return validityDetails;
	}

	public void setValidityDetails(ValidityDetailsVo validityDetails) {
		this.validityDetails = validityDetails;
	}

	/**
	 * @return the issuedBy
	 */
	public String getIssuedBy() {
		return issuedBy;
	}

	/**
	 * @param issuedBy the issuedBy to set
	 */
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}

	public String getMviOfficeCode() {
		return mviOfficeCode;
	}

	public void setMviOfficeCode(String mviOfficeCode) {
		this.mviOfficeCode = mviOfficeCode;
	}

	public List<OtherSectionVO> getOtherSections() {
		return otherSections;
	}

	public void setOtherSections(List<OtherSectionVO> otherSections) {
		this.otherSections = otherSections;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DisposalType getDisposalType() {
		return disposalType;
	}

	public void setDisposalType(DisposalType disposalType) {
		this.disposalType = disposalType;
	}

	public boolean isPartialDisposal() {
		return partialDisposal;
	}

	public void setPartialDisposal(boolean partialDisposal) {
		this.partialDisposal = partialDisposal;
	}

	public boolean isFinalDisposal() {
		return finalDisposal;
	}

	public void setFinalDisposal(boolean finalDisposal) {
		this.finalDisposal = finalDisposal;
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

	public Boolean getPartiallyClosed() {
		return partiallyClosed;
	}

	public void setPartiallyClosed(Boolean partiallyClosed) {
		this.partiallyClosed = partiallyClosed;
	}

	public String getPilledCov() {
		return pilledCov;
	}

	public void setPilledCov(String pilledCov) {
		this.pilledCov = pilledCov;
	}

	public String getPilledPermit() {
		return pilledPermit;
	}

	public void setPilledPermit(String pilledPermit) {
		this.pilledPermit = pilledPermit;
	}

	public String getPilledRouteCode() {
		return pilledRouteCode;
	}

	public void setPilledRouteCode(String pilledRouteCode) {
		this.pilledRouteCode = pilledRouteCode;
	}

	public Integer getPilledSeatings() {
		return pilledSeatings;
	}

	public void setPilledSeatings(Integer pilledSeatings) {
		this.pilledSeatings = pilledSeatings;
	}

	public List<ActionDetailVO> getActions() {
		return actions;
	}

	public void setActions(List<ActionDetailVO> actions) {
		this.actions = actions;
	}

	public List<String> getImagesUrls() {
		return imagesUrls;
	}

	public void setImagesUrls(List<String> imagesUrls) {
		this.imagesUrls = imagesUrls;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDateTime getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(LocalDateTime paidDate) {
		this.paidDate = paidDate;
	}

	public boolean isPaymentIntiated() {
		return paymentIntiated;
	}

	public void setPaymentIntiated(boolean paymentIntiated) {
		this.paymentIntiated = paymentIntiated;
	}

	public Long getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(Long serviceFee) {
		this.serviceFee = serviceFee;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Long getPenalty() {
		return penalty;
	}

	public void setPenalty(Long penalty) {
		this.penalty = penalty;
	}

	public Double getTaxArrears() {
		return taxArrears;
	}

	public void setTaxArrears(Double taxArrears) {
		this.taxArrears = taxArrears;
	}

	public Long getPenaltyArrears() {
		return penaltyArrears;
	}

	public void setPenaltyArrears(Long penaltyArrears) {
		this.penaltyArrears = penaltyArrears;
	}

	public List<IllicitPlaceDetailsVO> getIllicitPlaceDetails() {
		return illicitPlaceDetails;
	}

	public void setIllicitPlaceDetails(List<IllicitPlaceDetailsVO> illicitPlaceDetails) {
		this.illicitPlaceDetails = illicitPlaceDetails;
	}

	public String getPilledMeasurements() {
		return pilledMeasurements;
	}

	public void setPilledMeasurements(String pilledMeasurements) {
		this.pilledMeasurements = pilledMeasurements;
	}

	public String getPilledGoods() {
		return pilledGoods;
	}

	public void setPilledGoods(String pilledGoods) {
		this.pilledGoods = pilledGoods;
	}

	public OfficeVO getOfficeDetails() {
		return officeDetails;
	}

	public void setOfficeDetails(OfficeVO officeDetails) {
		this.officeDetails = officeDetails;
	}

	public Integer getOffencetotal() {
		return offencetotal;
	}

	public void setOffencetotal(Integer offencetotal) {
		this.offencetotal = offencetotal;
	}

	public String getMviName() {
		return MviName;
	}

	public void setMviName(String mviName) {
		MviName = mviName;
	}

	public Boolean getCfxIssued() {
		return cfxIssued;
	}

	public void setCfxIssued(Boolean cfxIssued) {
		this.cfxIssued = cfxIssued;
	}

	public boolean isVehicleHaveAitp() {
		return vehicleHaveAitp;
	}

	public void setVehicleHaveAitp(boolean vehicleHaveAitp) {
		this.vehicleHaveAitp = vehicleHaveAitp;
	}

	public Boolean getSaveDoc() {
		return saveDoc;
	}

	public void setSaveDoc(Boolean saveDoc) {
		this.saveDoc = saveDoc;
	}

	public boolean isAnnualTax() {
		return isAnnualTax;
	}

	public void setAnnualTax(boolean isAnnualTax) {
		this.isAnnualTax = isAnnualTax;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public Boolean getVehicleSeized() {
		return vehicleSeized;
	}

	public void setVehicleSeized(Boolean vehicleSeized) {
		this.vehicleSeized = vehicleSeized;
	}

	public Double getCess() {
		return cess;
	}

	public void setCess(Double cess) {
		this.cess = cess;
	}

	public LocalDate getTaxValidityForTaxPaid() {
		return taxValidityForTaxPaid;
	}

	public void setTaxValidityForTaxPaid(LocalDate taxValidityForTaxPaid) {
		this.taxValidityForTaxPaid = taxValidityForTaxPaid;
	}

	public LocalDate getGreentaxValidityForTaxPaid() {
		return greentaxValidityForTaxPaid;
	}

	public void setGreentaxValidityForTaxPaid(LocalDate greentaxValidityForTaxPaid) {
		this.greentaxValidityForTaxPaid = greentaxValidityForTaxPaid;
	}

	public boolean isShouldNotAllowForPayCash() {
		return shouldNotAllowForPayCash;
	}

	public void setShouldNotAllowForPayCash(boolean shouldNotAllowForPayCash) {
		this.shouldNotAllowForPayCash = shouldNotAllowForPayCash;
	}

	public boolean isUploadTrCopy() {
		return uploadTrCopy;
	}

	public void setUploadTrCopy(boolean uploadTrCopy) {
		this.uploadTrCopy = uploadTrCopy;
	}

	public boolean isDeleteVcrConfirmation() {
		return deleteVcrConfirmation;
	}

	public void setDeleteVcrConfirmation(boolean deleteVcrConfirmation) {
		this.deleteVcrConfirmation = deleteVcrConfirmation;
	}

	public Boolean getPaymentDone() {
		return paymentDone;
	}

	public void setPaymentDone(Boolean paymentDone) {
		this.paymentDone = paymentDone;
	}

	public String getActionTaken() {
		return actionTaken;
	}

	public void setActionTaken(String actionTaken) {
		this.actionTaken = actionTaken;
	}

	public String getVcrStatus() {
		return vcrStatus;
	}

	public void setVcrStatus(String vcrStatus) {
		this.vcrStatus = vcrStatus;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Boolean getIsRoadSafety() {
		return isRoadSafety;
	}

	public void setIsRoadSafety(Boolean isRoadSafety) {
		this.isRoadSafety = isRoadSafety;
	}

	public List<ChalanaDetailsVO> getChalanaDetailsVO() {
		return chalanaDetailsVO;
	}

	public void setChalanaDetailsVO(List<ChalanaDetailsVO> chalanaDetailsVO) {
		this.chalanaDetailsVO = chalanaDetailsVO;
	}

	

}
