package org.epragati.regservice.vo;

import java.util.List;
/**
 * 
 * @author krishnarjun.pampana
 *
 */

public class ServicesCombinationsVO {

	private Integer ServiceId;
	private List<Integer> combinationServices;
	private String serviceDescription;
	private boolean status;
	private int orderNo;
	private boolean aadhaarAuthenticationRequired;
	private boolean isSlotReqiured;
	

	/**
	 * @return the combinationServices
	 */
	public List<Integer> getCombinationServices() {
		return combinationServices;
	}

	/**
	 * @param combinationServices
	 *            the combinationServices to set
	 */
	public void setCombinationServices(List<Integer> combinationServices) {
		this.combinationServices = combinationServices;
	}

	/**
	 * @return the serviceDescription
	 */
	public String getServiceDescription() {
		return serviceDescription;
	}

	/**
	 * @param serviceDescription
	 *            the serviceDescription to set
	 */
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
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
	 * @return the orderNo
	 */
	public int getOrderNo() {
		return orderNo;
	}

	/**
	 * @param orderNo
	 *            the orderNo to set
	 */
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public boolean isAadhaarAuthenticationRequired() {
		return aadhaarAuthenticationRequired;
	}

	public void setAadhaarAuthenticationRequired(boolean aadhaarAuthenticationRequired) {
		this.aadhaarAuthenticationRequired = aadhaarAuthenticationRequired;
	}

	/**
	 * @return the isSlotReqiured
	 */
	public boolean isSlotReqiured() {
		return isSlotReqiured;
	}

	/**
	 * @param isSlotReqiured the isSlotReqiured to set
	 */
	public void setSlotReqiured(boolean isSlotReqiured) {
		this.isSlotReqiured = isSlotReqiured;
	}

	/**
	 * @return the serviceId
	 */
	public Integer getServiceId() {
		return ServiceId;
	}

	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(Integer serviceId) {
		ServiceId = serviceId;
	}

	/**
	 * @return the id
	 */

}

