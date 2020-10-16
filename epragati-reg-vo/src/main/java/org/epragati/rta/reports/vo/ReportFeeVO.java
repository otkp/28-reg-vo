package org.epragati.rta.reports.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@JsonInclude(Include.NON_NULL)
public class ReportFeeVO {
	
	private Double registration;
	
	private Double license;
	
	private Double fitness;
	
	private Double permit;
	
	private Double other;
	
	private Double greenTax;
	
	private Double total;

	public Double getRegistration() {
		return registration;
	}

	public void setRegistration(Double registration) {
		this.registration = registration;
	}

	public Double getLicense() {
		return license;
	}

	public void setLicense(Double license) {
		this.license = license;
	}

	public Double getFitness() {
		return fitness;
	}

	public void setFitness(Double fitness) {
		this.fitness = fitness;
	}

	public Double getPermit() {
		return permit;
	}

	public void setPermit(Double permit) {
		this.permit = permit;
	}

	public Double getOther() {
		return other;
	}

	public void setOther(Double other) {
		this.other = other;
	}

	public Double getGreenTax() {
		return greenTax;
	}

	public void setGreenTax(Double greenTax) {
		this.greenTax = greenTax;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	

}
