package org.epragati.master.vo;

import org.epragati.permits.vo.PermitDetailsVO;

public class SearchVo {

	private RegistrationDetailsVO registrationDetails;

	private Boolean isTaxPending = false;

	private PermitDetailsVO permitDetailsVO;

	private Boolean isInsuranceExpired;

	private Boolean isPucExpired;

	private Boolean isMandalNotExist = false;

	private Integer districtId;

	private Boolean isPermitTransfer = false;

	private Boolean isPermitCancel = false;

	private Boolean isPermitSurrender = false;

	private Boolean isValidPermit = false;

	private Boolean isPermitExpired = false;

	private Boolean sellerPermitStatus = false;

	private Boolean isRepresentative = false;

	private Boolean isRecommendationLetter = false;

	private Boolean isRecommendationExpired = false;

	private Boolean sellerRecommedationLetterStatus = false;

	private String recoomendationLetterCode;
	
	private String transactionType;

	public String getTransactionType() {
		return transactionType;
	}

	public void setTrasactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Boolean getIsRepresentative() {
		return isRepresentative;
	}

	public void setIsRepresentative(Boolean isRepresentative) {
		this.isRepresentative = isRepresentative;
	}

	/**
	 * @return the sellerPermitStatus
	 */
	public Boolean getSellerPermitStatus() {
		return sellerPermitStatus;
	}

	/**
	 * @param sellerPermitStatus the sellerPermitStatus to set
	 */
	public void setSellerPermitStatus(Boolean sellerPermitStatus) {
		this.sellerPermitStatus = sellerPermitStatus;
	}

	/**
	 * @return the isValidPermit
	 */
	public Boolean getIsValidPermit() {
		return isValidPermit;
	}

	/**
	 * @param isValidPermit the isValidPermit to set
	 */
	public void setIsValidPermit(Boolean isValidPermit) {
		this.isValidPermit = isValidPermit;
	}

	/**
	 * @return the isPermitExpired
	 */
	public Boolean getIsPermitExpired() {
		return isPermitExpired;
	}

	/**
	 * @param isPermitExpired the isPermitExpired to set
	 */
	public void setIsPermitExpired(Boolean isPermitExpired) {
		this.isPermitExpired = isPermitExpired;
	}

	/**
	 * @return the isPermitCancel
	 */
	public Boolean getIsPermitCancel() {
		return isPermitCancel;
	}

	/**
	 * @param isPermitCancel the isPermitCancel to set
	 */
	public void setIsPermitCancel(Boolean isPermitCancel) {
		this.isPermitCancel = isPermitCancel;
	}

	/**
	 * @return the isPermitSurrender
	 */
	public Boolean getIsPermitSurrender() {
		return isPermitSurrender;
	}

	/**
	 * @param isPermitSurrender the isPermitSurrender to set
	 */
	public void setIsPermitSurrender(Boolean isPermitSurrender) {
		this.isPermitSurrender = isPermitSurrender;
	}

	/**
	 * @return the isPermitTransfer
	 */
	public Boolean getIsPermitTransfer() {
		return isPermitTransfer;
	}

	/**
	 * @param isPermitTransfer the isPermitTransfer to set
	 */
	public void setIsPermitTransfer(Boolean isPermitTransfer) {
		this.isPermitTransfer = isPermitTransfer;
	}

	/**
	 * @return the isInsuranceExpired
	 */
	public Boolean getIsInsuranceExpired() {
		return isInsuranceExpired;
	}

	/**
	 * @param isInsuranceExpired the isInsuranceExpired to set
	 */
	public void setIsInsuranceExpired(Boolean isInsuranceExpired) {
		this.isInsuranceExpired = isInsuranceExpired;
	}

	/**
	 * @return the isTaxPending
	 */
	public Boolean getIsTaxPending() {
		return isTaxPending;
	}

	/**
	 * @param isTaxPending the isTaxPending to set
	 */
	public void setIsTaxPending(Boolean isTaxPending) {
		this.isTaxPending = isTaxPending;
	}

	/**
	 * @return the registrationDetails
	 */
	public RegistrationDetailsVO getRegistrationDetails() {
		return registrationDetails;
	}

	/**
	 * @param registrationDetails the registrationDetails to set
	 */
	public void setRegistrationDetails(RegistrationDetailsVO registrationDetails) {
		this.registrationDetails = registrationDetails;
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
	 * @return the isPucExpired
	 */
	public Boolean getIsPucExpired() {
		return isPucExpired;
	}

	/**
	 * @param isPucExpired the isPucExpired to set
	 */
	public void setIsPucExpired(Boolean isPucExpired) {
		this.isPucExpired = isPucExpired;
	}

	public Boolean getIsMandalNotExist() {
		return isMandalNotExist;
	}

	public void setIsMandalNotExist(Boolean isMandalNotExist) {
		this.isMandalNotExist = isMandalNotExist;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	/**
	 * @return the isRecommendationLetter
	 */
	public Boolean getIsRecommendationLetter() {
		return isRecommendationLetter;
	}

	/**
	 * @param isRecommendationLetter the isRecommendationLetter to set
	 */
	public void setIsRecommendationLetter(Boolean isRecommendationLetter) {
		this.isRecommendationLetter = isRecommendationLetter;
	}

	/**
	 * @return the isRecommendationExpired
	 */
	public Boolean getIsRecommendationExpired() {
		return isRecommendationExpired;
	}

	/**
	 * @param isRecommendationExpired the isRecommendationExpired to set
	 */
	public void setIsRecommendationExpired(Boolean isRecommendationExpired) {
		this.isRecommendationExpired = isRecommendationExpired;
	}

	/**
	 * @return the sellerRecommedationLetterStatus
	 */
	public Boolean getSellerRecommedationLetterStatus() {
		return sellerRecommedationLetterStatus;
	}

	/**
	 * @param sellerRecommedationLetterStatus the sellerRecommedationLetterStatus to
	 *                                        set
	 */
	public void setSellerRecommedationLetterStatus(Boolean sellerRecommedationLetterStatus) {
		this.sellerRecommedationLetterStatus = sellerRecommedationLetterStatus;
	}

	/**
	 * @return the recoomendationLetterCode
	 */
	public String getRecoomendationLetterCode() {
		return recoomendationLetterCode;
	}

	/**
	 * @param recoomendationLetterCode the recoomendationLetterCode to set
	 */
	public void setRecoomendationLetterCode(String recoomendationLetterCode) {
		this.recoomendationLetterCode = recoomendationLetterCode;
	}

}
