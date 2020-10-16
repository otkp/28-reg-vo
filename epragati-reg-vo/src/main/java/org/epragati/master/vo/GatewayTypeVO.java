package org.epragati.master.vo;

import java.time.LocalDateTime;

/**
 * @author sairam.cheruku
 *
 */

public class GatewayTypeVO {

	private Integer gtid;
	private String description;
	private String status;
	private LocalDateTime createddate;
	private LocalDateTime lupdate;

	/**
	 *
	 * @return createddate
	 */
	public LocalDateTime getCreateddate() {
		return createddate;
	}

	/**
	 *
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 *
	 * @return gtid
	 */
	public Integer getGtid() {
		return gtid;
	}

	/**
	 *
	 * @return lupdate
	 */
	public LocalDateTime getLupdate() {
		return lupdate;
	}

	/**
	 *
	 * @return status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 *
	 * @param createddate
	 *            set createddate
	 */
	public void setCreateddate(LocalDateTime createddate) {
		this.createddate = createddate;
	}

	/**
	 *
	 * @param description
	 *            set description
	 */

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 *
	 * @param gtid
	 *            to set gtid
	 */
	public void setGtid(Integer gtid) {
		this.gtid = gtid;
	}

	/**
	 *
	 * @param lupdate
	 *            set lupdate
	 */
	public void setLupdate(LocalDateTime lupdate) {
		this.lupdate = lupdate;
	}

	/**
	 *
	 * @param status
	 *            set status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
