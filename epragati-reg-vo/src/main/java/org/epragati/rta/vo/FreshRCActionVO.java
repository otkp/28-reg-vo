package org.epragati.rta.vo;

import java.util.List;

import org.epragati.master.vo.MasterFreshrcMviQuestionsVO;
import org.epragati.regservice.vo.CommentsVO;

public class FreshRCActionVO {

	private String mviUserId;
    private List<CommentsVO> comments;
	private String mviName;
	private List<MasterFreshrcMviQuestionsVO> frcQuestions;
	private Boolean valideFinancier=Boolean.FALSE;

	

	public Boolean getValideFinancier() {
		return valideFinancier;
	}

	public void setValideFinancier(Boolean valideFinancier) {
		this.valideFinancier = valideFinancier;
	}

	public List<MasterFreshrcMviQuestionsVO> getFrcQuestions() {
		return frcQuestions;
	}

	public void setFrcQuestions(List<MasterFreshrcMviQuestionsVO> frcQuestions) {
		this.frcQuestions = frcQuestions;
	}

	public String getMviUserId() {
		return mviUserId;
	}

	public void setMviUserId(String mviUserId) {
		this.mviUserId = mviUserId;
	}
	
	/**
	 * @return the mviName
	 */
	public String getMviName() {
		return mviName;
	}

	/**
	 * @param mviName the mviName to set
	 */
	public void setMviName(String mviName) {
		this.mviName = mviName;
	}
	
	public List<CommentsVO> getComments() {
		return comments;
	}

	public void setComments(List<CommentsVO> comments) {
		this.comments = comments;
	}

}
