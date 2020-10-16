package org.epragati.regservice.vo;

import java.util.List;
import java.util.Set;

import org.epragati.master.vo.OfficeVO;
import org.epragati.util.payment.ServiceEnum;

public class AutoApprovalsOfficeWiseVO {
	
	private OfficeVO officeName;
	private Integer officeWiseCount;
	private Set<ServiceEnum> serviceName;
	private Set<String> serviceNameDesc;
	/**
	 * @return the officeName
	 */
	public OfficeVO getOfficeName() {
		return officeName;
	}
	/**
	 * @param officeName the officeName to set
	 */
	public void setOfficeName(OfficeVO officeName) {
		this.officeName = officeName;
	}
	/**
	 * @return the officeWiseCount
	 */
	public Integer getOfficeWiseCount() {
		return officeWiseCount;
	}
	/**
	 * @param officeWiseCount the officeWiseCount to set
	 */
	public void setOfficeWiseCount(Integer officeWiseCount) {
		this.officeWiseCount = officeWiseCount;
	}
	/**
	 * @return the serviceName
	 */
	public Set<ServiceEnum> getServiceName() {
		return serviceName;
	}
	/**
	 * @param serviceName the serviceName to set
	 */
	public void setServiceName(Set<ServiceEnum> serviceName) {
		this.serviceName = serviceName;
	}
	public Set<String> getServiceNameDesc() {
		return serviceNameDesc;
	}
	public void setServiceNameDesc(Set<String> serviceNameDesc) {
		this.serviceNameDesc = serviceNameDesc;
	} 
}
