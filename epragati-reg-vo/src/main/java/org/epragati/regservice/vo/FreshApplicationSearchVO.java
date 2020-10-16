package org.epragati.regservice.vo;

import org.epragati.util.StatusRegistration;

/**
 * @author ganga.pillala
 *
 */
public class FreshApplicationSearchVO {

	private StatusRegistration applicationStatus;
	private String applicationNumber;
	private boolean isFinancierTerminated;
	private String trNo;
	private String prNo;
	private boolean fRcFrom37;

	public StatusRegistration getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(StatusRegistration applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public String getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public boolean isFinancierTerminated() {
		return isFinancierTerminated;
	}

	public void setFinancierTerminated(boolean isFinancierTerminated) {
		this.isFinancierTerminated = isFinancierTerminated;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public boolean isfRcFrom37() {
		return fRcFrom37;
	}

	public void setfRcFrom37(boolean fRcFrom37) {
		this.fRcFrom37 = fRcFrom37;
	}
	
}
