package org.epragati.master.vo;

import java.util.List;
import java.util.Map;

public class FeeBreakUpVO {

	private List<String> feeType;

	private List<String> amount;

	private Map<String, String> breakUpDetails;

	/**
	 * @return the feeType
	 */
	public List<String> getFeeType() {
		return feeType;
	}

	/**
	 * @param feeType
	 *            the feeType to set
	 */
	public void setFeeType(List<String> feeType) {
		this.feeType = feeType;
	}

	/**
	 * @return the amount
	 */
	public List<String> getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(List<String> amount) {
		this.amount = amount;
	}

	/**
	 * @return the breakUpDetails
	 */
	public Map<String, String> getBreakUpDetails() {
		return breakUpDetails;
	}

	/**
	 * @param breakUpDetails
	 *            the breakUpDetails to set
	 */
	public void setBreakUpDetails(Map<String, String> breakUpDetails) {
		this.breakUpDetails = breakUpDetails;
	}

}
