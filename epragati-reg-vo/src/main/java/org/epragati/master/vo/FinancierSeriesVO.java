package org.epragati.master.vo;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class FinancierSeriesVO {
	
	private String series;
	
	private Integer year;
	
	private Integer startFrom;
	
	private Integer endTo;
	
	private Boolean status;
	
	private Integer currentNo;

	/**
	 * @return the series
	 */
	public String getSeries() {
		return series;
	}

	/**
	 * @return the year
	 */
	public Integer getYear() {
		return year;
	}

	/**
	 * @return the startFrom
	 */
	public Integer getStartFrom() {
		return startFrom;
	}

	/**
	 * @return the endTo
	 */
	public Integer getEndTo() {
		return endTo;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @return the currentNo
	 */
	public Integer getCurrentNo() {
		return currentNo;
	}

	/**
	 * @param series the series to set
	 */
	public void setSeries(String series) {
		this.series = series;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(Integer year) {
		this.year = year;
	}

	/**
	 * @param startFrom the startFrom to set
	 */
	public void setStartFrom(Integer startFrom) {
		this.startFrom = startFrom;
	}

	/**
	 * @param endTo the endTo to set
	 */
	public void setEndTo(Integer endTo) {
		this.endTo = endTo;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * @param currentNo the currentNo to set
	 */
	public void setCurrentNo(Integer currentNo) {
		this.currentNo = currentNo;
	}
}
