package org.epragati.rta.reports.vo;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CitizenEnclosuresVOList {
private List<CitizenEnclosuresVO> citizenEnclosuresVOList;
	/*
	 * @JsonFormat(pattern = "dd-MM-yyyy") private LocalDate aadharApprovedDate;
	 */
private Boolean adharSeddingStatus=Boolean.FALSE;

public List<CitizenEnclosuresVO> getCitizenEnclosuresVOList() {
	return citizenEnclosuresVOList;
}
public void setCitizenEnclosuresVOList(List<CitizenEnclosuresVO> citizenEnclosuresVOList) {
	this.citizenEnclosuresVOList = citizenEnclosuresVOList;
}

	/*
	 * public LocalDate getAadharApprovedDate() { return aadharApprovedDate; }
	 * public void setAadharApprovedDate(LocalDate aadharApprovedDate) {
	 * this.aadharApprovedDate = aadharApprovedDate; }
	 */
public Boolean getAdharSeddingStatus() {
	return adharSeddingStatus;
}
public void setAdharSeddingStatus(Boolean adharSeddingStatus) {
	this.adharSeddingStatus = adharSeddingStatus;
}



}
