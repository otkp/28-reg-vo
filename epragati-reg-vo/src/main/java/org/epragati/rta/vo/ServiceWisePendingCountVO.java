package org.epragati.rta.vo;

import java.io.Serializable;

public class ServiceWisePendingCountVO  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String service;
	
	private Integer serviceId;
	
	private String serviceDescripion;
	
	private PendingCountVo pendingCountVo;

	/**
	 * @return the service
	 */
	public String getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(String service) {
		this.service = service;
	}

	/**
	 * @return the pendingCountVo
	 */
	public PendingCountVo getPendingCountVo() {
		return pendingCountVo;
	}

	/**
	 * @param pendingCountVo the pendingCountVo to set
	 */
	public void setPendingCountVo(PendingCountVo pendingCountVo) {
		this.pendingCountVo = pendingCountVo;
	}


	/**
	 * @return the serviceId
	 */
	public Integer getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the serviceDescripion
	 */
	public String getServiceDescripion() {
		return serviceDescripion;
	}

	/**
	 * @param serviceDescripion the serviceDescripion to set
	 */
	public void setServiceDescripion(String serviceDescripion) {
		this.serviceDescripion = serviceDescripion;
	}
	
	
}
