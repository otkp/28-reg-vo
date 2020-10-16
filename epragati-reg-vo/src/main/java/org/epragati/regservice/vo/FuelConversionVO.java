package org.epragati.regservice.vo;

public class FuelConversionVO {

	private String id;
	private String oldFuel;
	private String convCategory;
	private String fuel;
	private String fuleDesc;
	private boolean taxCal;
	private boolean fcFee;
	private boolean permitCal;
	
	
	/**
	 * @return the oldFuel
	 */
	public String getOldFuel() {
		return oldFuel;
	}
	/**
	 * @param oldFuel the oldFuel to set
	 */
	public void setOldFuel(String oldFuel) {
		this.oldFuel = oldFuel;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the convCategory
	 */
	public String getConvCategory() {
		return convCategory;
	}
	/**
	 * @param convCategory the convCategory to set
	 */
	public void setConvCategory(String convCategory) {
		this.convCategory = convCategory;
	}
	/**
	 * @return the fuel
	 */
	public String getFuel() {
		return fuel;
	}
	/**
	 * @param fuel the fuel to set
	 */
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	/**
	 * @return the fuleDesc
	 */
	public String getFuleDesc() {
		return fuleDesc;
	}
	/**
	 * @param fuleDesc the fuleDesc to set
	 */
	public void setFuleDesc(String fuleDesc) {
		this.fuleDesc = fuleDesc;
	}
	/**
	 * @return the taxCal
	 */
	public boolean isTaxCal() {
		return taxCal;
	}
	/**
	 * @param taxCal the taxCal to set
	 */
	public void setTaxCal(boolean taxCal) {
		this.taxCal = taxCal;
	}
	/**
	 * @return the fcFee
	 */
	public boolean isFcFee() {
		return fcFee;
	}
	/**
	 * @param fcFee the fcFee to set
	 */
	public void setFcFee(boolean fcFee) {
		this.fcFee = fcFee;
	}
	/**
	 * @return the permitCal
	 */
	public boolean isPermitCal() {
		return permitCal;
	}
	/**
	 * @param permitCal the permitCal to set
	 */
	public void setPermitCal(boolean permitCal) {
		this.permitCal = permitCal;
	}
	
	
}
