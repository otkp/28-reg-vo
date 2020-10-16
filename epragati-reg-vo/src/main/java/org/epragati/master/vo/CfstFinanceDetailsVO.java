package org.epragati.master.vo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.epragati.aadhaar.AadharDetailsResponseVO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CfstFinanceDetailsVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String applicationNo;

	private String token;

	private AadharDetailsResponseVO aadharResponse;

	private LocalDateTime tokenGeneratedTime;

	private String financerName;

	private Double sanctionedAmount;

	private Integer intrest;

	private String status;

	private String userId;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime lastUpdated;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime createdDate;

	private Integer quotationValue;

	private MasterFinanceTypeVO masterFinanceTypeVO;

	private LocalDate agreementDate;


	private LocalDate agreementDateForOther;

	private String address;

	public LocalDate getAgreementDateForOther() {
		return agreementDateForOther;
	}

	public void setAgreementDateForOther(LocalDate agreementDateForOther) {
		this.agreementDateForOther = agreementDateForOther;
	}

	

	/**
	 * @return the masterFinanceTypeVO
	 */
	public MasterFinanceTypeVO getMasterFinanceTypeVO() {
		return masterFinanceTypeVO;
	}

	/**
	 * @param masterFinanceTypeVO
	 *            the masterFinanceTypeVO to set
	 */
	public void setMasterFinanceTypeVO(MasterFinanceTypeVO masterFinanceTypeVO) {
		this.masterFinanceTypeVO = masterFinanceTypeVO;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public LocalDateTime getTokenGeneratedTime() {
		return tokenGeneratedTime;
	}

	public void setTokenGeneratedTime(LocalDateTime tokenGeneratedTime) {
		this.tokenGeneratedTime = tokenGeneratedTime;
	}

	public String getFinancerName() {
		return financerName;
	}

	public void setFinancerName(String financerName) {
		this.financerName = financerName;
	}

	public Double getSanctionedAmount() {
		return sanctionedAmount;
	}

	public void setSanctionedAmount(Double sanctionedAmount) {
		this.sanctionedAmount = sanctionedAmount;
	}

	public Integer getIntrest() {
		return intrest;
	}

	public void setIntrest(Integer intrest) {
		this.intrest = intrest;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public AadharDetailsResponseVO getAadharResponse() {
		return aadharResponse;
	}

	public void setAadharResponse(AadharDetailsResponseVO aadharResponse) {
		this.aadharResponse = aadharResponse;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the quotationValue
	 */
	public Integer getQuotationValue() {
		return quotationValue;
	}

	/**
	 * @param quotationValue
	 *            the quotationValue to set
	 */
	public void setQuotationValue(Integer quotationValue) {
		this.quotationValue = quotationValue;
	}

	/**
	 * @return the createdDate
	 */
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the agreementDate
	 */
	public LocalDate getAgreementDate() {
		return agreementDate;
	}

	/**
	 * @param agreementDate the agreementDate to set
	 */
	public void setAgreementDate(LocalDate agreementDate) {
		this.agreementDate = agreementDate;
	}

}
