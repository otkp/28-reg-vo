package org.epragati.rta.vo;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class TrailerTaxDetailsVO {
	
	private String taxType;
	
	private Long taxValue;

	/**
	 * @return the taxType
	 */
	public String getTaxType() {
		return taxType;
	}

	/**
	 * @param taxType the taxType to set
	 */
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	/**
	 * @return the taxValue
	 */
	public Long getTaxValue() {
		return taxValue;
	}

	/**
	 * @param taxValue the taxValue to set
	 */
	public void setTaxValue(Long taxValue) {
		this.taxValue = taxValue;
	}

}
