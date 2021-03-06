package org.epragati.permits.vo;

import java.io.Serializable;

import org.epragati.common.vo.BaseVO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author sairam.cheruku
 *
 */
@JsonInclude(Include.NON_NULL)
public class PermitGoodsDetailsVO extends BaseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

	private String description;

	private String permitType;

	private String permitAllowedgoods;

	private Boolean status;

	private String bodyTypeDesc;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the permitAllowedgoods
	 */
	public String getPermitAllowedgoods() {
		return permitAllowedgoods;
	}

	/**
	 * @param permitAllowedgoods
	 *            the permitAllowedgoods to set
	 */
	public void setPermitAllowedgoods(String permitAllowedgoods) {
		this.permitAllowedgoods = permitAllowedgoods;
	}

	/**
	 * @return the permitType
	 */
	public String getPermitType() {
		return permitType;
	}

	/**
	 * @param permitType
	 *            the permitType to set
	 */
	public void setPermitType(String permitType) {
		this.permitType = permitType;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * @return the bodyTypeDesc
	 */
	public String getBodyTypeDesc() {
		return bodyTypeDesc;
	}

	/**
	 * @param bodyTypeDesc
	 *            the bodyTypeDesc to set
	 */
	public void setBodyTypeDesc(String bodyTypeDesc) {
		this.bodyTypeDesc = bodyTypeDesc;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
