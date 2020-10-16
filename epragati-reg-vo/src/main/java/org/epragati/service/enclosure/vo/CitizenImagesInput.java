package org.epragati.service.enclosure.vo;

import java.util.Set;

import javax.validation.constraints.Size;

import org.epragati.constants.DuplicateReasonEnum;
import org.epragati.constants.OwnerType;
import org.epragati.constants.OwnerTypeEnum;
import org.epragati.constants.TransferType;
import org.epragati.util.ApplicantTypeEnum;
import org.epragati.util.custom.validation.ValidatorConstants;
import org.epragati.util.payment.ServiceEnum;

public class CitizenImagesInput {
	
	@Size(max=ValidatorConstants.PR_NO_SIZE,message=ValidatorConstants.INVALID_PRNO)
	private String prNo;
	private Set<Integer> serviceIds;
	private Boolean isSameAsAadhar=false;
	private OwnerType ownerType;
	private TransferType transferType;
	private ServiceEnum serviceName;
	private String applicationNo;
	private Boolean isRegisteredVehicle;
	private OwnerTypeEnum regOwnerType;
	private Boolean isDifferentlyAbled;
	private String alterationService;
	private Integer toEnclouserStatus;
	private DuplicateReasonEnum duplicateReasonEnum;
	private Integer toAuctionDeathId;
	private Boolean isFinacerDoneByOnline=Boolean.TRUE;
	private Boolean fitnessOtherStation = Boolean.FALSE;
	private boolean isCompanyVehicle;
	private Boolean isMobileRequest = Boolean.FALSE;
	private Boolean isFinanceContinue = Boolean.FALSE;
	
	private Boolean isVcrEncRequired= Boolean.FALSE;

	private ApplicantTypeEnum applicantType;
	
	private String caste;
	
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public Boolean getIsFinacerDoneByOnline() {
		return isFinacerDoneByOnline;
	}
	public void setIsFinacerDoneByOnline(Boolean isFinacerDoneByOnline) {
		this.isFinacerDoneByOnline = isFinacerDoneByOnline;
	}
	/**
	 * @return the toAuctionDeathId
	 */
	public Integer getToAuctionDeathId() {
		return toAuctionDeathId;
	}
	/**
	 * @param toAuctionDeathId the toAuctionDeathId to set
	 */
	public void setToAuctionDeathId(Integer toAuctionDeathId) {
		this.toAuctionDeathId = toAuctionDeathId;
	}
	public Integer getToEnclouserStatus() {
		return toEnclouserStatus;
	}
	public void setToEnclouserStatus(Integer toEnclouserStatus) {
		this.toEnclouserStatus = toEnclouserStatus;
	}
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	public Set<Integer> getServiceIds() {
		return serviceIds;
	}
	public void setServiceIds(Set<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}
	
	public OwnerType getOwnerType() {
		return ownerType;
	}
	public void setOwnerType(OwnerType ownerType) {
		this.ownerType = ownerType;
	}
	public TransferType getTransferType() {
		return transferType;
	}
	public void setTransferType(TransferType transferType) {
		this.transferType = transferType;
	}
	public ServiceEnum getServiceName() {
		return serviceName;
	}
	public void setServiceName(ServiceEnum serviceName) {
		this.serviceName = serviceName;
	}
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public Boolean getIsRegisteredVehicle() {
		return isRegisteredVehicle;
	}
	public void setIsRegisteredVehicle(Boolean isRegisteredVehicle) {
		this.isRegisteredVehicle = isRegisteredVehicle;
	}
	public OwnerTypeEnum getRegOwnerType() {
		return regOwnerType;
	}
	public void setRegOwnerType(OwnerTypeEnum regOwnerType) {
		this.regOwnerType = regOwnerType;
	}
	public Boolean getIsDifferentlyAbled() {
		return isDifferentlyAbled;
	}
	public void setIsDifferentlyAbled(Boolean isDifferentlyAbled) {
		this.isDifferentlyAbled = isDifferentlyAbled;
	}
	/**
	 * @return the alterationService
	 */
	public String getAlterationService() {
		return alterationService;
	}
	/**
	 * @param alterationService the alterationService to set
	 */
	public void setAlterationService(String alterationService) {
		this.alterationService = alterationService;
	}
	/**
	 * @return the duplicateReasonEnum
	 */
	public DuplicateReasonEnum getDuplicateReasonEnum() {
		return duplicateReasonEnum;
	}
	/**
	 * @param duplicateReasonEnum the duplicateReasonEnum to set
	 */
	public void setDuplicateReasonEnum(DuplicateReasonEnum duplicateReasonEnum) {
		this.duplicateReasonEnum = duplicateReasonEnum;
	}
	/**
	 * @return the isSameAsAadhar
	 */
	public Boolean getIsSameAsAadhar() {
		return isSameAsAadhar;
	}
	/**
	 * @param isSameAsAadhar the isSameAsAadhar to set
	 */
	public void setIsSameAsAadhar(Boolean isSameAsAadhar) {
		this.isSameAsAadhar = isSameAsAadhar;
	}
	/**
	 * @return the fitnessOtherStation
	 */
	public Boolean getFitnessOtherStation() {
		return fitnessOtherStation;
	}
	/**
	 * @param fitnessOtherStation the fitnessOtherStation to set
	 */
	public void setFitnessOtherStation(Boolean fitnessOtherStation) {
		this.fitnessOtherStation = fitnessOtherStation;
	}
	/**
	 * @return the isCompanyVehicle
	 */
	public boolean isCompanyVehicle() {
		return isCompanyVehicle;
	}
	/**
	 * @param isCompanyVehicle the isCompanyVehicle to set
	 */
	public void setCompanyVehicle(boolean isCompanyVehicle) {
		this.isCompanyVehicle = isCompanyVehicle;
	}
	public ApplicantTypeEnum getApplicantType() {
		return applicantType;
	}
	public void setApplicantType(ApplicantTypeEnum applicantType) {
		this.applicantType = applicantType;
	}
	public Boolean getIsMobileRequest() {
		return isMobileRequest;
	}
	public void setIsMobileRequest(Boolean isMobileRequest) {
		this.isMobileRequest = isMobileRequest;
	}
	public Boolean getIsFinanceContinue() {
		return isFinanceContinue;
	}
	public void setIsFinanceContinue(Boolean isFinanceContinue) {
		this.isFinanceContinue = isFinanceContinue;
	}

	public Boolean getIsVcrEncRequired() {
		return isVcrEncRequired;
	}
	public void setIsVcrEncRequired(Boolean isVcrEncRequired) {
		this.isVcrEncRequired = isVcrEncRequired;
	}
}
