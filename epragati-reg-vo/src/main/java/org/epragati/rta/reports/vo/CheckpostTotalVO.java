package org.epragati.rta.reports.vo;

import java.util.List;

public class CheckpostTotalVO {
	
	
	private List<CheckPostReportsVO> checkPostReportsVO;

	private long totalVcrCount;

	private double totalCompoundFee;

	private double totalVoluntaryTax;

	private long totalVoluntaryCount;

	private double totalPermitTax = 0.0;

	private long totalPermitCount;

	private double totalPermitFee = 0.0;

	
	public List<CheckPostReportsVO> getCheckPostReportsVO() {
		return checkPostReportsVO;
	}

	public void setCheckPostReportsVO(List<CheckPostReportsVO> checkPostReportsVO) {
		this.checkPostReportsVO = checkPostReportsVO;
	}

	public long getTotalVcrCount() {
		return totalVcrCount;
	}

	public void setTotalVcrCount(long totalVcrCount) {
		this.totalVcrCount = totalVcrCount;
	}

	public double getTotalCompoundFee() {
		return totalCompoundFee;
	}

	public void setTotalCompoundFee(double totalCompoundFee) {
		this.totalCompoundFee = totalCompoundFee;
	}

	public double getTotalVoluntaryTax() {
		return totalVoluntaryTax;
	}

	public void setTotalVoluntaryTax(double totalVoluntaryTax) {
		this.totalVoluntaryTax = totalVoluntaryTax;
	}

	public long getTotalVoluntaryCount() {
		return totalVoluntaryCount;
	}

	public void setTotalVoluntaryCount(long totalVoluntaryCount) {
		this.totalVoluntaryCount = totalVoluntaryCount;
	}

	public double getTotalPermitTax() {
		return totalPermitTax;
	}

	public void setTotalPermitTax(double totalPermitTax) {
		this.totalPermitTax = totalPermitTax;
	}

	public long getTotalPermitCount() {
		return totalPermitCount;
	}

	public void setTotalPermitCount(long totalPermitCount) {
		this.totalPermitCount = totalPermitCount;
	}

	public double getTotalPermitFee() {
		return totalPermitFee;
	}

	public void setTotalPermitFee(double totalPermitFee) {
		this.totalPermitFee = totalPermitFee;
	}

}
