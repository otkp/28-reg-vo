package org.epragati.master.vo;

import java.util.List;
import java.util.Set;

import org.epragati.util.payment.ServiceEnum;

public class AadharReqServiceIdsVO {
	private List<ServiceEnum> serviceType;

	private Set<Integer> serviceIds;

	public List<ServiceEnum> getServiceType() {
		return serviceType;
	}

	public void setServiceType(List<ServiceEnum> serviceType) {
		this.serviceType = serviceType;
	}

	public Set<Integer> getServiceIds() {
		return serviceIds;
	}

	public void setServiceIds(Set<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}
	
}
