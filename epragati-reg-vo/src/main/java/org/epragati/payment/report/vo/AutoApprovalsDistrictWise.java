package org.epragati.payment.report.vo;

import java.util.List;
import java.util.Set;

import org.epragati.master.vo.DistrictVO;
import org.epragati.regservice.vo.AutoApprovalsOfficeWiseVO;
import org.epragati.util.payment.ServiceEnum;

public class AutoApprovalsDistrictWise {
	private DistrictVO district;
	private Integer districtWiseCount;
	private Integer districtsericesWiseCount;
	private Set<ServiceEnum> districtserviceName;
	private List<AutoApprovalsOfficeWiseVO> districtOfficeDetils;
	private Set<String> serviceNameDesc;
	/**
	 * @return the district
	 */
	public DistrictVO getDistrict() {
		return district;
	}
	/**
	 * @param district the district to set
	 */
	public void setDistrict(DistrictVO district) {
		this.district = district;
	}
	/**
	 * @return the districtWiseCount
	 */
	public Integer getDistrictWiseCount() {
		return districtWiseCount;
	}
	/**
	 * @param districtWiseCount the districtWiseCount to set
	 */
	public void setDistrictWiseCount(Integer districtWiseCount) {
		this.districtWiseCount = districtWiseCount;
	}
	/**
	 * @return the districtsericesWiseCount
	 */
	public Integer getDistrictsericesWiseCount() {
		return districtsericesWiseCount;
	}
	/**
	 * @param districtsericesWiseCount the districtsericesWiseCount to set
	 */
	public void setDistrictsericesWiseCount(Integer districtsericesWiseCount) {
		this.districtsericesWiseCount = districtsericesWiseCount;
	}
	/**
	 * @return the districtserviceName
	 */
	public Set<ServiceEnum> getDistrictserviceName() {
		return districtserviceName;
	}
	/**
	 * @param districtserviceName the districtserviceName to set
	 */
	public void setDistrictserviceName(Set<ServiceEnum> districtserviceName) {
		this.districtserviceName = districtserviceName;
	}
	/**
	 * @return the districtOfficeDetils
	 */
	public List<AutoApprovalsOfficeWiseVO> getDistrictOfficeDetils() {
		return districtOfficeDetils;
	}
	/**
	 * @param districtOfficeDetils the districtOfficeDetils to set
	 */
	public void setDistrictOfficeDetils(List<AutoApprovalsOfficeWiseVO> districtOfficeDetils) {
		this.districtOfficeDetils = districtOfficeDetils;
	}
	public Set<String> getServiceNameDesc() {
		return serviceNameDesc;
	}
	public void setServiceNameDesc(Set<String> serviceNameDesc) {
		this.serviceNameDesc = serviceNameDesc;
	}

}
