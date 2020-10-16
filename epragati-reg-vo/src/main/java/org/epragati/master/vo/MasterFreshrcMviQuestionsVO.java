package org.epragati.master.vo;

public class MasterFreshrcMviQuestionsVO {
	
	private String question;
	private String serialNo;
	private boolean selectedOption = Boolean.FALSE;
	private String role;
	private String remarksForFinancier;
	
	public String getRemarksForFinancier() {
		return remarksForFinancier;
	}
	public void setRemarksForFinancier(String remarksForFinancier) {
		this.remarksForFinancier = remarksForFinancier;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public boolean isSelectedOption() {
		return selectedOption;
	}
	public void setSelectedOption(boolean selectedOption) {
		this.selectedOption = selectedOption;
	}

}
