package org.epragati.permits.vo;

import java.io.Serializable;

import org.epragati.common.vo.BaseVO;

public class PermitRouteTypeVO extends BaseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

	private String cov;

	private String routeType;

	private boolean status;

	private boolean showAdjacentDistrict;
	
	private String routeCode;
	
	private boolean authorization;

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
	 * @return the cov
	 */
	public String getCov() {
		return cov;
	}

	/**
	 * @param cov
	 *            the cov to set
	 */
	public void setCov(String cov) {
		this.cov = cov;
	}

	/**
	 * @return the routeType
	 */
	public String getRouteType() {
		return routeType;
	}

	/**
	 * @param routeType
	 *            the routeType to set
	 */
	public void setRouteType(String routeType) {
		this.routeType = routeType;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the showAdjacentDistrict
	 */
	public boolean isShowAdjacentDistrict() {
		return showAdjacentDistrict;
	}

	/**
	 * @param showAdjacentDistrict
	 *            the showAdjacentDistrict to set
	 */
	public void setShowAdjacentDistrict(boolean showAdjacentDistrict) {
		this.showAdjacentDistrict = showAdjacentDistrict;
	}

	/**
	 * @return the routeCode
	 */
	public String getRouteCode() {
		return routeCode;
	}

	/**
	 * @param routeCode the routeCode to set
	 */
	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

	/**
	 * @return the authorization
	 */
	public boolean isAuthorization() {
		return authorization;
	}

	/**
	 * @param authorization the authorization to set
	 */
	public void setAuthorization(boolean authorization) {
		this.authorization = authorization;
	}
	
	
}