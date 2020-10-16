package org.epragati.regservice.vo;

import java.io.Serializable;

import org.epragati.master.vo.FinanceDetailsVO;
import org.epragati.master.vo.RegistrationDetailsVO;

public class OtherStateRegVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1540885143741077567L;

	private RegistrationDetailsVO registrationDetails;
	
	private NOCDetailsVO nOCDetails;
	
	private String prNo;
	
	private boolean getOtherStateDataFromVahanService;

	

	/**
	 * @return the getOtherStateDataFromVahanService
	 */
	public boolean isGetOtherStateDataFromVahanService() {
		return getOtherStateDataFromVahanService;
	}

	/**
	 * @param getOtherStateDataFromVahanService the getOtherStateDataFromVahanService to set
	 */
	public void setGetOtherStateDataFromVahanService(boolean getOtherStateDataFromVahanService) {
		this.getOtherStateDataFromVahanService = getOtherStateDataFromVahanService;
	}
	
	
	private PUCDetailsVO pucDetails;

	/**
	 * @return the registrationDetails
	 */
	public RegistrationDetailsVO getRegistrationDetails() {
		return registrationDetails;
	}

	/**
	 * @param registrationDetails the registrationDetails to set
	 */
	public void setRegistrationDetails(RegistrationDetailsVO registrationDetails) {
		this.registrationDetails = registrationDetails;
	}

	/**
	 * @return the nOCDetails
	 */
	public NOCDetailsVO getnOCDetails() {
		return nOCDetails;
	}

	/**
	 * @param nOCDetails the nOCDetails to set
	 */
	public void setnOCDetails(NOCDetailsVO nOCDetails) {
		this.nOCDetails = nOCDetails;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	

	/**
	 * @return the pucDetails
	 */
	public PUCDetailsVO getPucDetails() {
		return pucDetails;
	}

	/**
	 * @param pucDetails the pucDetails to set
	 */
	public void setPucDetails(PUCDetailsVO pucDetails) {
		this.pucDetails = pucDetails;
	}
	
	
	
}
