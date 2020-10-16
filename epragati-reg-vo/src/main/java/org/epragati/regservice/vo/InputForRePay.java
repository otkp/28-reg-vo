package org.epragati.regservice.vo;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class InputForRePay {

	@NotNull(message = "Application Number is required.")
	private String applicationNo;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate soltDate;
	
	private String gateWayType;

	/**
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}

	/**
	 * @param applicationNo the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	/**
	 * @return the soltDate
	 */
	public LocalDate getSoltDate() {
		return soltDate;
	}

	/**
	 * @param soltDate the soltDate to set
	 */
	public void setSoltDate(LocalDate soltDate) {
		this.soltDate = soltDate;
	}

	/**
	 * @return the gateWayType
	 */
	public String getGateWayType() {
		return gateWayType;
	}

	/**
	 * @param gateWayType the gateWayType to set
	 */
	public void setGateWayType(String gateWayType) {
		this.gateWayType = gateWayType;
	}
	
	
}
