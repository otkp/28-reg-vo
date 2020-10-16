package org.epragati.common.location.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrajasachivalayamResponseVO  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty(value="USERNAME")
	private String userName;
    
    @JsonProperty(value="PASSWORD")
	private String password;
    
    @JsonProperty(value="PS_TXN_ID")
	private String txn_id;
    
    @JsonProperty(value="RETURN_URL")
	private String returnUrl;
   private Integer status;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getReturnUrl() {
		return returnUrl;
	}
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}
	public String getTxn_id() {
		return txn_id;
	}
	public void setTxn_id(String txn_id) {
		this.txn_id = txn_id;
	}
}
