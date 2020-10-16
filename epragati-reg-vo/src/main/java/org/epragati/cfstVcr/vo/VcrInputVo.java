package org.epragati.cfstVcr.vo;

import javax.validation.constraints.Size;

import org.epragati.util.custom.validation.Conditional;
import org.epragati.util.custom.validation.ValidatorConstants;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class VcrInputVo {

	private String documentType;
	
	private String dlNo;
	
	private String regNo;
	
	private String chassisNo;
	private String vcrNum;
	private String applicatonType;
	
	@Conditional(selected = "trNo",message=ValidatorConstants.INVALID_TRNO,values = {})
	@Size(max = ValidatorConstants.TR_NO_SIZE,message = ValidatorConstants.INVALID_TRNO)
	private String trNo;
	
	private String applicationNo;
	
	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDlNo() {
		return dlNo;
	}

	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
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

	public String getVcrNum() {
		return vcrNum;
	}

	public void setVcrNum(String vcrNum) {
		this.vcrNum = vcrNum;
	}

	/**
	 * @return the applicatonType
	 */
	public String getApplicatonType() {
		return applicatonType;
	}

	/**
	 * @param applicatonType the applicatonType to set
	 */
	public void setApplicatonType(String applicatonType) {
		this.applicatonType = applicatonType;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	
	
}
