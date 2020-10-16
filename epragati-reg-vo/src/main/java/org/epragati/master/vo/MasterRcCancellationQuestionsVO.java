package org.epragati.master.vo;

public class MasterRcCancellationQuestionsVO {
	
	private String question;
	private String serialNo;
	private boolean selectedOption = Boolean.FALSE;
	
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
