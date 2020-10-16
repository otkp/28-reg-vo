package org.epragati.sn.vo;

public class SPReportOverall {

	private SPReportDetails winnerDetails;

	private SPReportDetails looserDetails;

	private SPReportDetails absentDetails;

	private SPReportDetails tieDetails;

	/**
	 * @return the winnerDetails
	 */
	public SPReportDetails getWinnerDetails() {
		return winnerDetails;
	}

	/**
	 * @param winnerDetails
	 *            the winnerDetails to set
	 */
	public void setWinnerDetails(SPReportDetails winnerDetails) {
		this.winnerDetails = winnerDetails;
	}

	/**
	 * @return the looserDetails
	 */
	public SPReportDetails getLooserDetails() {
		return looserDetails;
	}

	/**
	 * @param looserDetails
	 *            the looserDetails to set
	 */
	public void setLooserDetails(SPReportDetails looserDetails) {
		this.looserDetails = looserDetails;
	}

	/**
	 * @return the absentDetails
	 */
	public SPReportDetails getAbsentDetails() {
		return absentDetails;
	}

	/**
	 * @param absentDetails
	 *            the absentDetails to set
	 */
	public void setAbsentDetails(SPReportDetails absentDetails) {
		this.absentDetails = absentDetails;
	}

	/**
	 * @return the tieDetails
	 */
	public SPReportDetails getTieDetails() {
		return tieDetails;
	}

	/**
	 * @param tieDetails
	 *            the tieDetails to set
	 */
	public void setTieDetails(SPReportDetails tieDetails) {
		this.tieDetails = tieDetails;
	}

}
