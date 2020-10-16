package org.epragati.master.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@JsonInclude(Include.NON_NULL)
public class MasterCovVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer cid;
	
	private String covcode;
	
	private String covdescription;
	
	private String category;
	
	private Boolean panrequired;
	
	private Boolean invalidCov;
	private Boolean isSecondVehicle;
	private Boolean isConstructionVehicle;
	
	
	private String covCode;
	
	//Driver COvs fields
		private String description;
		private String code;


	/**
	 * @return the cid
	 */
	public Integer getCid() {
		return cid;
	}

	/**
	 * @param cid the cid to set
	 */
	public void setCid(Integer cid) {
		this.cid = cid;
	}

	/**
	 * @return the covcode
	 */
	public String getCovcode() {
		return covcode;
	}

	/**
	 * @param covcode the covcode to set
	 */
	public void setCovcode(String covcode) {
		this.covcode = covcode;
	}

	/**
	 * @return the covdescription
	 */
	public String getCovdescription() {
		return covdescription;
	}

	/**
	 * @param covdescription the covdescription to set
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
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the panrequired
	 */
	public Boolean getPanrequired() {
		return panrequired;
	}

	/**
	 * @param panrequired the panrequired to set
	 */
	public void setPanrequired(Boolean panrequired) {
		this.panrequired = panrequired;
	}

	/**
	 * @return the invalidCov
	 */
	public Boolean getInvalidCov() {
		return invalidCov;
	}

	/**
	 * @param invalidCov the invalidCov to set
	 */
	public void setInvalidCov(Boolean invalidCov) {
		this.invalidCov = invalidCov;
	}

	/**
	 * @return the isSecondVehicle
	 */
	public Boolean getIsSecondVehicle() {
		return isSecondVehicle;
	}

	/**
	 * @param isSecondVehicle the isSecondVehicle to set
	 */
	public void setIsSecondVehicle(Boolean isSecondVehicle) {
		this.isSecondVehicle = isSecondVehicle;
	}

	public Boolean isConstructionVehicle() {
		return isConstructionVehicle;
	}

	public void setConstructionVehicle(Boolean isConstructionVehicle) {
		this.isConstructionVehicle = isConstructionVehicle;
	}

	/**
	 * @return the isConstructionVehicle
	 */
	public Boolean getIsConstructionVehicle() {
		return isConstructionVehicle;
	}

	/**
	 * @param isConstructionVehicle the isConstructionVehicle to set
	 */
	public void setIsConstructionVehicle(Boolean isConstructionVehicle) {
		this.isConstructionVehicle = isConstructionVehicle;
	}

	/**
	 * @return the covCode
	 */
	public String getCovCode() {
		return covCode;
	}

	/**
	 * @param covCode the covCode to set
	 */
	public void setCovCode(String covCode) {
		this.covCode = covCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the inputFieldsBasedOnCov
	 */
	
	
}
