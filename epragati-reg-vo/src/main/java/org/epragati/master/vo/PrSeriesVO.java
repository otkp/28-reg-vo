package org.epragati.master.vo;

/**
 * @author sairam.cheruku
 *
 */
public class PrSeriesVO {

	private Integer prDistrictId;
	private String officeCode;
	private Integer startFrom;
	private Integer endTo;
	private Boolean status;
	private String series;
	private String prcId;
	private Integer currentNumber;

	public Integer getPrDistrictId() {
		return prDistrictId;
	}

	public void setPrDistrictId(Integer prDistrictId) {
		this.prDistrictId = prDistrictId;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public Integer getStartFrom() {
		return startFrom;
	}

	public void setStartFrom(Integer startFrom) {
		this.startFrom = startFrom;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getPrcId() {
		return prcId;
	}

	public void setPrcId(String prcId) {
		this.prcId = prcId;
	}

	public Integer getEndTo() {
		return endTo;
	}

	public void setEndTo(Integer endTo) {
		this.endTo = endTo;
	}

	public Integer getCurrentNumber() {
		return currentNumber;
	}

	public void setCurrentNumber(Integer currentNumber) {
		this.currentNumber = currentNumber;
	}

}