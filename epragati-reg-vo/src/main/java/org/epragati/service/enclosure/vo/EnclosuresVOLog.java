package org.epragati.service.enclosure.vo;

import java.time.LocalDateTime;
import java.util.List;

import org.epragati.constants.EnclosureType;
import org.epragati.util.document.KeyValue;

public class EnclosuresVOLog {

	private LocalDateTime createDate;

	private List<KeyValue<EnclosureType, List<ImageVO>>> enclosures;

	private String reason;

	/**
	 * @return the createDate
	 */
	public LocalDateTime getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate
	 *            the createDate to set
	 */
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the enclosures
	 */
	public List<KeyValue<EnclosureType, List<ImageVO>>> getEnclosures() {
		return enclosures;
	}

	/**
	 * @param enclosures
	 *            the enclosures to set
	 */
	public void setEnclosures(List<KeyValue<EnclosureType, List<ImageVO>>> enclosures) {
		this.enclosures = enclosures;
	}

	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * @param reason
	 *            the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

}
