package org.epragati.rta.reports.vo;

import java.util.List;

/**
 * 
 * @author Krishnarjun Pampana
 *
 */
public class TrReportTotalsVO {

	private int nTotal = 0;
	private int tTotal = 0;
	private Long totalNQTax = 0l;
	private Long totalNLTax = 0l;
	private Long totalTQTax= 0l;
	private Long totalTLTax =0l;
	private Long totalQTax=0l;
	private Long totalLtax=0l;
	private Integer totalTax ;
	
	
	public Long getTotalQTax() {
		return totalQTax;
	}
	public void setTotalQTax(Long totalQTax) {
		this.totalQTax = totalQTax;
	}
	public Long getTotalLtax() {
		return totalLtax;
	}
	public void setTotalLtax(Long totalLtax) {
		this.totalLtax = totalLtax;
	}
	private List<TrGeneratedReportVO> subTotals;
	public int getnTotal() {
		return nTotal;
	}
	public void setnTotal(int nTotal) {
		this.nTotal = nTotal;
	}
	public int gettTotal() {
		return tTotal;
	}
	public void settTotal(int tTotal) {
		this.tTotal = tTotal;
	}
	public Long getTotalNQTax() {
		return totalNQTax;
	}
	public void setTotalNQTax(Long totalNQTax) {
		this.totalNQTax = totalNQTax;
	}
	public Long getTotalNLTax() {
		return totalNLTax;
	}
	public void setTotalNLTax(Long totalNLTax) {
		this.totalNLTax = totalNLTax;
	}
	public Long getTotalTQTax() {
		return totalTQTax;
	}
	public void setTotalTQTax(Long totalTQTax) {
		this.totalTQTax = totalTQTax;
	}
	public Long getTotalTLTax() {
		return totalTLTax;
	}
	public void setTotalTLTax(Long totalTLTax) {
		this.totalTLTax = totalTLTax;
	}
	public Integer getTotalTax() {
		return totalTax;
	}
	public void setTotalTax(Integer totalTax) {
		this.totalTax = totalTax;
	}
	public List<TrGeneratedReportVO> getSubTotals() {
		return subTotals;
	}
	public void setSubTotals(List<TrGeneratedReportVO> subTotals) {
		this.subTotals = subTotals;
	}
	
	
}
