package org.epragati.payments.vo;

import java.util.List;

public class CfmsVeryifyPayTransactionNoVO {

	private String DEPTTID;

	private Long CFMSID;

	private String TAMT;

	private String BNKRF;

	private Integer BNKDT;

	private String STATUS;

	private List<CFMSChallanResponceVO> CHALLAN;
	
	private List<CFMSOtherResponceVO> OTHERS;
	
	private String DEPTCODE;

	/**
	 * @return the dEPTTID
	 */
	public String getDEPTTID() {
		return DEPTTID;
	}

	/**
	 * @param dEPTTID
	 *            the dEPTTID to set
	 */
	public void setDEPTTID(String dEPTTID) {
		DEPTTID = dEPTTID;
	}


	/**
	 * @return the cFMSID
	 */
	public Long getCFMSID() {
		return CFMSID;
	}

	/**
	 * @param cFMSID the cFMSID to set
	 */
	public void setCFMSID(Long cFMSID) {
		CFMSID = cFMSID;
	}

	/**
	 * @return the tAMT
	 */
	public String getTAMT() {
		return TAMT;
	}

	/**
	 * @param tAMT
	 *            the tAMT to set
	 */
	public void setTAMT(String tAMT) {
		TAMT = tAMT;
	}

	/**
	 * @return the bNKRF
	 */
	public String getBNKRF() {
		return BNKRF;
	}

	/**
	 * @param bNKRF
	 *            the bNKRF to set
	 */
	public void setBNKRF(String bNKRF) {
		BNKRF = bNKRF;
	}

	/**
	 * @return the bNKDT
	 */
	public Integer getBNKDT() {
		return BNKDT;
	}

	/**
	 * @param bNKDT
	 *            the bNKDT to set
	 */
	public void setBNKDT(Integer bNKDT) {
		BNKDT = bNKDT;
	}

	/**
	 * @return the sTATUS
	 */
	public String getSTATUS() {
		return STATUS;
	}

	/**
	 * @param sTATUS
	 *            the sTATUS to set
	 */
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	/**
	 * @return the cHALLAN
	 */
	public List<CFMSChallanResponceVO> getCHALLAN() {
		return CHALLAN;
	}

	/**
	 * @param cHALLAN
	 *            the cHALLAN to set
	 */
	public void setCHALLAN(List<CFMSChallanResponceVO> cHALLAN) {
		CHALLAN = cHALLAN;
	}

	/**
	 * @return the oTHERS
	 */
	public List<CFMSOtherResponceVO> getOTHERS() {
		return OTHERS;
	}

	/**
	 * @param oTHERS the oTHERS to set
	 */
	public void setOTHERS(List<CFMSOtherResponceVO> oTHERS) {
		OTHERS = oTHERS;
	}

	/**
	 * @return the dEPTCODE
	 */
	public String getDEPTCODE() {
		return DEPTCODE;
	}

	/**
	 * @param dEPTCODE the dEPTCODE to set
	 */
	public void setDEPTCODE(String dEPTCODE) {
		DEPTCODE = dEPTCODE;
	}

	
}
