package org.epragati.master.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class InsuranceVO {
private String insurenceNumber;
private String engineNumber;
private String chassisNumber;
private String	applicantName;
private String  prNo;
private String  trNo;
private String  typeOfInsurence;
private String  insurenceCompany;
@JsonFormat(pattern = "yyyy-MM-dd")
private String  cancelledDate;
private String  cancelledReason;
private boolean bonded=Boolean.FALSE;
/**
 * @return the insurenceNumber
 */
public String getInsurenceNumber() {
	return insurenceNumber;
}
/**
 * @param insurenceNumber the insurenceNumber to set
 */
public void setInsurenceNumber(String insurenceNumber) {
	this.insurenceNumber = insurenceNumber;
}
/**
 * @return the engineNumber
 */
public String getEngineNumber() {
	return engineNumber;
}
/**
 * @param engineNumber the engineNumber to set
 */
public void setEngineNumber(String engineNumber) {
	this.engineNumber = engineNumber;
}
/**
 * @return the chassisNumber
 */
public String getChassisNumber() {
	return chassisNumber;
}
/**
 * @param chassisNumber the chassisNumber to set
 */
public void setChassisNumber(String chassisNumber) {
	this.chassisNumber = chassisNumber;
}
/**
 * @return the applicantName
 */
public String getApplicantName() {
	return applicantName;
}
/**
 * @param applicantName the applicantName to set
 */
public void setApplicantName(String applicantName) {
	this.applicantName = applicantName;
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
 * @return the typeOfInsurence
 */
public String getTypeOfInsurence() {
	return typeOfInsurence;
}
/**
 * @param typeOfInsurence the typeOfInsurence to set
 */
public void setTypeOfInsurence(String typeOfInsurence) {
	this.typeOfInsurence = typeOfInsurence;
}
/**
 * @return the insurenceCompany
 */
public String getInsurenceCompany() {
	return insurenceCompany;
}
/**
 * @param insurenceCompany the insurenceCompany to set
 */
public void setInsurenceCompany(String insurenceCompany) {
	this.insurenceCompany = insurenceCompany;
}
/**
 * @return the cancelledDate
 */
public String getCancelledDate() {
	return cancelledDate;
}
/**
 * @param cancelledDate the cancelledDate to set
 */
public void setCancelledDate(String cancelledDate) {
	this.cancelledDate = cancelledDate;
}
/**
 * @return the cancelledReason
 */
public String getCancelledReason() {
	return cancelledReason;
}
/**
 * @param cancelledReason the cancelledReason to set
 */
public void setCancelledReason(String cancelledReason) {
	this.cancelledReason = cancelledReason;
}
/**
 * @return the bonded
 */
public boolean isBonded() {
	return bonded;
}
/**
 * @param bonded the bonded to set
 */
public void setBonded(boolean bonded) {
	this.bonded = bonded;
}


}
