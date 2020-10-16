package org.epragati.payment.report.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class OsDataEntryFinalVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer throughMviCollAmount;
	private Integer throughOnlinePay;
	private Integer noTaxRecordCount;
	private Integer totalRecords;
	private String applicationStatus;
	private Map<String,List<OsDataEntryReport>> throughMviCollRecords;
	private Map<String,List<OsDataEntryReport>> throughOnlinePayRecords;
	private Map<String,List<OsDataEntryReport>> NoTaxRecords;
	public Integer getThroughMviCollAmount() {
		return throughMviCollAmount;
	}
	public void setThroughMviCollAmount(Integer throughMviCollAmount) {
		this.throughMviCollAmount = throughMviCollAmount;
	}
	public Integer getThroughOnlinePay() {
		return throughOnlinePay;
	}
	public void setThroughOnlinePay(Integer throughOnlinePay) {
		this.throughOnlinePay = throughOnlinePay;
	}
	public Integer getNoTaxRecordCount() {
		return noTaxRecordCount;
	}
	public void setNoTaxRecordCount(Integer noTaxRecordCount) {
		this.noTaxRecordCount = noTaxRecordCount;
	}
	public Map<String, List<OsDataEntryReport>> getThroughMviCollRecords() {
		return throughMviCollRecords;
	}
	public void setThroughMviCollRecords(Map<String, List<OsDataEntryReport>> throughMviCollRecords) {
		this.throughMviCollRecords = throughMviCollRecords;
	}
	public Map<String, List<OsDataEntryReport>> getThroughOnlinePayRecords() {
		return throughOnlinePayRecords;
	}
	public void setThroughOnlinePayRecords(Map<String, List<OsDataEntryReport>> throughOnlinePayRecords) {
		this.throughOnlinePayRecords = throughOnlinePayRecords;
	}
	public Map<String, List<OsDataEntryReport>> getNoTaxRecords() {
		return NoTaxRecords;
	}
	public void setNoTaxRecords(Map<String, List<OsDataEntryReport>> noTaxRecords) {
		NoTaxRecords = noTaxRecords;
	}
	
	public Integer getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}
	
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	@Override
	public String toString() {
		return "OsDataEntryFinalVO [throughMviCollAmount=" + throughMviCollAmount + ", throughOnlinePay="
				+ throughOnlinePay + ", noTaxRecordCount=" + noTaxRecordCount + ", totalRecords=" + totalRecords
				+ ", applicationStatus=" + applicationStatus + ", throughMviCollRecords=" + throughMviCollRecords
				+ ", throughOnlinePayRecords=" + throughOnlinePayRecords + ", NoTaxRecords=" + NoTaxRecords + "]";
	}
	
	
	
	
}

