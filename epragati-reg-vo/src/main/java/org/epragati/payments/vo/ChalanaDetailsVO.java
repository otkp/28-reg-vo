package org.epragati.payments.vo;

import java.time.LocalDate;

import org.epragati.util.payment.GatewayTypeEnum;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ChalanaDetailsVO {

	private Long chalanaNo;

	private String challanNo;

	private String applicationNo;

	private GatewayTypeEnum gateWayType;

	private String module;

	private String amount;

	private String tresuryName;

	private String type;
	
	private String vcrNo;

	private String mviName;

	private String regNo;

	private String oldChallanNo;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate bookedDate;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTresuryName() {
		return tresuryName;
	}

	public void setTresuryName(String tresuryName) {
		this.tresuryName = tresuryName;
	}

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate challanDate;

	private String bankName;

	public LocalDate getChallanDate() {
		return challanDate;
	}

	public void setChallanDate(LocalDate challanDate) {
		this.challanDate = challanDate;
	}

	public String getBankName() {
		return bankName;
	}

	public String getChallanNo() {
		return challanNo;
	}

	public void setChallanNo(String challanNo) {
		this.challanNo = challanNo;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return the chalanaNo
	 */
	public Long getChalanaNo() {
		return chalanaNo;
	}

	/**
	 * @param chalanaNo the chalanaNo to set
	 */
	public void setChalanaNo(Long chalanaNo) {
		this.chalanaNo = chalanaNo;
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
	 * @return the gateWayType
	 */
	public GatewayTypeEnum getGateWayType() {
		return gateWayType;
	}

	/**
	 * @param gateWayType the gateWayType to set
	 */
	public void setGateWayType(GatewayTypeEnum gateWayType) {
		this.gateWayType = gateWayType;
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
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getVcrNo() {
		return vcrNo;
	}

	public void setVcrNo(String vcrNo) {
		this.vcrNo = vcrNo;
	}

	public String getMviName() {
		return mviName;
	}

	public void setMviName(String mviName) {
		this.mviName = mviName;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getOldChallanNo() {
		return oldChallanNo;
	}

	public void setOldChallanNo(String oldChallanNo) {
		this.oldChallanNo = oldChallanNo;
	}

	public LocalDate getBookedDate() {
		return bookedDate;
	}

	public void setBookedDate(LocalDate bookedDate) {
		this.bookedDate = bookedDate;
	}
	
	
	
}
