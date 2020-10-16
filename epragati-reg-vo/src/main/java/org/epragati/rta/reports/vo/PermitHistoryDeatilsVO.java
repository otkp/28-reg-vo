package org.epragati.rta.reports.vo;

import java.time.LocalDate;


import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author manikanta guptha
 *
 */

public class PermitHistoryDeatilsVO {
	
	private String prNo;
	private String permitNumber;
	private String validFromRoute;
	private String validToRoute;
	private String permitType;
	private String cov;
	private String status;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate vallidFrom;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validUpto;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate authVallidFrom;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate authValidUpto;

	public String getCov() {
		return cov;
	}

	public void setCov(String cov) {
		this.cov = cov;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getPermitNumber() {
		return permitNumber;
	}

	public void setPermitNumber(String permitNumber) {
		this.permitNumber = permitNumber;
	}

	public String getValidFromRoute() {
		return validFromRoute;
	}

	public void setValidFromRoute(String validFromRoute) {
		this.validFromRoute = validFromRoute;
	}

	public String getValidToRoute() {
		return validToRoute;
	}

	public void setValidToRoute(String validToRoute) {
		this.validToRoute = validToRoute;
	}

	public String getPermitType() {
		return permitType;
	}

	public void setPermitType(String permitType) {
		this.permitType = permitType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getVallidFrom() {
		return vallidFrom;
	}

	public void setVallidFrom(LocalDate vallidFrom) {
		this.vallidFrom = vallidFrom;
	}

	public LocalDate getValidUpto() {
		return validUpto;
	}

	public void setValidUpto(LocalDate validUpto) {
		this.validUpto = validUpto;
	}

	public LocalDate getAuthVallidFrom() {
		return authVallidFrom;
	}

	public void setAuthVallidFrom(LocalDate authVallidFrom) {
		this.authVallidFrom = authVallidFrom;
	}

	public LocalDate getAuthValidUpto() {
		return authValidUpto;
	}

	public void setAuthValidUpto(LocalDate authValidUpto) {
		this.authValidUpto = authValidUpto;
	}

}
