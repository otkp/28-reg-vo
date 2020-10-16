package org.epragati.payments.vo;

import java.util.List;

import org.epragati.util.payment.ServiceEnum;
import org.hibernate.validator.constraints.NotEmpty;

public class FeeDetailInput {

	@NotEmpty(message = "Class of vehicles are required")
	private List<ClassOfVehiclesVO> covs;

	private Double feeAmount;

	private List<ServiceEnum> serviceList;

	private String weightType;

	/**
	 * @return the covs
	 */
	public List<ClassOfVehiclesVO> getCovs() {
		return covs;
	}

	/**
	 * @param covs
	 *            the covs to set
	 */
	public void setCovs(List<ClassOfVehiclesVO> covs) {
		this.covs = covs;
	}

	/**
	 * @return the feeAmount
	 */
	public Double getFeeAmount() {
		return feeAmount;
	}

	/**
	 * @param feeAmount
	 *            the feeAmount to set
	 */
	public void setFeeAmount(Double feeAmount) {
		this.feeAmount = feeAmount;
	}

	/**
	 * @return the serviceList
	 */
	public List<ServiceEnum> getServiceList() {
		return serviceList;
	}

	/**
	 * @param serviceList
	 *            the serviceList to set
	 */
	public void setServiceList(List<ServiceEnum> serviceList) {
		this.serviceList = serviceList;
	}

	/**
	 * @return the weightType
	 */
	public String getWeightType() {
		return weightType;
	}

	/**
	 * @param weightType
	 *            the weightType to set
	 */
	public void setWeightType(String weightType) {
		this.weightType = weightType;
	}

}
