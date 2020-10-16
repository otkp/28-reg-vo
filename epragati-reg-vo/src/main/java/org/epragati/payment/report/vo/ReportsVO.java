package org.epragati.payment.report.vo;

import java.util.List;

import org.epragati.aadhaarseeding.vo.AadhaarSeedVO;
import org.epragati.dealer.tradecert.TradeCertificateDealerVO;
import org.epragati.regservice.vo.AutoApprovalsOfficeWiseVO;
import org.epragati.regservice.vo.StagingRegServiceAutoApprovalsVO;
import org.epragati.rta.reports.vo.ReportVO;
import org.epragati.vcr.vo.AadharSeedingDistWiseVO;
import org.epragati.vcr.vo.AadharSeedingOfficeWiseVO;
import org.epragati.vcr.vo.VcrFinalServiceVO;

public class ReportsVO {

	private List<RegReportVO> paymentReport;
	
	private List<NonPaymentDetailsVO> nonPaymentDetails;

	private int pageNo;

	private List<ReportVO> report;
	
	private List<ShowCauseDetailsVO> showCauseDetails;
	
	private List<TradeCertificateDealerVO> tradeCertificateDealer;
	
	private List<VCRNonPaymentDetailsVO> vCRNonPaymentDetailsVO;
	private List<StagingRegServiceAutoApprovalsVO> autoApprovalsList;
	
	private List<AutoApprovalsOfficeWiseVO> autoApprovalsOfficeWise;
	private List<AutoApprovalsDistrictWise> autoApprovalsDistrictWise;
	private List<AadharSeedingDistWiseVO> aadharSeedApprovalsDistrictWise;
	private List<AadharSeedingOfficeWiseVO> aadharSeedApprovalsOfficeWise;
	
	private List<AadhaarSeedVO>  aadharSeedingDetils;
	
	private long totalVcrCount;
	private double totalTax;
	private long totalPenalty;
	private double totalTaxArrears;
	private long totalPenaltyArrears;
	private double totalPaidCf;
	private double totalUnPaidCf;
	private double finalTotal;
	
	private double paidTotalTaxAmount=0d;
	private Long paidTotalpenalty=0l;
	private Double paidTotalTaxArrears=0d;
	private Long paidTotalPenaltyArrears=0l;
	//private double paidMviCount=0d;
	private Integer paidTotalRecordsCount;
	private double paidfinalTotal;
	private List<VcrFinalServiceVO> vcrList;
	
	public void setVcrList(List<VcrFinalServiceVO> vcrList) {
		this.vcrList = vcrList;
	}

	public List<VcrFinalServiceVO> getVcrList() {
		return vcrList;
	}
	
	public double getPaidTotalTaxAmount() {
		return paidTotalTaxAmount;
	}

	public void setPaidTotalTaxAmount(double paidTotalTaxAmount) {
		this.paidTotalTaxAmount = paidTotalTaxAmount;
	}

	public Long getPaidTotalpenalty() {
		return paidTotalpenalty;
	}

	public void setPaidTotalpenalty(Long paidTotalpenalty) {
		this.paidTotalpenalty = paidTotalpenalty;
	}

	public Double getPaidTotalTaxArrears() {
		return paidTotalTaxArrears;
	}

	public void setPaidTotalTaxArrears(Double paidTotalTaxArrears) {
		this.paidTotalTaxArrears = paidTotalTaxArrears;
	}

	public Long getPaidTotalPenaltyArrears() {
		return paidTotalPenaltyArrears;
	}

	public void setPaidTotalPenaltyArrears(Long paidTotalPenaltyArrears) {
		this.paidTotalPenaltyArrears = paidTotalPenaltyArrears;
	}

	public Integer getPaidTotalRecordsCount() {
		return paidTotalRecordsCount;
	}

	public void setPaidTotalRecordsCount(Integer paidTotalRecordsCount) {
		this.paidTotalRecordsCount = paidTotalRecordsCount;
	}

	public double getPaidfinalTotal() {
		return paidfinalTotal;
	}

	public void setPaidfinalTotal(double paidfinalTotal) {
		this.paidfinalTotal = paidfinalTotal;
	}

	
	
	public List<VCRNonPaymentDetailsVO> getvCRNonPaymentDetailsVO() {
		return vCRNonPaymentDetailsVO;
	}

	public void setvCRNonPaymentDetailsVO(List<VCRNonPaymentDetailsVO> vCRNonPaymentDetailsVO) {
		this.vCRNonPaymentDetailsVO = vCRNonPaymentDetailsVO;
	}

	/**
	 * @return the tradeCertificateDealer
	 */
	public List<TradeCertificateDealerVO> getTradeCertificateDealer() {
		return tradeCertificateDealer;
	}

	/**
	 * @param tradeCertificateDealer the tradeCertificateDealer to set
	 */
	public void setTradeCertificateDealer(List<TradeCertificateDealerVO> tradeCertificateDealer) {
		this.tradeCertificateDealer = tradeCertificateDealer;
	}

	/**
	 * @return the showCauseDetails
	 */
	public List<ShowCauseDetailsVO> getShowCauseDetails() {
		return showCauseDetails;
	}

	/**
	 * @param showCauseDetails the showCauseDetails to set
	 */
	public void setShowCauseDetails(List<ShowCauseDetailsVO> showCauseDetails) {
		this.showCauseDetails = showCauseDetails;
	}

