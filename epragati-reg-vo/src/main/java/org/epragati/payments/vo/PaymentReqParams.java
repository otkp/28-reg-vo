package org.epragati.payments.vo;

import java.util.List;

import org.epragati.util.document.KeyValue;

public class PaymentReqParams {

	private String pgUrl;
	private List<KeyValue<String, String>> keyValues;
	private String appFormNo;
	private Boolean examNotRequired;
	private List<KeyValue<String, List<String>>> cfmsKeyValues;

	/**
	 * @return the pgUrl
	 */
	public String getPgUrl() {
		return pgUrl;
	}

	/**
	 * @param pgUrl
	 *            the pgUrl to set
	 */
	public void setPgUrl(String pgUrl) {
		this.pgUrl = pgUrl;
	}

	/**
	 * @return the keyValues
	 */
	public List<KeyValue<String, String>> getKeyValues() {
		return keyValues;
	}

	/**
	 * @param keyValues
	 *            the keyValues to set
	 */
	public void setKeyValues(List<KeyValue<String, String>> keyValues) {
		this.keyValues = keyValues;
	}

	/**
	 * @return the appFormNo
	 */
	public String getAppFormNo() {
		return appFormNo;
	}

	/**
	 * @param appFormNo
	 *            the appFormNo to set
	 */
	public void setAppFormNo(String appFormNo) {
		this.appFormNo = appFormNo;
	}

	/**
	 * @return the examNotRequired
	 */
	public Boolean getExamNotRequired() {
		return examNotRequired;
	}

	/**
	 * @param examNotRequired
	 *            the examNotRequired to set
	 */
	public void setExamNotRequired(Boolean examNotRequired) {
		this.examNotRequired = examNotRequired;
	}

	/**
	 * @return the cfmsKeyValues
	 */
	public List<KeyValue<String, List<String>>> getCfmsKeyValues() {
		return cfmsKeyValues;
	}

	/**
	 * @param cfmsKeyValues the cfmsKeyValues to set
	 */
	public void setCfmsKeyValues(List<KeyValue<String, List<String>>> cfmsKeyValues) {
		this.cfmsKeyValues = cfmsKeyValues;
	}
	
	
}
