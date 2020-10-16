package org.epragati.common.vo;

import java.util.List;
import java.util.Map;

public class PropertiesVO {

	private Map<String, String> propertyDetails;

	private Boolean status;

	private List<String> fuelType;
	
	private List<String> addressDropdown;
	
    private String declarationStart;
	
	private List<DeclarationsVO> declartionDetails;
	
	private String declarationEnd;
	
	private List<CorrectionDropDown> collectionType;

	public String getDeclarationStart() {
		return declarationStart;
	}

	public void setDeclarationStart(String declarationStart) {
		this.declarationStart = declarationStart;
	}

	public List<DeclarationsVO> getDeclartionDetails() {
		return declartionDetails;
	}

	public void setDeclartionDetails(List<DeclarationsVO> declartionDetails) {
		this.declartionDetails = declartionDetails;
	}

	public String getDeclarationEnd() {
		return declarationEnd;
	}

	public void setDeclarationEnd(String declarationEnd) {
		this.declarationEnd = declarationEnd;
	}

	public List<CorrectionDropDown> getCollectionType() {
		return collectionType;
	}

	public void setCollectionType(List<CorrectionDropDown> collectionType) {
		this.collectionType = collectionType;
	}


	public List<String> getAddressDropdown() {
		return addressDropdown;
	}

	public void setAddressDropdown(List<String> addressDropdown) {
		this.addressDropdown = addressDropdown;
	}


	public List<String> getFuelType() {
		return fuelType;
	}

	public void setFuelType(List<String> fuelType) {
		this.fuelType = fuelType;
	}
	/**
	 * @return the propertyDetails
	 */
	public Map<String, String> getPropertyDetails() {
		return propertyDetails;
	}

	/**
	 * @param propertyDetails the propertyDetails to set
	 */
	public void setPropertyDetails(Map<String, String> propertyDetails) {
		this.propertyDetails = propertyDetails;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

}
