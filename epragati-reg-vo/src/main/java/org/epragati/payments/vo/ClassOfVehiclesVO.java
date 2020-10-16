package org.epragati.payments.vo;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClassOfVehiclesVO {
	
	private String _id;
	private Integer cid;
	private String covCode;
	private String covdescription;
	private String category;
	private boolean panrequired;
	private LocalDateTime createdate;
	private LocalDateTime lupdate;
	private boolean isRegistered = false;
	private boolean isUnRegistered = false;
	private Boolean isConstructionVehicle;
	//ForDl Details
	private String description;
	private String code;
	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}

	/**
	 * @param _id the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}

	/**
	 * @return the cid
	 */
	public Integer getCid() {
		return cid;
	}

	/**
	 * @param cid
	 *            the cid to set
	 */
	public void setCid(Integer cid) {
		this.cid = cid;
	}

	/**
	 * @return the covCode
	 */
	public String getCovCode() {
		return covCode;
	}

	/**
	 * @param covCode
	 *            the covCode to set
	 */
	public void setCovCode(String covCode) {
		this.covCode = covCode;
	}

	/**
	 * @return the covdescription
	 */
	public String getCovdescription() {
		return covdescription;
	}

	/**
	 * @param covdescription
	 *            the covdescription to set
	 */
	public void setCovdescription(String covdescription) {
		this.covdescription = covdescription;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the panrequired
	 */
	public boolean isPanrequired() {
		return panrequired;
	}

	/**
	 * @param panrequired
	 *            the panrequired to set
	 */
	public void setPanrequired(boolean panrequired) {
		this.panrequired = panrequired;
	}

	/**
	 * @return the createdate
	 */
	public LocalDateTime getCreatedate() {
		return createdate;
	}

	/**
	 * @param createdate
	 *            the createdate to set
	 */
	public void setCreatedate(LocalDateTime createdate) {
		this.createdate = createdate;
	}

	/**
	 * @return the lupdate
	 */
	public LocalDateTime getLupdate() {
		return lupdate;
	}

	/**
	 * @param lupdate
	 *            the lupdate to set
	 */
	public void setLupdate(LocalDateTime lupdate) {
		this.lupdate = lupdate;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

	public boolean isUnRegistered() {
		return isUnRegistered;
	}

	public void setUnRegistered(boolean isUnRegistered) {
		this.isUnRegistered = isUnRegistered;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	public Boolean isConstructionVehicle() {
		return isConstructionVehicle;
	}

	public void setConstructionVehicle(Boolean isConstructionVehicle) {
		this.isConstructionVehicle = isConstructionVehicle;
	}


}
