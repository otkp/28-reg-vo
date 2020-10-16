package org.epragati.sn.vo;

import javax.validation.constraints.NotNull;

public class BindFinalAmountInput {

	@NotNull(message = "Vehicle RC Id is required.")
	private String vehicleRcId;

	@NotNull(message = "Special number id is required.")
	private String specialNumberAppId;
	
	private boolean isProductionIssues;

	public String getVehicleRcId() {
		return vehicleRcId;
	}

	public void setVehicleRcId(String vehicleRcId) {
		this.vehicleRcId = vehicleRcId;
	}

	public String getSpecialNumberAppId() {
		return specialNumberAppId;
	}

	public void setSpecialNumberAppId(String specialNumberAppId) {
		this.specialNumberAppId = specialNumberAppId;
	}

	
	public boolean getIsProductionIssues() {
		return isProductionIssues;
	}

	public void setIsProductionIssues(boolean isProductionIssues) {
		this.isProductionIssues = isProductionIssues;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BindFinalAmountInput [" + (vehicleRcId != null ? "vehicleRcId=" + vehicleRcId + ", " : "")
				+ (specialNumberAppId != null ? "specialNumberAppId=" + specialNumberAppId : "") + "]";
	}

}
