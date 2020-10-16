package org.epragati.payments.vo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

import org.epragati.constants.OwnerTypeEnum;
import org.epragati.dealer.tradecert.TradeCertificateDealerVO;
import org.epragati.util.payment.GatewayTypeEnum;
import org.epragati.util.payment.ServiceEnum;
import org.epragati.vcr.vo.RegistrationVcrVo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlRootElement
@JsonInclude(Include.NON_NULL)
public class TransactionDetailVO {

	// for All
	private Double amount = 0.0;
	private String actualAmount;
	private Long cfmsTotal;

	/**
	 * @return the actualAmount
	 */
	public String getActualAmount() {
		return actualAmount;
	}

	/**
	 * @param actualAmount the actualAmount to set
	 */
	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
	}

	private String remiterName;
	private List<ClassOfVehiclesVO> covs;
	private GatewayTypeEnum gatewayType;
	private String formNumber;
	private Double servicesFeeAmt;
	private String sucessUrl;
	private String failureUrl;
	private String pendingUrl;
	private FeeDetailsVO feeDetailsVO;
	private Map<String, FeePartsDetailsVo> feePartsMap;
	private String officeCode;
	private List<ServiceEnum> serviceEnumList = new ArrayList<ServiceEnum>();
	private Set<Integer> serviceId;
	private String vehicleType;
	private String cov;
	private String weightType;
	private String paymentUrl;
	private String pgUrl;
	private String module;
	private String dlNumber;
	private Long taxAmount;
	private Long cesFee;
	private String taxType;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate taxvalidity;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate cesValidity;
	private Long penalty;
	private Long penaltyArrears;
	private Long taxArrears;
	private List<BreakPayments> breakPayments;
	private Boolean rejectionValue;
	private boolean isRtoSecRejected;
	private boolean isRtoRejectedIvcn;
	private OwnerTypeEnum ownerType;
	private boolean isCalculateFc;
	private boolean isChassesVehicle;
	private boolean isOtherState;
	private String regApplicationNo;
	private boolean isRequestToPay;
	private String seatingCapacity;

	// PayU
	private String firstName;
	private String email;
	private String phone;

	// SBI
	private HashMap<String, String> sbiResponseMap;
	private String sbiVerificationURL;
	private String marchantCode;
	private String encdata;
	private String sbiTransactionNumber;
	private String paymentTransactionNo;

	private String permitType;
	private String routeCode;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate slotDate;

	private boolean isToPayLateFeeForFC = Boolean.TRUE;
	private boolean isFcRenewal = Boolean.FALSE;
	private boolean isFcOtherStation = Boolean.FALSE;
	private boolean secondVehicleTaxPaid;
	// CFMS
	private String cfmsDc;
	private String cfmsRn;
	private String rid;
	private List<String> chList;
	private List<String> othList;

	private boolean isToPayLateFeeForRenewal = Boolean.TRUE;

	private Boolean isWeightAlt = Boolean.FALSE;

	private String purpose;
	private List<String> listOfVcrs;

	private RegistrationVcrVo input;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate createdDate;

	@JsonFormat(pattern = "hh:mm:ss")
	private LocalTime createdTime;

	private String permitNumber;
	private String permitVehiclePrNo;

	private boolean skipTaxForTPSP;
	private Boolean specificVcrPayment= Boolean.FALSE;
	/**
	 * used for trade certificate
	 */
	private List<TradeCertificateDealerVO> tradeCertificate;
	
	/**
	 * @return the skipTaxForTPSP
	 */
	public boolean isSkipTaxForTPSP() {
		return skipTaxForTPSP;
	}

	/**
	 * @param skipTaxForTPSP the skipTaxForTPSP to set
	 */
	public void setSkipTaxForTPSP(boolean skipTaxForTPSP) {
		this.skipTaxForTPSP = skipTaxForTPSP;
	}

	/**
	 * @return the isChassesVehicle
	 */
	public boolean isChassesVehicle() {
		return isChassesVehicle;
	}

	/**
	 * @param isChassesVehicle the isChassesVehicle to set
	 */
	public void setChassesVehicle(boolean isChassesVehicle) {
		this.isChassesVehicle = isChassesVehicle;
	}

	/**
	 * @return the isCalculateFc
	 */
	public boolean isCalculateFc() {
		return isCalculateFc;
	}

	/**
	 * @param isCalculateFc the isCalculateFc to set
	 */
	public void setCalculateFc(boolean isCalculateFc) {
		this.isCalculateFc = isCalculateFc;
	}

	/**
	 * @return the pgUrl
	 */
	public String getPgUrl() {
		return pgUrl;
	}

	/**
	 * @param pgUrl the pgUrl to set
	 */
	public void setPgUrl(String pgUrl) {
		this.pgUrl = pgUrl;
	}

	/**
	 * @return the vehicleType
	 */
	public String getVehicleType() {
		return vehicleType;
	}

	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	/**
	 * @return the cov
	 */
	public String getCov() {
		return cov;
	}

	/**
	 * @param cov the cov to set
	 */
	public void setCov(String cov) {
		this.cov = cov;
	}

	/**
	 * @return the serviceId
	 */
	public Set<Integer> getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(Set<Integer> serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the isRtoRejectedIvcn
	 */
	public boolean isRtoRejectedIvcn() {
		return isRtoRejectedIvcn;
	}

	/**
	 * @param isRtoRejectedIvcn the isRtoRejectedIvcn to set
	 */
	public void setRtoRejectedIvcn(boolean isRtoRejectedIvcn) {
		this.isRtoRejectedIvcn = isRtoRejectedIvcn;
	}

	/**
	 * @return the sbiTransactionNumber
	 */
	public String getSbiTransactionNumber() {
		return sbiTransactionNumber;
	}

	/**
	 * @param sbiTransactionNumber the sbiTransactionNumber to set
	 */
	public void setSbiTransactionNumber(String sbiTransactionNumber) {
		this.sbiTransactionNumber = sbiTransactionNumber;
	}

	public OwnerTypeEnum getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(OwnerTypeEnum ownerType) {
		this.ownerType = ownerType;
	}

	/**
	 * @return the isRtoSecRejected
	 */
	public boolean isRtoSecRejected() {
		return isRtoSecRejected;
	}

	/**
	 * @param isRtoSecRejected the isRtoSecRejected to set
	 */
	public void setRtoSecRejected(boolean isRtoSecRejected) {
		this.isRtoSecRejected = isRtoSecRejected;
	}

	/**
	 * @return the breakPayments
	 */
	public List<BreakPayments> getBreakPayments() {
		return breakPayments;
	}

	/**
	 * @param breakPayments the breakPayments to set
	 */
	public void setBreakPayments(List<BreakPayments> breakPayments) {
		this.breakPayments = breakPayments;
	}

	/**
	 * @return the taxAmount
	 */
	public Long getTaxAmount() {
		return taxAmount;
	}

	/**
	 * @param taxAmount the taxAmount to set
	 */
	public void setTaxAmount(Long taxAmount) {
		this.taxAmount = taxAmount;
	}

	/**
	 * @return the cesFee
	 */
	public Long getCesFee() {
		return cesFee;
	}

	/**
	 * @param cesFee the cesFee to set
	 */
	public void setCesFee(Long cesFee) {
		this.cesFee = cesFee;
	}

	/**
	 * @return the taxType
	 */
	public String getTaxType() {
		return taxType;
	}

	/**
	 * @param taxType the taxType to set
	 */
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	/**
	 * @return the gatewayType
	 */
	public GatewayTypeEnum getGatewayType() {
		return gatewayType;
	}

	/**
	 * @param gatewayType the gatewayType to set
	 */
	public void setGatewayType(GatewayTypeEnum gatewayType) {
		this.gatewayType = gatewayType;
	}

	/**
	 * @return the weightType
	 */
	public String getWeightType() {
		return weightType;
	}

	/**
	 * @param weightType the weightType to set
	 */
	public void setWeightType(String weightType) {
		this.weightType = weightType;
	}

	private String productInfo;
	private String key;
	private String hash;
	private PayUTransactionDetails payUTransactionDetails;
	private String txnid;
	private String serviceProvider;
	private String dlNo;
	private String issuedOfficeCode;

	/**
	 * @return the sbiResponseMap
	 */
	public HashMap<String, String> getSbiResponseMap() {
		return sbiResponseMap;
	}

	/**
	 * @param sbiResponseMap the sbiResponseMap to set
	 */
	public void setSbiResponseMap(HashMap<String, String> sbiResponseMap) {
		this.sbiResponseMap = sbiResponseMap;
	}

	/**
	 * @return the sbiVerificationURL
	 */
	public String getSbiVerificationURL() {
		return sbiVerificationURL;
	}

	/**
	 * @param sbiVerificationURL the sbiVerificationURL to set
	 */
	public void setSbiVerificationURL(String sbiVerificationURL) {
		this.sbiVerificationURL = sbiVerificationURL;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @return the remiterName
	 */
	public String getRemiterName() {
		return remiterName;
	}

	/**
	 * @param remiterName the remiterName to set
	 */
	public void setRemiterName(String remiterName) {
		this.remiterName = remiterName;
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
	 * @return the gatewayType
	 */
	public GatewayTypeEnum getGatewayTypeEnum() {
		return gatewayType;
	}

	/**
	 * @param gatewayType the gatewayType to set
	 */
	public void setGatewayTypeEnum(GatewayTypeEnum gatewayTypeEnum) {
		this.gatewayType = gatewayTypeEnum;
	}

	/**
	 * @return the formNumber
	 */
	public String getFormNumber() {
		return formNumber;
	}

	/**
	 * @param formNumber the formNumber to set
	 */
	public void setFormNumber(String formNumber) {
		this.formNumber = formNumber;
	}

	/**
	 * @return the sucessUrl
	 */
	public String getSucessUrl() {
		return sucessUrl;
	}

	/**
	 * @param sucessUrl the sucessUrl to set
	 */
	public void setSucessUrl(String sucessUrl) {
		this.sucessUrl = sucessUrl;
	}

	/**
	 * @return the failureUrl
	 */
	public String getFailureUrl() {
		return failureUrl;
	}

	/**
	 * @param failureUrl the failureUrl to set
	 */
	public void setFailureUrl(String failureUrl) {
		this.failureUrl = failureUrl;
	}

	/**
	 * @return the pendingUrl
	 */
	public String getPendingUrl() {
		return pendingUrl;
	}

	/**
	 * @param pendingUrl the pendingUrl to set
	 */
	public void setPendingUrl(String pendingUrl) {
		this.pendingUrl = pendingUrl;
	}

	/**
	 * @return the feeDetailsVO
	 */
	public FeeDetailsVO getFeeDetailsVO() {
		return feeDetailsVO;
	}

	/**
	 * @param feeDetailsVO the feeDetailsVO to set
	 */
	public void setFeeDetailsVO(FeeDetailsVO feeDetailsVO) {
		this.feeDetailsVO = feeDetailsVO;
	}

	/**
	 * @return the feePartsMap
	 */
	public Map<String, FeePartsDetailsVo> getFeePartsMap() {
		return feePartsMap;
	}

	/**
	 * @param feePartsMap the feePartsMap to set
	 */
	public void setFeePartsMap(Map<String, FeePartsDetailsVo> feePartsMap) {
		this.feePartsMap = feePartsMap;
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
	 * @return the serviceEnumList
	 */
	public List<ServiceEnum> getServiceEnumList() {
		return serviceEnumList;
	}

	/**
	 * @param serviceEnumList the serviceEnumList to set
	 */
	public void setServiceEnumList(List<ServiceEnum> serviceEnumList) {
		this.serviceEnumList = serviceEnumList;
	}

	/**
	 * @return the paymentUrl
	 */
	public String getPaymentUrl() {
		return paymentUrl;
	}

	/**
	 * @param paymentUrl the paymentUrl to set
	 */
	public void setPaymentUrl(String paymentUrl) {
		this.paymentUrl = paymentUrl;
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
	 * @return the dlNumber
	 */
	public String getDlNumber() {
		return dlNumber;
	}

	/**
	 * @param dlNumber the dlNumber to set
	 */
	public void setDlNumber(String dlNumber) {
		this.dlNumber = dlNumber;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the productInfo
	 */
	public String getProductInfo() {
		return productInfo;
	}

	/**
	 * @param productInfo the productInfo to set
	 */
	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the hash
	 */
	public String getHash() {
		return hash;
	}

	/**
	 * @param hash the hash to set
	 */
	public void setHash(String hash) {
		this.hash = hash;
	}

	/**
	 * @return the payUTransactionDetails
	 */
	public PayUTransactionDetails getPayUTransactionDetails() {
		return payUTransactionDetails;
	}

	/**
	 * @param payUTransactionDetails the payUTransactionDetails to set
	 */
	public void setPayUTransactionDetails(PayUTransactionDetails payUTransactionDetails) {
		this.payUTransactionDetails = payUTransactionDetails;
	}

	/**
	 * @return the txnid
	 */
	public String getTxnid() {
		return txnid;
	}

	/**
	 * @param txnid the txnid to set
	 */
	public void setTxnid(String txnid) {
		this.txnid = txnid;
	}

	/**
	 * @return the serviceProvider
	 */
	public String getServiceProvider() {
		return serviceProvider;
	}

	/**
	 * @param serviceProvider the serviceProvider to set
	 */
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	/**
	 * @return the dlNo
	 */
	public String getDlNo() {
		return dlNo;
	}

	/**
	 * @param dlNo the dlNo to set
	 */
	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}

	/**
	 * @return the issuedOfficeCode
	 */
	public String getIssuedOfficeCode() {
		return issuedOfficeCode;
	}

	/**
	 * @param issuedOfficeCode the issuedOfficeCode to set
	 */
	public void setIssuedOfficeCode(String issuedOfficeCode) {
		this.issuedOfficeCode = issuedOfficeCode;
	}

	/**
	 * @return the marchantCode
	 */
	public String getMarchantCode() {
		return marchantCode;
	}

	/**
	 * @param marchantCode the marchantCode to set
	 */
	public void setMarchantCode(String marchantCode) {
		this.marchantCode = marchantCode;
	}

	/**
	 * @return the encdata
	 */
	public String getEncdata() {
		return encdata;
	}

	/**
	 * @param encdata the encdata to set
	 */
	public void setEncdata(String encdata) {
		this.encdata = encdata;
	}

	/**
	 * @return the rejectionValue
	 */
	public Boolean getRejectionValue() {
		return rejectionValue;
	}

	/**
	 * @param rejectionValue the rejectionValue to set
	 */
	public void setRejectionValue(Boolean rejectionValue) {
		this.rejectionValue = rejectionValue;
	}

	public Double getServicesFeeAmt() {
		return servicesFeeAmt;
	}

	public void setServicesFeeAmt(Double servicesFeeAmt) {
		this.servicesFeeAmt = servicesFeeAmt;
	}

	/**
	 * @return the isOtherState
	 */
	public boolean isOtherState() {
		return isOtherState;
	}

	/**
	 * @param isOtherState the isOtherState to set
	 */
	public void setOtherState(boolean isOtherState) {
		this.isOtherState = isOtherState;
	}

	/**
	 * @return the regApplicationNo
	 */
	public String getRegApplicationNo() {
		return regApplicationNo;
	}

	/**
	 * @param regApplicationNo the regApplicationNo to set
	 */
	public void setRegApplicationNo(String regApplicationNo) {
		this.regApplicationNo = regApplicationNo;
	}

	/**
	 * @return the isRequestToPay
	 */
	public boolean isRequestToPay() {
		return isRequestToPay;
	}

	/**
	 * @param isRequestToPay the isRequestToPay to set
	 */
	public void setRequestToPay(boolean isRequestToPay) {
		this.isRequestToPay = isRequestToPay;
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
	 * @return the taxvalidity
	 */
	public LocalDate getTaxvalidity() {
		return taxvalidity;
	}

	/**
	 * @param taxvalidity the taxvalidity to set
	 */
	public void setTaxvalidity(LocalDate taxvalidity) {
		this.taxvalidity = taxvalidity;
	}

	/**
	 * @return the cesValidity
	 */
	public LocalDate getCesValidity() {
		return cesValidity;
	}

	/**
	 * @param cesValidity the cesValidity to set
	 */
	public void setCesValidity(LocalDate cesValidity) {
		this.cesValidity = cesValidity;
	}

	/**
	 * @return the penalty
	 */
	public Long getPenalty() {
		return penalty;
	}

	/**
	 * @param penalty the penalty to set
	 */
	public void setPenalty(Long penalty) {
		this.penalty = penalty;
	}

	/**
	 * @return the penaltyArrears
	 */
	public Long getPenaltyArrears() {
		return penaltyArrears;
	}

	/**
	 * @param penaltyArrears the penaltyArrears to set
	 */
	public void setPenaltyArrears(Long penaltyArrears) {
		this.penaltyArrears = penaltyArrears;
	}

	/**
	 * @return the taxArrears
	 */
	public Long getTaxArrears() {
		return taxArrears;
	}

	/**
	 * @param taxArrears the taxArrears to set
	 */
	public void setTaxArrears(Long taxArrears) {
		this.taxArrears = taxArrears;
	}

	/**
	 * @return the permitType
	 */
	public String getPermitType() {
		return permitType;
	}

	/**
	 * @param permitType the permitType to set
	 */
	public void setPermitType(String permitType) {
		this.permitType = permitType;
	}

	/**
	 * @return the slotDate
	 */
	public LocalDate getSlotDate() {
		return slotDate;
	}

	/**
	 * @param slotDate the slotDate to set
	 */
	public void setSlotDate(LocalDate slotDate) {
		this.slotDate = slotDate;
	}

	/**
	 * @return the isToPayLateFeeForFC
	 */
	public boolean isToPayLateFeeForFC() {
		return isToPayLateFeeForFC;
	}

	/**
	 * @param isToPayLateFeeForFC the isToPayLateFeeForFC to set
	 */
	public void setToPayLateFeeForFC(boolean isToPayLateFeeForFC) {
		this.isToPayLateFeeForFC = isToPayLateFeeForFC;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "TransactionDetailVO [amount=" + amount + ", remiterName=" + remiterName + ", covs=" + covs
				+ ", gatewayType=" + gatewayType + ", formNumber=" + formNumber + ", sucessUrl=" + sucessUrl
				+ ", failureUrl=" + failureUrl + ", pendingUrl=" + pendingUrl + ", feeDetailsVO=" + feeDetailsVO
				+ ", feePartsMap=" + feePartsMap + ", officeCode=" + officeCode + ", serviceEnumList=" + serviceEnumList
				+ ", paymentUrl=" + paymentUrl + ", module=" + module + ", dlNumber=" + dlNumber + ", weightType="
				+ weightType + ", taxAmount=" + taxAmount + ", cesFee=" + cesFee + ", taxType=" + taxType
				+ ", breakPayments=" + breakPayments + ", rejectionValue=" + rejectionValue + ", firstName=" + firstName
				+ ", email=" + email + ", phone=" + phone + ", sbiResponseMap=" + sbiResponseMap
				+ ", sbiVerificationURL=" + sbiVerificationURL + ", marchantCode=" + marchantCode + ", encdata="
				+ encdata + ", productInfo=" + productInfo + ", key=" + key + ", hash=" + hash
				+ ", payUTransactionDetails=" + payUTransactionDetails + ", txnid=" + txnid + ", serviceProvider="
				+ serviceProvider + ", dlNo=" + dlNo + ", issuedOfficeCode=" + issuedOfficeCode + "]";
	}

	/**
	 * @return the cfmsDc
	 */
	public String getCfmsDc() {
		return cfmsDc;
	}

	/**
	 * @param cfmsDc the cfmsDc to set
	 */
	public void setCfmsDc(String cfmsDc) {
		this.cfmsDc = cfmsDc;
	}

	/**
	 * @return the cfmsRn
	 */
	public String getCfmsRn() {
		return cfmsRn;
	}

	/**
	 * @param cfmsRn the cfmsRn to set
	 */
	public void setCfmsRn(String cfmsRn) {
		this.cfmsRn = cfmsRn;
	}

	/**
	 * @return the rid
	 */
	public String getRid() {
		return rid;
	}

	/**
	 * @param rid the rid to set
	 */
	public void setRid(String rid) {
		this.rid = rid;
	}

	/**
	 * @return the chList
	 */
	public List<String> getChList() {
		return chList;
	}

	/**
	 * @param chList the chList to set
	 */
	public void setChList(List<String> chList) {
		this.chList = chList;
	}

	/**
	 * @return the othList
	 */
	public List<String> getOthList() {
		return othList;
	}

	/**
	 * @param othList the othList to set
	 */
	public void setOthList(List<String> othList) {
		this.othList = othList;
	}

	/**
	 * @return the isFcRenewal
	 */
	public boolean isFcRenewal() {
		return isFcRenewal;
	}

	/**
	 * @param isFcRenewal the isFcRenewal to set
	 */
	public void setFcRenewal(boolean isFcRenewal) {
		this.isFcRenewal = isFcRenewal;
	}

	/**
	 * @return the isFcOtherStation
	 */
	public boolean isFcOtherStation() {
		return isFcOtherStation;
	}

	/**
	 * @param isFcOtherStation the isFcOtherStation to set
	 */
	public void setFcOtherStation(boolean isFcOtherStation) {
		this.isFcOtherStation = isFcOtherStation;
	}

	/**
	 * @return the seatingCapacity
	 */
	public String getSeatingCapacity() {
		return seatingCapacity;
	}

	/**
	 * @param seatingCapacity the seatingCapacity to set
	 */
	public void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	/**
	 * @return the routeCode
	 */
	public String getRouteCode() {
		return routeCode;
	}

	/**
	 * @param routeCode the routeCode to set
	 */
	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

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

	public boolean isToPayLateFeeForRenewal() {
		return isToPayLateFeeForRenewal;
	}

	public void setToPayLateFeeForRenewal(boolean isToPayLateFeeForRenewal) {
		this.isToPayLateFeeForRenewal = isToPayLateFeeForRenewal;
	}

	/**
	 * @return the cfmsTotal
	 */
	public Long getCfmsTotal() {
		return cfmsTotal;
	}

	/**
	 * @param cfmsTotal the cfmsTotal to set
	 */
	public void setCfmsTotal(Long cfmsTotal) {
		this.cfmsTotal = cfmsTotal;
	}

	public Boolean getIsWeightAlt() {
		return isWeightAlt;
	}

	public void setIsWeightAlt(Boolean isWeightAlt) {
		this.isWeightAlt = isWeightAlt;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public List<String> getListOfVcrs() {
		return listOfVcrs;
	}

	public void setListOfVcrs(List<String> listOfVcrs) {
		this.listOfVcrs = listOfVcrs;
	}

	public RegistrationVcrVo getInput() {
		return input;
	}

	public void setInput(RegistrationVcrVo input) {
		this.input = input;
	}

	/**
	 * @return the createdDate
	 */
	public LocalDate getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the createdTime
	 */
	public LocalTime getCreatedTime() {
		return createdTime;
	}

	/**
	 * @param createdTime the createdTime to set
	 */
	public void setCreatedTime(LocalTime createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * @return the permitNumber
	 */
	public String getPermitNumber() {
		return permitNumber;
	}

	/**
	 * @param permitNumber the permitNumber to set
	 */
	public void setPermitNumber(String permitNumber) {
		this.permitNumber = permitNumber;
	}

	public String getPermitVehiclePrNo() {
		return permitVehiclePrNo;
	}

	public void setPermitVehiclePrNo(String permitVehiclePrNo) {
		this.permitVehiclePrNo = permitVehiclePrNo;
	}

	public List<TradeCertificateDealerVO> getTradeCertificate() {
		return tradeCertificate;
	}

	public void setTradeCertificate(List<TradeCertificateDealerVO> tradeCertificate) {
		this.tradeCertificate = tradeCertificate;
	}
	
	private String issuedBy;
	
	private String forwardRoute;
	
	private String returnRoute;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validFrom;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validTo;

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

	/**
	 * @return the forwardRoute
	 */
	public String getForwardRoute() {
		return forwardRoute;
	}

	/**
	 * @param forwardRoute the forwardRoute to set
	 */
	public void setForwardRoute(String forwardRoute) {
		this.forwardRoute = forwardRoute;
	}

	/**
	 * @return the returnRoute
	 */
	public String getReturnRoute() {
		return returnRoute;
	}

	/**
	 * @param returnRoute the returnRoute to set
	 */
	public void setReturnRoute(String returnRoute) {
		this.returnRoute = returnRoute;
	}

	/**
	 * @return the validFrom
	 */
	public LocalDate getValidFrom() {
		return validFrom;
	}

	/**
	 * @param validFrom the validFrom to set
	 */
	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}

	/**
	 * @return the validTo
	 */
	public LocalDate getValidTo() {
		return validTo;
	}

	/**
	 * @param validTo the validTo to set
	 */
	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}

	public Boolean getSpecificVcrPayment() {
		return specificVcrPayment;
	}

	public void setSpecificVcrPayment(Boolean specificVcrPayment) {
		this.specificVcrPayment = specificVcrPayment;
	}
	
}
