package org.epragati.payments.vo;

import java.io.Serializable;
import java.util.Map;

public class BreakPayments  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private List<String> serviceId;
	private String feeType;
	private Double totalFee;
	public Map<String, Double> breakup;
	
	
	
	/**
	 * @return the feeType
	 */
	public String getFeeType() {
		return feeType;
	}
	/**
	 * @param feeType the feeType to set
	 */
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	/**
	 * @return the fee
	 */
	public Double getTotalFee() {
		return totalFee;
	}
	/**
	 * @param fee the fee to set
	 */
	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}
	/**
	 * @return the breakup
	 */
	public Map<String, Double> getBreakup() {
		return breakup;
	}
	/**
	 * @param breakup the breakup to set
	 */
	public void setBreakup(Map<String, Double> breakup) {
		this.breakup = breakup;
	}
	
	
}
