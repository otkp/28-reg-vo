package org.epragati.aadhaar;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.epragati.master.vo.RepresentativeDetailsVO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlRootElement
@JsonInclude(Include.NON_NULL)
public class AadhaarDetailsRequestVO implements Serializable {

	private static final long serialVersionUID = -5224260315487785622L;
	@NotNull(message = "uid_num is missing")
	private String uid_num;
	@NotNull(message = "encryptedPid is missing")
	private String encryptedPid;
	@NotNull(message = "encSessionKey is missing")
	private String encSessionKey;
	@NotNull(message = "encSessionKey is missing")
	private String encHmac;
	@NotNull(message = "DpId is missing")
	private String dpId;
	@NotNull(message = "Client request time is missing")
	private String crt;
	@NotNull(message = "TID is missing")
	private String tid;
	@NotNull(message = "UDC(Mac ID) is missing")
	private String udc;

	private String deviceNumber;
	@NotNull(message = "RdsVer is missing")
	private String rdsVer;
	// @NotNull(message="Consent ME is missing")
	private String consentme;
	@NotNull(message = "RdsId is missing")
	private String rdsId;
	private String attemptType;
	private String pincode;
	@NotNull(message = "DC is missing")
	private String dc;
	@NotNull(message = "MI is missing")
	private String mi;
	@NotNull(message = "MC is missing")
	private String mc;

	@NotNull(message = "CI is missing")
	private String ci;


	private String allowPDF = "N";

	private String localLang = "N";

	private String consentDesc;


	private String service;

	private String idType;
	private String bt;
	private String requestType;


	private String vercode;

	private String oldTid;

	private String otpChannel;

	private String authType;
	
	@JsonIgnore
	private String source;
	
	private String ip;
	
	private Boolean isRepresentativeService = Boolean.FALSE;

	private RepresentativeDetailsVO representativeVo;
	
private Boolean isDeptLogin = Boolean.FALSE;
	
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Boolean getIsDeptLogin() {
		return isDeptLogin;
	}

	public void setIsDeptLogin(Boolean isDeptLogin) {
		this.isDeptLogin = isDeptLogin;
	}

	public String getUid_num() {
		return this.uid_num;
	}

	public void setUid_num(String uid_num) {
		this.uid_num = uid_num;
	}

	public String getEncryptedPid() {
		return this.encryptedPid;
	}

	public void setEncryptedPid(String encryptedPid) {
		this.encryptedPid = encryptedPid;
	}

	public String getEncSessionKey() {
		return this.encSessionKey;
	}

	public void setEncSessionKey(String encSessionKey) {
		this.encSessionKey = encSessionKey;
	}

	public String getEncHmac() {
		return this.encHmac;
	}

	public void setEncHmac(String encHmac) {
		this.encHmac = encHmac;
	}

	public String getDpId() {
		return this.dpId;
	}

	public void setDpId(String dpId) {
		this.dpId = dpId;
	}

	public String getCrt() {
		return this.crt;
	}

	public void setCrt(String crt) {
		this.crt = crt;
	}

	public String getTid() {
		return this.tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getUdc() {
		return this.udc;
	}

	public void setUdc(String udc) {
		this.udc = udc;
	}

	public String getRdsVer() {
		return this.rdsVer;
	}

	public void setRdsVer(String rdsVer) {
		this.rdsVer = rdsVer;
	}

	public String getConsentme() {
		return this.consentme;
	}

	public void setConsentme(String consentme) {
		this.consentme = consentme;
	}

	public String getRdsId() {
		return this.rdsId;
	}

	public void setRdsId(String rdsId) {
		this.rdsId = rdsId;
	}

	public String getAttemptType() {
		return this.attemptType;
	}

	public void setAttemptType(String attemptType) {
		this.attemptType = attemptType;
	}

	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getDc() {
		return this.dc;
	}

	public void setDc(String dc) {
		this.dc = dc;
	}

	public String getMi() {
		return this.mi;
	}

	public void setMi(String mi) {
		this.mi = mi;
	}

	public String getMc() {
		return this.mc;
	}

	public void setMc(String mc) {
		this.mc = mc;
	}

	/**
	 * @return the deviceNumber
	 */
	public String getDeviceNumber() {
		return deviceNumber;
	}

	/**
	 * @param deviceNumber the deviceNumber to set
	 */
	public void setDeviceNumber(String deviceNumber) {
		this.deviceNumber = deviceNumber;
	}

	/**
	 * @return the ci
	 */
	public String getCi() {
		return ci;
	}

	/**
	 * @param ci the ci to set
	 */
	public void setCi(String ci) {
		this.ci = ci;
	}

	/**
	 * @return the idType
	 */
	public String getIdType() {
		return idType;
	}

	/**
	 * @param idType the idType to set
	 */
	public void setIdType(String idType) {
		this.idType = idType;
	}

	/**
	 * @return the requestType
	 */
	public String getRequestType() {
		return requestType;
	}

	/**
	 * @param requestType the requestType to set
	 */
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	/**
	 * @return the vercode
	 */
	public String getVercode() {
		return vercode;
	}

	/**
	 * @param vercode the vercode to set
	 */
	public void setVercode(String vercode) {
		this.vercode = vercode;
	}

	/**
	 * @return the oldTid
	 */
	public String getOldTid() {
		return oldTid;
	}

	/**
	 * @param oldTid the oldTid to set
	 */
	public void setOldTid(String oldTid) {
		this.oldTid = oldTid;
	}

	/**
	 * @return the authType
	 */
	public String getAuthType() {
		return authType;
	}

	/**
	 * @param authType the authType to set
	 */
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public Boolean getIsRepresentativeService() {
		return isRepresentativeService;
	}

	public void setIsRepresentativeService(Boolean isRepresentativeService) {
		this.isRepresentativeService = isRepresentativeService;
	}

	public RepresentativeDetailsVO getRepresentativeVo() {
		return representativeVo;
	}

	public void setRepresentativeVo(RepresentativeDetailsVO representativeVo) {
		this.representativeVo = representativeVo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return the bt
	 */
	public String getBt() {
		return bt;
	}

	/**
	 * @param bt the bt to set
	 */
	public void setBt(String bt) {
		this.bt = bt;
	}

	/**
	 * @return the allowPDF
	 */
	public String getAllowPDF() {
		return allowPDF;
	}

	/**
	 * @param allowPDF the allowPDF to set
	 */
	public void setAllowPDF(String allowPDF) {
		this.allowPDF = allowPDF;
	}

	/**
	 * @return the localLang
	 */
	public String getLocalLang() {
		return localLang;
	}

	/**
	 * @param localLang the localLang to set
	 */
	public void setLocalLang(String localLang) {
		this.localLang = localLang;
	}

	/**
	 * @return the consentDesc
	 */
	public String getConsentDesc() {
		return consentDesc;
	}

	/**
	 * @param consentDesc the consentDesc to set
	 */
	public void setConsentDesc(String consentDesc) {
		this.consentDesc = consentDesc;
	}

	/**
	 * @return the service
	 */
	public String getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(String service) {
		this.service = service;
	}

	/**
	 * @return the otpChannel
	 */
	public String getOtpChannel() {
		return otpChannel;
	}

	/**
	 * @param otpChannel the otpChannel to set
	 */
	public void setOtpChannel(String otpChannel) {
		this.otpChannel = otpChannel;
	}
	
	

}
