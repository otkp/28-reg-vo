package org.epragati.regservice.vo;

import java.util.List;

import org.epragati.payments.vo.FeeDetailsVO;
import org.epragati.util.StatusRegistration;
import org.epragati.util.payment.ServiceEnum;

public class MobileVO {

	private String prNo;
	
	private boolean isRcExpried = false;
	
	private boolean isRcExpriedFirst = false;
	
	private boolean isPermitExpried = false;
	
	private boolean isPermitExpriedFirst = false;
	
	private boolean isNotEligibleForTax = false;
	
	private int rCExpriedDays;
	
	private int permitExpriedDays;
	
	private Double penalty;
	
	private String cov; 
	
	private String SeatingCapacity;
	
	private Integer gvw; 
	
	private String applicationNo;
	
	private List<String> vcrNos;
	
	private FeeDetailsVO feeDetails;
	
	
	
	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public boolean isPermitExpried() {
		return isPermitExpried;
	}

	public void setPermitExpried(boolean isPermitExpried) {
		this.isPermitExpried = isPermitExpried;
	}

	public boolean isPermitExpriedFirst() {
		return isPermitExpriedFirst;
	}

	public void setPermitExpriedFirst(boolean isPermitExpriedFirst) {
		this.isPermitExpriedFirst = isPermitExpriedFirst;
	}

	public int getPermitExpriedDays() {
		return permitExpriedDays;
	}

	public void setPermitExpriedDays(int permitExpriedDays) {
		this.permitExpriedDays = permitExpriedDays;
	}

	public Double getPenalty() {
		return penalty;
	}

	public void setPenalty(Double penalty) {
		this.penalty = penalty;
	}

	public boolean isRcExpried() {
		return isRcExpried;
	}

	public void setRcExpried(boolean isRcExpried) {
		this.isRcExpried = isRcExpried;
	}

	public boolean isRcExpriedFirst() {
		return isRcExpriedFirst;
	}

	public void setRcExpriedFirst(boolean isRcExpriedFirst) {
		this.isRcExpriedFirst = isRcExpriedFirst;
	}

	public int getrCExpriedDays() {
		return rCExpriedDays;
	}

	public void setrCExpriedDays(int rCExpriedDays) {
		this.rCExpriedDays = rCExpriedDays;
	}

	/**
	 * @return the isNotEligibleForTax
	 */
	public boolean isNotEligibleForTax() {
		return isNotEligibleForTax;
	}

	/**
	 * @param isNotEligibleForTax the isNotEligibleForTax to set
	 */
	public void setNotEligibleForTax(boolean isNotEligibleForTax) {
		this.isNotEligibleForTax = isNotEligibleForTax;
	}

	/**
	 * @return the cov
	 */
	public String getCov() {
		return cov;
	}

	/**
	 * @param cov the cov to set
	 */
	public void setCov(String cov) {
		this.cov = cov;
	}

	/**
	 * @return the seatingCapacity
	 */
	public String getSeatingCapacity() {
		return SeatingCapacity;
	}

	/**
	 * @param seatingCapacity the seatingCapacity to set
	 */
	public void setSeatingCapacity(String seatingCapacity) {
		SeatingCapacity = seatingCapacity;
	}

	/**
	 * @return the gvw
	 */
	public Integer getGvw() {
		return gvw;
	}

	/**
	 * @param gvw the gvw to set
	 */
	public void setGvw(Integer gvw) {
		this.gvw = gvw;
	}

	/**
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}

	/**
	 * @param applicationNo the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public List<String> getVcrNos() {
		return vcrNos;
	}

	public void setVcrNos(List<String> vcrNos) {
		this.vcrNos = vcrNos;
	}

	public FeeDetailsVO getFeeDetails() {
		return feeDetails;
	}

	public void setFeeDetails(FeeDetailsVO feeDetails) {
		this.feeDetails = feeDetails;
	}

	

}
