package org.epragati.payments.vo;

import java.time.LocalDate;
import java.util.List;

import org.epragati.common.vo.BaseVO;
import org.epragati.rta.reports.vo.ReportVO;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author saikiran.kola
 *
 */
public class CashBookVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fromDate;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate toDate;

	private String shift;

	private long vcrCount;

	private double compoundFee;

	private String taxType;

	private double taxAmount;

	private String mviName;

	private List<ReportVO> taxDetails;

	private double tpFee;

	private double spFee;

	private double totalPermitFee;

	private long totalTps;

	private long totalSps;

	private double penality;

	private double serviceFee;

	private double totalTax;

	private String vcrNo;

	private String regNo;

	private String issuedBy;

	private double penalityArrears;

	private double taxArrears;

	private long totalTaxNo;

	private double voluntaryTax;

	private double voluntaryPenality;

	private double vcrTax;

	private String tresuryName;

	private String tresuryAmount;

	private LocalDate vcrDate;

	public LocalDate getVcrDate() {
		return vcrDate;
	}

	public void setVcrDate(LocalDate vcrDate) {
		this.vcrDate = vcrDate;
	}

	public String getTresuryAmount() {
		return tresuryAmount;
	}

	public void setTresuryAmount(String tresuryAmount) {
		this.tresuryAmount = tresuryAmount;
	}

	public String getTresuryName() {
		return tresuryName;
	}

	public void setTresuryName(String tresuryName) {
		this.tresuryName = tresuryName;
	}

	public LocalDate getChallanDate() {
		return challanDate;
	}

	public void setChallanDate(LocalDate challanDate) {
		this.challanDate = challanDate;
	}

	private LocalDate challanDate;

	public double getVcrTax() {
		return vcrTax;
	}

	public void setVcrTax(double vcrTax) {
		this.vcrTax = vcrTax;
	}

	private long voluntaryCount;

	private double grandTotal;

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

	public long getVoluntaryCount() {
		return voluntaryCount;
	}

	public void setVoluntaryCount(long voluntaryCount) {
		this.voluntaryCount = voluntaryCount;
	}

	public double getVoluntaryTax() {
		return voluntaryTax;
	}

	public void setVoluntaryTax(double voluntaryTax) {
		this.voluntaryTax = voluntaryTax;
	}

	public double getVoluntaryPenality() {
		return voluntaryPenality;
	}

	public void setVoluntaryPenality(double voluntaryPenality) {
		this.voluntaryPenality = voluntaryPenality;
	}

	public long getTotalTaxNo() {
		return totalTaxNo;
	}

	public void setTotalTaxNo(long totalTaxNo) {
		this.totalTaxNo = totalTaxNo;
	}

	public double getPenalityArrears() {
		return penalityArrears;
	}

	public void setPenalityArrears(double penalityArrears) {
		this.penalityArrears = penalityArrears;
	}

	public double getTaxArrears() {
		return taxArrears;
	}

	public void setTaxArrears(double taxArrears) {
		this.taxArrears = taxArrears;
	}

	public String getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getVcrNo() {
		return vcrNo;
	}

	public void setVcrNo(String vcrNo) {
		this.vcrNo = vcrNo;
	}

	public double getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(double serviceFee) {
		this.serviceFee = serviceFee;
	}

	public double getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	private double total;

	public long getTotalTps() {
		return totalTps;
	}

	public void setTotalTps(long totalTps) {
		this.totalTps = totalTps;
	}

	public long getTotalSps() {
		return totalSps;
	}

	public void setTotalSps(long totalSps) {
		this.totalSps = totalSps;
	}

	public double getTotalPermitFee() {
		return totalPermitFee;
	}

	public void setTotalPermitFee(double totalPermitFee) {
		this.totalPermitFee = totalPermitFee;
	}

	public double getTpFee() {
		return tpFee;
	}

	public void setTpFee(double tpFee) {
		this.tpFee = tpFee;
	}

	public double getSpFee() {
		return spFee;
	}

	public void setSpFee(double spFee) {
		this.spFee = spFee;
	}

	public double getCompoundFee() {
		return compoundFee;
	}

	public void setCompoundFee(double compoundFee) {
		this.compoundFee = compoundFee;
	}

	public String getMviName() {
		return mviName;
	}

	public void setMviName(String mviName) {
		this.mviName = mviName;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public List<ReportVO> getTaxDetails() {
		return taxDetails;
	}

	public void setTaxDetails(List<ReportVO> taxDetails) {
		this.taxDetails = taxDetails;
	}

	public long getVcrCount() {
		return vcrCount;
	}

	public void setVcrCount(long vcrCount) {
		this.vcrCount = vcrCount;
	}

	public double getPenality() {
		return penality;
	}

	public void setPenality(double penality) {
		this.penality = penality;
	}

}
