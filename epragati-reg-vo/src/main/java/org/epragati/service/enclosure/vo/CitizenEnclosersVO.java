package org.epragati.service.enclosure.vo;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CitizenEnclosersVO {

	private String sno;
	private String applno;
	private String enclname;
    private List<EnclosureRejectedVO> rejectedEnclosures;
	
	private List<EnclosureRejectedVO> approvedEclosures;
	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getApplno() {
		return applno;
	}

	public void setApplno(String applno) {
		this.applno = applno;
	}

	public String getEnclname() {
		return enclname;
	}

	public void setEnclname(String enclname) {
		this.enclname = enclname;
	}
    public List<EnclosureRejectedVO> getRejectedEnclosures() {
		return rejectedEnclosures;
	}

	public void setRejectedEnclosures(List<EnclosureRejectedVO> rejectedEnclosures) {
		this.rejectedEnclosures = rejectedEnclosures;
	}

	public List<EnclosureRejectedVO> getApprovedEclosures() {
		return approvedEclosures;
	}

	public void setApprovedEclosures(List<EnclosureRejectedVO> approvedEclosures) {
		this.approvedEclosures = approvedEclosures;
	}
}
