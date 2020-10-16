package org.epragati.uidailogin.vo;

import java.io.Serializable;
import java.time.LocalDateTime;


public class LoginStatusTypeVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean udaiLoginStatus;
	private LocalDateTime lupdateTime;
	private String description;

	
	public boolean isUdaiLoginStatus() {
		return udaiLoginStatus;
	}

	public void setUdaiLoginStatus(boolean udaiLoginStatus) {
		this.udaiLoginStatus = udaiLoginStatus;
	}

	public LocalDateTime getLupdateTime() {
		return lupdateTime;
	}

	public void setLupdateTime(LocalDateTime lupdateTime) {
		this.lupdateTime = lupdateTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
