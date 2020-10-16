package org.epragati.sn.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.epragati.util.AmountEncryptDecrypt;

import com.fasterxml.jackson.annotation.JsonFormat;


public class BidHistoryVo implements Serializable {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	private Double secBidAmount;
	
	private String bidAmount;
	
	private Boolean isFinalBid;
	
	private String remarks;
	
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss.SSS")
	private LocalDateTime createdDatetime;

	public Double getSecBidAmount() {
		return secBidAmount;
	}

	public void setSecBidAmount(Double secBidAmount) {
		this.secBidAmount = secBidAmount;
	}

	public Double getBidAmount() {
		return AmountEncryptDecrypt.decryptAmount(bidAmount);
	}

	public void setBidAmount(Double bidAmount) {
		this.bidAmount = AmountEncryptDecrypt.encryptAmount(bidAmount);
	}
	
	public void setBidAmount(String bidAmount) {
		this.bidAmount = AmountEncryptDecrypt.encryptAmount(bidAmount);
	}

	public Boolean getIsFinalBid() {
		return isFinalBid;
	}

	public void setIsFinalBid(Boolean isFinalBid) {
		this.isFinalBid = isFinalBid;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public LocalDateTime getCreatedDatetime() {
		return createdDatetime;
	}

	public void setCreatedDatetime(LocalDateTime createdDatetime) {
		this.createdDatetime = createdDatetime;
	}


}
