package org.epragati.rta.vo;

import java.io.Serializable;
import java.util.List;

public class CitizenDashBordDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<ServiceWisePendingCountVO> serviceWisePendingCountVO;
	
	private Integer servicesTotalPendingCount;

	
	/**
	 * @return the serviceWisePendingCountVO
	 */
	public List<ServiceWisePendingCountVO> getServiceWisePendingCountVO() {
		return serviceWisePendingCountVO;
	}

	/**
	 * @param serviceWisePendingCountVO the serviceWisePendingCountVO to set
	 */
	public void setServiceWisePendingCountVO(List<ServiceWisePendingCountVO> serviceWisePendingCountVO) {
		this.serviceWisePendingCountVO = serviceWisePendingCountVO;
	}

	/**
	 * @return the servicesTotalPendingCount
	 */
	public Integer getServicesTotalPendingCount() {
		return servicesTotalPendingCount;
	}

	/**
	 * @param servicesTotalPendingCount the servicesTotalPendingCount to set
	 */
	public void setServicesTotalPendingCount(Integer servicesTotalPendingCount) {
		this.servicesTotalPendingCount = servicesTotalPendingCount;
	}

	
	
}
