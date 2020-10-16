package org.epragati.vcr.vo;

import java.util.List;

import org.epragati.master.vo.DistrictVO;

public class AadharSeedingDistWiseVO {
	private  DistrictVO districtVO;
    private String districtName;
	private String autoApproved;
	private String manualApproved;
	private int autoApprovedCount;
	private int manualApprovedCount;
	private String autoRejected;
	private String manualRejected;
    private int autoRejectedCount;
	private int manualRejectedCount;
	private List<AadharSeedingOfficeWiseVO> districtOfficeDetils;
	public DistrictVO getDistrictVO() {
		return districtVO;
	}
	public void setDistrictVO(DistrictVO districtVO) {
		this.districtVO = districtVO;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
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
	public List<AadharSeedingOfficeWiseVO> getDistrictOfficeDetils() {
		return districtOfficeDetils;
	}
	public void setDistrictOfficeDetils(List<AadharSeedingOfficeWiseVO> districtOfficeDetils) {
		this.districtOfficeDetils = districtOfficeDetils;
	}

}
