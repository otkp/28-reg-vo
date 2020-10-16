package org.epragati.rta.vo;

import java.util.List;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class RegistrationCardPrintedVO {
	
	private List<String> prNo;
	
	private String remarks;
	
	private List<SmartCardPrintedVO> smartCardPrNos;

	public List<String> getPrNo() {
		return prNo;
	}

	public void setPrNo(List<String> prNo) {
		this.prNo = prNo;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public List<SmartCardPrintedVO> getSmartCardPrNos() {
		return smartCardPrNos;
	}

	public void setSmartCardPrNos(List<SmartCardPrintedVO> smartCardPrNos) {
		this.smartCardPrNos = smartCardPrNos;
	}
	
}
