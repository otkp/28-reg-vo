package org.epragati.sn.vo;

import java.time.LocalDateTime;

import org.epragati.util.BidStatus;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class BidAlterDetailsVO {
	
	private String ipAddress;
	
	private LocalDateTime changeDate;
	
	private BidStatus changeTo;
	
	private String prNo; 

	/**
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * @param ipAddress the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * @return the chnageDate
	 */
	public LocalDateTime getChangeDate() {
		return changeDate;
	}

	/**
	 * @param chnageDate the chnageDate to set
	 */
	public void setChangeDate(LocalDateTime changeDate) {
		this.changeDate = changeDate;
	}

	/**
	 * @return the changeTo
	 */
	public BidStatus getChangeTo() {
		return changeTo;
	}

	/**
	 * @param changeTo the changeTo to set
	 */
	public void setChangeTo(BidStatus changeTo) {
		this.changeTo = changeTo;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	
	

}
