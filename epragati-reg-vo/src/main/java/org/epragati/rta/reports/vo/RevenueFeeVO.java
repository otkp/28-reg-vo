package org.epragati.rta.reports.vo;

public class RevenueFeeVO {

	private double fee;

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public double getTarget() {
		return target;
	}

	public void setTarget(double target) {
		this.target = target;
	}

	public double getAchieved() {
		return achieved;
	}

	public void setAchieved(double achieved) {
		this.achieved = achieved;
	}

	private double target;

	private double achieved;

}
