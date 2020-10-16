package org.epragati.tax.vo;

public enum TaxStatusEnum {

ACTIVE("Active"),INACTIVE("InActive");



	private String code;
	
	private TaxStatusEnum(String code) {
		this.code = code;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	
}
