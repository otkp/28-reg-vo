package org.epragati.sn.vo;

public class SPReportDetails {

	private Double specialAmount;
	private Double premiumAmount;

	private Long specialParticipants;
	private Long premiumParticipants;

	/**
	 * @return the specialAmount
	 */
	public Double getSpecialAmount() {
		return specialAmount;
	}

	/**
	 * @param specialAmount
	 *            the specialAmount to set
	 */
	public void setSpecialAmount(Double specialAmount) {
		this.specialAmount = specialAmount;
	}

	/**
	 * @return the premiumAmount
	 */
	public Double getPremiumAmount() {
		return premiumAmount;
	}

	/**
	 * @param premiumAmount
	 *            the premiumAmount to set
	 */
	public void setPremiumAmount(Double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	/**
	 * @return the specialParticipants
	 */
	public Long getSpecialParticipants() {
		return specialParticipants;
	}

	/**
	 * @param specialParticipants
	 *            the specialParticipants to set
	 */
	public void setSpecialParticipants(Long specialParticipants) {
		this.specialParticipants = specialParticipants;
	}

	/**
	 * @return the premiumParticipants
	 */
	public Long getPremiumParticipants() {
		return premiumParticipants;
	}

	/**
	 * @param premiumParticipants
	 *            the premiumParticipants to set
	 */
	public void setPremiumParticipants(Long premiumParticipants) {
		this.premiumParticipants = premiumParticipants;
	}

}
