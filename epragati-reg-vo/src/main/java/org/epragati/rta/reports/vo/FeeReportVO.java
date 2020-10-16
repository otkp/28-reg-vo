package org.epragati.rta.reports.vo;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class FeeReportVO {

	private Double quarterlyTax = 0.0;

	private Double lifeTax = 0.0;

	private Double fee = 0.0;

	private Double serviceFee = 0.0;

	private Double compundingFee = 0.0;
	
	
	
//To display individual amounts
	private Double fitnessFee=0.0;

	private Double registrationFee=0.0;

	private Double regServiceFee=0.0;

	private Double regFitnessServieceFee=0.0;

	private Double regPostalFee=0.0;
	
	

	public Double getFitnessFee() {
		return fitnessFee;
	}
	public void setFitnessFee(Double fitnessFee) {
		this.fitnessFee = fitnessFee;
	}
	public Double getRegistrationFee() {
		return registrationFee;
	}
	public void setRegistrationFee(Double registrationFee) {
		this.registrationFee = registrationFee;
	}
	public Double getRegServiceFee() {
		return regServiceFee;
	}
	public void setRegServiceFee(Double regServiceFee) {
		this.regServiceFee = regServiceFee;
	}
	public Double getRegFitnessServieceFee() {
		return regFitnessServieceFee;
	}
	public void setRegFitnessServieceFee(Double regFitnessServieceFee) {
		this.regFitnessServieceFee = regFitnessServieceFee;
	}
	public Double getRegPostalFee() {
		return regPostalFee;
	}
	public void setRegPostalFee(Double regPostalFee) {
		this.regPostalFee = regPostalFee;
	}
	public Double getQuarterlyTax() {
		return quarterlyTax;
	}
	public void setQuarterlyTax(Double quarterlyTax) {
		this.quarterlyTax = quarterlyTax;
	}
	public Double getLifeTax() {
		return lifeTax;
	}
	public void setLifeTax(Double lifeTax) {
		this.lifeTax = lifeTax;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	public Double getServiceFee() {
		return serviceFee;
	}
	public void setServiceFee(Double serviceFee) {
		this.serviceFee = serviceFee;
	}
	public Double getCompundingFee() {
		return compundingFee;
	}
	public void setCompundingFee(Double compundingFee) {
		this.compundingFee = compundingFee;
	}

}
