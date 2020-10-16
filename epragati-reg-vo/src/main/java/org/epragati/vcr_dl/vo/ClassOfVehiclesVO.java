package org.epragati.vcr_dl.vo;

import java.io.Serializable;

public class ClassOfVehiclesVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String description;
	private String cardPrintDesc;
	private String code;
	private String category;
	private String idp;
	private Integer nicCode;
	private String status;
	private String online;
	private boolean ph;
	private Integer minAge;
	private String covIssuedDate;
    private String testedBy;
	private String testDesig; 
	private boolean isDlExpired;
	private boolean isCovExpiredOrRenwel;
	private Boolean covPassOrFail;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCardPrintDesc() {
		return cardPrintDesc;
	}
	public void setCardPrintDesc(String cardPrintDesc) {
		this.cardPrintDesc = cardPrintDesc;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getIdp() {
		return idp;
	}
	public void setIdp(String idp) {
		this.idp = idp;
	}
	public Integer getNicCode() {
		return nicCode;
	}
	public void setNicCode(Integer nicCode) {
		this.nicCode = nicCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOnline() {
		return online;
	}
	public void setOnline(String online) {
		this.online = online;
	}
	public boolean isPh() {
		return ph;
	}
	public void setPh(boolean ph) {
		this.ph = ph;
	}
	public Integer getMinAge() {
		return minAge;
	}
	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
	}
	public String getCovIssuedDate() {
		return covIssuedDate;
	}
	public void setCovIssuedDate(String covIssuedDate) {
		this.covIssuedDate = covIssuedDate;
	}
	public String getTestedBy() {
		return testedBy;
	}
	public void setTestedBy(String testedBy) {
		this.testedBy = testedBy;
	}
	public String getTestDesig() {
		return testDesig;
	}
	public void setTestDesig(String testDesig) {
		this.testDesig = testDesig;
	}
	public boolean isDlExpired() {
		return isDlExpired;
	}
	public void setDlExpired(boolean isDlExpired) {
		this.isDlExpired = isDlExpired;
	}
	public boolean isCovExpiredOrRenwel() {
		return isCovExpiredOrRenwel;
	}
	public void setCovExpiredOrRenwel(boolean isCovExpiredOrRenwel) {
		this.isCovExpiredOrRenwel = isCovExpiredOrRenwel;
	}
	public Boolean getCovPassOrFail() {
		return covPassOrFail;
	}
	public void setCovPassOrFail(Boolean covPassOrFail) {
		this.covPassOrFail = covPassOrFail;
	}
	
	
}
