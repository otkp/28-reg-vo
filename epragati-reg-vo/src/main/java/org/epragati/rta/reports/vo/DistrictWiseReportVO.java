package org.epragati.rta.reports.vo;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class DistrictWiseReportVO {
	
	private String districtName;
	
	private Integer districtId;
	
	private SubReportVO quarterlyTax;
	
	private SubReportVO	lifeTax;
	
	private SubReportVO fee;
	
	private SubReportVO servicecharge;
	
	private SubReportVO detection;
	
	private SubReportVO total;
	
	private ReportTotalsVo grandTotals;

	public ReportTotalsVo getGrandTotals() {
		return grandTotals;
	}

	public void setGrandTotals(ReportTotalsVo grandTotals) {
		this.grandTotals = grandTotals;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public SubReportVO getQuarterlyTax() {
		return quarterlyTax;
	}

	public void setQuarterlyTax(SubReportVO quarterlyTax) {
		this.quarterlyTax = quarterlyTax;
	}

	public SubReportVO getLifeTax() {
		return lifeTax;
	}

	public void setLifeTax(SubReportVO lifeTax) {
		this.lifeTax = lifeTax;
	}

	public SubReportVO getFee() {
		return fee;
	}

	public void setFee(SubReportVO fee) {
		this.fee = fee;
	}

	public SubReportVO getServicecharge() {
		return servicecharge;
	}

	public void setServicecharge(SubReportVO servicecharge) {
		this.servicecharge = servicecharge;
	}

	public SubReportVO getDetection() {
		return detection;
	}

	public void setDetection(SubReportVO detection) {
		this.detection = detection;
	}

	public SubReportVO getTotal() {
		return total;
	}

	public void setTotal(SubReportVO total) {
		this.total = total;
	}

	/**
	 * @return the districtId
	 */
	public Integer getDistrictId() {
		return districtId;
	}

	/**
	 * @param districtId the districtId to set
	 */
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}


	

}
