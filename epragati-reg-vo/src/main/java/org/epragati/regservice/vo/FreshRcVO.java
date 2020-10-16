package org.epragati.regservice.vo;

import java.time.LocalDate;
import java.util.List;

import org.epragati.master.vo.ApplicantAddressVO;
import org.epragati.master.vo.ContactVO;
import org.epragati.master.vo.MasterFreshrcMviQuestionsVO;
import org.epragati.master.vo.UserVO;

public class FreshRcVO {


	private Integer noOfEMIs;
	private Double pendingAmount;
	private LocalDate pendingFrom;
	private LocalDate pendingTo;
	private String financerUserId;
	private String yardName;
	private String  yardLocation;
	private ApplicantAddressVO yardAddress;
	private String financerComments;
	private ContactVO financerContactDetails;
	private String mviUserId;
	private UserVO financerDetails;
	private boolean isAOReject;
	private boolean reuploadImages;
	private String mviName;
	private boolean isAoApproved;
	private boolean isAOAssignedToMVI;
	private List<CommentsVO> comments;
	private List<MasterFreshrcMviQuestionsVO> frcQuestionsVO;
	
	
	
	
	public List<MasterFreshrcMviQuestionsVO> getFrcQuestionsVO() {
		return frcQuestionsVO;
	}
	public void setFrcQuestionsVO(List<MasterFreshrcMviQuestionsVO> frcQuestionsVO) {
		this.frcQuestionsVO = frcQuestionsVO;
	}
	public ContactVO getFinancerContactDetails() {
		return financerContactDetails;
	}
	public void setFinancerContactDetails(ContactVO financerContactDetails) {
		this.financerContactDetails = financerContactDetails;
	}
	public UserVO getFinancerDetails() {
		return financerDetails;
	}
	public void setFinancerDetails(UserVO financerDetails) {
		this.financerDetails = financerDetails;
	}
	public String getMviUserId() {
		return mviUserId;
	}
	public void setMviUserId(String mviUserId) {
		this.mviUserId = mviUserId;
	}
	public String getFinancerUserId() {
		return financerUserId;
	}
	public void setFinancerUserId(String financerUserId) {
		this.financerUserId = financerUserId;
	}
	public String getYardName() {
		return yardName;
	}
	public void setYardName(String yardName) {
		this.yardName = yardName;
	}
	public String getYardLocation() {
		return yardLocation;
	}
	public void setYardLocation(String yardLocation) {
		this.yardLocation = yardLocation;
	}
	public String getFinancerComments() {
		return financerComments;
	}
	public void setFinancerComments(String financerComments) {
		this.financerComments = financerComments;
	}
	public Integer getNoOfEMIs() {
		return noOfEMIs;
	}
	public void setNoOfEMIs(Integer noOfEMIs) {
		this.noOfEMIs = noOfEMIs;
	}
	
	public Double getPendingAmount() {
		return pendingAmount;
	}
	public void setPendingAmount(Double pendingAmount) {
		this.pendingAmount = pendingAmount;
	}
	public LocalDate getPendingFrom() {
		return pendingFrom;
	}
	public void setPendingFrom(LocalDate pendingFrom) {
		this.pendingFrom = pendingFrom;
	}
	public LocalDate getPendingTo() {
		return pendingTo;
	}
	public void setPendingTo(LocalDate pendingTo) {
		this.pendingTo = pendingTo;
	}
	public ApplicantAddressVO getYardAddress() {
		return yardAddress;
	}
	public void setYardAddress(ApplicantAddressVO yardAddress) {
		this.yardAddress = yardAddress;
	}
	public boolean isAOReject() {
		return isAOReject;
	}
	public void setAOReject(boolean isAOReject) {
		this.isAOReject = isAOReject;
	}
	public boolean isReuploadImages() {
		return reuploadImages;
	}
	public void setReuploadImages(boolean reuploadImages) {
		this.reuploadImages = reuploadImages;
	}
	public String getMviName() {
		return mviName;
	}
	public void setMviName(String mviName) {
		this.mviName = mviName;
	}
	public boolean isAoApproved() {
		return isAoApproved;
	}
	public void setAoApproved(boolean isAoApproved) {
		this.isAoApproved = isAoApproved;
	}
	public List<CommentsVO> getComments() {
		return comments;
	}
	public void setComments(List<CommentsVO> comments) {
		this.comments = comments;
	}
	public boolean isAOAssignedToMVI() {
		return isAOAssignedToMVI;
	}
	public void setAOAssignedToMVI(boolean isAOAssignedToMVI) {
		this.isAOAssignedToMVI = isAOAssignedToMVI;
	}
	
}
	
