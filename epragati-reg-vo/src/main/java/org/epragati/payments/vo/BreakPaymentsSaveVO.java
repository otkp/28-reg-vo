package org.epragati.payments.vo;

import java.util.List;

public class BreakPaymentsSaveVO {

	private List<BreakPayments> breakPayments;
	private Double grandTotalFees;
	/**
	 * @return the breakPayments
	 */
	public List<BreakPayments> getBreakPayments() {
		return breakPayments;
	}
	/**
	 * @param breakPayments the breakPayments to set
	 */
	public void setBreakPayments(List<BreakPayments> breakPayments) {
		this.breakPayments = breakPayments;
	}
	/**
	 * @return the grandTotalFees
	 */
	public Double getGrandTotalFees() {
		return grandTotalFees;
	}
	/**
	 * @param grandTotalFees the grandTotalFees to set
	 */
	public void setGrandTotalFees(Double grandTotalFees) {
		this.grandTotalFees = grandTotalFees;
	}
	
	
}
