package org.epragati.service.enclosure.vo;

import java.time.LocalDate;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EnclosureModel {
	@NotEmpty(message = "Is Physically Disabled or not is required.")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dob;

	@NotEmpty(message = "Is Physically Disabled or not is required.")
	private boolean isPhysicallyDisabled;
	
	@NotEmpty(message = "Is Address same as Aadhar or not is required.")
	private boolean isAddressSameAsAadhar;

	/**
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	/**
	 * @return the isPhysicallyDisabled
	 */
	public boolean isPhysicallyDisabled() {
		return isPhysicallyDisabled;
	}

	/**
	 * @param isPhysicallyDisabled the isPhysicallyDisabled to set
	 */
	public void setPhysicallyDisabled(boolean isPhysicallyDisabled) {
		this.isPhysicallyDisabled = isPhysicallyDisabled;
	}

	/**
	 * @return the isAddressSameAsAadhar
	 */
	public boolean isAddressSameAsAadhar() {
		return isAddressSameAsAadhar;
	}

	/**
	 * @param isAddressSameAsAadhar the isAddressSameAsAadhar to set
	 */
	public void setAddressSameAsAadhar(boolean isAddressSameAsAadhar) {
		this.isAddressSameAsAadhar = isAddressSameAsAadhar;
	}
	
}
