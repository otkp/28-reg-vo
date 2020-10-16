package org.epragati.master.vo;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class StaggingTrAttachmentDetailsVO {
	private Integer tadid;
	private Integer tdid;
	private Integer tadEnclid;
	private String tadPath;
	private Integer tadStats;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.mmm")
	private LocalDateTime createdDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.mmm")
	private LocalDateTime lUpdate;
	/**
	 * @return the tadid
	 */
	public Integer getTadid() {
		return tadid;
	}
	/**
	 * @param tadid the tadid to set
	 */
	public void setTadid(Integer tadid) {
		this.tadid = tadid;
	}
	/**
	 * @return the tdid
	 */
	public Integer getTdid() {
		return tdid;
	}
	/**
	 * @param tdid the tdid to set
	 */
	public void setTdid(Integer tdid) {
		this.tdid = tdid;
	}
	/**
	 * @return the tadEnclid
	 */
	public Integer getTadEnclid() {
		return tadEnclid;
	}
	/**
	 * @param tadEnclid the tadEnclid to set
	 */
	public void setTadEnclid(Integer tadEnclid) {
		this.tadEnclid = tadEnclid;
	}
	/**
	 * @return the tadPath
	 */
	public String getTadPath() {
		return tadPath;
	}
	/**
	 * @param tadPath the tadPath to set
	 */
	public void setTadPath(String tadPath) {
		this.tadPath = tadPath;
	}
	/**
	 * @return the tadStats
	 */
	public Integer getTadStats() {
		return tadStats;
	}
	/**
	 * @param tadStats the tadStats to set
	 */
	public void setTadStats(Integer tadStats) {
		this.tadStats = tadStats;
	}
	/**
	 * @return the createdDate
	 */
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the lUpdate
	 */
	public LocalDateTime getlUpdate() {
		return lUpdate;
	}
	/**
	 * @param lUpdate the lUpdate to set
	 */
	public void setlUpdate(LocalDateTime lUpdate) {
		this.lUpdate = lUpdate;
	}
}
