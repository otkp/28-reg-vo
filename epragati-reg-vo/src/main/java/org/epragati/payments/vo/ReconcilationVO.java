package org.epragati.payments.vo;

import java.time.LocalDate;
import java.util.List;

import org.epragati.common.vo.BaseVO;
import org.epragati.vcr.vo.ConsolidateChallanVO;
import org.epragati.vcr.vo.VcrFinalServiceVO;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author saikiran.kola
 *
 */
public class ReconcilationVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<ChalanaDetailsVO> challanDetails;

	private String mviName;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate vcrBookedDate;

	private List<VcrFinalServiceVO> vcrDetails;

	private List<VcrFinalServiceVO> paidVcrDetails;

	private List<ConsolidateChallanVO> consolidatedDetails;

	private ConsolidateChallanVO consolidateTotals;

	public ConsolidateChallanVO getConsolidateTotals() {
		return consolidateTotals;
	}

	public void setConsolidateTotals(ConsolidateChallanVO consolidateTotals) {
		this.consolidateTotals = consolidateTotals;
	}

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fromDate;

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

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate toDate;

	public List<ConsolidateChallanVO> getConsolidatedDetails() {
		return consolidatedDetails;
	}

	public void setConsolidatedDetails(List<ConsolidateChallanVO> consolidatedDetails) {
		this.consolidatedDetails = consolidatedDetails;
	}

	public List<VcrFinalServiceVO> getPaidVcrDetails() {
		return paidVcrDetails;
	}

	public void setPaidVcrDetails(List<VcrFinalServiceVO> paidVcrDetails) {
		this.paidVcrDetails = paidVcrDetails;
	}

	public List<VcrFinalServiceVO> getVcrDetails() {
		return vcrDetails;
	}

	public List<ChalanaDetailsVO> getChallanDetails() {
		return challanDetails;
	}

	public void setChallanDetails(List<ChalanaDetailsVO> challanDetails) {
		this.challanDetails = challanDetails;
	}

	public void setVcrDetails(List<VcrFinalServiceVO> vcrDetails) {
		this.vcrDetails = vcrDetails;
	}

	public String getMviName() {
		return mviName;
	}

	public void setMviName(String mviName) {
		this.mviName = mviName;
	}

	public LocalDate getVcrBookedDate() {
		return vcrBookedDate;
	}

	public void setVcrBookedDate(LocalDate vcrBookedDate) {
		this.vcrBookedDate = vcrBookedDate;
	}

}
