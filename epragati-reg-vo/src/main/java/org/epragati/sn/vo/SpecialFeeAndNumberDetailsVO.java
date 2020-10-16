package org.epragati.sn.vo;

public class SpecialFeeAndNumberDetailsVO {

	private SpecialFeeDetailsVO specialFeeDetails;

	private NumberSeriesDetailsVO currentSeriesDetail;

	private NumberSeriesDetailsVO oldSeriesDetail;

	private Long registrationDuration;
	
	private NumberSeriesDetailsVO inactiveSeries;
	

	public NumberSeriesDetailsVO getInactiveSeries() {
		return inactiveSeries;
	}

	public void setInactiveSeries(NumberSeriesDetailsVO inactiveSeries) {
		this.inactiveSeries = inactiveSeries;
	}

	/**
	 * @return the specialFeeDetails
	 */
	public SpecialFeeDetailsVO getSpecialFeeDetails() {
		return specialFeeDetails;
	}

	/**
	 * @param specialFeeDetails
	 *            the specialFeeDetails to set
	 */
	public void setSpecialFeeDetails(SpecialFeeDetailsVO specialFeeDetails) {
		this.specialFeeDetails = specialFeeDetails;
	}

	/**
	 * @return the currentSeriesDetail
	 */
	public NumberSeriesDetailsVO getCurrentSeriesDetail() {
		return currentSeriesDetail;
	}

	/**
	 * @param currentSeriesDetail
	 *            the currentSeriesDetail to set
	 */
	public void setCurrentSeriesDetail(NumberSeriesDetailsVO currentSeriesDetail) {
		this.currentSeriesDetail = currentSeriesDetail;
	}

	/**
	 * @return the oldSeriesDetail
	 */
	public NumberSeriesDetailsVO getOldSeriesDetail() {
		return oldSeriesDetail;
	}

	/**
	 * @param oldSeriesDetail
	 *            the oldSeriesDetail to set
	 */
	public void setOldSeriesDetail(NumberSeriesDetailsVO oldSeriesDetail) {
		this.oldSeriesDetail = oldSeriesDetail;
	}

	/**
	 * @return the registrationDuration
	 */
	public Long getRegistrationDuration() {
		return registrationDuration;
	}

	/**
	 * @param registrationDuration
	 *            the registrationDuration to set
	 */
	public void setRegistrationDuration(Long registrationDuration) {
		this.registrationDuration = registrationDuration;
	}

}
