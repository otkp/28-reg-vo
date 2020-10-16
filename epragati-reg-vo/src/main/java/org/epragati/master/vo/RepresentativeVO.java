package org.epragati.master.vo;

import java.util.Collections;
import java.util.List;

import org.epragati.common.vo.BaseVO;
import org.epragati.util.RoleEnum;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 
 * @author bhargav.gottimukkula
 *
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
public class RepresentativeVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7822600259594164229L;
	
	private String uidToken;

	private RoleEnum userType;

	private String applicantId;

	private String parentId;

	private String parentApplicantId;

	private List<String> childuidTokens;

	private List<String> applicationIds;
	
	private List<RepresentativeDetailsVO>  representativeDetails;
	
	private String userToken;
	
	List<ApplicantDetailsVO> childApplicantDetails = Collections.EMPTY_LIST;

	public List<ApplicantDetailsVO> getChildApplicantDetails() {
		return childApplicantDetails;
	}

	public void setChildApplicantDetails(List<ApplicantDetailsVO> childApplicantDetails) {
		this.childApplicantDetails = childApplicantDetails;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

	public String getUidToken() {
		return uidToken;
	}

	public void setUidToken(String uidToken) {
		this.uidToken = uidToken;
	}

	public RoleEnum getUserType() {
		return userType;
	}

	public void setUserType(RoleEnum userType) {
		this.userType = userType;
	}

	public String getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getParentApplicantId() {
		return parentApplicantId;
	}

	public void setParentApplicantId(String parentApplicantId) {
		this.parentApplicantId = parentApplicantId;
	}

	public List<String> getChilduidTokens() {
		return childuidTokens;
	}

	public void setChilduidTokens(List<String> childuidTokens) {
		this.childuidTokens = childuidTokens;
	}

	public List<String> getApplicationIds() {
		return applicationIds;
	}

	public void setApplicationIds(List<String> applicationIds) {
		this.applicationIds = applicationIds;
	}

	public List<RepresentativeDetailsVO> getRepresentativeDetails() {
		return representativeDetails;
	}

	public void setRepresentativeDetails(List<RepresentativeDetailsVO> representativeDetails) {
		this.representativeDetails = representativeDetails;
	}

	}
