package org.epragati.regservice.vo;

import java.time.LocalDate;

import org.epragati.tax.vo.TaxTypeEnum;
import org.epragati.tax.vo.TaxTypeEnum.CfstTaxType;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CfstTaxDetailsVO {

	private String vehicleNo;
	private String classOfVehicle;
	private TaxTypeEnum.CfstTaxType taxPaymentPrd;
	private String taxPaidOffCd;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate taxValfrom;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate taxValTo;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate taxPaymentDt;
	private Long taxAmt;
	private Long penaltyAmt;
	private Long serviceFee;
	private Long collectedAmt;
	private String applicationNo;
	private Long taxArrears;
	private Long penaltyArrears;
	private Long cessFee;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate cessPeriodFrom;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate cessPeriodEnd;
	private Long  greenTaxAmount;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate greenTaxPeriodFrom;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate greenTaxPeriodEnd;
	private String	permitType;
	private TaxTypeEnum.TaxPayType payTaxType;
	private Boolean applicationNotFound;
	private String ipAddress;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate otherStateTaxValUpto;
	/**
	 * @return the vehicleNo
	 */
	public String getVehicleNo() {
		return vehicleNo;
	}
	/**
	 * @param vehicleNo the vehicleNo to set
	 */
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	/**
	 * @return the classOfVehicle
	 */
	public String getClassOfVehicle() {
		return classOfVehicle;
	}
	/**
	 * @param classOfVehicle the classOfVehicle to set
	 */
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}
	/**
	 * @return the taxPaymentPrd
	 */
	public TaxTypeEnum.CfstTaxType getTaxPaymentPrd() {
		return taxPaymentPrd;
	}
	/**
	 * @param taxPaymentPrd the taxPaymentPrd to set
	 */
	public void setTaxPaymentPrd(TaxTypeEnum.CfstTaxType taxPaymentPrd) {
		this.taxPaymentPrd = taxPaymentPrd;
	}
	/**
	 * @return the taxPaidOffCd
	 */
	public String getTaxPaidOffCd() {
		return taxPaidOffCd;
	}
	/**
	 * @param taxPaidOffCd the taxPaidOffCd to set
	 */
	public void setTaxPaidOffCd(String taxPaidOffCd) {
		this.taxPaidOffCd = taxPaidOffCd;
	}
	/**
	 * @return the taxValfrom
	 */
	public LocalDate getTaxValfrom() {
		return taxValfrom;
	}
	/**
	 * @param taxValfrom the taxValfrom to set
	 */
	public void setTaxValfrom(LocalDate taxValfrom) {
		this.taxValfrom = taxValfrom;
	}
	/**
	 * @return the taxValTo
	 */
	public LocalDate getTaxValTo() {
		return taxValTo;
	}
	/**
	 * @param taxValTo the taxValTo to set
	 */
	public void setTaxValTo(LocalDate taxValTo) {
		this.taxValTo = taxValTo;
	}
	/**
	 * @return the taxPaymentDt
	 */
	public LocalDate getTaxPaymentDt() {
		return taxPaymentDt;
	}
	/**
	 * @param taxPaymentDt the taxPaymentDt to set
	 */
	public void setTaxPaymentDt(LocalDate taxPaymentDt) {
		this.taxPaymentDt = taxPaymentDt;
	}
	/**
	 * @return the taxAmt
	 */
	public Long getTaxAmt() {
		return taxAmt;
	}
	/**
	 * @param taxAmt the taxAmt to set
	 */
	public void setTaxAmt(Long taxAmt) {
		this.taxAmt = taxAmt;
	}
	/**
	 * @return the penaltyAmt
	 */
	public Long getPenaltyAmt() {
		return penaltyAmt;
	}
	/**
	 * @param penaltyAmt the penaltyAmt to set
	 */
	public void setPenaltyAmt(Long penaltyAmt) {
		this.penaltyAmt = penaltyAmt;
	}
	/**
	 * @return the serviceFee
	 */
	public Long getServiceFee() {
		return serviceFee;
	}
	/**
	 * @param serviceFee the serviceFee to set
	 */
	public void setServiceFee(Long serviceFee) {
		this.serviceFee = serviceFee;
	}
	/**
	 * @return the collectedAmt
	 */
	public Long getCollectedAmt() {
		return collectedAmt;
	}
	/**
	 * @param collectedAmt the collectedAmt to set
	 */
	public void setCollectedAmt(Long collectedAmt) {
		this.collectedAmt = collectedAmt;
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
	 * @return the cessFee
	 */
	public Long getCessFee() {
		return cessFee;
	}
	/**
	 * @param cessFee the cessFee to set
	 */
	public void setCessFee(Long cessFee) {
		this.cessFee = cessFee;
	}
	/**
	 * @return the cessPeriodFrom
	 */
	public LocalDate getCessPeriodFrom() {
		return cessPeriodFrom;
	}
	/**
	 * @param cessPeriodFrom the cessPeriodFrom to set
	 */
	public void setCessPeriodFrom(LocalDate cessPeriodFrom) {
		this.cessPeriodFrom = cessPeriodFrom;
	}
	/**
	 * @return the cessPeriodEnd
	 */
	public LocalDate getCessPeriodEnd() {
		return cessPeriodEnd;
	}
	/**
	 * @param cessPeriodEnd the cessPeriodEnd to set
	 */
	public void setCessPeriodEnd(LocalDate cessPeriodEnd) {
		this.cessPeriodEnd = cessPeriodEnd;
	}
	/**
	 * @return the greenTaxAmount
	 */
	public Long getGreenTaxAmount() {
		return greenTaxAmount;
	}
	/**
	 * @param greenTaxAmount the greenTaxAmount to set
	 */
	public void setGreenTaxAmount(Long greenTaxAmount) {
		this.greenTaxAmount = greenTaxAmount;
	}
	/**
	 * @return the greenTaxPeriodFrom
	 */
	public LocalDate getGreenTaxPeriodFrom() {
		return greenTaxPeriodFrom;
	}
	/**
	 * @param greenTaxPeriodFrom the greenTaxPeriodFrom to set
	 */
	public void setGreenTaxPeriodFrom(LocalDate greenTaxPeriodFrom) {
		this.greenTaxPeriodFrom = greenTaxPeriodFrom;
	}
	/**
	 * @return the greenTaxPeriodEnd
	 */
	public LocalDate getGreenTaxPeriodEnd() {
		return greenTaxPeriodEnd;
	}
	/**
	 * @param greenTaxPeriodEnd the greenTaxPeriodEnd to set
	 */
	public void setGreenTaxPeriodEnd(LocalDate greenTaxPeriodEnd) {
		this.greenTaxPeriodEnd = greenTaxPeriodEnd;
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
	public Boolean getApplicationNotFound() {
		return applicationNotFound;
	}
	public void setApplicationNotFound(Boolean applicationNotFound) {
		this.applicationNotFound = applicationNotFound;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public TaxTypeEnum.TaxPayType getPayTaxType() {
		return payTaxType;
	}
	public void setPayTaxType(TaxTypeEnum.TaxPayType payTaxType) {
		this.payTaxType = payTaxType;
	}
	/**
	 * @return the otherStateTaxValUpto
	 */
	public LocalDate getOtherStateTaxValUpto() {
		return otherStateTaxValUpto;
	}
	/**
	 * @param otherStateTaxValUpto the otherStateTaxValUpto to set
	 */
	public void setOtherStateTaxValUpto(LocalDate otherStateTaxValUpto) {
		this.otherStateTaxValUpto = otherStateTaxValUpto;
	}

	
	
	
}
