package org.epragati.sn.vo;

import javax.validation.constraints.NotNull;

public class BidIncrementalAmountInput {

	@NotNull(message = "Vehicle RC Id is required.")
	private String vehicleRcId;

	@NotNull(message = "Special number id is required.")
	private String specialNumberAppId;

	@NotNull(message = "Bid incremtal amount is required.")
	private Double incremntalAmount;

	public String getVehicleRcId() {
		return vehicleRcId;
	}

	public void setVehicleRcId(String vehicleRcId) {
		this.vehicleRcId = vehicleRcId;
	}

	public Double getIncremntalAmount() {
		return incremntalAmount;
	}

	public void setIncremntalAmount(Double incremntalAmount) {
		this.incremntalAmount = incremntalAmount;
	}

	public String getSpecialNumberAppId() {
		return specialNumberAppId;
	}

	public void setSpecialNumberAppId(String specialNumberAppId) {
		this.specialNumberAppId = specialNumberAppId;
	}

	

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BidIncrementalAmountInput [" + (vehicleRcId != null ? "vehicleRcId=" + vehicleRcId + ", " : "")
				+ (specialNumberAppId != null ? "specialNumberAppId=" + specialNumberAppId + ", " : "")
				+ (incremntalAmount != null ? "incremntalAmount=" + incremntalAmount : "") + "]";
	}

}
