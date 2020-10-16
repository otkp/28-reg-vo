package org.epragati.hsrp.vo;

import java.time.LocalDate;

public class EmbossVO {
	private String frontLaserCode;

	private String rearLaserCode;

	private String registrationPlate;

	private LocalDate dateOfEmbossing;

	private LocalDate embbosUpdateDate;

	public String getFrontLaserCode() {
		return frontLaserCode;
	}

	public void setFrontLaserCode(String frontLaserCode) {
		this.frontLaserCode = frontLaserCode;
	}

	public String getRearLaserCode() {
		return rearLaserCode;
	}

	public void setRearLaserCode(String rearLaserCode) {
		this.rearLaserCode = rearLaserCode;
	}

	public String getRegistrationPlate() {
		return registrationPlate;
	}

	public void setRegistrationPlate(String registrationPlate) {
		this.registrationPlate = registrationPlate;
	}

	public LocalDate getDateOfEmbossing() {
		return dateOfEmbossing;
	}

	public void setDateOfEmbossing(LocalDate dateOfEmbossing) {
		this.dateOfEmbossing = dateOfEmbossing;
	}

	public LocalDate getEmbbosUpdateDate() {
		return embbosUpdateDate;
	}

	public void setEmbbosUpdateDate(LocalDate embbosUpdateDate) {
		this.embbosUpdateDate = embbosUpdateDate;
	}

}
