package org.epragati.master.vo;

import java.util.List;

import org.epragati.common.vo.BaseVO;

/**
 * @author sairam.cheruku
 *
 */
public class TrSeriesVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer trDistrictId;

	private Integer startFrom;

	private Integer endTo;

	private Boolean status;

	private List<String> finishedSeries;

	private List<String> pendingSeries;

	private String series;

	private Integer currentNo;

	public Integer getStartFrom() {
		return startFrom;
	}

	public void setStartFrom(Integer startFrom) {
		this.startFrom = startFrom;
	}

	public Integer getEndTo() {
		return endTo;
	}

	public void setEndTo(Integer endTo) {
		this.endTo = endTo;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public List<String> getFinishedSeries() {
		return finishedSeries;
	}

	public void setFinishedSeries(List<String> finishedSeries) {
		this.finishedSeries = finishedSeries;
	}

	public List<String> getPendingSeries() {
		return pendingSeries;
	}

	public void setPendingSeries(List<String> pendingSeries) {
		this.pendingSeries = pendingSeries;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public Integer getCurrentNo() {
		return currentNo;
	}

	public void setCurrentNo(Integer currentNo) {
		this.currentNo = currentNo;
	}

	public Integer getTrDistrictId() {
		return trDistrictId;
	}

	public void setTrDistrictId(Integer trDistrictId) {
		this.trDistrictId = trDistrictId;
	}
}