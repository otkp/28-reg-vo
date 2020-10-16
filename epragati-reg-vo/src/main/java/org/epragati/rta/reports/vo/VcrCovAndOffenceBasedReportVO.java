package org.epragati.rta.reports.vo;

import java.util.List;

public class VcrCovAndOffenceBasedReportVO {

	private List<CheckPostReportsVO> covBasedList;

	private List<CheckPostReportsVO> mviCovList;

	private List<ReportVO> offencesBasedList;

	/**
	 * @return the covBasedList
	 */
	public List<CheckPostReportsVO> getCovBasedList() {
		return covBasedList;
	}

	/**
	 * @param covBasedList the covBasedList to set
	 */
	public void setCovBasedList(List<CheckPostReportsVO> covBasedList) {
		this.covBasedList = covBasedList;
	}

	/**
	 * @return the mviCovList
	 */
	public List<CheckPostReportsVO> getMviCovList() {
		return mviCovList;
	}

	/**
	 * @param mviCovList the mviCovList to set
	 */
	public void setMviCovList(List<CheckPostReportsVO> mviCovList) {
		this.mviCovList = mviCovList;
	}

	/**
	 * @return the offencesBasedList
	 */
	public List<ReportVO> getOffencesBasedList() {
		return offencesBasedList;
	}

	/**
	 * @param offencesBasedList the offencesBasedList to set
	 */
	public void setOffencesBasedList(List<ReportVO> offencesBasedList) {
		this.offencesBasedList = offencesBasedList;
	}

}
