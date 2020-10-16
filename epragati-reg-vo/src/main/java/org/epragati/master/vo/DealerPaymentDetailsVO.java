package org.epragati.master.vo;

import java.util.Map;

public class DealerPaymentDetailsVO {

	public Map<String, Double> trFeeDetails;

	public Map<String, Double> prFeeDetails;

	public Map<String, Double> taxDetails;

	public Map<String, Double> fitNessFeeDetails;

	public Map<String, Double> permitFes;

	/**
	 * @return the trFeeDetails
	 */
	public Map<String, Double> getTrFeeDetails() {
		return trFeeDetails;
	}

	/**
	 * @param trFeeDetails
	 *            the trFeeDetails to set
	 */
	public void setTrFeeDetails(Map<String, Double> trFeeDetails) {
		this.trFeeDetails = trFeeDetails;
	}

	/**
	 * @return the prFeeDetails
	 */
	public Map<String, Double> getPrFeeDetails() {
		return prFeeDetails;
	}

	/**
	 * @param prFeeDetails
	 *            the prFeeDetails to set
	 */
	public void setPrFeeDetails(Map<String, Double> prFeeDetails) {
		this.prFeeDetails = prFeeDetails;
	}

	/**
	 * @return the taxDetails
	 */
	public Map<String, Double> getTaxDetails() {
		return taxDetails;
	}

	/**
	 * @param taxDetails
	 *            the taxDetails to set
	 */
	public void setTaxDetails(Map<String, Double> taxDetails) {
		this.taxDetails = taxDetails;
	}

	/**
	 * @return the fitNessFeeDetails
	 */
	public Map<String, Double> getFitNessFeeDetails() {
		return fitNessFeeDetails;
	}

	/**
	 * @param fitNessFeeDetails
	 *            the fitNessFeeDetails to set
	 */
	public void setFitNessFeeDetails(Map<String, Double> fitNessFeeDetails) {
		this.fitNessFeeDetails = fitNessFeeDetails;
	}

	/**
	 * @return the permitFes
	 */
	public Map<String, Double> getPermitFes() {
		return permitFes;
	}

	/**
	 * @param permitFes
	 *            the permitFes to set
	 */
	public void setPermitFes(Map<String, Double> permitFes) {
		this.permitFes = permitFes;
	}

}