	public List<ReportVO> getReport() {
		return report;
	}

	public void setReport(List<ReportVO> report) {
		this.report = report;
	}

	private long total;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	private int totalPage;

	/**
	 * @return the paymentReport
	 */
	public List<RegReportVO> getPaymentReport() {
		return paymentReport;
	}

	/**
	 * @param paymentReport the paymentReport to set
	 */
	public void setPaymentReport(List<RegReportVO> paymentReport) {
		this.paymentReport = paymentReport;
	}

	/**
	 * @return the pageNo
	 */
	public int getPageNo() {
		return pageNo;
	}

	/**
	 * @param pageNo the pageNo to set
	 */
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	/**
	 * @return the totalPage
	 */
	public int getTotalPage() {
		return totalPage;
	}

	/**
	 * @param totalPage the totalPage to set
	 */
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<NonPaymentDetailsVO> getNonPaymentDetails() {
		return nonPaymentDetails;
	}

	public void setNonPaymentDetails(List<NonPaymentDetailsVO> nonPaymentDetails) {
		this.nonPaymentDetails = nonPaymentDetails;
	}

	/**
	 * @return the autoApprovalsList
	 */
	public List<StagingRegServiceAutoApprovalsVO> getAutoApprovalsList() {
		return autoApprovalsList;
	}

	/**
	 * @param autoApprovalsList the autoApprovalsList to set
	 */
	public void setAutoApprovalsList(List<StagingRegServiceAutoApprovalsVO> autoApprovalsList) {
		this.autoApprovalsList = autoApprovalsList;
	}

	/**
	 * @return the autoApprovalsOfficeWise
	 */
	public List<AutoApprovalsOfficeWiseVO> getAutoApprovalsOfficeWise() {
		return autoApprovalsOfficeWise;
	}

	/**
	 * @param autoApprovalsOfficeWise the autoApprovalsOfficeWise to set
	 */
	public void setAutoApprovalsOfficeWise(List<AutoApprovalsOfficeWiseVO> autoApprovalsOfficeWise) {
		this.autoApprovalsOfficeWise = autoApprovalsOfficeWise;
	}

	/**
	 * @return the autoApprovalsDistrictWise
	 */
	public List<AutoApprovalsDistrictWise> getAutoApprovalsDistrictWise() {
		return autoApprovalsDistrictWise;
	}

	/**
	 * @param autoApprovalsDistrictWise the autoApprovalsDistrictWise to set
	 */
	public void setAutoApprovalsDistrictWise(List<AutoApprovalsDistrictWise> autoApprovalsDistrictWise) {
		this.autoApprovalsDistrictWise = autoApprovalsDistrictWise;
	}

	public List<AadharSeedingDistWiseVO> getAadharSeedApprovalsDistrictWise() {
		return aadharSeedApprovalsDistrictWise;
	}

	public void setAadharSeedApprovalsDistrictWise(List<AadharSeedingDistWiseVO> aadharSeedApprovalsDistrictWise) {
		this.aadharSeedApprovalsDistrictWise = aadharSeedApprovalsDistrictWise;
	}

	public List<AadhaarSeedVO> getAadharSeedingDetils() {
		return aadharSeedingDetils;
	}

	public void setAadharSeedingDetils(List<AadhaarSeedVO> aadharSeedingDetils) {
		this.aadharSeedingDetils = aadharSeedingDetils;
	}

	public List<AadharSeedingOfficeWiseVO> getAadharSeedApprovalsOfficeWise() {
		return aadharSeedApprovalsOfficeWise;
	}

	public void setAadharSeedApprovalsOfficeWise(List<AadharSeedingOfficeWiseVO> aadharSeedApprovalsOfficeWise) {
		this.aadharSeedApprovalsOfficeWise = aadharSeedApprovalsOfficeWise;
	}

	public long getTotalVcrCount() {
		return totalVcrCount;
	}

	public void setTotalVcrCount(long totalVcrCount) {
		this.totalVcrCount = totalVcrCount;
	}

	public double getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}

	public long getTotalPenalty() {
		return totalPenalty;
	}

	public void setTotalPenalty(long totalPenalty) {
		this.totalPenalty = totalPenalty;
	}

	public double getTotalTaxArrears() {
		return totalTaxArrears;
	}

	public void setTotalTaxArrears(double totalTaxArrears) {
		this.totalTaxArrears = totalTaxArrears;
	}

	public long getTotalPenaltyArrears() {
		return totalPenaltyArrears;
	}

	public void setTotalPenaltyArrears(long totalPenaltyArrears) {
		this.totalPenaltyArrears = totalPenaltyArrears;
	}

	public double getTotalPaidCf() {
		return totalPaidCf;
	}

	public void setTotalPaidCf(double totalPaidCf) {
		this.totalPaidCf = totalPaidCf;
	}

	public double getTotalUnPaidCf() {
		return totalUnPaidCf;
	}

	public void setTotalUnPaidCf(double totalUnPaidCf) {
		this.totalUnPaidCf = totalUnPaidCf;
	}

	public double getFinalTotal() {
		return finalTotal;
	}

	public void setFinalTotal(double finalTotal) {
		this.finalTotal = finalTotal;
	}
	

	
}
