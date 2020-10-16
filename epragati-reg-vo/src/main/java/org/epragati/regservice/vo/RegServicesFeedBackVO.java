package org.epragati.regservice.vo;

import java.util.List;

import org.epragati.master.vo.MasterFeedBackQuestionsVO;
import org.epragati.util.payment.ServiceEnum;

public class RegServicesFeedBackVO {

	private String id;
	private String applicationNo;
	private List<MasterFeedBackQuestionsVO> questions;
	private List<ServiceEnum> services;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public List<MasterFeedBackQuestionsVO> getQuestions() {
		return questions;
	}
	public void setQuestions(List<MasterFeedBackQuestionsVO> questions) {
		this.questions = questions;
	}
	public List<ServiceEnum> getServices() {
		return services;
	}
	public void setServices(List<ServiceEnum> services) {
		this.services = services;
	}
	
	
	
}
