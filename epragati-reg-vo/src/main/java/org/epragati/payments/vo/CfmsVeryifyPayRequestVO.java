package org.epragati.payments.vo;

public class CfmsVeryifyPayRequestVO {

	private String DEPTCODE;

	private CfmsVeryifyPayTransactionNoVO ROW;

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
	public CfmsVeryifyPayTransactionNoVO getROW() {
		return ROW;
	}

	/**
	 * @param rOW
	 *            the rOW to set
	 */
	public void setROW(CfmsVeryifyPayTransactionNoVO rOW) {
		ROW = rOW;
	}

}
