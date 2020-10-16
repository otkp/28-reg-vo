package org.epragati.sn.vo;

import org.epragati.util.BidStatus;

public class SearchPaymentStatusVO {

	private String applicationNo;
	private String trNo;
	private String name;
	private BidStatus bidStatus;
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
	 * @return the trNo
	 */
	public String getTrNo() {
		return trNo;
	}
	/**
	 * @param trNo the trNo to set
	 */
	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the bidStatus
	 */
	public BidStatus getBidStatus() {
		return bidStatus;
	}
	/**
	 * @param bidStatus the bidStatus to set
	 */
	public void setBidStatus(BidStatus bidStatus) {
		this.bidStatus = bidStatus;
	}
	
	
}
