package org.epragati.hsrp.vo;

import java.time.LocalDate;

public class AffixationVO {
	
	private LocalDate dateOfAffixation;

	private LocalDate plateAvailableDate;

	private String plateAvailable;

	private LocalDate plateAvailabtyUpdatedDt;

	private LocalDate affixUpdateDate;

	public LocalDate getDateOfAffixation() {
		return dateOfAffixation;
	}

	public void setDateOfAffixation(LocalDate dateOfAffixation) {
		this.dateOfAffixation = dateOfAffixation;
	}

	public LocalDate getPlateAvailableDate() {
		return plateAvailableDate;
	}

	public void setPlateAvailableDate(LocalDate plateAvailableDate) {
		this.plateAvailableDate = plateAvailableDate;
	}

	public String getPlateAvailable() {
		return plateAvailable;
	}

	public void setPlateAvailable(String plateAvailable) {
		this.plateAvailable = plateAvailable;
	}

	public LocalDate getPlateAvailabtyUpdatedDt() {
		return plateAvailabtyUpdatedDt;
	}

	public void setPlateAvailabtyUpdatedDt(LocalDate plateAvailabtyUpdatedDt) {
		this.plateAvailabtyUpdatedDt = plateAvailabtyUpdatedDt;
	}

	public LocalDate getAffixUpdateDate() {
		return affixUpdateDate;
	}

	public void setAffixUpdateDate(LocalDate affixUpdateDate) {
		this.affixUpdateDate = affixUpdateDate;
	}


}
