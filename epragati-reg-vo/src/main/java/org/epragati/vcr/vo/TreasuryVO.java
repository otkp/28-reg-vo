package org.epragati.vcr.vo;

import org.epragati.common.vo.BaseVO;

public class TreasuryVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer bankCode;

	private String bankSubTresury;

	private String officeCode;

	private String createdUser;

	public Integer getBankCode() {
		return bankCode;
	}

	public void setBankCode(Integer bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankSubTresury() {
		return bankSubTresury;
	}

	public void setBankSubTresury(String bankSubTresury) {
		this.bankSubTresury = bankSubTresury;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

}
