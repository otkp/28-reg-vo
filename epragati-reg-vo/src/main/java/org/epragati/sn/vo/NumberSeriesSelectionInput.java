package org.epragati.sn.vo;

import javax.validation.constraints.NotNull;

public class NumberSeriesSelectionInput {

	@NotNull(message = "TR number is required.")
	private String trNumber;

	@NotNull(message = "Bid number id is required.")
	private String bidNumberId;

	@NotNull(message = "Number series is required.")
	private String numberSeries;

	@NotNull(message = "Mobile number is required.")
	private String mobileNo;

	private boolean isPrNo;
	
	private String applicationNo;
	
	public String getTrNumber() {
		return trNumber;
	}

	public void setTrNumber(String trNumber) {
		this.trNumber = trNumber;
	}

	public String getBidNumberId() {
		return bidNumberId;
	}

	public void setBidNumberId(String bidNumberId) {
		this.bidNumberId = bidNumberId;
	}

	public String getNumberSeries() {
		return numberSeries;
	}

	public void setNumberSeries(String numberSeries) {
		this.numberSeries = numberSeries;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * @return the isPrNo
	 */
	public boolean isPrNo() {
		return isPrNo;
	}

	/**
	 * @param isPrNo the isPrNo to set
	 */
	public void setPrNo(boolean isPrNo) {
		this.isPrNo = isPrNo;
	}
	public void setIsPrNo(boolean isPrNo) {
		this.isPrNo = isPrNo;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bidNumberId == null) ? 0 : bidNumberId.hashCode());
		result = prime * result + (isPrNo ? 1231 : 1237);
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
		result = prime * result + ((numberSeries == null) ? 0 : numberSeries.hashCode());
		result = prime * result + ((trNumber == null) ? 0 : trNumber.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		
		NumberSeriesSelectionInput other = (NumberSeriesSelectionInput) obj;
	
		if (trNumber == null) {
			if (other.trNumber != null)
				return false;
		} else if (!trNumber.equals(other.trNumber))
			return false;
		return true;
	}

	
}
