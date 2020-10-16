package org.epragati.payment.report.vo;

public class TotalVcrCountInDist {

	private String districName;
	
	private Integer vcrCount;
	
	private Integer paidVcrCount;
    private Integer districtId;
	
	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public Integer getPaidVcrCount() {
		return paidVcrCount;
	}

	public void setPaidVcrCount(Integer paidVcrCount) {
		this.paidVcrCount = paidVcrCount;
	}

	public String getDistricName() {
		return districName;
	}

	public void setDistricName(String districName) {
		this.districName = districName;
	}

	public Integer getVcrCount() {
		return vcrCount;
	}

	public void setVcrCount(Integer vcrCount) {
		this.vcrCount = vcrCount;
	}
	
}
