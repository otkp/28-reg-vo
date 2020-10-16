package org.epragati.sn.vo;

import org.epragati.util.BidNumberType;
import org.epragati.util.NumberPoolStatus;

public class NumberSeries {

	private Integer number;
	private Short numberSum;
	private BidNumberType numberType;
	private Double amount;
	private String bidNumberDtlsId;
	private Integer participantsCount;
	private NumberPoolStatus status;
	private String prNo;
	
	

	/**
	 * @return the status
	 */
	public NumberPoolStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(NumberPoolStatus status) {
		this.status = status;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Short getNumberSum() {
		return numberSum;
	}

	public void setNumberSum(Short numberSum) {
		this.numberSum = numberSum;
	}

	public BidNumberType getNumberType() {
		return numberType;
	}

	public void setNumberType(BidNumberType numberType) {
		this.numberType = numberType;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getBidNumberDtlsId() {
		return bidNumberDtlsId;
	}

	public void setBidNumberDtlsId(String bidNumberDtlsId) {
		this.bidNumberDtlsId = bidNumberDtlsId;
	}

	public Integer getParticipantsCount() {
		return participantsCount;
	}

	public void setParticipantsCount(Integer participantsCount) {
		this.participantsCount = participantsCount;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	

}
