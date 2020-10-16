package org.epragati.financier.vo;

import java.io.Serializable;

import org.epragati.aadhaar.AadhaarDetailsRequestVO;
import org.epragati.master.vo.MasterFinanceTypeVO;
import org.epragati.util.StatusFinancierActions;

public class FinancierActionVO implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	private String applicationNo;

	private String prNo;

	private StatusFinancierActions action;

	private Double sanctionedAmount;

	private String comments;

	private String userId;

	private AadhaarDetailsRequestVO aadhaarRequest;

	private String status;

	private MasterFinanceTypeVO masterFinanciervo;

	private Boolean isHPA;
	
	private Boolean financierConsent;
	
	private String trNo;
	
	private String chassisNo;

	private String reqAuthType;
	
	public Boolean getFinancierConsent() {
		return financierConsent;
	}

	public void setFinancierConsent(Boolean financierConsent) {
		this.financierConsent = financierConsent;
	}

	/**
	 * @return the masterFinanciervo
	 */
	public MasterFinanceTypeVO getMasterFinanciervo() {
		return masterFinanciervo;
	}

	/**
	 * @param masterFinanciervo
	 *            the masterFinanciervo to set
	 */
	public void setMasterFinanciervo(MasterFinanceTypeVO masterFinanciervo) {
		this.masterFinanciervo = masterFinanciervo;
	}

	public StatusFinancierActions getAction() {
		return action;
	}

	public void setAction(StatusFinancierActions action) {
		this.action = action;
	}

	public AadhaarDetailsRequestVO getAadhaarRequest() {
		return aadhaarRequest;
	}

	public void setAadhaarRequest(AadhaarDetailsRequestVO aadhaarRequest) {
		this.aadhaarRequest = aadhaarRequest;
	}

	public Double getSanctionedAmount() {
		return sanctionedAmount;
	}

	public void setSanctionedAmount(Double sanctionedAmount) {
		this.sanctionedAmount = sanctionedAmount;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the isHPA
	 */
	public Boolean getIsHPA() {
		return isHPA;
	}

	/**
	 * @param isHPA
	 *            the isHPA to set
	 */
	public void setIsHPA(Boolean isHPA) {
		this.isHPA = isHPA;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo
	 *            the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the trNo
	 */
	public String getTrNo() {
		return trNo;
	}

	/**
	 * @param trNo the trNo to set
	 */
	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	/**
	 * @return the chassisNo
	 */
	public String getChassisNo() {
		return chassisNo;
	}

	/**
	 * @param chassisNo the chassisNo to set
	 */
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String getReqAuthType() {
		return reqAuthType;
	}

	public void setReqAuthType(String reqAuthType) {
		this.reqAuthType = reqAuthType;
	}
	
	
}
