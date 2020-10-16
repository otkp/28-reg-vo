package org.epragati.payments.vo;

import java.util.List;

public class CfmsEodReportRowVO {

	private String DEPTCODE;

	private List<CfmsVeryifyPayTransactionNoVO> ROW;

	/**
	 * @return the dEPTCODE
	 */
	public String getDEPTCODE() {
		return DEPTCODE;
	}

	/**
	 * @param dEPTCODE
	 *            the dEPTCODE to set
	 */
	public void setDEPTCODE(String dEPTCODE) {
		DEPTCODE = dEPTCODE;
	}

	/**
	 * @return the rOW
	 */
	public List<CfmsVeryifyPayTransactionNoVO> getROW() {
		return ROW;
	}

	/**
	 * @param rOW
	 *            the rOW to set
	 */
	public void setROW(List<CfmsVeryifyPayTransactionNoVO> rOW) {
		ROW = rOW;
	}

}
