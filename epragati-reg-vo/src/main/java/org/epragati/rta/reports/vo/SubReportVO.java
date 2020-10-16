package org.epragati.rta.reports.vo;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class SubReportVO {

	private Double target=0.0;
	
	private Double collected=0.0;
	
	private Double variance=0.0;

	public Double getTarget() {
		return target;
	}

	public void setTarget(Double target) {
		this.target = target;
	}

	public Double getCollected() {
		return collected;
	}

	public void setCollected(Double collected) {
		this.collected = collected;
	}

	public Double getVariance() {
		return variance;
	}

	public void setVariance(Double variance) {
		this.variance = variance;
	}
	
}
