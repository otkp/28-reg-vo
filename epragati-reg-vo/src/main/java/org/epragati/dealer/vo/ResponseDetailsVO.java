package org.epragati.dealer.vo;

public class ResponseDetailsVO {
	
	private boolean isRejectedByEnclosure;
	private boolean isInvalidVehicleRejection;
	private boolean isSecondVehicleRejected;
	
	public boolean isRejectedByEnclosure() {
		return isRejectedByEnclosure;
	}
	public void setRejectedByEnclosure(boolean isRejectedByEnclosure) {
		this.isRejectedByEnclosure = isRejectedByEnclosure;
	}
	public boolean isInvalidVehicleRejection() {
		return isInvalidVehicleRejection;
	}
	public void setInvalidVehicleRejection(boolean isInvalidVehicleRejection) {
		this.isInvalidVehicleRejection = isInvalidVehicleRejection;
	}
	public boolean isSecondVehicleRejected() {
		return isSecondVehicleRejected;
	}
	public void setSecondVehicleRejected(boolean isSecondVehicleRejected) {
		this.isSecondVehicleRejected = isSecondVehicleRejected;
	}



}
