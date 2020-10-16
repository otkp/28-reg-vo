package org.epragati.permits.vo;

import java.io.Serializable;

import org.epragati.common.vo.BaseVO;

public class PermitMandalExemptionVO extends BaseVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String mandalName;
	
	private Integer mandalCode;
	
	private String covcode;
	
	private Boolean status;

	/**
	 * @return the mandalName
	 */
	public String getMandalName() {
		return mandalName;
	}

	/**
	 * @param mandalName the mandalName to set
	 */
	public void setMandalName(String mandalName) {
		this.mandalName = mandalName;
	}

	/**
	 * @return the mandalCode
	 */
	public Integer getMandalCode() {
		return mandalCode;
	}

	/**
	 * @param mandalCode the mandalCode to set
	 */
	public void setMandalCode(Integer mandalCode) {
		this.mandalCode = mandalCode;
	}

	/**
	 * @return the covcode
	 */
	public String getCovcode() {
		return covcode;
	}

	/**
	 * @param covcode the covcode to set
	 */
	public void setCovcode(String covcode) {
		this.covcode = covcode;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}
}
