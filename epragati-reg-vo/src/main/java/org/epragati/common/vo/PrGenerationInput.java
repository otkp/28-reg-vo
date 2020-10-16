package org.epragati.common.vo;

import org.epragati.util.payment.ModuleEnum;

public class PrGenerationInput {

		
	private String applicationNo;
	private String trNumber;
	private Integer selectedNo;
	private boolean generatePr;
	private String numberType;
	private boolean blockNo;
	private String prSeries;
	private ModuleEnum module;
	private boolean isFromReassigment;
	private boolean isDoByOldPrNo;
	private String mobileNo;
	private String prNo;
	
	
	/**
	 * @return the prSeries
	 */
	public String getPrSeries() {
		return prSeries;
	}
	/**
	 * @param prSeries the prSeries to set
	 */
	public void setPrSeries(String prSeries) {
		this.prSeries = prSeries;
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
	 * @return the trNumber
	 */
	public String getTrNumber() {
		return trNumber;
	}
	/**
	 * @param trNumber the trNumber to set
	 */
	public void setTrNumber(String trNumber) {
		this.trNumber = trNumber;
	}
	/**
	 * @return the selectedNo
	 */
	public Integer getSelectedNo() {
		return selectedNo;
	}
	/**
	 * @param selectedNo the selectedNo to set
	 */
	public void setSelectedNo(Integer selectedNo) {
		this.selectedNo = selectedNo;
	}
	/**
	 * @return the generatePr
	 */
	public boolean isGeneratePr() {
		return generatePr;
	}
	/**
	 * @param generatePr the generatePr to set
	 */
	public void setGeneratePr(boolean generatePr) {
		this.generatePr = generatePr;
	}
	/**
	 * @return the numberType
	 */
	public String getNumberType() {
		return numberType;
	}
	/**
	 * @param numberType the numberType to set
	 */
	public void setNumberType(String numberType) {
		this.numberType = numberType;
	}
	/**
	 * @return the blockNo
	 */
	public boolean isBlockNo() {
		return blockNo;
	}
	/**
	 * @param blockNo the blockNo to set
	 */
	public void setBlockNo(boolean blockNo) {
		this.blockNo = blockNo;
	}
	/**
	 * @return the isFromReassigment
	 */
	public boolean getIsFromReassigment() {
		return isFromReassigment;
	}
	/**
	 * @param isFromReassigment the isFromReassigment to set
	 */
	public void setIsFromReassigment(boolean isFromReassigment) {
		this.isFromReassigment = isFromReassigment;
	}
	/**
	 * @return the isDoByOldPrNo
	 */
	public boolean getIsDoByOldPrNo() {
		return isDoByOldPrNo;
	}
	/**
	 * @param isDoByOldPrNo the isDoByOldPrNo to set
	 */
	public void setIsDoByOldPrNo(boolean isDoByOldPrNo) {
		this.isDoByOldPrNo = isDoByOldPrNo;
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
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	
	
}
