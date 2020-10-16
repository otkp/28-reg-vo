package org.epragati.master.vo;

import java.time.LocalDateTime;

public class PanUserDetailsVO {

	private Integer status;
	private String panNumber;
	private String isValid;
	private String firstName;
	private String lastName;
	private String middleName;
	private String salutation;
	private LocalDateTime panUpdatedDateAtITDEnd;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getIsValid() {
		return isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public LocalDateTime getPanUpdatedDateAtITDEnd() {
		return panUpdatedDateAtITDEnd;
	}

	public void setPanUpdatedDateAtITDEnd(LocalDateTime panUpdatedDateAtITDEnd) {
		this.panUpdatedDateAtITDEnd = panUpdatedDateAtITDEnd;
	}

}
