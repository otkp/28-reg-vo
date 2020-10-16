package org.epragati.vcr.vo;

import java.util.List;

public class FreezeVehiclsVO {

	private String userId;
	private List<String> prNo;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<String> getPrNo() {
		return prNo;
	}
	public void setPrNo(List<String> prNo) {
		this.prNo = prNo;
	}
}
