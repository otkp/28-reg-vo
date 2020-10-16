package org.epragati.permits.vo;

import java.io.Serializable;
import java.time.LocalDate;

import org.epragati.common.vo.BaseVO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PermitValidityDetailsVO extends BaseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate permitValidFrom;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate permitValidTo;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate permitAuthorizationValidFrom;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate permitAuthorizationValidTo;
	
	private String extentionDays;
	
	private Integer noOfMonths;
	

	/**
	 * @return the permitValidFrom
	 */
	public LocalDate getPermitValidFrom() {
		return permitValidFrom;
	}

	/**
	 * @param permitValidFrom
	 *            the permitValidFrom to set
	 */
	public void setPermitValidFrom(LocalDate permitValidFrom) {
		this.permitValidFrom = permitValidFrom;
	}

	/**
	 * @return the permitValidTo
	 */
	public LocalDate getPermitValidTo() {
		return permitValidTo;
	}

	/**
	 * @param permitValidTo
	 *            the permitValidTo to set
	 */
	public void setPermitValidTo(LocalDate permitValidTo) {
		this.permitValidTo = permitValidTo;
	}

	/**
	 * @return the permitAuthorizationValidFrom
	 */
	public LocalDate getPermitAuthorizationValidFrom() {
		return permitAuthorizationValidFrom;
	}

	/**
	 * @param permitAuthorizationValidFrom
	 *            the permitAuthorizationValidFrom to set
	 */
	public void setPermitAuthorizationValidFrom(LocalDate permitAuthorizationValidFrom) {
		this.permitAuthorizationValidFrom = permitAuthorizationValidFrom;
	}

	/**
	 * @return the permitAuthorizationValidTo
	 */
	public LocalDate getPermitAuthorizationValidTo() {
		return permitAuthorizationValidTo;
	}

	/**
	 * @param permitAuthorizationValidTo
	 *            the permitAuthorizationValidTo to set
	 */
	public void setPermitAuthorizationValidTo(LocalDate permitAuthorizationValidTo) {
		this.permitAuthorizationValidTo = permitAuthorizationValidTo;
	}

	/**
	 * @return the extentionDays
	 */
	public String getExtentionDays() {
		return extentionDays;
	}

	/**
	 * @param extentionDays the extentionDays to set
	 */
	public void setExtentionDays(String extentionDays) {
		this.extentionDays = extentionDays;
	}

	/**
	 * @return the noOfMonths
	 */
	public Integer getNoOfMonths() {
		return noOfMonths;
	}

	/**
	 * @param noOfMonths the noOfMonths to set
	 */
	public void setNoOfMonths(Integer noOfMonths) {
		this.noOfMonths = noOfMonths;
	}

	
}
