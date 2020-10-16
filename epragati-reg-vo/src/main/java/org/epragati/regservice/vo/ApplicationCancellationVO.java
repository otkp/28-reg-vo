package org.epragati.regservice.vo;

import java.io.Serializable;

public class ApplicationCancellationVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CitizenApplicationSearchResponceVO vehicleDetails;

	private RegServiceVO applicationDetails;
	
	private String serviceType;

	/**
	 * @return the vehicleDetails
	 */
	public CitizenApplicationSearchResponceVO getVehicleDetails() {
		return vehicleDetails;
	}

	/**
	 * @param vehicleDetails the vehicleDetails to set
	 */
	public void setVehicleDetails(CitizenApplicationSearchResponceVO vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	/**
	 * @return the applicationDetails
	 */
	public RegServiceVO getApplicationDetails() {
		return applicationDetails;
	}

	/**
	 * @param applicationDetails the applicationDetails to set
	 */
	public void setApplicationDetails(RegServiceVO applicationDetails) {
		this.applicationDetails = applicationDetails;
	}

	/**
	 * @return the serviceType
	 */
	public String getServiceType() {
		return serviceType;
	}

	/**
	 * @param serviceType the serviceType to set
	 */
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
}
