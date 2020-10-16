package org.epragati.master.vo;

import java.util.List;

/**
 * 
 * @author krishnarjun.pampana
 *
 */

public class FinancierDashBoardVO {

	private Integer sanctioned;

	// private List<String> sanctionedList;
	private Integer prGenerated;
	private Integer accepted;

	private Integer financerRejected;

	private Integer dealerRejected;

	private Integer hirepurchaseTerminated;

	private List<String> acceptedList;
	//
	private Integer rejected;
	private Integer freshRcList;
	private Integer freshRcrejectedList;
	 

	public Integer getSanctioned() {
		return sanctioned;
	}

	public void setSanctioned(Integer sanctioned) {
		this.sanctioned = sanctioned;
	}

	public Integer getAccepted() {
		return accepted;
	}

	public void setAccepted(Integer accepted) {
		this.accepted = accepted;
	}

	public List<String> getAcceptedList() {
		return acceptedList;
	}

	public void setAcceptedList(List<String> acceptedList) {
		this.acceptedList = acceptedList;
	}

	public Integer getRejected() {
		return rejected;
	}

	public void setRejected(Integer rejected) {
		this.rejected = rejected;
	}

	public Integer getFinancerRejected() {
		return financerRejected;
	}

	public void setFinancerRejected(Integer financerRejected) {
		this.financerRejected = financerRejected;
	}

	public Integer getDealerRejected() {
		return dealerRejected;
	}

	public void setDealerRejected(Integer dealerRejected) {
		this.dealerRejected = dealerRejected;
	}

	/**
	 * @return the prGenerated
	 */
	public Integer getPrGenerated() {
		return prGenerated;
	}

	/**
	 * @param prGenerated
	 *            the prGenerated to set
	 */
	public void setPrGenerated(Integer prGenerated) {
		this.prGenerated = prGenerated;
	}

	/**
	 * @return the hirepurchaseTerminated
	 */
	public Integer getHirepurchaseTerminated() {
		return hirepurchaseTerminated;
	}

	/**
	 * @param hirepurchaseTerminated
	 *            the hirepurchaseTerminated to set
	 */
	public void setHirepurchaseTerminated(Integer hirepurchaseTerminated) {
		this.hirepurchaseTerminated = hirepurchaseTerminated;
	}
	/**
	 * @return the freshRcList
	 */
	public Integer getFreshRcList() {
		return freshRcList;
	}

	/**
	 * @param freshRcList the freshRcList to set
	 */
	public void setFreshRcList(Integer freshRcList) {
		this.freshRcList = freshRcList;
	}

	public Integer getFreshRcrejectedList() {
		return freshRcrejectedList;
	}

	public void setFreshRcrejectedList(Integer freshRcrejectedList) {
		this.freshRcrejectedList = freshRcrejectedList;
	}

	// private List<String> rejectedList;

}
