package org.epragati.elastic.vo;

import java.util.List;

public class SecondVehicleResultsVO {
	private String actionBy;
	private boolean found;
	private String role;

	private List<SecondVehicleDataVO> secondVehicleData;

	/**
	 * @return the actionBy
	 */

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the secondVehicleData
	 */
	public List<SecondVehicleDataVO> getSecondVehicleData() {
		return secondVehicleData;
	}

	/**
	 * @param secondVehicleData
	 *            the secondVehicleData to set
	 */
	public void setSecondVehicleData(List<SecondVehicleDataVO> secondVehicleData) {
		this.secondVehicleData = secondVehicleData;
	}

	/**
	 * @return the actionBy
	 */
	public String getActionBy() {
		return actionBy;
	}

	/**
	 * @param actionBy
	 *            the actionBy to set
	 */
	public void setActionBy(String actionBy) {
		this.actionBy = actionBy;
	}

	/**
	 * @return the found
	 */
	public boolean isFound() {
		return found;
	}

	/**
	 * @param found
	 *            the found to set
	 */
	public void setFound(boolean found) {
		this.found = found;
	}

}
