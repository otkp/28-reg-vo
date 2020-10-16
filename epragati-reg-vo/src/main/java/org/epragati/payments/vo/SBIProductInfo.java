package org.epragati.payments.vo;

import java.util.List;

public class SBIProductInfo {
	
	private String Dept_code;
	private String Dept_Name;
	private String Check_Total;
	private String DDO_Code;
	private String Mode_of_Transaction;
	private String Name_of_the_Remitter;
	private String Redirect_URL;
	private List<TreasureHeadDetails> treasureHeads;
	/**
	 * @return the dept_code
	 */
	public String getDept_code() {
		return Dept_code;
	}
	/**
	 * @param dept_code the dept_code to set
	 */
	public void setDept_code(String dept_code) {
		Dept_code = dept_code;
	}
	/**
	 * @return the dept_Name
	 */
	public String getDept_Name() {
		return Dept_Name;
	}
	/**
	 * @param dept_Name the dept_Name to set
	 */
	public void setDept_Name(String dept_Name) {
		Dept_Name = dept_Name;
	}
	
	/**
	 * @return the check_Total
	 */
	public String getCheck_Total() {
		return Check_Total;
	}
	/**
	 * @param check_Total the check_Total to set
	 */
	public void setCheck_Total(String check_Total) {
		Check_Total = check_Total;
	}
	/**
	 * @return the dDO_Code
	 */
	public String getDDO_Code() {
		return DDO_Code;
	}
	/**
	 * @param dDO_Code the dDO_Code to set
	 */
	public void setDDO_Code(String dDO_Code) {
		DDO_Code = dDO_Code;
	}
	/**
	 * @return the mode_of_Transaction
	 */
	public String getMode_of_Transaction() {
		return Mode_of_Transaction;
	}
	/**
	 * @param mode_of_Transaction the mode_of_Transaction to set
	 */
	public void setMode_of_Transaction(String mode_of_Transaction) {
		Mode_of_Transaction = mode_of_Transaction;
	}
	/**
	 * @return the name_of_the_Remitter
	 */
	public String getName_of_the_Remitter() {
		return Name_of_the_Remitter;
	}
	/**
	 * @param name_of_the_Remitter the name_of_the_Remitter to set
	 */
	public void setName_of_the_Remitter(String name_of_the_Remitter) {
		Name_of_the_Remitter = name_of_the_Remitter;
	}
	/**
	 * @return the redirect_URL
	 */
	public String getRedirect_URL() {
		return Redirect_URL;
	}
	/**
	 * @param redirect_URL the redirect_URL to set
	 */
	public void setRedirect_URL(String redirect_URL) {
		Redirect_URL = redirect_URL;
	}
	/**
	 * @return the treasureHeads
	 */
	public List<TreasureHeadDetails> getTreasureHeads() {
		return treasureHeads;
	}
	/**
	 * @param treasureHeads the treasureHeads to set
	 */
	public void setTreasureHeads(List<TreasureHeadDetails> treasureHeads) {
		this.treasureHeads = treasureHeads;
	}
	
	

}
