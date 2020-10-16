package org.epragati.sn.vo;

import org.epragati.constants.CovCategory;
import org.epragati.util.BidNumberType;
import org.epragati.util.NumberPoolStatus;

public class LeftOverVO {
	private Integer prNumber;

	private BidNumberType numberType;

	private NumberPoolStatus poolStatus;
	private String officeCode;
	
	private String officeNumberSeries;
	
	private String prSeries;
	private Integer serviceFee;
	private Double totalAmount;
	private CovCategory regType;
	private String prNo;
	private Double cost;
	private String bidId;
	private Integer  bidParticipants;
	public Integer getBidParticipants() {
		return bidParticipants;
	}
	public void setBidParticipants(Integer bidParticipants) {
		this.bidParticipants = bidParticipants;
	}
	public String getBidId() {
		return bidId;
	}
	public void setBidId(String bidId) {
		this.bidId = bidId;
	}
	public Integer getServiceFee() {
		return serviceFee;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setServiceFee(Integer serviceFee) {
		this.serviceFee = serviceFee;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public Integer getPrNumber() {
		return prNumber;
	}
	public BidNumberType getNumberType() {
		return numberType;
	}
	public NumberPoolStatus getPoolStatus() {
		return poolStatus;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public String getOfficeNumberSeries() {
		return officeNumberSeries;
	}
	public String getPrSeries() {
		return prSeries;
	}
	public CovCategory getRegType() {
		return regType;
	}
	public String getPrNo() {
		return prNo;
	}
	public Double getCost() {
		return cost;
	}
	public void setPrNumber(Integer prNumber) {
		this.prNumber = prNumber;
	}
	public void setNumberType(BidNumberType numberType) {
		this.numberType = numberType;
	}
	public void setPoolStatus(NumberPoolStatus poolStatus) {
		this.poolStatus = poolStatus;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public void setOfficeNumberSeries(String officeNumberSeries) {
		this.officeNumberSeries = officeNumberSeries;
	}
	public void setPrSeries(String prSeries) {
		this.prSeries = prSeries;
	}
	public void setRegType(CovCategory regType) {
		this.regType = regType;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "LeftOverVO [prNumber=" + prNumber + ", numberType=" + numberType + ", poolStatus=" + poolStatus
				+ ", officeCode=" + officeCode + ", officeNumberSeries=" + officeNumberSeries + ", prSeries=" + prSeries
				+ ", regType=" + regType + ", prNo=" + prNo + ", cost=" + cost + "]";
	}

}
