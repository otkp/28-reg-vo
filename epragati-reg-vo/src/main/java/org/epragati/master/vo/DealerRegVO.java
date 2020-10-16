/**
 * 
 */
package org.epragati.master.vo;

import java.time.LocalDate;
import java.util.List;

import org.epragati.common.vo.BaseVO;
import org.epragati.dealer.tradecert.TradeCertificateDealerVO;
import org.epragati.gstn.vo.GSTNDataVO;
import org.epragati.images.vo.ImageInput;
import org.epragati.payments.vo.ClassOfVehiclesVO;
import org.epragati.payments.vo.FeeDetailsVO;
import org.epragati.regservice.vo.LockedDetailsVO;
import org.epragati.util.StatusRegistration;
import org.epragati.util.payment.ServiceEnum;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DealerRegVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private GSTNDataVO gstnData;

	private String dealerUserId;

	private List<ClassOfVehiclesVO> covs;

	private String category;

	private List<ImageInput> images;

	private ApplicantDetailsVO applicantDetails;

	private String applicationNo;

	private List<ActionDetailsVO> actionDetails;

	private List<Integer> serviceIds;

	private StatusRegistration applicationStatus;

	private String officeCode;

	private List<ServiceEnum> serviceType;

	private String gateWayType;

	private OfficeVO officeDetails;

	private FeeDetailsVO feeDetails;

	private Boolean isMVIassigned = false;

	private OfficeVO mviOfficeDetails;

	private List<LockedDetailsVO> lockedDetails;

	private String assignedMvi;

	private String paymentTransactionNo;

	private PanDetailsVO panDetails;
	/**
	 * this property is used for paying payment on generating trade certificate
	 */
	private Integer numberOfTradeCertificateApply;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate suspendedFrom;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate suspendedTo;

	private String suspendedBy;

	private String cancelledBy;

	private StatusRegistration actionStatus;

	private UserVO existingUserDeatils;

	private String cancellationComments;

	private Boolean isMVIDone;

	private Boolean isChild = Boolean.FALSE;

	private String parentUserId;

	private List<MakersVO> makers;

	private List<TradeCertificateDealerVO> tradeCertificate;

	private ApplicantAddressVO dealerAddress;

	/**
	 * @return the parentUserId
	 */
	public String getParentUserId() {
		return parentUserId;
	}

	/**
	 * @param parentUserId the parentUserId to set
	 */
	public void setParentUserId(String parentUserId) {
		this.parentUserId = parentUserId;
	}

	/**
	 * @return the isChild
	 */
	public Boolean getIsChild() {
		return isChild;
	}

	/**
	 * @param isChild the isChild to set
	 */
	public void setIsChild(Boolean isChild) {
		this.isChild = isChild;
	}

	/**
	 * @return the isMVIDone
	 */
	public Boolean getIsMVIDone() {
		return isMVIDone;
	}

	/**
	 * @param isMVIDone the isMVIDone to set
	 */
	public void setIsMVIDone(Boolean isMVIDone) {
		this.isMVIDone = isMVIDone;
	}

	/**
	 * @return the cancellationComments
	 */
	public String getCancellationComments() {
		return cancellationComments;
	}

	/**
	 * @param cancellationComments the cancellationComments to set
	 */
	public void setCancellationComments(String cancellationComments) {
		this.cancellationComments = cancellationComments;
	}

	public Integer getNumberOfTradeCertificateAppl() {
		return numberOfTradeCertificateApply;
	}

	public void setNumberOfTradeCertificateAppl(Integer numberOfTradeCertificateApply) {
		this.numberOfTradeCertificateApply = numberOfTradeCertificateApply;
	}

	/**
	 * @return the applicantDetails
	 */
	public ApplicantDetailsVO getApplicantDetails() {
		return applicantDetails;
	}

	/**
	 * @param applicantDetails the applicantDetails to set
	 */
	public void setApplicantDetails(ApplicantDetailsVO applicantDetails) {
		this.applicantDetails = applicantDetails;
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
	 * @return the gateWayType
	 */
	public String getGateWayType() {
		return gateWayType;
	}

	/**
	 * @param gateWayType the gateWayType to set
	 */
	public void setGateWayType(String gateWayType) {
		this.gateWayType = gateWayType;
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
	 * @return the serviceIds
	 */
	public List<Integer> getServiceIds() {
		return serviceIds;
	}

	/**
	 * @param serviceIds the serviceIds to set
	 */
	public void setServiceIds(List<Integer> serviceIds) {
		this.serviceIds = serviceIds;
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
	 * @return the actionDetails
	 */
	public List<ActionDetailsVO> getActionDetails() {
		return actionDetails;
	}

	/**
	 * @param actionDetails the actionDetails to set
	 */
	public void setActionDetails(List<ActionDetailsVO> actionDetails) {
		this.actionDetails = actionDetails;
	}

	/**
	 * @return the gstnData
	 */
	public GSTNDataVO getGstnData() {
		return gstnData;
	}

	/**
	 * @param gstnData the gstnData to set
	 */
	public void setGstnData(GSTNDataVO gstnData) {
		this.gstnData = gstnData;
	}

	/**
	 * @return the covs
	 */
	public List<ClassOfVehiclesVO> getCovs() {
		return covs;
	}

	/**
	 * @param covs the covs to set
	 */
	public void setCovs(List<ClassOfVehiclesVO> covs) {
		this.covs = covs;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the images
	 */
	public List<ImageInput> getImages() {
		return images;
	}

	/**
	 * @param images the images to set
	 */
	public void setImages(List<ImageInput> images) {
		this.images = images;
	}

	/**
	 * @return the isMVIassigned
	 */
	public Boolean getIsMVIassigned() {
		return isMVIassigned;
	}

	/**
	 * @param isMVIassigned the isMVIassigned to set
	 */
	public void setIsMVIassigned(Boolean isMVIassigned) {
		this.isMVIassigned = isMVIassigned;
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
	 * @return the lockedDetails
	 */
	public List<LockedDetailsVO> getLockedDetails() {
		return lockedDetails;
	}

	/**
	 * @param lockedDetails the lockedDetails to set
	 */
	public void setLockedDetails(List<LockedDetailsVO> lockedDetails) {
		this.lockedDetails = lockedDetails;
	}

	/**
	 * @return the assignedMvi
	 */
	public String getAssignedMvi() {
		return assignedMvi;
	}

	/**
	 * @param assignedMvi the assignedMvi to set
	 */
	public void setAssignedMvi(String assignedMvi) {
		this.assignedMvi = assignedMvi;
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
	 * @return the panDetails
	 */
	public PanDetailsVO getPanDetails() {
		return panDetails;
	}

	/**
	 * @param panDetails the panDetails to set
	 */
	public void setPanDetails(PanDetailsVO panDetails) {
		this.panDetails = panDetails;
	}

	/**
	 * @return the dealerUserId
	 */
	public String getDealerUserId() {
		return dealerUserId;
	}

	/**
	 * @param dealerUserId the dealerUserId to set
	 */
	public void setDealerUserId(String dealerUserId) {
		this.dealerUserId = dealerUserId;
	}

	/**
	 * @return the numberOfTradeCertificateApply
	 */
	public Integer getNumberOfTradeCertificateApply() {
		return numberOfTradeCertificateApply;
	}

	/**
	 * @param numberOfTradeCertificateApply the numberOfTradeCertificateApply to set
	 */
	public void setNumberOfTradeCertificateApply(Integer numberOfTradeCertificateApply) {
		this.numberOfTradeCertificateApply = numberOfTradeCertificateApply;
	}

	/**
	 * @return the suspendedFrom
	 */
	public LocalDate getSuspendedFrom() {
		return suspendedFrom;
	}

	/**
	 * @param suspendedFrom the suspendedFrom to set
	 */
	public void setSuspendedFrom(LocalDate suspendedFrom) {
		this.suspendedFrom = suspendedFrom;
	}

	/**
	 * @return the suspendedTo
	 */
	public LocalDate getSuspendedTo() {
		return suspendedTo;
	}

	/**
	 * @param suspendedTo the suspendedTo to set
	 */
	public void setSuspendedTo(LocalDate suspendedTo) {
		this.suspendedTo = suspendedTo;
	}

	/**
	 * @return the suspendedBy
	 */
	public String getSuspendedBy() {
		return suspendedBy;
	}

	/**
	 * @param suspendedBy the suspendedBy to set
	 */
	public void setSuspendedBy(String suspendedBy) {
		this.suspendedBy = suspendedBy;
	}

	/**
	 * @return the cancelledBy
	 */
	public String getCancelledBy() {
		return cancelledBy;
	}

	/**
	 * @param cancelledBy the cancelledBy to set
	 */
	public void setCancelledBy(String cancelledBy) {
		this.cancelledBy = cancelledBy;
	}

	/**
	 * @return the actionStatus
	 */
	public StatusRegistration getActionStatus() {
		return actionStatus;
	}

	/**
	 * @param actionStatus the actionStatus to set
	 */
	public void setActionStatus(StatusRegistration actionStatus) {
		this.actionStatus = actionStatus;
	}

	/**
	 * @return the existingUserDeatils
	 */
	public UserVO getExistingUserDeatils() {
		return existingUserDeatils;
	}

	/**
	 * @param existingUserDeatils the existingUserDeatils to set
	 */
	public void setExistingUserDeatils(UserVO existingUserDeatils) {
		this.existingUserDeatils = existingUserDeatils;
	}

	/**
	 * @return the makers
	 */
	public List<MakersVO> getMakers() {
		return makers;
	}

	/**
	 * @param makers the makers to set
	 */
	public void setMakers(List<MakersVO> makers) {
		this.makers = makers;
	}

	public List<TradeCertificateDealerVO> getTradeCertificate() {
		return tradeCertificate;
	}

	public void setTradeCertificate(List<TradeCertificateDealerVO> tradeCertificate) {
		this.tradeCertificate = tradeCertificate;
	}

	/**
	 * @return the dealerAddress
	 */
	public ApplicantAddressVO getDealerAddress() {
		return dealerAddress;
	}

	/**
	 * @param dealerAddress the dealerAddress to set
	 */
	public void setDealerAddress(ApplicantAddressVO dealerAddress) {
		this.dealerAddress = dealerAddress;
	}

}
