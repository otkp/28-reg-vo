package org.epragati.payments.vo;

import java.util.Map;

import org.epragati.util.payment.GatewayTypeEnum;
import org.epragati.util.payment.PayStatusEnum;

public class PaymentGateWayResponse {
	private Map<String, String[]> gatewayResponceMap;
	private PayUResponse payUResponse;
	private GatewayTypeEnum gatewayTypeEnum;
	private String bankTranRefNumber;// Bank transaction reference number.
	private String transactionNo;
	private String appTransNo;
	private String moduleCode;
	private PayStatusEnum paymentStatus;
	private Boolean isHashValidationSucess;
	private SBIResponce sbiResponce;
	private Boolean isAgreeToEnablePayment;
	
	
	private Map<String, String> cfmsGatewayResponceMap;
	
	private CFMSResponce cfmsResponce;
	
	private PaymentVerifyRequest paymentVerifyRequest;
	
	private Boolean isCancelledTransaction = Boolean.FALSE;
	
	private Boolean isDoubleVerified = false;
	private String responceString;
	
	private Boolean isRequestFromFinacier = false;
	
	/**
	 * @return the gatewayResponceMap
	 */
	public Map<String, String[]> getGatewayResponceMap() {
		return gatewayResponceMap;
	}

	/**
	 * @param gatewayResponceMap
	 *            the gatewayResponceMap to set
	 */
	public void setGatewayResponceMap(Map<String, String[]> gatewayResponceMap) {
		this.gatewayResponceMap = gatewayResponceMap;
	}

	/**
	 * @return the gatewayTypeEnum
	 */
	public GatewayTypeEnum getGatewayTypeEnum() {
		return gatewayTypeEnum;
	}

	/**
	 * @param gatewayTypeEnum
	 *            the gatewayTypeEnum to set
	 */
	public void setGatewayTypeEnum(GatewayTypeEnum gatewayTypeEnum) {
		this.gatewayTypeEnum = gatewayTypeEnum;
	}

	/**
	 * @return the transactionNo
	 */
	public String getTransactionNo() {
		return transactionNo;
	}

	/**
	 * @param transactionNo
	 *            the transactionNo to set
	 */
	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}

	/**
	 * @return the appTransNo
	 */
	public String getAppTransNo() {
		return appTransNo;
	}

	/**
	 * @param appTransNo
	 *            the appTransNo to set
	 */
	public void setAppTransNo(String appTransNo) {
		this.appTransNo = appTransNo;
	}

	/**
	 * @return the payUResponse
	 */
	public PayUResponse getPayUResponse() {
		return payUResponse;
	}

	/**
	 * @param payUResponse
	 *            the payUResponse to set
	 */
	public void setPayUResponse(PayUResponse payUResponse) {
		this.payUResponse = payUResponse;
	}

	/**
	 * @return the serviceCode
	 */
	public String getModuleCode() {
		return moduleCode;
	}

	/**
	 * @param serviceCode
	 *            the serviceCode to set
	 */
	public void setModuleCode(String serviceCode) {
		this.moduleCode = serviceCode;
	}

	/**
	 * @return the bankTranRefNumber
	 */
	public String getBankTranRefNumber() {
		return bankTranRefNumber;
	}

	/**
	 * @param bankTranRefNumber
	 *            the bankTranRefNumber to set
	 */
	public void setBankTranRefNumber(String bankTranRefNumber) {
		this.bankTranRefNumber = bankTranRefNumber;
	}

	/**
	 * @return the message
	 */
	/**
	 * @return the paymentStatus
	 */
	public PayStatusEnum getPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * @param paymentStatus
	 *            the paymentStatus to set
	 */
	public void setPaymentStatus(PayStatusEnum paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	/**
	 * @return the isHashValidationSucess
	 */
	public Boolean getIsHashValidationSucess() {
		return isHashValidationSucess;
	}

	/**
	 * @param isHashValidationSucess
	 *            the isHashValidationSucess to set
	 */
	public void setIsHashValidationSucess(Boolean isHashValidationSucess) {
		this.isHashValidationSucess = isHashValidationSucess;
	}

	/**
	 * @return the sbiResponce
	 */
	public SBIResponce getSbiResponce() {
		return sbiResponce;
	}

	/**
	 * @param sbiResponce the sbiResponce to set
	 */
	public void setSbiResponce(SBIResponce sbiResponce) {
		this.sbiResponce = sbiResponce;
	}

	public Boolean getIsAgreeToEnablePayment() {
		return isAgreeToEnablePayment;
	}

	public void setIsAgreeToEnablePayment(Boolean isAgreeToEnablePayment) {
		this.isAgreeToEnablePayment = isAgreeToEnablePayment;
	}

	/**
	 * @return the cfmsResponce
	 */
	public CFMSResponce getCfmsResponce() {
		return cfmsResponce;
	}

	/**
	 * @param cfmsResponce the cfmsResponce to set
	 */
	public void setCfmsResponce(CFMSResponce cfmsResponce) {
		this.cfmsResponce = cfmsResponce;
	}

	/**
	 * @return the cfmsGatewayResponceMap
	 */
	public Map<String, String> getCfmsGatewayResponceMap() {
		return cfmsGatewayResponceMap;
	}

	/**
	 * @param cfmsGatewayResponceMap the cfmsGatewayResponceMap to set
	 */
	public void setCfmsGatewayResponceMap(Map<String, String> cfmsGatewayResponceMap) {
		this.cfmsGatewayResponceMap = cfmsGatewayResponceMap;
	}

	public PaymentVerifyRequest getPaymentVerifyRequest() {
		return paymentVerifyRequest;
	}

	public void setPaymentVerifyRequest(PaymentVerifyRequest paymentVerifyRequest) {
		this.paymentVerifyRequest = paymentVerifyRequest;
	}

	/**
	 * @return the isCancelledTransaction
	 */
	public Boolean getIsCancelledTransaction() {
		return isCancelledTransaction;
	}

	/**
	 * @param isCancelledTransaction the isCancelledTransaction to set
	 */
	public void setIsCancelledTransaction(Boolean isCancelledTransaction) {
		this.isCancelledTransaction = isCancelledTransaction;
	}

	/**
	 * @return the isDoubleVerified
	 */
	public Boolean getIsDoubleVerified() {
		return isDoubleVerified;
	}

	/**
	 * @param isDoubleVerified the isDoubleVerified to set
	 */
	public void setIsDoubleVerified(Boolean isDoubleVerified) {
		this.isDoubleVerified = isDoubleVerified;
	}

	/**
	 * @return the responceString
	 */
	public String getResponceString() {
		return responceString;
	}

	/**
	 * @param responceString the responceString to set
	 */
	public void setResponceString(String responceString) {
		this.responceString = responceString;
	}

	public Boolean getIsRequestFromFinacier() {
		return isRequestFromFinacier;
	}

	public void setIsRequestFromFinacier(Boolean isRequestFromFinacier) {
		this.isRequestFromFinacier = isRequestFromFinacier;
	}
	
	
	
}
