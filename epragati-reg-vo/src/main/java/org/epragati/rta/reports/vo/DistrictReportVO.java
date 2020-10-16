package org.epragati.rta.reports.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@JsonInclude(Include.NON_NULL)
public class DistrictReportVO {
	
	
	private String officeName;
	
	private String officeCode;
	
	private ReportFeeVO fee;
	
	private ReportFeeVO serviceCharges;
	
	private LifeTaxVO lifeTax;
	
	private QuarterTaxVO quarterlyTax;
	
	private ReportFeeVO postalFee;
   
    private DetectionVO detection;
    
    private Double officeGrandTotal;
    
    private ReportTotalsVo grandTotals;
    
    public ReportTotalsVo getGrandTotals() {
		return grandTotals;
	}

	public void setGrandTotals(ReportTotalsVo grandTotals) {
		this.grandTotals = grandTotals;
	}

	public Double getOfficeGrandTotal() {
		return officeGrandTotal;
	}

	public void setOfficeGrandTotal(Double officeGrandTotal) {
		this.officeGrandTotal = officeGrandTotal;
	}
	/**
	 * @return the officeName
	 */
	public String getOfficeName() {
		return officeName;
	}

	/**
	 * @param officeName the officeName to set
	 */
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public ReportFeeVO getFee() {
		return fee;
	}

	public void setFee(ReportFeeVO fee) {
		this.fee = fee;
	}

	public ReportFeeVO getServiceCharges() {
		return serviceCharges;
	}

	public void setServiceCharges(ReportFeeVO serviceCharges) {
		this.serviceCharges = serviceCharges;
	}

	public LifeTaxVO getLifeTax() {
		return lifeTax;
	}

	public void setLifeTax(LifeTaxVO lifeTax) {
		this.lifeTax = lifeTax;
	}

	public QuarterTaxVO getQuarterlyTax() {
		return quarterlyTax;
	}

	public void setQuarterlyTax(QuarterTaxVO quarterlyTax) {
		this.quarterlyTax = quarterlyTax;
	}

	public ReportFeeVO getPostalFee() {
		return postalFee;
	}

	public void setPostalFee(ReportFeeVO postalFee) {
		this.postalFee = postalFee;
	}

	public DetectionVO getDetection() {
		return detection;
	}

	public void setDetection(DetectionVO detection) {
		this.detection = detection;
	}


}
