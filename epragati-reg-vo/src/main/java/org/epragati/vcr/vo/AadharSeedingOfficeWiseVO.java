package org.epragati.vcr.vo;

import org.epragati.master.vo.OfficeVO;

public class AadharSeedingOfficeWiseVO {
	private  OfficeVO officeVO;
	private String officeName;
	private String autoApproved;
	private String manualApproved;
	private int autoApprovedCount;
	private int manualApprovedCount;
	private String autoRejected;
	private String manualRejected;
    private int autoRejectedCount;
	private int manualRejectedCount;
	public OfficeVO getOfficeVO() {
		return officeVO;
	}
	public void setOfficeVO(OfficeVO officeVO) {
		this.officeVO = officeVO;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public String getAutoApproved() {
		return autoApproved;
	}
	public void setAutoApproved(String autoApproved) {
		this.autoApproved = autoApproved;
	}
	public String getManualApproved() {
		return manualApproved;
	}
	public void setManualApproved(String manualApproved) {
		this.manualApproved = manualApproved;
	}
	public int getAutoApprovedCount() {
		return autoApprovedCount;
	}
	public void setAutoApprovedCount(int autoApprovedCount) {
		this.autoApprovedCount = autoApprovedCount;
	}
	public int getManualApprovedCount() {
		return manualApprovedCount;
	}
	public void setManualApprovedCount(int manualApprovedCount) {
		this.manualApprovedCount = manualApprovedCount;
	}
	public String getAutoRejected() {
		return autoRejected;
	}
	public void setAutoRejected(String autoRejected) {
		this.autoRejected = autoRejected;
	}
	public String getManualRejected() {
		return manualRejected;
	}
	public void setManualRejected(String manualRejected) {
		this.manualRejected = manualRejected;
	}
	public int getAutoRejectedCount() {
		return autoRejectedCount;
	}
	public void setAutoRejectedCount(int autoRejectedCount) {
		this.autoRejectedCount = autoRejectedCount;
	}
	public int getManualRejectedCount() {
		return manualRejectedCount;
	}
	public void setManualRejectedCount(int manualRejectedCount) {
		this.manualRejectedCount = manualRejectedCount;
	}
}
