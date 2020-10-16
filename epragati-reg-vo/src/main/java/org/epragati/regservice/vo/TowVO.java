package org.epragati.regservice.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.validation.constraints.Size;

import org.epragati.constants.OwnerType;
import org.epragati.constants.TransferType;
import org.epragati.master.vo.ApplicantDetailsVO;
import org.epragati.master.vo.OwnershipVO;
import org.epragati.util.custom.validation.ValidatorConstants;
import org.epragati.util.payment.ServiceEnum;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)

public class TowVO {

	private OwnerType buyer;
	private OwnerType seller;
	private TransferType transferType;
	private String token;
	private boolean tokenStatus;
	private LocalDateTime tokenNoGeneratedTime;
	private LocalDateTime tokenUsedTime;
	private Long buyerAadhaarNo;
	private String sellerAadhaarNo;
	private List<LegalHiresVO> legalHires;
	private List<ServiceEnum> buyerServices;
	@Size(max = 50,message = ValidatorConstants.INVALID_CHASSIS_NO)
	private String chassisNo;
	private String sellerFinancierType;
	private Boolean isMobileService = Boolean.FALSE; 
	private String tokenDate;
	
	public String getTokenDate() {
		return tokenDate;
	}

	public void setTokenDate(String tokenDate) {
		this.tokenDate = tokenDate;
	}

	public Boolean getIsMobileService() {
		return isMobileService;
	}

	public void setIsMobileService(Boolean isMobileService) {
		this.isMobileService = isMobileService;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	/**
	 * @return the buyerServices
	 */
	public List<ServiceEnum> getBuyerServices() {
		return buyerServices;
	}

	/**
	 * @param buyerServices the buyerServices to set
	 */
	public void setBuyerServices(List<ServiceEnum> buyerServices) {
		this.buyerServices = buyerServices;
	}

	/**
	 * @return the legalHires
	 */
	public List<LegalHiresVO> getLegalHires() {
		return legalHires;
	}

	/**
	 * @param legalHires
	 *            the legalHires to set
	 */
	public void setLegalHires(List<LegalHiresVO> legalHires) {
		this.legalHires = legalHires;
	}

	/**
	 * @return the buyerAadhaarNo
	 */
	public Long getBuyerAadhaarNo() {
		return buyerAadhaarNo;
	}
	/**
	 * @param buyerAadhaarNo the buyerAadhaarNo to set
	 */
	public void setBuyerAadhaarNo(Long buyerAadhaarNo) {
		this.buyerAadhaarNo = buyerAadhaarNo;
	}
	private Integer sellerFinanceStatus;
	private Integer buyerFinanceStatus;
	@JsonInclude(Include.NON_EMPTY)
	private OwnershipVO ownershipType;
	
	private ApplicantDetailsVO buyerBasicDetails;
	
	

	/**
	 * @return the buyerBasicDetails
	 */
	public ApplicantDetailsVO getBuyerBasicDetails() {
		return buyerBasicDetails;
	}
	/**
	 * @param buyerBasicDetails the buyerBasicDetails to set
	 */
	public void setBuyerBasicDetails(ApplicantDetailsVO buyerBasicDetails) {
		this.buyerBasicDetails = buyerBasicDetails;
	}
	/**
	 * @return the ownershipType
	 */
	public OwnershipVO getOwnershipType() {
		return ownershipType;
	}
	/**
	 * @param ownershipType the ownershipType to set
	 */
	public void setOwnershipType(OwnershipVO ownershipType) {
		this.ownershipType = ownershipType;
	}
	private UUID buyerUUID;
	/**
	 * @return the buyerUUID
	 */
	public UUID getBuyerUUID() {
		return buyerUUID;
	}
	/**
	 * @param buyerUUID the buyerUUID to set
	 */
	public void setBuyerUUID(UUID buyerUUID) {
		this.buyerUUID = buyerUUID;
	}
	
	/**
	 * @return the sellerAadhaarNo
	 */
	public String getSellerAadhaarNo() {
		return sellerAadhaarNo;
	}
	/**
	 * @param sellerAadhaarNo the sellerAadhaarNo to set
	 */
	public void setSellerAadhaarNo(String sellerAadhaarNo) {
		this.sellerAadhaarNo = sellerAadhaarNo;
	}
	
	

	public Integer getSellerFinanceStatus() {
		return sellerFinanceStatus;
	}
	public void setSellerFinanceStatus(Integer sellerFinanceStatus) {
		this.sellerFinanceStatus = sellerFinanceStatus;
	}
	public Integer getBuyerFinanceStatus() {
		return buyerFinanceStatus;
	}
	public void setBuyerFinanceStatus(Integer buyerFinanceStatus) {
		this.buyerFinanceStatus = buyerFinanceStatus;
	}

	/**
	 * @return the buyer
	 */
	public OwnerType getBuyer() {
		return buyer;
	}
	/**
	 * @param buyer the buyer to set
	 */
	public void setBuyer(OwnerType buyer) {
		this.buyer = buyer;
	}
	/**
	 * @return the seller
	 */
	public OwnerType getSeller() {
		return seller;
	}
	/**
	 * @param seller the seller to set
	 */
	public void setSeller(OwnerType seller) {
		this.seller = seller;
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
	 * @return the tokenStatus
	 */
	public boolean isTokenStatus() {
		return tokenStatus;
	}
	/**
	 * @param tokenStatus the tokenStatus to set
	 */
	public void setTokenStatus(boolean tokenStatus) {
		this.tokenStatus = tokenStatus;
	}
	/**
	 * @return the tokenNoGeneratedTime
	 */
	public LocalDateTime getTokenNoGeneratedTime() {
		return tokenNoGeneratedTime;
	}
	/**
	 * @param tokenNoGeneratedTime the tokenNoGeneratedTime to set
	 */
	public void setTokenNoGeneratedTime(LocalDateTime tokenNoGeneratedTime) {
		this.tokenNoGeneratedTime = tokenNoGeneratedTime;
	}
	/**
	 * @return the tokenUsedTime
	 */
	public LocalDateTime getTokenUsedTime() {
		return tokenUsedTime;
	}
	/**
	 * @param tokenUsedTime the tokenUsedTime to set
	 */
	public void setTokenUsedTime(LocalDateTime tokenUsedTime) {
		this.tokenUsedTime = tokenUsedTime;
	}

	public String getSellerFinancierType() {
		return sellerFinancierType;
	}

	public void setSellerFinancierType(String sellerFinancierType) {
		this.sellerFinancierType = sellerFinancierType;
	}
	
	
}
