package org.epragati.regservice.vo;

import java.util.List;
import java.util.Set;

import javax.validation.constraints.Size;

import org.epragati.aadhaar.AadhaarDetailsRequestVO;
import org.epragati.aadhaar.AadharDetailsResponseVO;
import org.epragati.constants.OwnerType;
import org.epragati.constants.OwnerTypeEnum;
import org.epragati.constants.TransferType;
import org.epragati.permits.vo.PermitClassVO;
import org.epragati.util.custom.validation.Conditional;
import org.epragati.util.custom.validation.ValidatorConstants;
import org.epragati.util.payment.FinanceTowEnum;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class RcValidationVO {

	@Size(max = ValidatorConstants.AADHAR_SIZE, message = ValidatorConstants.IVALID_AADHAAR_NO)
	public String aadharNo;

	@Size(max = ValidatorConstants.PR_NO_SIZE, message = ValidatorConstants.INVALID_PRNO)
	@Conditional(selected = "prNo", message = ValidatorConstants.INVALID_PRNO, values = {})
	public String PrNo;

	public AadhaarDetailsRequestVO aadhaarDetailsRequestVO;

	private Set<Integer> serviceIds;

	private OwnerType ownerType;

	private TransferType transferType;

	private String token;

	private OwnerTypeEnum ownerShipType;

	private AadharDetailsResponseVO buyerAadhaarResponse;

	private PermitClassVO permitClassVO;

	private String chassisNo;

	private List<LegalHiresVO> legalHires;

	private Boolean isToSlotBookRequired = true;

	private String module;

	private String permitNo;

	private Boolean isMobile = false;

	private String permitVehiclePrNo;

	@Size(max = ValidatorConstants.TR_NO_SIZE, message = ValidatorConstants.INVALID_TRNO)
	@Conditional(selected = "trNo", message = ValidatorConstants.INVALID_TRNO, values = {})
	private String trNo;

	private boolean requestFromAdmin;
	
	private boolean isaadharvalidate  = false;
	
	
	private String transactionType;
	
	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public boolean isIsaadharvalidate() {
		return isaadharvalidate;
	}

	public void setIsaadharvalidate(boolean isaadharvalidate) {
		this.isaadharvalidate = isaadharvalidate;
	}


	/**
	 * @return the isToSlotBookRequired
	 */
	public Boolean getIsToSlotBookRequired() {
		return isToSlotBookRequired;
	}

	/**
	 * @param isToSlotBookRequired the isToSlotBookRequired to set
	 */
	public void setIsToSlotBookRequired(Boolean isToSlotBookRequired) {
		this.isToSlotBookRequired = isToSlotBookRequired;
	}

	/**
	 * @return the legalHires
	 */
	public List<LegalHiresVO> getLegalHires() {
		return legalHires;
	}

	/**
	 * @param legalHires the legalHires to set
	 */
	public void setLegalHires(List<LegalHiresVO> legalHires) {
		this.legalHires = legalHires;
	}

	/**
	 * @return the chassisNo
	 */
	public String getChassisNo() {
		return chassisNo;
	}

	/**
	 * @param chassisNo the chassisNo to set
	 */
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public AadharDetailsResponseVO getBuyerAadhaarResponse() {
		return buyerAadhaarResponse;
	}

	public void setBuyerAadhaarResponse(AadharDetailsResponseVO buyerAadhaarResponse) {
		this.buyerAadhaarResponse = buyerAadhaarResponse;
	}

	public OwnerTypeEnum getOwnerShipType() {
		return ownerShipType;
	}

	public void setOwnerShipType(OwnerTypeEnum ownerShipType) {
		this.ownerShipType = ownerShipType;
	}

	private FinanceTowEnum sellerDecision;

	public FinanceTowEnum getSellerDecision() {
		return sellerDecision;
	}

	public void setSellerDecision(FinanceTowEnum sellerDecision) {
		this.sellerDecision = sellerDecision;
	}

	/**
	 * @return the ownerType
	 */
	public OwnerType getOwnerType() {
		return ownerType;
	}

	/**
	 * @param ownerType the ownerType to set
	 */
	public void setOwnerType(OwnerType ownerType) {
		this.ownerType = ownerType;
	}

	/**
	 * @return the transferType
	 */
	public TransferType getTransferType() {
		return transferType;
	}

	/**
	 * @param transferType the transferType to set
	 */
	public void setTransferType(TransferType transferType) {
		this.transferType = transferType;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPrNo() {
		return PrNo;
	}

	public void setPrNo(String prNo) {
		PrNo = prNo;
	}

	public AadhaarDetailsRequestVO getAadhaarDetailsRequestVO() {
		return aadhaarDetailsRequestVO;
	}

	public void setAadhaarDetailsRequestVO(AadhaarDetailsRequestVO aadhaarDetailsRequestVO) {
		this.aadhaarDetailsRequestVO = aadhaarDetailsRequestVO;
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
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the permitClassVO
	 */
	public PermitClassVO getPermitClassVO() {
		return permitClassVO;
	}

	/**
	 * @param permitClassVO the permitClassVO to set
	 */
	public void setPermitClassVO(PermitClassVO permitClassVO) {
		this.permitClassVO = permitClassVO;
	}

	/**
	 * @return the module
	 */
	public String getModule() {
		return module;
	}

	/**
	 * @param module the module to set
	 */
	public void setModule(String module) {
		this.module = module;
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

	public Boolean getIsMobile() {
		return isMobile;
	}

	public void setIsMobile(Boolean isMobile) {
		this.isMobile = isMobile;
	}

	public String getPermitVehiclePrNo() {
		return permitVehiclePrNo;
	}

	public void setPermitVehiclePrNo(String permitVehiclePrNo) {
		this.permitVehiclePrNo = permitVehiclePrNo;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	public boolean isRequestFromAdmin() {
		return requestFromAdmin;
	}

	public void setRequestFromAdmin(boolean requestFromAdmin) {
		this.requestFromAdmin = requestFromAdmin;
	}

}
