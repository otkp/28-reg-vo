package org.epragati.regservice.vo;

import java.time.LocalDateTime;

import org.epragati.master.vo.OfficeVO;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class IssuingAuthorityDetailsVO {
	
	private OfficeVO officeDetails;
	
	private String userId;
	
	private String role;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDateTime approveDate;

	/**
	 * @return the officeDetails
	 */
	public OfficeVO getOfficeDetails() {
		return officeDetails;
	}

	/**
	 * @param officeDetails the officeDetails to set
	 */
	public void setOfficeDetails(OfficeVO officeDetails) {
		this.officeDetails = officeDetails;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the approveDate
	 */
	public LocalDateTime getApproveDate() {
		return approveDate;
	}

	/**
	 * @param approveDate the approveDate to set
	 */
	public void setApproveDate(LocalDateTime approveDate) {
		this.approveDate = approveDate;
	}

}
