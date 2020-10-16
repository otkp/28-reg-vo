package org.epragati.sn.vo;

import java.util.List;

import org.epragati.constants.CovCategory;
import org.epragati.util.RecordStatus;

public class NumberSeriesDetailsVO {

	private String prSeries;

	private String officeCode;
	
	private String officeNumberSeries;
	
	private String prSeriesId;
	
	private Integer toDayStartNo;
	
	private Integer toDayEndNumber;
	
	private CovCategory regType;
	
	private RecordStatus seriesStatus;

	private List<NumberSeries> numberSeries;
	
	private List<String> numberRages;
	
	private Integer totalNumberForWindow;

	public String getPrSeries() {
		return prSeries;
	}

	public void setPrSeries(String prSeries) {
		this.prSeries = prSeries;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public List<NumberSeries> getNumberSeries() {
		return numberSeries;
	}

	public void setNumberSeries(List<NumberSeries> numberSeries) {
		this.numberSeries = numberSeries;
	}

	public String getOfficeNumberSeries() {
		return officeNumberSeries;
	}

	public void setOfficeNumberSeries(String officeNumberSeries) {
		this.officeNumberSeries = officeNumberSeries;
	}

	public String getPrSeriesId() {
		return prSeriesId;
	}

	public void setPrSeriesId(String prSeriesId) {
		this.prSeriesId = prSeriesId;
	}

	public Integer getToDayStartNo() {
		return toDayStartNo;
	}

	public void setToDayStartNo(Integer toDayStartNo) {
		this.toDayStartNo = toDayStartNo;
	}

	public Integer getToDayEndNumber() {
		return toDayEndNumber;
	}

	public void setToDayEndNumber(Integer toDayEndNumber) {
		this.toDayEndNumber = toDayEndNumber;
	}

	public CovCategory getRegType() {
		return regType;
	}

	public void setRegType(CovCategory regType) {
		this.regType = regType;
	}

	public RecordStatus getSeriesStatus() {
		return seriesStatus;
	}

	public void setSeriesStatus(RecordStatus seriesStatus) {
		this.seriesStatus = seriesStatus;
	}

	public List<String> getNumberRages() {
		return numberRages;
	}

	public void setNumberRages(List<String> numberRages) {
		this.numberRages = numberRages;
	}

	public Integer getTotalNumberForWindow() {
		return totalNumberForWindow;
	}

	public void setTotalNumberForWindow(Integer totalNumberForWindow) {
		this.totalNumberForWindow = totalNumberForWindow;
	}

	@Override
	public String toString() {
		return "NumberSeriesDetailsVO [" + (prSeries != null ? "prSeries=" + prSeries + ", " : "")
				+ (officeCode != null ? "officeCode=" + officeCode + ", " : "")
				+ (officeNumberSeries != null ? "officeNumberSeries=" + officeNumberSeries + ", " : "")
				+ (prSeriesId != null ? "prSeriesId=" + prSeriesId + ", " : "")
				+ (toDayStartNo != null ? "toDayStartNo=" + toDayStartNo + ", " : "")
				+ (toDayEndNumber != null ? "toDayEndNumber=" + toDayEndNumber + ", " : "")
				+ (regType != null ? "regType=" + regType + ", " : "")
				+ (seriesStatus != null ? "seriesStatus=" + seriesStatus + ", " : "")
				+ (numberSeries != null ? "numberSeries=" + numberSeries + ", " : "")
				+ (numberRages != null ? "numberRages=" + numberRages + ", " : "")
				+ (totalNumberForWindow != null ? "totalNumberForWindow=" + totalNumberForWindow : "") + "]";
	}
	
	

}
