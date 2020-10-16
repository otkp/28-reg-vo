/**
 * 
 */
package org.epragati.rta.vo;

import java.io.Serializable;

/**
 * @author kumaraswamy.asari
 *
 */
public class PendingCountVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer totalCount;
	private Integer transportCount;
	private Integer nonTransportCount;
	private Integer fcOtherStationCount;
	private Integer aadhaarSeedPendingCount;
	private Integer osNocPendingCount;

	private Integer bodyBuildingCount;
	/**
	 * financier Req Pending Count
	 */
	private Integer financierCreatePendingCount;
	
	private Integer aadhaarSeedApprovedCount;
	
	private Integer aadhaarSeedRejectedCount;
	
	public Integer getBodyBuildingCount() {
		return bodyBuildingCount;
	}
	public void setBodyBuildingCount(Integer bodyBuildingCount) {
		this.bodyBuildingCount = bodyBuildingCount;
	}
	
	public Integer getAadhaarSeedPendingCount() {
		return aadhaarSeedPendingCount;
	}
	public void setAadhaarSeedPendingCount(Integer aadhaarSeedPendingCount) {
		this.aadhaarSeedPendingCount = aadhaarSeedPendingCount;
	}
	/**
	 * @return the totalCount
	 */
	public Integer getTotalCount() {
		return totalCount;
	}
	/**
	 * @param totalCount the totalCount to set
	 */
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	/**
	 * @return the transportCount
	 */
	public Integer getTransportCount() {
		return transportCount;
	}
	/**
	 * @param transportCount the transportCount to set
	 */
	public void setTransportCount(Integer transportCount) {
		this.transportCount = transportCount;
	}
	/**
	 * @return the nonTransportCount
	 */
	public Integer getNonTransportCount() {
		return nonTransportCount;
	}
	/**
	 * @param nonTransportCount the nonTransportCount to set
	 */
	public void setNonTransportCount(Integer nonTransportCount) {
		this.nonTransportCount = nonTransportCount;
	}
	public Integer getOsNocPendingCount() {
		return osNocPendingCount;
	}
	public void setOsNocPendingCount(Integer osNocPendingCount) {
		this.osNocPendingCount = osNocPendingCount;
	}

	/**
	 * @return the financierCreatePendingCount
	 */
	public Integer getFinancierCreatePendingCount() {
		return financierCreatePendingCount;
	}
	/**
	 * @param financierCreatePendingCount the financierCreatePendingCount to set
	 */
	public void setFinancierCreatePendingCount(Integer financierCreatePendingCount) {
		this.financierCreatePendingCount = financierCreatePendingCount;
	}
	
	

	
	public Integer getAadhaarSeedApprovedCount() {
		return aadhaarSeedApprovedCount;
	}
	public void setAadhaarSeedApprovedCount(Integer aadhaarSeedApprovedCount) {
		this.aadhaarSeedApprovedCount = aadhaarSeedApprovedCount;
	}
	public Integer getAadhaarSeedRejectedCount() {
		return aadhaarSeedRejectedCount;
	}
	public void setAadhaarSeedRejectedCount(Integer aadhaarSeedRejectedCount) {
		this.aadhaarSeedRejectedCount = aadhaarSeedRejectedCount;
	}
	public Integer getFcOtherStationCount() {
		return fcOtherStationCount;
	}
	public void setFcOtherStationCount(Integer fcOtherStationCount) {
		this.fcOtherStationCount = fcOtherStationCount;
	}

}
