package org.epragati.master.vo;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.epragati.aadhaar.AadharDetailsResponseVO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * @author sairam.cheruku
 *
 */
@JsonInclude(Include.NON_NULL)
public class FinanceDetailsVO implements Serializable {

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

	private String comments;

	private String userId;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate fromDate;
	
	/**
	 * @return the fromDate
	 */
	public LocalDate getFromDate() {
		return fromDate;
	}

	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * @return the toDate
	 */
	public LocalDate getToDate() {
		return toDate;
	}

	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate toDate;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime lastUpdated;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime createdDate;

	private Integer quotationValue;

	private MasterFinanceTypeVO masterFinanceTypeVO;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate agreementDate;
	/*
	 * private String district; private String state; private String mandal;
	 * private String streetName; private String city;
	 */
	// private String financeType;
	private String prNo;
	
	private String trNo;

	private String doorNo;

	private DistrictVO district;

	private StateVO state;

	private MandalVO mandal;

	private PostOfficeVO pincode;

	private String streetName;

	private String city;

	private String otherStateDistrict;

	private String otherStateState;

	private String otherStateMandal;

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	@JsonFormat(pattern = "dd-MM-yyyy")
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
	 * @param agreementDate
	 *            the agreementDate to set
	 */
	public void setAgreementDate(LocalDate agreementDate) {
		this.agreementDate = agreementDate;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the district
	 */
	public DistrictVO getDistrict() {
		return district;
	}

	/**
	 * @param district
	 *            the district to set
	 */
	public void setDistrict(DistrictVO district) {
		this.district = district;
	}

	/**
	 * @return the state
	 */
	public StateVO getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(StateVO state) {
		this.state = state;
	}

	/**
	 * @return the mandal
	 */
	public MandalVO getMandal() {
		return mandal;
	}

	/**
	 * @param mandal
	 *            the mandal to set
	 */
	public void setMandal(MandalVO mandal) {
		this.mandal = mandal;
	}

	/**
	 * @return the pincode
	 */
	public PostOfficeVO getPincode() {
		return pincode;
	}

	/**
	 * @param pincode
	 *            the pincode to set
	 */
	public void setPincode(PostOfficeVO pincode) {
		this.pincode = pincode;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments
	 *            the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the doorNo
	 */
	public String getDoorNo() {
		return doorNo;
	}

	/**
	 * @param doorNo
	 *            the doorNo to set
	 */
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	/**
	 * @return the otherStateDistrict
	 */
	public String getOtherStateDistrict() {
		return otherStateDistrict;
	}

	/**
	 * @param otherStateDistrict
	 *            the otherStateDistrict to set
	 */
	public void setOtherStateDistrict(String otherStateDistrict) {
		this.otherStateDistrict = otherStateDistrict;
	}

	/**
	 * @return the otherStateState
	 */
	public String getOtherStateState() {
		return otherStateState;
	}

	/**
	 * @param otherStateState
	 *            the otherStateState to set
	 */
	public void setOtherStateState(String otherStateState) {
		this.otherStateState = otherStateState;
	}

	/**
	 * @return the otherStateMandal
	 */
	public String getOtherStateMandal() {
		return otherStateMandal;
	}

	/**
	 * @param otherStateMandal
	 *            the otherStateMandal to set
	 */
	public void setOtherStateMandal(String otherStateMandal) {
		this.otherStateMandal = otherStateMandal;
	}
	
	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

}
