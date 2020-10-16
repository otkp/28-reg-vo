package org.epragati.master.vo;

import org.epragati.common.vo.BaseVO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
/**
 * @author saroj.sahoo
 *
 */
@JsonInclude(Include.NON_NULL)
public class StateVO extends BaseVO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String countryId;
	
	private String stateId;
	
	private String stateName;
	
	private String stateStatus;

	//For Dl Details
	private String id;
	private String name;
	/**
	 * @return the countryId
	 */
	public String getCountryId() {
		return countryId;
	}

	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	/**
	 * @return the stateId
	 */
	public String getStateId() {
		return stateId;
	}

	/**
	 * @param stateId the stateId to set
	 */
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	/**
	 * @return the stateStatus
	 */
	public String getStateStatus() {
		return stateStatus;
	}

	/**
	 * @param stateStatus the stateStatus to set
	 */
	public void setStateStatus(String stateStatus) {
		this.stateStatus = stateStatus;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
