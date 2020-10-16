package org.epragati.rta.vo;

import java.io.Serializable;

public class DashBordDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PendingCountVo pendingCountVo;

	/**
	 * @return the pendingCountVo
	 */
	public PendingCountVo getPendingCountVo() {
		return pendingCountVo;
	}

	/**
	 * @param pendingCountVo the pendingCountVo to set
	 */
	public void setPendingCountVo(PendingCountVo pendingCountVo) {
		this.pendingCountVo = pendingCountVo;
	}
	
	

}
