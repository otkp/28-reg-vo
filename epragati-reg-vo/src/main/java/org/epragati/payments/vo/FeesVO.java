package org.epragati.payments.vo;

import java.time.LocalDateTime;
import java.util.Map;

import org.epragati.util.payment.ServiceEnum;

public class FeesVO {
	
	private String _id;
	private Integer serviceId;
	private String covCode;
	private String moduleCode;
	private String servicedescription;
	private String feesType;
	private String weighttype;
	private Double amount;
	private String HOA;
	private String HOADESCRIPTION;
	private LocalDateTime createdate;
	private LocalDateTime lupdate;
	private Map<ServiceEnum,Double> serviceWise;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return _id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this._id = id;
	}

	/**
	 * @return the serviceId
	 */
	public Integer getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId
	 *            the serviceId to set
	 */
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
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
	 * @return the moduleCode
	 */
	public String getModuleCode() {
		return moduleCode;
	}

	/**
	 * @param moduleCode
	 *            the moduleCode to set
	 */
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	/**
	 * @return the servicedescription
	 */
	public String getServicedescription() {
		return servicedescription;
	}

	/**
	 * @param servicedescription
	 *            the servicedescription to set
	 */
	public void setServicedescription(String servicedescription) {
		this.servicedescription = servicedescription;
	}

	/**
	 * @return the feeType
	 */
	public String getFeesType() {
		return feesType;
	}

	/**
	 * @param feeType
	 *            the feeType to set
	 */
	public void setFeesType(String feesType) {
		this.feesType = feesType;
	}

	/**
	 * @return the weighttype
	 */
	public String getWeighttype() {
		return weighttype;
	}

	/**
	 * @param weighttype
	 *            the weighttype to set
	 */
	public void setWeighttype(String weighttype) {
		this.weighttype = weighttype;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @return the hOA
	 */
	public String getHOA() {
		return HOA;
	}

	/**
	 * @param hOA
	 *            the hOA to set
	 */
	public void setHOA(String hOA) {
		HOA = hOA;
	}

	/**
	 * @return the hOADESCRIPTION
	 */
	public String getHOADESCRIPTION() {
		return HOADESCRIPTION;
	}

	/**
	 * @param hOADESCRIPTION
	 *            the hOADESCRIPTION to set
	 */
	public void setHOADESCRIPTION(String hOADESCRIPTION) {
		HOADESCRIPTION = hOADESCRIPTION;
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

	public Map<ServiceEnum, Double> getServiceWise() {
		return serviceWise;
	}

	public void setServiceWise(Map<ServiceEnum, Double> serviceWise) {
		this.serviceWise = serviceWise;
	}

	

}
