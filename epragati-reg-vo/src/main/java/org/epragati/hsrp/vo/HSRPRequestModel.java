package org.epragati.hsrp.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement
@JsonInclude(Include.NON_NULL)
public class HSRPRequestModel {
	private String SecurityKey;
	private List<DataVO> Data;
	private String prNumber;
	private String regDate;
	private String authorizationRefNo;

	@JsonProperty(value = "SecurityKey")
	public String getSecurityKey() {
		return SecurityKey;
	}

	public void setSecurityKey(String securityKey) {
		SecurityKey = securityKey;
	}

	public String getPrNumber() {
		return prNumber;
	}

	public void setPrNumber(String prNumber) {
		this.prNumber = prNumber;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getAuthorizationRefNo() {
		return authorizationRefNo;
	}

	public void setAuthorizationRefNo(String authorizationRefNo) {
		this.authorizationRefNo = authorizationRefNo;
	}

	@JsonProperty(value = "Data")
	public List<DataVO> getData() {
		return Data;
	}

	public void setData(List<DataVO> data) {
		Data = data;
	}

}