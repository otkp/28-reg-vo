package org.epragati.rta.reports.vo;
/**
 * 
 * @author Krishnarjun Pampana
 *
 */
public class TrGeneratedReportVO {
	
	private String office;
	
	private int nonTransportCount = 0;
	private int transportCount = 0;
	private Long nonTransportQTax= 0l;
	private Long nonTransportLTax= 0l;
	private Long transportQTax= 0l;
	private Long transportLTax= 0l;
	private Long lifeTaxTotal = 0l;
	private Long quarTaxTotal = 0l;
	private Long taxTotal = 0l;
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public int getNonTransportCount() {
		return nonTransportCount;
	}
	public void setNonTransportCount(int nonTransportCount) {
		this.nonTransportCount = nonTransportCount;
	}
	public int getTransportCount() {
		return transportCount;
	}
	public void setTransportCount(int transportCount) {
		this.transportCount = transportCount;
	}
	public Long getNonTransportQTax() {
		return nonTransportQTax;
	}
	public void setNonTransportQTax(Long nonTransportQTax) {
		this.nonTransportQTax = nonTransportQTax;
	}
	public Long getNonTransportLTax() {
		return nonTransportLTax;
	}
	public void setNonTransportLTax(Long nonTransportLTax) {
		this.nonTransportLTax = nonTransportLTax;
	}
	public Long getTransportQTax() {
		return transportQTax;
	}
	public void setTransportQTax(Long transportQTax) {
		this.transportQTax = transportQTax;
	}
	public Long getTransportLTax() {
		return transportLTax;
	}
	public void setTransportLTax(Long transportLTax) {
		this.transportLTax = transportLTax;
	}
	public Long getLifeTaxTotal() {
		return lifeTaxTotal;
	}
	public void setLifeTaxTotal(Long lifeTaxTotal) {
		this.lifeTaxTotal = lifeTaxTotal;
	}
	public Long getQuarTaxTotal() {
		return quarTaxTotal;
	}
	public void setQuarTaxTotal(Long quarTaxTotal) {
		this.quarTaxTotal = quarTaxTotal;
	}
	public Long getTaxTotal() {
		return taxTotal;
	}
	public void setTaxTotal(Long taxTotal) {
		this.taxTotal = taxTotal;
	}
	
	
}
