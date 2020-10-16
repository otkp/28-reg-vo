package org.epragati.fa.vo;

import java.time.LocalDate;

import org.epragati.master.vo.InsuranceDetailsVO;

public class VehicleDetailsVO {
	
private String vehicleNo;

private String classOfVehicle;

private LocalDate TaxValidityEnd;

private LocalDate fcValidityEnd;

private LocalDate permitValidityEnd;

private InsuranceDetailsVO insuranceDetails;

private LocalDate pollutionValidityEnd;

private String officeCode;


public String getVehicleNo() {
	return vehicleNo;
}

public void setVehicleNo(String vehicleNo) {
	this.vehicleNo = vehicleNo;
}

public String getClassOfVehicle() {
	return classOfVehicle;
}

public void setClassOfVehicle(String classOfVehicle) {
	this.classOfVehicle = classOfVehicle;
}

public LocalDate getTaxValidityEnd() {
	return TaxValidityEnd;
}

public void setTaxValidityEnd(LocalDate taxValidityEnd) {
	TaxValidityEnd = taxValidityEnd;
}

public LocalDate getFcValidityEnd() {
	return fcValidityEnd;
}

public void setFcValidityEnd(LocalDate fcValidityEnd) {
	this.fcValidityEnd = fcValidityEnd;
}

public LocalDate getPermitValidityEnd() {
	return permitValidityEnd;
}

public void setPermitValidityEnd(LocalDate permitValidityEnd) {
	this.permitValidityEnd = permitValidityEnd;
}

public InsuranceDetailsVO getInsuranceDetails() {
	return insuranceDetails;
}

public void setInsuranceDetails(InsuranceDetailsVO insuranceDetails) {
	this.insuranceDetails = insuranceDetails;
}

public LocalDate getPollutionValidityEnd() {
	return pollutionValidityEnd;
}

public void setPollutionValidityEnd(LocalDate pollutionValidityEnd) {
	this.pollutionValidityEnd = pollutionValidityEnd;
}

public String getOfficeCode() {
	return officeCode;
}

public void setOfficeCode(String officeCode) {
	this.officeCode = officeCode;
}


}
