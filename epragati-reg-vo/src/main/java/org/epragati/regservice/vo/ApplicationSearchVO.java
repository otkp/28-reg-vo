package org.epragati.regservice.vo;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.Size;

import org.epragati.master.vo.MandalVO;
import org.epragati.payment.report.vo.RCCancellationVO;
import org.epragati.payment.report.vo.ShowCauseDetailsVO;
import org.epragati.payment.report.vo.ShowCauseSectionVO;
import org.epragati.payment.report.vo.VCRNonPaymentDetailsVO;
import org.epragati.util.StatusRegistration;
import org.epragati.util.custom.validation.ValidatorConstants;
import org.epragati.util.payment.ModuleEnum;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ApplicationSearchVO {

	@Size(max=25,message=ValidatorConstants.INVALID_TRNO)
	private String trNo;
	private String mobileNo;
	private ModuleEnum module;
	private String applicationNo;
	@Size(max=50,message=ValidatorConstants.INVALID_CHASSIS_NO)
	private String chassisNo;
	private String engineNo;
	@Size(max=25,message=ValidatorConstants.INVALID_PRNO)
	private String prNo;
	private String permitNo;
	private String tokenNo;
	private MandalVO mandal;
	private Boolean isRta = Boolean.FALSE;

	private StatusRegistration otherStateNocStatus;

	private String selectedRole;
	private String vcrNo;
	private boolean requestFromAO;

	// Used only to get the CFMS manula verificationDetails
	private List<String> transactionNumber;

	private List<String> prNos;

	private List<String> scNos;

	private List<RCCancellationVO> rcCancellationVOs;

	private ShowCauseSectionVO showCauseSectionVo;

	private ShowCauseDetailsVO showCauseDetailsVO;

	private String scNo;

	private String captchaId;
	
	private String gstnNo;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime from;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime to;
	private Boolean applicationType= Boolean.FALSE;
	
	List<VCRNonPaymentDetailsVO> vCRNonPaymentDetailsVOs;
	
	private String userId;
	
	private List<String> financeAssistanceNos;
	
	private String aadharNo;
	
	 private Boolean applicationSearchAtMVI = Boolean.FALSE;

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getCaptchaId() {
		return captchaId;
	}

	public void setCaptchaId(String captchaId) {
		this.captchaId = captchaId;
	}

	public String getCaptchaValue() {
		return captchaValue;
	}

	public void setCaptchaValue(String captchaValue) {
		this.captchaValue = captchaValue;
	}

	private String captchaValue;

	public ShowCauseSectionVO getShowCauseSectionVo() {
		return showCauseSectionVo;
	}

	public void setShowCauseSectionVo(ShowCauseSectionVO showCauseSectionVo) {
		this.showCauseSectionVo = showCauseSectionVo;
	}

	public List<RCCancellationVO> getRcCancellationVOs() {
		return rcCancellationVOs;
	}

	public void setRcCancellationVOs(List<RCCancellationVO> rcCancellationVOs) {
		this.rcCancellationVOs = rcCancellationVOs;
	}

	public StatusRegistration getOtherStateNocStatus() {
		return otherStateNocStatus;
	}

	public void setOtherStateNocStatus(StatusRegistration otherStateNocStatus) {
		this.otherStateNocStatus = otherStateNocStatus;
	}

	private String reasonToCancel;

	public String getReasonToCancel() {
		return reasonToCancel;
	}

	public void setReasonToCancel(String reasonToCancel) {
		this.reasonToCancel = reasonToCancel;
	}

	/**
	 * @return the tokenNo
	 */
	public String getTokenNo() {
		return tokenNo;
	}

	/**
	 * @param tokenNo the tokenNo to set
	 */
	public void setTokenNo(String tokenNo) {
		this.tokenNo = tokenNo;
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
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * @return the module
	 */
	public ModuleEnum getModule() {
		return module;
	}

	/**
	 * @param module the module to set
	 */
	public void setModule(ModuleEnum module) {
		this.module = module;
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

	/**
	 * @return the engineNo
	 */
	public String getEngineNo() {
		return engineNo;
	}

	/**
	 * @param engineNo the engineNo to set
	 */
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	/**
	 * @return the permitNo
	 */
	public String getPermitNo() {
		return permitNo;
	}

	/**
	 * @param permitNo the permitNo to set
	 */
	public void setPermitNo(String permitNo) {
		this.permitNo = permitNo;
	}

	/**
	 * @return the isRta
	 */
	public Boolean getIsRta() {
		return isRta;
	}

	/**
	 * @param isRta the isRta to set
	 */
	public void setIsRta(Boolean isRta) {
		this.isRta = isRta;
	}

	@Override
	public String toString() {
		return "ApplicationSearchVO [" + (trNo != null ? "trNo=" + trNo + ", " : "")
				+ (mobileNo != null ? "mobileNo=" + mobileNo + ", " : "")
				+ (module != null ? "module=" + module + ", " : "")
				+ (applicationNo != null ? "applicationNo=" + applicationNo + ", " : "")
				+ (chassisNo != null ? "chassisNo=" + chassisNo + ", " : "")
				+ (engineNo != null ? "engineNo=" + engineNo + ", " : "") + (prNo != null ? "prNo=" + prNo : "")
				+ (permitNo != null ? "permitNo=" + permitNo : "") + (isRta != null ? "isRta=" + isRta : "") + "]";
	}

	/**
	 * @return the mandal
	 */
	public MandalVO getMandal() {
		return mandal;
	}

	/**
	 * @param mandal the mandal to set
	 */
	public void setMandal(MandalVO mandal) {
		this.mandal = mandal;
	}

	public String getSelectedRole() {
		return selectedRole;
	}

	public void setSelectedRole(String selectedRole) {
		this.selectedRole = selectedRole;
	}

	public String getVcrNo() {
		return vcrNo;
	}

	public void setVcrNo(String vcrNo) {
		this.vcrNo = vcrNo;
	}

	public boolean isRequestFromAO() {
		return requestFromAO;
	}

	public void setRequestFromAO(boolean requestFromAO) {
		this.requestFromAO = requestFromAO;
	}

	/**
	 * @return the transactionNumber
	 */
	public List<String> getTransactionNumber() {
		return transactionNumber;
	}

	/**
	 * @param transactionNumber the transactionNumber to set
	 */
	public void setTransactionNumber(List<String> transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public List<String> getPrNos() {
		return prNos;
	}

	public void setPrNos(List<String> prNos) {
		this.prNos = prNos;
	}

	public ShowCauseDetailsVO getShowCauseDetailsVO() {
		return showCauseDetailsVO;
	}

	public void setShowCauseDetailsVO(ShowCauseDetailsVO showCauseDetailsVO) {
		this.showCauseDetailsVO = showCauseDetailsVO;
	}

	public List<String> getScNos() {
		return scNos;
	}

	public void setScNos(List<String> scNos) {
		this.scNos = scNos;
	}

	public String getScNo() {
		return scNo;
	}

	public void setScNo(String scNo) {
		this.scNo = scNo;
	}

	/**
	 * @return the gstnNo
	 */
	public String getGstnNo() {
		return gstnNo;
	}

	/**
	 * @param gstnNo the gstnNo to set
	 */
	public void setGstnNo(String gstnNo) {
		this.gstnNo = gstnNo;
	}

	public LocalDateTime getFrom() {
		return from;
	}

	public void setFrom(LocalDateTime from) {
		this.from = from;
	}

	public LocalDateTime getTo() {
		return to;
	}

	public void setTo(LocalDateTime to) {
		this.to = to;
	}
	
	/**
	 * @return the applicationType
	 */
	public Boolean getApplicationType() {
		return applicationType;
	}

	/**
	 * @param applicationType the applicationType to set
	 */
	public void setApplicationType(Boolean applicationType) {
		this.applicationType = applicationType;
	}

	public List<VCRNonPaymentDetailsVO> getvCRNonPaymentDetailsVOs() {
		return vCRNonPaymentDetailsVOs;
	}

	public void setvCRNonPaymentDetailsVOs(List<VCRNonPaymentDetailsVO> vCRNonPaymentDetailsVOs) {
		this.vCRNonPaymentDetailsVOs = vCRNonPaymentDetailsVOs;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<String> getFinanceAssistanceNos() {
		return financeAssistanceNos;
	}

	public void setFinanceAssistanceNos(List<String> financeAssistanceNos) {
		this.financeAssistanceNos = financeAssistanceNos;
	}

	public Boolean getApplicationSearchAtMVI() {
		return applicationSearchAtMVI;
	}

	public void setApplicationSearchAtMVI(Boolean applicationSearchAtMVI) {
		this.applicationSearchAtMVI = applicationSearchAtMVI;
	}
	
	
	
}
