package org.epragati.permits.vo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import org.epragati.common.vo.BaseVO;
import org.epragati.util.custom.validation.Conditional;
import org.epragati.util.payment.ServiceEnum;

public class PermitDetailsVO extends BaseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

	private String permitNo;

	@Conditional(selected = "prNo", message = "Invalid prNo", values = {})
	private String prNo;

	private PermitClassVO permitClass;

	private PermitTypeVO permitType;

	private PermitGoodsDetailsVO goodDetails;

	private PermitValidityDetailsVO permitValidityDetailsVO;

	private RouteDetailsVO routeDetailsVO;

	// private RegistrationDetailsVO registrationDetailsVO;

	// private PermitDetailsVO permitDetailsVO;

	private String permitStatus;

	private String permitAuthorizationNo;

	private boolean isPermitSurrender = false;

	private LocalDate permitSurrenderDate;

	private STCTvehcleDetailsVO sTCTvehcleDetailsVO;

	private List<ServiceEnum> serviceType;

	private Set<Integer> serviceIds;

	private String nonPermitPrNo;

	private Boolean isPermitDataEntry = Boolean.FALSE;

	private Boolean isRelacementOfVehicle = Boolean.FALSE;

	private LocalDate RelacementDate;

	private Boolean isMonthsInRenewal = false;

	private Boolean isPaymentDone = false;

	private String stageCarriageType;

	private String stageCarriageServiceType;

	private String representedBy;

	private String representAddress;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the permitNo
	 */
	public String getPermitNo() {
		return permitNo;
	}

	/**
	 * @param permitNo the permitNo to set
	 */
	public void setPermitNo(String permitNo) {
		this.permitNo = permitNo;
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
	 * @return the permitClass
	 */
	public PermitClassVO getPermitClass() {
		return permitClass;
	}

	/**
	 * @param permitClass the permitClass to set
	 */
	public void setPermitClass(PermitClassVO permitClass) {
		this.permitClass = permitClass;
	}

	/**
	 * @return the permitType
	 */
	public PermitTypeVO getPermitType() {
		return permitType;
	}

	/**
	 * @param permitType the permitType to set
	 */
	public void setPermitType(PermitTypeVO permitType) {
		this.permitType = permitType;
	}

	/**
	 * @return the goodDetails
	 */
	public PermitGoodsDetailsVO getGoodDetails() {
		return goodDetails;
	}

	/**
	 * @param goodDetails the goodDetails to set
	 */
	public void setGoodDetails(PermitGoodsDetailsVO goodDetails) {
		this.goodDetails = goodDetails;
	}

	/**
	 * @return the permitValidityDetailsVO
	 */
	public PermitValidityDetailsVO getPermitValidityDetailsVO() {
		return permitValidityDetailsVO;
	}

	/**
	 * @param permitValidityDetailsVO the permitValidityDetailsVO to set
	 */
	public void setPermitValidityDetailsVO(PermitValidityDetailsVO permitValidityDetailsVO) {
		this.permitValidityDetailsVO = permitValidityDetailsVO;
	}

	/**
	 * @return the routeDetailsVO
	 */
	public RouteDetailsVO getRouteDetailsVO() {
		return routeDetailsVO;
	}

	/**
	 * @param routeDetailsVO the routeDetailsVO to set
	 */
	public void setRouteDetailsVO(RouteDetailsVO routeDetailsVO) {
		this.routeDetailsVO = routeDetailsVO;
	}

	/**
	 * @return the registrationDetailsVO
	 */
	/*
	 * public RegistrationDetailsVO getRegistrationDetailsVO() { return
	 * registrationDetailsVO; }
	 * 
	 *//**
		 * @param registrationDetailsVO the registrationDetailsVO to set
		 *//*
			 * public void setRegistrationDetailsVO(RegistrationDetailsVO
			 * registrationDetailsVO) { this.registrationDetailsVO = registrationDetailsVO;
			 * }
			 */

	/**
	 * @return the permitStatus
	 */
	public String getPermitStatus() {
		return permitStatus;
	}

	/**
	 * @param permitStatus the permitStatus to set
	 */
	public void setPermitStatus(String permitStatus) {
		this.permitStatus = permitStatus;
	}

	/**
	 * @return the permitAuthorizationNo
	 */
	public String getPermitAuthorizationNo() {
		return permitAuthorizationNo;
	}

	/**
	 * @param permitAuthorizationNo the permitAuthorizationNo to set
	 */
	public void setPermitAuthorizationNo(String permitAuthorizationNo) {
		this.permitAuthorizationNo = permitAuthorizationNo;
	}

	/**
	 * @return the isPermitSurrender
	 */
	public boolean isPermitSurrender() {
		return isPermitSurrender;
	}

	/**
	 * @param isPermitSurrender the isPermitSurrender to set
	 */
	public void setPermitSurrender(boolean isPermitSurrender) {
		this.isPermitSurrender = isPermitSurrender;
	}

	/**
	 * @return the permitSurrenderDate
	 */
	public LocalDate getPermitSurrenderDate() {
		return permitSurrenderDate;
	}

	/**
	 * @param permitSurrenderDate the permitSurrenderDate to set
	 */
	public void setPermitSurrenderDate(LocalDate permitSurrenderDate) {
		this.permitSurrenderDate = permitSurrenderDate;
	}

	/**
	 * @return the sTCTvehcleDetailsVO
	 */
	public STCTvehcleDetailsVO getsTCTvehcleDetailsVO() {
		return sTCTvehcleDetailsVO;
	}

	/**
	 * @param sTCTvehcleDetailsVO the sTCTvehcleDetailsVO to set
	 */
	public void setsTCTvehcleDetailsVO(STCTvehcleDetailsVO sTCTvehcleDetailsVO) {
		this.sTCTvehcleDetailsVO = sTCTvehcleDetailsVO;
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
	 * @return the nonPermitPrNo
	 */
	public String getNonPermitPrNo() {
		return nonPermitPrNo;
	}

	/**
	 * @param nonPermitPrNo the nonPermitPrNo to set
	 */
	public void setNonPermitPrNo(String nonPermitPrNo) {
		this.nonPermitPrNo = nonPermitPrNo;
	}

	public Boolean getIsPermitDataEntry() {
		return isPermitDataEntry;
	}

	public void setIsPermitDataEntry(Boolean isPermitDataEntry) {
		this.isPermitDataEntry = isPermitDataEntry;
	}

	/**
	 * @return the isRelacementOfVehicle
	 */
	public Boolean getIsRelacementOfVehicle() {
		return isRelacementOfVehicle;
	}

	/**
	 * @param isRelacementOfVehicle the isRelacementOfVehicle to set
	 */
	public void setIsRelacementOfVehicle(Boolean isRelacementOfVehicle) {
		this.isRelacementOfVehicle = isRelacementOfVehicle;
	}

	/**
	 * @return the relacementDate
	 */
	public LocalDate getRelacementDate() {
		return RelacementDate;
	}

	/**
	 * @param relacementDate the relacementDate to set
	 */
	public void setRelacementDate(LocalDate relacementDate) {
		RelacementDate = relacementDate;
	}

	/**
	 * @return the isMonthsInRenewal
	 */
	public Boolean getIsMonthsInRenewal() {
		return isMonthsInRenewal;
	}

	/**
	 * @param isMonthsInRenewal the isMonthsInRenewal to set
	 */
	public void setIsMonthsInRenewal(Boolean isMonthsInRenewal) {
		this.isMonthsInRenewal = isMonthsInRenewal;
	}

	/**
	 * @return the isPaymentDone
	 */
	public Boolean getIsPaymentDone() {
		return isPaymentDone;
	}

	/**
	 * @param isPaymentDone the isPaymentDone to set
	 */
	public void setIsPaymentDone(Boolean isPaymentDone) {
		this.isPaymentDone = isPaymentDone;
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

	/**
	 * @return the representAddress
	 */
	public String getRepresentAddress() {
		return representAddress;
	}

	/**
	 * @param representAddress the representAddress to set
	 */
	public void setRepresentAddress(String representAddress) {
		this.representAddress = representAddress;
	}

	/**
	 * @return the representedBy
	 */
	public String getRepresentedBy() {
		return representedBy;
	}

	/**
	 * @param representedBy the representedBy to set
	 */
	public void setRepresentedBy(String representedBy) {
		this.representedBy = representedBy;
	}

}