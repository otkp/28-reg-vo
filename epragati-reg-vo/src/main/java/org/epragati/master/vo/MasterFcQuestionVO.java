package org.epragati.master.vo;


public class MasterFcQuestionVO {

	private String question;
	private String serialNo;
	private boolean iscfrr;
	private boolean selectedOption=Boolean.FALSE;
	
	public boolean isSelectedOption() {
		return selectedOption;
	}
	public void setSelectedOption(boolean selectedOption) {
		this.selectedOption = selectedOption;
	}
	public boolean isIscfrr() {
		return iscfrr;
	}
	public void setIscfrr(boolean iscfrr) {
		this.iscfrr = iscfrr;
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
}
