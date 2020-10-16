package org.epragati.service.enclosure.vo;

import java.util.List;

public class DealerEnclosureVO {

	private List<EnclosureRejectedVO> EnclosureRejected;
	private boolean uploadRequired;

	/**
	 * @return the enclosureRejected
	 */
	public List<EnclosureRejectedVO> getEnclosureRejected() {
		return EnclosureRejected;
	}

	/**
	 * @param enclosureRejected
	 *            the enclosureRejected to set
	 */
	public void setEnclosureRejected(List<EnclosureRejectedVO> enclosureRejected) {
		EnclosureRejected = enclosureRejected;
	}

	/**
	 * @return the uploadRequired
	 */
	public boolean isUploadRequired() {
		return uploadRequired;
	}

	/**
	 * @param uploadRequired
	 *            the uploadRequired to set
	 */
	public void setUploadRequired(boolean uploadRequired) {
		this.uploadRequired = uploadRequired;
	}

}
