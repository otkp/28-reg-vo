package org.epragati.breg.vo;

import org.springframework.stereotype.Component;

@Component
public class BregisterFinaceVo {

	private String ffromDate;
	private String ftoDate;
	private String faddress;
	private String fcity;
	private String fname;
	
	public String getFfromDate() {
		return ffromDate;
	}
	public void setFfromDate(String ffromDate) {
		this.ffromDate = ffromDate;
	}
	public String getFtoDate() {
		return ftoDate;
	}
	public void setFtoDate(String ftoDate) {
		this.ftoDate = ftoDate;
	}
	public String getFaddress() {
		return faddress;
	}
	public void setFaddress(String faddress) {
		this.faddress = faddress;
	}
	public String getFcity() {
		return fcity;
	}
	public void setFcity(String fcity) {
		this.fcity = fcity;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
}
