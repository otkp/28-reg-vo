package org.epragati.rta.vo;



import org.epragati.util.payment.ModuleEnum;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PrGenerationVO {

	private boolean isNumberlocked;
	private Integer selectedNo;
    private String prSeries;
    private String applicationNo;
    private ModuleEnum citizen;
    private String prNo;
    private String officeCode = "AP39";
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public boolean isNumberlocked() {
		return isNumberlocked;
	}
	public void setNumberlocked(boolean isNumberlocked) {
		this.isNumberlocked = isNumberlocked;
	}
	public Integer getSelectedNo() {
		return selectedNo;
	}
	public void setSelectedNo(Integer selectedNo) {
		this.selectedNo = selectedNo;
	}
	public String getPrSeries() {
		return prSeries;
	}
	public void setPrSeries(String prSeries) {
		this.prSeries = prSeries;
	}
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	/**
	 * @return the citizen
	 */
	public ModuleEnum getCitizen() {
		return citizen;
	}
	/**
	 * @param citizen the citizen to set
	 */
	public void setCitizen(ModuleEnum citizen) {
		this.citizen = citizen;
	}
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
    
	
}
