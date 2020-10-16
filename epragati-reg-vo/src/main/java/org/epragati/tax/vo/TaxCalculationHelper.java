package org.epragati.tax.vo;

import java.time.LocalDate;

public class TaxCalculationHelper {

	private Double quaterTax;
	private Double quaterTaxArrears;
	private Integer  indexPosition;
	private Integer quaternNumber;
	private LocalDate taxTill;
	private Double penality;
	private Double penalityArrears;
	private Double currentQuaterTax;
	private Long reoundTax;
	private Long reoundTaxArrears;
	private TaxTypeEnum.TaxPayType taxPayType;
	private LocalDate lastTaxPaidUpTo;
	
	
	
	
	
	
	
	
	/**
	 * @return the reoundTax
	 */
	public Long getReoundTax() {
		return reoundTax;
	}
	/**
	 * @param reoundTax the reoundTax to set
	 */
	public void setReoundTax(Long reoundTax) {
		this.reoundTax = reoundTax;
	}
	/**
	 * @return the currentQuaterTax
	 */
	public Double getCurrentQuaterTax() {
		return currentQuaterTax;
	}
	/**
	 * @param currentQuaterTax the currentQuaterTax to set
	 */
	public void setCurrentQuaterTax(Double currentQuaterTax) {
		this.currentQuaterTax = currentQuaterTax;
	}
	/**
	 * @return the penality
	 */
	public Double getPenality() {
		return penality;
	}
	/**
	 * @param penality the penality to set
	 */
	public void setPenality(Double penality) {
		this.penality = penality;
	}
	/**
	 * @return the taxTill
	 */
	public LocalDate getTaxTill() {
		return taxTill;
	}
	/**
	 * @param taxTill the taxTill to set
	 */
	public void setTaxTill(LocalDate taxTill) {
		this.taxTill = taxTill;
	}
	/**
	 * @return the quaterTax
	 */
	public Double getQuaterTax() {
		return quaterTax;
	}
	/**
	 * @param quaterTax the quaterTax to set
	 */
	public void setQuaterTax(Double quaterTax) {
		this.quaterTax = quaterTax;
	}
	/**
	 * @return the indexPosition
	 */
	public Integer getIndexPosition() {
		return indexPosition;
	}
	/**
	 * @param indexPosition the indexPosition to set
	 */
	public void setIndexPosition(Integer indexPosition) {
		this.indexPosition = indexPosition;
	}
	/**
	 * @return the quaternNumber
	 */
	public Integer getQuaternNumber() {
		return quaternNumber;
	}
	/**
	 * @param quaternNumber the quaternNumber to set
	 */
	public void setQuaternNumber(Integer quaternNumber) {
		this.quaternNumber = quaternNumber;
	}
	/**
	 * @return the quaterTaxArrears
	 */
	public Double getQuaterTaxArrears() {
		return quaterTaxArrears;
	}
	/**
	 * @param quaterTaxArrears the quaterTaxArrears to set
	 */
	public void setQuaterTaxArrears(Double quaterTaxArrears) {
		this.quaterTaxArrears = quaterTaxArrears;
	}
	/**
	 * @return the penalityArrears
	 */
	public Double getPenalityArrears() {
		return penalityArrears;
	}
	/**
	 * @param penalityArrears the penalityArrears to set
	 */
	public void setPenalityArrears(Double penalityArrears) {
		this.penalityArrears = penalityArrears;
	}
	/**
	 * @return the reoundTaxArrears
	 */
	public Long getReoundTaxArrears() {
		return reoundTaxArrears;
	}
	/**
	 * @param reoundTaxArrears the reoundTaxArrears to set
	 */
	public void setReoundTaxArrears(Long reoundTaxArrears) {
		this.reoundTaxArrears = reoundTaxArrears;
	}
	/**
	 * @return the taxPayType
	 */
	public TaxTypeEnum.TaxPayType getTaxPayType() {
		return taxPayType;
	}
	/**
	 * @param taxPayType the taxPayType to set
	 */
	public void setTaxPayType(TaxTypeEnum.TaxPayType taxPayType) {
		this.taxPayType = taxPayType;
	}
	public LocalDate getLastTaxPaidUpTo() {
		return lastTaxPaidUpTo;
	}
	public void setLastTaxPaidUpTo(LocalDate lastTaxPaidUpTo) {
		this.lastTaxPaidUpTo = lastTaxPaidUpTo;
	}
	
	
}
