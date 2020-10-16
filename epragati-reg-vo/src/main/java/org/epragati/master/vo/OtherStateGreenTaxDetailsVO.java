package org.epragati.master.vo;

import java.time.LocalDate;

public class OtherStateGreenTaxDetailsVO {

	private String greenTaxChallanNumber;
	
	private Double greenTaxAmount;
	
	private LocalDate validFrom;
	
	private LocalDate validTo;

	/**
	 * @return the greenTaxChallanNumber
	 */
	public String getGreenTaxChallanNumber() {
		return greenTaxChallanNumber;
	}

	/**
	 * @param greenTaxChallanNumber the greenTaxChallanNumber to set
	 */
	public void setGreenTaxChallanNumber(String greenTaxChallanNumber) {
		this.greenTaxChallanNumber = greenTaxChallanNumber;
	}

	/**
	 * @return the greenTaxAmount
	 */
	public Double getGreenTaxAmount() {
		return greenTaxAmount;
	}

	/**
	 * @param greenTaxAmount the greenTaxAmount to set
	 */
	public void setGreenTaxAmount(Double greenTaxAmount) {
		this.greenTaxAmount = greenTaxAmount;
	}

	/**
	 * @return the validFrom
	 */
	public LocalDate getValidFrom() {
		return validFrom;
	}

	/**
	 * @param validFrom the validFrom to set
	 */
	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}

	/**
	 * @return the validTo
	 */
	public LocalDate getValidTo() {
		return validTo;
	}

	/**
	 * @param validTo the validTo to set
	 */
	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}
	
}
